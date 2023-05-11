package block2.cc.antlr;

import block2.cc.*;
import block2.cc.Parser;
import block2.cc.ll.Sentence;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.BitSet;

public class SentenceConverter extends SentenceBaseListener implements Parser {

    /**
     * Factory needed to create terminals of the {@link Sentence}
     * grammar. See {@link block2.cc.ll.SentenceParser} for
     * example usage.
     */
    private final SymbolFactory symbolFactory;

    public SentenceConverter() {
        this.symbolFactory = new SymbolFactory(Sentence.class);
    }

    @Override
    public AST parse(Lexer lexer) throws ParseException {
        TokenStream tokens = new CommonTokenStream(lexer);
        SentenceParser parser = new SentenceParser(tokens);
        parser.addErrorListener(new SentenceErrorListener());
        try {
            return parse(parser.sentence());
        } catch (RuntimeException e) {
            if (e.getCause() instanceof ParseException) {
                throw (ParseException) e.getCause();
            }
            throw e;
        }
    }

    private AST parse(SentenceParser.SentenceContext sentence) throws ParseException {
        AST ast = new AST(new NonTerm("Sentence"));
        ast.addChild(parse(sentence.subject()));
        ast.addChild(parse(sentence.VERB(), Sentence.VERB));
        ast.addChild(parse(sentence.object()));
        ast.addChild(parse(sentence.ENDMARK(), Sentence.ENDMARK));
        return ast;
    }

    private AST parse(SentenceParser.SubjectContext subject) throws ParseException {
        AST ast = new AST(new NonTerm("Subject"));
        if (subject.start.getType() == Sentence.NOUN) {
            ast.addChild(parse(subject.NOUN(), Sentence.NOUN));
        } else {
            ast.addChild(parse(subject.modifier()));
            ast.addChild(parse(subject.subject()));
        }
        return ast;
    }

    private AST parse(SentenceParser.ObjectContext object) throws ParseException {
        AST ast = new AST(new NonTerm("Object"));
        if (object.start.getType() == Sentence.NOUN) {
            ast.addChild(parse(object.NOUN(), Sentence.NOUN));
        } else {
            ast.addChild(parse(object.modifier()));
            ast.addChild(parse(object.object()));
        }
        return ast;
    }

    private AST parse(SentenceParser.ModifierContext modifier) throws ParseException {
        AST ast = new AST(new NonTerm("Modifier"));
        ast.addChild(parse(modifier.ADJECTIVE(), Sentence.ADJECTIVE));
        return ast;
    }

    private AST parse(TerminalNode token, int termType) throws ParseException {
        int tokenType = token.getSymbol().getType();
        if (tokenType != termType) {
            throw new ParseException();
        }
        Term term = symbolFactory.getTerminal(termType);
        return new AST(term, token.getSymbol());
    }

    static class SentenceErrorListener extends BaseErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                int line, int charPositionInLine, String msg,
                                RecognitionException e) {
            throw new RuntimeException(new ParseException());
        }
    }
}
