// Generated from c:\workspace\antlr_test\intro\Expr.g by ANTLR 4.9.2
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
		EQUALS=1, WHILE=2, LESS_THAN=3, NEXT=4, GREATER_THAN=5, IF=6, ELSE=7, 
		NUM=8, PLUS=9, SUB=10, POWER=11, DIV=12, MULT=13, WRITE=14, NAME=15, SETEQUALS=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQUALS", "WHILE", "LESS_THAN", "NEXT", "GREATER_THAN", "IF", "ELSE", 
			"NUM", "PLUS", "SUB", "POWER", "DIV", "MULT", "WRITE", "NAME", "SETEQUALS", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=='", "'while'", "'<'", "'next'", "'>'", "'if'", "'else'", null, 
			"'+'", "'-'", "'^'", "'/'", "'*'", "'write'", null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUALS", "WHILE", "LESS_THAN", "NEXT", "GREATER_THAN", "IF", "ELSE", 
			"NUM", "PLUS", "SUB", "POWER", "DIV", "MULT", "WRITE", "NAME", "SETEQUALS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\6\tA\n\t\r\t\16\tB\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20"+
		"V\n\20\r\20\16\20W\3\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23\3\2\5\3\2\62;\3\2c|\4\2\f\f\"\"\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2\7.\3"+
		"\2\2\2\t\60\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17:\3\2\2\2\21@\3\2\2\2"+
		"\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2"+
		"\2\37U\3\2\2\2!Y\3\2\2\2#\\\3\2\2\2%&\7?\2\2&\'\7?\2\2\'\4\3\2\2\2()\7"+
		"y\2\2)*\7j\2\2*+\7k\2\2+,\7n\2\2,-\7g\2\2-\6\3\2\2\2./\7>\2\2/\b\3\2\2"+
		"\2\60\61\7p\2\2\61\62\7g\2\2\62\63\7z\2\2\63\64\7v\2\2\64\n\3\2\2\2\65"+
		"\66\7@\2\2\66\f\3\2\2\2\678\7k\2\289\7h\2\29\16\3\2\2\2:;\7g\2\2;<\7n"+
		"\2\2<=\7u\2\2=>\7g\2\2>\20\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2C\22\3\2\2\2DE\7-\2\2E\24\3\2\2\2FG\7/\2\2G\26\3\2\2\2H"+
		"I\7`\2\2I\30\3\2\2\2JK\7\61\2\2K\32\3\2\2\2LM\7,\2\2M\34\3\2\2\2NO\7y"+
		"\2\2OP\7t\2\2PQ\7k\2\2QR\7v\2\2RS\7g\2\2S\36\3\2\2\2TV\t\3\2\2UT\3\2\2"+
		"\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X \3\2\2\2YZ\7<\2\2Z[\7?\2\2[\"\3\2\2"+
		"\2\\]\t\4\2\2]^\3\2\2\2^_\b\22\2\2_$\3\2\2\2\5\2BW\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}