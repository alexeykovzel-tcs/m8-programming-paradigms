// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block5/cc/pascal/SimplePascal.g4 by ANTLR 4.12.0
package block5.cc.pascal;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimplePascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, BEGIN=2, BOOLEAN=3, INTEGER=4, DO=5, ELSE=6, END=7, EXIT=8, FALSE=9, 
		FUNC=10, IF=11, IN=12, THEN=13, NOT=14, OR=15, OUT=16, PROC=17, PROGRAM=18, 
		TRUE=19, VAR=20, WHILE=21, ASS=22, COLON=23, COMMA=24, DOT=25, DQUOTE=26, 
		EQ=27, GE=28, GT=29, LE=30, LBRACE=31, LPAR=32, LT=33, MINUS=34, NE=35, 
		PLUS=36, RBRACE=37, RPAR=38, SEMI=39, SLASH=40, STAR=41, ID=42, NUM=43, 
		STR=44, COMMENT=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "BEGIN", "BOOLEAN", "INTEGER", "DO", "ELSE", "END", "EXIT", "FALSE", 
			"FUNC", "IF", "IN", "THEN", "NOT", "OR", "OUT", "PROC", "PROGRAM", "TRUE", 
			"VAR", "WHILE", "ASS", "COLON", "COMMA", "DOT", "DQUOTE", "EQ", "GE", 
			"GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "NE", "PLUS", "RBRACE", 
			"RPAR", "SEMI", "SLASH", "STAR", "ID", "NUM", "STR", "LETTER", "DIGIT", 
			"COMMENT", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "':='", "':'", 
			"','", "'.'", "'\"'", "'='", "'>='", "'>'", "'<='", "'{'", "'('", "'<'", 
			"'-'", "'<>'", "'+'", "'}'", "')'", "';'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "BEGIN", "BOOLEAN", "INTEGER", "DO", "ELSE", "END", "EXIT", 
			"FALSE", "FUNC", "IF", "IN", "THEN", "NOT", "OR", "OUT", "PROC", "PROGRAM", 
			"TRUE", "VAR", "WHILE", "ASS", "COLON", "COMMA", "DOT", "DQUOTE", "EQ", 
			"GE", "GT", "LE", "LBRACE", "LPAR", "LT", "MINUS", "NE", "PLUS", "RBRACE", 
			"RPAR", "SEMI", "SLASH", "STAR", "ID", "NUM", "STR", "COMMENT", "WS"
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


	public SimplePascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimplePascal.g4"; }

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
		"\u0004\u0000.\u0194\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0005)\u0136\b)\n"+
		")\f)\u0139\t)\u0001*\u0001*\u0005*\u013d\b*\n*\f*\u0140\t*\u0001+\u0001"+
		"+\u0005+\u0144\b+\n+\f+\u0147\t+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001.\u0001.\u0005.\u0151\b.\n.\f.\u0154\t.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0004/\u015b\b/\u000b/\f/\u015c\u0001/\u0001/\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u00015\u0001"+
		"6\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001"+
		";\u0001;\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001"+
		"@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001"+
		"E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0002"+
		"\u0145\u0152\u0000J\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y\u0000[\u0000]-_.a\u0000c\u0000e\u0000"+
		"g\u0000i\u0000k\u0000m\u0000o\u0000q\u0000s\u0000u\u0000w\u0000y\u0000"+
		"{\u0000}\u0000\u007f\u0000\u0081\u0000\u0083\u0000\u0085\u0000\u0087\u0000"+
		"\u0089\u0000\u008b\u0000\u008d\u0000\u008f\u0000\u0091\u0000\u0093\u0000"+
		"\u0001\u0000\u001d\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0002\u0000AAaa\u0002\u0000BBbb\u0002\u0000CCcc\u0002\u0000DDdd\u0002"+
		"\u0000EEee\u0002\u0000FFff\u0002\u0000GGgg\u0002\u0000HHhh\u0002\u0000"+
		"IIii\u0002\u0000JJjj\u0002\u0000KKkk\u0002\u0000LLll\u0002\u0000MMmm\u0002"+
		"\u0000NNnn\u0002\u0000OOoo\u0002\u0000PPpp\u0002\u0000QQqq\u0002\u0000"+
		"RRrr\u0002\u0000SSss\u0002\u0000TTtt\u0002\u0000UUuu\u0002\u0000VVvv\u0002"+
		"\u0000WWww\u0002\u0000XXxx\u0002\u0000YYyy\u0002\u0000ZZzz\u017d\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000]"+
		"\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0001\u0095\u0001"+
		"\u0000\u0000\u0000\u0003\u0099\u0001\u0000\u0000\u0000\u0005\u009f\u0001"+
		"\u0000\u0000\u0000\u0007\u00a7\u0001\u0000\u0000\u0000\t\u00af\u0001\u0000"+
		"\u0000\u0000\u000b\u00b2\u0001\u0000\u0000\u0000\r\u00b7\u0001\u0000\u0000"+
		"\u0000\u000f\u00bb\u0001\u0000\u0000\u0000\u0011\u00c0\u0001\u0000\u0000"+
		"\u0000\u0013\u00c6\u0001\u0000\u0000\u0000\u0015\u00cf\u0001\u0000\u0000"+
		"\u0000\u0017\u00d2\u0001\u0000\u0000\u0000\u0019\u00d5\u0001\u0000\u0000"+
		"\u0000\u001b\u00da\u0001\u0000\u0000\u0000\u001d\u00de\u0001\u0000\u0000"+
		"\u0000\u001f\u00e1\u0001\u0000\u0000\u0000!\u00e5\u0001\u0000\u0000\u0000"+
		"#\u00ef\u0001\u0000\u0000\u0000%\u00f7\u0001\u0000\u0000\u0000\'\u00fc"+
		"\u0001\u0000\u0000\u0000)\u0100\u0001\u0000\u0000\u0000+\u0106\u0001\u0000"+
		"\u0000\u0000-\u0109\u0001\u0000\u0000\u0000/\u010b\u0001\u0000\u0000\u0000"+
		"1\u010d\u0001\u0000\u0000\u00003\u010f\u0001\u0000\u0000\u00005\u0111"+
		"\u0001\u0000\u0000\u00007\u0113\u0001\u0000\u0000\u00009\u0116\u0001\u0000"+
		"\u0000\u0000;\u0118\u0001\u0000\u0000\u0000=\u011b\u0001\u0000\u0000\u0000"+
		"?\u011d\u0001\u0000\u0000\u0000A\u011f\u0001\u0000\u0000\u0000C\u0121"+
		"\u0001\u0000\u0000\u0000E\u0123\u0001\u0000\u0000\u0000G\u0126\u0001\u0000"+
		"\u0000\u0000I\u0128\u0001\u0000\u0000\u0000K\u012a\u0001\u0000\u0000\u0000"+
		"M\u012c\u0001\u0000\u0000\u0000O\u012e\u0001\u0000\u0000\u0000Q\u0130"+
		"\u0001\u0000\u0000\u0000S\u0132\u0001\u0000\u0000\u0000U\u013a\u0001\u0000"+
		"\u0000\u0000W\u0141\u0001\u0000\u0000\u0000Y\u014a\u0001\u0000\u0000\u0000"+
		"[\u014c\u0001\u0000\u0000\u0000]\u014e\u0001\u0000\u0000\u0000_\u015a"+
		"\u0001\u0000\u0000\u0000a\u0160\u0001\u0000\u0000\u0000c\u0162\u0001\u0000"+
		"\u0000\u0000e\u0164\u0001\u0000\u0000\u0000g\u0166\u0001\u0000\u0000\u0000"+
		"i\u0168\u0001\u0000\u0000\u0000k\u016a\u0001\u0000\u0000\u0000m\u016c"+
		"\u0001\u0000\u0000\u0000o\u016e\u0001\u0000\u0000\u0000q\u0170\u0001\u0000"+
		"\u0000\u0000s\u0172\u0001\u0000\u0000\u0000u\u0174\u0001\u0000\u0000\u0000"+
		"w\u0176\u0001\u0000\u0000\u0000y\u0178\u0001\u0000\u0000\u0000{\u017a"+
		"\u0001\u0000\u0000\u0000}\u017c\u0001\u0000\u0000\u0000\u007f\u017e\u0001"+
		"\u0000\u0000\u0000\u0081\u0180\u0001\u0000\u0000\u0000\u0083\u0182\u0001"+
		"\u0000\u0000\u0000\u0085\u0184\u0001\u0000\u0000\u0000\u0087\u0186\u0001"+
		"\u0000\u0000\u0000\u0089\u0188\u0001\u0000\u0000\u0000\u008b\u018a\u0001"+
		"\u0000\u0000\u0000\u008d\u018c\u0001\u0000\u0000\u0000\u008f\u018e\u0001"+
		"\u0000\u0000\u0000\u0091\u0190\u0001\u0000\u0000\u0000\u0093\u0192\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0003a0\u0000\u0096\u0097\u0003{=\u0000"+
		"\u0097\u0098\u0003g3\u0000\u0098\u0002\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0003c1\u0000\u009a\u009b\u0003i4\u0000\u009b\u009c\u0003m6\u0000\u009c"+
		"\u009d\u0003q8\u0000\u009d\u009e\u0003{=\u0000\u009e\u0004\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0003c1\u0000\u00a0\u00a1\u0003}>\u0000\u00a1"+
		"\u00a2\u0003}>\u0000\u00a2\u00a3\u0003w;\u0000\u00a3\u00a4\u0003i4\u0000"+
		"\u00a4\u00a5\u0003a0\u0000\u00a5\u00a6\u0003{=\u0000\u00a6\u0006\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0003q8\u0000\u00a8\u00a9\u0003{=\u0000"+
		"\u00a9\u00aa\u0003\u0087C\u0000\u00aa\u00ab\u0003i4\u0000\u00ab\u00ac"+
		"\u0003m6\u0000\u00ac\u00ad\u0003i4\u0000\u00ad\u00ae\u0003\u0083A\u0000"+
		"\u00ae\b\u0001\u0000\u0000\u0000\u00af\u00b0\u0003g3\u0000\u00b0\u00b1"+
		"\u0003}>\u0000\u00b1\n\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003i4\u0000"+
		"\u00b3\u00b4\u0003w;\u0000\u00b4\u00b5\u0003\u0085B\u0000\u00b5\u00b6"+
		"\u0003i4\u0000\u00b6\f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003i4\u0000"+
		"\u00b8\u00b9\u0003{=\u0000\u00b9\u00ba\u0003g3\u0000\u00ba\u000e\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0003i4\u0000\u00bc\u00bd\u0003\u008fG"+
		"\u0000\u00bd\u00be\u0003q8\u0000\u00be\u00bf\u0003\u0087C\u0000\u00bf"+
		"\u0010\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003k5\u0000\u00c1\u00c2\u0003"+
		"a0\u0000\u00c2\u00c3\u0003w;\u0000\u00c3\u00c4\u0003\u0085B\u0000\u00c4"+
		"\u00c5\u0003i4\u0000\u00c5\u0012\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003"+
		"k5\u0000\u00c7\u00c8\u0003\u0089D\u0000\u00c8\u00c9\u0003{=\u0000\u00c9"+
		"\u00ca\u0003e2\u0000\u00ca\u00cb\u0003\u0087C\u0000\u00cb\u00cc\u0003"+
		"q8\u0000\u00cc\u00cd\u0003}>\u0000\u00cd\u00ce\u0003{=\u0000\u00ce\u0014"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003q8\u0000\u00d0\u00d1\u0003k"+
		"5\u0000\u00d1\u0016\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003q8\u0000"+
		"\u00d3\u00d4\u0003{=\u0000\u00d4\u0018\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0003\u0087C\u0000\u00d6\u00d7\u0003o7\u0000\u00d7\u00d8\u0003i4\u0000"+
		"\u00d8\u00d9\u0003{=\u0000\u00d9\u001a\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0003{=\u0000\u00db\u00dc\u0003}>\u0000\u00dc\u00dd\u0003\u0087C\u0000"+
		"\u00dd\u001c\u0001\u0000\u0000\u0000\u00de\u00df\u0003}>\u0000\u00df\u00e0"+
		"\u0003\u0083A\u0000\u00e0\u001e\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003"+
		"}>\u0000\u00e2\u00e3\u0003\u0089D\u0000\u00e3\u00e4\u0003\u0087C\u0000"+
		"\u00e4 \u0001\u0000\u0000\u0000\u00e5\u00e6\u0003\u007f?\u0000\u00e6\u00e7"+
		"\u0003\u0083A\u0000\u00e7\u00e8\u0003}>\u0000\u00e8\u00e9\u0003e2\u0000"+
		"\u00e9\u00ea\u0003i4\u0000\u00ea\u00eb\u0003g3\u0000\u00eb\u00ec\u0003"+
		"\u0089D\u0000\u00ec\u00ed\u0003\u0083A\u0000\u00ed\u00ee\u0003i4\u0000"+
		"\u00ee\"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003\u007f?\u0000\u00f0"+
		"\u00f1\u0003\u0083A\u0000\u00f1\u00f2\u0003}>\u0000\u00f2\u00f3\u0003"+
		"m6\u0000\u00f3\u00f4\u0003\u0083A\u0000\u00f4\u00f5\u0003a0\u0000\u00f5"+
		"\u00f6\u0003y<\u0000\u00f6$\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003"+
		"\u0087C\u0000\u00f8\u00f9\u0003\u0083A\u0000\u00f9\u00fa\u0003\u0089D"+
		"\u0000\u00fa\u00fb\u0003i4\u0000\u00fb&\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0003\u008bE\u0000\u00fd\u00fe\u0003a0\u0000\u00fe\u00ff\u0003"+
		"\u0083A\u0000\u00ff(\u0001\u0000\u0000\u0000\u0100\u0101\u0003\u008dF"+
		"\u0000\u0101\u0102\u0003o7\u0000\u0102\u0103\u0003q8\u0000\u0103\u0104"+
		"\u0003w;\u0000\u0104\u0105\u0003i4\u0000\u0105*\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005:\u0000\u0000\u0107\u0108\u0005=\u0000\u0000\u0108,"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005:\u0000\u0000\u010a.\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005,\u0000\u0000\u010c0\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0005.\u0000\u0000\u010e2\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005\"\u0000\u0000\u01104\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"=\u0000\u0000\u01126\u0001\u0000\u0000\u0000\u0113\u0114\u0005>\u0000"+
		"\u0000\u0114\u0115\u0005=\u0000\u0000\u01158\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005>\u0000\u0000\u0117:\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"<\u0000\u0000\u0119\u011a\u0005=\u0000\u0000\u011a<\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005{\u0000\u0000\u011c>\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0005(\u0000\u0000\u011e@\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"<\u0000\u0000\u0120B\u0001\u0000\u0000\u0000\u0121\u0122\u0005-\u0000"+
		"\u0000\u0122D\u0001\u0000\u0000\u0000\u0123\u0124\u0005<\u0000\u0000\u0124"+
		"\u0125\u0005>\u0000\u0000\u0125F\u0001\u0000\u0000\u0000\u0126\u0127\u0005"+
		"+\u0000\u0000\u0127H\u0001\u0000\u0000\u0000\u0128\u0129\u0005}\u0000"+
		"\u0000\u0129J\u0001\u0000\u0000\u0000\u012a\u012b\u0005)\u0000\u0000\u012b"+
		"L\u0001\u0000\u0000\u0000\u012c\u012d\u0005;\u0000\u0000\u012dN\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0005/\u0000\u0000\u012fP\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005*\u0000\u0000\u0131R\u0001\u0000\u0000\u0000\u0132"+
		"\u0137\u0003Y,\u0000\u0133\u0136\u0003Y,\u0000\u0134\u0136\u0003[-\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138T\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u013a\u013e\u0003[-\u0000\u013b\u013d\u0003"+
		"[-\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000"+
		"\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013fV\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0141\u0145\u00033\u0019\u0000\u0142\u0144\t\u0000\u0000\u0000\u0143"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146"+
		"\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u00033\u0019\u0000\u0149X\u0001\u0000\u0000\u0000\u014a\u014b\u0007"+
		"\u0000\u0000\u0000\u014bZ\u0001\u0000\u0000\u0000\u014c\u014d\u0007\u0001"+
		"\u0000\u0000\u014d\\\u0001\u0000\u0000\u0000\u014e\u0152\u0003=\u001e"+
		"\u0000\u014f\u0151\t\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000"+
		"\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0156\u0003I$\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0006.\u0000\u0000\u0158^\u0001\u0000"+
		"\u0000\u0000\u0159\u015b\u0007\u0002\u0000\u0000\u015a\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0006/\u0000\u0000\u015f`\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0007\u0003\u0000\u0000\u0161b\u0001\u0000\u0000\u0000\u0162"+
		"\u0163\u0007\u0004\u0000\u0000\u0163d\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0007\u0005\u0000\u0000\u0165f\u0001\u0000\u0000\u0000\u0166\u0167\u0007"+
		"\u0006\u0000\u0000\u0167h\u0001\u0000\u0000\u0000\u0168\u0169\u0007\u0007"+
		"\u0000\u0000\u0169j\u0001\u0000\u0000\u0000\u016a\u016b\u0007\b\u0000"+
		"\u0000\u016bl\u0001\u0000\u0000\u0000\u016c\u016d\u0007\t\u0000\u0000"+
		"\u016dn\u0001\u0000\u0000\u0000\u016e\u016f\u0007\n\u0000\u0000\u016f"+
		"p\u0001\u0000\u0000\u0000\u0170\u0171\u0007\u000b\u0000\u0000\u0171r\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0007\f\u0000\u0000\u0173t\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0007\r\u0000\u0000\u0175v\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0007\u000e\u0000\u0000\u0177x\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0007\u000f\u0000\u0000\u0179z\u0001\u0000\u0000\u0000\u017a"+
		"\u017b\u0007\u0010\u0000\u0000\u017b|\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0007\u0011\u0000\u0000\u017d~\u0001\u0000\u0000\u0000\u017e\u017f\u0007"+
		"\u0012\u0000\u0000\u017f\u0080\u0001\u0000\u0000\u0000\u0180\u0181\u0007"+
		"\u0013\u0000\u0000\u0181\u0082\u0001\u0000\u0000\u0000\u0182\u0183\u0007"+
		"\u0014\u0000\u0000\u0183\u0084\u0001\u0000\u0000\u0000\u0184\u0185\u0007"+
		"\u0015\u0000\u0000\u0185\u0086\u0001\u0000\u0000\u0000\u0186\u0187\u0007"+
		"\u0016\u0000\u0000\u0187\u0088\u0001\u0000\u0000\u0000\u0188\u0189\u0007"+
		"\u0017\u0000\u0000\u0189\u008a\u0001\u0000\u0000\u0000\u018a\u018b\u0007"+
		"\u0018\u0000\u0000\u018b\u008c\u0001\u0000\u0000\u0000\u018c\u018d\u0007"+
		"\u0019\u0000\u0000\u018d\u008e\u0001\u0000\u0000\u0000\u018e\u018f\u0007"+
		"\u001a\u0000\u0000\u018f\u0090\u0001\u0000\u0000\u0000\u0190\u0191\u0007"+
		"\u001b\u0000\u0000\u0191\u0092\u0001\u0000\u0000\u0000\u0192\u0193\u0007"+
		"\u001c\u0000\u0000\u0193\u0094\u0001\u0000\u0000\u0000\u0007\u0000\u0135"+
		"\u0137\u013e\u0145\u0152\u015c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}