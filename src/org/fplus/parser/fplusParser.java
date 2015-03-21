// Generated from fplus.g4 by ANTLR 4.5
package org.fplus.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fplusParser extends Parser {
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
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_containsLine = 3, 
		RULE_templateBlock = 4, RULE_loopBlock = 5, RULE_loopBegin = 6, RULE_procedureBlock = 7, 
		RULE_functionBlock = 8, RULE_subroutineBlock = 9, RULE_typeDefinitionBlock = 10, 
		RULE_dataType = 11, RULE_dataTypeParameter = 12, RULE_fortranInterfaceBlock = 13, 
		RULE_typeAttributes = 14, RULE_genericTypeBoundLine = 15, RULE_interfaceLine = 16, 
		RULE_list = 17, RULE_listItem = 18, RULE_listAssignment = 19, RULE_ifStatement = 20, 
		RULE_ifSingleLine = 21, RULE_ifBlock = 22, RULE_contentBlock = 23, RULE_content = 24, 
		RULE_lineContinuation = 25, RULE_contentLine = 26, RULE_placeholder = 27, 
		RULE_dynamicCast = 28, RULE_variableDefinition = 29, RULE_lineComment = 30, 
		RULE_expr = 31, RULE_logicalExpr = 32;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "containsLine", "templateBlock", 
		"loopBlock", "loopBegin", "procedureBlock", "functionBlock", "subroutineBlock", 
		"typeDefinitionBlock", "dataType", "dataTypeParameter", "fortranInterfaceBlock", 
		"typeAttributes", "genericTypeBoundLine", "interfaceLine", "list", "listItem", 
		"listAssignment", "ifStatement", "ifSingleLine", "ifBlock", "contentBlock", 
		"content", "lineContinuation", "contentLine", "placeholder", "dynamicCast", 
		"variableDefinition", "lineComment", "expr", "logicalExpr"
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

	@Override
	public String getGrammarFileName() { return "fplus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fplusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FortranFileContext extends ParserRuleContext {
		public List<ModuleBlockContext> moduleBlock() {
			return getRuleContexts(ModuleBlockContext.class);
		}
		public ModuleBlockContext moduleBlock(int i) {
			return getRuleContext(ModuleBlockContext.class,i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public ProgramBlockContext programBlock() {
			return getRuleContext(ProgramBlockContext.class,0);
		}
		public FortranFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fortranFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterFortranFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitFortranFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFortranFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FortranFileContext fortranFile() throws RecognitionException {
		FortranFileContext _localctx = new FortranFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fortranFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(68);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(66);
						moduleBlock();
						}
						break;
					case 2:
						{
						setState(67);
						contentBlock();
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(73);
				programBlock();
				}
				break;
			}
			setState(77);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (Newline - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				setState(76);
				contentBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramBlockContext extends ParserRuleContext {
		public List<TerminalNode> Program() { return getTokens(fplusParser.Program); }
		public TerminalNode Program(int i) {
			return getToken(fplusParser.Program, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public ContainsLineContext containsLine() {
			return getRuleContext(ContainsLineContext.class,0);
		}
		public ProgramBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterProgramBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitProgramBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitProgramBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBlockContext programBlock() throws RecognitionException {
		ProgramBlockContext _localctx = new ProgramBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(79);
				match(WS);
				}
			}

			setState(82);
			match(Program);
			setState(83);
			match(WS);
			setState(84);
			match(Identifier);
			setState(86);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(85);
				match(WS);
				}
			}

			setState(88);
			match(Newline);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					contentBlock();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(95);
				containsLine();
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					contentBlock();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(105);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(104);
				match(WS);
				}
			}

			setState(107);
			match(End);
			setState(108);
			match(WS);
			setState(109);
			match(Program);
			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(110);
				match(WS);
				}
				break;
			}
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(113);
				match(Identifier);
				}
				break;
			}
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(116);
				match(WS);
				}
				break;
			}
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(119);
				match(Newline);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleBlockContext extends ParserRuleContext {
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<InterfaceLineContext> interfaceLine() {
			return getRuleContexts(InterfaceLineContext.class);
		}
		public InterfaceLineContext interfaceLine(int i) {
			return getRuleContext(InterfaceLineContext.class,i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public ContainsLineContext containsLine() {
			return getRuleContext(ContainsLineContext.class,0);
		}
		public ModuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterModuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitModuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitModuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleBlockContext moduleBlock() throws RecognitionException {
		ModuleBlockContext _localctx = new ModuleBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(122);
				match(WS);
				}
			}

			setState(125);
			match(Module);
			setState(126);
			match(WS);
			setState(127);
			match(Identifier);
			setState(129);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(128);
				match(WS);
				}
			}

			setState(131);
			match(Newline);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(134);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(132);
						interfaceLine();
						}
						break;
					case 2:
						{
						setState(133);
						contentBlock();
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(139);
				containsLine();
				}
				break;
			}
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(142);
				contentBlock();
				}
				break;
			}
			setState(146);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(145);
				match(WS);
				}
			}

			setState(148);
			match(End);
			setState(149);
			match(WS);
			setState(150);
			match(Module);
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(151);
				match(WS);
				}
				break;
			}
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(154);
				match(Identifier);
				}
				break;
			}
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(157);
				match(Newline);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainsLineContext extends ParserRuleContext {
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ContainsLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_containsLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContainsLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContainsLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContainsLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsLineContext containsLine() throws RecognitionException {
		ContainsLineContext _localctx = new ContainsLineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_containsLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(160);
				match(WS);
				}
			}

			setState(163);
			match(Contains);
			setState(165);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(164);
				match(WS);
				}
			}

			setState(167);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateBlockContext extends ParserRuleContext {
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Template() { return getTokens(fplusParser.Template); }
		public TerminalNode Template(int i) {
			return getToken(fplusParser.Template, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode OperatorOverload() { return getToken(fplusParser.OperatorOverload, 0); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TemplateBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterTemplateBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitTemplateBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTemplateBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBlockContext templateBlock() throws RecognitionException {
		TemplateBlockContext _localctx = new TemplateBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_templateBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(169);
				match(WS);
				}
			}

			setState(172);
			match(Prefix);
			setState(173);
			match(WS);
			setState(174);
			match(Template);
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(175);
				match(WS);
				}
				break;
			}
			setState(179);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(178);
				match(Identifier);
				}
			}

			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(181);
				match(WS);
				}
				break;
			}
			setState(185);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(184);
				match(OperatorOverload);
				}
			}

			setState(188);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(187);
				match(WS);
				}
			}

			setState(190);
			match(Newline);
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(191);
				contentBlock();
				}
				break;
			}
			setState(195);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(194);
				match(WS);
				}
			}

			setState(197);
			match(Prefix);
			setState(198);
			match(WS);
			setState(199);
			match(End);
			setState(200);
			match(WS);
			setState(201);
			match(Template);
			setState(203);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(202);
				match(WS);
				}
			}

			setState(206);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(205);
				match(Identifier);
				}
			}

			setState(208);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBlockContext extends ParserRuleContext {
		public LoopBeginContext loopBegin() {
			return getRuleContext(LoopBeginContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			loopBegin();
			setState(212);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(211);
				match(WS);
				}
			}

			setState(214);
			match(Newline);
			setState(215);
			contentBlock();
			setState(217);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(216);
				match(WS);
				}
			}

			setState(219);
			match(Prefix);
			setState(220);
			match(WS);
			setState(221);
			match(End);
			setState(222);
			match(WS);
			setState(223);
			match(Do);
			setState(225);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(224);
				match(WS);
				}
			}

			setState(227);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBeginContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public LoopBeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBegin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLoopBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLoopBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLoopBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBeginContext loopBegin() throws RecognitionException {
		LoopBeginContext _localctx = new LoopBeginContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loopBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(229);
				match(WS);
				}
			}

			setState(232);
			match(Prefix);
			setState(233);
			match(WS);
			setState(234);
			match(Do);
			setState(235);
			match(WS);
			setState(236);
			listAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureBlockContext extends ParserRuleContext {
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public SubroutineBlockContext subroutineBlock() {
			return getRuleContext(SubroutineBlockContext.class,0);
		}
		public ProcedureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterProcedureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitProcedureBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitProcedureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBlockContext procedureBlock() throws RecognitionException {
		ProcedureBlockContext _localctx = new ProcedureBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedureBlock);
		try {
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				functionBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				subroutineBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBlockContext extends ParserRuleContext {
		public List<TerminalNode> Function() { return getTokens(fplusParser.Function); }
		public TerminalNode Function(int i) {
			return getToken(fplusParser.Function, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				setState(244);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(242);
					placeholder();
					}
					break;
				case 2:
					{
					setState(243);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Function || _la==Newline) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(Function);
			setState(250);
			match(WS);
			setState(251);
			match(Identifier);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(Newline);
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(259);
				contentBlock();
				}
				break;
			}
			setState(263);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(262);
				match(WS);
				}
			}

			setState(265);
			match(End);
			setState(266);
			match(WS);
			setState(267);
			match(Function);
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(268);
				match(WS);
				}
				break;
			}
			setState(272);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(271);
				match(Identifier);
				}
			}

			setState(275);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(274);
				match(WS);
				}
			}

			setState(277);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineBlockContext extends ParserRuleContext {
		public List<TerminalNode> Subroutine() { return getTokens(fplusParser.Subroutine); }
		public TerminalNode Subroutine(int i) {
			return getToken(fplusParser.Subroutine, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode Recursive() { return getToken(fplusParser.Recursive, 0); }
		public TerminalNode Elemental() { return getToken(fplusParser.Elemental, 0); }
		public SubroutineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterSubroutineBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitSubroutineBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitSubroutineBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineBlockContext subroutineBlock() throws RecognitionException {
		SubroutineBlockContext _localctx = new SubroutineBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subroutineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(279);
				match(WS);
				}
				break;
			}
			setState(283);
			_la = _input.LA(1);
			if (_la==Recursive || _la==Elemental) {
				{
				setState(282);
				_la = _input.LA(1);
				if ( !(_la==Recursive || _la==Elemental) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(286);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(285);
				match(WS);
				}
			}

			setState(288);
			match(Subroutine);
			setState(289);
			match(WS);
			setState(290);
			match(Identifier);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				{
				setState(291);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(Newline);
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(298);
				contentBlock();
				}
				break;
			}
			setState(302);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(301);
				match(WS);
				}
			}

			setState(304);
			match(End);
			setState(305);
			match(WS);
			setState(306);
			match(Subroutine);
			setState(308);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(307);
				match(WS);
				}
				break;
			}
			setState(311);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(310);
				match(Identifier);
				}
			}

			setState(314);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(313);
				match(WS);
				}
			}

			setState(316);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionBlockContext extends ParserRuleContext {
		public List<TerminalNode> Type() { return getTokens(fplusParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(fplusParser.Type, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TypeAttributesContext> typeAttributes() {
			return getRuleContexts(TypeAttributesContext.class);
		}
		public TypeAttributesContext typeAttributes(int i) {
			return getRuleContext(TypeAttributesContext.class,i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public List<GenericTypeBoundLineContext> genericTypeBoundLine() {
			return getRuleContexts(GenericTypeBoundLineContext.class);
		}
		public GenericTypeBoundLineContext genericTypeBoundLine(int i) {
			return getRuleContext(GenericTypeBoundLineContext.class,i);
		}
		public TypeDefinitionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterTypeDefinitionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitTypeDefinitionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTypeDefinitionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionBlockContext typeDefinitionBlock() throws RecognitionException {
		TypeDefinitionBlockContext _localctx = new TypeDefinitionBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDefinitionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(318);
				match(WS);
				}
			}

			setState(321);
			match(Type);
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(322);
				match(WS);
				}
				break;
			}
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(325);
						match(WS);
						}
					}

					setState(328);
					match(Comma);
					setState(330);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(329);
						match(WS);
						}
					}

					setState(332);
					typeAttributes();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(338);
				match(WS);
				}
				break;
			}
			setState(343);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(341);
				match(Colon);
				setState(342);
				match(Colon);
				}
			}

			setState(346);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(345);
				match(WS);
				}
			}

			setState(348);
			match(Identifier);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				{
				setState(349);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(Newline);
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(356);
				contentBlock();
				}
				break;
			}
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(360);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(359);
					match(WS);
					}
				}

				setState(362);
				match(Contains);
				setState(364);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(363);
					match(WS);
					}
				}

				setState(366);
				match(Newline);
				}
				break;
			}
			setState(373);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(371);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(369);
						contentBlock();
						}
						break;
					case 2:
						{
						setState(370);
						genericTypeBoundLine();
						}
						break;
					}
					} 
				}
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(377);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(376);
				match(WS);
				}
			}

			setState(379);
			match(End);
			setState(380);
			match(WS);
			setState(381);
			match(Type);
			setState(383);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(382);
				match(WS);
				}
				break;
			}
			setState(386);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(385);
				match(Identifier);
				}
			}

			setState(389);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(388);
				match(WS);
				}
			}

			setState(391);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(fplusParser.Type, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Class() { return getToken(fplusParser.Class, 0); }
		public TerminalNode Integer() { return getToken(fplusParser.Integer, 0); }
		public TerminalNode Real() { return getToken(fplusParser.Real, 0); }
		public TerminalNode Complex() { return getToken(fplusParser.Complex, 0); }
		public TerminalNode Logical() { return getToken(fplusParser.Logical, 0); }
		public TerminalNode Character() { return getToken(fplusParser.Character, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode IntegerConstant() { return getToken(fplusParser.IntegerConstant, 0); }
		public TerminalNode Kind() { return getToken(fplusParser.Kind, 0); }
		public TerminalNode Len() { return getToken(fplusParser.Len, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			switch (_input.LA(1)) {
			case Integer:
			case Real:
			case Complex:
			case Logical:
			case Character:
				{
				setState(393);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(395);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(394);
					match(WS);
					}
					break;
				}
				setState(424);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(397);
					match(LeftParen);
					setState(399);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(398);
						match(WS);
						}
					}

					setState(417);
					switch (_input.LA(1)) {
					case Kind:
						{
						setState(401);
						match(Kind);
						setState(403);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(402);
							match(WS);
							}
						}

						setState(405);
						match(Assign);
						setState(407);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(406);
							match(WS);
							}
						}

						}
						break;
					case Len:
						{
						setState(409);
						match(Len);
						setState(411);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(410);
							match(WS);
							}
						}

						setState(413);
						match(Assign);
						setState(415);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(414);
							match(WS);
							}
						}

						}
						break;
					case Identifier:
					case IntegerConstant:
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(419);
					_la = _input.LA(1);
					if ( !(_la==Identifier || _la==IntegerConstant) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(421);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(420);
						match(WS);
						}
					}

					setState(423);
					match(RightParen);
					}
				}

				}
				break;
			case Type:
				{
				setState(426);
				match(Type);
				setState(428);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(427);
					match(WS);
					}
				}

				setState(430);
				match(LeftParen);
				setState(432);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(431);
					match(WS);
					}
				}

				setState(434);
				match(Identifier);
				setState(436);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(435);
					match(WS);
					}
				}

				setState(438);
				match(RightParen);
				}
				break;
			case Class:
				{
				setState(439);
				match(Class);
				setState(441);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(440);
					match(WS);
					}
				}

				setState(443);
				match(LeftParen);
				setState(445);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(444);
					match(WS);
					}
				}

				setState(447);
				match(Identifier);
				setState(449);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(448);
					match(WS);
					}
				}

				setState(451);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeParameterContext extends ParserRuleContext {
		public TerminalNode Pointer() { return getToken(fplusParser.Pointer, 0); }
		public DataTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterDataTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitDataTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitDataTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeParameterContext dataTypeParameter() throws RecognitionException {
		DataTypeParameterContext _localctx = new DataTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dataTypeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(Pointer);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FortranInterfaceBlockContext extends ParserRuleContext {
		public List<TerminalNode> Interface() { return getTokens(fplusParser.Interface); }
		public TerminalNode Interface(int i) {
			return getToken(fplusParser.Interface, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode OperatorOverload() { return getToken(fplusParser.OperatorOverload, 0); }
		public List<TerminalNode> Procedure() { return getTokens(fplusParser.Procedure); }
		public TerminalNode Procedure(int i) {
			return getToken(fplusParser.Procedure, i);
		}
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public FortranInterfaceBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fortranInterfaceBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterFortranInterfaceBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitFortranInterfaceBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFortranInterfaceBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FortranInterfaceBlockContext fortranInterfaceBlock() throws RecognitionException {
		FortranInterfaceBlockContext _localctx = new FortranInterfaceBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fortranInterfaceBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(456);
				match(WS);
				}
			}

			setState(459);
			match(Interface);
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(460);
				match(WS);
				}
				break;
			}
			setState(464);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(463);
				match(Identifier);
				}
			}

			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(466);
				match(WS);
				}
				break;
			}
			setState(470);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(469);
				match(OperatorOverload);
				}
			}

			setState(473);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(472);
				match(WS);
				}
			}

			setState(475);
			match(Newline);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(506);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						setState(477);
						switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
						case 1:
							{
							setState(476);
							match(WS);
							}
							break;
						}
						setState(480);
						_la = _input.LA(1);
						if (_la==Module) {
							{
							setState(479);
							match(Module);
							}
						}

						setState(483);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(482);
							match(WS);
							}
						}

						setState(485);
						match(Procedure);
						setState(486);
						match(WS);
						setState(487);
						match(Identifier);
						setState(498);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(489);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(488);
									match(WS);
									}
								}

								setState(491);
								match(Comma);
								setState(493);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(492);
									match(WS);
									}
								}

								setState(495);
								match(Identifier);
								}
								} 
							}
							setState(500);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
						}
						setState(502);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(501);
							match(WS);
							}
						}

						setState(504);
						match(Newline);
						}
						break;
					case 2:
						{
						setState(505);
						procedureBlock();
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			setState(512);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(511);
				match(WS);
				}
			}

			setState(514);
			match(End);
			setState(515);
			match(WS);
			setState(516);
			match(Interface);
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(517);
				match(WS);
				}
				break;
			}
			setState(521);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(520);
				match(Identifier);
				}
			}

			setState(524);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(523);
				match(WS);
				}
			}

			setState(526);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAttributesContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(fplusParser.Private, 0); }
		public TerminalNode Public() { return getToken(fplusParser.Public, 0); }
		public TerminalNode Sequence() { return getToken(fplusParser.Sequence, 0); }
		public TerminalNode Abstract() { return getToken(fplusParser.Abstract, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Extends() { return getToken(fplusParser.Extends, 0); }
		public TerminalNode Bind() { return getToken(fplusParser.Bind, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TypeAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterTypeAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitTypeAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTypeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAttributesContext typeAttributes() throws RecognitionException {
		TypeAttributesContext _localctx = new TypeAttributesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeAttributes);
		int _la;
		try {
			setState(542);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Sequence:
			case Abstract:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case Extends:
			case Bind:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Bind) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(531);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(530);
					match(WS);
					}
				}

				setState(533);
				match(LeftParen);
				setState(535);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(534);
					match(WS);
					}
				}

				setState(537);
				match(Identifier);
				setState(539);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(538);
					match(WS);
					}
				}

				setState(541);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypeBoundLineContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Generic() { return getToken(fplusParser.Generic, 0); }
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode AssignPointer() { return getToken(fplusParser.AssignPointer, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> Private() { return getTokens(fplusParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(fplusParser.Private, i);
		}
		public List<TerminalNode> Public() { return getTokens(fplusParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(fplusParser.Public, i);
		}
		public GenericTypeBoundLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeBoundLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterGenericTypeBoundLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitGenericTypeBoundLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitGenericTypeBoundLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeBoundLineContext genericTypeBoundLine() throws RecognitionException {
		GenericTypeBoundLineContext _localctx = new GenericTypeBoundLineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericTypeBoundLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(544);
				match(WS);
				}
			}

			setState(547);
			match(Prefix);
			setState(548);
			match(WS);
			setState(549);
			match(Generic);
			setState(551);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(550);
				match(WS);
				}
				break;
			}
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(554);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(553);
						match(WS);
						}
					}

					setState(556);
					match(Comma);
					setState(558);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(557);
						match(WS);
						}
					}

					setState(560);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			setState(567);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(566);
				match(WS);
				}
			}

			setState(569);
			match(Colon);
			setState(570);
			match(Colon);
			setState(572);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(571);
				match(WS);
				}
			}

			setState(574);
			match(Identifier);
			setState(576);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(575);
				match(WS);
				}
			}

			setState(578);
			match(AssignPointer);
			setState(580);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(579);
				match(WS);
				}
			}

			setState(582);
			match(Identifier);
			setState(584);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(583);
				match(WS);
				}
			}

			setState(586);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceLineContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Interface() { return getToken(fplusParser.Interface, 0); }
		public TerminalNode Template() { return getToken(fplusParser.Template, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public TerminalNode OperatorOverload() { return getToken(fplusParser.OperatorOverload, 0); }
		public InterfaceLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterInterfaceLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitInterfaceLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitInterfaceLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceLineContext interfaceLine() throws RecognitionException {
		InterfaceLineContext _localctx = new InterfaceLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_interfaceLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(588);
				match(WS);
				}
			}

			setState(591);
			match(Prefix);
			setState(592);
			match(WS);
			setState(593);
			match(Interface);
			setState(594);
			match(WS);
			setState(595);
			match(Template);
			setState(596);
			match(WS);
			setState(597);
			match(Identifier);
			setState(599);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(598);
				match(WS);
				}
				break;
			}
			setState(602);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(601);
				match(OperatorOverload);
				}
			}

			setState(605);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(604);
				match(WS);
				}
			}

			setState(607);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			listItem();
			setState(614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(610);
					match(WS);
					setState(611);
					listItem();
					}
					} 
				}
				setState(616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListItemContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitListItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitListItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(626);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(LeftBrace);
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(618);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(623);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				setState(624);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public List<TerminalNode> IntegerConstant() { return getTokens(fplusParser.IntegerConstant); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(fplusParser.IntegerConstant, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterListAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitListAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitListAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAssignmentContext listAssignment() throws RecognitionException {
		ListAssignmentContext _localctx = new ListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listAssignment);
		int _la;
		try {
			setState(654);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				match(Identifier);
				setState(630);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(629);
					match(WS);
					}
				}

				setState(632);
				match(Assign);
				setState(634);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(633);
					match(WS);
					}
				}

				setState(636);
				match(IntegerConstant);
				setState(638);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(637);
					match(WS);
					}
				}

				setState(640);
				match(Comma);
				setState(642);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(641);
					match(WS);
					}
				}

				setState(644);
				match(IntegerConstant);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				match(Identifier);
				setState(647);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(646);
					match(WS);
					}
				}

				setState(649);
				match(Assign);
				setState(651);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(650);
					match(WS);
					}
					break;
				}
				setState(653);
				list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfSingleLineContext ifSingleLine() {
			return getRuleContext(IfSingleLineContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		try {
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				ifSingleLine();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfSingleLineContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode If() { return getToken(fplusParser.If, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public ContentLineContext contentLine() {
			return getRuleContext(ContentLineContext.class,0);
		}
		public IfSingleLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSingleLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterIfSingleLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitIfSingleLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitIfSingleLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSingleLineContext ifSingleLine() throws RecognitionException {
		IfSingleLineContext _localctx = new IfSingleLineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifSingleLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(660);
				match(WS);
				}
			}

			setState(663);
			match(Prefix);
			setState(664);
			match(WS);
			setState(665);
			match(If);
			setState(667);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(666);
				match(WS);
				}
			}

			setState(669);
			match(LeftParen);
			setState(671);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(670);
				match(WS);
				}
			}

			setState(673);
			logicalExpr(0);
			setState(675);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(674);
				match(WS);
				}
			}

			setState(677);
			match(RightParen);
			setState(679);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(678);
				match(WS);
				}
				break;
			}
			setState(681);
			contentLine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> If() { return getTokens(fplusParser.If); }
		public TerminalNode If(int i) {
			return getToken(fplusParser.If, i);
		}
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode Then() { return getToken(fplusParser.Then, 0); }
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Else() { return getToken(fplusParser.Else, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(683);
				match(WS);
				}
			}

			setState(686);
			match(Prefix);
			setState(687);
			match(WS);
			setState(688);
			match(If);
			setState(690);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(689);
				match(WS);
				}
			}

			setState(692);
			match(LeftParen);
			setState(694);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(693);
				match(WS);
				}
			}

			setState(696);
			logicalExpr(0);
			setState(698);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(697);
				match(WS);
				}
			}

			setState(700);
			match(RightParen);
			setState(702);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(701);
				match(WS);
				}
			}

			setState(704);
			match(Then);
			setState(706);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(705);
				match(WS);
				}
			}

			setState(708);
			match(Newline);
			setState(709);
			contentBlock();
			setState(721);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(711);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(710);
					match(WS);
					}
				}

				setState(713);
				match(Prefix);
				setState(714);
				match(WS);
				setState(715);
				match(Else);
				setState(717);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(716);
					match(WS);
					}
				}

				setState(719);
				match(Newline);
				setState(720);
				contentBlock();
				}
				break;
			}
			setState(724);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(723);
				match(WS);
				}
			}

			setState(726);
			match(Prefix);
			setState(727);
			match(WS);
			setState(728);
			match(End);
			setState(729);
			match(WS);
			setState(730);
			match(If);
			setState(732);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(731);
				match(WS);
				}
			}

			setState(734);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentBlockContext extends ParserRuleContext {
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
		}
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public TemplateBlockContext templateBlock(int i) {
			return getRuleContext(TemplateBlockContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public List<TypeDefinitionBlockContext> typeDefinitionBlock() {
			return getRuleContexts(TypeDefinitionBlockContext.class);
		}
		public TypeDefinitionBlockContext typeDefinitionBlock(int i) {
			return getRuleContext(TypeDefinitionBlockContext.class,i);
		}
		public List<FortranInterfaceBlockContext> fortranInterfaceBlock() {
			return getRuleContexts(FortranInterfaceBlockContext.class);
		}
		public FortranInterfaceBlockContext fortranInterfaceBlock(int i) {
			return getRuleContext(FortranInterfaceBlockContext.class,i);
		}
		public List<LineCommentContext> lineComment() {
			return getRuleContexts(LineCommentContext.class);
		}
		public LineCommentContext lineComment(int i) {
			return getRuleContext(LineCommentContext.class,i);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
		}
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public ContentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentBlockContext contentBlock() throws RecognitionException {
		ContentBlockContext _localctx = new ContentBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(745); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(745);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(736);
						loopBlock();
						}
						break;
					case 2:
						{
						setState(737);
						templateBlock();
						}
						break;
					case 3:
						{
						setState(738);
						variableDefinition();
						}
						break;
					case 4:
						{
						setState(739);
						ifStatement();
						}
						break;
					case 5:
						{
						setState(740);
						procedureBlock();
						}
						break;
					case 6:
						{
						setState(741);
						typeDefinitionBlock();
						}
						break;
					case 7:
						{
						setState(742);
						fortranInterfaceBlock();
						}
						break;
					case 8:
						{
						setState(743);
						lineComment();
						}
						break;
					case 9:
						{
						setState(744);
						contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(747); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(fplusParser.StringLiteral, 0); }
		public PlaceholderContext placeholder() {
			return getRuleContext(PlaceholderContext.class,0);
		}
		public DynamicCastContext dynamicCast() {
			return getRuleContext(DynamicCastContext.class,0);
		}
		public LineContinuationContext lineContinuation() {
			return getRuleContext(LineContinuationContext.class,0);
		}
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode Subroutine() { return getToken(fplusParser.Subroutine, 0); }
		public TerminalNode Function() { return getToken(fplusParser.Function, 0); }
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public TerminalNode Module() { return getToken(fplusParser.Module, 0); }
		public TerminalNode Program() { return getToken(fplusParser.Program, 0); }
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(749);
				match(LeftParen);
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(751);
						switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
						case 1:
							{
							setState(750);
							match(WS);
							}
							break;
						}
						setState(753);
						content();
						}
						} 
					}
					setState(758);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				setState(760);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(759);
					match(WS);
					}
				}

				setState(762);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(763);
				match(StringLiteral);
				}
				break;
			case 3:
				{
				setState(764);
				placeholder();
				}
				break;
			case 4:
				{
				setState(765);
				dynamicCast();
				}
				break;
			case 5:
				{
				setState(766);
				lineContinuation();
				}
				break;
			case 6:
				{
				setState(767);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << LeftParen) | (1L << RightParen) | (1L << Exclamation) | (1L << Prefix) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine))) != 0) || _la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContinuationContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public LineContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineContinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLineContinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLineContinuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLineContinuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContinuationContext lineContinuation() throws RecognitionException {
		LineContinuationContext _localctx = new LineContinuationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lineContinuation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(Ampersand);
			setState(772);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(771);
				match(WS);
				}
			}

			setState(774);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentLineContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public LineCommentContext lineComment() {
			return getRuleContext(LineCommentContext.class,0);
		}
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ContentLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterContentLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitContentLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContentLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentLineContext contentLine() throws RecognitionException {
		ContentLineContext _localctx = new ContentLineContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_contentLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(776);
				match(WS);
				}
				break;
			}
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(779);
					content();
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(787);
			switch (_input.LA(1)) {
			case Newline:
				{
				setState(785);
				match(Newline);
				}
				break;
			case Exclamation:
			case WS:
				{
				setState(786);
				lineComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceholderContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public PlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitPlaceholder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitPlaceholder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_placeholder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(Dollar);
			setState(790);
			match(LeftBrace);
			setState(792);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(791);
				match(WS);
				}
			}

			setState(796);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(794);
				expr(0);
				}
				break;
			case 2:
				{
				setState(795);
				logicalExpr(0);
				}
				break;
			}
			setState(799);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(798);
				match(WS);
				}
			}

			setState(801);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicCastContext extends ParserRuleContext {
		public TerminalNode Dynamic_Cast() { return getToken(fplusParser.Dynamic_Cast, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<DataTypeParameterContext> dataTypeParameter() {
			return getRuleContexts(DataTypeParameterContext.class);
		}
		public DataTypeParameterContext dataTypeParameter(int i) {
			return getRuleContext(DataTypeParameterContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public DynamicCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterDynamicCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitDynamicCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitDynamicCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DynamicCastContext dynamicCast() throws RecognitionException {
		DynamicCastContext _localctx = new DynamicCastContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dynamicCast);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(Dynamic_Cast);
			setState(805);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(804);
				match(WS);
				}
			}

			setState(807);
			match(Smaller);
			setState(809);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(808);
				match(WS);
				}
			}

			setState(811);
			dataType();
			setState(822);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(813);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(812);
						match(WS);
						}
					}

					setState(815);
					match(Comma);
					setState(817);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(816);
						match(WS);
						}
					}

					setState(819);
					dataTypeParameter();
					}
					} 
				}
				setState(824);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(826);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(825);
				match(WS);
				}
			}

			setState(828);
			match(Larger);
			setState(830);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(829);
				match(WS);
				}
			}

			setState(832);
			match(LeftParen);
			setState(837); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(834);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(833);
						match(WS);
						}
						break;
					}
					setState(836);
					content();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(839); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(842);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(841);
				match(WS);
				}
			}

			setState(844);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(846);
				match(WS);
				}
			}

			setState(849);
			match(Prefix);
			setState(850);
			match(WS);
			setState(851);
			listAssignment();
			setState(853);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(852);
				match(WS);
				}
			}

			setState(855);
			match(Newline);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineCommentContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public LineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLineComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLineComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineCommentContext lineComment() throws RecognitionException {
		LineCommentContext _localctx = new LineCommentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_lineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(857);
				match(WS);
				}
			}

			setState(860);
			match(Exclamation);
			setState(871);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(861);
				match(Newline);
				}
				break;
			case 2:
				{
				setState(862);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Dollar) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
					{
					setState(865);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(863);
						placeholder();
						}
						break;
					case 2:
						{
						setState(864);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						break;
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(870);
				match(Newline);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprConstantsContext extends ExprContext {
		public TerminalNode IntegerConstant() { return getToken(fplusParser.IntegerConstant, 0); }
		public ExprConstantsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprConstants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprArraySubscriptContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ExprArraySubscriptContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprArraySubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprArraySubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprArraySubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVariableContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public ExprVariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterExprVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitExprVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitExprVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(874);
				match(LeftParen);
				setState(876);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(875);
					match(WS);
					}
				}

				setState(878);
				expr(0);
				setState(880);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(879);
					match(WS);
					}
				}

				setState(882);
				match(RightParen);
				}
				break;
			case 2:
				{
				_localctx = new ExprConstantsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(884);
				match(IntegerConstant);
				}
				break;
			case 3:
				{
				_localctx = new ExprArraySubscriptContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(885);
				match(Identifier);
				setState(887);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(886);
					match(WS);
					}
				}

				setState(889);
				match(LeftParen);
				setState(891);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(890);
					match(WS);
					}
				}

				setState(893);
				expr(0);
				setState(895);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(894);
					match(WS);
					}
				}

				setState(897);
				match(RightParen);
				}
				break;
			case 4:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(899);
				match(Identifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(922);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(920);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(902);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(904);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(903);
							match(WS);
							}
						}

						setState(906);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Star || _la==Slash) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(908);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(907);
							match(WS);
							}
						}

						setState(910);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(911);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(913);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(912);
							match(WS);
							}
						}

						setState(915);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(917);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(916);
							match(WS);
							}
						}

						setState(919);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(924);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalExprContext extends ParserRuleContext {
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
	 
		public LogicalExprContext() { }
		public void copyFrom(LogicalExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalExprNotContext extends LogicalExprContext {
		public TerminalNode Not() { return getToken(fplusParser.Not, 0); }
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public LogicalExprNotContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExprOrContext extends LogicalExprContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public TerminalNode Or() { return getToken(fplusParser.Or, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public LogicalExprOrContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExprAndContext extends LogicalExprContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
		}
		public TerminalNode And() { return getToken(fplusParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public LogicalExprAndContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExprCompareContext extends LogicalExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public LogicalExprCompareContext(LogicalExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterLogicalExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitLogicalExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLogicalExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		return logicalExpr(0);
	}

	private LogicalExprContext logicalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, _parentState);
		LogicalExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_logicalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new LogicalExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(926);
				match(Not);
				setState(928);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(927);
					match(WS);
					}
				}

				setState(930);
				logicalExpr(2);
				}
				break;
			case LeftParen:
			case Identifier:
			case IntegerConstant:
				{
				_localctx = new LogicalExprCompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(931);
				expr(0);
				setState(933);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(932);
					match(WS);
					}
				}

				setState(935);
				((LogicalExprCompareContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Smaller) | (1L << Larger))) != 0)) ) {
					((LogicalExprCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(937);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(936);
					match(WS);
					}
				}

				setState(939);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(963);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(961);
					switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExprAndContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(943);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(945);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(944);
							match(WS);
							}
						}

						setState(947);
						match(And);
						setState(949);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(948);
							match(WS);
							}
						}

						setState(951);
						logicalExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExprOrContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(952);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(954);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(953);
							match(WS);
							}
						}

						setState(956);
						match(Or);
						setState(958);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(957);
							match(WS);
							}
						}

						setState(960);
						logicalExpr(4);
						}
						break;
					}
					} 
				}
				setState(965);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 32:
			return logicalExpr_sempred((LogicalExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean logicalExpr_sempred(LogicalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3G\u03c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\5\2M\n\2\3\2\5\2P\n\2"+
		"\3\3\5\3S\n\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3"+
		"\3\3\5\3c\n\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\5\3l\n\3\3\3\3\3\3\3\3\3"+
		"\5\3r\n\3\3\3\5\3u\n\3\3\3\5\3x\n\3\3\3\5\3{\n\3\3\4\5\4~\n\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0084\n\4\3\4\3\4\3\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\3"+
		"\4\5\4\u008f\n\4\3\4\5\4\u0092\n\4\3\4\5\4\u0095\n\4\3\4\3\4\3\4\3\4\5"+
		"\4\u009b\n\4\3\4\5\4\u009e\n\4\3\4\5\4\u00a1\n\4\3\5\5\5\u00a4\n\5\3\5"+
		"\3\5\5\5\u00a8\n\5\3\5\3\5\3\6\5\6\u00ad\n\6\3\6\3\6\3\6\3\6\5\6\u00b3"+
		"\n\6\3\6\5\6\u00b6\n\6\3\6\5\6\u00b9\n\6\3\6\5\6\u00bc\n\6\3\6\5\6\u00bf"+
		"\n\6\3\6\3\6\5\6\u00c3\n\6\3\6\5\6\u00c6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00ce\n\6\3\6\5\6\u00d1\n\6\3\6\3\6\3\7\3\7\5\7\u00d7\n\7\3\7\3\7\3"+
		"\7\5\7\u00dc\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00e4\n\7\3\7\3\7\3\b\5\b"+
		"\u00e9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00f3\n\t\3\n\3\n\7\n\u00f7"+
		"\n\n\f\n\16\n\u00fa\13\n\3\n\3\n\3\n\3\n\7\n\u0100\n\n\f\n\16\n\u0103"+
		"\13\n\3\n\3\n\5\n\u0107\n\n\3\n\5\n\u010a\n\n\3\n\3\n\3\n\3\n\5\n\u0110"+
		"\n\n\3\n\5\n\u0113\n\n\3\n\5\n\u0116\n\n\3\n\3\n\3\13\5\13\u011b\n\13"+
		"\3\13\5\13\u011e\n\13\3\13\5\13\u0121\n\13\3\13\3\13\3\13\3\13\7\13\u0127"+
		"\n\13\f\13\16\13\u012a\13\13\3\13\3\13\5\13\u012e\n\13\3\13\5\13\u0131"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u0137\n\13\3\13\5\13\u013a\n\13\3\13\5"+
		"\13\u013d\n\13\3\13\3\13\3\f\5\f\u0142\n\f\3\f\3\f\5\f\u0146\n\f\3\f\5"+
		"\f\u0149\n\f\3\f\3\f\5\f\u014d\n\f\3\f\7\f\u0150\n\f\f\f\16\f\u0153\13"+
		"\f\3\f\5\f\u0156\n\f\3\f\3\f\5\f\u015a\n\f\3\f\5\f\u015d\n\f\3\f\3\f\7"+
		"\f\u0161\n\f\f\f\16\f\u0164\13\f\3\f\3\f\5\f\u0168\n\f\3\f\5\f\u016b\n"+
		"\f\3\f\3\f\5\f\u016f\n\f\3\f\5\f\u0172\n\f\3\f\3\f\7\f\u0176\n\f\f\f\16"+
		"\f\u0179\13\f\3\f\5\f\u017c\n\f\3\f\3\f\3\f\3\f\5\f\u0182\n\f\3\f\5\f"+
		"\u0185\n\f\3\f\5\f\u0188\n\f\3\f\3\f\3\r\3\r\5\r\u018e\n\r\3\r\3\r\5\r"+
		"\u0192\n\r\3\r\3\r\5\r\u0196\n\r\3\r\3\r\5\r\u019a\n\r\3\r\3\r\5\r\u019e"+
		"\n\r\3\r\3\r\5\r\u01a2\n\r\5\r\u01a4\n\r\3\r\3\r\5\r\u01a8\n\r\3\r\5\r"+
		"\u01ab\n\r\3\r\3\r\5\r\u01af\n\r\3\r\3\r\5\r\u01b3\n\r\3\r\3\r\5\r\u01b7"+
		"\n\r\3\r\3\r\3\r\5\r\u01bc\n\r\3\r\3\r\5\r\u01c0\n\r\3\r\3\r\5\r\u01c4"+
		"\n\r\3\r\5\r\u01c7\n\r\3\16\3\16\3\17\5\17\u01cc\n\17\3\17\3\17\5\17\u01d0"+
		"\n\17\3\17\5\17\u01d3\n\17\3\17\5\17\u01d6\n\17\3\17\5\17\u01d9\n\17\3"+
		"\17\5\17\u01dc\n\17\3\17\3\17\5\17\u01e0\n\17\3\17\5\17\u01e3\n\17\3\17"+
		"\5\17\u01e6\n\17\3\17\3\17\3\17\3\17\5\17\u01ec\n\17\3\17\3\17\5\17\u01f0"+
		"\n\17\3\17\7\17\u01f3\n\17\f\17\16\17\u01f6\13\17\3\17\5\17\u01f9\n\17"+
		"\3\17\3\17\7\17\u01fd\n\17\f\17\16\17\u0200\13\17\3\17\5\17\u0203\n\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0209\n\17\3\17\5\17\u020c\n\17\3\17\5\17\u020f"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u0216\n\20\3\20\3\20\5\20\u021a\n"+
		"\20\3\20\3\20\5\20\u021e\n\20\3\20\5\20\u0221\n\20\3\21\5\21\u0224\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u022a\n\21\3\21\5\21\u022d\n\21\3\21\3\21\5"+
		"\21\u0231\n\21\3\21\7\21\u0234\n\21\f\21\16\21\u0237\13\21\3\21\5\21\u023a"+
		"\n\21\3\21\3\21\3\21\5\21\u023f\n\21\3\21\3\21\5\21\u0243\n\21\3\21\3"+
		"\21\5\21\u0247\n\21\3\21\3\21\5\21\u024b\n\21\3\21\3\21\3\22\5\22\u0250"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u025a\n\22\3\22\5\22"+
		"\u025d\n\22\3\22\5\22\u0260\n\22\3\22\3\22\3\23\3\23\3\23\7\23\u0267\n"+
		"\23\f\23\16\23\u026a\13\23\3\24\3\24\7\24\u026e\n\24\f\24\16\24\u0271"+
		"\13\24\3\24\3\24\5\24\u0275\n\24\3\25\3\25\5\25\u0279\n\25\3\25\3\25\5"+
		"\25\u027d\n\25\3\25\3\25\5\25\u0281\n\25\3\25\3\25\5\25\u0285\n\25\3\25"+
		"\3\25\3\25\5\25\u028a\n\25\3\25\3\25\5\25\u028e\n\25\3\25\5\25\u0291\n"+
		"\25\3\26\3\26\5\26\u0295\n\26\3\27\5\27\u0298\n\27\3\27\3\27\3\27\3\27"+
		"\5\27\u029e\n\27\3\27\3\27\5\27\u02a2\n\27\3\27\3\27\5\27\u02a6\n\27\3"+
		"\27\3\27\5\27\u02aa\n\27\3\27\3\27\3\30\5\30\u02af\n\30\3\30\3\30\3\30"+
		"\3\30\5\30\u02b5\n\30\3\30\3\30\5\30\u02b9\n\30\3\30\3\30\5\30\u02bd\n"+
		"\30\3\30\3\30\5\30\u02c1\n\30\3\30\3\30\5\30\u02c5\n\30\3\30\3\30\3\30"+
		"\5\30\u02ca\n\30\3\30\3\30\3\30\3\30\5\30\u02d0\n\30\3\30\3\30\5\30\u02d4"+
		"\n\30\3\30\5\30\u02d7\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u02df\n"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u02ec"+
		"\n\31\r\31\16\31\u02ed\3\32\3\32\5\32\u02f2\n\32\3\32\7\32\u02f5\n\32"+
		"\f\32\16\32\u02f8\13\32\3\32\5\32\u02fb\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0303\n\32\3\33\3\33\5\33\u0307\n\33\3\33\3\33\3\34\5\34\u030c"+
		"\n\34\3\34\7\34\u030f\n\34\f\34\16\34\u0312\13\34\3\34\3\34\5\34\u0316"+
		"\n\34\3\35\3\35\3\35\5\35\u031b\n\35\3\35\3\35\5\35\u031f\n\35\3\35\5"+
		"\35\u0322\n\35\3\35\3\35\3\36\3\36\5\36\u0328\n\36\3\36\3\36\5\36\u032c"+
		"\n\36\3\36\3\36\5\36\u0330\n\36\3\36\3\36\5\36\u0334\n\36\3\36\7\36\u0337"+
		"\n\36\f\36\16\36\u033a\13\36\3\36\5\36\u033d\n\36\3\36\3\36\5\36\u0341"+
		"\n\36\3\36\3\36\5\36\u0345\n\36\3\36\6\36\u0348\n\36\r\36\16\36\u0349"+
		"\3\36\5\36\u034d\n\36\3\36\3\36\3\37\5\37\u0352\n\37\3\37\3\37\3\37\3"+
		"\37\5\37\u0358\n\37\3\37\3\37\3 \5 \u035d\n \3 \3 \3 \3 \3 \7 \u0364\n"+
		" \f \16 \u0367\13 \3 \5 \u036a\n \3!\3!\3!\5!\u036f\n!\3!\3!\5!\u0373"+
		"\n!\3!\3!\3!\3!\3!\5!\u037a\n!\3!\3!\5!\u037e\n!\3!\3!\5!\u0382\n!\3!"+
		"\3!\3!\5!\u0387\n!\3!\3!\5!\u038b\n!\3!\3!\5!\u038f\n!\3!\3!\3!\5!\u0394"+
		"\n!\3!\3!\5!\u0398\n!\3!\7!\u039b\n!\f!\16!\u039e\13!\3\"\3\"\3\"\5\""+
		"\u03a3\n\"\3\"\3\"\3\"\5\"\u03a8\n\"\3\"\3\"\5\"\u03ac\n\"\3\"\3\"\5\""+
		"\u03b0\n\"\3\"\3\"\5\"\u03b4\n\"\3\"\3\"\5\"\u03b8\n\"\3\"\3\"\3\"\5\""+
		"\u03bd\n\"\3\"\3\"\5\"\u03c1\n\"\3\"\7\"\u03c4\n\"\f\"\16\"\u03c7\13\""+
		"\3\"\4\u026f\u0310\4@B#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@B\2\17\4\2\"\"EE\3\2EE\3\2%&\3\2\66:\3\2?@\3\2*-\4"+
		"\2))..\3\2*+\b\2\3\4\16\17\24\24\32\32\37#EE\3\2\r\r\3\2\27\30\3\2\25"+
		"\26\4\2\5\6\22\23\u0486\2H\3\2\2\2\4R\3\2\2\2\6}\3\2\2\2\b\u00a3\3\2\2"+
		"\2\n\u00ac\3\2\2\2\f\u00d4\3\2\2\2\16\u00e8\3\2\2\2\20\u00f2\3\2\2\2\22"+
		"\u00f8\3\2\2\2\24\u011a\3\2\2\2\26\u0141\3\2\2\2\30\u01c6\3\2\2\2\32\u01c8"+
		"\3\2\2\2\34\u01cb\3\2\2\2\36\u0220\3\2\2\2 \u0223\3\2\2\2\"\u024f\3\2"+
		"\2\2$\u0263\3\2\2\2&\u0274\3\2\2\2(\u0290\3\2\2\2*\u0294\3\2\2\2,\u0297"+
		"\3\2\2\2.\u02ae\3\2\2\2\60\u02eb\3\2\2\2\62\u0302\3\2\2\2\64\u0304\3\2"+
		"\2\2\66\u030b\3\2\2\28\u0317\3\2\2\2:\u0325\3\2\2\2<\u0351\3\2\2\2>\u035c"+
		"\3\2\2\2@\u0386\3\2\2\2B\u03af\3\2\2\2DG\5\6\4\2EG\5\60\31\2FD\3\2\2\2"+
		"FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KM\5\4\3\2"+
		"LK\3\2\2\2LM\3\2\2\2MO\3\2\2\2NP\5\60\31\2ON\3\2\2\2OP\3\2\2\2P\3\3\2"+
		"\2\2QS\7F\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\37\2\2UV\7F\2\2VX\7?\2"+
		"\2WY\7F\2\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z^\7E\2\2[]\5\60\31\2\\[\3\2"+
		"\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2ac\5\b\5\2ba\3"+
		"\2\2\2bc\3\2\2\2cg\3\2\2\2df\5\60\31\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\7F\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2m"+
		"n\7\35\2\2no\7F\2\2oq\7\37\2\2pr\7F\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2"+
		"su\7?\2\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\7F\2\2wv\3\2\2\2wx\3\2\2\2x"+
		"z\3\2\2\2y{\7E\2\2zy\3\2\2\2z{\3\2\2\2{\5\3\2\2\2|~\7F\2\2}|\3\2\2\2}"+
		"~\3\2\2\2~\177\3\2\2\2\177\u0080\7 \2\2\u0080\u0081\7F\2\2\u0081\u0083"+
		"\7?\2\2\u0082\u0084\7F\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u008a\7E\2\2\u0086\u0089\5\"\22\2\u0087\u0089\5\60"+
		"\31\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008f\5\b\5\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u0092\5\60\31\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\7F\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\35\2\2\u0097\u0098\7"+
		"F\2\2\u0098\u009a\7 \2\2\u0099\u009b\7F\2\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\7?\2\2\u009d\u009c\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u00a1\7E\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\7\3\2\2\2\u00a2\u00a4\7F\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7"+
		"\7!\2\2\u00a6\u00a8\7F\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7E\2\2\u00aa\t\3\2\2\2\u00ab\u00ad\7F\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\32"+
		"\2\2\u00af\u00b0\7F\2\2\u00b0\u00b2\7\33\2\2\u00b1\u00b3\7F\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\7?"+
		"\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b9\7F\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00bc\7D\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bf\7F\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\7E\2\2\u00c1\u00c3\5\60\31\2\u00c2"+
		"\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6\7F"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\7\32\2\2\u00c8\u00c9\7F\2\2\u00c9\u00ca\7\35\2\2\u00ca\u00cb\7"+
		"F\2\2\u00cb\u00cd\7\33\2\2\u00cc\u00ce\7F\2\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00d1\7?\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7E\2\2\u00d3"+
		"\13\3\2\2\2\u00d4\u00d6\5\16\b\2\u00d5\u00d7\7F\2\2\u00d6\u00d5\3\2\2"+
		"\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7E\2\2\u00d9\u00db"+
		"\5\60\31\2\u00da\u00dc\7F\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\32\2\2\u00de\u00df\7F\2\2\u00df\u00e0"+
		"\7\35\2\2\u00e0\u00e1\7F\2\2\u00e1\u00e3\7\36\2\2\u00e2\u00e4\7F\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7E"+
		"\2\2\u00e6\r\3\2\2\2\u00e7\u00e9\7F\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\32\2\2\u00eb\u00ec\7F\2\2\u00ec"+
		"\u00ed\7\36\2\2\u00ed\u00ee\7F\2\2\u00ee\u00ef\5(\25\2\u00ef\17\3\2\2"+
		"\2\u00f0\u00f3\5\22\n\2\u00f1\u00f3\5\24\13\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\21\3\2\2\2\u00f4\u00f7\58\35\2\u00f5\u00f7\n\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\7\"\2\2\u00fc\u00fd\7F\2\2\u00fd\u0101\7?\2\2\u00fe\u0100\n\3\2"+
		"\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\7E\2\2\u0105"+
		"\u0107\5\60\31\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3"+
		"\2\2\2\u0108\u010a\7F\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\7\35\2\2\u010c\u010d\7F\2\2\u010d\u010f\7\""+
		"\2\2\u010e\u0110\7F\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u0113\7?\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0116\7F\2\2\u0115\u0114\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7E\2\2\u0118\23\3\2\2\2"+
		"\u0119\u011b\7F\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d"+
		"\3\2\2\2\u011c\u011e\t\4\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u0121\7F\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7#\2\2\u0123\u0124\7F\2\2\u0124\u0128"+
		"\7?\2\2\u0125\u0127\n\3\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012d\7E\2\2\u012c\u012e\5\60\31\2\u012d\u012c\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131\7F\2\2\u0130\u012f\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\35\2\2\u0133"+
		"\u0134\7F\2\2\u0134\u0136\7#\2\2\u0135\u0137\7F\2\2\u0136\u0135\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u013a\7?\2\2\u0139\u0138"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\7F\2\2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7E"+
		"\2\2\u013f\25\3\2\2\2\u0140\u0142\7F\2\2\u0141\u0140\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\7\'\2\2\u0144\u0146\7F\2\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0151\3\2\2\2\u0147\u0149\7F"+
		"\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\7\b\2\2\u014b\u014d\7F\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\5\36\20\2\u014f\u0148\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0154\u0156\7F\2\2\u0155\u0154\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\7\n\2\2\u0158\u015a\7\n"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u015d\7F\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0162\7?\2\2\u015f\u0161\n\3\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0167\7E\2\2\u0166\u0168\5\60\31\2\u0167"+
		"\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0171\3\2\2\2\u0169\u016b\7F"+
		"\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016e\7!\2\2\u016d\u016f\7F\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2"+
		"\2\u016f\u0170\3\2\2\2\u0170\u0172\7E\2\2\u0171\u016a\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0177\3\2\2\2\u0173\u0176\5\60\31\2\u0174\u0176\5 \21\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017c\7F\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017e\7\35\2\2\u017e\u017f\7F\2\2\u017f\u0181\7\'\2\2\u0180"+
		"\u0182\7F\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0185\7?\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0187\3\2\2\2\u0186\u0188\7F\2\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018a\7E\2\2\u018a\27\3\2\2\2\u018b\u018d"+
		"\t\5\2\2\u018c\u018e\7F\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u01aa\3\2\2\2\u018f\u0191\7\16\2\2\u0190\u0192\7F\2\2\u0191\u0190\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u01a3\3\2\2\2\u0193\u0195\7;\2\2\u0194"+
		"\u0196\7F\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0199\7\7\2\2\u0198\u019a\7F\2\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u01a4\3\2\2\2\u019b\u019d\7<\2\2\u019c\u019e\7F\2"+
		"\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1"+
		"\7\7\2\2\u01a0\u01a2\7F\2\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\t\6\2\2\u01a6\u01a8\7F\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\7\17"+
		"\2\2\u01aa\u018f\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01c7\3\2\2\2\u01ac"+
		"\u01ae\7\'\2\2\u01ad\u01af\7F\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\7\16\2\2\u01b1\u01b3\7F\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\7?"+
		"\2\2\u01b5\u01b7\7F\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01c7\7\17\2\2\u01b9\u01bb\7(\2\2\u01ba\u01bc\7F"+
		"\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bf\7\16\2\2\u01be\u01c0\7F\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\7?\2\2\u01c2\u01c4\7F\2\2\u01c3\u01c2"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\7\17\2\2"+
		"\u01c6\u018b\3\2\2\2\u01c6\u01ac\3\2\2\2\u01c6\u01b9\3\2\2\2\u01c7\31"+
		"\3\2\2\2\u01c8\u01c9\7=\2\2\u01c9\33\3\2\2\2\u01ca\u01cc\7F\2\2\u01cb"+
		"\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\7\34"+
		"\2\2\u01ce\u01d0\7F\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d2\3\2\2\2\u01d1\u01d3\7?\2\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\7F\2\2\u01d5\u01d4\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9\7D\2\2\u01d8\u01d7\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01dc\7F\2\2\u01db"+
		"\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01fe\7E"+
		"\2\2\u01de\u01e0\7F\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\u01e2\3\2\2\2\u01e1\u01e3\7 \2\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\7F\2\2\u01e5\u01e4\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7$\2\2\u01e8\u01e9\7F\2"+
		"\2\u01e9\u01f4\7?\2\2\u01ea\u01ec\7F\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\7\b\2\2\u01ee\u01f0\7F\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\7?"+
		"\2\2\u01f2\u01eb\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\7F"+
		"\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u01fd\7E\2\2\u01fb\u01fd\5\20\t\2\u01fc\u01df\3\2\2\2\u01fc\u01fb\3\2"+
		"\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\7F\2\2\u0202\u0201\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\7\35\2\2\u0205"+
		"\u0206\7F\2\2\u0206\u0208\7\34\2\2\u0207\u0209\7F\2\2\u0208\u0207\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c\7?\2\2\u020b"+
		"\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020f\7F"+
		"\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0211\7E\2\2\u0211\35\3\2\2\2\u0212\u0221\t\7\2\2\u0213\u0215\t\b\2\2"+
		"\u0214\u0216\7F\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0219\7\16\2\2\u0218\u021a\7F\2\2\u0219\u0218\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\7?\2\2\u021c\u021e\7F\2"+
		"\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221"+
		"\7\17\2\2\u0220\u0212\3\2\2\2\u0220\u0213\3\2\2\2\u0221\37\3\2\2\2\u0222"+
		"\u0224\7F\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2"+
		"\2\2\u0225\u0226\7\32\2\2\u0226\u0227\7F\2\2\u0227\u0229\7/\2\2\u0228"+
		"\u022a\7F\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0235\3\2"+
		"\2\2\u022b\u022d\7F\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0230\7\b\2\2\u022f\u0231\7F\2\2\u0230\u022f\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\t\t\2\2\u0233"+
		"\u022c\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2"+
		"\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u023a\7F\2\2\u0239"+
		"\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\n"+
		"\2\2\u023c\u023e\7\n\2\2\u023d\u023f\7F\2\2\u023e\u023d\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\7?\2\2\u0241\u0243\7F\2"+
		"\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246"+
		"\7C\2\2\u0245\u0247\7F\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024a\7?\2\2\u0249\u024b\7F\2\2\u024a\u0249\3\2\2"+
		"\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\7E\2\2\u024d!\3"+
		"\2\2\2\u024e\u0250\7F\2\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0252\7\32\2\2\u0252\u0253\7F\2\2\u0253\u0254\7\34"+
		"\2\2\u0254\u0255\7F\2\2\u0255\u0256\7\33\2\2\u0256\u0257\7F\2\2\u0257"+
		"\u0259\7?\2\2\u0258\u025a\7F\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2"+
		"\2\u025a\u025c\3\2\2\2\u025b\u025d\7D\2\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u0260\7F\2\2\u025f\u025e\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\7E\2\2\u0262#\3\2\2\2\u0263"+
		"\u0268\5&\24\2\u0264\u0265\7F\2\2\u0265\u0267\5&\24\2\u0266\u0264\3\2"+
		"\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"%\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026f\7\13\2\2\u026c\u026e\n\3\2\2"+
		"\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u0270\3\2\2\2\u026f\u026d"+
		"\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0275\7\f\2\2\u0273"+
		"\u0275\n\3\2\2\u0274\u026b\3\2\2\2\u0274\u0273\3\2\2\2\u0275\'\3\2\2\2"+
		"\u0276\u0278\7?\2\2\u0277\u0279\7F\2\2\u0278\u0277\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\7\7\2\2\u027b\u027d\7F\2\2\u027c"+
		"\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\7@"+
		"\2\2\u027f\u0281\7F\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0284\7\b\2\2\u0283\u0285\7F\2\2\u0284\u0283\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0291\7@\2\2\u0287"+
		"\u0289\7?\2\2\u0288\u028a\7F\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2"+
		"\2\u028a\u028b\3\2\2\2\u028b\u028d\7\7\2\2\u028c\u028e\7F\2\2\u028d\u028c"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\5$\23\2\u0290"+
		"\u0276\3\2\2\2\u0290\u0287\3\2\2\2\u0291)\3\2\2\2\u0292\u0295\5.\30\2"+
		"\u0293\u0295\5,\27\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295+\3"+
		"\2\2\2\u0296\u0298\7F\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\7\32\2\2\u029a\u029b\7F\2\2\u029b\u029d\7\60"+
		"\2\2\u029c\u029e\7F\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a1\7\16\2\2\u02a0\u02a2\7F\2\2\u02a1\u02a0\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\5B\"\2\u02a4"+
		"\u02a6\7F\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a9\7\17\2\2\u02a8\u02aa\7F\2\2\u02a9\u02a8\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\5\66\34\2\u02ac-\3\2\2"+
		"\2\u02ad\u02af\7F\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0"+
		"\3\2\2\2\u02b0\u02b1\7\32\2\2\u02b1\u02b2\7F\2\2\u02b2\u02b4\7\60\2\2"+
		"\u02b3\u02b5\7F\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02b8\7\16\2\2\u02b7\u02b9\7F\2\2\u02b8\u02b7\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\5B\"\2\u02bb\u02bd\7F\2"+
		"\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0"+
		"\7\17\2\2\u02bf\u02c1\7F\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c4\7\61\2\2\u02c3\u02c5\7F\2\2\u02c4\u02c3\3\2"+
		"\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\7E\2\2\u02c7"+
		"\u02d3\5\60\31\2\u02c8\u02ca\7F\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3"+
		"\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\7\32\2\2\u02cc\u02cd\7F\2\2\u02cd"+
		"\u02cf\7\62\2\2\u02ce\u02d0\7F\2\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2"+
		"\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\7E\2\2\u02d2\u02d4\5\60\31\2\u02d3"+
		"\u02c9\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d7\7F"+
		"\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02d9\7\32\2\2\u02d9\u02da\7F\2\2\u02da\u02db\7\35\2\2\u02db\u02dc\7"+
		"F\2\2\u02dc\u02de\7\60\2\2\u02dd\u02df\7F\2\2\u02de\u02dd\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\7E\2\2\u02e1/\3\2\2\2\u02e2"+
		"\u02ec\5\f\7\2\u02e3\u02ec\5\n\6\2\u02e4\u02ec\5<\37\2\u02e5\u02ec\5*"+
		"\26\2\u02e6\u02ec\5\20\t\2\u02e7\u02ec\5\26\f\2\u02e8\u02ec\5\34\17\2"+
		"\u02e9\u02ec\5> \2\u02ea\u02ec\5\66\34\2\u02eb\u02e2\3\2\2\2\u02eb\u02e3"+
		"\3\2\2\2\u02eb\u02e4\3\2\2\2\u02eb\u02e5\3\2\2\2\u02eb\u02e6\3\2\2\2\u02eb"+
		"\u02e7\3\2\2\2\u02eb\u02e8\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ea\3\2"+
		"\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\61\3\2\2\2\u02ef\u02f6\7\16\2\2\u02f0\u02f2\7F\2\2\u02f1\u02f0\3\2\2"+
		"\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\5\62\32\2\u02f4"+
		"\u02f1\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6\3\2\2\2\u02f9\u02fb\7F\2\2\u02fa"+
		"\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0303\7\17"+
		"\2\2\u02fd\u0303\7B\2\2\u02fe\u0303\58\35\2\u02ff\u0303\5:\36\2\u0300"+
		"\u0303\5\64\33\2\u0301\u0303\n\n\2\2\u0302\u02ef\3\2\2\2\u0302\u02fd\3"+
		"\2\2\2\u0302\u02fe\3\2\2\2\u0302\u02ff\3\2\2\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0301\3\2\2\2\u0303\63\3\2\2\2\u0304\u0306\7\31\2\2\u0305\u0307\7F\2"+
		"\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309"+
		"\7E\2\2\u0309\65\3\2\2\2\u030a\u030c\7F\2\2\u030b\u030a\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u0310\3\2\2\2\u030d\u030f\5\62\32\2\u030e\u030d\3"+
		"\2\2\2\u030f\u0312\3\2\2\2\u0310\u0311\3\2\2\2\u0310\u030e\3\2\2\2\u0311"+
		"\u0315\3\2\2\2\u0312\u0310\3\2\2\2\u0313\u0316\7E\2\2\u0314\u0316\5> "+
		"\2\u0315\u0313\3\2\2\2\u0315\u0314\3\2\2\2\u0316\67\3\2\2\2\u0317\u0318"+
		"\7\r\2\2\u0318\u031a\7\13\2\2\u0319\u031b\7F\2\2\u031a\u0319\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031f\5@!\2\u031d\u031f\5B\""+
		"\2\u031e\u031c\3\2\2\2\u031e\u031d\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u0322"+
		"\7F\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323"+
		"\u0324\7\f\2\2\u03249\3\2\2\2\u0325\u0327\7>\2\2\u0326\u0328\7F\2\2\u0327"+
		"\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\7\22"+
		"\2\2\u032a\u032c\7F\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u0338\5\30\r\2\u032e\u0330\7F\2\2\u032f\u032e\3\2"+
		"\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333\7\b\2\2\u0332"+
		"\u0334\7F\2\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u0337\5\32\16\2\u0336\u032f\3\2\2\2\u0337\u033a\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033b\u033d\7F\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u0340\7\23\2\2\u033f\u0341\7F\2\2\u0340\u033f\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0347\7\16\2\2\u0343"+
		"\u0345\7F\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u0348\5\62\32\2\u0347\u0344\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2\2\2\u034b\u034d\7F"+
		"\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"\u034f\7\17\2\2\u034f;\3\2\2\2\u0350\u0352\7F\2\2\u0351\u0350\3\2\2\2"+
		"\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\7\32\2\2\u0354\u0355"+
		"\7F\2\2\u0355\u0357\5(\25\2\u0356\u0358\7F\2\2\u0357\u0356\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\7E\2\2\u035a=\3\2\2\2\u035b"+
		"\u035d\7F\2\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2"+
		"\2\2\u035e\u0369\7\24\2\2\u035f\u036a\7E\2\2\u0360\u0365\n\13\2\2\u0361"+
		"\u0364\58\35\2\u0362\u0364\n\3\2\2\u0363\u0361\3\2\2\2\u0363\u0362\3\2"+
		"\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u036a\7E\2\2\u0369\u035f\3\2"+
		"\2\2\u0369\u0360\3\2\2\2\u036a?\3\2\2\2\u036b\u036c\b!\1\2\u036c\u036e"+
		"\7\16\2\2\u036d\u036f\7F\2\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0372\5@!\2\u0371\u0373\7F\2\2\u0372\u0371\3\2\2"+
		"\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\7\17\2\2\u0375"+
		"\u0387\3\2\2\2\u0376\u0387\7@\2\2\u0377\u0379\7?\2\2\u0378\u037a\7F\2"+
		"\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037d"+
		"\7\16\2\2\u037c\u037e\7F\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0381\5@!\2\u0380\u0382\7F\2\2\u0381\u0380\3\2\2"+
		"\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\7\17\2\2\u0384"+
		"\u0387\3\2\2\2\u0385\u0387\7?\2\2\u0386\u036b\3\2\2\2\u0386\u0376\3\2"+
		"\2\2\u0386\u0377\3\2\2\2\u0386\u0385\3\2\2\2\u0387\u039c\3\2\2\2\u0388"+
		"\u038a\f\b\2\2\u0389\u038b\7F\2\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2"+
		"\2\2\u038b\u038c\3\2\2\2\u038c\u038e\t\f\2\2\u038d\u038f\7F\2\2\u038e"+
		"\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u039b\5@"+
		"!\t\u0391\u0393\f\7\2\2\u0392\u0394\7F\2\2\u0393\u0392\3\2\2\2\u0393\u0394"+
		"\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0397\t\r\2\2\u0396\u0398\7F\2\2\u0397"+
		"\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\5@"+
		"!\b\u039a\u0388\3\2\2\2\u039a\u0391\3\2\2\2\u039b\u039e\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039dA\3\2\2\2\u039e\u039c\3\2\2\2"+
		"\u039f\u03a0\b\"\1\2\u03a0\u03a2\7\64\2\2\u03a1\u03a3\7F\2\2\u03a2\u03a1"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03b0\5B\"\4\u03a5"+
		"\u03a7\5@!\2\u03a6\u03a8\7F\2\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2"+
		"\2\u03a8\u03a9\3\2\2\2\u03a9\u03ab\t\16\2\2\u03aa\u03ac\7F\2\2\u03ab\u03aa"+
		"\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\5@!\2\u03ae"+
		"\u03b0\3\2\2\2\u03af\u039f\3\2\2\2\u03af\u03a5\3\2\2\2\u03b0\u03c5\3\2"+
		"\2\2\u03b1\u03b3\f\6\2\2\u03b2\u03b4\7F\2\2\u03b3\u03b2\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\7\63\2\2\u03b6\u03b8\7"+
		"F\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03c4\5B\"\7\u03ba\u03bc\f\5\2\2\u03bb\u03bd\7F\2\2\u03bc\u03bb\3\2\2"+
		"\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\7\65\2\2\u03bf"+
		"\u03c1\7F\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2\u03c4\5B\"\6\u03c3\u03b1\3\2\2\2\u03c3\u03ba\3\2\2\2\u03c4"+
		"\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6C\3\2\2\2"+
		"\u03c7\u03c5\3\2\2\2\u00d2FHLORX^bgkqtwz}\u0083\u0088\u008a\u008e\u0091"+
		"\u0094\u009a\u009d\u00a0\u00a3\u00a7\u00ac\u00b2\u00b5\u00b8\u00bb\u00be"+
		"\u00c2\u00c5\u00cd\u00d0\u00d6\u00db\u00e3\u00e8\u00f2\u00f6\u00f8\u0101"+
		"\u0106\u0109\u010f\u0112\u0115\u011a\u011d\u0120\u0128\u012d\u0130\u0136"+
		"\u0139\u013c\u0141\u0145\u0148\u014c\u0151\u0155\u0159\u015c\u0162\u0167"+
		"\u016a\u016e\u0171\u0175\u0177\u017b\u0181\u0184\u0187\u018d\u0191\u0195"+
		"\u0199\u019d\u01a1\u01a3\u01a7\u01aa\u01ae\u01b2\u01b6\u01bb\u01bf\u01c3"+
		"\u01c6\u01cb\u01cf\u01d2\u01d5\u01d8\u01db\u01df\u01e2\u01e5\u01eb\u01ef"+
		"\u01f4\u01f8\u01fc\u01fe\u0202\u0208\u020b\u020e\u0215\u0219\u021d\u0220"+
		"\u0223\u0229\u022c\u0230\u0235\u0239\u023e\u0242\u0246\u024a\u024f\u0259"+
		"\u025c\u025f\u0268\u026f\u0274\u0278\u027c\u0280\u0284\u0289\u028d\u0290"+
		"\u0294\u0297\u029d\u02a1\u02a5\u02a9\u02ae\u02b4\u02b8\u02bc\u02c0\u02c4"+
		"\u02c9\u02cf\u02d3\u02d6\u02de\u02eb\u02ed\u02f1\u02f6\u02fa\u0302\u0306"+
		"\u030b\u0310\u0315\u031a\u031e\u0321\u0327\u032b\u032f\u0333\u0338\u033c"+
		"\u0340\u0344\u0349\u034c\u0351\u0357\u035c\u0363\u0365\u0369\u036e\u0372"+
		"\u0379\u037d\u0381\u0386\u038a\u038e\u0393\u0397\u039a\u039c\u03a2\u03a7"+
		"\u03ab\u03af\u03b3\u03b7\u03bc\u03c0\u03c3\u03c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}