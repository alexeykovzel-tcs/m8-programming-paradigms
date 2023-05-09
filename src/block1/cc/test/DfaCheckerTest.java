package block1.cc.test;

import block1.cc.dfa.DfaChecker;
import block1.cc.dfa.DfaCheckerImpl;
import block1.cc.dfa.DfaState;
import org.junit.Assert;
import org.junit.Test;

import static block1.cc.dfa.DfaState.DFA_ID6;
import static block1.cc.dfa.DfaState.DFA_LALA;

/**
 * Test class for Checker implementation.
 */
public class DfaCheckerTest {
    private DfaChecker myDfaChecker = new DfaCheckerImpl();

    private DfaState dfa;

    @Test
    public void testID6() {
        this.dfa = DFA_ID6;
        accepts("a12345");
        rejects("");
        rejects("a12 45");
        rejects("a12 456");
        rejects("a123456");
        rejects("123456");
    }

    @Test
    public void testLala() {
        this.dfa = DFA_LALA;
        accepts("Laaaa");
        accepts("Laaaa    La");
        accepts("La Laaa Laaaa Li    ");
        accepts("Laa Laaaa La Li");
        rejects("LA");
        rejects("L");
        rejects("La La La");
        rejects("Laaa La Li");
        rejects("La Laaa La La Li");
    }


    private void accepts(String word) {
        if (!this.myDfaChecker.accepts(this.dfa, word)) {
            Assert.fail(String.format(
                    "Word '%s' is erroneously rejected by %s", word, this.dfa));
        }
    }

    private void rejects(String word) {
        if (this.myDfaChecker.accepts(this.dfa, word)) {
            Assert.fail(String.format(
                    "Word '%s' is erroneously accepted by %s", word, this.dfa));
        }
    }
}
