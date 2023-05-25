// Generated from /home/alexeykovzel/Projects/tcs/m8-programming-paradigms/src/block3/cc/antlr/TypedCalcAttr.g4 by ANTLR 4.12.0
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
public class TypedCalcAttrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIMES=1, PLUS=2, MINUS=3, LPAR=4, RPAR=5, NUMBER=6, STRING=7, BOOLEAN=8, 
		WS=9;
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
			null, "TIMES", "PLUS", "MINUS", "LPAR", "RPAR", "NUMBER", "STRING", "BOOLEAN", 
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

	@Override
	public String getGrammarFileName() { return "TypedCalcAttr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private Type getType(Type type1, Type type2) {
	        return (type1 == type2) ? type1 : Type.ERR;
	    }

	public TypedCalcAttrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Type type;
		public ExprContext e0;
		public ExprContext e;
		public ExprContext e1;
		public TerminalNode MINUS() { return getToken(TypedCalcAttrParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(TypedCalcAttrParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(TypedCalcAttrParser.RPAR, 0); }
		public TerminalNode NUMBER() { return getToken(TypedCalcAttrParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(TypedCalcAttrParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(TypedCalcAttrParser.BOOLEAN, 0); }
		public TerminalNode TIMES() { return getToken(TypedCalcAttrParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(TypedCalcAttrParser.PLUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypedCalcAttrListener ) ((TypedCalcAttrListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypedCalcAttrListener ) ((TypedCalcAttrListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TypedCalcAttrVisitor ) return ((TypedCalcAttrVisitor<? extends T>)visitor).visitExpr(this);
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
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(3);
				match(MINUS);
				setState(4);
				((ExprContext)_localctx).e = expr(5);
				 ((ExprContext)_localctx).type =  (((ExprContext)_localctx).e.type == Type.NUM) ? Type.NUM : Type.ERR; 
				}
				break;
			case LPAR:
				{
				setState(7);
				match(LPAR);
				setState(8);
				((ExprContext)_localctx).e = expr(0);
				setState(9);
				match(RPAR);
				 ((ExprContext)_localctx).type =  ((ExprContext)_localctx).e.type; 
				}
				break;
			case NUMBER:
				{
				setState(12);
				match(NUMBER);
				 ((ExprContext)_localctx).type =  Type.NUM; 
				}
				break;
			case STRING:
				{
				setState(14);
				match(STRING);
				 ((ExprContext)_localctx).type =  Type.STR; 
				}
				break;
			case BOOLEAN:
				{
				setState(16);
				match(BOOLEAN);
				 ((ExprContext)_localctx).type =  Type.BOOL; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(20);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(21);
						match(TIMES);
						setState(22);
						((ExprContext)_localctx).e1 = expr(8);
						 ((ExprContext)_localctx).type =  getType(((ExprContext)_localctx).e0.type, ((ExprContext)_localctx).e1.type); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(25);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(26);
						match(PLUS);
						setState(27);
						((ExprContext)_localctx).e1 = expr(7);
						 ((ExprContext)_localctx).type =  getType(((ExprContext)_localctx).e0.type, ((ExprContext)_localctx).e1.type); 
						}
						break;
					}
					} 
				}
				setState(34);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t$\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000"+
		"\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000(\u0000\u0012\u0001"+
		"\u0000\u0000\u0000\u0002\u0003\u0006\u0000\uffff\uffff\u0000\u0003\u0004"+
		"\u0005\u0003\u0000\u0000\u0004\u0005\u0003\u0000\u0000\u0005\u0005\u0006"+
		"\u0006\u0000\uffff\uffff\u0000\u0006\u0013\u0001\u0000\u0000\u0000\u0007"+
		"\b\u0005\u0004\u0000\u0000\b\t\u0003\u0000\u0000\u0000\t\n\u0005\u0005"+
		"\u0000\u0000\n\u000b\u0006\u0000\uffff\uffff\u0000\u000b\u0013\u0001\u0000"+
		"\u0000\u0000\f\r\u0005\u0006\u0000\u0000\r\u0013\u0006\u0000\uffff\uffff"+
		"\u0000\u000e\u000f\u0005\u0007\u0000\u0000\u000f\u0013\u0006\u0000\uffff"+
		"\uffff\u0000\u0010\u0011\u0005\b\u0000\u0000\u0011\u0013\u0006\u0000\uffff"+
		"\uffff\u0000\u0012\u0002\u0001\u0000\u0000\u0000\u0012\u0007\u0001\u0000"+
		"\u0000\u0000\u0012\f\u0001\u0000\u0000\u0000\u0012\u000e\u0001\u0000\u0000"+
		"\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013 \u0001\u0000\u0000\u0000"+
		"\u0014\u0015\n\u0007\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016"+
		"\u0017\u0003\u0000\u0000\b\u0017\u0018\u0006\u0000\uffff\uffff\u0000\u0018"+
		"\u001f\u0001\u0000\u0000\u0000\u0019\u001a\n\u0006\u0000\u0000\u001a\u001b"+
		"\u0005\u0002\u0000\u0000\u001b\u001c\u0003\u0000\u0000\u0007\u001c\u001d"+
		"\u0006\u0000\uffff\uffff\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e"+
		"\u0014\u0001\u0000\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001f"+
		"\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\u0003\u0012\u001e ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}