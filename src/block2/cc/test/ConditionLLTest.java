package block2.cc.test;

import block2.cc.NonTerm;
import block2.cc.Symbol;
import block2.cc.Term;
import block2.cc.ll.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ConditionLLTest {
    private Grammar grammar;
    private LLCalculator ll1;

    // Terminals and non-terminals
    private NonTerm statement;
    private NonTerm elsePart;
    private Term assign;
    private Term elseTerm;
    private Term ifTerm;

    @Before
    public void setUp() {
        grammar = GrammarFactory.getConditionGrammar();
        ll1 = new LLCalculatorImpl(grammar);

        statement = grammar.getNonterminal("Statement");
        elsePart = grammar.getNonterminal("ElsePart");
        assign = grammar.getTerminal(If.ASSIGN);
        elseTerm = grammar.getTerminal(If.ELSE);
        ifTerm = grammar.getTerminal(If.IF);
    }

    @Test
    public void testFirst() {
        Map<Symbol, Set<Term>> first = ll1.getFirst();
        assertEquals(Set.of(assign, ifTerm), first.get(statement));
        assertEquals(Set.of(elseTerm, Symbol.EMPTY), first.get(elsePart));
    }

    @Test
    public void testFollow() {
        Map<NonTerm, Set<Term>> follow = ll1.getFollow();
        assertEquals(Set.of(Symbol.EOF, elseTerm), follow.get(statement));
        assertEquals(Set.of(Symbol.EOF, elseTerm), follow.get(elsePart));
    }

    @Test
    public void testFirstPlus() {
        Map<Rule, Set<Term>> firstPlus = ll1.getFirstPlus();
        List<Rule> elseRules = grammar.getRules(elsePart);
        assertEquals(Set.of(elseTerm), firstPlus.get(elseRules.get(0)));
        assertEquals(Set.of(elseTerm, Symbol.EOF), firstPlus.get(elseRules.get(1)));
    }

    @Test
    public void testLL1() {
        assertFalse(ll1.isLL1());
    }
}
