package block2.cc.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import block2.cc.ll.*;
import org.junit.Test;

import block2.cc.NonTerm;
import block2.cc.Symbol;
import block2.cc.Term;

public class SentenceLLTest {
    Grammar sentenceG = GrammarFactory.getSentenceGrammar();

    // Define the non-terminals
    NonTerm subject = sentenceG.getNonterminal("Subject");
    NonTerm object = sentenceG.getNonterminal("Object");
    NonTerm sentence = sentenceG.getNonterminal("Sentence");
    NonTerm modifier = sentenceG.getNonterminal("Modifier");

    // Define the terminals
    Term adjective = sentenceG.getTerminal(Sentence.ADJECTIVE);
    Term noun = sentenceG.getTerminal(Sentence.NOUN);
    Term verb = sentenceG.getTerminal(Sentence.VERB);
    Term end = sentenceG.getTerminal(Sentence.ENDMARK);

    // Now add the last rule, causing the grammar to fail
    Grammar sentenceFail = GrammarFactory.getSentenceGrammar();

    {
        sentenceFail.addRule(modifier, modifier, modifier);
    }

    LLCalculator sentenceFailLL = createCalc(sentenceFail);

    /**
     * Tests the LL-calculator for the Sentence grammar.
     */
    @Test
    public void testSentenceOrigLL1() {
        // Without the last (recursive) rule, the grammar is LL-1
        assertTrue(createCalc(sentenceG).isLL1());
    }

    @Test
    public void testSentenceXFirst() {
        Map<Symbol, Set<Term>> first = sentenceFailLL.getFirst();
        assertEquals(setOf(adjective, noun), first.get(sentence));
        assertEquals(setOf(adjective, noun), first.get(subject));
        assertEquals(setOf(adjective, noun), first.get(object));
        assertEquals(setOf(adjective), first.get(modifier));
    }

    @Test
    public void testSentenceXFollow() {
        Map<NonTerm, Set<Term>> follow = sentenceFailLL.getFollow();
        assertEquals(setOf(Symbol.EOF), follow.get(sentence));
        assertEquals(setOf(verb), follow.get(subject));
        assertEquals(setOf(end), follow.get(object));
        assertEquals(setOf(noun, adjective), follow.get(modifier));
    }

    @Test
    public void testSentenceXFirstPlus() {
        Map<Rule, Set<Term>> firstPlus = sentenceFailLL.getFirstPlus();
        List<Rule> subjRules = sentenceFail.getRules(subject);
        assertEquals(setOf(noun), firstPlus.get(subjRules.get(0)));
        assertEquals(setOf(adjective), firstPlus.get(subjRules.get(1)));
    }

    @Test
    public void testSentenceXLL1() {
        assertFalse(sentenceFailLL.isLL1());
    }

    /**
     * Creates an LL1-calculator for a given grammar.
     */
    private LLCalculator createCalc(Grammar g) {
        return new LLCalculatorImpl(g);
    }

    @SuppressWarnings("unchecked")
    private <T> Set<T> setOf(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }
}
