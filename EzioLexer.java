// Generated from /Users/ezio/IdeaProjects/MyInterpreter/src/Ezio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EzioLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", "R_BRACKET", 
			"COMMA", "ID", "CONST_ID", "NamedConst", "Digits", "Integer", "Fraction", 
			"Exponent", "Real", "SIN", "COS", "TAN", "LN", "EXP", "SQRT", "ORIGIN", 
			"SCALE", "ROT", "IS", "COLOR", "TO", "STEP", "DRAW", "FOR", "FROM", "T1", 
			"RED", "BLACK", "YELLOW", "GREEN", "BLUE", "A", "B", "C", "D", "E", "F", 
			"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
			"U", "V", "W", "X", "Y", "Z", "WS", "COMMENT", "ErrText"
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


	public EzioLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ezio.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0196\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00a5\n\13\3\f\3\f\3\f\5\f\u00aa\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00b1\n\r\3\16\6\16\u00b4\n\16\r\16\16\16\u00b5\3\17\3\17"+
		"\3\20\5\20\u00bb\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c2\n\20\3\21\3"+
		"\21\5\21\u00c6\n\21\3\21\3\21\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\3\22"+
		"\5\22\u00d1\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\6C\u016e\nC\rC\16C\u016f\3C\3C\3D\3D\3D\3D\7D\u0178\nD\fD\16"+
		"D\u017b\13D\3D\3D\3D\3D\7D\u0181\nD\fD\16D\u0184\13D\3D\3D\3D\3D\7D\u018a"+
		"\nD\fD\16D\u018d\13D\3D\3D\5D\u0191\nD\3D\3D\3E\3E\3\u018b\2F\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\2\37\2!\2#\2"+
		"%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34"+
		"C\35E\36G\37I K!M\"O#Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085$\u0087%\u0089&\3\2 "+
		"\4\2GGgg\3\2\62;\4\2--//\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2HHhh\4\2I"+
		"Iii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZz"+
		"z\4\2[[{{\4\2\\\\||\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u018a\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\3\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2"+
		"\2\13\u0093\3\2\2\2\r\u0096\3\2\2\2\17\u0098\3\2\2\2\21\u009a\3\2\2\2"+
		"\23\u009c\3\2\2\2\25\u00a4\3\2\2\2\27\u00a9\3\2\2\2\31\u00b0\3\2\2\2\33"+
		"\u00b3\3\2\2\2\35\u00b7\3\2\2\2\37\u00c1\3\2\2\2!\u00c3\3\2\2\2#\u00d0"+
		"\3\2\2\2%\u00d2\3\2\2\2\'\u00d6\3\2\2\2)\u00da\3\2\2\2+\u00de\3\2\2\2"+
		"-\u00e1\3\2\2\2/\u00e5\3\2\2\2\61\u00ea\3\2\2\2\63\u00f1\3\2\2\2\65\u00f7"+
		"\3\2\2\2\67\u00fb\3\2\2\29\u00fe\3\2\2\2;\u0104\3\2\2\2=\u0107\3\2\2\2"+
		"?\u010c\3\2\2\2A\u0111\3\2\2\2C\u0115\3\2\2\2E\u011a\3\2\2\2G\u011c\3"+
		"\2\2\2I\u0120\3\2\2\2K\u0126\3\2\2\2M\u012d\3\2\2\2O\u0133\3\2\2\2Q\u0138"+
		"\3\2\2\2S\u013a\3\2\2\2U\u013c\3\2\2\2W\u013e\3\2\2\2Y\u0140\3\2\2\2["+
		"\u0142\3\2\2\2]\u0144\3\2\2\2_\u0146\3\2\2\2a\u0148\3\2\2\2c\u014a\3\2"+
		"\2\2e\u014c\3\2\2\2g\u014e\3\2\2\2i\u0150\3\2\2\2k\u0152\3\2\2\2m\u0154"+
		"\3\2\2\2o\u0156\3\2\2\2q\u0158\3\2\2\2s\u015a\3\2\2\2u\u015c\3\2\2\2w"+
		"\u015e\3\2\2\2y\u0160\3\2\2\2{\u0162\3\2\2\2}\u0164\3\2\2\2\177\u0166"+
		"\3\2\2\2\u0081\u0168\3\2\2\2\u0083\u016a\3\2\2\2\u0085\u016d\3\2\2\2\u0087"+
		"\u0190\3\2\2\2\u0089\u0194\3\2\2\2\u008b\u008c\7-\2\2\u008c\4\3\2\2\2"+
		"\u008d\u008e\7/\2\2\u008e\6\3\2\2\2\u008f\u0090\7\61\2\2\u0090\b\3\2\2"+
		"\2\u0091\u0092\7,\2\2\u0092\n\3\2\2\2\u0093\u0094\7,\2\2\u0094\u0095\7"+
		",\2\2\u0095\f\3\2\2\2\u0096\u0097\7=\2\2\u0097\16\3\2\2\2\u0098\u0099"+
		"\7*\2\2\u0099\20\3\2\2\2\u009a\u009b\7+\2\2\u009b\22\3\2\2\2\u009c\u009d"+
		"\7.\2\2\u009d\24\3\2\2\2\u009e\u00a5\5%\23\2\u009f\u00a5\5\'\24\2\u00a0"+
		"\u00a5\5)\25\2\u00a1\u00a5\5+\26\2\u00a2\u00a5\5-\27\2\u00a3\u00a5\5/"+
		"\30\2\u00a4\u009e\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\26\3\2\2"+
		"\2\u00a6\u00aa\5\35\17\2\u00a7\u00aa\5#\22\2\u00a8\u00aa\5\31\r\2\u00a9"+
		"\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\30\3\2\2"+
		"\2\u00ab\u00ac\7r\2\2\u00ac\u00b1\7k\2\2\u00ad\u00ae\7R\2\2\u00ae\u00b1"+
		"\7K\2\2\u00af\u00b1\t\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\32\3\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\34"+
		"\3\2\2\2\u00b7\u00b8\5\33\16\2\u00b8\36\3\2\2\2\u00b9\u00bb\5\33\16\2"+
		"\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\7\60\2\2\u00bd\u00c2\5\33\16\2\u00be\u00bf\5\33\16\2\u00bf\u00c0\7\60"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2"+
		" \3\2\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c6\t\4\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\5\33\16\2\u00c8\""+
		"\3\2\2\2\u00c9\u00cb\5\37\20\2\u00ca\u00cc\5!\21\2\u00cb\u00ca\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\5\33\16\2\u00ce\u00cf"+
		"\5!\21\2\u00cf\u00d1\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1"+
		"$\3\2\2\2\u00d2\u00d3\5u;\2\u00d3\u00d4\5a\61\2\u00d4\u00d5\5k\66\2\u00d5"+
		"&\3\2\2\2\u00d6\u00d7\5U+\2\u00d7\u00d8\5m\67\2\u00d8\u00d9\5u;\2\u00d9"+
		"(\3\2\2\2\u00da\u00db\5w<\2\u00db\u00dc\5Q)\2\u00dc\u00dd\5k\66\2\u00dd"+
		"*\3\2\2\2\u00de\u00df\5g\64\2\u00df\u00e0\5k\66\2\u00e0,\3\2\2\2\u00e1"+
		"\u00e2\5Y-\2\u00e2\u00e3\5\177@\2\u00e3\u00e4\5o8\2\u00e4.\3\2\2\2\u00e5"+
		"\u00e6\5u;\2\u00e6\u00e7\5q9\2\u00e7\u00e8\5s:\2\u00e8\u00e9\5w<\2\u00e9"+
		"\60\3\2\2\2\u00ea\u00eb\5m\67\2\u00eb\u00ec\5s:\2\u00ec\u00ed\5a\61\2"+
		"\u00ed\u00ee\5]/\2\u00ee\u00ef\5a\61\2\u00ef\u00f0\5k\66\2\u00f0\62\3"+
		"\2\2\2\u00f1\u00f2\5u;\2\u00f2\u00f3\5U+\2\u00f3\u00f4\5Q)\2\u00f4\u00f5"+
		"\5g\64\2\u00f5\u00f6\5Y-\2\u00f6\64\3\2\2\2\u00f7\u00f8\5s:\2\u00f8\u00f9"+
		"\5m\67\2\u00f9\u00fa\5w<\2\u00fa\66\3\2\2\2\u00fb\u00fc\5a\61\2\u00fc"+
		"\u00fd\5u;\2\u00fd8\3\2\2\2\u00fe\u00ff\5U+\2\u00ff\u0100\5m\67\2\u0100"+
		"\u0101\5g\64\2\u0101\u0102\5m\67\2\u0102\u0103\5s:\2\u0103:\3\2\2\2\u0104"+
		"\u0105\5w<\2\u0105\u0106\5m\67\2\u0106<\3\2\2\2\u0107\u0108\5u;\2\u0108"+
		"\u0109\5w<\2\u0109\u010a\5Y-\2\u010a\u010b\5o8\2\u010b>\3\2\2\2\u010c"+
		"\u010d\5W,\2\u010d\u010e\5s:\2\u010e\u010f\5Q)\2\u010f\u0110\5}?\2\u0110"+
		"@\3\2\2\2\u0111\u0112\5[.\2\u0112\u0113\5m\67\2\u0113\u0114\5s:\2\u0114"+
		"B\3\2\2\2\u0115\u0116\5[.\2\u0116\u0117\5s:\2\u0117\u0118\5m\67\2\u0118"+
		"\u0119\5i\65\2\u0119D\3\2\2\2\u011a\u011b\5w<\2\u011bF\3\2\2\2\u011c\u011d"+
		"\5s:\2\u011d\u011e\5Y-\2\u011e\u011f\5W,\2\u011fH\3\2\2\2\u0120\u0121"+
		"\5S*\2\u0121\u0122\5g\64\2\u0122\u0123\5Q)\2\u0123\u0124\5U+\2\u0124\u0125"+
		"\5e\63\2\u0125J\3\2\2\2\u0126\u0127\5\u0081A\2\u0127\u0128\5Y-\2\u0128"+
		"\u0129\5g\64\2\u0129\u012a\5g\64\2\u012a\u012b\5m\67\2\u012b\u012c\5}"+
		"?\2\u012cL\3\2\2\2\u012d\u012e\5]/\2\u012e\u012f\5s:\2\u012f\u0130\5Y"+
		"-\2\u0130\u0131\5Y-\2\u0131\u0132\5k\66\2\u0132N\3\2\2\2\u0133\u0134\5"+
		"S*\2\u0134\u0135\5g\64\2\u0135\u0136\5y=\2\u0136\u0137\5Y-\2\u0137P\3"+
		"\2\2\2\u0138\u0139\t\5\2\2\u0139R\3\2\2\2\u013a\u013b\t\6\2\2\u013bT\3"+
		"\2\2\2\u013c\u013d\t\7\2\2\u013dV\3\2\2\2\u013e\u013f\t\b\2\2\u013fX\3"+
		"\2\2\2\u0140\u0141\t\2\2\2\u0141Z\3\2\2\2\u0142\u0143\t\t\2\2\u0143\\"+
		"\3\2\2\2\u0144\u0145\t\n\2\2\u0145^\3\2\2\2\u0146\u0147\t\13\2\2\u0147"+
		"`\3\2\2\2\u0148\u0149\t\f\2\2\u0149b\3\2\2\2\u014a\u014b\t\r\2\2\u014b"+
		"d\3\2\2\2\u014c\u014d\t\16\2\2\u014df\3\2\2\2\u014e\u014f\t\17\2\2\u014f"+
		"h\3\2\2\2\u0150\u0151\t\20\2\2\u0151j\3\2\2\2\u0152\u0153\t\21\2\2\u0153"+
		"l\3\2\2\2\u0154\u0155\t\22\2\2\u0155n\3\2\2\2\u0156\u0157\t\23\2\2\u0157"+
		"p\3\2\2\2\u0158\u0159\t\24\2\2\u0159r\3\2\2\2\u015a\u015b\t\25\2\2\u015b"+
		"t\3\2\2\2\u015c\u015d\t\26\2\2\u015dv\3\2\2\2\u015e\u015f\t\27\2\2\u015f"+
		"x\3\2\2\2\u0160\u0161\t\30\2\2\u0161z\3\2\2\2\u0162\u0163\t\31\2\2\u0163"+
		"|\3\2\2\2\u0164\u0165\t\32\2\2\u0165~\3\2\2\2\u0166\u0167\t\33\2\2\u0167"+
		"\u0080\3\2\2\2\u0168\u0169\t\34\2\2\u0169\u0082\3\2\2\2\u016a\u016b\t"+
		"\35\2\2\u016b\u0084\3\2\2\2\u016c\u016e\t\36\2\2\u016d\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\bC\2\2\u0172\u0086\3\2\2\2\u0173\u0174\7\61\2\2\u0174"+
		"\u0175\7\61\2\2\u0175\u0179\3\2\2\2\u0176\u0178\n\37\2\2\u0177\u0176\3"+
		"\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u0191\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7/\2\2\u017d\u017e\7/\2"+
		"\2\u017e\u0182\3\2\2\2\u017f\u0181\n\37\2\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0191\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7\61\2\2\u0186\u0187\7,\2\2\u0187"+
		"\u018b\3\2\2\2\u0188\u018a\13\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u018f\7,\2\2\u018f\u0191\7\61\2\2\u0190\u0173\3\2"+
		"\2\2\u0190\u017c\3\2\2\2\u0190\u0185\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\bD\2\2\u0193\u0088\3\2\2\2\u0194\u0195\13\2\2\2\u0195\u008a\3\2"+
		"\2\2\21\2\u00a4\u00a9\u00b0\u00b5\u00ba\u00c1\u00c5\u00cb\u00d0\u016f"+
		"\u0179\u0182\u018b\u0190\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}