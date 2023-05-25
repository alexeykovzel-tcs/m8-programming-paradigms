// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/tabular/Tabular.g4 by ANTLR 4.12.0
package block3.cc.tabular;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TabularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OPEN=5, CLOSE=6, DOLLAR=7, HASH=8, HAT=9, 
		UNDER=10, TILDE=11, PERCENT=12, ENTRY=13, TABLE_START=14, TABLE_END=15, 
		ROW_START=16, ROW_END=17, AND=18;
	public static final int
		RULE_program = 0, RULE_comment = 1, RULE_tabular = 2, RULE_row = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "comment", "tabular", "row"
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

	@Override
	public String getGrammarFileName() { return "Tabular.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TabularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<TabularContext> tabular() {
			return getRuleContexts(TabularContext.class);
		}
		public TabularContext tabular(int i) {
			return getRuleContext(TabularContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabularVisitor ) return ((TabularVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT || _la==TABLE_START) {
				{
				setState(10);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PERCENT:
					{
					setState(8);
					comment();
					}
					break;
				case TABLE_START:
					{
					setState(9);
					tabular();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(TabularParser.PERCENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabularVisitor ) return ((TabularVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(PERCENT);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 524284L) != 0)) {
				{
				{
				setState(16);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TabularContext extends ParserRuleContext {
		public TerminalNode TABLE_START() { return getToken(TabularParser.TABLE_START, 0); }
		public TerminalNode TABLE_END() { return getToken(TabularParser.TABLE_END, 0); }
		public TerminalNode OPEN() { return getToken(TabularParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(TabularParser.CLOSE, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public TabularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterTabular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitTabular(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabularVisitor ) return ((TabularVisitor<? extends T>)visitor).visitTabular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabularContext tabular() throws RecognitionException {
		TabularContext _localctx = new TabularContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tabular);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(TABLE_START);
			{
			setState(25);
			match(OPEN);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				{
				setState(26);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(CLOSE);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTRY || _la==ROW_START) {
				{
				{
				setState(34);
				row();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(TABLE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public List<TerminalNode> ENTRY() { return getTokens(TabularParser.ENTRY); }
		public TerminalNode ENTRY(int i) {
			return getToken(TabularParser.ENTRY, i);
		}
		public TerminalNode ROW_END() { return getToken(TabularParser.ROW_END, 0); }
		public TerminalNode ROW_START() { return getToken(TabularParser.ROW_START, 0); }
		public List<TerminalNode> AND() { return getTokens(TabularParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TabularParser.AND, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TabularListener ) ((TabularListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TabularVisitor ) return ((TabularVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW_START) {
				{
				setState(42);
				match(ROW_START);
				}
			}

			setState(45);
			match(ENTRY);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(46);
				match(AND);
				setState(47);
				match(ENTRY);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(ROW_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00128\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u000b\b\u0000\n\u0000\f\u0000\u000e\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b\u0002\n"+
		"\u0002\f\u0002\u001f\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0003\u0003,\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00031\b\u0003\n\u0003\f\u00034\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0002\u0001\u0000"+
		"\u0001\u0001\u0001\u0000\u0002\u0004:\u0000\f\u0001\u0000\u0000\u0000"+
		"\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000"+
		"\u0006+\u0001\u0000\u0000\u0000\b\u000b\u0003\u0002\u0001\u0000\t\u000b"+
		"\u0003\u0004\u0002\u0000\n\b\u0001\u0000\u0000\u0000\n\t\u0001\u0000\u0000"+
		"\u0000\u000b\u000e\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\f\u0001"+
		"\u0000\u0000\u0000\u000f\u0013\u0005\f\u0000\u0000\u0010\u0012\b\u0000"+
		"\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000"+
		"\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0003\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005\u000e\u0000\u0000\u0019\u001d\u0005\u0005"+
		"\u0000\u0000\u001a\u001c\u0007\u0001\u0000\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0006\u0000\u0000!"+
		"%\u0001\u0000\u0000\u0000\"$\u0003\u0006\u0003\u0000#\"\u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005"+
		"\u000f\u0000\u0000)\u0005\u0001\u0000\u0000\u0000*,\u0005\u0010\u0000"+
		"\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-2\u0005\r\u0000\u0000./\u0005\u0012\u0000\u0000/1\u0005\r"+
		"\u0000\u00000.\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000056\u0005\u0011\u0000\u00006\u0007\u0001\u0000"+
		"\u0000\u0000\u0007\n\f\u0013\u001d%+2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}