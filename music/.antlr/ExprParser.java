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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, STRING=6, VAR_NAME=7, OPEN=8, 
		CLOSE=9, PLAY=10, SPACE=11, PROC_NAME=12, EQUALS=13, SETEQUALS=14, WHILE=15, 
		LESS_THAN=16, GREATER_THAN=17, IF=18, ELSE=19, NUM=20, PLUS=21, SUB=22, 
		POWER=23, DIV=24, MULT=25, WRITE=26, PROMPT=27, L_BRACE=28, R_BRACE=29, 
		CUT=30, APPEND=31, WS=32, NOTE_NAME=33;
	public static final int
		RULE_root = 0, RULE_proc_def = 1, RULE_proc_call = 2, RULE_expr_list = 3, 
		RULE_args_list = 4, RULE_instructions = 5, RULE_instruction = 6, RULE_assign = 7, 
		RULE_input = 8, RULE_output = 9, RULE_play = 10, RULE_if_else = 11, RULE_while_ = 12, 
		RULE_append = 13, RULE_cut = 14, RULE_list_ = 15, RULE_expr = 16, RULE_list_count = 17, 
		RULE_list_index = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "proc_def", "proc_call", "expr_list", "args_list", "instructions", 
			"instruction", "assign", "input", "output", "play", "if_else", "while_", 
			"append", "cut", "list_", "expr", "list_count", "list_index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'#'", null, null, "'|:'", "':|'", 
			"'(:)'", "' '", null, "'='", "'<-'", "'while'", "'<'", "'>'", "'if'", 
			"'else'", null, "'+'", "'-'", "'^'", "'/'", "'*'", "'<w>'", "'<?>'", 
			"'{'", "'}'", "'8<'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "STRING", "VAR_NAME", "OPEN", "CLOSE", 
			"PLAY", "SPACE", "PROC_NAME", "EQUALS", "SETEQUALS", "WHILE", "LESS_THAN", 
			"GREATER_THAN", "IF", "ELSE", "NUM", "PLUS", "SUB", "POWER", "DIV", "MULT", 
			"WRITE", "PROMPT", "L_BRACE", "R_BRACE", "CUT", "APPEND", "WS", "NOTE_NAME"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				proc_def();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROC_NAME );
			setState(43);
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
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(ExprParser.OPEN, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(ExprParser.CLOSE, 0); }
		public Proc_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_def; }
	}

	public final Proc_defContext proc_def() throws RecognitionException {
		Proc_defContext _localctx = new Proc_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proc_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PROC_NAME);
			setState(46);
			args_list();
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
			setState(52);
			expr_list();
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
		public List<TerminalNode> SPACE() { return getTokens(ExprParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ExprParser.SPACE, i);
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
			setState(54);
			expr(0);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(55);
				match(SPACE);
				setState(56);
				expr(0);
				}
				}
				setState(61);
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
		public List<TerminalNode> SPACE() { return getTokens(ExprParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(ExprParser.SPACE, i);
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
			setState(62);
			match(VAR_NAME);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(63);
				match(SPACE);
				setState(64);
				match(VAR_NAME);
				}
				}
				setState(69);
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_NAME) | (1L << PLAY) | (1L << PROC_NAME) | (1L << WHILE) | (1L << IF) | (1L << WRITE) | (1L << PROMPT) | (1L << CUT))) != 0)) {
				{
				{
				setState(70);
				instruction();
				}
				}
				setState(75);
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
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				output();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				play();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				proc_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				if_else();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
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
			setState(87);
			match(VAR_NAME);
			setState(88);
			match(SETEQUALS);
			setState(89);
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
			setState(91);
			match(PROMPT);
			setState(92);
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
			setState(94);
			match(WRITE);
			setState(95);
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
			setState(97);
			match(PLAY);
			setState(98);
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
			setState(100);
			match(IF);
			setState(101);
			expr(0);
			setState(102);
			match(OPEN);
			setState(103);
			instructions();
			setState(104);
			match(CLOSE);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(105);
				match(ELSE);
				setState(106);
				match(OPEN);
				setState(107);
				instructions();
				setState(108);
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
			setState(112);
			match(WHILE);
			setState(113);
			expr(0);
			setState(114);
			match(OPEN);
			setState(115);
			instructions();
			setState(116);
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
			setState(118);
			match(VAR_NAME);
			setState(119);
			match(APPEND);
			setState(120);
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
			setState(122);
			match(CUT);
			setState(123);
			match(VAR_NAME);
			setState(124);
			match(T__0);
			setState(125);
			expr(0);
			setState(126);
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
			setState(128);
			match(L_BRACE);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << STRING) | (1L << VAR_NAME) | (1L << NUM) | (1L << L_BRACE) | (1L << NOTE_NAME))) != 0)) {
				{
				{
				setState(129);
				expr(0);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
		public List_countContext list_count() {
			return getRuleContext(List_countContext.class,0);
		}
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
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(138);
				match(T__2);
				setState(139);
				expr(0);
				setState(140);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new NamevalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				_localctx = new ListvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				list_();
				}
				break;
			case 4:
				{
				_localctx = new CountContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				list_count();
				}
				break;
			case 5:
				{
				_localctx = new IndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				list_index();
				}
				break;
			case 6:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(NUM);
				}
				break;
			case 7:
				{
				_localctx = new NotenameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(NOTE_NAME);
				}
				break;
			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(152);
						match(POWER);
						setState(153);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(155);
						match(DIV);
						setState(156);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new MultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(158);
						match(MULT);
						setState(159);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(161);
						match(PLUS);
						setState(162);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(164);
						match(SUB);
						setState(165);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new LtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(167);
						match(LESS_THAN);
						setState(168);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new GtContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						match(GREATER_THAN);
						setState(171);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						match(EQUALS);
						setState(174);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class List_countContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public List_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_count; }
	}

	public final List_countContext list_count() throws RecognitionException {
		List_countContext _localctx = new List_countContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__4);
			setState(181);
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

	public static class List_indexContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(ExprParser.VAR_NAME, 0); }
		public List_Context list_() {
			return getRuleContext(List_Context.class,0);
		}
		public List_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_index; }
	}

	public final List_indexContext list_index() throws RecognitionException {
		List_indexContext _localctx = new List_indexContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				{
				setState(183);
				match(VAR_NAME);
				}
				break;
			case L_BRACE:
				{
				setState(184);
				list_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			match(T__0);
			setState(188);
			expr(0);
			setState(189);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6\7\6"+
		"D\n\6\f\6\16\6G\13\6\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rq\n\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\7\21\u0085\n\21\f\21\16\21\u0088\13\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0098\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b2\n\22\f\22\16"+
		"\22\u00b5\13\22\3\23\3\23\3\23\3\24\3\24\5\24\u00bc\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\2\3\"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2"+
		"\u00cc\2)\3\2\2\2\4/\3\2\2\2\6\65\3\2\2\2\b8\3\2\2\2\n@\3\2\2\2\fK\3\2"+
		"\2\2\16W\3\2\2\2\20Y\3\2\2\2\22]\3\2\2\2\24`\3\2\2\2\26c\3\2\2\2\30f\3"+
		"\2\2\2\32r\3\2\2\2\34x\3\2\2\2\36|\3\2\2\2 \u0082\3\2\2\2\"\u0097\3\2"+
		"\2\2$\u00b6\3\2\2\2&\u00bb\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2"+
		"\2\2+,\3\2\2\2,-\3\2\2\2-.\7\2\2\3.\3\3\2\2\2/\60\7\16\2\2\60\61\5\n\6"+
		"\2\61\62\7\n\2\2\62\63\5\f\7\2\63\64\7\13\2\2\64\5\3\2\2\2\65\66\7\16"+
		"\2\2\66\67\5\b\5\2\67\7\3\2\2\28=\5\"\22\29:\7\r\2\2:<\5\"\22\2;9\3\2"+
		"\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?=\3\2\2\2@E\7\t\2\2AB\7"+
		"\r\2\2BD\7\t\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\13\3\2\2\2G"+
		"E\3\2\2\2HJ\5\16\b\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2"+
		"\2MK\3\2\2\2NX\5\20\t\2OX\5\22\n\2PX\5\24\13\2QX\5\26\f\2RX\5\6\4\2SX"+
		"\5\30\r\2TX\5\32\16\2UX\5\34\17\2VX\5\36\20\2WN\3\2\2\2WO\3\2\2\2WP\3"+
		"\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\17"+
		"\3\2\2\2YZ\7\t\2\2Z[\7\20\2\2[\\\5\"\22\2\\\21\3\2\2\2]^\7\35\2\2^_\7"+
		"\t\2\2_\23\3\2\2\2`a\7\34\2\2ab\5\"\22\2b\25\3\2\2\2cd\7\f\2\2de\5\"\22"+
		"\2e\27\3\2\2\2fg\7\24\2\2gh\5\"\22\2hi\7\n\2\2ij\5\f\7\2jp\7\13\2\2kl"+
		"\7\25\2\2lm\7\n\2\2mn\5\f\7\2no\7\13\2\2oq\3\2\2\2pk\3\2\2\2pq\3\2\2\2"+
		"q\31\3\2\2\2rs\7\21\2\2st\5\"\22\2tu\7\n\2\2uv\5\f\7\2vw\7\13\2\2w\33"+
		"\3\2\2\2xy\7\t\2\2yz\7!\2\2z{\5\"\22\2{\35\3\2\2\2|}\7 \2\2}~\7\t\2\2"+
		"~\177\7\3\2\2\177\u0080\5\"\22\2\u0080\u0081\7\4\2\2\u0081\37\3\2\2\2"+
		"\u0082\u0086\7\36\2\2\u0083\u0085\5\"\22\2\u0084\u0083\3\2\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\37\2\2\u008a!\3\2\2\2\u008b\u008c\b\22\1"+
		"\2\u008c\u008d\7\5\2\2\u008d\u008e\5\"\22\2\u008e\u008f\7\6\2\2\u008f"+
		"\u0098\3\2\2\2\u0090\u0098\7\t\2\2\u0091\u0098\5 \21\2\u0092\u0098\5$"+
		"\23\2\u0093\u0098\5&\24\2\u0094\u0098\7\26\2\2\u0095\u0098\7#\2\2\u0096"+
		"\u0098\7\b\2\2\u0097\u008b\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2"+
		"\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u00b3\3\2\2\2\u0099\u009a\f\22"+
		"\2\2\u009a\u009b\7\31\2\2\u009b\u00b2\5\"\22\22\u009c\u009d\f\21\2\2\u009d"+
		"\u009e\7\32\2\2\u009e\u00b2\5\"\22\22\u009f\u00a0\f\20\2\2\u00a0\u00a1"+
		"\7\33\2\2\u00a1\u00b2\5\"\22\21\u00a2\u00a3\f\17\2\2\u00a3\u00a4\7\27"+
		"\2\2\u00a4\u00b2\5\"\22\20\u00a5\u00a6\f\16\2\2\u00a6\u00a7\7\30\2\2\u00a7"+
		"\u00b2\5\"\22\17\u00a8\u00a9\f\b\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00b2"+
		"\5\"\22\t\u00ab\u00ac\f\7\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00b2\5\"\22"+
		"\b\u00ae\u00af\f\6\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b2\5\"\22\7\u00b1"+
		"\u0099\3\2\2\2\u00b1\u009c\3\2\2\2\u00b1\u009f\3\2\2\2\u00b1\u00a2\3\2"+
		"\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1"+
		"\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4#\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8"+
		"\7\t\2\2\u00b8%\3\2\2\2\u00b9\u00bc\7\t\2\2\u00ba\u00bc\5 \21\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\3"+
		"\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7\4\2\2\u00c0\'\3\2\2\2\r+=EKWp"+
		"\u0086\u0097\u00b1\u00b3\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}