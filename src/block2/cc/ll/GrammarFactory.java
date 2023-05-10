/**
 *
 */
package block2.cc.ll;

import block2.cc.NonTerm;
import block2.cc.Symbol;
import block2.cc.SymbolFactory;
import block2.cc.Term;

/**
 * Class containing some example grammars.
 *
 * @author Arend Rensink
 */
public class GrammarFactory {

    public static Grammar getConditionGrammar() {

        // Define non-terminals
        NonTerm statement = new NonTerm("Statement");
        NonTerm elsePart = new NonTerm("ElsePart");

        // Define terminals
        SymbolFactory symbols = new SymbolFactory(Sentence.class);
        Term assign = symbols.getTerminal(If.ASSIGN);
        Term condition = symbols.getTerminal(If.COND);
        Term then = symbols.getTerminal(If.THEN);
        Term elseTerm = symbols.getTerminal(If.ELSE);
        Term ifTerm = symbols.getTerminal(If.IF);

        // Build grammar
        Grammar grammar = new Grammar(statement);
        grammar.addRule(statement, assign);
        grammar.addRule(statement, ifTerm, condition, then, statement, elsePart);
        grammar.addRule(elsePart, elseTerm, statement);
        grammar.addRule(elsePart, Symbol.EMPTY);
        return grammar;
    }

    /**
     * Returns a grammar for simple English sentences.
     */
    public static Grammar getSentenceGrammar() {
        // Define the non-terminals
        NonTerm sent = new NonTerm("Sentence");
        NonTerm subj = new NonTerm("Subject");
        NonTerm obj = new NonTerm("Object");
        NonTerm mod = new NonTerm("Modifier");
        // Define the terminals, using the Sentence.g4 lexer grammar
        // Make sure you take the token constantss from the right class!
        SymbolFactory fact = new SymbolFactory(Sentence.class);
        Term noun = fact.getTerminal(Sentence.NOUN);
        Term verb = fact.getTerminal(Sentence.VERB);
        Term adj = fact.getTerminal(Sentence.ADJECTIVE);
        Term end = fact.getTerminal(Sentence.ENDMARK);
        // Build the context free grammar
        Grammar g = new Grammar(sent);
        g.addRule(sent, subj, verb, obj, end);
        g.addRule(subj, noun);
        g.addRule(subj, mod, subj);
        g.addRule(obj, noun);
        g.addRule(obj, mod, obj);
        g.addRule(mod, adj);
        return g;
    }
}
