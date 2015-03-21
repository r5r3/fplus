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
		RULE_functionBlock = 8, RULE_subroutineBlock = 9, RULE_parameterList = 10, 
		RULE_parameterListElement = 11, RULE_functionResult = 12, RULE_procedureBinding = 13, 
		RULE_typeDefinitionBlock = 14, RULE_dataType = 15, RULE_dataTypeParameter = 16, 
		RULE_fortranInterfaceBlock = 17, RULE_typeAttributes = 18, RULE_genericTypeBoundLine = 19, 
		RULE_interfaceLine = 20, RULE_list = 21, RULE_listItem = 22, RULE_listAssignment = 23, 
		RULE_ifStatement = 24, RULE_ifSingleLine = 25, RULE_ifBlock = 26, RULE_contentBlock = 27, 
		RULE_content = 28, RULE_lineContinuation = 29, RULE_contentLine = 30, 
		RULE_placeholder = 31, RULE_dynamicCast = 32, RULE_variableDefinition = 33, 
		RULE_lineComment = 34, RULE_expr = 35, RULE_logicalExpr = 36;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "containsLine", "templateBlock", 
		"loopBlock", "loopBegin", "procedureBlock", "functionBlock", "subroutineBlock", 
		"parameterList", "parameterListElement", "functionResult", "procedureBinding", 
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
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(76);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(74);
						moduleBlock();
						}
						break;
					case 2:
						{
						setState(75);
						contentBlock();
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(81);
				programBlock();
				}
				break;
			}
			setState(85);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (Newline - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				setState(84);
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
			setState(88);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(87);
				match(WS);
				}
			}

			setState(90);
			match(Program);
			setState(91);
			match(WS);
			setState(92);
			match(Identifier);
			setState(94);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(93);
				match(WS);
				}
			}

			setState(96);
			match(Newline);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					contentBlock();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(103);
				containsLine();
				}
				break;
			}
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					contentBlock();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(113);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(112);
				match(WS);
				}
			}

			setState(115);
			match(End);
			setState(116);
			match(WS);
			setState(117);
			match(Program);
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(118);
				match(WS);
				}
				break;
			}
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(121);
				match(Identifier);
				}
				break;
			}
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(124);
				match(WS);
				}
				break;
			}
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(127);
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
			setState(131);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(130);
				match(WS);
				}
			}

			setState(133);
			match(Module);
			setState(134);
			match(WS);
			setState(135);
			match(Identifier);
			setState(137);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(136);
				match(WS);
				}
			}

			setState(139);
			match(Newline);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(142);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(140);
						interfaceLine();
						}
						break;
					case 2:
						{
						setState(141);
						contentBlock();
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(147);
				containsLine();
				}
				break;
			}
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(150);
				contentBlock();
				}
				break;
			}
			setState(154);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(153);
				match(WS);
				}
			}

			setState(156);
			match(End);
			setState(157);
			match(WS);
			setState(158);
			match(Module);
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(159);
				match(WS);
				}
				break;
			}
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(162);
				match(Identifier);
				}
				break;
			}
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(165);
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
			setState(169);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168);
				match(WS);
				}
			}

			setState(171);
			match(Contains);
			setState(173);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(172);
				match(WS);
				}
			}

			setState(175);
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
			setState(178);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(177);
				match(WS);
				}
			}

			setState(180);
			match(Prefix);
			setState(181);
			match(WS);
			setState(182);
			match(Template);
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(183);
				match(WS);
				}
				break;
			}
			setState(187);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(186);
				match(Identifier);
				}
			}

			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(189);
				match(WS);
				}
				break;
			}
			setState(193);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(192);
				match(OperatorOverload);
				}
			}

			setState(196);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(195);
				match(WS);
				}
			}

			setState(198);
			match(Newline);
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(199);
				contentBlock();
				}
				break;
			}
			setState(203);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(202);
				match(WS);
				}
			}

			setState(205);
			match(Prefix);
			setState(206);
			match(WS);
			setState(207);
			match(End);
			setState(208);
			match(WS);
			setState(209);
			match(Template);
			setState(211);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(210);
				match(WS);
				}
			}

			setState(214);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(213);
				match(Identifier);
				}
			}

			setState(216);
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
			setState(218);
			loopBegin();
			setState(220);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(219);
				match(WS);
				}
			}

			setState(222);
			match(Newline);
			setState(223);
			contentBlock();
			setState(225);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(224);
				match(WS);
				}
			}

			setState(227);
			match(Prefix);
			setState(228);
			match(WS);
			setState(229);
			match(End);
			setState(230);
			match(WS);
			setState(231);
			match(Do);
			setState(233);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(232);
				match(WS);
				}
			}

			setState(235);
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
			setState(238);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(237);
				match(WS);
				}
			}

			setState(240);
			match(Prefix);
			setState(241);
			match(WS);
			setState(242);
			match(Do);
			setState(243);
			match(WS);
			setState(244);
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
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				functionBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public ProcedureBindingContext procedureBinding() {
			return getRuleContext(ProcedureBindingContext.class,0);
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
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				setState(252);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(250);
					placeholder();
					}
					break;
				case 2:
					{
					setState(251);
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
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(Function);
			setState(258);
			match(WS);
			setState(259);
			match(Identifier);
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(261);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(260);
					match(WS);
					}
				}

				setState(263);
				parameterList();
				}
				break;
			}
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(267);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(266);
					match(WS);
					}
				}

				setState(269);
				functionResult();
				}
				break;
			}
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(273);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(272);
					match(WS);
					}
				}

				setState(275);
				procedureBinding();
				}
				break;
			}
			setState(279);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(278);
				match(WS);
				}
			}

			setState(281);
			match(Newline);
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(282);
				contentBlock();
				}
				break;
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
			match(End);
			setState(289);
			match(WS);
			setState(290);
			match(Function);
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(291);
				match(WS);
				}
				break;
			}
			setState(295);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(294);
				match(Identifier);
				}
			}

			setState(298);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(297);
				match(WS);
				}
			}

			setState(300);
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
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ProcedureBindingContext procedureBinding() {
			return getRuleContext(ProcedureBindingContext.class,0);
		}
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
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(302);
				match(WS);
				}
				break;
			}
			setState(306);
			_la = _input.LA(1);
			if (_la==Recursive || _la==Elemental) {
				{
				setState(305);
				_la = _input.LA(1);
				if ( !(_la==Recursive || _la==Elemental) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(309);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(308);
				match(WS);
				}
			}

			setState(311);
			match(Subroutine);
			setState(312);
			match(WS);
			setState(313);
			match(Identifier);
			setState(318);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(315);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(314);
					match(WS);
					}
				}

				setState(317);
				parameterList();
				}
				break;
			}
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(321);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(320);
					match(WS);
					}
				}

				setState(323);
				procedureBinding();
				}
				break;
			}
			setState(327);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(326);
				match(WS);
				}
			}

			setState(329);
			match(Newline);
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(330);
				contentBlock();
				}
				break;
			}
			setState(334);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(333);
				match(WS);
				}
			}

			setState(336);
			match(End);
			setState(337);
			match(WS);
			setState(338);
			match(Subroutine);
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(339);
				match(WS);
				}
				break;
			}
			setState(343);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(342);
				match(Identifier);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterListElementContext> parameterListElement() {
			return getRuleContexts(ParameterListElementContext.class);
		}
		public ParameterListElementContext parameterListElement(int i) {
			return getRuleContext(ParameterListElementContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<LineContinuationContext> lineContinuation() {
			return getRuleContexts(LineContinuationContext.class);
		}
		public LineContinuationContext lineContinuation(int i) {
			return getRuleContext(LineContinuationContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(LeftParen);
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(352);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(351);
					match(WS);
					}
					break;
				}
				setState(354);
				parameterListElement();
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(373);
						switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
						case 1:
							{
							{
							setState(356);
							_la = _input.LA(1);
							if (_la==WS) {
								{
								setState(355);
								match(WS);
								}
							}

							setState(358);
							match(Comma);
							setState(360);
							switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
							case 1:
								{
								setState(359);
								match(WS);
								}
								break;
							}
							setState(362);
							parameterListElement();
							}
							}
							break;
						case 2:
							{
							setState(364);
							_la = _input.LA(1);
							if (_la==WS) {
								{
								setState(363);
								match(WS);
								}
							}

							setState(366);
							lineContinuation();
							setState(370);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(367);
									ifStatement();
									}
									} 
								}
								setState(372);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
							}
							}
							break;
						}
						} 
					}
					setState(377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			}
			setState(381);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(380);
				match(WS);
				}
			}

			setState(383);
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

	public static class ParameterListElementContext extends ParserRuleContext {
		public LineContinuationContext lineContinuation() {
			return getRuleContext(LineContinuationContext.class,0);
		}
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public ParameterListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterParameterListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitParameterListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitParameterListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListElementContext parameterListElement() throws RecognitionException {
		ParameterListElementContext _localctx = new ParameterListElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterListElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(385);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				{
				setState(386);
				lineContinuation();
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(387);
						ifStatement();
						}
						} 
					}
					setState(392);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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

	public static class FunctionResultContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public FunctionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterFunctionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitFunctionResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFunctionResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionResultContext functionResult() throws RecognitionException {
		FunctionResultContext _localctx = new FunctionResultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(Identifier);
			setState(397);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(396);
				match(WS);
				}
			}

			setState(399);
			match(LeftParen);
			setState(401);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(400);
				match(WS);
				}
			}

			setState(403);
			match(Identifier);
			setState(405);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(404);
				match(WS);
				}
			}

			setState(407);
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

	public static class ProcedureBindingContext extends ParserRuleContext {
		public TerminalNode Bind() { return getToken(fplusParser.Bind, 0); }
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode StringLiteral() { return getToken(fplusParser.StringLiteral, 0); }
		public ProcedureBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).enterProcedureBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fplusListener ) ((fplusListener)listener).exitProcedureBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitProcedureBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBindingContext procedureBinding() throws RecognitionException {
		ProcedureBindingContext _localctx = new ProcedureBindingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procedureBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(Bind);
			setState(411);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(410);
				match(WS);
				}
			}

			setState(413);
			match(LeftParen);
			setState(415);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(414);
				match(WS);
				}
			}

			setState(417);
			match(Identifier);
			setState(434);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(419);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(418);
					match(WS);
					}
				}

				setState(421);
				match(Comma);
				setState(423);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(422);
					match(WS);
					}
				}

				setState(425);
				match(Identifier);
				setState(427);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(426);
					match(WS);
					}
				}

				setState(429);
				match(Assign);
				setState(431);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(430);
					match(WS);
					}
				}

				setState(433);
				match(StringLiteral);
				}
				break;
			}
			setState(437);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(436);
				match(WS);
				}
			}

			setState(439);
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
		enterRule(_localctx, 28, RULE_typeDefinitionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(441);
				match(WS);
				}
			}

			setState(444);
			match(Type);
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(445);
				match(WS);
				}
				break;
			}
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(449);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(448);
						match(WS);
						}
					}

					setState(451);
					match(Comma);
					setState(453);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(452);
						match(WS);
						}
					}

					setState(455);
					typeAttributes();
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(462);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(461);
				match(WS);
				}
				break;
			}
			setState(466);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(464);
				match(Colon);
				setState(465);
				match(Colon);
				}
			}

			setState(469);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(468);
				match(WS);
				}
			}

			setState(471);
			match(Identifier);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
				{
				{
				setState(472);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(Newline);
			setState(480);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(479);
				contentBlock();
				}
				break;
			}
			setState(490);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(483);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(482);
					match(WS);
					}
				}

				setState(485);
				match(Contains);
				setState(487);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(486);
					match(WS);
					}
				}

				setState(489);
				match(Newline);
				}
				break;
			}
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(494);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						setState(492);
						contentBlock();
						}
						break;
					case 2:
						{
						setState(493);
						genericTypeBoundLine();
						}
						break;
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(500);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(499);
				match(WS);
				}
			}

			setState(502);
			match(End);
			setState(503);
			match(WS);
			setState(504);
			match(Type);
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(505);
				match(WS);
				}
				break;
			}
			setState(509);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(508);
				match(Identifier);
				}
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
		enterRule(_localctx, 30, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			switch (_input.LA(1)) {
			case Integer:
			case Real:
			case Complex:
			case Logical:
			case Character:
				{
				setState(516);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(518);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(517);
					match(WS);
					}
					break;
				}
				setState(547);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(520);
					match(LeftParen);
					setState(522);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(521);
						match(WS);
						}
					}

					setState(540);
					switch (_input.LA(1)) {
					case Kind:
						{
						setState(524);
						match(Kind);
						setState(526);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(525);
							match(WS);
							}
						}

						setState(528);
						match(Assign);
						setState(530);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(529);
							match(WS);
							}
						}

						}
						break;
					case Len:
						{
						setState(532);
						match(Len);
						setState(534);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(533);
							match(WS);
							}
						}

						setState(536);
						match(Assign);
						setState(538);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(537);
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
					setState(542);
					_la = _input.LA(1);
					if ( !(_la==Identifier || _la==IntegerConstant) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(544);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(543);
						match(WS);
						}
					}

					setState(546);
					match(RightParen);
					}
				}

				}
				break;
			case Type:
				{
				setState(549);
				match(Type);
				setState(551);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(550);
					match(WS);
					}
				}

				setState(553);
				match(LeftParen);
				setState(555);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(554);
					match(WS);
					}
				}

				setState(557);
				match(Identifier);
				setState(559);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(558);
					match(WS);
					}
				}

				setState(561);
				match(RightParen);
				}
				break;
			case Class:
				{
				setState(562);
				match(Class);
				setState(564);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(563);
					match(WS);
					}
				}

				setState(566);
				match(LeftParen);
				setState(568);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(567);
					match(WS);
					}
				}

				setState(570);
				match(Identifier);
				setState(572);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(571);
					match(WS);
					}
				}

				setState(574);
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
		enterRule(_localctx, 32, RULE_dataTypeParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		enterRule(_localctx, 34, RULE_fortranInterfaceBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(579);
				match(WS);
				}
			}

			setState(582);
			match(Interface);
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(583);
				match(WS);
				}
				break;
			}
			setState(587);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(586);
				match(Identifier);
				}
			}

			setState(590);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(589);
				match(WS);
				}
				break;
			}
			setState(593);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(592);
				match(OperatorOverload);
				}
			}

			setState(596);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(595);
				match(WS);
				}
			}

			setState(598);
			match(Newline);
			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(629);
					switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
					case 1:
						{
						setState(600);
						switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
						case 1:
							{
							setState(599);
							match(WS);
							}
							break;
						}
						setState(603);
						_la = _input.LA(1);
						if (_la==Module) {
							{
							setState(602);
							match(Module);
							}
						}

						setState(606);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(605);
							match(WS);
							}
						}

						setState(608);
						match(Procedure);
						setState(609);
						match(WS);
						setState(610);
						match(Identifier);
						setState(621);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(612);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(611);
									match(WS);
									}
								}

								setState(614);
								match(Comma);
								setState(616);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(615);
									match(WS);
									}
								}

								setState(618);
								match(Identifier);
								}
								} 
							}
							setState(623);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
						}
						setState(625);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(624);
							match(WS);
							}
						}

						setState(627);
						match(Newline);
						}
						break;
					case 2:
						{
						setState(628);
						procedureBlock();
						}
						break;
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			setState(635);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(634);
				match(WS);
				}
			}

			setState(637);
			match(End);
			setState(638);
			match(WS);
			setState(639);
			match(Interface);
			setState(641);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(640);
				match(WS);
				}
				break;
			}
			setState(644);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(643);
				match(Identifier);
				}
			}

			setState(647);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(646);
				match(WS);
				}
			}

			setState(649);
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
		enterRule(_localctx, 36, RULE_typeAttributes);
		int _la;
		try {
			setState(665);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Sequence:
			case Abstract:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
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
				setState(652);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Bind) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(654);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(653);
					match(WS);
					}
				}

				setState(656);
				match(LeftParen);
				setState(658);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(657);
					match(WS);
					}
				}

				setState(660);
				match(Identifier);
				setState(662);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(661);
					match(WS);
					}
				}

				setState(664);
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
		enterRule(_localctx, 38, RULE_genericTypeBoundLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(667);
				match(WS);
				}
			}

			setState(670);
			match(Prefix);
			setState(671);
			match(WS);
			setState(672);
			match(Generic);
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(673);
				match(WS);
				}
				break;
			}
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(677);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(676);
						match(WS);
						}
					}

					setState(679);
					match(Comma);
					setState(681);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(680);
						match(WS);
						}
					}

					setState(683);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,152,_ctx);
			}
			setState(690);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(689);
				match(WS);
				}
			}

			setState(692);
			match(Colon);
			setState(693);
			match(Colon);
			setState(695);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(694);
				match(WS);
				}
			}

			setState(697);
			match(Identifier);
			setState(699);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(698);
				match(WS);
				}
			}

			setState(701);
			match(AssignPointer);
			setState(703);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(702);
				match(WS);
				}
			}

			setState(705);
			match(Identifier);
			setState(707);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(706);
				match(WS);
				}
			}

			setState(709);
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
		enterRule(_localctx, 40, RULE_interfaceLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(711);
				match(WS);
				}
			}

			setState(714);
			match(Prefix);
			setState(715);
			match(WS);
			setState(716);
			match(Interface);
			setState(717);
			match(WS);
			setState(718);
			match(Template);
			setState(719);
			match(WS);
			setState(720);
			match(Identifier);
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(721);
				match(WS);
				}
				break;
			}
			setState(725);
			_la = _input.LA(1);
			if (_la==OperatorOverload) {
				{
				setState(724);
				match(OperatorOverload);
				}
			}

			setState(728);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(727);
				match(WS);
				}
			}

			setState(730);
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
		enterRule(_localctx, 42, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			listItem();
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(733);
					match(WS);
					setState(734);
					listItem();
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
		enterRule(_localctx, 44, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(749);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				match(LeftBrace);
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(741);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(746);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
				}
				setState(747);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
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
		enterRule(_localctx, 46, RULE_listAssignment);
		int _la;
		try {
			setState(777);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(Identifier);
				setState(753);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(752);
					match(WS);
					}
				}

				setState(755);
				match(Assign);
				setState(757);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(756);
					match(WS);
					}
				}

				setState(759);
				match(IntegerConstant);
				setState(761);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(760);
					match(WS);
					}
				}

				setState(763);
				match(Comma);
				setState(765);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(764);
					match(WS);
					}
				}

				setState(767);
				match(IntegerConstant);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(Identifier);
				setState(770);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(769);
					match(WS);
					}
				}

				setState(772);
				match(Assign);
				setState(774);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(773);
					match(WS);
					}
					break;
				}
				setState(776);
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
		enterRule(_localctx, 48, RULE_ifStatement);
		try {
			setState(781);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
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
		enterRule(_localctx, 50, RULE_ifSingleLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(783);
				match(WS);
				}
			}

			setState(786);
			match(Prefix);
			setState(787);
			match(WS);
			setState(788);
			match(If);
			setState(790);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(789);
				match(WS);
				}
			}

			setState(792);
			match(LeftParen);
			setState(794);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(793);
				match(WS);
				}
			}

			setState(796);
			logicalExpr(0);
			setState(798);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(797);
				match(WS);
				}
			}

			setState(800);
			match(RightParen);
			setState(802);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(801);
				match(WS);
				}
				break;
			}
			setState(804);
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
		enterRule(_localctx, 52, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(806);
				match(WS);
				}
			}

			setState(809);
			match(Prefix);
			setState(810);
			match(WS);
			setState(811);
			match(If);
			setState(813);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(812);
				match(WS);
				}
			}

			setState(815);
			match(LeftParen);
			setState(817);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(816);
				match(WS);
				}
			}

			setState(819);
			logicalExpr(0);
			setState(821);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(820);
				match(WS);
				}
			}

			setState(823);
			match(RightParen);
			setState(825);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(824);
				match(WS);
				}
			}

			setState(827);
			match(Then);
			setState(829);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(828);
				match(WS);
				}
			}

			setState(831);
			match(Newline);
			setState(832);
			contentBlock();
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(834);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(833);
					match(WS);
					}
				}

				setState(836);
				match(Prefix);
				setState(837);
				match(WS);
				setState(838);
				match(Else);
				setState(840);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(839);
					match(WS);
					}
				}

				setState(842);
				match(Newline);
				setState(843);
				contentBlock();
				}
				break;
			}
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
			match(End);
			setState(852);
			match(WS);
			setState(853);
			match(If);
			setState(855);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(854);
				match(WS);
				}
			}

			setState(857);
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
		enterRule(_localctx, 54, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(867); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(867);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						setState(859);
						loopBlock();
						}
						break;
					case 2:
						{
						setState(860);
						templateBlock();
						}
						break;
					case 3:
						{
						setState(861);
						variableDefinition();
						}
						break;
					case 4:
						{
						setState(862);
						ifStatement();
						}
						break;
					case 5:
						{
						setState(863);
						procedureBlock();
						}
						break;
					case 6:
						{
						setState(864);
						typeDefinitionBlock();
						}
						break;
					case 7:
						{
						setState(865);
						fortranInterfaceBlock();
						}
						break;
					case 8:
						{
						setState(866);
						contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(869); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
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
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
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
		enterRule(_localctx, 56, RULE_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(871);
				match(LeftParen);
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(873);
						switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
						case 1:
							{
							setState(872);
							match(WS);
							}
							break;
						}
						setState(875);
						content();
						}
						} 
					}
					setState(880);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
				}
				setState(882);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(881);
					match(WS);
					}
				}

				setState(884);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(885);
				match(LeftParen);
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(887);
						switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
						case 1:
							{
							setState(886);
							match(WS);
							}
							break;
						}
						setState(889);
						content();
						}
						} 
					}
					setState(894);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
				}
				notifyErrorListeners("Missing closing ')'");
				}
				break;
			case 3:
				{
				setState(896);
				match(LeftParen);
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(898);
						switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
						case 1:
							{
							setState(897);
							match(WS);
							}
							break;
						}
						setState(900);
						content();
						}
						} 
					}
					setState(905);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
				}
				setState(907);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(906);
					match(WS);
					}
				}

				setState(909);
				match(RightParen);
				setState(910);
				match(RightParen);
				notifyErrorListeners("Too many closing ')'");
				}
				break;
			case 4:
				{
				setState(912);
				match(StringLiteral);
				}
				break;
			case 5:
				{
				setState(913);
				placeholder();
				}
				break;
			case 6:
				{
				setState(914);
				dynamicCast();
				}
				break;
			case 7:
				{
				setState(915);
				lineContinuation();
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(916);
						ifStatement();
						}
						} 
					}
					setState(921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				}
				break;
			case 8:
				{
				setState(922);
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
		enterRule(_localctx, 58, RULE_lineContinuation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(Ampersand);
			setState(927);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(926);
				match(WS);
				}
			}

			setState(929);
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
		enterRule(_localctx, 60, RULE_contentLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(931);
				match(WS);
				}
				break;
			}
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(934);
					content();
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			setState(942);
			switch (_input.LA(1)) {
			case Newline:
				{
				setState(940);
				match(Newline);
				}
				break;
			case Exclamation:
			case WS:
				{
				setState(941);
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
		enterRule(_localctx, 62, RULE_placeholder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(Dollar);
			setState(945);
			match(LeftBrace);
			setState(947);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(946);
				match(WS);
				}
			}

			setState(951);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(949);
				expr(0);
				}
				break;
			case 2:
				{
				setState(950);
				logicalExpr(0);
				}
				break;
			}
			setState(954);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(953);
				match(WS);
				}
			}

			setState(956);
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
		enterRule(_localctx, 64, RULE_dynamicCast);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(Dynamic_Cast);
			setState(960);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(959);
				match(WS);
				}
			}

			setState(962);
			match(Smaller);
			setState(964);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(963);
				match(WS);
				}
			}

			setState(966);
			dataType();
			setState(977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(968);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(967);
						match(WS);
						}
					}

					setState(970);
					match(Comma);
					setState(972);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(971);
						match(WS);
						}
					}

					setState(974);
					dataTypeParameter();
					}
					} 
				}
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			setState(981);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(980);
				match(WS);
				}
			}

			setState(983);
			match(Larger);
			setState(985);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(984);
				match(WS);
				}
			}

			setState(987);
			match(LeftParen);
			setState(992); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(989);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(988);
						match(WS);
						}
						break;
					}
					setState(991);
					content();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(994); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(997);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(996);
				match(WS);
				}
			}

			setState(999);
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
		enterRule(_localctx, 66, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1001);
				match(WS);
				}
			}

			setState(1004);
			match(Prefix);
			setState(1005);
			match(WS);
			setState(1006);
			listAssignment();
			setState(1008);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1007);
				match(WS);
				}
			}

			setState(1010);
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
		enterRule(_localctx, 68, RULE_lineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(1012);
				match(WS);
				}
			}

			setState(1015);
			match(Exclamation);
			setState(1026);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1016);
				match(Newline);
				}
				break;
			case 2:
				{
				setState(1017);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Dollar) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Ampersand) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Elemental) | (1L << Type) | (1L << Class) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Integer) | (1L << Real) | (1L << Complex) | (1L << Logical) | (1L << Character) | (1L << Kind) | (1L << Len) | (1L << Pointer) | (1L << Dynamic_Cast) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (StringLiteral - 64)) | (1L << (AssignPointer - 64)) | (1L << (OperatorOverload - 64)) | (1L << (WS - 64)) | (1L << (Noise - 64)))) != 0)) {
					{
					setState(1020);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
					case 1:
						{
						setState(1018);
						placeholder();
						}
						break;
					case 2:
						{
						setState(1019);
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
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1025);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1029);
				match(LeftParen);
				setState(1031);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1030);
					match(WS);
					}
				}

				setState(1033);
				expr(0);
				setState(1035);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1034);
					match(WS);
					}
				}

				setState(1037);
				match(RightParen);
				}
				break;
			case 2:
				{
				_localctx = new ExprConstantsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1039);
				match(IntegerConstant);
				}
				break;
			case 3:
				{
				_localctx = new ExprArraySubscriptContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1040);
				match(Identifier);
				setState(1042);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1041);
					match(WS);
					}
				}

				setState(1044);
				match(LeftParen);
				setState(1046);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1045);
					match(WS);
					}
				}

				setState(1048);
				expr(0);
				setState(1050);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1049);
					match(WS);
					}
				}

				setState(1052);
				match(RightParen);
				}
				break;
			case 4:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1054);
				match(Identifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1075);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1057);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1059);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1058);
							match(WS);
							}
						}

						setState(1061);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Star || _la==Slash) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1063);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1062);
							match(WS);
							}
						}

						setState(1065);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1066);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1068);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1067);
							match(WS);
							}
						}

						setState(1070);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1072);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1071);
							match(WS);
							}
						}

						setState(1074);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_logicalExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new LogicalExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1081);
				match(Not);
				setState(1083);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1082);
					match(WS);
					}
				}

				setState(1085);
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
				setState(1086);
				expr(0);
				setState(1088);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1087);
					match(WS);
					}
				}

				setState(1090);
				((LogicalExprCompareContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Smaller) | (1L << Larger))) != 0)) ) {
					((LogicalExprCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1092);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1091);
					match(WS);
					}
				}

				setState(1094);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1116);
					switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExprAndContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(1098);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1100);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1099);
							match(WS);
							}
						}

						setState(1102);
						match(And);
						setState(1104);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1103);
							match(WS);
							}
						}

						setState(1106);
						logicalExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExprOrContext(new LogicalExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(1107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1109);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1108);
							match(WS);
							}
						}

						setState(1111);
						match(Or);
						setState(1113);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(1112);
							match(WS);
							}
						}

						setState(1115);
						logicalExpr(4);
						}
						break;
					}
					} 
				}
				setState(1120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
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
		case 35:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 36:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3G\u0464\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2\3"+
		"\2\5\2U\n\2\3\2\5\2X\n\2\3\3\5\3[\n\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\3\3\3"+
		"\7\3e\n\3\f\3\16\3h\13\3\3\3\5\3k\n\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3"+
		"\5\3t\n\3\3\3\3\3\3\3\3\3\5\3z\n\3\3\3\5\3}\n\3\3\3\5\3\u0080\n\3\3\3"+
		"\5\3\u0083\n\3\3\4\5\4\u0086\n\4\3\4\3\4\3\4\3\4\5\4\u008c\n\4\3\4\3\4"+
		"\3\4\7\4\u0091\n\4\f\4\16\4\u0094\13\4\3\4\5\4\u0097\n\4\3\4\5\4\u009a"+
		"\n\4\3\4\5\4\u009d\n\4\3\4\3\4\3\4\3\4\5\4\u00a3\n\4\3\4\5\4\u00a6\n\4"+
		"\3\4\5\4\u00a9\n\4\3\5\5\5\u00ac\n\5\3\5\3\5\5\5\u00b0\n\5\3\5\3\5\3\6"+
		"\5\6\u00b5\n\6\3\6\3\6\3\6\3\6\5\6\u00bb\n\6\3\6\5\6\u00be\n\6\3\6\5\6"+
		"\u00c1\n\6\3\6\5\6\u00c4\n\6\3\6\5\6\u00c7\n\6\3\6\3\6\5\6\u00cb\n\6\3"+
		"\6\5\6\u00ce\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d6\n\6\3\6\5\6\u00d9\n"+
		"\6\3\6\3\6\3\7\3\7\5\7\u00df\n\7\3\7\3\7\3\7\5\7\u00e4\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00ec\n\7\3\7\3\7\3\b\5\b\u00f1\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\5\t\u00fb\n\t\3\n\3\n\7\n\u00ff\n\n\f\n\16\n\u0102\13\n"+
		"\3\n\3\n\3\n\3\n\5\n\u0108\n\n\3\n\5\n\u010b\n\n\3\n\5\n\u010e\n\n\3\n"+
		"\5\n\u0111\n\n\3\n\5\n\u0114\n\n\3\n\5\n\u0117\n\n\3\n\5\n\u011a\n\n\3"+
		"\n\3\n\5\n\u011e\n\n\3\n\5\n\u0121\n\n\3\n\3\n\3\n\3\n\5\n\u0127\n\n\3"+
		"\n\5\n\u012a\n\n\3\n\5\n\u012d\n\n\3\n\3\n\3\13\5\13\u0132\n\13\3\13\5"+
		"\13\u0135\n\13\3\13\5\13\u0138\n\13\3\13\3\13\3\13\3\13\5\13\u013e\n\13"+
		"\3\13\5\13\u0141\n\13\3\13\5\13\u0144\n\13\3\13\5\13\u0147\n\13\3\13\5"+
		"\13\u014a\n\13\3\13\3\13\5\13\u014e\n\13\3\13\5\13\u0151\n\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0157\n\13\3\13\5\13\u015a\n\13\3\13\5\13\u015d\n\13\3"+
		"\13\3\13\3\f\3\f\5\f\u0163\n\f\3\f\3\f\5\f\u0167\n\f\3\f\3\f\5\f\u016b"+
		"\n\f\3\f\3\f\5\f\u016f\n\f\3\f\3\f\7\f\u0173\n\f\f\f\16\f\u0176\13\f\7"+
		"\f\u0178\n\f\f\f\16\f\u017b\13\f\5\f\u017d\n\f\3\f\5\f\u0180\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\7\r\u0187\n\r\f\r\16\r\u018a\13\r\5\r\u018c\n\r\3\16\3"+
		"\16\5\16\u0190\n\16\3\16\3\16\5\16\u0194\n\16\3\16\3\16\5\16\u0198\n\16"+
		"\3\16\3\16\3\17\3\17\5\17\u019e\n\17\3\17\3\17\5\17\u01a2\n\17\3\17\3"+
		"\17\5\17\u01a6\n\17\3\17\3\17\5\17\u01aa\n\17\3\17\3\17\5\17\u01ae\n\17"+
		"\3\17\3\17\5\17\u01b2\n\17\3\17\5\17\u01b5\n\17\3\17\5\17\u01b8\n\17\3"+
		"\17\3\17\3\20\5\20\u01bd\n\20\3\20\3\20\5\20\u01c1\n\20\3\20\5\20\u01c4"+
		"\n\20\3\20\3\20\5\20\u01c8\n\20\3\20\7\20\u01cb\n\20\f\20\16\20\u01ce"+
		"\13\20\3\20\5\20\u01d1\n\20\3\20\3\20\5\20\u01d5\n\20\3\20\5\20\u01d8"+
		"\n\20\3\20\3\20\7\20\u01dc\n\20\f\20\16\20\u01df\13\20\3\20\3\20\5\20"+
		"\u01e3\n\20\3\20\5\20\u01e6\n\20\3\20\3\20\5\20\u01ea\n\20\3\20\5\20\u01ed"+
		"\n\20\3\20\3\20\7\20\u01f1\n\20\f\20\16\20\u01f4\13\20\3\20\5\20\u01f7"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u01fd\n\20\3\20\5\20\u0200\n\20\3\20\5"+
		"\20\u0203\n\20\3\20\3\20\3\21\3\21\5\21\u0209\n\21\3\21\3\21\5\21\u020d"+
		"\n\21\3\21\3\21\5\21\u0211\n\21\3\21\3\21\5\21\u0215\n\21\3\21\3\21\5"+
		"\21\u0219\n\21\3\21\3\21\5\21\u021d\n\21\5\21\u021f\n\21\3\21\3\21\5\21"+
		"\u0223\n\21\3\21\5\21\u0226\n\21\3\21\3\21\5\21\u022a\n\21\3\21\3\21\5"+
		"\21\u022e\n\21\3\21\3\21\5\21\u0232\n\21\3\21\3\21\3\21\5\21\u0237\n\21"+
		"\3\21\3\21\5\21\u023b\n\21\3\21\3\21\5\21\u023f\n\21\3\21\5\21\u0242\n"+
		"\21\3\22\3\22\3\23\5\23\u0247\n\23\3\23\3\23\5\23\u024b\n\23\3\23\5\23"+
		"\u024e\n\23\3\23\5\23\u0251\n\23\3\23\5\23\u0254\n\23\3\23\5\23\u0257"+
		"\n\23\3\23\3\23\5\23\u025b\n\23\3\23\5\23\u025e\n\23\3\23\5\23\u0261\n"+
		"\23\3\23\3\23\3\23\3\23\5\23\u0267\n\23\3\23\3\23\5\23\u026b\n\23\3\23"+
		"\7\23\u026e\n\23\f\23\16\23\u0271\13\23\3\23\5\23\u0274\n\23\3\23\3\23"+
		"\7\23\u0278\n\23\f\23\16\23\u027b\13\23\3\23\5\23\u027e\n\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0284\n\23\3\23\5\23\u0287\n\23\3\23\5\23\u028a\n\23\3"+
		"\23\3\23\3\24\3\24\3\24\5\24\u0291\n\24\3\24\3\24\5\24\u0295\n\24\3\24"+
		"\3\24\5\24\u0299\n\24\3\24\5\24\u029c\n\24\3\25\5\25\u029f\n\25\3\25\3"+
		"\25\3\25\3\25\5\25\u02a5\n\25\3\25\5\25\u02a8\n\25\3\25\3\25\5\25\u02ac"+
		"\n\25\3\25\7\25\u02af\n\25\f\25\16\25\u02b2\13\25\3\25\5\25\u02b5\n\25"+
		"\3\25\3\25\3\25\5\25\u02ba\n\25\3\25\3\25\5\25\u02be\n\25\3\25\3\25\5"+
		"\25\u02c2\n\25\3\25\3\25\5\25\u02c6\n\25\3\25\3\25\3\26\5\26\u02cb\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u02d5\n\26\3\26\5\26\u02d8"+
		"\n\26\3\26\5\26\u02db\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u02e2\n\27\f"+
		"\27\16\27\u02e5\13\27\3\30\3\30\7\30\u02e9\n\30\f\30\16\30\u02ec\13\30"+
		"\3\30\3\30\5\30\u02f0\n\30\3\31\3\31\5\31\u02f4\n\31\3\31\3\31\5\31\u02f8"+
		"\n\31\3\31\3\31\5\31\u02fc\n\31\3\31\3\31\5\31\u0300\n\31\3\31\3\31\3"+
		"\31\5\31\u0305\n\31\3\31\3\31\5\31\u0309\n\31\3\31\5\31\u030c\n\31\3\32"+
		"\3\32\5\32\u0310\n\32\3\33\5\33\u0313\n\33\3\33\3\33\3\33\3\33\5\33\u0319"+
		"\n\33\3\33\3\33\5\33\u031d\n\33\3\33\3\33\5\33\u0321\n\33\3\33\3\33\5"+
		"\33\u0325\n\33\3\33\3\33\3\34\5\34\u032a\n\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0330\n\34\3\34\3\34\5\34\u0334\n\34\3\34\3\34\5\34\u0338\n\34\3\34\3"+
		"\34\5\34\u033c\n\34\3\34\3\34\5\34\u0340\n\34\3\34\3\34\3\34\5\34\u0345"+
		"\n\34\3\34\3\34\3\34\3\34\5\34\u034b\n\34\3\34\3\34\5\34\u034f\n\34\3"+
		"\34\5\34\u0352\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u035a\n\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u0366\n\35\r\35\16"+
		"\35\u0367\3\36\3\36\5\36\u036c\n\36\3\36\7\36\u036f\n\36\f\36\16\36\u0372"+
		"\13\36\3\36\5\36\u0375\n\36\3\36\3\36\3\36\5\36\u037a\n\36\3\36\7\36\u037d"+
		"\n\36\f\36\16\36\u0380\13\36\3\36\3\36\3\36\5\36\u0385\n\36\3\36\7\36"+
		"\u0388\n\36\f\36\16\36\u038b\13\36\3\36\5\36\u038e\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u0398\n\36\f\36\16\36\u039b\13\36\3\36"+
		"\5\36\u039e\n\36\3\37\3\37\5\37\u03a2\n\37\3\37\3\37\3 \5 \u03a7\n \3"+
		" \7 \u03aa\n \f \16 \u03ad\13 \3 \3 \5 \u03b1\n \3!\3!\3!\5!\u03b6\n!"+
		"\3!\3!\5!\u03ba\n!\3!\5!\u03bd\n!\3!\3!\3\"\3\"\5\"\u03c3\n\"\3\"\3\""+
		"\5\"\u03c7\n\"\3\"\3\"\5\"\u03cb\n\"\3\"\3\"\5\"\u03cf\n\"\3\"\7\"\u03d2"+
		"\n\"\f\"\16\"\u03d5\13\"\3\"\5\"\u03d8\n\"\3\"\3\"\5\"\u03dc\n\"\3\"\3"+
		"\"\5\"\u03e0\n\"\3\"\6\"\u03e3\n\"\r\"\16\"\u03e4\3\"\5\"\u03e8\n\"\3"+
		"\"\3\"\3#\5#\u03ed\n#\3#\3#\3#\3#\5#\u03f3\n#\3#\3#\3$\5$\u03f8\n$\3$"+
		"\3$\3$\3$\3$\7$\u03ff\n$\f$\16$\u0402\13$\3$\5$\u0405\n$\3%\3%\3%\5%\u040a"+
		"\n%\3%\3%\5%\u040e\n%\3%\3%\3%\3%\3%\5%\u0415\n%\3%\3%\5%\u0419\n%\3%"+
		"\3%\5%\u041d\n%\3%\3%\3%\5%\u0422\n%\3%\3%\5%\u0426\n%\3%\3%\5%\u042a"+
		"\n%\3%\3%\3%\5%\u042f\n%\3%\3%\5%\u0433\n%\3%\7%\u0436\n%\f%\16%\u0439"+
		"\13%\3&\3&\3&\5&\u043e\n&\3&\3&\3&\5&\u0443\n&\3&\3&\5&\u0447\n&\3&\3"+
		"&\5&\u044b\n&\3&\3&\5&\u044f\n&\3&\3&\5&\u0453\n&\3&\3&\3&\5&\u0458\n"+
		"&\3&\3&\5&\u045c\n&\3&\7&\u045f\n&\f&\16&\u0462\13&\3&\4\u02ea\u03ab\4"+
		"HJ\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJ\2\17\4\2\"\"EE\3\2%&\3\2EE\3\2\66:\3\2?@\3\2*-\4\2))..\3\2*+\b\2"+
		"\3\4\16\17\24\24\32\32\37#EE\3\2\r\r\3\2\27\30\3\2\25\26\4\2\5\6\22\23"+
		"\u0544\2P\3\2\2\2\4Z\3\2\2\2\6\u0085\3\2\2\2\b\u00ab\3\2\2\2\n\u00b4\3"+
		"\2\2\2\f\u00dc\3\2\2\2\16\u00f0\3\2\2\2\20\u00fa\3\2\2\2\22\u0100\3\2"+
		"\2\2\24\u0131\3\2\2\2\26\u0160\3\2\2\2\30\u018b\3\2\2\2\32\u018d\3\2\2"+
		"\2\34\u019b\3\2\2\2\36\u01bc\3\2\2\2 \u0241\3\2\2\2\"\u0243\3\2\2\2$\u0246"+
		"\3\2\2\2&\u029b\3\2\2\2(\u029e\3\2\2\2*\u02ca\3\2\2\2,\u02de\3\2\2\2."+
		"\u02ef\3\2\2\2\60\u030b\3\2\2\2\62\u030f\3\2\2\2\64\u0312\3\2\2\2\66\u0329"+
		"\3\2\2\28\u0365\3\2\2\2:\u039d\3\2\2\2<\u039f\3\2\2\2>\u03a6\3\2\2\2@"+
		"\u03b2\3\2\2\2B\u03c0\3\2\2\2D\u03ec\3\2\2\2F\u03f7\3\2\2\2H\u0421\3\2"+
		"\2\2J\u044a\3\2\2\2LO\5\6\4\2MO\58\35\2NL\3\2\2\2NM\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SU\5\4\3\2TS\3\2\2\2TU\3\2\2\2"+
		"UW\3\2\2\2VX\58\35\2WV\3\2\2\2WX\3\2\2\2X\3\3\2\2\2Y[\7F\2\2ZY\3\2\2\2"+
		"Z[\3\2\2\2[\\\3\2\2\2\\]\7\37\2\2]^\7F\2\2^`\7?\2\2_a\7F\2\2`_\3\2\2\2"+
		"`a\3\2\2\2ab\3\2\2\2bf\7E\2\2ce\58\35\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2ik\5\b\5\2ji\3\2\2\2jk\3\2\2\2ko\3\2\2\2"+
		"ln\58\35\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"rt\7F\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\35\2\2vw\7F\2\2wy\7\37\2\2"+
		"xz\7F\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\7?\2\2|{\3\2\2\2|}\3\2\2\2}"+
		"\177\3\2\2\2~\u0080\7F\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\u0083\7E\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\5\3\2\2\2\u0084\u0086\7F\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\7 \2\2\u0088\u0089\7F\2\2\u0089\u008b"+
		"\7?\2\2\u008a\u008c\7F\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0092\7E\2\2\u008e\u0091\5*\26\2\u008f\u0091\58\35"+
		"\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0097\5\b\5\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
		"\2\2\u0098\u009a\58\35\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u009d\7F\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\35\2\2\u009f\u00a0\7F\2\2\u00a0"+
		"\u00a2\7 \2\2\u00a1\u00a3\7F\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2"+
		"\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\7?\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\7E\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\7\3\2\2\2\u00aa\u00ac\7F\2\2\u00ab\u00aa\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\7!\2\2\u00ae\u00b0"+
		"\7F\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\7E\2\2\u00b2\t\3\2\2\2\u00b3\u00b5\7F\2\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\32\2\2\u00b7\u00b8\7"+
		"F\2\2\u00b8\u00ba\7\33\2\2\u00b9\u00bb\7F\2\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\7?\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\7F\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c4\7D"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c7\7F\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\7E\2\2\u00c9\u00cb\58\35\2\u00ca\u00c9\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\7F\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\32\2\2\u00d0"+
		"\u00d1\7F\2\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3\7F\2\2\u00d3\u00d5\7\33"+
		"\2\2\u00d4\u00d6\7F\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d9\7?\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7E\2\2\u00db\13\3\2\2\2\u00dc\u00de"+
		"\5\16\b\2\u00dd\u00df\7F\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7E\2\2\u00e1\u00e3\58\35\2\u00e2\u00e4\7F\2"+
		"\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\7\32\2\2\u00e6\u00e7\7F\2\2\u00e7\u00e8\7\35\2\2\u00e8\u00e9\7F\2\2\u00e9"+
		"\u00eb\7\36\2\2\u00ea\u00ec\7F\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7E\2\2\u00ee\r\3\2\2\2\u00ef\u00f1"+
		"\7F\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\7\32\2\2\u00f3\u00f4\7F\2\2\u00f4\u00f5\7\36\2\2\u00f5\u00f6\7"+
		"F\2\2\u00f6\u00f7\5\60\31\2\u00f7\17\3\2\2\2\u00f8\u00fb\5\22\n\2\u00f9"+
		"\u00fb\5\24\13\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\21\3\2"+
		"\2\2\u00fc\u00ff\5@!\2\u00fd\u00ff\n\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\"\2\2\u0104\u0105\7F"+
		"\2\2\u0105\u010a\7?\2\2\u0106\u0108\7F\2\2\u0107\u0106\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\5\26\f\2\u010a\u0107\3\2\2\2"+
		"\u010a\u010b\3\2\2\2\u010b\u0110\3\2\2\2\u010c\u010e\7F\2\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\5\32\16\2"+
		"\u0110\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0116\3\2\2\2\u0112\u0114"+
		"\7F\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\5\34\17\2\u0116\u0113\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3"+
		"\2\2\2\u0118\u011a\7F\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\7E\2\2\u011c\u011e\58\35\2\u011d\u011c\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\7F\2\2\u0120"+
		"\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\35"+
		"\2\2\u0123\u0124\7F\2\2\u0124\u0126\7\"\2\2\u0125\u0127\7F\2\2\u0126\u0125"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u012a\7?\2\2\u0129"+
		"\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\7F"+
		"\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\7E\2\2\u012f\23\3\2\2\2\u0130\u0132\7F\2\2\u0131\u0130\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\t\3\2\2\u0134\u0133"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\7F\2\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7#"+
		"\2\2\u013a\u013b\7F\2\2\u013b\u0140\7?\2\2\u013c\u013e\7F\2\2\u013d\u013c"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\5\26\f\2"+
		"\u0140\u013d\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0146\3\2\2\2\u0142\u0144"+
		"\7F\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\5\34\17\2\u0146\u0143\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3"+
		"\2\2\2\u0148\u014a\7F\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\7E\2\2\u014c\u014e\58\35\2\u014d\u014c\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\7F\2\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\35"+
		"\2\2\u0153\u0154\7F\2\2\u0154\u0156\7#\2\2\u0155\u0157\7F\2\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u015a\7?\2\2\u0159"+
		"\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u015d\7F"+
		"\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\7E\2\2\u015f\25\3\2\2\2\u0160\u017c\7\16\2\2\u0161\u0163\7F\2\2"+
		"\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0179"+
		"\5\30\r\2\u0165\u0167\7F\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016a\7\b\2\2\u0169\u016b\7F\2\2\u016a\u0169\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0178\5\30\r\2\u016d"+
		"\u016f\7F\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0174\5<\37\2\u0171\u0173\5\62\32\2\u0172\u0171\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0177\u0166\3\2\2\2\u0177\u016e\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017c\u0162\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0180\7F\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\17\2\2\u0182\27\3\2\2\2\u0183\u018c"+
		"\n\4\2\2\u0184\u0188\5<\37\2\u0185\u0187\5\62\32\2\u0186\u0185\3\2\2\2"+
		"\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0183\3\2\2\2\u018b\u0184\3\2\2\2\u018c"+
		"\31\3\2\2\2\u018d\u018f\7?\2\2\u018e\u0190\7F\2\2\u018f\u018e\3\2\2\2"+
		"\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\7\16\2\2\u0192\u0194"+
		"\7F\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0197\7?\2\2\u0196\u0198\7F\2\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2"+
		"\2\u0198\u0199\3\2\2\2\u0199\u019a\7\17\2\2\u019a\33\3\2\2\2\u019b\u019d"+
		"\7.\2\2\u019c\u019e\7F\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a1\7\16\2\2\u01a0\u01a2\7F\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01b4\7?\2\2\u01a4"+
		"\u01a6\7F\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\7\b\2\2\u01a8\u01aa\7F\2\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\7?\2\2\u01ac\u01ae\7F\2"+
		"\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1"+
		"\7\7\2\2\u01b0\u01b2\7F\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b5\7B\2\2\u01b4\u01a5\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b8\7F\2\2\u01b7\u01b6\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\17\2\2\u01ba\35\3\2\2"+
		"\2\u01bb\u01bd\7F\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01c0\7\'\2\2\u01bf\u01c1\7F\2\2\u01c0\u01bf\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01cc\3\2\2\2\u01c2\u01c4\7F\2\2\u01c3\u01c2\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\7\b\2\2\u01c6"+
		"\u01c8\7F\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cb\5&\24\2\u01ca\u01c3\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01d1\7F\2\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d3\7\n\2\2\u01d3\u01d5\7\n\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d8\7F\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd\7?"+
		"\2\2\u01da\u01dc\n\4\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01e0\u01e2\7E\2\2\u01e1\u01e3\58\35\2\u01e2\u01e1\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01ec\3\2\2\2\u01e4\u01e6\7F\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\7!\2\2\u01e8"+
		"\u01ea\7F\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ed\7E\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01f2\3\2\2\2\u01ee\u01f1\58\35\2\u01ef\u01f1\5(\25\2\u01f0\u01ee\3\2"+
		"\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\7F"+
		"\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\7\35\2\2\u01f9\u01fa\7F\2\2\u01fa\u01fc\7\'\2\2\u01fb\u01fd\7F"+
		"\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe"+
		"\u0200\7?\2\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2"+
		"\2\2\u0201\u0203\7F\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\7E\2\2\u0205\37\3\2\2\2\u0206\u0208\t\5\2\2"+
		"\u0207\u0209\7F\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0225"+
		"\3\2\2\2\u020a\u020c\7\16\2\2\u020b\u020d\7F\2\2\u020c\u020b\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u021e\3\2\2\2\u020e\u0210\7;\2\2\u020f\u0211\7F\2"+
		"\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214"+
		"\7\7\2\2\u0213\u0215\7F\2\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u021f\3\2\2\2\u0216\u0218\7<\2\2\u0217\u0219\7F\2\2\u0218\u0217\3\2\2"+
		"\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\7\7\2\2\u021b\u021d"+
		"\7F\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e"+
		"\u020e\3\2\2\2\u021e\u0216\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0222\t\6\2\2\u0221\u0223\7F\2\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\7\17\2\2\u0225\u020a\3"+
		"\2\2\2\u0225\u0226\3\2\2\2\u0226\u0242\3\2\2\2\u0227\u0229\7\'\2\2\u0228"+
		"\u022a\7F\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022d\7\16\2\2\u022c\u022e\7F\2\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\7?\2\2\u0230\u0232\7F\2"+
		"\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0242"+
		"\7\17\2\2\u0234\u0236\7(\2\2\u0235\u0237\7F\2\2\u0236\u0235\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\7\16\2\2\u0239\u023b\7"+
		"F\2\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\7?\2\2\u023d\u023f\7F\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2"+
		"\2\u023f\u0240\3\2\2\2\u0240\u0242\7\17\2\2\u0241\u0206\3\2\2\2\u0241"+
		"\u0227\3\2\2\2\u0241\u0234\3\2\2\2\u0242!\3\2\2\2\u0243\u0244\7=\2\2\u0244"+
		"#\3\2\2\2\u0245\u0247\7F\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u024a\7\34\2\2\u0249\u024b\7F\2\2\u024a\u0249\3\2"+
		"\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024e\7?\2\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\7F"+
		"\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252"+
		"\u0254\7D\2\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2"+
		"\2\2\u0255\u0257\7F\2\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u0279\7E\2\2\u0259\u025b\7F\2\2\u025a\u0259\3\2\2"+
		"\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025e\7 \2\2\u025d\u025c"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u0261\7F\2\2\u0260"+
		"\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\7$"+
		"\2\2\u0263\u0264\7F\2\2\u0264\u026f\7?\2\2\u0265\u0267\7F\2\2\u0266\u0265"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\7\b\2\2\u0269"+
		"\u026b\7F\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\u026e\7?\2\2\u026d\u0266\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2"+
		"\2\2\u0272\u0274\7F\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0278\7E\2\2\u0276\u0278\5\20\t\2\u0277\u025a\3\2"+
		"\2\2\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027e\7F"+
		"\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0280\7\35\2\2\u0280\u0281\7F\2\2\u0281\u0283\7\34\2\2\u0282\u0284\7"+
		"F\2\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285"+
		"\u0287\7?\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2"+
		"\2\2\u0288\u028a\7F\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028c\7E\2\2\u028c%\3\2\2\2\u028d\u029c\t\7\2\2\u028e"+
		"\u0290\t\b\2\2\u028f\u0291\7F\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0292\3\2\2\2\u0292\u0294\7\16\2\2\u0293\u0295\7F\2\2\u0294"+
		"\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\7?"+
		"\2\2\u0297\u0299\7F\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029c\7\17\2\2\u029b\u028d\3\2\2\2\u029b\u028e\3"+
		"\2\2\2\u029c\'\3\2\2\2\u029d\u029f\7F\2\2\u029e\u029d\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\32\2\2\u02a1\u02a2\7F\2\2\u02a2"+
		"\u02a4\7/\2\2\u02a3\u02a5\7F\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2"+
		"\2\u02a5\u02b0\3\2\2\2\u02a6\u02a8\7F\2\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\7\b\2\2\u02aa\u02ac\7F\2\2\u02ab"+
		"\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02af\t\t"+
		"\2\2\u02ae\u02a7\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b5\7F"+
		"\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02b7\7\n\2\2\u02b7\u02b9\7\n\2\2\u02b8\u02ba\7F\2\2\u02b9\u02b8\3\2"+
		"\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\7?\2\2\u02bc"+
		"\u02be\7F\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2"+
		"\2\2\u02bf\u02c1\7C\2\2\u02c0\u02c2\7F\2\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\7?\2\2\u02c4\u02c6\7F\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7E"+
		"\2\2\u02c8)\3\2\2\2\u02c9\u02cb\7F\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\7\32\2\2\u02cd\u02ce\7F\2\2\u02ce"+
		"\u02cf\7\34\2\2\u02cf\u02d0\7F\2\2\u02d0\u02d1\7\33\2\2\u02d1\u02d2\7"+
		"F\2\2\u02d2\u02d4\7?\2\2\u02d3\u02d5\7F\2\2\u02d4\u02d3\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d8\7D\2\2\u02d7\u02d6\3\2"+
		"\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02db\7F\2\2\u02da"+
		"\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7E"+
		"\2\2\u02dd+\3\2\2\2\u02de\u02e3\5.\30\2\u02df\u02e0\7F\2\2\u02e0\u02e2"+
		"\5.\30\2\u02e1\u02df\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4-\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02ea\7\13\2\2"+
		"\u02e7\u02e9\n\4\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02eb"+
		"\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed"+
		"\u02f0\7\f\2\2\u02ee\u02f0\n\4\2\2\u02ef\u02e6\3\2\2\2\u02ef\u02ee\3\2"+
		"\2\2\u02f0/\3\2\2\2\u02f1\u02f3\7?\2\2\u02f2\u02f4\7F\2\2\u02f3\u02f2"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\7\7\2\2\u02f6"+
		"\u02f8\7F\2\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u02fb\7@\2\2\u02fa\u02fc\7F\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\7\b\2\2\u02fe\u0300\7F\2\2\u02ff"+
		"\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u030c\7@"+
		"\2\2\u0302\u0304\7?\2\2\u0303\u0305\7F\2\2\u0304\u0303\3\2\2\2\u0304\u0305"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\7\7\2\2\u0307\u0309\7F\2\2\u0308"+
		"\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\5,"+
		"\27\2\u030b\u02f1\3\2\2\2\u030b\u0302\3\2\2\2\u030c\61\3\2\2\2\u030d\u0310"+
		"\5\66\34\2\u030e\u0310\5\64\33\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2"+
		"\2\u0310\63\3\2\2\2\u0311\u0313\7F\2\2\u0312\u0311\3\2\2\2\u0312\u0313"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\7\32\2\2\u0315\u0316\7F\2\2\u0316"+
		"\u0318\7\60\2\2\u0317\u0319\7F\2\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u031a\u031c\7\16\2\2\u031b\u031d\7F\2\2\u031c"+
		"\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\5J"+
		"&\2\u031f\u0321\7F\2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322"+
		"\3\2\2\2\u0322\u0324\7\17\2\2\u0323\u0325\7F\2\2\u0324\u0323\3\2\2\2\u0324"+
		"\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\5> \2\u0327\65\3\2\2\2"+
		"\u0328\u032a\7F\2\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u032c\7\32\2\2\u032c\u032d\7F\2\2\u032d\u032f\7\60\2\2"+
		"\u032e\u0330\7F\2\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331"+
		"\3\2\2\2\u0331\u0333\7\16\2\2\u0332\u0334\7F\2\2\u0333\u0332\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\5J&\2\u0336\u0338\7F\2"+
		"\2\u0337\u0336\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033b"+
		"\7\17\2\2\u033a\u033c\7F\2\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d\u033f\7\61\2\2\u033e\u0340\7F\2\2\u033f\u033e\3\2"+
		"\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0342\7E\2\2\u0342"+
		"\u034e\58\35\2\u0343\u0345\7F\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2"+
		"\2\2\u0345\u0346\3\2\2\2\u0346\u0347\7\32\2\2\u0347\u0348\7F\2\2\u0348"+
		"\u034a\7\62\2\2\u0349\u034b\7F\2\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034b\u034c\3\2\2\2\u034c\u034d\7E\2\2\u034d\u034f\58\35\2\u034e"+
		"\u0344\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u0352\7F"+
		"\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\7\32\2\2\u0354\u0355\7F\2\2\u0355\u0356\7\35\2\2\u0356\u0357\7"+
		"F\2\2\u0357\u0359\7\60\2\2\u0358\u035a\7F\2\2\u0359\u0358\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\7E\2\2\u035c\67\3\2\2\2"+
		"\u035d\u0366\5\f\7\2\u035e\u0366\5\n\6\2\u035f\u0366\5D#\2\u0360\u0366"+
		"\5\62\32\2\u0361\u0366\5\20\t\2\u0362\u0366\5\36\20\2\u0363\u0366\5$\23"+
		"\2\u0364\u0366\5> \2\u0365\u035d\3\2\2\2\u0365\u035e\3\2\2\2\u0365\u035f"+
		"\3\2\2\2\u0365\u0360\3\2\2\2\u0365\u0361\3\2\2\2\u0365\u0362\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0365\3\2"+
		"\2\2\u0367\u0368\3\2\2\2\u03689\3\2\2\2\u0369\u0370\7\16\2\2\u036a\u036c"+
		"\7F\2\2\u036b\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u036f\5:\36\2\u036e\u036b\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0373"+
		"\u0375\7F\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2"+
		"\2\2\u0376\u039e\7\17\2\2\u0377\u037e\7\16\2\2\u0378\u037a\7F\2\2\u0379"+
		"\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037d\5:"+
		"\36\2\u037c\u0379\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0381\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u039e\b\36"+
		"\1\2\u0382\u0389\7\16\2\2\u0383\u0385\7F\2\2\u0384\u0383\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\5:\36\2\u0387\u0384\3\2"+
		"\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038e\7F\2\2\u038d\u038c\3\2"+
		"\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\7\17\2\2\u0390"+
		"\u0391\7\17\2\2\u0391\u039e\b\36\1\2\u0392\u039e\7B\2\2\u0393\u039e\5"+
		"@!\2\u0394\u039e\5B\"\2\u0395\u0399\5<\37\2\u0396\u0398\5\62\32\2\u0397"+
		"\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2"+
		"\2\2\u039a\u039e\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039e\n\n\2\2\u039d"+
		"\u0369\3\2\2\2\u039d\u0377\3\2\2\2\u039d\u0382\3\2\2\2\u039d\u0392\3\2"+
		"\2\2\u039d\u0393\3\2\2\2\u039d\u0394\3\2\2\2\u039d\u0395\3\2\2\2\u039d"+
		"\u039c\3\2\2\2\u039e;\3\2\2\2\u039f\u03a1\7\31\2\2\u03a0\u03a2\7F\2\2"+
		"\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4"+
		"\7E\2\2\u03a4=\3\2\2\2\u03a5\u03a7\7F\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7"+
		"\3\2\2\2\u03a7\u03ab\3\2\2\2\u03a8\u03aa\5:\36\2\u03a9\u03a8\3\2\2\2\u03aa"+
		"\u03ad\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03b0\3\2"+
		"\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\7E\2\2\u03af\u03b1\5F$\2\u03b0\u03ae"+
		"\3\2\2\2\u03b0\u03af\3\2\2\2\u03b1?\3\2\2\2\u03b2\u03b3\7\r\2\2\u03b3"+
		"\u03b5\7\13\2\2\u03b4\u03b6\7F\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03ba\5H%\2\u03b8\u03ba\5J&\2\u03b9\u03b7"+
		"\3\2\2\2\u03b9\u03b8\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\7F\2\2\u03bc"+
		"\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\7\f"+
		"\2\2\u03bfA\3\2\2\2\u03c0\u03c2\7>\2\2\u03c1\u03c3\7F\2\2\u03c2\u03c1"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\7\22\2\2"+
		"\u03c5\u03c7\7F\2\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8"+
		"\3\2\2\2\u03c8\u03d3\5 \21\2\u03c9\u03cb\7F\2\2\u03ca\u03c9\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\7\b\2\2\u03cd\u03cf\7F"+
		"\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"\u03d2\5\"\22\2\u03d1\u03ca\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3"+
		"\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6"+
		"\u03d8\7F\2\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03d9\3\2"+
		"\2\2\u03d9\u03db\7\23\2\2\u03da\u03dc\7F\2\2\u03db\u03da\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e2\7\16\2\2\u03de\u03e0\7"+
		"F\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03e3\5:\36\2\u03e2\u03df\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e2\3\2"+
		"\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6\u03e8\7F\2\2\u03e7"+
		"\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\7\17"+
		"\2\2\u03eaC\3\2\2\2\u03eb\u03ed\7F\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\7\32\2\2\u03ef\u03f0\7F\2\2\u03f0"+
		"\u03f2\5\60\31\2\u03f1\u03f3\7F\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3"+
		"\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\7E\2\2\u03f5E\3\2\2\2\u03f6\u03f8"+
		"\7F\2\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u0404\7\24\2\2\u03fa\u0405\7E\2\2\u03fb\u0400\n\13\2\2\u03fc\u03ff\5"+
		"@!\2\u03fd\u03ff\n\4\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03fd\3\2\2\2\u03ff"+
		"\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\3\2"+
		"\2\2\u0402\u0400\3\2\2\2\u0403\u0405\7E\2\2\u0404\u03fa\3\2\2\2\u0404"+
		"\u03fb\3\2\2\2\u0405G\3\2\2\2\u0406\u0407\b%\1\2\u0407\u0409\7\16\2\2"+
		"\u0408\u040a\7F\2\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b"+
		"\3\2\2\2\u040b\u040d\5H%\2\u040c\u040e\7F\2\2\u040d\u040c\3\2\2\2\u040d"+
		"\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\7\17\2\2\u0410\u0422\3"+
		"\2\2\2\u0411\u0422\7@\2\2\u0412\u0414\7?\2\2\u0413\u0415\7F\2\2\u0414"+
		"\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\7\16"+
		"\2\2\u0417\u0419\7F\2\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u041c\5H%\2\u041b\u041d\7F\2\2\u041c\u041b\3\2\2"+
		"\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\7\17\2\2\u041f"+
		"\u0422\3\2\2\2\u0420\u0422\7?\2\2\u0421\u0406\3\2\2\2\u0421\u0411\3\2"+
		"\2\2\u0421\u0412\3\2\2\2\u0421\u0420\3\2\2\2\u0422\u0437\3\2\2\2\u0423"+
		"\u0425\f\b\2\2\u0424\u0426\7F\2\2\u0425\u0424\3\2\2\2\u0425\u0426\3\2"+
		"\2\2\u0426\u0427\3\2\2\2\u0427\u0429\t\f\2\2\u0428\u042a\7F\2\2\u0429"+
		"\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0436\5H"+
		"%\t\u042c\u042e\f\7\2\2\u042d\u042f\7F\2\2\u042e\u042d\3\2\2\2\u042e\u042f"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0432\t\r\2\2\u0431\u0433\7F\2\2\u0432"+
		"\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436\5H"+
		"%\b\u0435\u0423\3\2\2\2\u0435\u042c\3\2\2\2\u0436\u0439\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438I\3\2\2\2\u0439\u0437\3\2\2\2"+
		"\u043a\u043b\b&\1\2\u043b\u043d\7\64\2\2\u043c\u043e\7F\2\2\u043d\u043c"+
		"\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u044b\5J&\4\u0440"+
		"\u0442\5H%\2\u0441\u0443\7F\2\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2"+
		"\2\u0443\u0444\3\2\2\2\u0444\u0446\t\16\2\2\u0445\u0447\7F\2\2\u0446\u0445"+
		"\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\5H%\2\u0449"+
		"\u044b\3\2\2\2\u044a\u043a\3\2\2\2\u044a\u0440\3\2\2\2\u044b\u0460\3\2"+
		"\2\2\u044c\u044e\f\6\2\2\u044d\u044f\7F\2\2\u044e\u044d\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0452\7\63\2\2\u0451\u0453\7"+
		"F\2\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u045f\5J&\7\u0455\u0457\f\5\2\2\u0456\u0458\7F\2\2\u0457\u0456\3\2\2"+
		"\2\u0457\u0458\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\7\65\2\2\u045a"+
		"\u045c\7F\2\2\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\3\2"+
		"\2\2\u045d\u045f\5J&\6\u045e\u044c\3\2\2\2\u045e\u0455\3\2\2\2\u045f\u0462"+
		"\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461K\3\2\2\2\u0462"+
		"\u0460\3\2\2\2\u00f8NPTWZ`fjosy|\177\u0082\u0085\u008b\u0090\u0092\u0096"+
		"\u0099\u009c\u00a2\u00a5\u00a8\u00ab\u00af\u00b4\u00ba\u00bd\u00c0\u00c3"+
		"\u00c6\u00ca\u00cd\u00d5\u00d8\u00de\u00e3\u00eb\u00f0\u00fa\u00fe\u0100"+
		"\u0107\u010a\u010d\u0110\u0113\u0116\u0119\u011d\u0120\u0126\u0129\u012c"+
		"\u0131\u0134\u0137\u013d\u0140\u0143\u0146\u0149\u014d\u0150\u0156\u0159"+
		"\u015c\u0162\u0166\u016a\u016e\u0174\u0177\u0179\u017c\u017f\u0188\u018b"+
		"\u018f\u0193\u0197\u019d\u01a1\u01a5\u01a9\u01ad\u01b1\u01b4\u01b7\u01bc"+
		"\u01c0\u01c3\u01c7\u01cc\u01d0\u01d4\u01d7\u01dd\u01e2\u01e5\u01e9\u01ec"+
		"\u01f0\u01f2\u01f6\u01fc\u01ff\u0202\u0208\u020c\u0210\u0214\u0218\u021c"+
		"\u021e\u0222\u0225\u0229\u022d\u0231\u0236\u023a\u023e\u0241\u0246\u024a"+
		"\u024d\u0250\u0253\u0256\u025a\u025d\u0260\u0266\u026a\u026f\u0273\u0277"+
		"\u0279\u027d\u0283\u0286\u0289\u0290\u0294\u0298\u029b\u029e\u02a4\u02a7"+
		"\u02ab\u02b0\u02b4\u02b9\u02bd\u02c1\u02c5\u02ca\u02d4\u02d7\u02da\u02e3"+
		"\u02ea\u02ef\u02f3\u02f7\u02fb\u02ff\u0304\u0308\u030b\u030f\u0312\u0318"+
		"\u031c\u0320\u0324\u0329\u032f\u0333\u0337\u033b\u033f\u0344\u034a\u034e"+
		"\u0351\u0359\u0365\u0367\u036b\u0370\u0374\u0379\u037e\u0384\u0389\u038d"+
		"\u0399\u039d\u03a1\u03a6\u03ab\u03b0\u03b5\u03b9\u03bc\u03c2\u03c6\u03ca"+
		"\u03ce\u03d3\u03d7\u03db\u03df\u03e4\u03e7\u03ec\u03f2\u03f7\u03fe\u0400"+
		"\u0404\u0409\u040d\u0414\u0418\u041c\u0421\u0425\u0429\u042e\u0432\u0435"+
		"\u0437\u043d\u0442\u0446\u044a\u044e\u0452\u0457\u045b\u045e\u0460";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}