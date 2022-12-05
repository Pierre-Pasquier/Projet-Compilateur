// Generated from ./expr.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, PRINT=26, PRINTI=27, FLUSH=28, GETCHAR=29, ORD=30, CHR=31, SIZE=32, 
		SUBSTRING=33, CONCAT=34, NOT=35, EXIT=36, ARRAY=37, BREAK=38, DO=39, ELSE=40, 
		END=41, FOR=42, FUNCTION=43, IF=44, IN=45, LET=46, NIL=47, OF=48, THEN=49, 
		TO=50, TYPE=51, VAR=52, WHILE=53, STRING=54, IDF=55, INT=56, COM=57, WS=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"PRINT", "PRINTI", "FLUSH", "GETCHAR", "ORD", "CHR", "SIZE", "SUBSTRING", 
			"CONCAT", "NOT", "EXIT", "ARRAY", "BREAK", "DO", "ELSE", "END", "FOR", 
			"FUNCTION", "IF", "IN", "LET", "NIL", "OF", "THEN", "TO", "TYPE", "VAR", 
			"WHILE", "STRING", "IDF", "INT", "COM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "':='", "'('", "')'", "'-'", "'|'", 
			"'&'", "'='", "'<>'", "'>'", "'<'", "'>='", "'<='", "'+'", "'*'", "'/'", 
			"';'", "','", "'.'", "':'", "'printi('", "'print('", "'print'", "'printi'", 
			"'flush'", "'getchar'", "'ord'", "'chr'", "'size'", "'substring'", "'concat'", 
			"'not'", "'exit'", "'array'", "'break'", "'do'", "'else'", "'end'", "'for'", 
			"'function'", "'if'", "'in'", "'let'", "'nil'", "'of'", "'then'", "'to'", 
			"'type'", "'var'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PRINT", "PRINTI", "FLUSH", "GETCHAR", "ORD", "CHR", "SIZE", 
			"SUBSTRING", "CONCAT", "NOT", "EXIT", "ARRAY", "BREAK", "DO", "ELSE", 
			"END", "FOR", "FUNCTION", "IF", "IN", "LET", "NIL", "OF", "THEN", "TO", 
			"TYPE", "VAR", "WHILE", "STRING", "IDF", "INT", "COM", "WS"
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


	public exprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0171\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u014a\n\67\f\67\16\67\u014d\13\67"+
		"\3\67\3\67\38\38\78\u0153\n8\f8\168\u0156\138\39\69\u0159\n9\r9\169\u015a"+
		"\3:\3:\3:\3:\7:\u0161\n:\f:\16:\u0164\13:\3:\3:\3:\3:\3:\3;\6;\u016c\n"+
		";\r;\16;\u016d\3;\3;\3\u0162\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\6\f\2\"#%%\'\'*+.\60\62AC\\"+
		"^^aac|\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0175\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}"+
		"\3\2\2\2\13\177\3\2\2\2\r\u0082\3\2\2\2\17\u0084\3\2\2\2\21\u0086\3\2"+
		"\2\2\23\u0088\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2\2\31\u008e\3\2\2"+
		"\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0098\3\2\2\2#"+
		"\u009b\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3"+
		"\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2\63\u00b1\3\2\2\2"+
		"\65\u00b8\3\2\2\2\67\u00be\3\2\2\29\u00c5\3\2\2\2;\u00cb\3\2\2\2=\u00d3"+
		"\3\2\2\2?\u00d7\3\2\2\2A\u00db\3\2\2\2C\u00e0\3\2\2\2E\u00ea\3\2\2\2G"+
		"\u00f1\3\2\2\2I\u00f5\3\2\2\2K\u00fa\3\2\2\2M\u0100\3\2\2\2O\u0106\3\2"+
		"\2\2Q\u0109\3\2\2\2S\u010e\3\2\2\2U\u0112\3\2\2\2W\u0116\3\2\2\2Y\u011f"+
		"\3\2\2\2[\u0122\3\2\2\2]\u0125\3\2\2\2_\u0129\3\2\2\2a\u012d\3\2\2\2c"+
		"\u0130\3\2\2\2e\u0135\3\2\2\2g\u0138\3\2\2\2i\u013d\3\2\2\2k\u0141\3\2"+
		"\2\2m\u0147\3\2\2\2o\u0150\3\2\2\2q\u0158\3\2\2\2s\u015c\3\2\2\2u\u016b"+
		"\3\2\2\2wx\7}\2\2x\4\3\2\2\2yz\7\177\2\2z\6\3\2\2\2{|\7]\2\2|\b\3\2\2"+
		"\2}~\7_\2\2~\n\3\2\2\2\177\u0080\7<\2\2\u0080\u0081\7?\2\2\u0081\f\3\2"+
		"\2\2\u0082\u0083\7*\2\2\u0083\16\3\2\2\2\u0084\u0085\7+\2\2\u0085\20\3"+
		"\2\2\2\u0086\u0087\7/\2\2\u0087\22\3\2\2\2\u0088\u0089\7~\2\2\u0089\24"+
		"\3\2\2\2\u008a\u008b\7(\2\2\u008b\26\3\2\2\2\u008c\u008d\7?\2\2\u008d"+
		"\30\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7@\2\2\u0090\32\3\2\2\2\u0091"+
		"\u0092\7@\2\2\u0092\34\3\2\2\2\u0093\u0094\7>\2\2\u0094\36\3\2\2\2\u0095"+
		"\u0096\7@\2\2\u0096\u0097\7?\2\2\u0097 \3\2\2\2\u0098\u0099\7>\2\2\u0099"+
		"\u009a\7?\2\2\u009a\"\3\2\2\2\u009b\u009c\7-\2\2\u009c$\3\2\2\2\u009d"+
		"\u009e\7,\2\2\u009e&\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0(\3\2\2\2\u00a1"+
		"\u00a2\7=\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4,\3\2\2\2\u00a5\u00a6"+
		"\7\60\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7<\2\2\u00a8\60\3\2\2\2\u00a9\u00aa"+
		"\7r\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7v\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7*\2\2\u00b0\62\3\2\2\2\u00b1"+
		"\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2"+
		"\u00b5\u00b6\7v\2\2\u00b6\u00b7\7*\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\7"+
		"r\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd"+
		"\7v\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"8\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7j\2\2\u00ca:\3\2\2\2\u00cb\u00cc\7i\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7j\2\2"+
		"\u00d0\u00d1\7c\2\2\u00d1\u00d2\7t\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7q\2"+
		"\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7f\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7"+
		"e\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da\7t\2\2\u00da@\3\2\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7|\2\2\u00de\u00df\7g\2\2\u00df"+
		"B\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7d\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7k\2\2"+
		"\u00e7\u00e8\7p\2\2\u00e8\u00e9\7i\2\2\u00e9D\3\2\2\2\u00ea\u00eb\7e\2"+
		"\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7v\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3"+
		"\7q\2\2\u00f3\u00f4\7v\2\2\u00f4H\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7"+
		"\7z\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7v\2\2\u00f9J\3\2\2\2\u00fa\u00fb"+
		"\7c\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7c\2\2\u00fe"+
		"\u00ff\7{\2\2\u00ffL\3\2\2\2\u0100\u0101\7d\2\2\u0101\u0102\7t\2\2\u0102"+
		"\u0103\7g\2\2\u0103\u0104\7c\2\2\u0104\u0105\7m\2\2\u0105N\3\2\2\2\u0106"+
		"\u0107\7f\2\2\u0107\u0108\7q\2\2\u0108P\3\2\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c\u010d\7g\2\2\u010dR\3\2\2\2\u010e"+
		"\u010f\7g\2\2\u010f\u0110\7p\2\2\u0110\u0111\7f\2\2\u0111T\3\2\2\2\u0112"+
		"\u0113\7h\2\2\u0113\u0114\7q\2\2\u0114\u0115\7t\2\2\u0115V\3\2\2\2\u0116"+
		"\u0117\7h\2\2\u0117\u0118\7w\2\2\u0118\u0119\7p\2\2\u0119\u011a\7e\2\2"+
		"\u011a\u011b\7v\2\2\u011b\u011c\7k\2\2\u011c\u011d\7q\2\2\u011d\u011e"+
		"\7p\2\2\u011eX\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7h\2\2\u0121Z\3"+
		"\2\2\2\u0122\u0123\7k\2\2\u0123\u0124\7p\2\2\u0124\\\3\2\2\2\u0125\u0126"+
		"\7n\2\2\u0126\u0127\7g\2\2\u0127\u0128\7v\2\2\u0128^\3\2\2\2\u0129\u012a"+
		"\7p\2\2\u012a\u012b\7k\2\2\u012b\u012c\7n\2\2\u012c`\3\2\2\2\u012d\u012e"+
		"\7q\2\2\u012e\u012f\7h\2\2\u012fb\3\2\2\2\u0130\u0131\7v\2\2\u0131\u0132"+
		"\7j\2\2\u0132\u0133\7g\2\2\u0133\u0134\7p\2\2\u0134d\3\2\2\2\u0135\u0136"+
		"\7v\2\2\u0136\u0137\7q\2\2\u0137f\3\2\2\2\u0138\u0139\7v\2\2\u0139\u013a"+
		"\7{\2\2\u013a\u013b\7r\2\2\u013b\u013c\7g\2\2\u013ch\3\2\2\2\u013d\u013e"+
		"\7x\2\2\u013e\u013f\7c\2\2\u013f\u0140\7t\2\2\u0140j\3\2\2\2\u0141\u0142"+
		"\7y\2\2\u0142\u0143\7j\2\2\u0143\u0144\7k\2\2\u0144\u0145\7n\2\2\u0145"+
		"\u0146\7g\2\2\u0146l\3\2\2\2\u0147\u014b\7$\2\2\u0148\u014a\t\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7$\2\2\u014f"+
		"n\3\2\2\2\u0150\u0154\t\3\2\2\u0151\u0153\t\4\2\2\u0152\u0151\3\2\2\2"+
		"\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155p\3"+
		"\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\4\62;\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015br\3\2\2\2"+
		"\u015c\u015d\7\61\2\2\u015d\u015e\7,\2\2\u015e\u0162\3\2\2\2\u015f\u0161"+
		"\13\2\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0163\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166"+
		"\7,\2\2\u0166\u0167\7\61\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b:\2\2\u0169"+
		"t\3\2\2\2\u016a\u016c\t\5\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2"+
		"\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170"+
		"\b;\2\2\u0170v\3\2\2\2\b\2\u014b\u0154\u015a\u0162\u016d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}