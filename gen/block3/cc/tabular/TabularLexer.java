// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/tabular/Tabular.g4 by ANTLR 4.12.0
package block3.cc.tabular;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TabularLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OPEN=5, CLOSE=6, DOLLAR=7, HASH=8, HAT=9, 
		UNDER=10, TILDE=11, PERCENT=12, ENTRY=13, TABLE_START=14, TABLE_END=15, 
		ROW_START=16, ROW_END=17, AND=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "DIGIT", "LETTER", "WORD", "OFFSET", 
			"OPEN", "CLOSE", "DOLLAR", "HASH", "HAT", "UNDER", "TILDE", "PERCENT", 
			"ENTRY", "TABLE_START", "TABLE_END", "ROW_START", "ROW_END", "AND"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'l'", "'r'", "'c'", "'{'", "'}'", "'$'", "'#'", "'^'", 
			"'_'", "'~'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "OPEN", "CLOSE", "DOLLAR", "HASH", "HAT", 
			"UNDER", "TILDE", "PERCENT", "ENTRY", "TABLE_START", "TABLE_END", "ROW_START", 
			"ROW_END", "AND"
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


	public TabularLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tabular.g4"; }

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
		"\u0004\u0000\u0012\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006<\b\u0006"+
		"\u000b\u0006\f\u0006=\u0001\u0007\u0005\u0007A\b\u0007\n\u0007\f\u0007"+
		"D\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0004\u0010X\b\u0010\u000b"+
		"\u0010\f\u0010Y\u0001\u0010\u0005\u0010]\b\u0010\n\u0010\f\u0010`\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0004\u0013\u0088\b\u0013\u000b\u0013\f\u0013"+
		"\u0089\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000"+
		"\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b"+
		"\u0000\r\u0000\u000f\u0000\u0011\u0005\u0013\u0006\u0015\u0007\u0017\b"+
		"\u0019\t\u001b\n\u001d\u000b\u001f\f!\r#\u000e%\u000f\'\u0010)\u0011+"+
		"\u0012\u0001\u0000\u0002\u0001\u000009\u0002\u0000AZaz\u0097\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/"+
		"\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00073\u0001\u0000"+
		"\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000"+
		"\r;\u0001\u0000\u0000\u0000\u000fB\u0001\u0000\u0000\u0000\u0011E\u0001"+
		"\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000"+
		"\u0000\u0017K\u0001\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001b"+
		"O\u0001\u0000\u0000\u0000\u001dQ\u0001\u0000\u0000\u0000\u001fS\u0001"+
		"\u0000\u0000\u0000!U\u0001\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000"+
		"%u\u0001\u0000\u0000\u0000\'\u0087\u0001\u0000\u0000\u0000)\u008b\u0001"+
		"\u0000\u0000\u0000+\u0092\u0001\u0000\u0000\u0000-.\u0005\n\u0000\u0000"+
		".\u0002\u0001\u0000\u0000\u0000/0\u0005l\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005r\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005"+
		"c\u0000\u00004\b\u0001\u0000\u0000\u000056\u0007\u0000\u0000\u00006\n"+
		"\u0001\u0000\u0000\u000078\u0007\u0001\u0000\u00008\f\u0001\u0000\u0000"+
		"\u00009<\u0003\t\u0004\u0000:<\u0003\u000b\u0005\u0000;9\u0001\u0000\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>\u000e\u0001\u0000\u0000\u0000"+
		"?A\u0005 \u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0010\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0005{\u0000\u0000F\u0012\u0001"+
		"\u0000\u0000\u0000GH\u0005}\u0000\u0000H\u0014\u0001\u0000\u0000\u0000"+
		"IJ\u0005$\u0000\u0000J\u0016\u0001\u0000\u0000\u0000KL\u0005#\u0000\u0000"+
		"L\u0018\u0001\u0000\u0000\u0000MN\u0005^\u0000\u0000N\u001a\u0001\u0000"+
		"\u0000\u0000OP\u0005_\u0000\u0000P\u001c\u0001\u0000\u0000\u0000QR\u0005"+
		"~\u0000\u0000R\u001e\u0001\u0000\u0000\u0000ST\u0005%\u0000\u0000T \u0001"+
		"\u0000\u0000\u0000U^\u0003\r\u0006\u0000VX\u0005 \u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0003\r\u0006\u0000"+
		"\\W\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_\"\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0003\u000f\u0007\u0000bc\u0005\\\u0000\u0000cd\u0005b"+
		"\u0000\u0000de\u0005e\u0000\u0000ef\u0005g\u0000\u0000fg\u0005i\u0000"+
		"\u0000gh\u0005n\u0000\u0000hi\u0005{\u0000\u0000ij\u0005t\u0000\u0000"+
		"jk\u0005a\u0000\u0000kl\u0005b\u0000\u0000lm\u0005u\u0000\u0000mn\u0005"+
		"l\u0000\u0000no\u0005a\u0000\u0000op\u0005r\u0000\u0000pq\u0005}\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0003\u000f\u0007\u0000st\u0005\n\u0000"+
		"\u0000t$\u0001\u0000\u0000\u0000uv\u0003\u000f\u0007\u0000vw\u0005\\\u0000"+
		"\u0000wx\u0005e\u0000\u0000xy\u0005n\u0000\u0000yz\u0005d\u0000\u0000"+
		"z{\u0005{\u0000\u0000{|\u0005t\u0000\u0000|}\u0005a\u0000\u0000}~\u0005"+
		"b\u0000\u0000~\u007f\u0005u\u0000\u0000\u007f\u0080\u0005l\u0000\u0000"+
		"\u0080\u0081\u0005a\u0000\u0000\u0081\u0082\u0005r\u0000\u0000\u0082\u0083"+
		"\u0005}\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0003"+
		"\u000f\u0007\u0000\u0085&\u0001\u0000\u0000\u0000\u0086\u0088\u0005 \u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a(\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u000f\u0007\u0000"+
		"\u008c\u008d\u0005\\\u0000\u0000\u008d\u008e\u0005\\\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u000f\u0007\u0000\u0090"+
		"\u0091\u0005\n\u0000\u0000\u0091*\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0003\u000f\u0007\u0000\u0093\u0094\u0005&\u0000\u0000\u0094\u0095\u0003"+
		"\u000f\u0007\u0000\u0095,\u0001\u0000\u0000\u0000\u0007\u0000;=BY^\u0089"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}