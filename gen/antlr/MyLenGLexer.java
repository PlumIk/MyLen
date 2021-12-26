// Generated from /home/alex/Prog/Jaba/MyLen/src/main/java/antlr/MyLenG.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLenGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, NEQ=2, GT=3, LT=4, PLUS=5, MINUS=6, MULT=7, DIV=8, SCOL=9, ASSIGN=10, 
		OPAR=11, CPAR=12, OBRACE=13, CBRACE=14, IF=15, WHILE=16, LOG=17, ID=18, 
		INT=19, STRING=20, COMMENT=21, SPACE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQ", "NEQ", "GT", "LT", "PLUS", "MINUS", "MULT", "DIV", "SCOL", "ASSIGN", 
			"OPAR", "CPAR", "OBRACE", "CBRACE", "IF", "WHILE", "LOG", "ID", "INT", 
			"STRING", "COMMENT", "SPACE"
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


	public MyLenGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLenG.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\7\23]\n\23\f\23\16\23`\13\23"+
		"\3\24\6\24c\n\24\r\24\16\24d\3\25\3\25\3\25\3\25\7\25k\n\25\f\25\16\25"+
		"n\13\25\3\25\3\25\3\26\3\26\7\26t\n\26\f\26\16\26w\13\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3/\3\2\2\2\5\62\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3"+
		"\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31"+
		"G\3\2\2\2\33I\3\2\2\2\35K\3\2\2\2\37M\3\2\2\2!P\3\2\2\2#V\3\2\2\2%Z\3"+
		"\2\2\2\'b\3\2\2\2)f\3\2\2\2+q\3\2\2\2-z\3\2\2\2/\60\7?\2\2\60\61\7?\2"+
		"\2\61\4\3\2\2\2\62\63\7#\2\2\63\64\7?\2\2\64\6\3\2\2\2\65\66\7@\2\2\66"+
		"\b\3\2\2\2\678\7>\2\28\n\3\2\2\29:\7-\2\2:\f\3\2\2\2;<\7/\2\2<\16\3\2"+
		"\2\2=>\7,\2\2>\20\3\2\2\2?@\7\61\2\2@\22\3\2\2\2AB\7=\2\2B\24\3\2\2\2"+
		"CD\7?\2\2D\26\3\2\2\2EF\7*\2\2F\30\3\2\2\2GH\7+\2\2H\32\3\2\2\2IJ\7}\2"+
		"\2J\34\3\2\2\2KL\7\177\2\2L\36\3\2\2\2MN\7k\2\2NO\7h\2\2O \3\2\2\2PQ\7"+
		"y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2TU\7g\2\2U\"\3\2\2\2VW\7n\2\2WX\7q\2\2"+
		"XY\7i\2\2Y$\3\2\2\2Z^\t\2\2\2[]\t\3\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_&\3\2\2\2`^\3\2\2\2ac\t\4\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2"+
		"\2de\3\2\2\2e(\3\2\2\2fl\7$\2\2gk\n\5\2\2hi\7$\2\2ik\7$\2\2jg\3\2\2\2"+
		"jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7$\2\2"+
		"p*\3\2\2\2qu\7%\2\2rt\n\6\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"vx\3\2\2\2wu\3\2\2\2xy\b\26\2\2y,\3\2\2\2z{\t\7\2\2{|\3\2\2\2|}\b\27\2"+
		"\2}.\3\2\2\2\b\2^djlu\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}