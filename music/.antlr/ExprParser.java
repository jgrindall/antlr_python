// Generated from c:\workspace\antlr_test\music\Expr.g by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WHILE=6, IF=7, ELSE=8, PLAY=9, 
		OPEN=10, CLOSE=11, WRITE=12, PROMPT=13, CUT=14, APPEND=15, SETEQUALS=16, 
		LESS_THAN=17, GREATER_THAN=18, STRING=19, VAR_NAME=20, COMMA=21, EQUALS=22, 
		NUM=23, PLUS=24, SUB=25, POWER=26, DIV=27, MULT=28, L_BRACE=29, R_BRACE=30, 
		NOTE_NAME=31, PROC_NAME=32, WHITESPACE=33;
	public static final int
		RULE_root = 0, RULE_proc_def = 1, RULE_proc_call = 2, RULE_expr_list = 3, 
		RULE_args_list = 4, RULE_instructions = 5, RULE_instruction = 6, RULE_assign = 7, 
		RULE_input = 8, RULE_output = 9, RULE_play = 10, RULE_if_else = 11, RULE_while_ = 12, 
		RULE_append = 13, RULE_cut = 14, RULE_list_ = 15, RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "proc_def", "proc_call", "expr_list", "args_list", "instructions", 
			"instruction", "assign", "input", "output", "play", "if_else", "while_", 
			"append", "cut", "list_", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'#'", "'while'", "'if'", "'else'", 
			"'(:)'", "'|:'", "':|'", "'<w>'", "'<?>'", "'8<'", "'<<'", "'<-'", "'<'", 
			"'>'", null, null, "','", "'='", null, "'+'", "'-'", "'^'", "'/'", "'*'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WHILE", "IF", "ELSE", "PLAY", "OPEN", 
			"CLOSE", "WRITE", "PROMPT", "CUT", "APPEND", "SETEQUALS", "LESS_THAN", 
			"GREATER_THAN", "STRING", "VAR_NAME", "COMMA", "EQUALS", "NUM", "PLUS", 
			"SUB", "POWER", "DIV", "MULT", "L_BRACE", "R_BRACE", "NOTE_NAME", "PROC_NAME", 
			"WHITESPACE"
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
	public String getGrammarFileName() { return "Expr.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<Proc_defContext> proc_def() {
			return getRuleContexts(Proc_defContext.class);
		}
		public Proc_defContext proc_def(int i) {
			return getRuleContext(Proc_defContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					proc_def();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(40);
			instructions();
			setState(41);
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

	public static class Proc_defContext extends ParserRuleContext {
		public TerminalNode PROC_NAME() { return getToken(ExprParser.PROC_NAME, 0); }
		public TerminalNode OPEN() { return getToken(ExprParser.OPEN, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ExprParser.CLOSE, 0); }
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public Proc_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_def; }
	}

	public final Proc_defContext proc_def() throws RecognitionException {
		Proc_defContext _localctx = new Proc_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proc_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(PROC_NAME);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_NAME) {
				{
				setState(44);
				args_list();
				}
			}

			setState(47);
			match(OPEN);
			setState(48);
			instructions();
			setState(49);
			match(CLOSE);
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

	public static class Proc_callContext extends ParserRuleContext {
		public TerminalNode PROC_NAME() { return getToken(ExprParser.PROC_NAME, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PROC_NAME);
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(52);
				expr_list();
				}
				break;
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			expr(0);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(56);
				match(COMMA);
				setState(57);
				expr(0);
				}
				}
				setState(62);
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

	public static class Args_listContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(ExprParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(ExprParser.VAR_NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExprParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExprParser.COMMA, i);
		}
		public Args_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_list; }
	}

	public final Args_listContext args_list() throws RecognitionException {
		Args_listContext _localctx = new Args_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(VAR_NAME);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(64);
				match(COMMA);
				setState(65);
				match(VAR_NAME);
				}
				}
				setState(70);
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

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << PLAY) | (1L << WRITE) | (1L << PROMPT) | (1L << CUT) | (1L << VAR_NAME) | (1L << PROC_NAME))) != 0)) {
				{
				{
				setState(71);
				instruction();
				}
				}
				setState(76);
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

	public static class InstructionContext extends ParserRuleContext {
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public PlayContext play() {
			return getRuleContext(PlayContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public CutContext cut() {
			return getRuleContext(CutContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				while_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				if_else();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				input();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				output();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				play();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				proc_call();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				cut();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public TerminalNode SETEQUALS() { return getToken(ExprParser.SETEQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(VAR_NAME);
			setState(89);
			match(SETEQUALS);
			setState(90);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode PROMPT() { return getToken(ExprParser.PROMPT, 0); }
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PROMPT);
			setState(93);
			match(VAR_NAME);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(ExprParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(WRITE);
			setState(96);
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

	public static class PlayContext extends ParserRuleContext {
		public TerminalNode PLAY() { return getToken(ExprParser.PLAY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PlayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play; }
	}

	public final PlayContext play() throws RecognitionException {
		PlayContext _localctx = new PlayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_play);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(PLAY);
			setState(99);
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ExprParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> OPEN() { return getTokens(ExprParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(ExprParser.OPEN, i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(ExprParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(ExprParser.CLOSE, i);
		}
		public TerminalNode ELSE() { return getToken(ExprParser.ELSE, 0); }
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IF);
			setState(102);
			expr(0);
			setState(103);
			match(OPEN);
			setState(104);
			instructions();
			setState(105);
			match(CLOSE);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(106);
				match(ELSE);
				setState(107);
				match(OPEN);
				setState(108);
				instructions();
				setState(109);
				match(CLOSE);
				}
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ExprParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(ExprParser.OPEN, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ExprParser.CLOSE, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(WHILE);
			setState(114);
			expr(0);
			setState(115);
			match(OPEN);
			setState(116);
			instructions();
			setState(117);
			match(CLOSE);
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

	public static class AppendContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public TerminalNode APPEND() { return getToken(ExprParser.APPEND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VAR_NAME);
			setState(120);
			match(APPEND);
			setState(121);
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

	public static class CutContext extends ParserRuleContext {
		public TerminalNode CUT() { return getToken(ExprParser.CUT, 0); }
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cut; }
	}

	public final CutContext cut() throws RecognitionException {
		CutContext _localctx = new CutContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CUT);
			setState(124);
			match(VAR_NAME);
			setState(125);
			match(T__0);
			setState(126);
			expr(0);
			setState(127);
			match(T__1);
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

	public static class List_Context extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(ExprParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(ExprParser.R_BRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_; }
	}

	public final List_Context list_() throws RecognitionException {
		List_Context _localctx = new List_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_list_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(L_BRACE);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << STRING) | (1L << VAR_NAME) | (1L << NUM) | (1L << L_BRACE) | (1L << NOTE_NAME))) != 0)) {
				{
				{
				setState(130);
				expr(0);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(R_BRACE);
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
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ExprParser.PLUS, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(ExprParser.SUB, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(ExprParser.MULT, 0); }
		public MultContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CountContext extends ExprContext {
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public CountContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(ExprParser.LESS_THAN, 0); }
		public LtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IndexContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class GtContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(ExprParser.GREATER_THAN, 0); }
		public GtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ExprParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotenameContext extends ExprContext {
		public TerminalNode NOTE_NAME() { return getToken(ExprParser.NOTE_NAME, 0); }
		public NotenameContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NamevalContext extends ExprContext {
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public NamevalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualsContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(ExprParser.EQUALS, 0); }
		public EqualsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ListvalContext extends ExprContext {
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public ListvalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(ExprParser.POWER, 0); }
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BracketedContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketedContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				match(T__2);
				setState(140);
				expr(0);
				setState(141);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new NamevalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				_localctx = new ListvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				list_();
				}
				break;
			case 4:
				{
				_localctx = new CountContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(T__4);
				setState(146);
				match(VAR_NAME);
				}
				break;
			case 5:
				{
				_localctx = new IndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_NAME:
					{
					setState(147);
					match(VAR_NAME);
					}
					break;
				case L_BRACE:
					{
					setState(148);
					list_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151);
				match(T__0);
				setState(152);
				expr(0);
				setState(153);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(NUM);
				}
				break;
			case 7:
				{
				_localctx = new NotenameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(NOTE_NAME);
				}
				break;
			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(161);
						match(POWER);
						setState(162);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(164);
						match(DIV);
						setState(165);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(167);
						match(MULT);
						setState(168);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(170);
						match(PLUS);
						setState(171);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(173);
						match(SUB);
						setState(174);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(176);
						match(LESS_THAN);
						setState(177);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new GtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						match(GREATER_THAN);
						setState(180);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						match(EQUALS);
						setState(183);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\3\3\3\5\3\60\n\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\5\48\n\4\3\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3"+
		"\6\7\6E\n\6\f\6\16\6H\13\6\3\7\7\7K\n\7\f\7\16\7N\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\7\21\u0086\n\21\f\21\16\21\u0089\13\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0098\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a1\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u00bb\n\22\f\22\16\22\u00be\13\22\3\22"+
		"\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00ce\2\'\3"+
		"\2\2\2\4-\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nA\3\2\2\2\fL\3\2\2\2\16X\3"+
		"\2\2\2\20Z\3\2\2\2\22^\3\2\2\2\24a\3\2\2\2\26d\3\2\2\2\30g\3\2\2\2\32"+
		"s\3\2\2\2\34y\3\2\2\2\36}\3\2\2\2 \u0083\3\2\2\2\"\u00a0\3\2\2\2$&\5\4"+
		"\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+"+
		"\5\f\7\2+,\7\2\2\3,\3\3\2\2\2-/\7\"\2\2.\60\5\n\6\2/.\3\2\2\2/\60\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\7\f\2\2\62\63\5\f\7\2\63\64\7\r\2\2\64\5\3\2"+
		"\2\2\65\67\7\"\2\2\668\5\b\5\2\67\66\3\2\2\2\678\3\2\2\28\7\3\2\2\29>"+
		"\5\"\22\2:;\7\27\2\2;=\5\"\22\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2"+
		"\2?\t\3\2\2\2@>\3\2\2\2AF\7\26\2\2BC\7\27\2\2CE\7\26\2\2DB\3\2\2\2EH\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3\2\2\2IK\5\16\b\2JI\3\2\2\2"+
		"KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\r\3\2\2\2NL\3\2\2\2OY\5\32\16\2PY\5\30"+
		"\r\2QY\5\20\t\2RY\5\22\n\2SY\5\24\13\2TY\5\26\f\2UY\5\6\4\2VY\5\34\17"+
		"\2WY\5\36\20\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2"+
		"\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\17\3\2\2\2Z[\7\26\2\2[\\\7\22\2\2"+
		"\\]\5\"\22\2]\21\3\2\2\2^_\7\17\2\2_`\7\26\2\2`\23\3\2\2\2ab\7\16\2\2"+
		"bc\5\"\22\2c\25\3\2\2\2de\7\13\2\2ef\5\"\22\2f\27\3\2\2\2gh\7\t\2\2hi"+
		"\5\"\22\2ij\7\f\2\2jk\5\f\7\2kq\7\r\2\2lm\7\n\2\2mn\7\f\2\2no\5\f\7\2"+
		"op\7\r\2\2pr\3\2\2\2ql\3\2\2\2qr\3\2\2\2r\31\3\2\2\2st\7\b\2\2tu\5\"\22"+
		"\2uv\7\f\2\2vw\5\f\7\2wx\7\r\2\2x\33\3\2\2\2yz\7\26\2\2z{\7\21\2\2{|\5"+
		"\"\22\2|\35\3\2\2\2}~\7\20\2\2~\177\7\26\2\2\177\u0080\7\3\2\2\u0080\u0081"+
		"\5\"\22\2\u0081\u0082\7\4\2\2\u0082\37\3\2\2\2\u0083\u0087\7\37\2\2\u0084"+
		"\u0086\5\"\22\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7 \2\2\u008b!\3\2\2\2\u008c\u008d\b\22\1\2\u008d\u008e\7\5\2\2"+
		"\u008e\u008f\5\"\22\2\u008f\u0090\7\6\2\2\u0090\u00a1\3\2\2\2\u0091\u00a1"+
		"\7\26\2\2\u0092\u00a1\5 \21\2\u0093\u0094\7\7\2\2\u0094\u00a1\7\26\2\2"+
		"\u0095\u0098\7\26\2\2\u0096\u0098\5 \21\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\3\2\2\u009a\u009b\5\"\22\2"+
		"\u009b\u009c\7\4\2\2\u009c\u00a1\3\2\2\2\u009d\u00a1\7\31\2\2\u009e\u00a1"+
		"\7!\2\2\u009f\u00a1\7\25\2\2\u00a0\u008c\3\2\2\2\u00a0\u0091\3\2\2\2\u00a0"+
		"\u0092\3\2\2\2\u00a0\u0093\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00bc\3\2\2\2\u00a2"+
		"\u00a3\f\22\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00bb\5\"\22\22\u00a5\u00a6"+
		"\f\21\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00bb\5\"\22\22\u00a8\u00a9\f\20"+
		"\2\2\u00a9\u00aa\7\36\2\2\u00aa\u00bb\5\"\22\21\u00ab\u00ac\f\17\2\2\u00ac"+
		"\u00ad\7\32\2\2\u00ad\u00bb\5\"\22\20\u00ae\u00af\f\16\2\2\u00af\u00b0"+
		"\7\33\2\2\u00b0\u00bb\5\"\22\17\u00b1\u00b2\f\b\2\2\u00b2\u00b3\7\23\2"+
		"\2\u00b3\u00bb\5\"\22\t\u00b4\u00b5\f\7\2\2\u00b5\u00b6\7\24\2\2\u00b6"+
		"\u00bb\5\"\22\b\u00b7\u00b8\f\6\2\2\u00b8\u00b9\7\30\2\2\u00b9\u00bb\5"+
		"\"\22\7\u00ba\u00a2\3\2\2\2\u00ba\u00a5\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba"+
		"\u00ab\3\2\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b4\3\2"+
		"\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd#\3\2\2\2\u00be\u00bc\3\2\2\2\17\'/\67>FLXq\u0087"+
		"\u0097\u00a0\u00ba\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}