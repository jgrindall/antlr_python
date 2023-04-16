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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WHILE=6, IF=7, ELSE=8, PLAY=9, 
		OPEN=10, CLOSE=11, WRITE=12, PROMPT=13, CUT=14, APPEND=15, SETEQUALS=16, 
		IS_EQUAL=17, IS_NOT_EQUAL=18, LESS_THAN=19, GREATER_THAN=20, STRING=21, 
		VAR_NAME=22, COMMA=23, EQUALS=24, NUM=25, PLUS=26, SUB=27, POWER=28, DIV=29, 
		MULT=30, L_BRACE=31, R_BRACE=32, NOTE_NAME=33, PROC_NAME=34, WHITESPACE=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WHILE", "IF", "ELSE", "PLAY", 
			"OPEN", "CLOSE", "WRITE", "PROMPT", "CUT", "APPEND", "SETEQUALS", "IS_EQUAL", 
			"IS_NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "STRING", "VAR_NAME", "COMMA", 
			"EQUALS", "NUM", "PLUS", "SUB", "POWER", "DIV", "MULT", "L_BRACE", "R_BRACE", 
			"NOTE_NAME", "PROC_NAME", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'#'", "'while'", "'if'", "'else'", 
			"'(:)'", "'|:'", "':|'", "'<w>'", "'<?>'", "'8<'", "'<<'", "'<-'", "'=='", 
			"'/='", "'<'", "'>'", null, null, "','", "'='", null, "'+'", "'-'", "'^'", 
			"'/'", "'*'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WHILE", "IF", "ELSE", "PLAY", "OPEN", 
			"CLOSE", "WRITE", "PROMPT", "CUT", "APPEND", "SETEQUALS", "IS_EQUAL", 
			"IS_NOT_EQUAL", "LESS_THAN", "GREATER_THAN", "STRING", "VAR_NAME", "COMMA", 
			"EQUALS", "NUM", "PLUS", "SUB", "POWER", "DIV", "MULT", "L_BRACE", "R_BRACE", 
			"NOTE_NAME", "PROC_NAME", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\7\26\u0089\n\26\f\26\16\26\u008c\13\26\3\26\3"+
		"\26\3\27\6\27\u0091\n\27\r\27\16\27\u0092\3\30\3\30\3\31\3\31\3\32\6\32"+
		"\u009a\n\32\r\32\16\32\u009b\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\5\"\u00ae\n\"\3#\3#\7#\u00b2\n#\f#\16#\u00b5"+
		"\13#\3$\6$\u00b8\n$\r$\16$\u00b9\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\t\6\2\"\""+
		"\62;C\\c|\3\2c|\3\2\62;\3\2CI\3\2C\\\5\2C\\aac|\5\2\13\f\17\17\"\"\2\u00c2"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2"+
		"\17Y\3\2\2\2\21\\\3\2\2\2\23a\3\2\2\2\25e\3\2\2\2\27h\3\2\2\2\31k\3\2"+
		"\2\2\33o\3\2\2\2\35s\3\2\2\2\37v\3\2\2\2!y\3\2\2\2#|\3\2\2\2%\177\3\2"+
		"\2\2\'\u0082\3\2\2\2)\u0084\3\2\2\2+\u0086\3\2\2\2-\u0090\3\2\2\2/\u0094"+
		"\3\2\2\2\61\u0096\3\2\2\2\63\u0099\3\2\2\2\65\u009d\3\2\2\2\67\u009f\3"+
		"\2\2\29\u00a1\3\2\2\2;\u00a3\3\2\2\2=\u00a5\3\2\2\2?\u00a7\3\2\2\2A\u00a9"+
		"\3\2\2\2C\u00ab\3\2\2\2E\u00af\3\2\2\2G\u00b7\3\2\2\2IJ\7]\2\2J\4\3\2"+
		"\2\2KL\7_\2\2L\6\3\2\2\2MN\7*\2\2N\b\3\2\2\2OP\7+\2\2P\n\3\2\2\2QR\7%"+
		"\2\2R\f\3\2\2\2ST\7y\2\2TU\7j\2\2UV\7k\2\2VW\7n\2\2WX\7g\2\2X\16\3\2\2"+
		"\2YZ\7k\2\2Z[\7h\2\2[\20\3\2\2\2\\]\7g\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2"+
		"`\22\3\2\2\2ab\7*\2\2bc\7<\2\2cd\7+\2\2d\24\3\2\2\2ef\7~\2\2fg\7<\2\2"+
		"g\26\3\2\2\2hi\7<\2\2ij\7~\2\2j\30\3\2\2\2kl\7>\2\2lm\7y\2\2mn\7@\2\2"+
		"n\32\3\2\2\2op\7>\2\2pq\7A\2\2qr\7@\2\2r\34\3\2\2\2st\7:\2\2tu\7>\2\2"+
		"u\36\3\2\2\2vw\7>\2\2wx\7>\2\2x \3\2\2\2yz\7>\2\2z{\7/\2\2{\"\3\2\2\2"+
		"|}\7?\2\2}~\7?\2\2~$\3\2\2\2\177\u0080\7\61\2\2\u0080\u0081\7?\2\2\u0081"+
		"&\3\2\2\2\u0082\u0083\7>\2\2\u0083(\3\2\2\2\u0084\u0085\7@\2\2\u0085*"+
		"\3\2\2\2\u0086\u008a\7$\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7$\2\2\u008e,\3\2\2\2\u008f\u0091"+
		"\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093.\3\2\2\2\u0094\u0095\7.\2\2\u0095\60\3\2\2\2\u0096"+
		"\u0097\7?\2\2\u0097\62\3\2\2\2\u0098\u009a\t\4\2\2\u0099\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\64"+
		"\3\2\2\2\u009d\u009e\7-\2\2\u009e\66\3\2\2\2\u009f\u00a0\7/\2\2\u00a0"+
		"8\3\2\2\2\u00a1\u00a2\7`\2\2\u00a2:\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4"+
		"<\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6>\3\2\2\2\u00a7\u00a8\7}\2\2\u00a8@"+
		"\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aaB\3\2\2\2\u00ab\u00ad\t\5\2\2\u00ac"+
		"\u00ae\t\4\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00aeD\3\2\2\2"+
		"\u00af\u00b3\t\6\2\2\u00b0\u00b2\t\7\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4F\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b8\t\b\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\b$\2\2\u00bcH\3\2\2\2\t\2\u008a\u0092\u009b\u00ad\u00b3\u00b9\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}