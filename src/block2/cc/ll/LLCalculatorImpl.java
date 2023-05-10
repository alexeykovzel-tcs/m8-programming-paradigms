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
        // Update 'first' until it becomes stable
        boolean stable = false;
        while (!stable) {
            stable = true;
            for (NonTerm nonTerm : grammar.getNonTerminals()) {
                boolean noChanges = true;

                // Update 'first' from each non-terminal rule
                for (Rule rule : grammar.getRules(nonTerm)) {
                    Set<Term> ruleFirst = first.get(rule.getRHS().get(0));
                    noChanges = noChanges && !first.get(nonTerm).addAll(ruleFirst);
                }
                stable = stable && noChanges;
            }
        }
        return first;
    }

    @Override
    public Map<NonTerm, Set<Term>> getFollow() {
        Map<Symbol, Set<Term>> firstTermMap = getFirst();

        // Find symbols that follow directly after the terminal
        Map<NonTerm, Set<NonTerm>> followNonTermMap = new HashMap<>();
        Map<NonTerm, Set<Term>> followTermMap = new HashMap<>();
        initDirectFollow(followTermMap, followNonTermMap);

        // Add 'end-of-file' as a follow symbol for the grammar start
        followTermMap.get(grammar.getStart()).add(Symbol.EOF);

        // Update 'follow' until it becomes stable
        boolean stable = false;
        while (!stable) {
            stable = true;

            for (NonTerm nonTerm : followNonTermMap.keySet()) {
                boolean noChanges = true;

                // Add 'follow' terminals from following non-terminals
                for (NonTerm followNonTerm : followNonTermMap.get(nonTerm)) {
                    Set<Term> followTerms = firstTermMap.get(followNonTerm);
                    noChanges = noChanges && !followTermMap.get(nonTerm).addAll(followTerms);
                }
                stable = stable && noChanges;
            }
        }
        return followTermMap;
    }

    private void initDirectFollow(Map<NonTerm, Set<Term>> followTermMap,
                                  Map<NonTerm, Set<NonTerm>> followNonTermMap) {

        for (NonTerm nonTerm : grammar.getNonTerminals()) {

            // Non-terminals that follow after the symbol
            Set<NonTerm> followNonTerms = new HashSet<>();
            followNonTermMap.put(nonTerm, followNonTerms);

            // Terminals that follow after the symbol
            Set<Term> followTerms = new HashSet<>();
            followTermMap.put(nonTerm, followTerms);

            // Find symbol instances in the grammar rules
            for (Rule rule : grammar.getRules()) {
                List<Symbol> ruleSymbols = rule.getRHS();
                NonTerm lhs = rule.getLHS();
                if (lhs.equals(nonTerm)) {
                    continue;
                }
                for (int i = 0; i < ruleSymbols.size(); i++) {
                    if (ruleSymbols.get(i).equals(nonTerm)) {
                        boolean isLastInRule = i + 1 == ruleSymbols.size();

                        if (isLastInRule) {
                            // If symbol is last in the rule, take 'follow'
                            // of the left-hand-side (LHS)
                            followNonTerms.add(lhs);
                        } else {
                            // otherwise, take 'follow' of the next symbol
                            Symbol followSymbol = ruleSymbols.get(i + 1);
                            if (followSymbol instanceof Term) {
                                followTerms.add((Term) followSymbol);
                            } else {
                                followNonTerms.add(lhs);
                            }
                        }
                    }
                }
            }
        }
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
            // If all symbols from the rule can be empty,
            // then we should take 'follow'
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

                    // If such terminal was already checked,
                    // then it is not LL(1)
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
