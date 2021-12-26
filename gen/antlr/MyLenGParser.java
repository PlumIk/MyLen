// Generated from /home/alex/Prog/Jaba/MyLen/src/main/java/antlr/MyLenG.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLenGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, NEQ=2, GT=3, LT=4, PLUS=5, MINUS=6, MULT=7, DIV=8, SCOL=9, ASSIGN=10, 
		OPAR=11, CPAR=12, OBRACE=13, CBRACE=14, IF=15, WHILE=16, LOG=17, ID=18, 
		INT=19, STRING=20, COMMENT=21, SPACE=22;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_assignment = 2, RULE_stat = 3, RULE_procedure = 4, 
		RULE_if_state = 5, RULE_while_state = 6, RULE_condition_block = 7, RULE_log_block = 8, 
		RULE_print = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "assignment", "stat", "procedure", "if_state", "while_state", 
			"condition_block", "log_block", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'!='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "';'", 
			"'='", "'('", "')'", "'{'", "'}'", "'if'", "'while'", "'log'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "NEQ", "GT", "LT", "PLUS", "MINUS", "MULT", "DIV", "SCOL", 
			"ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "IF", "WHILE", "LOG", "ID", 
			"INT", "STRING", "COMMENT", "SPACE"
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
	public String getGrammarFileName() { return "MyLenG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLenGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyLenGParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			block();
			setState(21);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << ID))) != 0)) {
				{
				{
				setState(23);
				stat();
				}
				}
				setState(28);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token s1;
		public List<TerminalNode> ID() { return getTokens(MyLenGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLenGParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(MyLenGParser.ASSIGN, 0); }
		public TerminalNode SCOL() { return getToken(MyLenGParser.SCOL, 0); }
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public TerminalNode INT() { return getToken(MyLenGParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MyLenGParser.STRING, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(ID);
			setState(30);
			match(ASSIGN);
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				{
				setState(31);
				procedure();
				}
				}
				break;
			case 2:
				{
				setState(32);
				((AssignmentContext)_localctx).s1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << STRING))) != 0)) ) {
					((AssignmentContext)_localctx).s1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(35);
			match(SCOL);
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

	public static class StatContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_stateContext if_state() {
			return getRuleContext(If_stateContext.class,0);
		}
		public While_stateContext while_state() {
			return getRuleContext(While_stateContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				if_state();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				while_state();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				print();
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

	public static class ProcedureContext extends ParserRuleContext {
		public Token s1;
		public Token op;
		public Token s2;
		public List<TerminalNode> ID() { return getTokens(MyLenGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLenGParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MyLenGParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MyLenGParser.INT, i);
		}
		public TerminalNode PLUS() { return getToken(MyLenGParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyLenGParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(MyLenGParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MyLenGParser.DIV, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((ProcedureContext)_localctx).s1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((ProcedureContext)_localctx).s1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(44);
			((ProcedureContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
				((ProcedureContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(45);
			((ProcedureContext)_localctx).s2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((ProcedureContext)_localctx).s2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class If_stateContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyLenGParser.IF, 0); }
		public TerminalNode OPAR() { return getToken(MyLenGParser.OPAR, 0); }
		public Log_blockContext log_block() {
			return getRuleContext(Log_blockContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MyLenGParser.CPAR, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public If_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterIf_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitIf_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitIf_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stateContext if_state() throws RecognitionException {
		If_stateContext _localctx = new If_stateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IF);
			setState(48);
			match(OPAR);
			setState(49);
			log_block();
			setState(50);
			match(CPAR);
			setState(51);
			condition_block();
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

	public static class While_stateContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyLenGParser.WHILE, 0); }
		public TerminalNode OPAR() { return getToken(MyLenGParser.OPAR, 0); }
		public Log_blockContext log_block() {
			return getRuleContext(Log_blockContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MyLenGParser.CPAR, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterWhile_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitWhile_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitWhile_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stateContext while_state() throws RecognitionException {
		While_stateContext _localctx = new While_stateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(WHILE);
			setState(54);
			match(OPAR);
			setState(55);
			log_block();
			setState(56);
			match(CPAR);
			setState(57);
			condition_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(MyLenGParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MyLenGParser.CBRACE, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(OBRACE);
			setState(60);
			block();
			setState(61);
			match(CBRACE);
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

	public static class Log_blockContext extends ParserRuleContext {
		public Token s1;
		public Token op;
		public Token s2;
		public List<TerminalNode> ID() { return getTokens(MyLenGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLenGParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(MyLenGParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MyLenGParser.INT, i);
		}
		public TerminalNode EQ() { return getToken(MyLenGParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MyLenGParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(MyLenGParser.GT, 0); }
		public TerminalNode LT() { return getToken(MyLenGParser.LT, 0); }
		public Log_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterLog_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitLog_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitLog_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_blockContext log_block() throws RecognitionException {
		Log_blockContext _localctx = new Log_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_log_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((Log_blockContext)_localctx).s1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((Log_blockContext)_localctx).s1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(64);
			((Log_blockContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT))) != 0)) ) {
				((Log_blockContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			((Log_blockContext)_localctx).s2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((Log_blockContext)_localctx).s2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrintContext extends ParserRuleContext {
		public Token s;
		public TerminalNode LOG() { return getToken(MyLenGParser.LOG, 0); }
		public TerminalNode OPAR() { return getToken(MyLenGParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(MyLenGParser.CPAR, 0); }
		public TerminalNode SCOL() { return getToken(MyLenGParser.SCOL, 0); }
		public TerminalNode INT() { return getToken(MyLenGParser.INT, 0); }
		public TerminalNode ID() { return getToken(MyLenGParser.ID, 0); }
		public TerminalNode STRING() { return getToken(MyLenGParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLenGListener ) ((MyLenGListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLenGVisitor ) return ((MyLenGVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LOG);
			setState(68);
			match(OPAR);
			setState(69);
			((PrintContext)_localctx).s = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << STRING))) != 0)) ) {
				((PrintContext)_localctx).s = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			match(CPAR);
			setState(71);
			match(SCOL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\3\4\3\4\5\4$\n\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\24\26\3"+
		"\2\24\25\3\2\7\n\3\2\3\6\2F\2\26\3\2\2\2\4\34\3\2\2\2\6\37\3\2\2\2\b+"+
		"\3\2\2\2\n-\3\2\2\2\f\61\3\2\2\2\16\67\3\2\2\2\20=\3\2\2\2\22A\3\2\2\2"+
		"\24E\3\2\2\2\26\27\5\4\3\2\27\30\7\2\2\3\30\3\3\2\2\2\31\33\5\b\5\2\32"+
		"\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\5\3\2\2\2\36"+
		"\34\3\2\2\2\37 \7\24\2\2 #\7\f\2\2!$\5\n\6\2\"$\t\2\2\2#!\3\2\2\2#\"\3"+
		"\2\2\2$%\3\2\2\2%&\7\13\2\2&\7\3\2\2\2\',\5\6\4\2(,\5\f\7\2),\5\16\b\2"+
		"*,\5\24\13\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\t\3\2\2\2-.\t\3"+
		"\2\2./\t\4\2\2/\60\t\3\2\2\60\13\3\2\2\2\61\62\7\21\2\2\62\63\7\r\2\2"+
		"\63\64\5\22\n\2\64\65\7\16\2\2\65\66\5\20\t\2\66\r\3\2\2\2\678\7\22\2"+
		"\289\7\r\2\29:\5\22\n\2:;\7\16\2\2;<\5\20\t\2<\17\3\2\2\2=>\7\17\2\2>"+
		"?\5\4\3\2?@\7\20\2\2@\21\3\2\2\2AB\t\3\2\2BC\t\5\2\2CD\t\3\2\2D\23\3\2"+
		"\2\2EF\7\23\2\2FG\7\r\2\2GH\t\2\2\2HI\7\16\2\2IJ\7\13\2\2J\25\3\2\2\2"+
		"\5\34#+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}