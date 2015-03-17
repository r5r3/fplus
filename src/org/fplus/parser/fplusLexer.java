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
		Equal=1, NotEqual=2, Assign=3, Comma=4, Semicolon=5, Colon=6, LeftBrace=7, 
		RightBrace=8, Dollar=9, LeftParen=10, RightParen=11, LeftBracket=12, RightBracket=13, 
		Smaller=14, Larger=15, Exclamation=16, Plus=17, Minus=18, Star=19, Slash=20, 
		Prefix=21, Template=22, Interface=23, End=24, Do=25, Program=26, Module=27, 
		Contains=28, Function=29, Subroutine=30, Procedure=31, Recursive=32, Elemental=33, 
		Type=34, Class=35, Extends=36, Private=37, Public=38, Sequence=39, Abstract=40, 
		Bind=41, Generic=42, If=43, Then=44, Else=45, And=46, Not=47, Or=48, Integer=49, 
		Real=50, Complex=51, Logical=52, Character=53, Kind=54, Len=55, Pointer=56, 
		Dynamic_Cast=57, Identifier=58, IntegerConstant=59, FloatConstant=60, 
		StringLiteral=61, AssignPointer=62, OperatorOverload=63, Newline=64, WS=65, 
		Noise=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Equal", "NotEqual", "Assign", "Comma", "Semicolon", "Colon", "LeftBrace", 
		"RightBrace", "Dollar", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"Smaller", "Larger", "Exclamation", "Plus", "Minus", "Star", "Slash", 
		"Prefix", "Template", "Interface", "End", "Do", "Program", "Module", "Contains", 
		"Function", "Subroutine", "Procedure", "Recursive", "Elemental", "Type", 
		"Class", "Extends", "Private", "Public", "Sequence", "Abstract", "Bind", 
		"Generic", "If", "Then", "Else", "And", "Not", "Or", "Integer", "Real", 
		"Complex", "Logical", "Character", "Kind", "Len", "Pointer", "Dynamic_Cast", 
		"Identifier", "IntegerConstant", "Nondigit", "NonzeroDigit", "Digit", 
		"FloatConstant", "StringLiteral", "AssignPointer", "OperatorOverload", 
		"Newline", "WS", "Noise"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'=='", "'/='", "'='", "','", "';'", "':'", "'{'", "'}'", "'$'", 
		"'('", "')'", "'['", "']'", "'<'", "'>'", "'!'", "'+'", "'-'", "'*'", 
		"'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Equal", "NotEqual", "Assign", "Comma", "Semicolon", "Colon", "LeftBrace", 
		"RightBrace", "Dollar", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
		"Smaller", "Larger", "Exclamation", "Plus", "Minus", "Star", "Slash", 
		"Prefix", "Template", "Interface", "End", "Do", "Program", "Module", "Contains", 
		"Function", "Subroutine", "Procedure", "Recursive", "Elemental", "Type", 
		"Class", "Extends", "Private", "Public", "Sequence", "Abstract", "Bind", 
		"Generic", "If", "Then", "Else", "And", "Not", "Or", "Integer", "Real", 
		"Complex", "Logical", "Character", "Kind", "Len", "Pointer", "Dynamic_Cast", 
		"Identifier", "IntegerConstant", "FloatConstant", "StringLiteral", "AssignPointer", 
		"OperatorOverload", "Newline", "WS", "Noise"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u0204\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3;\3;\3;\7;\u01c9\n;\f;\16;\u01cc\13;\3<\6<\u01cf\n<\r<\16<\u01d0"+
		"\3=\3=\3>\3>\3?\3?\3@\3@\3@\5@\u01dc\n@\3A\3A\7A\u01e0\nA\fA\16A\u01e3"+
		"\13A\3A\3A\3B\3B\3B\3C\3C\5C\u01ec\nC\3C\3C\5C\u01f0\nC\3C\3C\3D\3D\5"+
		"D\u01f6\nD\3D\5D\u01f9\nD\3E\6E\u01fc\nE\rE\16E\u01fd\3F\6F\u0201\nF\r"+
		"F\16F\u0202\4\u01e1\u0202\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y\2{\2}\2\177>\u0081?\u0083@\u0085"+
		"A\u0087B\u0089C\u008bD\3\2\37\4\2HHhh\4\2RRrr\4\2VVvv\4\2GGgg\4\2OOoo"+
		"\4\2NNnn\4\2CCcc\4\2KKkk\4\2PPpp\4\2TTtt\4\2EEee\4\2FFff\4\2QQqq\4\2I"+
		"Iii\4\2WWww\4\2UUuu\4\2DDdd\4\2XXxx\4\2[[{{\4\2ZZzz\4\2SSss\4\2JJjj\4"+
		"\2MMmm\5\2C\\aac|\3\2\63;\3\2\62;\6\2,-//\61\61??\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\u020b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0090\3\2\2"+
		"\2\7\u0093\3\2\2\2\t\u0095\3\2\2\2\13\u0097\3\2\2\2\r\u0099\3\2\2\2\17"+
		"\u009b\3\2\2\2\21\u009d\3\2\2\2\23\u009f\3\2\2\2\25\u00a1\3\2\2\2\27\u00a3"+
		"\3\2\2\2\31\u00a5\3\2\2\2\33\u00a7\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3"+
		"\2\2\2!\u00ad\3\2\2\2#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5"+
		"\3\2\2\2+\u00b7\3\2\2\2-\u00bd\3\2\2\2/\u00c6\3\2\2\2\61\u00d0\3\2\2\2"+
		"\63\u00d4\3\2\2\2\65\u00d7\3\2\2\2\67\u00df\3\2\2\29\u00e6\3\2\2\2;\u00ef"+
		"\3\2\2\2=\u00f8\3\2\2\2?\u0103\3\2\2\2A\u010d\3\2\2\2C\u0117\3\2\2\2E"+
		"\u0121\3\2\2\2G\u0126\3\2\2\2I\u012c\3\2\2\2K\u0134\3\2\2\2M\u013c\3\2"+
		"\2\2O\u0143\3\2\2\2Q\u014c\3\2\2\2S\u0155\3\2\2\2U\u015a\3\2\2\2W\u0162"+
		"\3\2\2\2Y\u0165\3\2\2\2[\u016a\3\2\2\2]\u016f\3\2\2\2_\u0175\3\2\2\2a"+
		"\u017b\3\2\2\2c\u0180\3\2\2\2e\u0188\3\2\2\2g\u018d\3\2\2\2i\u0195\3\2"+
		"\2\2k\u019d\3\2\2\2m\u01a7\3\2\2\2o\u01ac\3\2\2\2q\u01b0\3\2\2\2s\u01b8"+
		"\3\2\2\2u\u01c5\3\2\2\2w\u01ce\3\2\2\2y\u01d2\3\2\2\2{\u01d4\3\2\2\2}"+
		"\u01d6\3\2\2\2\177\u01d8\3\2\2\2\u0081\u01dd\3\2\2\2\u0083\u01e6\3\2\2"+
		"\2\u0085\u01e9\3\2\2\2\u0087\u01f8\3\2\2\2\u0089\u01fb\3\2\2\2\u008b\u0200"+
		"\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7?\2\2\u008f\4\3\2\2\2\u0090\u0091"+
		"\7\61\2\2\u0091\u0092\7?\2\2\u0092\6\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"\b\3\2\2\2\u0095\u0096\7.\2\2\u0096\n\3\2\2\2\u0097\u0098\7=\2\2\u0098"+
		"\f\3\2\2\2\u0099\u009a\7<\2\2\u009a\16\3\2\2\2\u009b\u009c\7}\2\2\u009c"+
		"\20\3\2\2\2\u009d\u009e\7\177\2\2\u009e\22\3\2\2\2\u009f\u00a0\7&\2\2"+
		"\u00a0\24\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7+\2"+
		"\2\u00a4\30\3\2\2\2\u00a5\u00a6\7]\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7"+
		"_\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\36\3\2\2\2\u00ab\u00ac"+
		"\7@\2\2\u00ac \3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\"\3\2\2\2\u00af\u00b0"+
		"\7-\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7"+
		",\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7"+
		"#\2\2\u00b8\u00b9\7&\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\t\2\2\2\u00bb"+
		"\u00bc\t\3\2\2\u00bc,\3\2\2\2\u00bd\u00be\t\4\2\2\u00be\u00bf\t\5\2\2"+
		"\u00bf\u00c0\t\6\2\2\u00c0\u00c1\t\3\2\2\u00c1\u00c2\t\7\2\2\u00c2\u00c3"+
		"\t\b\2\2\u00c3\u00c4\t\4\2\2\u00c4\u00c5\t\5\2\2\u00c5.\3\2\2\2\u00c6"+
		"\u00c7\t\t\2\2\u00c7\u00c8\t\n\2\2\u00c8\u00c9\t\4\2\2\u00c9\u00ca\t\5"+
		"\2\2\u00ca\u00cb\t\13\2\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\t\b\2\2\u00cd"+
		"\u00ce\t\f\2\2\u00ce\u00cf\t\5\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\t\5\2"+
		"\2\u00d1\u00d2\t\n\2\2\u00d2\u00d3\t\r\2\2\u00d3\62\3\2\2\2\u00d4\u00d5"+
		"\t\r\2\2\u00d5\u00d6\t\16\2\2\u00d6\64\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8"+
		"\u00d9\t\13\2\2\u00d9\u00da\t\16\2\2\u00da\u00db\t\17\2\2\u00db\u00dc"+
		"\t\13\2\2\u00dc\u00dd\t\b\2\2\u00dd\u00de\t\6\2\2\u00de\66\3\2\2\2\u00df"+
		"\u00e0\t\6\2\2\u00e0\u00e1\t\16\2\2\u00e1\u00e2\t\r\2\2\u00e2\u00e3\t"+
		"\20\2\2\u00e3\u00e4\t\7\2\2\u00e4\u00e5\t\5\2\2\u00e58\3\2\2\2\u00e6\u00e7"+
		"\t\f\2\2\u00e7\u00e8\t\16\2\2\u00e8\u00e9\t\n\2\2\u00e9\u00ea\t\4\2\2"+
		"\u00ea\u00eb\t\b\2\2\u00eb\u00ec\t\t\2\2\u00ec\u00ed\t\n\2\2\u00ed\u00ee"+
		"\t\21\2\2\u00ee:\3\2\2\2\u00ef\u00f0\t\2\2\2\u00f0\u00f1\t\20\2\2\u00f1"+
		"\u00f2\t\n\2\2\u00f2\u00f3\t\f\2\2\u00f3\u00f4\t\4\2\2\u00f4\u00f5\t\t"+
		"\2\2\u00f5\u00f6\t\16\2\2\u00f6\u00f7\t\n\2\2\u00f7<\3\2\2\2\u00f8\u00f9"+
		"\t\21\2\2\u00f9\u00fa\t\20\2\2\u00fa\u00fb\t\22\2\2\u00fb\u00fc\t\13\2"+
		"\2\u00fc\u00fd\t\16\2\2\u00fd\u00fe\t\20\2\2\u00fe\u00ff\t\4\2\2\u00ff"+
		"\u0100\t\t\2\2\u0100\u0101\t\n\2\2\u0101\u0102\t\5\2\2\u0102>\3\2\2\2"+
		"\u0103\u0104\t\3\2\2\u0104\u0105\t\13\2\2\u0105\u0106\t\16\2\2\u0106\u0107"+
		"\t\f\2\2\u0107\u0108\t\5\2\2\u0108\u0109\t\r\2\2\u0109\u010a\t\20\2\2"+
		"\u010a\u010b\t\13\2\2\u010b\u010c\t\5\2\2\u010c@\3\2\2\2\u010d\u010e\t"+
		"\13\2\2\u010e\u010f\t\5\2\2\u010f\u0110\t\f\2\2\u0110\u0111\t\20\2\2\u0111"+
		"\u0112\t\13\2\2\u0112\u0113\t\21\2\2\u0113\u0114\t\t\2\2\u0114\u0115\t"+
		"\23\2\2\u0115\u0116\t\5\2\2\u0116B\3\2\2\2\u0117\u0118\t\5\2\2\u0118\u0119"+
		"\t\7\2\2\u0119\u011a\t\5\2\2\u011a\u011b\t\6\2\2\u011b\u011c\t\5\2\2\u011c"+
		"\u011d\t\n\2\2\u011d\u011e\t\4\2\2\u011e\u011f\t\b\2\2\u011f\u0120\t\7"+
		"\2\2\u0120D\3\2\2\2\u0121\u0122\t\4\2\2\u0122\u0123\t\24\2\2\u0123\u0124"+
		"\t\3\2\2\u0124\u0125\t\5\2\2\u0125F\3\2\2\2\u0126\u0127\t\f\2\2\u0127"+
		"\u0128\t\7\2\2\u0128\u0129\t\b\2\2\u0129\u012a\t\21\2\2\u012a\u012b\t"+
		"\21\2\2\u012bH\3\2\2\2\u012c\u012d\t\5\2\2\u012d\u012e\t\25\2\2\u012e"+
		"\u012f\t\4\2\2\u012f\u0130\t\5\2\2\u0130\u0131\t\n\2\2\u0131\u0132\t\r"+
		"\2\2\u0132\u0133\t\21\2\2\u0133J\3\2\2\2\u0134\u0135\t\3\2\2\u0135\u0136"+
		"\t\13\2\2\u0136\u0137\t\t\2\2\u0137\u0138\t\23\2\2\u0138\u0139\t\b\2\2"+
		"\u0139\u013a\t\4\2\2\u013a\u013b\t\5\2\2\u013bL\3\2\2\2\u013c\u013d\t"+
		"\3\2\2\u013d\u013e\t\20\2\2\u013e\u013f\t\22\2\2\u013f\u0140\t\7\2\2\u0140"+
		"\u0141\t\t\2\2\u0141\u0142\t\f\2\2\u0142N\3\2\2\2\u0143\u0144\t\21\2\2"+
		"\u0144\u0145\t\5\2\2\u0145\u0146\t\26\2\2\u0146\u0147\t\20\2\2\u0147\u0148"+
		"\t\5\2\2\u0148\u0149\t\n\2\2\u0149\u014a\t\f\2\2\u014a\u014b\t\5\2\2\u014b"+
		"P\3\2\2\2\u014c\u014d\t\b\2\2\u014d\u014e\t\22\2\2\u014e\u014f\t\21\2"+
		"\2\u014f\u0150\t\4\2\2\u0150\u0151\t\13\2\2\u0151\u0152\t\b\2\2\u0152"+
		"\u0153\t\f\2\2\u0153\u0154\t\4\2\2\u0154R\3\2\2\2\u0155\u0156\t\22\2\2"+
		"\u0156\u0157\t\t\2\2\u0157\u0158\t\n\2\2\u0158\u0159\t\r\2\2\u0159T\3"+
		"\2\2\2\u015a\u015b\t\17\2\2\u015b\u015c\t\5\2\2\u015c\u015d\t\n\2\2\u015d"+
		"\u015e\t\5\2\2\u015e\u015f\t\13\2\2\u015f\u0160\t\t\2\2\u0160\u0161\t"+
		"\f\2\2\u0161V\3\2\2\2\u0162\u0163\t\t\2\2\u0163\u0164\t\2\2\2\u0164X\3"+
		"\2\2\2\u0165\u0166\t\4\2\2\u0166\u0167\t\27\2\2\u0167\u0168\t\5\2\2\u0168"+
		"\u0169\t\n\2\2\u0169Z\3\2\2\2\u016a\u016b\t\5\2\2\u016b\u016c\t\7\2\2"+
		"\u016c\u016d\t\21\2\2\u016d\u016e\t\5\2\2\u016e\\\3\2\2\2\u016f\u0170"+
		"\7\60\2\2\u0170\u0171\t\b\2\2\u0171\u0172\t\n\2\2\u0172\u0173\t\r\2\2"+
		"\u0173\u0174\7\60\2\2\u0174^\3\2\2\2\u0175\u0176\7\60\2\2\u0176\u0177"+
		"\t\n\2\2\u0177\u0178\t\16\2\2\u0178\u0179\t\4\2\2\u0179\u017a\7\60\2\2"+
		"\u017a`\3\2\2\2\u017b\u017c\7\60\2\2\u017c\u017d\t\16\2\2\u017d\u017e"+
		"\t\13\2\2\u017e\u017f\7\60\2\2\u017fb\3\2\2\2\u0180\u0181\t\t\2\2\u0181"+
		"\u0182\t\n\2\2\u0182\u0183\t\4\2\2\u0183\u0184\t\5\2\2\u0184\u0185\t\17"+
		"\2\2\u0185\u0186\t\5\2\2\u0186\u0187\t\13\2\2\u0187d\3\2\2\2\u0188\u0189"+
		"\t\13\2\2\u0189\u018a\t\5\2\2\u018a\u018b\t\b\2\2\u018b\u018c\t\7\2\2"+
		"\u018cf\3\2\2\2\u018d\u018e\t\f\2\2\u018e\u018f\t\16\2\2\u018f\u0190\t"+
		"\6\2\2\u0190\u0191\t\3\2\2\u0191\u0192\t\7\2\2\u0192\u0193\t\5\2\2\u0193"+
		"\u0194\t\25\2\2\u0194h\3\2\2\2\u0195\u0196\t\7\2\2\u0196\u0197\t\16\2"+
		"\2\u0197\u0198\t\17\2\2\u0198\u0199\t\t\2\2\u0199\u019a\t\f\2\2\u019a"+
		"\u019b\t\b\2\2\u019b\u019c\t\7\2\2\u019cj\3\2\2\2\u019d\u019e\t\f\2\2"+
		"\u019e\u019f\t\27\2\2\u019f\u01a0\t\b\2\2\u01a0\u01a1\t\13\2\2\u01a1\u01a2"+
		"\t\b\2\2\u01a2\u01a3\t\f\2\2\u01a3\u01a4\t\4\2\2\u01a4\u01a5\t\5\2\2\u01a5"+
		"\u01a6\t\13\2\2\u01a6l\3\2\2\2\u01a7\u01a8\t\30\2\2\u01a8\u01a9\t\t\2"+
		"\2\u01a9\u01aa\t\n\2\2\u01aa\u01ab\t\r\2\2\u01abn\3\2\2\2\u01ac\u01ad"+
		"\t\7\2\2\u01ad\u01ae\t\5\2\2\u01ae\u01af\t\n\2\2\u01afp\3\2\2\2\u01b0"+
		"\u01b1\t\3\2\2\u01b1\u01b2\t\16\2\2\u01b2\u01b3\t\t\2\2\u01b3\u01b4\t"+
		"\n\2\2\u01b4\u01b5\t\4\2\2\u01b5\u01b6\t\5\2\2\u01b6\u01b7\t\13\2\2\u01b7"+
		"r\3\2\2\2\u01b8\u01b9\t\r\2\2\u01b9\u01ba\t\24\2\2\u01ba\u01bb\t\n\2\2"+
		"\u01bb\u01bc\t\b\2\2\u01bc\u01bd\t\6\2\2\u01bd\u01be\t\t\2\2\u01be\u01bf"+
		"\t\f\2\2\u01bf\u01c0\7a\2\2\u01c0\u01c1\t\f\2\2\u01c1\u01c2\t\b\2\2\u01c2"+
		"\u01c3\t\21\2\2\u01c3\u01c4\t\4\2\2\u01c4t\3\2\2\2\u01c5\u01ca\5y=\2\u01c6"+
		"\u01c9\5y=\2\u01c7\u01c9\5}?\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2"+
		"\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbv\3"+
		"\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01cf\5}?\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1x\3\2\2\2"+
		"\u01d2\u01d3\t\31\2\2\u01d3z\3\2\2\2\u01d4\u01d5\t\32\2\2\u01d5|\3\2\2"+
		"\2\u01d6\u01d7\t\33\2\2\u01d7~\3\2\2\2\u01d8\u01d9\5w<\2\u01d9\u01db\7"+
		"\60\2\2\u01da\u01dc\5w<\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u0080\3\2\2\2\u01dd\u01e1\7$\2\2\u01de\u01e0\13\2\2\2\u01df\u01de\3\2"+
		"\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7$\2\2\u01e5\u0082\3\2"+
		"\2\2\u01e6\u01e7\7?\2\2\u01e7\u01e8\7@\2\2\u01e8\u0084\3\2\2\2\u01e9\u01eb"+
		"\7*\2\2\u01ea\u01ec\5\u0089E\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2"+
		"\u01ec\u01ed\3\2\2\2\u01ed\u01ef\t\34\2\2\u01ee\u01f0\5\u0089E\2\u01ef"+
		"\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\7+"+
		"\2\2\u01f2\u0086\3\2\2\2\u01f3\u01f5\7\17\2\2\u01f4\u01f6\7\f\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f9\7\f"+
		"\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u0088\3\2\2\2\u01fa"+
		"\u01fc\t\35\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb\3"+
		"\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u008a\3\2\2\2\u01ff\u0201\n\36\2\2\u0200"+
		"\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0202\u0200\3\2"+
		"\2\2\u0203\u008c\3\2\2\2\16\2\u01c8\u01ca\u01d0\u01db\u01e1\u01eb\u01ef"+
		"\u01f5\u01f8\u01fd\u0202\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}