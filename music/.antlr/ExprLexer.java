// Generated from c:\workspace\antlr_test\music\Expr.g by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WHILE=6, PLAY=7, OPEN=8, CLOSE=9, 
		WRITE=10, PROMPT=11, CUT=12, APPEND=13, SETEQUALS=14, LESS_THAN=15, GREATER_THAN=16, 
		STRING=17, VAR_NAME=18, COMMA=19, PROC_NAME=20, EQUALS=21, IF=22, ELSE=23, 
		NUM=24, PLUS=25, SUB=26, POWER=27, DIV=28, MULT=29, L_BRACE=30, R_BRACE=31, 
		NOTE_NAME=32, WHITESPACE=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WHILE", "PLAY", "OPEN", "CLOSE", 
			"WRITE", "PROMPT", "CUT", "APPEND", "SETEQUALS", "LESS_THAN", "GREATER_THAN", 
			"STRING", "VAR_NAME", "COMMA", "PROC_NAME", "EQUALS", "IF", "ELSE", "NUM", 
			"PLUS", "SUB", "POWER", "DIV", "MULT", "L_BRACE", "R_BRACE", "NOTE_NAME", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'#'", "'while'", "'(:)'", "'|:'", 
			"':|'", "'<w>'", "'<?>'", "'8<'", "'<<'", "'<-'", "'<'", "'>'", null, 
			null, "','", null, "'='", "'if'", "'else'", null, "'+'", "'-'", "'^'", 
			"'/'", "'*'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WHILE", "PLAY", "OPEN", "CLOSE", 
			"WRITE", "PROMPT", "CUT", "APPEND", "SETEQUALS", "LESS_THAN", "GREATER_THAN", 
			"STRING", "VAR_NAME", "COMMA", "PROC_NAME", "EQUALS", "IF", "ELSE", "NUM", 
			"PLUS", "SUB", "POWER", "DIV", "MULT", "L_BRACE", "R_BRACE", "NOTE_NAME", 
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\7\22w\n\22\f\22\16\22z\13\22\3\22\3\22\3\23\6\23\177\n"+
		"\23\r\23\16\23\u0080\3\24\3\24\3\25\3\25\7\25\u0087\n\25\f\25\16\25\u008a"+
		"\13\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u0097"+
		"\n\31\r\31\16\31\u0098\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\5!\u00ab\n!\3\"\6\"\u00ae\n\"\r\"\16\"\u00af"+
		"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#\3\2\t\4\2C\\c|\3\2c|\3\2C\\\5\2C\\aac|\3\2\62"+
		";\3\2CI\5\2\13\f\17\17\"\"\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2"+
		"\rO\3\2\2\2\17U\3\2\2\2\21Y\3\2\2\2\23\\\3\2\2\2\25_\3\2\2\2\27c\3\2\2"+
		"\2\31g\3\2\2\2\33j\3\2\2\2\35m\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2"+
		"%~\3\2\2\2\'\u0082\3\2\2\2)\u0084\3\2\2\2+\u008b\3\2\2\2-\u008d\3\2\2"+
		"\2/\u0090\3\2\2\2\61\u0096\3\2\2\2\63\u009a\3\2\2\2\65\u009c\3\2\2\2\67"+
		"\u009e\3\2\2\29\u00a0\3\2\2\2;\u00a2\3\2\2\2=\u00a4\3\2\2\2?\u00a6\3\2"+
		"\2\2A\u00a8\3\2\2\2C\u00ad\3\2\2\2EF\7]\2\2F\4\3\2\2\2GH\7_\2\2H\6\3\2"+
		"\2\2IJ\7*\2\2J\b\3\2\2\2KL\7+\2\2L\n\3\2\2\2MN\7%\2\2N\f\3\2\2\2OP\7y"+
		"\2\2PQ\7j\2\2QR\7k\2\2RS\7n\2\2ST\7g\2\2T\16\3\2\2\2UV\7*\2\2VW\7<\2\2"+
		"WX\7+\2\2X\20\3\2\2\2YZ\7~\2\2Z[\7<\2\2[\22\3\2\2\2\\]\7<\2\2]^\7~\2\2"+
		"^\24\3\2\2\2_`\7>\2\2`a\7y\2\2ab\7@\2\2b\26\3\2\2\2cd\7>\2\2de\7A\2\2"+
		"ef\7@\2\2f\30\3\2\2\2gh\7:\2\2hi\7>\2\2i\32\3\2\2\2jk\7>\2\2kl\7>\2\2"+
		"l\34\3\2\2\2mn\7>\2\2no\7/\2\2o\36\3\2\2\2pq\7>\2\2q \3\2\2\2rs\7@\2\2"+
		"s\"\3\2\2\2tx\7$\2\2uw\t\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y{\3\2\2\2zx\3\2\2\2{|\7$\2\2|$\3\2\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081&\3\2\2\2\u0082\u0083"+
		"\7.\2\2\u0083(\3\2\2\2\u0084\u0088\t\4\2\2\u0085\u0087\t\5\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"*\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7?\2\2\u008c,\3\2\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7h\2\2\u008f.\3\2\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\60\3\2\2\2\u0095"+
		"\u0097\t\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\62\3\2\2\2\u009a\u009b\7-\2\2\u009b\64"+
		"\3\2\2\2\u009c\u009d\7/\2\2\u009d\66\3\2\2\2\u009e\u009f\7`\2\2\u009f"+
		"8\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1:\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3"+
		"<\3\2\2\2\u00a4\u00a5\7}\2\2\u00a5>\3\2\2\2\u00a6\u00a7\7\177\2\2\u00a7"+
		"@\3\2\2\2\u00a8\u00aa\t\7\2\2\u00a9\u00ab\t\6\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00abB\3\2\2\2\u00ac\u00ae\t\b\2\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\b\"\2\2\u00b2D\3\2\2\2\t\2x\u0080\u0088\u0098"+
		"\u00aa\u00af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}