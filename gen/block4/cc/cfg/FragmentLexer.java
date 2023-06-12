// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block4/cc/cfg/Fragment.g4 by ANTLR 4.12.0
package block4.cc.cfg;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FragmentLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, SEMI=2, COMMA=3, LSQ=4, RSQ=5, ASSIGN=6, NOT=7, OR=8, AND=9, BIT_OR=10, 
		BIT_AND=11, PLUS=12, MINUS=13, LT=14, GT=15, EQ=16, NE=17, LCURLY=18, 
		RCURLY=19, LPAR=20, RPAR=21, IN=22, PRINT=23, BOOL=24, INT=25, WHILE=26, 
		IF=27, ELSE=28, TRUE=29, FALSE=30, BREAK=31, CONTINUE=32, ID=33, NUM=34, 
		STRING=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DOT", "SEMI", "COMMA", "LSQ", "RSQ", "ASSIGN", "NOT", "OR", "AND", "BIT_OR", 
			"BIT_AND", "PLUS", "MINUS", "LT", "GT", "EQ", "NE", "LCURLY", "RCURLY", 
			"LPAR", "RPAR", "IN", "PRINT", "BOOL", "INT", "WHILE", "IF", "ELSE", 
			"TRUE", "FALSE", "BREAK", "CONTINUE", "LETTER", "DIGIT", "ID", "NUM", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "','", "'['", "']'", "'='", "'!'", "'||'", "'&&'", 
			"'|'", "'&'", "'+'", "'-'", "'<'", "'>'", "'=='", "'!='", "'{'", "'}'", 
			"'('", "')'", "'in'", "'printf'", "'boolean'", "'int'", "'while'", "'if'", 
			"'else'", "'true'", "'false'", "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "SEMI", "COMMA", "LSQ", "RSQ", "ASSIGN", "NOT", "OR", "AND", 
			"BIT_OR", "BIT_AND", "PLUS", "MINUS", "LT", "GT", "EQ", "NE", "LCURLY", 
			"RCURLY", "LPAR", "RPAR", "IN", "PRINT", "BOOL", "INT", "WHILE", "IF", 
			"ELSE", "TRUE", "FALSE", "BREAK", "CONTINUE", "ID", "NUM", "STRING", 
			"WS"
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


	public FragmentLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fragment.g4"; }

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
		"\u0004\u0000$\u00dc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u00c1\b\"\n\"\f\"\u00c4\t\"\u0001#\u0004#\u00c7\b#\u000b#\f#"+
		"\u00c8\u0001$\u0001$\u0001$\u0001$\u0005$\u00cf\b$\n$\f$\u00d2\t$\u0001"+
		"$\u0001$\u0001%\u0004%\u00d7\b%\u000b%\f%\u00d8\u0001%\u0001%\u0000\u0000"+
		"&\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A\u0000C\u0000"+
		"E!G\"I#K$\u0001\u0000\u0004\u0002\u0000AZaz\u0001\u000009\u0002\u0000"+
		"\"\"\\\\\u0003\u0000\t\n\r\r  \u00df\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0001"+
		"M\u0001\u0000\u0000\u0000\u0003O\u0001\u0000\u0000\u0000\u0005Q\u0001"+
		"\u0000\u0000\u0000\u0007S\u0001\u0000\u0000\u0000\tU\u0001\u0000\u0000"+
		"\u0000\u000bW\u0001\u0000\u0000\u0000\rY\u0001\u0000\u0000\u0000\u000f"+
		"[\u0001\u0000\u0000\u0000\u0011^\u0001\u0000\u0000\u0000\u0013a\u0001"+
		"\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000"+
		"\u0000\u0019g\u0001\u0000\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001d"+
		"k\u0001\u0000\u0000\u0000\u001fm\u0001\u0000\u0000\u0000!p\u0001\u0000"+
		"\u0000\u0000#s\u0001\u0000\u0000\u0000%u\u0001\u0000\u0000\u0000\'w\u0001"+
		"\u0000\u0000\u0000)y\u0001\u0000\u0000\u0000+{\u0001\u0000\u0000\u0000"+
		"-~\u0001\u0000\u0000\u0000/\u0085\u0001\u0000\u0000\u00001\u008d\u0001"+
		"\u0000\u0000\u00003\u0091\u0001\u0000\u0000\u00005\u0097\u0001\u0000\u0000"+
		"\u00007\u009a\u0001\u0000\u0000\u00009\u009f\u0001\u0000\u0000\u0000;"+
		"\u00a4\u0001\u0000\u0000\u0000=\u00aa\u0001\u0000\u0000\u0000?\u00b0\u0001"+
		"\u0000\u0000\u0000A\u00b9\u0001\u0000\u0000\u0000C\u00bb\u0001\u0000\u0000"+
		"\u0000E\u00bd\u0001\u0000\u0000\u0000G\u00c6\u0001\u0000\u0000\u0000I"+
		"\u00ca\u0001\u0000\u0000\u0000K\u00d6\u0001\u0000\u0000\u0000MN\u0005"+
		".\u0000\u0000N\u0002\u0001\u0000\u0000\u0000OP\u0005;\u0000\u0000P\u0004"+
		"\u0001\u0000\u0000\u0000QR\u0005,\u0000\u0000R\u0006\u0001\u0000\u0000"+
		"\u0000ST\u0005[\u0000\u0000T\b\u0001\u0000\u0000\u0000UV\u0005]\u0000"+
		"\u0000V\n\u0001\u0000\u0000\u0000WX\u0005=\u0000\u0000X\f\u0001\u0000"+
		"\u0000\u0000YZ\u0005!\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005"+
		"|\u0000\u0000\\]\u0005|\u0000\u0000]\u0010\u0001\u0000\u0000\u0000^_\u0005"+
		"&\u0000\u0000_`\u0005&\u0000\u0000`\u0012\u0001\u0000\u0000\u0000ab\u0005"+
		"|\u0000\u0000b\u0014\u0001\u0000\u0000\u0000cd\u0005&\u0000\u0000d\u0016"+
		"\u0001\u0000\u0000\u0000ef\u0005+\u0000\u0000f\u0018\u0001\u0000\u0000"+
		"\u0000gh\u0005-\u0000\u0000h\u001a\u0001\u0000\u0000\u0000ij\u0005<\u0000"+
		"\u0000j\u001c\u0001\u0000\u0000\u0000kl\u0005>\u0000\u0000l\u001e\u0001"+
		"\u0000\u0000\u0000mn\u0005=\u0000\u0000no\u0005=\u0000\u0000o \u0001\u0000"+
		"\u0000\u0000pq\u0005!\u0000\u0000qr\u0005=\u0000\u0000r\"\u0001\u0000"+
		"\u0000\u0000st\u0005{\u0000\u0000t$\u0001\u0000\u0000\u0000uv\u0005}\u0000"+
		"\u0000v&\u0001\u0000\u0000\u0000wx\u0005(\u0000\u0000x(\u0001\u0000\u0000"+
		"\u0000yz\u0005)\u0000\u0000z*\u0001\u0000\u0000\u0000{|\u0005i\u0000\u0000"+
		"|}\u0005n\u0000\u0000},\u0001\u0000\u0000\u0000~\u007f\u0005p\u0000\u0000"+
		"\u007f\u0080\u0005r\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082"+
		"\u0005n\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0084\u0005f"+
		"\u0000\u0000\u0084.\u0001\u0000\u0000\u0000\u0085\u0086\u0005b\u0000\u0000"+
		"\u0086\u0087\u0005o\u0000\u0000\u0087\u0088\u0005o\u0000\u0000\u0088\u0089"+
		"\u0005l\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005a"+
		"\u0000\u0000\u008b\u008c\u0005n\u0000\u0000\u008c0\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f\u0090"+
		"\u0005t\u0000\u0000\u00902\u0001\u0000\u0000\u0000\u0091\u0092\u0005w"+
		"\u0000\u0000\u0092\u0093\u0005h\u0000\u0000\u0093\u0094\u0005i\u0000\u0000"+
		"\u0094\u0095\u0005l\u0000\u0000\u0095\u0096\u0005e\u0000\u0000\u00964"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005i\u0000\u0000\u0098\u0099\u0005"+
		"f\u0000\u0000\u00996\u0001\u0000\u0000\u0000\u009a\u009b\u0005e\u0000"+
		"\u0000\u009b\u009c\u0005l\u0000\u0000\u009c\u009d\u0005s\u0000\u0000\u009d"+
		"\u009e\u0005e\u0000\u0000\u009e8\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"t\u0000\u0000\u00a0\u00a1\u0005r\u0000\u0000\u00a1\u00a2\u0005u\u0000"+
		"\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3:\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005f\u0000\u0000\u00a5\u00a6\u0005a\u0000\u0000\u00a6\u00a7\u0005"+
		"l\u0000\u0000\u00a7\u00a8\u0005s\u0000\u0000\u00a8\u00a9\u0005e\u0000"+
		"\u0000\u00a9<\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005b\u0000\u0000\u00ab"+
		"\u00ac\u0005r\u0000\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005"+
		"a\u0000\u0000\u00ae\u00af\u0005k\u0000\u0000\u00af>\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005c\u0000\u0000\u00b1\u00b2\u0005o\u0000\u0000\u00b2"+
		"\u00b3\u0005n\u0000\u0000\u00b3\u00b4\u0005t\u0000\u0000\u00b4\u00b5\u0005"+
		"i\u0000\u0000\u00b5\u00b6\u0005n\u0000\u0000\u00b6\u00b7\u0005u\u0000"+
		"\u0000\u00b7\u00b8\u0005e\u0000\u0000\u00b8@\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0007\u0000\u0000\u0000\u00baB\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0007\u0001\u0000\u0000\u00bcD\u0001\u0000\u0000\u0000\u00bd\u00c2\u0003"+
		"A \u0000\u00be\u00c1\u0003A \u0000\u00bf\u00c1\u0003C!\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3F\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c7\u0003C!\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9H\u0001\u0000\u0000\u0000"+
		"\u00ca\u00d0\u0005\"\u0000\u0000\u00cb\u00cf\b\u0002\u0000\u0000\u00cc"+
		"\u00cd\u0005\\\u0000\u0000\u00cd\u00cf\t\u0000\u0000\u0000\u00ce\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\"\u0000\u0000\u00d4J\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d7\u0007\u0003\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0006%\u0000\u0000\u00dbL\u0001\u0000\u0000"+
		"\u0000\u0007\u0000\u00c0\u00c2\u00c8\u00ce\u00d0\u00d8\u0001\u0006\u0000"+
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