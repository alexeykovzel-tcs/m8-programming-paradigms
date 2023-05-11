package block2.cc.ll;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import block2.cc.antlr.SentenceConverter;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import block2.cc.AST;
import block2.cc.NonTerm;
import block2.cc.ParseException;
import block2.cc.Parser;
import block2.cc.Symbol;
import block2.cc.Term;

/**
 * Generic table-driven LL(1)-parser.
 */
public class GenericLLParser implements Parser {
    private final Grammar grammar;

    // LL(1) calculator for FIRST, FOLLOW and FIRST+
    private final LLCalculator ll1Calculator;

    // Map from non-terminals to maps of rules indexed by terminal.
    private Map<NonTerm, Map<Term, Rule>> ll1Table;

    // Tokens of the input text
    private List<? extends Token> tokens;
    private int pointer;

    public GenericLLParser(Grammar grammar) {
        this.grammar = grammar;
        this.ll1Calculator = new LLCalculatorImpl(grammar);
    }

    @Override
    public AST parse(Lexer lexer) throws ParseException {
        this.tokens = lexer.getAllTokens();
        this.pointer = 0;
        return parse(this.grammar.getStart());
    }

    /**
     * Parses the start of the token stream according to a given
     * symbol. If it is a terminal, that should be the first token;
     * otherwise, it is a non-terminal that should be expanded
     * according to the next token in the token stream, using the
     * FIRST+-lookup table and recursively calling {@link #parse(Rule)}
     *
     * @param symbol the symbol according to which the token stream
     *               should be parsed
     * @return the sub-AST resulting from the parsing of symbol,
     * or null if the symbol expands to the empty string
     * @throws ParseException if the symbol cannot be parsed because
     *                        the token stream does not contain the expected symbols
     */
    private AST parse(Symbol symbol) throws ParseException {
        if (symbol instanceof NonTerm) {
            Rule rule = lookup((NonTerm) symbol);
            return parse(rule);
        } else {
            Token nextToken = getNextToken();
            Term term = (Term) symbol;
            if (term.getTokenType() != nextToken.getType()) {
                throw new ParseException(String.format("Expected: %s; Actual: %s",
                        term.getName(), nextToken.getText()));
            }
            return new AST(term, nextToken);
        }
    }

    /**
     * Parses the start of the token stream according to a given
     * rule, recursively calling {@link #parse(Symbol)} to process
     * the RHS.
     *
     * @return the sub-AST resulting from the parsing of the rule.
     * The top node is the node for the LHS of the rule, its direct
     * children correspond to the symbols of the rule's RHS.
     * @throws ParseException if the symbol cannot be parsed
     *                        because the token stream does not contain the expected symbols
     */
    private AST parse(Rule rule) throws ParseException {
        AST parseTree = new AST(rule.getLHS());
        for (Symbol symbol : rule.getRHS()) {
            parseTree.addChild(parse(symbol));
        }
        return parseTree;
    }

    /**
     * Uses the lookup table to look up the rule to which
     * a given nonterminal should be expanded.
     * The next rule is determined by the next token, using the
     * FIRST+-set of the nonterminal.
     *
     * @throws ParseException if the lookup table does not
     *                        contain a rule for the nonterminal in combination with
     *                        the first token in the token stream.
     */
    private Rule lookup(NonTerm nt) throws ParseException {
        Rule result;
        if (atEnd()) {
            result = getLL1Table().get(nt).get(Term.EOF);
            if (result == null) {
                throw new ParseException("Reading beyond end of input");
            }
        } else {
            Token nextToken = peekToken();
            Term term = this.grammar.getTerminal(nextToken.getType());
            result = getLL1Table().get(nt).get(term);
            if (result == null) {
                throw new ParseException(String.format(
                        "Line %d:%d - no rule for '%s' on token '%s'",
                        nextToken.getLine(),
                        nextToken.getCharPositionInLine(),
                        nt.getName(), term));
            }
        }
        return result;
    }

    /**
     * Tests whether the end of input has been reached.
     */
    private boolean atEnd() {
        return this.pointer >= this.tokens.size();
    }

    /**
     * Returns the next token, without moving the token index.
     */
    private Token peekToken() throws ParseException {
        if (this.pointer >= this.tokens.size()) {
            throw new ParseException("Reading beyond end of input");
        }
        return this.tokens.get(this.pointer);
    }

    /**
     * Returns the next token and moves up the token index.
     */
    private Token getNextToken() throws ParseException {
        Token result = peekToken();
        this.pointer++;
        return result;
    }

    /**
     * Lazily builds and then returns the lookup table.
     */
    private Map<NonTerm, Map<Term, Rule>> getLL1Table() {
        if (this.ll1Table == null) {
            this.ll1Table = calcLL1Table();
        }
        return this.ll1Table;
    }

    /**
     * Constructs the {@link #ll1Table}.
     */
    private Map<NonTerm, Map<Term, Rule>> calcLL1Table() {
        Map<Rule, Set<Term>> firstPlus = ll1Calculator.getFirstPlus();
        Map<NonTerm, Map<Term, Rule>> ll1Table = new HashMap<>();

        // Assign empty maps to each non-terminal
        for (NonTerm nonTerm : grammar.getNonTerminals()) {
            ll1Table.put(nonTerm, new HashMap<>());
        }
        // Set redirections upon terminals for each rule
        for (Rule rule : firstPlus.keySet()) {
            Map<Term, Rule> redirects = ll1Table.get(rule.getLHS());
            for (Term term : firstPlus.get(rule)) {
                redirects.put(term, rule);
            }
        }
        return ll1Table;
    }
}
