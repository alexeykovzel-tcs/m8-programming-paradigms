// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block2/cc/antlr/Sentence.g4 by ANTLR 4.12.0
package block2.cc.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SentenceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOUN=1, VERB=2, ADJECTIVE=3, ENDMARK=4, WS=5, TYPO=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOUN", "VERB", "ADJECTIVE", "ENDMARK", "WS", "TYPO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'love'", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOUN", "VERB", "ADJECTIVE", "ENDMARK", "WS", "TYPO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SentenceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sentence.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0006G\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u001f\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002;\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005D\b\u0005\u000b\u0005"+
		"\f\u0005E\u0000\u0000\u0006\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\u0001\u0000\u0002\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000AZazJ\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0001\u001e\u0001\u0000\u0000\u0000\u0003 \u0001\u0000\u0000\u0000"+
		"\u0005:\u0001\u0000\u0000\u0000\u0007<\u0001\u0000\u0000\u0000\t>\u0001"+
		"\u0000\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\r\u000e\u0005s\u0000"+
		"\u0000\u000e\u000f\u0005t\u0000\u0000\u000f\u0010\u0005u\u0000\u0000\u0010"+
		"\u0011\u0005d\u0000\u0000\u0011\u0012\u0005e\u0000\u0000\u0012\u0013\u0005"+
		"n\u0000\u0000\u0013\u0014\u0005t\u0000\u0000\u0014\u001f\u0005s\u0000"+
		"\u0000\u0015\u0016\u0005c\u0000\u0000\u0016\u0017\u0005o\u0000\u0000\u0017"+
		"\u0018\u0005m\u0000\u0000\u0018\u0019\u0005p\u0000\u0000\u0019\u001a\u0005"+
		"i\u0000\u0000\u001a\u001b\u0005l\u0000\u0000\u001b\u001c\u0005e\u0000"+
		"\u0000\u001c\u001d\u0005r\u0000\u0000\u001d\u001f\u0005s\u0000\u0000\u001e"+
		"\r\u0001\u0000\u0000\u0000\u001e\u0015\u0001\u0000\u0000\u0000\u001f\u0002"+
		"\u0001\u0000\u0000\u0000 !\u0005l\u0000\u0000!\"\u0005o\u0000\u0000\""+
		"#\u0005v\u0000\u0000#$\u0005e\u0000\u0000$\u0004\u0001\u0000\u0000\u0000"+
		"%&\u0005a\u0000\u0000&\'\u0005l\u0000\u0000\';\u0005l\u0000\u0000()\u0005"+
		"s\u0000\u0000)*\u0005m\u0000\u0000*+\u0005a\u0000\u0000+,\u0005r\u0000"+
		"\u0000,;\u0005t\u0000\u0000-.\u0005u\u0000\u0000./\u0005n\u0000\u0000"+
		"/0\u0005d\u0000\u000001\u0005e\u0000\u000012\u0005r\u0000\u000023\u0005"+
		"g\u0000\u000034\u0005r\u0000\u000045\u0005a\u0000\u000056\u0005d\u0000"+
		"\u000067\u0005u\u0000\u000078\u0005a\u0000\u000089\u0005t\u0000\u0000"+
		"9;\u0005e\u0000\u0000:%\u0001\u0000\u0000\u0000:(\u0001\u0000\u0000\u0000"+
		":-\u0001\u0000\u0000\u0000;\u0006\u0001\u0000\u0000\u0000<=\u0005.\u0000"+
		"\u0000=\b\u0001\u0000\u0000\u0000>?\u0007\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0006\u0004\u0000\u0000A\n\u0001\u0000\u0000\u0000BD\u0007"+
		"\u0001\u0000\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\f\u0001\u0000\u0000"+
		"\u0000\u0004\u0000\u001e:E\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}