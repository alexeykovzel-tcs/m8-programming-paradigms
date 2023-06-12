package block4.cc.cfg;

import java.io.File;
import java.io.IOException;

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

/** Template top-down CFG builder. */
public class TopDownCFGBuilder extends FragmentBaseListener {
	/** The CFG being built. */
	private Graph graph;

    private final ParseTreeProperty<Node> lastBlocks = new ParseTreeProperty<>();
    private final ParseTreeProperty<Node> entryBlocks = new ParseTreeProperty<>();

	/** Builds the CFG for a program contained in a given file. */
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
			FragmentParser.ProgramContext tree = parser.program();
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

	/** Builds the CFG for a program given as an ANTLR parse tree. */
	public Graph build(FragmentParser.ProgramContext tree) {
		graph = new Graph();
        new ParseTreeWalker().walk(this, tree);
        return graph;
	}

    @Override
    public void enterDecl(FragmentParser.DeclContext ctx) {
        addSeqBlock(ctx, "decl");
    }

    @Override
    public void enterAssignStat(FragmentParser.AssignStatContext ctx) {
        addSeqBlock(ctx, "assign");
    }

    @Override
    public void enterWhileStat(FragmentParser.WhileStatContext ctx) {
        Node whileBlock = addSeqBlock(ctx, "while");
        entryBlocks.put(ctx, whileBlock);
    }

    @Override
    public void enterIfStat(FragmentParser.IfStatContext ctx) {
        Node ifBlock = addSeqBlock(ctx, "if");
        Node afterBlock = graph.addNode("after");
        ifBlock.addEdge(afterBlock);
        lastBlocks.put(ctx.getParent(), afterBlock);
        entryBlocks.put(ctx, ifBlock);
    }

    // -----------------------------------------------------------------
    // TODO: Remove exit listeners.

    @Override
    public void exitWhileStat(FragmentParser.WhileStatContext ctx) {
        Node entry = entryBlocks.get(ctx);
        Node lastBlock = lastBlocks.get(ctx.stat());
        if (lastBlock != null) {
            lastBlock.addEdge(entry);
        }
    }

    @Override
    public void exitIfStat(FragmentParser.IfStatContext ctx) {
        Node ifBlock = lastBlocks.get(ctx.stat().get(0));
        Node afterBlock = lastBlocks.get(ctx.getParent());
        ifBlock.addEdge(afterBlock);
        if (ctx.stat().size() > 1) {
            Node elseBlock = lastBlocks.get(ctx.stat().get(1));
            elseBlock.addEdge(afterBlock);
        }
    }

    // -----------------------------------------------------------------

    @Override
    public void enterBlockStat(FragmentParser.BlockStatContext ctx) {
        Node entry = entryBlocks.get(ctx.getParent());
        entryBlocks.put(ctx, entry);
    }

    @Override
    public void enterPrintStat(FragmentParser.PrintStatContext ctx) {
        addSeqBlock(ctx, "print");
    }

    private Node addSeqBlock(FragmentParser.StatContext ctx, String id) {
        ParseTree parent = ctx.getParent();
        Node prevBlock = lastBlocks.get(parent);
        Node entryBlock = entryBlocks.get(parent);
        Node block = addNode(ctx, id);
        if (prevBlock == null) {
            if (entryBlock != null) {
                entryBlock.addEdge(block);
            }
        } else {
            prevBlock.addEdge(block);
        }
        lastBlocks.put(parent, block);
        return block;
    }

	@Override
	public void enterBreakStat(FragmentParser.BreakStatContext ctx) {
		throw new IllegalArgumentException("Break not supported");
	}

	@Override
	public void enterContStat(FragmentParser.ContStatContext ctx) {
		throw new IllegalArgumentException("Continue not supported");
	}

	/** Adds a node to he CGF, based on a given parse tree node.
	 * Gives the CFG node a meaningful ID, consisting of line number and 
	 * a further indicator.
	 */
	private Node addNode(ParserRuleContext node, String text) {
		return this.graph.addNode(text + " (" + node.getStart().getLine() + ")");
	}

	/** Main method to build and print the CFG of a simple Java program. */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: [filename]+");
			return;
		}
		TopDownCFGBuilder builder = new TopDownCFGBuilder();
		for (String filename : args) {
			File file = new File(filename);
			System.out.println(filename);
			System.out.println(builder.build(file));
		}
	}
}
