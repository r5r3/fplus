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
		Larger=13, Exclamation=14, Prefix=15, Template=16, Interface=17, End=18, 
		Do=19, Program=20, Module=21, Contains=22, Function=23, Subroutine=24, 
		Procedure=25, Recursive=26, Type=27, Extends=28, Private=29, Public=30, 
		Sequence=31, Abstract=32, Bind=33, Generic=34, Identifier=35, IntegerConstant=36, 
		StringLiteral=37, AssignPointer=38, Newline=39, WS=40, Noise=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "','", "';'", "':'", "'{'", "'}'", "'$'", "'('", "')'", "'['", 
		"']'", "'<'", "'>'", "'!'", "Prefix", "Template", "Interface", "End", 
		"Do", "Program", "Module", "Contains", "Function", "Subroutine", "Procedure", 
		"Recursive", "Type", "Extends", "Private", "Public", "Sequence", "Abstract", 
		"Bind", "Generic", "Identifier", "IntegerConstant", "StringLiteral", "AssignPointer", 
		"Newline", "WS", "Noise"
	};
	public static final String[] ruleNames = {
		"Assign", "Comma", "Semicolon", "Colon", "LeftBrace", "RightBrace", "Dollar", 
		"LeftParen", "RightParen", "LeftBracket", "RightBracket", "Smaller", "Larger", 
		"Exclamation", "Prefix", "Template", "Interface", "End", "Do", "Program", 
		"Module", "Contains", "Function", "Subroutine", "Procedure", "Recursive", 
		"Type", "Extends", "Private", "Public", "Sequence", "Abstract", "Bind", 
		"Generic", "Identifier", "IntegerConstant", "Nondigit", "NonzeroDigit", 
		"Digit", "StringLiteral", "AssignPointer", "Newline", "WS", "Noise"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\7$\u0116\n$\f$\16$\u0119\13$\3%\6%\u011c\n%\r%\16%\u011d"+
		"\3&\3&\3\'\3\'\3(\3(\3)\3)\7)\u0128\n)\f)\16)\u012b\13)\3)\3)\3*\3*\3"+
		"*\3+\3+\5+\u0134\n+\3+\5+\u0137\n+\3,\6,\u013a\n,\r,\16,\u013b\3-\6-\u013f"+
		"\n-\r-\16-\u0140\4\u0129\u0140.\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1"+
		"\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\2\1M\2\1O\2\1Q\'\1"+
		"S(\1U)\1W*\1Y+\1\3\2\34\4\2HHhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo\4\2NN"+
		"nn\4\2CCcc\4\2KKkk\4\2PPpp\4\2TTtt\4\2EEee\4\2FFff\4\2QQqq\4\2IIii\4\2"+
		"WWww\4\2UUuu\4\2DDdd\4\2XXxx\4\2[[{{\4\2ZZzz\4\2SSss\5\2C\\aac|\3\2\63"+
		";\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\u0146\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3"+
		"\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23k\3"+
		"\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37"+
		"w\3\2\2\2!}\3\2\2\2#\u0086\3\2\2\2%\u0090\3\2\2\2\'\u0094\3\2\2\2)\u0097"+
		"\3\2\2\2+\u009f\3\2\2\2-\u00a6\3\2\2\2/\u00af\3\2\2\2\61\u00b8\3\2\2\2"+
		"\63\u00c3\3\2\2\2\65\u00cd\3\2\2\2\67\u00d7\3\2\2\29\u00dc\3\2\2\2;\u00e4"+
		"\3\2\2\2=\u00ec\3\2\2\2?\u00f3\3\2\2\2A\u00fc\3\2\2\2C\u0105\3\2\2\2E"+
		"\u010a\3\2\2\2G\u0112\3\2\2\2I\u011b\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2"+
		"\2\2O\u0123\3\2\2\2Q\u0125\3\2\2\2S\u012e\3\2\2\2U\u0136\3\2\2\2W\u0139"+
		"\3\2\2\2Y\u013e\3\2\2\2[\\\7?\2\2\\\4\3\2\2\2]^\7.\2\2^\6\3\2\2\2_`\7"+
		"=\2\2`\b\3\2\2\2ab\7<\2\2b\n\3\2\2\2cd\7}\2\2d\f\3\2\2\2ef\7\177\2\2f"+
		"\16\3\2\2\2gh\7&\2\2h\20\3\2\2\2ij\7*\2\2j\22\3\2\2\2kl\7+\2\2l\24\3\2"+
		"\2\2mn\7]\2\2n\26\3\2\2\2op\7_\2\2p\30\3\2\2\2qr\7>\2\2r\32\3\2\2\2st"+
		"\7@\2\2t\34\3\2\2\2uv\7#\2\2v\36\3\2\2\2wx\7#\2\2xy\7&\2\2yz\3\2\2\2z"+
		"{\t\2\2\2{|\t\3\2\2| \3\2\2\2}~\t\4\2\2~\177\t\5\2\2\177\u0080\t\6\2\2"+
		"\u0080\u0081\t\3\2\2\u0081\u0082\t\7\2\2\u0082\u0083\t\b\2\2\u0083\u0084"+
		"\t\4\2\2\u0084\u0085\t\5\2\2\u0085\"\3\2\2\2\u0086\u0087\t\t\2\2\u0087"+
		"\u0088\t\n\2\2\u0088\u0089\t\4\2\2\u0089\u008a\t\5\2\2\u008a\u008b\t\13"+
		"\2\2\u008b\u008c\t\2\2\2\u008c\u008d\t\b\2\2\u008d\u008e\t\f\2\2\u008e"+
		"\u008f\t\5\2\2\u008f$\3\2\2\2\u0090\u0091\t\5\2\2\u0091\u0092\t\n\2\2"+
		"\u0092\u0093\t\r\2\2\u0093&\3\2\2\2\u0094\u0095\t\r\2\2\u0095\u0096\t"+
		"\16\2\2\u0096(\3\2\2\2\u0097\u0098\t\3\2\2\u0098\u0099\t\13\2\2\u0099"+
		"\u009a\t\16\2\2\u009a\u009b\t\17\2\2\u009b\u009c\t\13\2\2\u009c\u009d"+
		"\t\b\2\2\u009d\u009e\t\6\2\2\u009e*\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0"+
		"\u00a1\t\16\2\2\u00a1\u00a2\t\r\2\2\u00a2\u00a3\t\20\2\2\u00a3\u00a4\t"+
		"\7\2\2\u00a4\u00a5\t\5\2\2\u00a5,\3\2\2\2\u00a6\u00a7\t\f\2\2\u00a7\u00a8"+
		"\t\16\2\2\u00a8\u00a9\t\n\2\2\u00a9\u00aa\t\4\2\2\u00aa\u00ab\t\b\2\2"+
		"\u00ab\u00ac\t\t\2\2\u00ac\u00ad\t\n\2\2\u00ad\u00ae\t\21\2\2\u00ae.\3"+
		"\2\2\2\u00af\u00b0\t\2\2\2\u00b0\u00b1\t\20\2\2\u00b1\u00b2\t\n\2\2\u00b2"+
		"\u00b3\t\f\2\2\u00b3\u00b4\t\4\2\2\u00b4\u00b5\t\t\2\2\u00b5\u00b6\t\16"+
		"\2\2\u00b6\u00b7\t\n\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\t\21\2\2\u00b9\u00ba"+
		"\t\20\2\2\u00ba\u00bb\t\22\2\2\u00bb\u00bc\t\13\2\2\u00bc\u00bd\t\16\2"+
		"\2\u00bd\u00be\t\20\2\2\u00be\u00bf\t\4\2\2\u00bf\u00c0\t\t\2\2\u00c0"+
		"\u00c1\t\n\2\2\u00c1\u00c2\t\5\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\t\3\2"+
		"\2\u00c4\u00c5\t\13\2\2\u00c5\u00c6\t\16\2\2\u00c6\u00c7\t\f\2\2\u00c7"+
		"\u00c8\t\5\2\2\u00c8\u00c9\t\r\2\2\u00c9\u00ca\t\20\2\2\u00ca\u00cb\t"+
		"\13\2\2\u00cb\u00cc\t\5\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\t\13\2\2\u00ce"+
		"\u00cf\t\5\2\2\u00cf\u00d0\t\f\2\2\u00d0\u00d1\t\20\2\2\u00d1\u00d2\t"+
		"\13\2\2\u00d2\u00d3\t\21\2\2\u00d3\u00d4\t\t\2\2\u00d4\u00d5\t\23\2\2"+
		"\u00d5\u00d6\t\5\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\t\4\2\2\u00d8\u00d9"+
		"\t\24\2\2\u00d9\u00da\t\3\2\2\u00da\u00db\t\5\2\2\u00db8\3\2\2\2\u00dc"+
		"\u00dd\t\5\2\2\u00dd\u00de\t\25\2\2\u00de\u00df\t\4\2\2\u00df\u00e0\t"+
		"\5\2\2\u00e0\u00e1\t\n\2\2\u00e1\u00e2\t\r\2\2\u00e2\u00e3\t\21\2\2\u00e3"+
		":\3\2\2\2\u00e4\u00e5\t\3\2\2\u00e5\u00e6\t\13\2\2\u00e6\u00e7\t\t\2\2"+
		"\u00e7\u00e8\t\23\2\2\u00e8\u00e9\t\b\2\2\u00e9\u00ea\t\4\2\2\u00ea\u00eb"+
		"\t\5\2\2\u00eb<\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed\u00ee\t\20\2\2\u00ee"+
		"\u00ef\t\22\2\2\u00ef\u00f0\t\7\2\2\u00f0\u00f1\t\t\2\2\u00f1\u00f2\t"+
		"\f\2\2\u00f2>\3\2\2\2\u00f3\u00f4\t\21\2\2\u00f4\u00f5\t\5\2\2\u00f5\u00f6"+
		"\t\26\2\2\u00f6\u00f7\t\20\2\2\u00f7\u00f8\t\5\2\2\u00f8\u00f9\t\n\2\2"+
		"\u00f9\u00fa\t\f\2\2\u00fa\u00fb\t\5\2\2\u00fb@\3\2\2\2\u00fc\u00fd\t"+
		"\b\2\2\u00fd\u00fe\t\22\2\2\u00fe\u00ff\t\21\2\2\u00ff\u0100\t\4\2\2\u0100"+
		"\u0101\t\13\2\2\u0101\u0102\t\b\2\2\u0102\u0103\t\f\2\2\u0103\u0104\t"+
		"\4\2\2\u0104B\3\2\2\2\u0105\u0106\t\22\2\2\u0106\u0107\t\t\2\2\u0107\u0108"+
		"\t\n\2\2\u0108\u0109\t\r\2\2\u0109D\3\2\2\2\u010a\u010b\t\17\2\2\u010b"+
		"\u010c\t\5\2\2\u010c\u010d\t\n\2\2\u010d\u010e\t\5\2\2\u010e\u010f\t\13"+
		"\2\2\u010f\u0110\t\t\2\2\u0110\u0111\t\f\2\2\u0111F\3\2\2\2\u0112\u0117"+
		"\5K&\2\u0113\u0116\5K&\2\u0114\u0116\5O(\2\u0115\u0113\3\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"H\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\5O(\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eJ\3\2\2\2"+
		"\u011f\u0120\t\27\2\2\u0120L\3\2\2\2\u0121\u0122\t\30\2\2\u0122N\3\2\2"+
		"\2\u0123\u0124\t\31\2\2\u0124P\3\2\2\2\u0125\u0129\7$\2\2\u0126\u0128"+
		"\13\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d"+
		"\7$\2\2\u012dR\3\2\2\2\u012e\u012f\7?\2\2\u012f\u0130\7@\2\2\u0130T\3"+
		"\2\2\2\u0131\u0133\7\17\2\2\u0132\u0134\7\f\2\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0137\7\f\2\2\u0136\u0131\3\2"+
		"\2\2\u0136\u0135\3\2\2\2\u0137V\3\2\2\2\u0138\u013a\t\32\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"X\3\2\2\2\u013d\u013f\n\33\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2"+
		"\u0140\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141Z\3\2\2\2\13\2\u0115\u0117"+
		"\u011d\u0129\u0133\u0136\u013b\u0140";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}