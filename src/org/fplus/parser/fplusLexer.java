// Generated from fplus.g4 by ANTLR 4.1
package org.fplus.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fplusLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Assign=1, Comma=2, Semicolon=3, Colon=4, LeftBrace=5, RightBrace=6, Dollar=7, 
		LeftParen=8, RightParen=9, LeftBracket=10, RightBracket=11, Smaller=12, 
		Larger=13, Exclamation=14, Plus=15, Minus=16, Star=17, Slash=18, Prefix=19, 
		Template=20, Interface=21, End=22, Do=23, Program=24, Module=25, Contains=26, 
		Function=27, Subroutine=28, Procedure=29, Recursive=30, Type=31, Extends=32, 
		Private=33, Public=34, Sequence=35, Abstract=36, Bind=37, Generic=38, 
		Identifier=39, IntegerConstant=40, FloatConstant=41, StringLiteral=42, 
		AssignPointer=43, Newline=44, WS=45, Noise=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "','", "';'", "':'", "'{'", "'}'", "'$'", "'('", "')'", "'['", 
		"']'", "'<'", "'>'", "'!'", "'+'", "'-'", "'*'", "'/'", "Prefix", "Template", 
		"Interface", "End", "Do", "Program", "Module", "Contains", "Function", 
		"Subroutine", "Procedure", "Recursive", "Type", "Extends", "Private", 
		"Public", "Sequence", "Abstract", "Bind", "Generic", "Identifier", "IntegerConstant", 
		"FloatConstant", "StringLiteral", "AssignPointer", "Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Assign", "Comma", "Semicolon", "Colon", "LeftBrace", "RightBrace", "Dollar", 
		"LeftParen", "RightParen", "LeftBracket", "RightBracket", "Smaller", "Larger", 
		"Exclamation", "Plus", "Minus", "Star", "Slash", "Prefix", "Template", 
		"Interface", "End", "Do", "Program", "Module", "Contains", "Function", 
		"Subroutine", "Procedure", "Recursive", "Type", "Extends", "Private", 
		"Public", "Sequence", "Abstract", "Bind", "Generic", "Identifier", "IntegerConstant", 
		"Nondigit", "NonzeroDigit", "Digit", "FloatConstant", "StringLiteral", 
		"AssignPointer", "Newline", "WS", "Noise"
	};


	public fplusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fplus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\60\u0159\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u0128\n"+
		"(\f(\16(\u012b\13(\3)\6)\u012e\n)\r)\16)\u012f\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3-\5-\u013b\n-\3.\3.\7.\u013f\n.\f.\16.\u0142\13.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\5\60\u014b\n\60\3\60\5\60\u014e\n\60\3\61\6\61\u0151\n\61\r\61\16"+
		"\61\u0152\3\62\6\62\u0156\n\62\r\62\16\62\u0157\4\u0140\u0157\63\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1"+
		"E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S\2\1U\2\1W\2\1Y+\1[,\1]-\1_.\1a/\1c\60\1"+
		"\3\2\34\4\2HHhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo\4\2NNnn\4\2CCcc\4\2KK"+
		"kk\4\2PPpp\4\2TTtt\4\2EEee\4\2FFff\4\2QQqq\4\2IIii\4\2WWww\4\2UUuu\4\2"+
		"DDdd\4\2XXxx\4\2[[{{\4\2ZZzz\4\2SSss\5\2C\\aac|\3\2\63;\3\2\62;\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\r"+
		"o\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2"+
		"\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2"+
		"\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008f\3\2\2\2+\u0098"+
		"\3\2\2\2-\u00a2\3\2\2\2/\u00a6\3\2\2\2\61\u00a9\3\2\2\2\63\u00b1\3\2\2"+
		"\2\65\u00b8\3\2\2\2\67\u00c1\3\2\2\29\u00ca\3\2\2\2;\u00d5\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e9\3\2\2\2A\u00ee\3\2\2\2C\u00f6\3\2\2\2E\u00fe\3\2\2\2G"+
		"\u0105\3\2\2\2I\u010e\3\2\2\2K\u0117\3\2\2\2M\u011c\3\2\2\2O\u0124\3\2"+
		"\2\2Q\u012d\3\2\2\2S\u0131\3\2\2\2U\u0133\3\2\2\2W\u0135\3\2\2\2Y\u0137"+
		"\3\2\2\2[\u013c\3\2\2\2]\u0145\3\2\2\2_\u014d\3\2\2\2a\u0150\3\2\2\2c"+
		"\u0155\3\2\2\2ef\7?\2\2f\4\3\2\2\2gh\7.\2\2h\6\3\2\2\2ij\7=\2\2j\b\3\2"+
		"\2\2kl\7<\2\2l\n\3\2\2\2mn\7}\2\2n\f\3\2\2\2op\7\177\2\2p\16\3\2\2\2q"+
		"r\7&\2\2r\20\3\2\2\2st\7*\2\2t\22\3\2\2\2uv\7+\2\2v\24\3\2\2\2wx\7]\2"+
		"\2x\26\3\2\2\2yz\7_\2\2z\30\3\2\2\2{|\7>\2\2|\32\3\2\2\2}~\7@\2\2~\34"+
		"\3\2\2\2\177\u0080\7#\2\2\u0080\36\3\2\2\2\u0081\u0082\7-\2\2\u0082 \3"+
		"\2\2\2\u0083\u0084\7/\2\2\u0084\"\3\2\2\2\u0085\u0086\7,\2\2\u0086$\3"+
		"\2\2\2\u0087\u0088\7\61\2\2\u0088&\3\2\2\2\u0089\u008a\7#\2\2\u008a\u008b"+
		"\7&\2\2\u008b\u008c\3\2\2\2\u008c\u008d\t\2\2\2\u008d\u008e\t\3\2\2\u008e"+
		"(\3\2\2\2\u008f\u0090\t\4\2\2\u0090\u0091\t\5\2\2\u0091\u0092\t\6\2\2"+
		"\u0092\u0093\t\3\2\2\u0093\u0094\t\7\2\2\u0094\u0095\t\b\2\2\u0095\u0096"+
		"\t\4\2\2\u0096\u0097\t\5\2\2\u0097*\3\2\2\2\u0098\u0099\t\t\2\2\u0099"+
		"\u009a\t\n\2\2\u009a\u009b\t\4\2\2\u009b\u009c\t\5\2\2\u009c\u009d\t\13"+
		"\2\2\u009d\u009e\t\2\2\2\u009e\u009f\t\b\2\2\u009f\u00a0\t\f\2\2\u00a0"+
		"\u00a1\t\5\2\2\u00a1,\3\2\2\2\u00a2\u00a3\t\5\2\2\u00a3\u00a4\t\n\2\2"+
		"\u00a4\u00a5\t\r\2\2\u00a5.\3\2\2\2\u00a6\u00a7\t\r\2\2\u00a7\u00a8\t"+
		"\16\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\u00ab\t\13\2\2\u00ab"+
		"\u00ac\t\16\2\2\u00ac\u00ad\t\17\2\2\u00ad\u00ae\t\13\2\2\u00ae\u00af"+
		"\t\b\2\2\u00af\u00b0\t\6\2\2\u00b0\62\3\2\2\2\u00b1\u00b2\t\6\2\2\u00b2"+
		"\u00b3\t\16\2\2\u00b3\u00b4\t\r\2\2\u00b4\u00b5\t\20\2\2\u00b5\u00b6\t"+
		"\7\2\2\u00b6\u00b7\t\5\2\2\u00b7\64\3\2\2\2\u00b8\u00b9\t\f\2\2\u00b9"+
		"\u00ba\t\16\2\2\u00ba\u00bb\t\n\2\2\u00bb\u00bc\t\4\2\2\u00bc\u00bd\t"+
		"\b\2\2\u00bd\u00be\t\t\2\2\u00be\u00bf\t\n\2\2\u00bf\u00c0\t\21\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\t\2\2\2\u00c2\u00c3\t\20\2\2\u00c3\u00c4\t\n\2"+
		"\2\u00c4\u00c5\t\f\2\2\u00c5\u00c6\t\4\2\2\u00c6\u00c7\t\t\2\2\u00c7\u00c8"+
		"\t\16\2\2\u00c8\u00c9\t\n\2\2\u00c98\3\2\2\2\u00ca\u00cb\t\21\2\2\u00cb"+
		"\u00cc\t\20\2\2\u00cc\u00cd\t\22\2\2\u00cd\u00ce\t\13\2\2\u00ce\u00cf"+
		"\t\16\2\2\u00cf\u00d0\t\20\2\2\u00d0\u00d1\t\4\2\2\u00d1\u00d2\t\t\2\2"+
		"\u00d2\u00d3\t\n\2\2\u00d3\u00d4\t\5\2\2\u00d4:\3\2\2\2\u00d5\u00d6\t"+
		"\3\2\2\u00d6\u00d7\t\13\2\2\u00d7\u00d8\t\16\2\2\u00d8\u00d9\t\f\2\2\u00d9"+
		"\u00da\t\5\2\2\u00da\u00db\t\r\2\2\u00db\u00dc\t\20\2\2\u00dc\u00dd\t"+
		"\13\2\2\u00dd\u00de\t\5\2\2\u00de<\3\2\2\2\u00df\u00e0\t\13\2\2\u00e0"+
		"\u00e1\t\5\2\2\u00e1\u00e2\t\f\2\2\u00e2\u00e3\t\20\2\2\u00e3\u00e4\t"+
		"\13\2\2\u00e4\u00e5\t\21\2\2\u00e5\u00e6\t\t\2\2\u00e6\u00e7\t\23\2\2"+
		"\u00e7\u00e8\t\5\2\2\u00e8>\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea\u00eb\t"+
		"\24\2\2\u00eb\u00ec\t\3\2\2\u00ec\u00ed\t\5\2\2\u00ed@\3\2\2\2\u00ee\u00ef"+
		"\t\5\2\2\u00ef\u00f0\t\25\2\2\u00f0\u00f1\t\4\2\2\u00f1\u00f2\t\5\2\2"+
		"\u00f2\u00f3\t\n\2\2\u00f3\u00f4\t\r\2\2\u00f4\u00f5\t\21\2\2\u00f5B\3"+
		"\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\u00f8\t\13\2\2\u00f8\u00f9\t\t\2\2\u00f9"+
		"\u00fa\t\23\2\2\u00fa\u00fb\t\b\2\2\u00fb\u00fc\t\4\2\2\u00fc\u00fd\t"+
		"\5\2\2\u00fdD\3\2\2\2\u00fe\u00ff\t\3\2\2\u00ff\u0100\t\20\2\2\u0100\u0101"+
		"\t\22\2\2\u0101\u0102\t\7\2\2\u0102\u0103\t\t\2\2\u0103\u0104\t\f\2\2"+
		"\u0104F\3\2\2\2\u0105\u0106\t\21\2\2\u0106\u0107\t\5\2\2\u0107\u0108\t"+
		"\26\2\2\u0108\u0109\t\20\2\2\u0109\u010a\t\5\2\2\u010a\u010b\t\n\2\2\u010b"+
		"\u010c\t\f\2\2\u010c\u010d\t\5\2\2\u010dH\3\2\2\2\u010e\u010f\t\b\2\2"+
		"\u010f\u0110\t\22\2\2\u0110\u0111\t\21\2\2\u0111\u0112\t\4\2\2\u0112\u0113"+
		"\t\13\2\2\u0113\u0114\t\b\2\2\u0114\u0115\t\f\2\2\u0115\u0116\t\4\2\2"+
		"\u0116J\3\2\2\2\u0117\u0118\t\22\2\2\u0118\u0119\t\t\2\2\u0119\u011a\t"+
		"\n\2\2\u011a\u011b\t\r\2\2\u011bL\3\2\2\2\u011c\u011d\t\17\2\2\u011d\u011e"+
		"\t\5\2\2\u011e\u011f\t\n\2\2\u011f\u0120\t\5\2\2\u0120\u0121\t\13\2\2"+
		"\u0121\u0122\t\t\2\2\u0122\u0123\t\f\2\2\u0123N\3\2\2\2\u0124\u0129\5"+
		"S*\2\u0125\u0128\5S*\2\u0126\u0128\5W,\2\u0127\u0125\3\2\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"P\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\5W,\2\u012d\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130R\3\2\2\2"+
		"\u0131\u0132\t\27\2\2\u0132T\3\2\2\2\u0133\u0134\t\30\2\2\u0134V\3\2\2"+
		"\2\u0135\u0136\t\31\2\2\u0136X\3\2\2\2\u0137\u0138\5Q)\2\u0138\u013a\7"+
		"\60\2\2\u0139\u013b\5Q)\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"Z\3\2\2\2\u013c\u0140\7$\2\2\u013d\u013f\13\2\2\2\u013e\u013d\3\2\2\2"+
		"\u013f\u0142\3\2\2\2\u0140\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7$\2\2\u0144\\\3\2\2\2\u0145"+
		"\u0146\7?\2\2\u0146\u0147\7@\2\2\u0147^\3\2\2\2\u0148\u014a\7\17\2\2\u0149"+
		"\u014b\7\f\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014e\7\f\2\2\u014d\u0148\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"`\3\2\2\2\u014f\u0151\t\32\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2"+
		"\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153b\3\2\2\2\u0154\u0156\n"+
		"\33\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158d\3\2\2\2\f\2\u0127\u0129\u012f\u013a\u0140\u014a"+
		"\u014d\u0152\u0157";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}