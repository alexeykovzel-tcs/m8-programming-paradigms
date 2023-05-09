package block1.cc.test;

import java.util.List;

import block1.cc.dfa.DfaScanner;
import block1.cc.dfa.DfaScannerImpl;
import block1.cc.dfa.DfaState;
import org.junit.Assert;
import org.junit.Test;

import static block1.cc.dfa.DfaState.DFA_ID6;
import static block1.cc.dfa.DfaState.DFA_LALA;
import static org.junit.Assert.assertEquals;

/**
 * Test class for Scanner implementation.
 */
public class DfaScannerTest {
    private DfaScanner myGen = new DfaScannerImpl();

    @Test
    public void testID6() {
        this.dfa = DFA_ID6;
        yields("");
        yields("a12345", "a12345");
        yields("a12345AaBbCc", "a12345", "AaBbCc");
    }

    @Test
    public void testLala() {
        this.dfa = DFA_LALA;
        yields("");
        yields("Laaaa La Laa Laaaa La Li Laa", "Laaaa La ", "Laa Laaaa La Li ", "Laa");
    }

    /**
     * Tests whether a given word can be scanned by {@link myGen}.
     * and results in the expected tokens.
     * Throws an assertion error if the word is rejected or gives rise to
     * different tokens than those expected.
     *
     * @param word   string to be scanned
     * @param tokens sequence of tokens expected from scanning the word
     */
    private void yields(String word, String... tokens) {
        List<String> result = this.myGen.scan(this.dfa, word);
        if (result == null) {
            Assert.fail(String.format(
                    "Word '%s' is erroneously rejected by %s", word, this.dfa));
        }
        assertEquals(tokens.length, result.size());
        for (int i = 0; i < tokens.length; i++) {
            assertEquals(tokens[i], result.get(i));
        }
    }

    private DfaState dfa;
}
