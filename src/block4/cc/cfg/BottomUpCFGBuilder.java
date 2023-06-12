package block4.cc.cfg;

import java.io.File;
import java.io.IOException;
import java.util.List;

import block4.cc.ErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Template bottom-up CFG builder.
 */
public class BottomUpCFGBuilder extends FragmentBaseListener {
    /**
     * The CFG being built.
     */
    private Graph graph;

    private final ParseTreeProperty<Node> entries = new ParseTreeProperty<>();
    private final ParseTreeProperty<Node> exists = new ParseTreeProperty<>();

    /**
     * Builds the CFG for a program contained in a given file.
     */
    public Graph build(File file) {
        Graph result = null;
        ErrorListener listener = new ErrorListener();
        try {
            CharStream chars = CharStreams.fromPath(file.toPath());
            Lexer lexer = new FragmentLexer(chars);
            lexer.removeErrorListeners();
            lexer.addErrorListener(listener);
            TokenStream tokens = new CommonTokenStream(lexer);
            FragmentParser parser = new FragmentParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(listener);
            ParseTree tree = parser.program();
            if (listener.hasErrors()) {
                System.out.printf("Parse errors in %s:%n", file.getPath());
                for (String error : listener.getErrors()) {
                    System.err.println(error);
                }
            } else {
                result = build(tree);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Builds the CFG for a program given as an ANTLR parse tree.
     */
    public Graph build(ParseTree tree) {
        graph = new Graph();
        new ParseTreeWalker().walk(this, tree);
        return graph;
    }

    @Override
    public void exitProgram(FragmentParser.ProgramContext ctx) {
        chainStats(ctx.stat());
    }

    @Override
    public void exitDecl(FragmentParser.DeclContext ctx) {
        Node declBlock = addNode(ctx, "decl");
        setEdges(ctx, declBlock, declBlock);
    }

    @Override
    public void exitAssignStat(FragmentParser.AssignStatContext ctx) {
        Node assignBlock = addNode(ctx, "assign");
        setEdges(ctx, assignBlock, assignBlock);
    }

    @Override
    public void exitWhileStat(FragmentParser.WhileStatContext ctx) {
        Node whileBlock = addNode(ctx, "while");
        whileBlock.addEdge(entries.get(ctx.stat()));
        exists.get(ctx.stat()).addEdge(whileBlock);
        setEdges(ctx, whileBlock, whileBlock);
    }

    @Override
    public void exitIfStat(FragmentParser.IfStatContext ctx) {
        Node ifBlock = addNode(ctx, "if");
        Node fakeBlock = graph.addNode("after");

        // if statement
        var ifStat = ctx.stat().get(0);
        ifBlock.addEdge(entries.get(ifStat));
        exists.get(ifStat).addEdge(fakeBlock);

        // else statement
        if (ctx.stat().size() > 1) {
            var elseStat = ctx.stat().get(1);
            ifBlock.addEdge(entries.get(elseStat));
            exists.get(elseStat).addEdge(fakeBlock);
        } else {
            ifBlock.addEdge(fakeBlock);
        }
        setEdges(ctx, ifBlock, fakeBlock);
    }

    @Override
    public void exitBlockStat(FragmentParser.BlockStatContext ctx) {
        List<FragmentParser.StatContext> stats = ctx.stat();
        Node entry = entries.get(stats.get(0));
        Node exit = exists.get(stats.get(stats.size() - 1));
        setEdges(ctx, entry, exit);
        chainStats(stats);
    }

    @Override
    public void exitPrintStat(FragmentParser.PrintStatContext ctx) {
        Node printBlock = addNode(ctx, "print");
        setEdges(ctx, printBlock, printBlock);
    }

    @Override
    public void exitBreakStat(FragmentParser.BreakStatContext ctx) {
        throw new IllegalArgumentException("Break not supported");
    }

    @Override
    public void exitContStat(FragmentParser.ContStatContext ctx) {
        throw new IllegalArgumentException("Continue not supported");
    }

    private void chainStats(List<FragmentParser.StatContext> stats) {
        for (int i = 0; i < stats.size() - 1; i++) {
            Node node1 = exists.get(stats.get(i));
            Node node2 = entries.get(stats.get(i + 1));
            node1.addEdge(node2);
        }
    }

    private void setEdges(ParseTree tree, Node entry, Node exit) {
        entries.put(tree, entry);
        exists.put(tree, exit);
    }

    /**
     * Adds a node to the CGF, based on a given parse tree node.
     * Gives the CFG node a meaningful ID, consisting of line number and
     * a further indicator.
     */
    private Node addNode(ParserRuleContext node, String text) {
        return this.graph.addNode(node.getStart().getLine() + ": " + text);
    }

    /**
     * Main method to build and print the CFG of a simple Java program.
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: [filename]+");
            return;
        }
        BottomUpCFGBuilder builder = new BottomUpCFGBuilder();
        for (String filename : args) {
            File file = new File(filename);
            System.out.println(filename);
            System.out.println(builder.build(file));
        }
    }
}
