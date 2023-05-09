package block1.cc.test;

import block1.cc.antlr.Exercise12;
import org.junit.Test;

public class Exercise12Test {
    private static LexerTester tester = new LexerTester(Exercise12.class);

    @Test
    public void test() {
        tester.correct("\"bla bla \"\" bla bla \"");
        tester.correct("\"bla bla\"");
        tester.yields("\" bla bla \"\" bla bla \" \" bla \"",
                Exercise12.STRING, Exercise12.STRING);
        tester.wrong("\"bla bla \" bla \"");
        tester.wrong("\"bla bla bla");
        tester.wrong("bla bla bla \"");
    }
}
