// Generated from fplus.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Equal=3, NotEqual=4, Assign=5, Comma=6, Semicolon=7, Colon=8, 
		LeftBrace=9, RightBrace=10, Dollar=11, LeftParen=12, RightParen=13, LeftBracket=14, 
		RightBracket=15, Smaller=16, Larger=17, Exclamation=18, Plus=19, Minus=20, 
		Star=21, Slash=22, Ampersand=23, Prefix=24, Template=25, Interface=26, 
		End=27, Do=28, Program=29, Module=30, Contains=31, Function=32, Subroutine=33, 
		Procedure=34, Recursive=35, Elemental=36, Type=37, Class=38, Extends=39, 
		Private=40, Public=41, Sequence=42, Abstract=43, Bind=44, Generic=45, 
		If=46, Then=47, Else=48, And=49, Not=50, Or=51, Integer=52, Real=53, Complex=54, 
		Logical=55, Character=56, Kind=57, Len=58, Pointer=59, Dynamic_Cast=60, 
		Identifier=61, IntegerConstant=62, FloatConstant=63, StringLiteral=64, 
		AssignPointer=65, OperatorOverload=66, Newline=67, WS=68, Noise=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Equal", "NotEqual", "Assign", "Comma", "Semicolon", "Colon", 
		"LeftBrace", "RightBrace", "Dollar", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "Smaller", "Larger", "Exclamation", "Plus", "Minus", "Star", 
		"Slash", "Ampersand", "Prefix", "Template", "Interface", "End", "Do", 
		"Program", "Module", "Contains", "Function", "Subroutine", "Procedure", 
		"Recursive", "Elemental", "Type", "Class", "Extends", "Private", "Public", 
		"Sequence", "Abstract", "Bind", "Generic", "If", "Then", "Else", "And", 
		"Not", "Or", "Integer", "Real", "Complex", "Logical", "Character", "Kind", 
		"Len", "Pointer", "Dynamic_Cast", "Identifier", "IntegerConstant", "Nondigit", 
		"NonzeroDigit", "Digit", "FloatConstant", "StringLiteral", "StringEscSequence", 
		"AssignPointer", "OperatorOverload", "Newline", "WS", "Noise"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "'\"'", "'=='", "'/='", "'='", "','", "';'", "':'", "'{'", 
		"'}'", "'$'", "'('", "')'", "'['", "']'", "'<'", "'>'", "'!'", "'+'", 
		"'-'", "'*'", "'/'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Equal", "NotEqual", "Assign", "Comma", "Semicolon", 
		"Colon", "LeftBrace", "RightBrace", "Dollar", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "Smaller", "Larger", "Exclamation", "Plus", 
		"Minus", "Star", "Slash", "Ampersand", "Prefix", "Template", "Interface", 
		"End", "Do", "Program", "Module", "Contains", "Function", "Subroutine", 
		"Procedure", "Recursive", "Elemental", "Type", "Class", "Extends", "Private", 
		"Public", "Sequence", "Abstract", "Bind", "Generic", "If", "Then", "Else", 
		"And", "Not", "Or", "Integer", "Real", "Complex", "Logical", "Character", 
		"Kind", "Len", "Pointer", "Dynamic_Cast", "Identifier", "IntegerConstant", 
		"FloatConstant", "StringLiteral", "AssignPointer", "OperatorOverload", 
		"Newline", "WS", "Noise"
	};
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


	public fplusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fplus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2G\u0220\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\38\38\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3"+
		">\7>\u01d7\n>\f>\16>\u01da\13>\3?\6?\u01dd\n?\r?\16?\u01de\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3C\5C\u01ea\nC\3D\3D\3D\7D\u01ef\nD\fD\16D\u01f2\13D\3D"+
		"\3D\3D\3D\7D\u01f8\nD\fD\16D\u01fb\13D\3D\5D\u01fe\nD\3E\3E\3E\3F\3F\3"+
		"F\3G\3G\5G\u0208\nG\3G\3G\5G\u020c\nG\3G\3G\3H\3H\5H\u0212\nH\3H\5H\u0215"+
		"\nH\3I\6I\u0218\nI\rI\16I\u0219\3J\6J\u021d\nJ\rJ\16J\u021e\3\u021e\2"+
		"K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177\2\u0081\2\u0083\2\u0085A\u0087B\u0089\2\u008bC\u008d"+
		"D\u008fE\u0091F\u0093G\3\2!\4\2HHhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo\4"+
		"\2NNnn\4\2CCcc\4\2KKkk\4\2PPpp\4\2TTtt\4\2EEee\4\2FFff\4\2QQqq\4\2IIi"+
		"i\4\2WWww\4\2UUuu\4\2DDdd\4\2XXxx\4\2[[{{\4\2ZZzz\4\2SSss\4\2JJjj\4\2"+
		"MMmm\5\2C\\aac|\3\2\63;\3\2\62;\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\6"+
		"\2,-//\61\61??\4\2\13\13\"\"\4\2\f\f\17\17\u022a\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u0097\3\2\2"+
		"\2\7\u0099\3\2\2\2\t\u009c\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17"+
		"\u00a3\3\2\2\2\21\u00a5\3\2\2\2\23\u00a7\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab"+
		"\3\2\2\2\31\u00ad\3\2\2\2\33\u00af\3\2\2\2\35\u00b1\3\2\2\2\37\u00b3\3"+
		"\2\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00bd"+
		"\3\2\2\2+\u00bf\3\2\2\2-\u00c1\3\2\2\2/\u00c3\3\2\2\2\61\u00c5\3\2\2\2"+
		"\63\u00cb\3\2\2\2\65\u00d4\3\2\2\2\67\u00de\3\2\2\29\u00e2\3\2\2\2;\u00e5"+
		"\3\2\2\2=\u00ed\3\2\2\2?\u00f4\3\2\2\2A\u00fd\3\2\2\2C\u0106\3\2\2\2E"+
		"\u0111\3\2\2\2G\u011b\3\2\2\2I\u0125\3\2\2\2K\u012f\3\2\2\2M\u0134\3\2"+
		"\2\2O\u013a\3\2\2\2Q\u0142\3\2\2\2S\u014a\3\2\2\2U\u0151\3\2\2\2W\u015a"+
		"\3\2\2\2Y\u0163\3\2\2\2[\u0168\3\2\2\2]\u0170\3\2\2\2_\u0173\3\2\2\2a"+
		"\u0178\3\2\2\2c\u017d\3\2\2\2e\u0183\3\2\2\2g\u0189\3\2\2\2i\u018e\3\2"+
		"\2\2k\u0196\3\2\2\2m\u019b\3\2\2\2o\u01a3\3\2\2\2q\u01ab\3\2\2\2s\u01b5"+
		"\3\2\2\2u\u01ba\3\2\2\2w\u01be\3\2\2\2y\u01c6\3\2\2\2{\u01d3\3\2\2\2}"+
		"\u01dc\3\2\2\2\177\u01e0\3\2\2\2\u0081\u01e2\3\2\2\2\u0083\u01e4\3\2\2"+
		"\2\u0085\u01e6\3\2\2\2\u0087\u01fd\3\2\2\2\u0089\u01ff\3\2\2\2\u008b\u0202"+
		"\3\2\2\2\u008d\u0205\3\2\2\2\u008f\u0214\3\2\2\2\u0091\u0217\3\2\2\2\u0093"+
		"\u021c\3\2\2\2\u0095\u0096\7)\2\2\u0096\4\3\2\2\2\u0097\u0098\7$\2\2\u0098"+
		"\6\3\2\2\2\u0099\u009a\7?\2\2\u009a\u009b\7?\2\2\u009b\b\3\2\2\2\u009c"+
		"\u009d\7\61\2\2\u009d\u009e\7?\2\2\u009e\n\3\2\2\2\u009f\u00a0\7?\2\2"+
		"\u00a0\f\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7=\2"+
		"\2\u00a4\20\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7"+
		"}\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7\177\2\2\u00aa\26\3\2\2\2\u00ab\u00ac"+
		"\7&\2\2\u00ac\30\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae\32\3\2\2\2\u00af\u00b0"+
		"\7+\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7]\2\2\u00b2\36\3\2\2\2\u00b3\u00b4"+
		"\7_\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7>\2\2\u00b6\"\3\2\2\2\u00b7\u00b8"+
		"\7@\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7"+
		"-\2\2\u00bc(\3\2\2\2\u00bd\u00be\7/\2\2\u00be*\3\2\2\2\u00bf\u00c0\7,"+
		"\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7"+
		"(\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7\7&\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\t\2\2\2\u00c9\u00ca\t\3\2\2\u00ca\62\3\2\2\2\u00cb"+
		"\u00cc\t\4\2\2\u00cc\u00cd\t\5\2\2\u00cd\u00ce\t\6\2\2\u00ce\u00cf\t\3"+
		"\2\2\u00cf\u00d0\t\7\2\2\u00d0\u00d1\t\b\2\2\u00d1\u00d2\t\4\2\2\u00d2"+
		"\u00d3\t\5\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\t\t\2\2\u00d5\u00d6\t\n\2"+
		"\2\u00d6\u00d7\t\4\2\2\u00d7\u00d8\t\5\2\2\u00d8\u00d9\t\13\2\2\u00d9"+
		"\u00da\t\2\2\2\u00da\u00db\t\b\2\2\u00db\u00dc\t\f\2\2\u00dc\u00dd\t\5"+
		"\2\2\u00dd\66\3\2\2\2\u00de\u00df\t\5\2\2\u00df\u00e0\t\n\2\2\u00e0\u00e1"+
		"\t\r\2\2\u00e18\3\2\2\2\u00e2\u00e3\t\r\2\2\u00e3\u00e4\t\16\2\2\u00e4"+
		":\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6\u00e7\t\13\2\2\u00e7\u00e8\t\16\2"+
		"\2\u00e8\u00e9\t\17\2\2\u00e9\u00ea\t\13\2\2\u00ea\u00eb\t\b\2\2\u00eb"+
		"\u00ec\t\6\2\2\u00ec<\3\2\2\2\u00ed\u00ee\t\6\2\2\u00ee\u00ef\t\16\2\2"+
		"\u00ef\u00f0\t\r\2\2\u00f0\u00f1\t\20\2\2\u00f1\u00f2\t\7\2\2\u00f2\u00f3"+
		"\t\5\2\2\u00f3>\3\2\2\2\u00f4\u00f5\t\f\2\2\u00f5\u00f6\t\16\2\2\u00f6"+
		"\u00f7\t\n\2\2\u00f7\u00f8\t\4\2\2\u00f8\u00f9\t\b\2\2\u00f9\u00fa\t\t"+
		"\2\2\u00fa\u00fb\t\n\2\2\u00fb\u00fc\t\21\2\2\u00fc@\3\2\2\2\u00fd\u00fe"+
		"\t\2\2\2\u00fe\u00ff\t\20\2\2\u00ff\u0100\t\n\2\2\u0100\u0101\t\f\2\2"+
		"\u0101\u0102\t\4\2\2\u0102\u0103\t\t\2\2\u0103\u0104\t\16\2\2\u0104\u0105"+
		"\t\n\2\2\u0105B\3\2\2\2\u0106\u0107\t\21\2\2\u0107\u0108\t\20\2\2\u0108"+
		"\u0109\t\22\2\2\u0109\u010a\t\13\2\2\u010a\u010b\t\16\2\2\u010b\u010c"+
		"\t\20\2\2\u010c\u010d\t\4\2\2\u010d\u010e\t\t\2\2\u010e\u010f\t\n\2\2"+
		"\u010f\u0110\t\5\2\2\u0110D\3\2\2\2\u0111\u0112\t\3\2\2\u0112\u0113\t"+
		"\13\2\2\u0113\u0114\t\16\2\2\u0114\u0115\t\f\2\2\u0115\u0116\t\5\2\2\u0116"+
		"\u0117\t\r\2\2\u0117\u0118\t\20\2\2\u0118\u0119\t\13\2\2\u0119\u011a\t"+
		"\5\2\2\u011aF\3\2\2\2\u011b\u011c\t\13\2\2\u011c\u011d\t\5\2\2\u011d\u011e"+
		"\t\f\2\2\u011e\u011f\t\20\2\2\u011f\u0120\t\13\2\2\u0120\u0121\t\21\2"+
		"\2\u0121\u0122\t\t\2\2\u0122\u0123\t\23\2\2\u0123\u0124\t\5\2\2\u0124"+
		"H\3\2\2\2\u0125\u0126\t\5\2\2\u0126\u0127\t\7\2\2\u0127\u0128\t\5\2\2"+
		"\u0128\u0129\t\6\2\2\u0129\u012a\t\5\2\2\u012a\u012b\t\n\2\2\u012b\u012c"+
		"\t\4\2\2\u012c\u012d\t\b\2\2\u012d\u012e\t\7\2\2\u012eJ\3\2\2\2\u012f"+
		"\u0130\t\4\2\2\u0130\u0131\t\24\2\2\u0131\u0132\t\3\2\2\u0132\u0133\t"+
		"\5\2\2\u0133L\3\2\2\2\u0134\u0135\t\f\2\2\u0135\u0136\t\7\2\2\u0136\u0137"+
		"\t\b\2\2\u0137\u0138\t\21\2\2\u0138\u0139\t\21\2\2\u0139N\3\2\2\2\u013a"+
		"\u013b\t\5\2\2\u013b\u013c\t\25\2\2\u013c\u013d\t\4\2\2\u013d\u013e\t"+
		"\5\2\2\u013e\u013f\t\n\2\2\u013f\u0140\t\r\2\2\u0140\u0141\t\21\2\2\u0141"+
		"P\3\2\2\2\u0142\u0143\t\3\2\2\u0143\u0144\t\13\2\2\u0144\u0145\t\t\2\2"+
		"\u0145\u0146\t\23\2\2\u0146\u0147\t\b\2\2\u0147\u0148\t\4\2\2\u0148\u0149"+
		"\t\5\2\2\u0149R\3\2\2\2\u014a\u014b\t\3\2\2\u014b\u014c\t\20\2\2\u014c"+
		"\u014d\t\22\2\2\u014d\u014e\t\7\2\2\u014e\u014f\t\t\2\2\u014f\u0150\t"+
		"\f\2\2\u0150T\3\2\2\2\u0151\u0152\t\21\2\2\u0152\u0153\t\5\2\2\u0153\u0154"+
		"\t\26\2\2\u0154\u0155\t\20\2\2\u0155\u0156\t\5\2\2\u0156\u0157\t\n\2\2"+
		"\u0157\u0158\t\f\2\2\u0158\u0159\t\5\2\2\u0159V\3\2\2\2\u015a\u015b\t"+
		"\b\2\2\u015b\u015c\t\22\2\2\u015c\u015d\t\21\2\2\u015d\u015e\t\4\2\2\u015e"+
		"\u015f\t\13\2\2\u015f\u0160\t\b\2\2\u0160\u0161\t\f\2\2\u0161\u0162\t"+
		"\4\2\2\u0162X\3\2\2\2\u0163\u0164\t\22\2\2\u0164\u0165\t\t\2\2\u0165\u0166"+
		"\t\n\2\2\u0166\u0167\t\r\2\2\u0167Z\3\2\2\2\u0168\u0169\t\17\2\2\u0169"+
		"\u016a\t\5\2\2\u016a\u016b\t\n\2\2\u016b\u016c\t\5\2\2\u016c\u016d\t\13"+
		"\2\2\u016d\u016e\t\t\2\2\u016e\u016f\t\f\2\2\u016f\\\3\2\2\2\u0170\u0171"+
		"\t\t\2\2\u0171\u0172\t\2\2\2\u0172^\3\2\2\2\u0173\u0174\t\4\2\2\u0174"+
		"\u0175\t\27\2\2\u0175\u0176\t\5\2\2\u0176\u0177\t\n\2\2\u0177`\3\2\2\2"+
		"\u0178\u0179\t\5\2\2\u0179\u017a\t\7\2\2\u017a\u017b\t\21\2\2\u017b\u017c"+
		"\t\5\2\2\u017cb\3\2\2\2\u017d\u017e\7\60\2\2\u017e\u017f\t\b\2\2\u017f"+
		"\u0180\t\n\2\2\u0180\u0181\t\r\2\2\u0181\u0182\7\60\2\2\u0182d\3\2\2\2"+
		"\u0183\u0184\7\60\2\2\u0184\u0185\t\n\2\2\u0185\u0186\t\16\2\2\u0186\u0187"+
		"\t\4\2\2\u0187\u0188\7\60\2\2\u0188f\3\2\2\2\u0189\u018a\7\60\2\2\u018a"+
		"\u018b\t\16\2\2\u018b\u018c\t\13\2\2\u018c\u018d\7\60\2\2\u018dh\3\2\2"+
		"\2\u018e\u018f\t\t\2\2\u018f\u0190\t\n\2\2\u0190\u0191\t\4\2\2\u0191\u0192"+
		"\t\5\2\2\u0192\u0193\t\17\2\2\u0193\u0194\t\5\2\2\u0194\u0195\t\13\2\2"+
		"\u0195j\3\2\2\2\u0196\u0197\t\13\2\2\u0197\u0198\t\5\2\2\u0198\u0199\t"+
		"\b\2\2\u0199\u019a\t\7\2\2\u019al\3\2\2\2\u019b\u019c\t\f\2\2\u019c\u019d"+
		"\t\16\2\2\u019d\u019e\t\6\2\2\u019e\u019f\t\3\2\2\u019f\u01a0\t\7\2\2"+
		"\u01a0\u01a1\t\5\2\2\u01a1\u01a2\t\25\2\2\u01a2n\3\2\2\2\u01a3\u01a4\t"+
		"\7\2\2\u01a4\u01a5\t\16\2\2\u01a5\u01a6\t\17\2\2\u01a6\u01a7\t\t\2\2\u01a7"+
		"\u01a8\t\f\2\2\u01a8\u01a9\t\b\2\2\u01a9\u01aa\t\7\2\2\u01aap\3\2\2\2"+
		"\u01ab\u01ac\t\f\2\2\u01ac\u01ad\t\27\2\2\u01ad\u01ae\t\b\2\2\u01ae\u01af"+
		"\t\13\2\2\u01af\u01b0\t\b\2\2\u01b0\u01b1\t\f\2\2\u01b1\u01b2\t\4\2\2"+
		"\u01b2\u01b3\t\5\2\2\u01b3\u01b4\t\13\2\2\u01b4r\3\2\2\2\u01b5\u01b6\t"+
		"\30\2\2\u01b6\u01b7\t\t\2\2\u01b7\u01b8\t\n\2\2\u01b8\u01b9\t\r\2\2\u01b9"+
		"t\3\2\2\2\u01ba\u01bb\t\7\2\2\u01bb\u01bc\t\5\2\2\u01bc\u01bd\t\n\2\2"+
		"\u01bdv\3\2\2\2\u01be\u01bf\t\3\2\2\u01bf\u01c0\t\16\2\2\u01c0\u01c1\t"+
		"\t\2\2\u01c1\u01c2\t\n\2\2\u01c2\u01c3\t\4\2\2\u01c3\u01c4\t\5\2\2\u01c4"+
		"\u01c5\t\13\2\2\u01c5x\3\2\2\2\u01c6\u01c7\t\r\2\2\u01c7\u01c8\t\24\2"+
		"\2\u01c8\u01c9\t\n\2\2\u01c9\u01ca\t\b\2\2\u01ca\u01cb\t\6\2\2\u01cb\u01cc"+
		"\t\t\2\2\u01cc\u01cd\t\f\2\2\u01cd\u01ce\7a\2\2\u01ce\u01cf\t\f\2\2\u01cf"+
		"\u01d0\t\b\2\2\u01d0\u01d1\t\21\2\2\u01d1\u01d2\t\4\2\2\u01d2z\3\2\2\2"+
		"\u01d3\u01d8\5\177@\2\u01d4\u01d7\5\177@\2\u01d5\u01d7\5\u0083B\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9|\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd"+
		"\5\u0083B\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01dc\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df~\3\2\2\2\u01e0\u01e1\t\31\2\2\u01e1\u0080"+
		"\3\2\2\2\u01e2\u01e3\t\32\2\2\u01e3\u0082\3\2\2\2\u01e4\u01e5\t\33\2\2"+
		"\u01e5\u0084\3\2\2\2\u01e6\u01e7\5}?\2\u01e7\u01e9\7\60\2\2\u01e8\u01ea"+
		"\5}?\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u0086\3\2\2\2\u01eb"+
		"\u01f0\7$\2\2\u01ec\u01ef\5\u0089E\2\u01ed\u01ef\n\34\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01fe\7$"+
		"\2\2\u01f4\u01f9\7)\2\2\u01f5\u01f8\5\u0089E\2\u01f6\u01f8\n\35\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc"+
		"\u01fe\7)\2\2\u01fd\u01eb\3\2\2\2\u01fd\u01f4\3\2\2\2\u01fe\u0088\3\2"+
		"\2\2\u01ff\u0200\7^\2\2\u0200\u0201\13\2\2\2\u0201\u008a\3\2\2\2\u0202"+
		"\u0203\7?\2\2\u0203\u0204\7@\2\2\u0204\u008c\3\2\2\2\u0205\u0207\7*\2"+
		"\2\u0206\u0208\5\u0091I\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020b\t\36\2\2\u020a\u020c\5\u0091I\2\u020b\u020a"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7+\2\2\u020e"+
		"\u008e\3\2\2\2\u020f\u0211\7\17\2\2\u0210\u0212\7\f\2\2\u0211\u0210\3"+
		"\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0215\7\f\2\2\u0214"+
		"\u020f\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u0090\3\2\2\2\u0216\u0218\t\37"+
		"\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u0092\3\2\2\2\u021b\u021d\n \2\2\u021c\u021b\3\2"+
		"\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0094\3\2\2\2\22\2\u01d6\u01d8\u01de\u01e9\u01ee\u01f0\u01f7\u01f9\u01fd"+
		"\u0207\u020b\u0211\u0214\u0219\u021e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}