package block3.cc.test;

import block3.cc.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypedCalcTest {
    private final ParseTreeWalker walker = new ParseTreeWalker();
    private final TypeInferrer typeInferrer = new TypeInferrer();

    @Test
    public void testAll() {
        test(Type.NUM, "2+4*(2+4)");
        test(Type.STR, "\"Hello\"+\"World\"");
        test(Type.BOOL, "true");
        test(Type.ERR, "true+4");
    }

    public void test(Type type, String expr) {
        assertEquals(type, parseAttrTree(expr).type);
        ParseTree tree = parseTree(expr);
        typeInferrer.init();
        walker.walk(typeInferrer, tree);
        assertEquals(type, typeInferrer.typeOf(tree));
    }

    public TypedCalcAttrParser.ExprContext parseAttrTree(String expr) {
        CharStream charStream = CharStreams.fromString(expr);
        Lexer lexer = new TypedCalcAttrLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TypedCalcAttrParser parser = new TypedCalcAttrParser(tokenStream);
        return parser.expr();
    }

    public ParseTree parseTree(String expr) {
        CharStream charStream = CharStreams.fromString(expr);
        Lexer lexer = new TypedCalcLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TypedCalcParser parser = new TypedCalcParser(tokenStream);
        return parser.expr();
    }
}
