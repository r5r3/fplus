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
		T__0=1, T__1=2, T__2=3, Equal=4, NotEqual=5, Assign=6, Comma=7, Semicolon=8, 
		Colon=9, LeftBrace=10, RightBrace=11, Dollar=12, LeftParen=13, RightParen=14, 
		LeftBracket=15, RightBracket=16, Smaller=17, Larger=18, Exclamation=19, 
		Plus=20, Minus=21, Star=22, Slash=23, Ampersand=24, InPlaceAdd=25, InPlaceSub=26, 
		InPlaceMul=27, InPlaceDiv=28, Prefix=29, Template=30, Interface=31, End=32, 
		Do=33, Program=34, Module=35, Contains=36, Function=37, Subroutine=38, 
		Procedure=39, Recursive=40, Elemental=41, Type=42, Class=43, Extends=44, 
		Private=45, Public=46, Sequence=47, Abstract=48, Bind=49, Generic=50, 
		If=51, Then=52, Else=53, And=54, Not=55, Or=56, Integer=57, Real=58, Complex=59, 
		Logical=60, Character=61, Kind=62, Len=63, Pointer=64, Dynamic_Cast=65, 
		Identifier=66, IntegerConstant=67, FloatConstant=68, StringLiteral=69, 
		AssignPointer=70, OperatorOverload=71, Newline=72, WS=73, Noise=74;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Equal", "NotEqual", "Assign", "Comma", "Semicolon", 
		"Colon", "LeftBrace", "RightBrace", "Dollar", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "Smaller", "Larger", "Exclamation", "Plus", 
		"Minus", "Star", "Slash", "Ampersand", "InPlaceAdd", "InPlaceSub", "InPlaceMul", 
		"InPlaceDiv", "Prefix", "Template", "Interface", "End", "Do", "Program", 
		"Module", "Contains", "Function", "Subroutine", "Procedure", "Recursive", 
		"Elemental", "Type", "Class", "Extends", "Private", "Public", "Sequence", 
		"Abstract", "Bind", "Generic", "If", "Then", "Else", "And", "Not", "Or", 
		"Integer", "Real", "Complex", "Logical", "Character", "Kind", "Len", "Pointer", 
		"Dynamic_Cast", "Identifier", "IntegerConstant", "Nondigit", "NonzeroDigit", 
		"Digit", "FloatConstant", "StringLiteral", "StringEscSequence", "AssignPointer", 
		"OperatorOverload", "Newline", "WS", "Noise"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "'\"'", "'$[Ff][Pp]'", "'=='", "'/='", "'='", "','", "';'", 
		"':'", "'{'", "'}'", "'$'", "'('", "')'", "'['", "']'", "'<'", "'>'", 
		"'!'", "'+'", "'-'", "'*'", "'/'", "'&'", "'+='", "'-='", "'*='", "'//='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Equal", "NotEqual", "Assign", "Comma", "Semicolon", 
		"Colon", "LeftBrace", "RightBrace", "Dollar", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "Smaller", "Larger", "Exclamation", "Plus", 
		"Minus", "Star", "Slash", "Ampersand", "InPlaceAdd", "InPlaceSub", "InPlaceMul", 
		"InPlaceDiv", "Prefix", "Template", "Interface", "End", "Do", "Program", 
		"Module", "Contains", "Function", "Subroutine", "Procedure", "Recursive", 
		"Elemental", "Type", "Class", "Extends", "Private", "Public", "Sequence", 
		"Abstract", "Bind", "Generic", "If", "Then", "Else", "And", "Not", "Or", 
		"Integer", "Real", "Complex", "Logical", "Character", "Kind", "Len", "Pointer", 
		"Dynamic_Cast", "Identifier", "IntegerConstant", "FloatConstant", "StringLiteral", 
		"AssignPointer", "OperatorOverload", "Newline", "WS", "Noise"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2L\u0241\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C"+
		"\3C\7C\u01f8\nC\fC\16C\u01fb\13C\3D\6D\u01fe\nD\rD\16D\u01ff\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3H\5H\u020b\nH\3I\3I\3I\7I\u0210\nI\fI\16I\u0213\13I\3"+
		"I\3I\3I\3I\7I\u0219\nI\fI\16I\u021c\13I\3I\5I\u021f\nI\3J\3J\3J\3K\3K"+
		"\3K\3L\3L\5L\u0229\nL\3L\3L\5L\u022d\nL\3L\3L\3M\3M\5M\u0233\nM\3M\5M"+
		"\u0236\nM\3N\6N\u0239\nN\rN\16N\u023a\3O\6O\u023e\nO\rO\16O\u023f\3\u023f"+
		"\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2\u008b\2\u008d"+
		"\2\u008fF\u0091G\u0093\2\u0095H\u0097I\u0099J\u009bK\u009dL\3\2!\4\2H"+
		"Hhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo\4\2NNnn\4\2CCcc\4\2KKkk\4\2PPpp\4"+
		"\2TTtt\4\2EEee\4\2FFff\4\2QQqq\4\2IIii\4\2WWww\4\2UUuu\4\2DDdd\4\2XXx"+
		"x\4\2[[{{\4\2ZZzz\4\2SSss\4\2JJjj\4\2MMmm\5\2C\\aac|\3\2\63;\3\2\62;\6"+
		"\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\6\2,-//\61\61??\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\u024b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\3\u009f\3\2\2\2\5\u00a1\3\2\2\2\7\u00a3\3\2\2\2\t\u00ad\3\2\2"+
		"\2\13\u00b0\3\2\2\2\r\u00b3\3\2\2\2\17\u00b5\3\2\2\2\21\u00b7\3\2\2\2"+
		"\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd\3\2\2\2\31\u00bf\3\2\2\2\33"+
		"\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3\2\2\2!\u00c7\3\2\2\2#\u00c9"+
		"\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00cf\3\2\2\2+\u00d1\3\2\2\2"+
		"-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2\63\u00d9\3\2\2\2\65\u00dc"+
		"\3\2\2\2\67\u00df\3\2\2\29\u00e2\3\2\2\2;\u00e6\3\2\2\2=\u00ec\3\2\2\2"+
		"?\u00f5\3\2\2\2A\u00ff\3\2\2\2C\u0103\3\2\2\2E\u0106\3\2\2\2G\u010e\3"+
		"\2\2\2I\u0115\3\2\2\2K\u011e\3\2\2\2M\u0127\3\2\2\2O\u0132\3\2\2\2Q\u013c"+
		"\3\2\2\2S\u0146\3\2\2\2U\u0150\3\2\2\2W\u0155\3\2\2\2Y\u015b\3\2\2\2["+
		"\u0163\3\2\2\2]\u016b\3\2\2\2_\u0172\3\2\2\2a\u017b\3\2\2\2c\u0184\3\2"+
		"\2\2e\u0189\3\2\2\2g\u0191\3\2\2\2i\u0194\3\2\2\2k\u0199\3\2\2\2m\u019e"+
		"\3\2\2\2o\u01a4\3\2\2\2q\u01aa\3\2\2\2s\u01af\3\2\2\2u\u01b7\3\2\2\2w"+
		"\u01bc\3\2\2\2y\u01c4\3\2\2\2{\u01cc\3\2\2\2}\u01d6\3\2\2\2\177\u01db"+
		"\3\2\2\2\u0081\u01df\3\2\2\2\u0083\u01e7\3\2\2\2\u0085\u01f4\3\2\2\2\u0087"+
		"\u01fd\3\2\2\2\u0089\u0201\3\2\2\2\u008b\u0203\3\2\2\2\u008d\u0205\3\2"+
		"\2\2\u008f\u0207\3\2\2\2\u0091\u021e\3\2\2\2\u0093\u0220\3\2\2\2\u0095"+
		"\u0223\3\2\2\2\u0097\u0226\3\2\2\2\u0099\u0235\3\2\2\2\u009b\u0238\3\2"+
		"\2\2\u009d\u023d\3\2\2\2\u009f\u00a0\7)\2\2\u00a0\4\3\2\2\2\u00a1\u00a2"+
		"\7$\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7&\2\2\u00a4\u00a5\7]\2\2\u00a5\u00a6"+
		"\7H\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7_\2\2\u00a8\u00a9\7]\2\2\u00a9"+
		"\u00aa\7R\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7_\2\2\u00ac\b\3\2\2\2\u00ad"+
		"\u00ae\7?\2\2\u00ae\u00af\7?\2\2\u00af\n\3\2\2\2\u00b0\u00b1\7\61\2\2"+
		"\u00b1\u00b2\7?\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\16\3\2\2"+
		"\2\u00b5\u00b6\7.\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7=\2\2\u00b8\22\3\2"+
		"\2\2\u00b9\u00ba\7<\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7}\2\2\u00bc\26\3"+
		"\2\2\2\u00bd\u00be\7\177\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7&\2\2\u00c0"+
		"\32\3\2\2\2\u00c1\u00c2\7*\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7+\2\2\u00c4"+
		"\36\3\2\2\2\u00c5\u00c6\7]\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7_\2\2\u00c8"+
		"\"\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca$\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc"+
		"&\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce(\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0*"+
		"\3\2\2\2\u00d1\u00d2\7/\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4.\3"+
		"\2\2\2\u00d5\u00d6\7\61\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7(\2\2\u00d8"+
		"\62\3\2\2\2\u00d9\u00da\7-\2\2\u00da\u00db\7?\2\2\u00db\64\3\2\2\2\u00dc"+
		"\u00dd\7/\2\2\u00dd\u00de\7?\2\2\u00de\66\3\2\2\2\u00df\u00e0\7,\2\2\u00e0"+
		"\u00e1\7?\2\2\u00e18\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\7\61\2\2"+
		"\u00e4\u00e5\7?\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7#\2\2\u00e7\u00e8\7&\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\t\2\2\2\u00ea\u00eb\t\3\2\2\u00eb<"+
		"\3\2\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00ee\t\5\2\2\u00ee\u00ef\t\6\2\2\u00ef"+
		"\u00f0\t\3\2\2\u00f0\u00f1\t\7\2\2\u00f1\u00f2\t\b\2\2\u00f2\u00f3\t\4"+
		"\2\2\u00f3\u00f4\t\5\2\2\u00f4>\3\2\2\2\u00f5\u00f6\t\t\2\2\u00f6\u00f7"+
		"\t\n\2\2\u00f7\u00f8\t\4\2\2\u00f8\u00f9\t\5\2\2\u00f9\u00fa\t\13\2\2"+
		"\u00fa\u00fb\t\2\2\2\u00fb\u00fc\t\b\2\2\u00fc\u00fd\t\f\2\2\u00fd\u00fe"+
		"\t\5\2\2\u00fe@\3\2\2\2\u00ff\u0100\t\5\2\2\u0100\u0101\t\n\2\2\u0101"+
		"\u0102\t\r\2\2\u0102B\3\2\2\2\u0103\u0104\t\r\2\2\u0104\u0105\t\16\2\2"+
		"\u0105D\3\2\2\2\u0106\u0107\t\3\2\2\u0107\u0108\t\13\2\2\u0108\u0109\t"+
		"\16\2\2\u0109\u010a\t\17\2\2\u010a\u010b\t\13\2\2\u010b\u010c\t\b\2\2"+
		"\u010c\u010d\t\6\2\2\u010dF\3\2\2\2\u010e\u010f\t\6\2\2\u010f\u0110\t"+
		"\16\2\2\u0110\u0111\t\r\2\2\u0111\u0112\t\20\2\2\u0112\u0113\t\7\2\2\u0113"+
		"\u0114\t\5\2\2\u0114H\3\2\2\2\u0115\u0116\t\f\2\2\u0116\u0117\t\16\2\2"+
		"\u0117\u0118\t\n\2\2\u0118\u0119\t\4\2\2\u0119\u011a\t\b\2\2\u011a\u011b"+
		"\t\t\2\2\u011b\u011c\t\n\2\2\u011c\u011d\t\21\2\2\u011dJ\3\2\2\2\u011e"+
		"\u011f\t\2\2\2\u011f\u0120\t\20\2\2\u0120\u0121\t\n\2\2\u0121\u0122\t"+
		"\f\2\2\u0122\u0123\t\4\2\2\u0123\u0124\t\t\2\2\u0124\u0125\t\16\2\2\u0125"+
		"\u0126\t\n\2\2\u0126L\3\2\2\2\u0127\u0128\t\21\2\2\u0128\u0129\t\20\2"+
		"\2\u0129\u012a\t\22\2\2\u012a\u012b\t\13\2\2\u012b\u012c\t\16\2\2\u012c"+
		"\u012d\t\20\2\2\u012d\u012e\t\4\2\2\u012e\u012f\t\t\2\2\u012f\u0130\t"+
		"\n\2\2\u0130\u0131\t\5\2\2\u0131N\3\2\2\2\u0132\u0133\t\3\2\2\u0133\u0134"+
		"\t\13\2\2\u0134\u0135\t\16\2\2\u0135\u0136\t\f\2\2\u0136\u0137\t\5\2\2"+
		"\u0137\u0138\t\r\2\2\u0138\u0139\t\20\2\2\u0139\u013a\t\13\2\2\u013a\u013b"+
		"\t\5\2\2\u013bP\3\2\2\2\u013c\u013d\t\13\2\2\u013d\u013e\t\5\2\2\u013e"+
		"\u013f\t\f\2\2\u013f\u0140\t\20\2\2\u0140\u0141\t\13\2\2\u0141\u0142\t"+
		"\21\2\2\u0142\u0143\t\t\2\2\u0143\u0144\t\23\2\2\u0144\u0145\t\5\2\2\u0145"+
		"R\3\2\2\2\u0146\u0147\t\5\2\2\u0147\u0148\t\7\2\2\u0148\u0149\t\5\2\2"+
		"\u0149\u014a\t\6\2\2\u014a\u014b\t\5\2\2\u014b\u014c\t\n\2\2\u014c\u014d"+
		"\t\4\2\2\u014d\u014e\t\b\2\2\u014e\u014f\t\7\2\2\u014fT\3\2\2\2\u0150"+
		"\u0151\t\4\2\2\u0151\u0152\t\24\2\2\u0152\u0153\t\3\2\2\u0153\u0154\t"+
		"\5\2\2\u0154V\3\2\2\2\u0155\u0156\t\f\2\2\u0156\u0157\t\7\2\2\u0157\u0158"+
		"\t\b\2\2\u0158\u0159\t\21\2\2\u0159\u015a\t\21\2\2\u015aX\3\2\2\2\u015b"+
		"\u015c\t\5\2\2\u015c\u015d\t\25\2\2\u015d\u015e\t\4\2\2\u015e\u015f\t"+
		"\5\2\2\u015f\u0160\t\n\2\2\u0160\u0161\t\r\2\2\u0161\u0162\t\21\2\2\u0162"+
		"Z\3\2\2\2\u0163\u0164\t\3\2\2\u0164\u0165\t\13\2\2\u0165\u0166\t\t\2\2"+
		"\u0166\u0167\t\23\2\2\u0167\u0168\t\b\2\2\u0168\u0169\t\4\2\2\u0169\u016a"+
		"\t\5\2\2\u016a\\\3\2\2\2\u016b\u016c\t\3\2\2\u016c\u016d\t\20\2\2\u016d"+
		"\u016e\t\22\2\2\u016e\u016f\t\7\2\2\u016f\u0170\t\t\2\2\u0170\u0171\t"+
		"\f\2\2\u0171^\3\2\2\2\u0172\u0173\t\21\2\2\u0173\u0174\t\5\2\2\u0174\u0175"+
		"\t\26\2\2\u0175\u0176\t\20\2\2\u0176\u0177\t\5\2\2\u0177\u0178\t\n\2\2"+
		"\u0178\u0179\t\f\2\2\u0179\u017a\t\5\2\2\u017a`\3\2\2\2\u017b\u017c\t"+
		"\b\2\2\u017c\u017d\t\22\2\2\u017d\u017e\t\21\2\2\u017e\u017f\t\4\2\2\u017f"+
		"\u0180\t\13\2\2\u0180\u0181\t\b\2\2\u0181\u0182\t\f\2\2\u0182\u0183\t"+
		"\4\2\2\u0183b\3\2\2\2\u0184\u0185\t\22\2\2\u0185\u0186\t\t\2\2\u0186\u0187"+
		"\t\n\2\2\u0187\u0188\t\r\2\2\u0188d\3\2\2\2\u0189\u018a\t\17\2\2\u018a"+
		"\u018b\t\5\2\2\u018b\u018c\t\n\2\2\u018c\u018d\t\5\2\2\u018d\u018e\t\13"+
		"\2\2\u018e\u018f\t\t\2\2\u018f\u0190\t\f\2\2\u0190f\3\2\2\2\u0191\u0192"+
		"\t\t\2\2\u0192\u0193\t\2\2\2\u0193h\3\2\2\2\u0194\u0195\t\4\2\2\u0195"+
		"\u0196\t\27\2\2\u0196\u0197\t\5\2\2\u0197\u0198\t\n\2\2\u0198j\3\2\2\2"+
		"\u0199\u019a\t\5\2\2\u019a\u019b\t\7\2\2\u019b\u019c\t\21\2\2\u019c\u019d"+
		"\t\5\2\2\u019dl\3\2\2\2\u019e\u019f\7\60\2\2\u019f\u01a0\t\b\2\2\u01a0"+
		"\u01a1\t\n\2\2\u01a1\u01a2\t\r\2\2\u01a2\u01a3\7\60\2\2\u01a3n\3\2\2\2"+
		"\u01a4\u01a5\7\60\2\2\u01a5\u01a6\t\n\2\2\u01a6\u01a7\t\16\2\2\u01a7\u01a8"+
		"\t\4\2\2\u01a8\u01a9\7\60\2\2\u01a9p\3\2\2\2\u01aa\u01ab\7\60\2\2\u01ab"+
		"\u01ac\t\16\2\2\u01ac\u01ad\t\13\2\2\u01ad\u01ae\7\60\2\2\u01aer\3\2\2"+
		"\2\u01af\u01b0\t\t\2\2\u01b0\u01b1\t\n\2\2\u01b1\u01b2\t\4\2\2\u01b2\u01b3"+
		"\t\5\2\2\u01b3\u01b4\t\17\2\2\u01b4\u01b5\t\5\2\2\u01b5\u01b6\t\13\2\2"+
		"\u01b6t\3\2\2\2\u01b7\u01b8\t\13\2\2\u01b8\u01b9\t\5\2\2\u01b9\u01ba\t"+
		"\b\2\2\u01ba\u01bb\t\7\2\2\u01bbv\3\2\2\2\u01bc\u01bd\t\f\2\2\u01bd\u01be"+
		"\t\16\2\2\u01be\u01bf\t\6\2\2\u01bf\u01c0\t\3\2\2\u01c0\u01c1\t\7\2\2"+
		"\u01c1\u01c2\t\5\2\2\u01c2\u01c3\t\25\2\2\u01c3x\3\2\2\2\u01c4\u01c5\t"+
		"\7\2\2\u01c5\u01c6\t\16\2\2\u01c6\u01c7\t\17\2\2\u01c7\u01c8\t\t\2\2\u01c8"+
		"\u01c9\t\f\2\2\u01c9\u01ca\t\b\2\2\u01ca\u01cb\t\7\2\2\u01cbz\3\2\2\2"+
		"\u01cc\u01cd\t\f\2\2\u01cd\u01ce\t\27\2\2\u01ce\u01cf\t\b\2\2\u01cf\u01d0"+
		"\t\13\2\2\u01d0\u01d1\t\b\2\2\u01d1\u01d2\t\f\2\2\u01d2\u01d3\t\4\2\2"+
		"\u01d3\u01d4\t\5\2\2\u01d4\u01d5\t\13\2\2\u01d5|\3\2\2\2\u01d6\u01d7\t"+
		"\30\2\2\u01d7\u01d8\t\t\2\2\u01d8\u01d9\t\n\2\2\u01d9\u01da\t\r\2\2\u01da"+
		"~\3\2\2\2\u01db\u01dc\t\7\2\2\u01dc\u01dd\t\5\2\2\u01dd\u01de\t\n\2\2"+
		"\u01de\u0080\3\2\2\2\u01df\u01e0\t\3\2\2\u01e0\u01e1\t\16\2\2\u01e1\u01e2"+
		"\t\t\2\2\u01e2\u01e3\t\n\2\2\u01e3\u01e4\t\4\2\2\u01e4\u01e5\t\5\2\2\u01e5"+
		"\u01e6\t\13\2\2\u01e6\u0082\3\2\2\2\u01e7\u01e8\t\r\2\2\u01e8\u01e9\t"+
		"\24\2\2\u01e9\u01ea\t\n\2\2\u01ea\u01eb\t\b\2\2\u01eb\u01ec\t\6\2\2\u01ec"+
		"\u01ed\t\t\2\2\u01ed\u01ee\t\f\2\2\u01ee\u01ef\7a\2\2\u01ef\u01f0\t\f"+
		"\2\2\u01f0\u01f1\t\b\2\2\u01f1\u01f2\t\21\2\2\u01f2\u01f3\t\4\2\2\u01f3"+
		"\u0084\3\2\2\2\u01f4\u01f9\5\u0089E\2\u01f5\u01f8\5\u0089E\2\u01f6\u01f8"+
		"\5\u008dG\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2"+
		"\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0086\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fc\u01fe\5\u008dG\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2"+
		"\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0088\3\2\2\2\u0201\u0202"+
		"\t\31\2\2\u0202\u008a\3\2\2\2\u0203\u0204\t\32\2\2\u0204\u008c\3\2\2\2"+
		"\u0205\u0206\t\33\2\2\u0206\u008e\3\2\2\2\u0207\u0208\5\u0087D\2\u0208"+
		"\u020a\7\60\2\2\u0209\u020b\5\u0087D\2\u020a\u0209\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020b\u0090\3\2\2\2\u020c\u0211\7$\2\2\u020d\u0210\5\u0093J\2"+
		"\u020e\u0210\n\34\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0213"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0214\u021f\7$\2\2\u0215\u021a\7)\2\2\u0216\u0219\5\u0093"+
		"J\2\u0217\u0219\n\35\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021d\u021f\7)\2\2\u021e\u020c\3\2\2\2\u021e"+
		"\u0215\3\2\2\2\u021f\u0092\3\2\2\2\u0220\u0221\7^\2\2\u0221\u0222\13\2"+
		"\2\2\u0222\u0094\3\2\2\2\u0223\u0224\7?\2\2\u0224\u0225\7@\2\2\u0225\u0096"+
		"\3\2\2\2\u0226\u0228\7*\2\2\u0227\u0229\5\u009bN\2\u0228\u0227\3\2\2\2"+
		"\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\t\36\2\2\u022b\u022d"+
		"\5\u009bN\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2"+
		"\2\u022e\u022f\7+\2\2\u022f\u0098\3\2\2\2\u0230\u0232\7\17\2\2\u0231\u0233"+
		"\7\f\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0236\7\f\2\2\u0235\u0230\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u009a\3\2"+
		"\2\2\u0237\u0239\t\37\2\2\u0238\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u009c\3\2\2\2\u023c\u023e\n "+
		"\2\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u009e\3\2\2\2\22\2\u01f7\u01f9\u01ff\u020a\u020f"+
		"\u0211\u0218\u021a\u021e\u0228\u022c\u0232\u0235\u023a\u023f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}