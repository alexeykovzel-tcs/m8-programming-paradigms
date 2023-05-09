package block2.cc.antlr;

import block2.cc.ll.Sentence;
import org.antlr.v4.runtime.Lexer;

import block2.cc.AST;
import block2.cc.ParseException;
import block2.cc.Parser;
import block2.cc.SymbolFactory;

public class SentenceConverter 
		extends SentenceBaseListener implements Parser {
	/** Factory needed to create terminals of the {@link Sentence}
	 * grammar. See {@link block2.cc.ll.SentenceParser} for
	 * example usage. */
	private final SymbolFactory fact;

	public SentenceConverter() {
		this.fact = new SymbolFactory(Sentence.class);
	}

	@Override
	public AST parse(Lexer lexer) throws ParseException {
		return null; // TODO Fill in
	}
	
	// From here on overwrite the listener methods
	// Use an appropriate ParseTreeProperty to
	// store the correspondence from nodes to ASTs
}
