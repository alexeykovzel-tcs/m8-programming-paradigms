// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/antlr/CalcAttr.g4 by ANTLR 4.12.0
package block3.cc.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalcAttrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIMES=1, PLUS=2, MINUS=3, LPAR=4, RPAR=5, NUMBER=6, WS=7;
	public static final int
		RULE_expr = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIMES", "PLUS", "MINUS", "LPAR", "RPAR", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "CalcAttr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int getValue(String text) {
	        return Integer.parseInt(text);
	    }

	public CalcAttrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public int val;
		public ExprContext e0;
		public ExprContext e;
		public Token NUMBER;
		public ExprContext e1;
		public TerminalNode MINUS() { return getToken(CalcAttrParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(CalcAttrParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcAttrParser.RPAR, 0); }
		public TerminalNode NUMBER() { return getToken(CalcAttrParser.NUMBER, 0); }
		public TerminalNode TIMES() { return getToken(CalcAttrParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(CalcAttrParser.PLUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcAttrListener ) ((CalcAttrListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcAttrListener ) ((CalcAttrListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalcAttrVisitor ) return ((CalcAttrVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				 System.out.println("Evaluating MINUS"); 
				setState(4);
				match(MINUS);
				setState(5);
				((ExprContext)_localctx).e = expr(3);
				 ((ExprContext)_localctx).val =  - ((ExprContext)_localctx).e.val; 
				}
				break;
			case LPAR:
				{
				 System.out.println("Evaluating PARENS"); 
				setState(9);
				match(LPAR);
				setState(10);
				((ExprContext)_localctx).e = expr(0);
				setState(11);
				match(RPAR);
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).e.val; 
				}
				break;
			case NUMBER:
				{
				 System.out.println("Evaluating NUMBER"); 
				setState(15);
				((ExprContext)_localctx).NUMBER = match(NUMBER);
				 ((ExprContext)_localctx).val =  getValue((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(19);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(20);
						match(TIMES);
						setState(21);
						((ExprContext)_localctx).e1 = expr(6);
						 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).e0.val * ((ExprContext)_localctx).e1.val; 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(24);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(25);
						match(PLUS);
						setState(26);
						((ExprContext)_localctx).e1 = expr(5);
						 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).e0.val + ((ExprContext)_localctx).e1.val; 
						}
						break;
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0007#\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001e\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0000"+
		"\u0000\u0001\u0000\u0001\u0000\u0000\u0000%\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0002\u0003\u0006\u0000\uffff\uffff\u0000\u0003\u0004\u0006\u0000"+
		"\uffff\uffff\u0000\u0004\u0005\u0005\u0003\u0000\u0000\u0005\u0006\u0003"+
		"\u0000\u0000\u0003\u0006\u0007\u0006\u0000\uffff\uffff\u0000\u0007\u0012"+
		"\u0001\u0000\u0000\u0000\b\t\u0006\u0000\uffff\uffff\u0000\t\n\u0005\u0004"+
		"\u0000\u0000\n\u000b\u0003\u0000\u0000\u0000\u000b\f\u0005\u0005\u0000"+
		"\u0000\f\r\u0006\u0000\uffff\uffff\u0000\r\u0012\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0006\u0000\uffff\uffff\u0000\u000f\u0010\u0005\u0006\u0000"+
		"\u0000\u0010\u0012\u0006\u0000\uffff\uffff\u0000\u0011\u0002\u0001\u0000"+
		"\u0000\u0000\u0011\b\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000\u0000"+
		"\u0000\u0012\u001f\u0001\u0000\u0000\u0000\u0013\u0014\n\u0005\u0000\u0000"+
		"\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0003\u0000\u0000\u0006"+
		"\u0016\u0017\u0006\u0000\uffff\uffff\u0000\u0017\u001e\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\n\u0004\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000"+
		"\u001a\u001b\u0003\u0000\u0000\u0005\u001b\u001c\u0006\u0000\uffff\uffff"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u0013\u0001\u0000\u0000"+
		"\u0000\u001d\u0018\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0001"+
		"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\u0003\u0011\u001d"+
		"\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}