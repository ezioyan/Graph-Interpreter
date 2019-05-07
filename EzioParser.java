// Generated from /Users/ezio/IdeaProjects/MyInterpreter/src/Ezio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EzioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, DIV=3, MUL=4, POWER=5, SEMICO=6, L_BRACKET=7, R_BRACKET=8, 
		COMMA=9, ID=10, CONST_ID=11, SIN=12, COS=13, TAN=14, LN=15, EXP=16, SQRT=17, 
		ORIGIN=18, SCALE=19, ROT=20, IS=21, COLOR=22, TO=23, STEP=24, DRAW=25, 
		FOR=26, FROM=27, T1=28, RED=29, BLACK=30, YELLOW=31, GREEN=32, BLUE=33, 
		WS=34, COMMENT=35, ErrText=36;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_originStatement = 2, RULE_scaleStatement = 3, 
		RULE_rotStatement = 4, RULE_colorStatement = 5, RULE_forStatement = 6, 
		RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "originStatement", "scaleStatement", "rotStatement", 
			"colorStatement", "forStatement", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'/'", "'*'", "'**'", "';'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", 
			"R_BRACKET", "COMMA", "ID", "CONST_ID", "SIN", "COS", "TAN", "LN", "EXP", 
			"SQRT", "ORIGIN", "SCALE", "ROT", "IS", "COLOR", "TO", "STEP", "DRAW", 
			"FOR", "FROM", "T1", "RED", "BLACK", "YELLOW", "GREEN", "BLUE", "WS", 
			"COMMENT", "ErrText"
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
	public String getGrammarFileName() { return "Ezio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EzioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EzioParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICO() { return getTokens(EzioParser.SEMICO); }
		public TerminalNode SEMICO(int i) {
			return getToken(EzioParser.SEMICO, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORIGIN) | (1L << SCALE) | (1L << ROT) | (1L << COLOR) | (1L << FOR))) != 0)) {
				{
				{
				setState(16);
				statement();
				setState(17);
				match(SEMICO);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public OriginStatementContext originStatement() {
			return getRuleContext(OriginStatementContext.class,0);
		}
		public ScaleStatementContext scaleStatement() {
			return getRuleContext(ScaleStatementContext.class,0);
		}
		public RotStatementContext rotStatement() {
			return getRuleContext(RotStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ColorStatementContext colorStatement() {
			return getRuleContext(ColorStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				originStatement();
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				scaleStatement();
				}
				break;
			case ROT:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				rotStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				forStatement();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				colorStatement();
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

	public static class OriginStatementContext extends ParserRuleContext {
		public TerminalNode ORIGIN() { return getToken(EzioParser.ORIGIN, 0); }
		public TerminalNode IS() { return getToken(EzioParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(EzioParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(EzioParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(EzioParser.R_BRACKET, 0); }
		public OriginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterOriginStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitOriginStatement(this);
		}
	}

	public final OriginStatementContext originStatement() throws RecognitionException {
		OriginStatementContext _localctx = new OriginStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_originStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ORIGIN);
			setState(34);
			match(IS);
			setState(35);
			match(L_BRACKET);
			setState(36);
			expr(0);
			setState(37);
			match(COMMA);
			setState(38);
			expr(0);
			setState(39);
			match(R_BRACKET);
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

	public static class ScaleStatementContext extends ParserRuleContext {
		public TerminalNode SCALE() { return getToken(EzioParser.SCALE, 0); }
		public TerminalNode IS() { return getToken(EzioParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(EzioParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(EzioParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(EzioParser.R_BRACKET, 0); }
		public ScaleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterScaleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitScaleStatement(this);
		}
	}

	public final ScaleStatementContext scaleStatement() throws RecognitionException {
		ScaleStatementContext _localctx = new ScaleStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scaleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SCALE);
			setState(42);
			match(IS);
			setState(43);
			match(L_BRACKET);
			setState(44);
			expr(0);
			setState(45);
			match(COMMA);
			setState(46);
			expr(0);
			setState(47);
			match(R_BRACKET);
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

	public static class RotStatementContext extends ParserRuleContext {
		public TerminalNode ROT() { return getToken(EzioParser.ROT, 0); }
		public TerminalNode IS() { return getToken(EzioParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterRotStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitRotStatement(this);
		}
	}

	public final RotStatementContext rotStatement() throws RecognitionException {
		RotStatementContext _localctx = new RotStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rotStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ROT);
			setState(50);
			match(IS);
			setState(51);
			expr(0);
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

	public static class ColorStatementContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(EzioParser.COLOR, 0); }
		public TerminalNode IS() { return getToken(EzioParser.IS, 0); }
		public TerminalNode RED() { return getToken(EzioParser.RED, 0); }
		public TerminalNode BLACK() { return getToken(EzioParser.BLACK, 0); }
		public TerminalNode YELLOW() { return getToken(EzioParser.YELLOW, 0); }
		public TerminalNode GREEN() { return getToken(EzioParser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(EzioParser.BLUE, 0); }
		public TerminalNode L_BRACKET() { return getToken(EzioParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EzioParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EzioParser.COMMA, i);
		}
		public TerminalNode R_BRACKET() { return getToken(EzioParser.R_BRACKET, 0); }
		public ColorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterColorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitColorStatement(this);
		}
	}

	public final ColorStatementContext colorStatement() throws RecognitionException {
		ColorStatementContext _localctx = new ColorStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_colorStatement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(COLOR);
				setState(54);
				match(IS);
				setState(55);
				match(RED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(COLOR);
				setState(57);
				match(IS);
				setState(58);
				match(BLACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(COLOR);
				setState(60);
				match(IS);
				setState(61);
				match(YELLOW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(COLOR);
				setState(63);
				match(IS);
				setState(64);
				match(GREEN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(COLOR);
				setState(66);
				match(IS);
				setState(67);
				match(BLUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				match(COLOR);
				setState(69);
				match(IS);
				setState(70);
				match(L_BRACKET);
				setState(71);
				expr(0);
				setState(72);
				match(COMMA);
				setState(73);
				expr(0);
				setState(74);
				match(COMMA);
				setState(75);
				expr(0);
				setState(76);
				match(R_BRACKET);
				}
				break;
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(EzioParser.FOR, 0); }
		public TerminalNode T1() { return getToken(EzioParser.T1, 0); }
		public TerminalNode FROM() { return getToken(EzioParser.FROM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(EzioParser.TO, 0); }
		public TerminalNode STEP() { return getToken(EzioParser.STEP, 0); }
		public TerminalNode DRAW() { return getToken(EzioParser.DRAW, 0); }
		public TerminalNode L_BRACKET() { return getToken(EzioParser.L_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(EzioParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(EzioParser.R_BRACKET, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(FOR);
			setState(81);
			match(T1);
			setState(82);
			match(FROM);
			setState(83);
			expr(0);
			setState(84);
			match(TO);
			setState(85);
			expr(0);
			setState(86);
			match(STEP);
			setState(87);
			expr(0);
			setState(88);
			match(DRAW);
			setState(89);
			match(L_BRACKET);
			setState(90);
			expr(0);
			setState(91);
			match(COMMA);
			setState(92);
			expr(0);
			setState(93);
			match(R_BRACKET);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(EzioParser.POWER, 0); }
		public PowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitPowerExpr(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(EzioParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(EzioParser.DIV, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitMulDivExpr(this);
		}
	}
	public static class VarTContext extends ExprContext {
		public TerminalNode T1() { return getToken(EzioParser.T1, 0); }
		public VarTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterVarT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitVarT(this);
		}
	}
	public static class ConstContext extends ExprContext {
		public TerminalNode CONST_ID() { return getToken(EzioParser.CONST_ID, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitConst(this);
		}
	}
	public static class PlusMinusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(EzioParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EzioParser.MINUS, 0); }
		public PlusMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterPlusMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitPlusMinusExpr(this);
		}
	}
	public static class NestedExprContext extends ExprContext {
		public TerminalNode L_BRACKET() { return getToken(EzioParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(EzioParser.R_BRACKET, 0); }
		public NestedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitNestedExpr(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(EzioParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EzioParser.MINUS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitUnaryExpr(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(EzioParser.ID, 0); }
		public TerminalNode L_BRACKET() { return getToken(EzioParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(EzioParser.R_BRACKET, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EzioListener ) ((EzioListener)listener).exitFuncExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				expr(7);
				}
				break;
			case CONST_ID:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(CONST_ID);
				}
				break;
			case T1:
				{
				_localctx = new VarTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(T1);
				}
				break;
			case ID:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(ID);
				setState(101);
				match(L_BRACKET);
				setState(102);
				expr(0);
				setState(103);
				match(R_BRACKET);
				}
				break;
			case L_BRACKET:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(L_BRACKET);
				setState(106);
				expr(0);
				setState(107);
				match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(112);
						match(POWER);
						setState(113);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(118);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t{\n"+
		"\t\f\t\16\t~\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\4\3\2\3\4\3\2\5\6\2"+
		"\u0088\2\27\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b+\3\2\2\2\n\63\3\2\2\2\fP\3"+
		"\2\2\2\16R\3\2\2\2\20o\3\2\2\2\22\23\5\4\3\2\23\24\7\b\2\2\24\26\3\2\2"+
		"\2\25\22\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2"+
		"\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\"\5\6\4\2\35\"\5\b\5\2"+
		"\36\"\5\n\6\2\37\"\5\16\b\2 \"\5\f\7\2!\34\3\2\2\2!\35\3\2\2\2!\36\3\2"+
		"\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\24\2\2$%\7\27\2\2%&\7\t\2\2"+
		"&\'\5\20\t\2\'(\7\13\2\2()\5\20\t\2)*\7\n\2\2*\7\3\2\2\2+,\7\25\2\2,-"+
		"\7\27\2\2-.\7\t\2\2./\5\20\t\2/\60\7\13\2\2\60\61\5\20\t\2\61\62\7\n\2"+
		"\2\62\t\3\2\2\2\63\64\7\26\2\2\64\65\7\27\2\2\65\66\5\20\t\2\66\13\3\2"+
		"\2\2\678\7\30\2\289\7\27\2\29Q\7\37\2\2:;\7\30\2\2;<\7\27\2\2<Q\7 \2\2"+
		"=>\7\30\2\2>?\7\27\2\2?Q\7!\2\2@A\7\30\2\2AB\7\27\2\2BQ\7\"\2\2CD\7\30"+
		"\2\2DE\7\27\2\2EQ\7#\2\2FG\7\30\2\2GH\7\27\2\2HI\7\t\2\2IJ\5\20\t\2JK"+
		"\7\13\2\2KL\5\20\t\2LM\7\13\2\2MN\5\20\t\2NO\7\n\2\2OQ\3\2\2\2P\67\3\2"+
		"\2\2P:\3\2\2\2P=\3\2\2\2P@\3\2\2\2PC\3\2\2\2PF\3\2\2\2Q\r\3\2\2\2RS\7"+
		"\34\2\2ST\7\36\2\2TU\7\35\2\2UV\5\20\t\2VW\7\31\2\2WX\5\20\t\2XY\7\32"+
		"\2\2YZ\5\20\t\2Z[\7\33\2\2[\\\7\t\2\2\\]\5\20\t\2]^\7\13\2\2^_\5\20\t"+
		"\2_`\7\n\2\2`\17\3\2\2\2ab\b\t\1\2bc\t\2\2\2cp\5\20\t\tdp\7\r\2\2ep\7"+
		"\36\2\2fg\7\f\2\2gh\7\t\2\2hi\5\20\t\2ij\7\n\2\2jp\3\2\2\2kl\7\t\2\2l"+
		"m\5\20\t\2mn\7\n\2\2np\3\2\2\2oa\3\2\2\2od\3\2\2\2oe\3\2\2\2of\3\2\2\2"+
		"ok\3\2\2\2p|\3\2\2\2qr\f\n\2\2rs\7\7\2\2s{\5\20\t\ntu\f\b\2\2uv\t\3\2"+
		"\2v{\5\20\t\twx\f\7\2\2xy\t\2\2\2y{\5\20\t\bzq\3\2\2\2zt\3\2\2\2zw\3\2"+
		"\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~|\3\2\2\2\b\27!Poz|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}