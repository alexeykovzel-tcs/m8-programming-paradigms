package block3.cc.tabular;

import org.antlr.v4.runtime.*;

import java.io.IOException;

public class TabularHtmlConverter {
    public static void main(String[] args) throws IOException {
        parseFile("src/block3/cc/tabular/tex/tabular-1.tex");
    }

    private static TabularParser.ProgramContext parseFile(String fileName) throws IOException {
        CharStream charStream = CharStreams.fromFileName(fileName);
        Lexer lexer = new TabularLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TabularParser parser = new TabularParser(tokenStream);
        return parser.program();
    }
}
