package block2.cc.ll;

import block2.cc.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class ConditionParser implements Parser {
    private final SymbolFactory symbolFactory = new SymbolFactory(If.class);
    private static final NonTerm Statement = new NonTerm("Statement");
    private static final NonTerm ElsePart = new NonTerm("ElsePart");

    private List<? extends Token> tokens;
    private int pointer;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: \"text\"");
        } else {
            for (String text : args) {
                CharStream stream = CharStreams.fromString(text);
                Lexer lexer = new Sentence(stream);
                try {
                    System.out.printf("\nParse tree: %n%s%n",
                            new ConditionParser().parse(lexer));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public AST parse(Lexer lexer) throws ParseException {
        tokens = lexer.getAllTokens();
        return parseStatement();
    }

    private AST parseStatement() throws ParseException {
        AST parseTree = new AST(Statement);
        if (peekToken() == If.ASSIGN) {
            parseTree.addChild(parseToken(If.ASSIGN));
        } else {
            parseTree.addChild(parseToken(If.IF));
            parseTree.addChild(parseToken(If.COND));
            parseTree.addChild(parseToken(If.THEN));
            parseTree.addChild(parseStatement());
            parseTree.addChild(parseElsePart());
        }
        return parseTree;
    }

    private AST parseElsePart() throws ParseException {
        AST parseTree = new AST(ElsePart);
        if (peekToken() == If.ELSE) {
            parseTree.addChild(parseToken(If.ELSE));
            parseTree.addChild(parseStatement());
        }
        return parseTree;
    }

    private int peekToken() throws ParseException {
        return getNextToken().getType();
    }

    private AST parseToken(int tokenType) throws ParseException {
        Term term = symbolFactory.getTerminal(tokenType);
        Token token = getNextToken();
        pointer++;
        return new AST(term, token);
    }

    private Token getNextToken() throws ParseException {
        if (pointer >= tokens.size()) {
            throw new ParseException("Reading beyond end of input");
        }
        return tokens.get(pointer);
    }
}
