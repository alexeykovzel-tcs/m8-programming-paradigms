package block1.cc.test;

import block1.cc.antlr.Exercise13;
import org.junit.Test;

public class Exercise13Test {
    private static LexerTester tester = new LexerTester(Exercise13.class);

    @Test
    public void test() {
        tester.correct("LaLa");
        tester.correct("Laa    La  ");
        tester.correct("Laa");
        tester.correct("Laa   Laaaa La Li   ");
        tester.wrong("Laaaa La Li   ");
        tester.yields("Laa   Laaaa La Laaa La Li   ",
                Exercise13.LALA, Exercise13.LALALALI);
    }
}
