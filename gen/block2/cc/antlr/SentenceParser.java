// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block2/cc/antlr/Sentence.g4 by ANTLR 4.12.0
package block2.cc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SentenceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOUN=1, VERB=2, ADJECTIVE=3, ENDMARK=4, WS=5, TYPO=6;
	public static final int
		RULE_sentence = 0, RULE_subject = 1, RULE_object = 2, RULE_modifier = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "subject", "object", "modifier"
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

	@Override
	public String getGrammarFileName() { return "Sentence.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SentenceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public TerminalNode VERB() { return getToken(SentenceParser.VERB, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode ENDMARK() { return getToken(SentenceParser.ENDMARK, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentenceVisitor ) return ((SentenceVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			subject();
			setState(9);
			match(VERB);
			setState(10);
			object();
			setState(11);
			match(ENDMARK);
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
	public static class SubjectContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public TerminalNode NOUN() { return getToken(SentenceParser.NOUN, 0); }
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentenceVisitor ) return ((SentenceVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subject);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				modifier();
				setState(14);
				subject();
				}
				break;
			case NOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(NOUN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ObjectContext extends ParserRuleContext {
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode NOUN() { return getToken(SentenceParser.NOUN, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentenceVisitor ) return ((SentenceVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJECTIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				modifier();
				setState(20);
				object();
				}
				break;
			case NOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(NOUN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode ADJECTIVE() { return getToken(SentenceParser.ADJECTIVE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SentenceListener ) ((SentenceListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SentenceVisitor ) return ((SentenceVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(ADJECTIVE);
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
		"\u0004\u0001\u0006\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0018\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000\u0019\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004\u0017\u0001"+
		"\u0000\u0000\u0000\u0006\u0019\u0001\u0000\u0000\u0000\b\t\u0003\u0002"+
		"\u0001\u0000\t\n\u0005\u0002\u0000\u0000\n\u000b\u0003\u0004\u0002\u0000"+
		"\u000b\f\u0005\u0004\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0003\u0006\u0003\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f\u0012"+
		"\u0001\u0000\u0000\u0000\u0010\u0012\u0005\u0001\u0000\u0000\u0011\r\u0001"+
		"\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0003\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014\u0015\u0003"+
		"\u0004\u0002\u0000\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0018\u0005"+
		"\u0001\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\u0003\u0000\u0000\u001a\u0007\u0001\u0000\u0000\u0000\u0002\u0011\u0017";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}