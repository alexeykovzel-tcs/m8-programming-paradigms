package block2.cc.ll;

import block2.cc.NonTerm;
import block2.cc.Symbol;
import block2.cc.Term;

import java.util.*;

public class LLCalculatorImpl implements LLCalculator {
    private final Grammar grammar;

    public LLCalculatorImpl(Grammar grammar) {
        this.grammar = grammar;
    }

    @Override
    public Map<Symbol, Set<Term>> getFirst() {
        Map<Symbol, Set<Term>> first = new HashMap<>();

        // Assign an empty set for each non-terminal
        for (NonTerm nonTerm : grammar.getNonTerminals()) {
            first.put(nonTerm, new HashSet<>());
        }
        // Terminals only have themselves as 'first'
        for (Term term : grammar.getTerminals()) {
            first.put(term, Set.of(term));
        }
        // Update 'first' until there are no more changes
        boolean changing = true;
        while (changing) {
            changing = false;
            for (NonTerm nonTerm : grammar.getNonTerminals()) {
                boolean changed = false;

                // Update 'first' from each non-terminal rule
                for (Rule rule : grammar.getRules(nonTerm)) {
                    Set<Term> ruleFirst = first.get(rule.getRHS().get(0));
                    changed = changed || first.get(nonTerm).addAll(ruleFirst);
                }
                changing = changing || changed;
            }
        }
        return first;
    }

    @Override
    public Map<NonTerm, Set<Term>> getFollow() {
        Map<Symbol, Set<Term>> first = getFirst();
        Map<NonTerm, Set<Term>> follow = new HashMap<>();

        // Assign empty sets to each non-terminal
        for (NonTerm nonTerm : grammar.getNonTerminals()) {
            follow.put(nonTerm, new HashSet<>());
        }
        // Add 'end-of-file' to the start symbol
        follow.get(grammar.getStart()).add(Symbol.EOF);

        // Update 'follow' until there are no more changes
        boolean changing = true;
        while (changing) {
            changing = false;
            for (Rule rule : grammar.getRules()) {
                Set<Term> trailer = follow.get(rule.getLHS());
                List<Symbol> ruleSymbols = rule.getRHS();

                // iterate rule symbols from the end
                for (int i = ruleSymbols.size() - 1; i >= 0; i--) {
                    Symbol symbol = ruleSymbols.get(i);

                    if (symbol instanceof NonTerm) {
                        changing = changing || follow.get(symbol).addAll(trailer);
                        Set<Term> symbolFirst = first.get(symbol);

                        if (symbolFirst.contains(Symbol.EMPTY)) {
                            trailer.addAll(symbolFirst);
                            trailer.remove(Symbol.EMPTY);
                        } else {
                            trailer = first.get(symbol);
                        }
                    } else  {
                        trailer = first.get(symbol);
                    }
                }
            }
        }
        return follow;
    }

    @Override
    public Map<Rule, Set<Term>> getFirstPlus() {
        Map<Symbol, Set<Term>> first = getFirst();
        Map<NonTerm, Set<Term>> follow = getFollow();
        Map<Rule, Set<Term>> firstPlus = new HashMap<>();

        for (Rule rule : grammar.getRules()) {
            Set<Term> ruleFirst = new HashSet<>();
            firstPlus.put(rule, ruleFirst);

            boolean takeFollow = true;
            for (Symbol symbol : rule.getRHS()) {
                Set<Term> symbolFirst = first.get(symbol);
                ruleFirst.addAll(symbolFirst);
                if (!symbolFirst.contains(Symbol.EMPTY)) {
                    takeFollow = false;
                    break;
                }
            }
            if (takeFollow) {
                ruleFirst.addAll(follow.get(rule.getLHS()));
            }
            ruleFirst.remove(Symbol.EMPTY);
        }
        return firstPlus;
    }

    @Override
    public boolean isLL1() {
        Map<Rule, Set<Term>> firstPlus = getFirstPlus();

        // For each non-terminal
        for (NonTerm nonTerm : grammar.getNonTerminals()) {
            Set<Term> checkedTerms = new HashSet<>();

            // Check which terminals can be 'first' in its rules
            for (Rule rule : grammar.getRules(nonTerm)) {
                for (Term term : firstPlus.get(rule)) {

                    // If there is overlapping, then it is not LL(1)
                    if (checkedTerms.contains(term)) {
                        return false;
                    }
                    checkedTerms.add(term);
                }
            }
        }
        return true;
    }
}
