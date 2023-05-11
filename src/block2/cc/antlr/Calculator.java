package block2.cc.antlr;

import block2.cc.ParseException;
import org.antlr.v4.runtime.*;

import java.util.List;

public class Calculator {
    public static void main(String[] args) throws ParseException {
        String expression = "2^3-3";

        CharStream inputStream = CharStreams.fromString(expression);
        Lexer lexer = new MathLexer(inputStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        MathParser parser = new MathParser(tokenStream);

        System.out.println("\nInput: " + expression);
        System.out.println("Output: " + evaluate(parser.expr()) + "\n");
    }

    private static double evaluate(MathParser.ExprContext expr) throws ParseException {
        List<MathParser.ExprContext> parts = expr.expr();

        if (parts.isEmpty()) {
            String numberValue = expr.NUMBER().getSymbol().getText();
            return Double.parseDouble(numberValue);
        }
        if (parts.size() == 2) {
            return evaluateOperation(expr);
        }
        if (expr.MINUS() != null) {
            return -evaluate(parts.get(0));
        }
        return evaluate(parts.get(0));
    }

    private static double evaluateOperation(MathParser.ExprContext expr) throws ParseException {
        var x = expr.expr().get(0);
        var y = expr.expr().get(1);

        if (expr.PLUS() != null) {
            return evaluate(x) + evaluate(y);
        }
        if (expr.MINUS() != null) {
            return evaluate(x) - evaluate(y);
        }
        if (expr.MULT() != null) {
            return evaluate(x) * evaluate(y);
        }
        return Math.pow(evaluate(x), evaluate(y));
    }
}
