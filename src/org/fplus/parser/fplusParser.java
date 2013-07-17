// Generated from fplus.g4 by ANTLR 4.1
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Assign=1, Comma=2, Semicolon=3, Colon=4, LeftBrace=5, RightBrace=6, Dollar=7, 
		LeftParen=8, RightParen=9, LeftBracket=10, RightBracket=11, Smaller=12, 
		Larger=13, Prefix=14, Template=15, Interface=16, End=17, Do=18, Program=19, 
		Module=20, Contains=21, Function=22, Subroutine=23, Type=24, Extends=25, 
		Private=26, Public=27, Sequence=28, Abstract=29, Bind=30, Generic=31, 
		Identifier=32, IntegerConstant=33, StringLiteral=34, AssignPointer=35, 
		Newline=36, WS=37, Noise=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "','", "';'", "':'", "'{'", "'}'", "'$'", "'('", "')'", 
		"'['", "']'", "'<'", "'>'", "Prefix", "Template", "Interface", "End", 
		"Do", "Program", "Module", "Contains", "Function", "Subroutine", "Type", 
		"Extends", "Private", "Public", "Sequence", "Abstract", "Bind", "Generic", 
		"Identifier", "IntegerConstant", "StringLiteral", "AssignPointer", "Newline", 
		"WS", "Noise"
	};
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_templateBlock = 3, 
		RULE_loopBlock = 4, RULE_loopBegin = 5, RULE_procedureBlock = 6, RULE_functionBlock = 7, 
		RULE_subroutineBlock = 8, RULE_typeDefinitionBlock = 9, RULE_typeAttributes = 10, 
		RULE_genericTypeBoundLine = 11, RULE_interfaceLine = 12, RULE_list = 13, 
		RULE_listItem = 14, RULE_listAssignment = 15, RULE_contentBlock = 16, 
		RULE_contentLine = 17, RULE_placeholder = 18, RULE_variableDefinition = 19;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "templateBlock", "loopBlock", 
		"loopBegin", "procedureBlock", "functionBlock", "subroutineBlock", "typeDefinitionBlock", 
		"typeAttributes", "genericTypeBoundLine", "interfaceLine", "list", "listItem", 
		"listAssignment", "contentBlock", "contentLine", "placeholder", "variableDefinition"
	};

	@Override
	public String getGrammarFileName() { return "fplus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public fplusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FortranFileContext extends ParserRuleContext {
		public ModuleBlockContext moduleBlock(int i) {
			return getRuleContext(ModuleBlockContext.class,i);
		}
		public ProgramBlockContext programBlock() {
			return getRuleContext(ProgramBlockContext.class,0);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public List<ModuleBlockContext> moduleBlock() {
			return getRuleContexts(ModuleBlockContext.class);
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
	}

	public final FortranFileContext fortranFile() throws RecognitionException {
		FortranFileContext _localctx = new FortranFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fortranFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(42);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(40); moduleBlock();
						}
						break;

					case 2:
						{
						setState(41); contentBlock();
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(47); programBlock();
				}
				break;
			}
			setState(51);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << Newline) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(50); contentBlock();
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Program() { return getTokens(fplusParser.Program); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Program(int i) {
			return getToken(fplusParser.Program, i);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
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
	}

	public final ProgramBlockContext programBlock() throws RecognitionException {
		ProgramBlockContext _localctx = new ProgramBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(53); match(WS);
				}
			}

			setState(56); match(Program);
			setState(57); match(WS);
			setState(58); match(Identifier);
			setState(60);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(59); match(WS);
				}
			}

			setState(62); match(Newline);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(63); contentBlock();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(70);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(69); match(WS);
				}
			}

			setState(72); match(End);
			setState(73); match(WS);
			setState(74); match(Program);
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(75); match(WS);
				}
				break;
			}
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(78); match(Identifier);
				}
				break;
			}
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(81); match(WS);
				}
				break;
			}
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(84); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public List<InterfaceLineContext> interfaceLine() {
			return getRuleContexts(InterfaceLineContext.class);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public TypeDefinitionBlockContext typeDefinitionBlock(int i) {
			return getRuleContext(TypeDefinitionBlockContext.class,i);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public InterfaceLineContext interfaceLine(int i) {
			return getRuleContext(InterfaceLineContext.class,i);
		}
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TypeDefinitionBlockContext> typeDefinitionBlock() {
			return getRuleContexts(TypeDefinitionBlockContext.class);
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
	}

	public final ModuleBlockContext moduleBlock() throws RecognitionException {
		ModuleBlockContext _localctx = new ModuleBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moduleBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(87); match(WS);
				}
			}

			setState(90); match(Module);
			setState(91); match(WS);
			setState(92); match(Identifier);
			setState(94);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(93); match(WS);
				}
			}

			setState(96); match(Newline);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(100);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(97); contentBlock();
						}
						break;

					case 2:
						{
						setState(98); interfaceLine();
						}
						break;

					case 3:
						{
						setState(99); typeDefinitionBlock();
						}
						break;
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(106);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(105); match(WS);
				}
			}

			setState(108); match(Contains);
			setState(110);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(109); match(WS);
				}
			}

			setState(112); match(Newline);
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(113); contentBlock();
				}
				break;
			}
			setState(117);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(116); match(WS);
				}
			}

			setState(119); match(End);
			setState(120); match(WS);
			setState(121); match(Module);
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(122); match(WS);
				}
				break;
			}
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(125); match(Identifier);
				}
				break;
			}
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(128); match(Newline);
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

	public static class TemplateBlockContext extends ParserRuleContext {
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Template(int i) {
			return getToken(fplusParser.Template, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Template() { return getTokens(fplusParser.Template); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
	}

	public final TemplateBlockContext templateBlock() throws RecognitionException {
		TemplateBlockContext _localctx = new TemplateBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templateBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(131); match(WS);
				}
			}

			setState(134); match(Prefix);
			setState(135); match(WS);
			setState(136); match(Template);
			setState(138);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(137); match(WS);
				}
			}

			setState(141);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(140); match(Identifier);
				}
			}

			setState(143); match(Newline);
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(144); contentBlock();
				}
				break;
			}
			setState(148);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(147); match(WS);
				}
			}

			setState(150); match(Prefix);
			setState(151); match(WS);
			setState(152); match(End);
			setState(153); match(WS);
			setState(154); match(Template);
			setState(156);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(155); match(WS);
				}
			}

			setState(159);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(158); match(Identifier);
				}
			}

			setState(161); match(Newline);
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public LoopBeginContext loopBegin() {
			return getRuleContext(LoopBeginContext.class,0);
		}
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
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
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); loopBegin();
			setState(165);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(164); match(WS);
				}
			}

			setState(167); match(Newline);
			setState(168); contentBlock();
			setState(170);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(169); match(WS);
				}
			}

			setState(172); match(Prefix);
			setState(173); match(WS);
			setState(174); match(End);
			setState(175); match(WS);
			setState(176); match(Do);
			setState(178);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(177); match(WS);
				}
			}

			setState(180); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public TerminalNode Do() { return getToken(fplusParser.Do, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
	}

	public final LoopBeginContext loopBegin() throws RecognitionException {
		LoopBeginContext _localctx = new LoopBeginContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(182); match(WS);
				}
			}

			setState(185); match(Prefix);
			setState(186); match(WS);
			setState(187); match(Do);
			setState(188); match(WS);
			setState(189); listAssignment();
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
		public SubroutineBlockContext subroutineBlock() {
			return getRuleContext(SubroutineBlockContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
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
	}

	public final ProcedureBlockContext procedureBlock() throws RecognitionException {
		ProcedureBlockContext _localctx = new ProcedureBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureBlock);
		try {
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); functionBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); subroutineBlock();
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public List<TerminalNode> Function() { return getTokens(fplusParser.Function); }
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Function(int i) {
			return getToken(fplusParser.Function, i);
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
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Subroutine) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(197);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(195); placeholder();
					}
					break;

				case 2:
					{
					setState(196);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Function || _la==Newline) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202); match(Function);
			setState(203); match(WS);
			setState(204); match(Identifier);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(205);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); match(Newline);
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(212); contentBlock();
				}
				break;
			}
			setState(216);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(215); match(WS);
				}
			}

			setState(218); match(End);
			setState(219); match(WS);
			setState(220); match(Function);
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(221); match(WS);
				}
				break;
			}
			setState(225);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(224); match(Identifier);
				}
			}

			setState(228);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(227); match(WS);
				}
			}

			setState(230); match(Newline);
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> Subroutine() { return getTokens(fplusParser.Subroutine); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public ContentBlockContext contentBlock() {
			return getRuleContext(ContentBlockContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Subroutine(int i) {
			return getToken(fplusParser.Subroutine, i);
		}
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
	}

	public final SubroutineBlockContext subroutineBlock() throws RecognitionException {
		SubroutineBlockContext _localctx = new SubroutineBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subroutineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(232); match(WS);
				}
			}

			setState(235); match(Subroutine);
			setState(236); match(WS);
			setState(237); match(Identifier);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(238);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244); match(Newline);
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(245); contentBlock();
				}
				break;
			}
			setState(249);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(248); match(WS);
				}
			}

			setState(251); match(End);
			setState(252); match(WS);
			setState(253); match(Subroutine);
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(254); match(WS);
				}
				break;
			}
			setState(258);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(257); match(Identifier);
				}
			}

			setState(261);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(260); match(WS);
				}
			}

			setState(263); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public List<GenericTypeBoundLineContext> genericTypeBoundLine() {
			return getRuleContexts(GenericTypeBoundLineContext.class);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Type(int i) {
			return getToken(fplusParser.Type, i);
		}
		public List<TypeAttributesContext> typeAttributes() {
			return getRuleContexts(TypeAttributesContext.class);
		}
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> Type() { return getTokens(fplusParser.Type); }
		public TypeAttributesContext typeAttributes(int i) {
			return getRuleContext(TypeAttributesContext.class,i);
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
	}

	public final TypeDefinitionBlockContext typeDefinitionBlock() throws RecognitionException {
		TypeDefinitionBlockContext _localctx = new TypeDefinitionBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeDefinitionBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(265); match(WS);
				}
			}

			setState(268); match(Type);
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(269); match(WS);
				}
				break;
			}
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(272); match(WS);
						}
					}

					setState(275); match(Comma);
					setState(277);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(276); match(WS);
						}
					}

					setState(279); typeAttributes();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(285); match(WS);
				}
				break;
			}
			setState(290);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(288); match(Colon);
				setState(289); match(Colon);
				}
			}

			setState(293);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(292); match(WS);
				}
			}

			setState(295); match(Identifier);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(296);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302); match(Newline);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(305);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(303); contentBlock();
						}
						break;

					case 2:
						{
						setState(304); genericTypeBoundLine();
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(311);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(310); match(WS);
				}
			}

			setState(313); match(End);
			setState(314); match(WS);
			setState(315); match(Type);
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(316); match(WS);
				}
				break;
			}
			setState(320);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(319); match(Identifier);
				}
			}

			setState(323);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(322); match(WS);
				}
			}

			setState(325); match(Newline);
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
		public TerminalNode Extends() { return getToken(fplusParser.Extends, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Public() { return getToken(fplusParser.Public, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Sequence() { return getToken(fplusParser.Sequence, 0); }
		public TerminalNode Private() { return getToken(fplusParser.Private, 0); }
		public TerminalNode Abstract() { return getToken(fplusParser.Abstract, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Bind() { return getToken(fplusParser.Bind, 0); }
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
	}

	public final TypeAttributesContext typeAttributes() throws RecognitionException {
		TypeAttributesContext _localctx = new TypeAttributesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeAttributes);
		int _la;
		try {
			setState(341);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Sequence:
			case Abstract:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case Extends:
			case Bind:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Bind) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(330);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(329); match(WS);
					}
				}

				setState(332); match(LeftParen);
				setState(334);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(333); match(WS);
					}
				}

				setState(336); match(Identifier);
				setState(338);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(337); match(WS);
					}
				}

				setState(340); match(RightParen);
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
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> Public() { return getTokens(fplusParser.Public); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Public(int i) {
			return getToken(fplusParser.Public, i);
		}
		public TerminalNode Generic() { return getToken(fplusParser.Generic, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public List<TerminalNode> Private() { return getTokens(fplusParser.Private); }
		public TerminalNode AssignPointer() { return getToken(fplusParser.AssignPointer, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Private(int i) {
			return getToken(fplusParser.Private, i);
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
	}

	public final GenericTypeBoundLineContext genericTypeBoundLine() throws RecognitionException {
		GenericTypeBoundLineContext _localctx = new GenericTypeBoundLineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_genericTypeBoundLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(343); match(WS);
				}
			}

			setState(346); match(Prefix);
			setState(347); match(WS);
			setState(348); match(Generic);
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(349); match(WS);
				}
				break;
			}
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(352); match(WS);
						}
					}

					setState(355); match(Comma);
					setState(357);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(356); match(WS);
						}
					}

					setState(359);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(366);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(365); match(WS);
				}
			}

			setState(368); match(Colon);
			setState(369); match(Colon);
			setState(371);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(370); match(WS);
				}
			}

			setState(373); match(Identifier);
			setState(375);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(374); match(WS);
				}
			}

			setState(377); match(AssignPointer);
			setState(379);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(378); match(WS);
				}
			}

			setState(381); match(Identifier);
			setState(383);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(382); match(WS);
				}
			}

			setState(385); match(Newline);
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
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Template() { return getToken(fplusParser.Template, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode Interface() { return getToken(fplusParser.Interface, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
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
	}

	public final InterfaceLineContext interfaceLine() throws RecognitionException {
		InterfaceLineContext _localctx = new InterfaceLineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(387); match(WS);
				}
			}

			setState(390); match(Prefix);
			setState(391); match(WS);
			setState(392); match(Interface);
			setState(393); match(WS);
			setState(394); match(Template);
			setState(395); match(WS);
			setState(396); match(Identifier);
			setState(398);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(397); match(WS);
				}
			}

			setState(400); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
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
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402); listItem();
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(403); match(WS);
					setState(404); listItem();
					}
					} 
				}
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(419);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410); match(LeftBrace);
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(411);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(416);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(417); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<TerminalNode> IntegerConstant() { return getTokens(fplusParser.IntegerConstant); }
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
		public TerminalNode IntegerConstant(int i) {
			return getToken(fplusParser.IntegerConstant, i);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
	}

	public final ListAssignmentContext listAssignment() throws RecognitionException {
		ListAssignmentContext _localctx = new ListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listAssignment);
		int _la;
		try {
			setState(447);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421); match(Identifier);
				setState(423);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(422); match(WS);
					}
				}

				setState(425); match(Assign);
				setState(427);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(426); match(WS);
					}
				}

				setState(429); match(IntegerConstant);
				setState(431);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(430); match(WS);
					}
				}

				setState(433); match(Comma);
				setState(435);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(434); match(WS);
					}
				}

				setState(437); match(IntegerConstant);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438); match(Identifier);
				setState(440);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(439); match(WS);
					}
				}

				setState(442); match(Assign);
				setState(444);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(443); match(WS);
					}
					break;
				}
				setState(446); list();
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

	public static class ContentBlockContext extends ParserRuleContext {
		public TemplateBlockContext templateBlock(int i) {
			return getRuleContext(TemplateBlockContext.class,i);
		}
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
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
	}

	public final ContentBlockContext contentBlock() throws RecognitionException {
		ContentBlockContext _localctx = new ContentBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(454);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(449); loopBlock();
						}
						break;

					case 2:
						{
						setState(450); templateBlock();
						}
						break;

					case 3:
						{
						setState(451); variableDefinition();
						}
						break;

					case 4:
						{
						setState(452); procedureBlock();
						}
						break;

					case 5:
						{
						setState(453); contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(456); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		public List<TerminalNode> Subroutine() { return getTokens(fplusParser.Subroutine); }
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public List<TerminalNode> Function() { return getTokens(fplusParser.Function); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Function(int i) {
			return getToken(fplusParser.Function, i);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public TerminalNode Subroutine(int i) {
			return getToken(fplusParser.Subroutine, i);
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
	}

	public final ContentLineContext contentLine() throws RecognitionException {
		ContentLineContext _localctx = new ContentLineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_contentLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(458); match(WS);
				}
				break;
			}
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(463);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						setState(461); placeholder();
						}
						break;

					case 2:
						{
						setState(462);
						_la = _input.LA(1);
						if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Prefix) | (1L << Function) | (1L << Subroutine))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(468); match(Newline);
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
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
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
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_placeholder);
		try {
			setState(481);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470); match(Dollar);
				setState(471); match(LeftBrace);
				setState(472); match(Identifier);
				setState(473); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474); match(Dollar);
				setState(475); match(LeftBrace);
				setState(476); match(Identifier);
				setState(477); match(LeftParen);
				setState(478); match(Identifier);
				setState(479); match(RightParen);
				setState(480); match(RightBrace);
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ListAssignmentContext listAssignment() {
			return getRuleContext(ListAssignmentContext.class,0);
		}
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
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
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(483); match(WS);
				}
			}

			setState(486); match(Prefix);
			setState(487); match(WS);
			setState(488); listAssignment();
			setState(490);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(489); match(WS);
				}
			}

			setState(492); match(Newline);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3(\u01f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\5"+
		"\2\63\n\2\3\2\5\2\66\n\2\3\3\5\39\n\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\3\3"+
		"\7\3C\n\3\f\3\16\3F\13\3\3\3\5\3I\n\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\3\5\3"+
		"R\n\3\3\3\5\3U\n\3\3\3\5\3X\n\3\3\4\5\4[\n\4\3\4\3\4\3\4\3\4\5\4a\n\4"+
		"\3\4\3\4\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\5\4m\n\4\3\4\3\4\5\4q\n\4"+
		"\3\4\3\4\5\4u\n\4\3\4\5\4x\n\4\3\4\3\4\3\4\3\4\5\4~\n\4\3\4\5\4\u0081"+
		"\n\4\3\4\5\4\u0084\n\4\3\5\5\5\u0087\n\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5"+
		"\3\5\5\5\u0090\n\5\3\5\3\5\5\5\u0094\n\5\3\5\5\5\u0097\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u009f\n\5\3\5\5\5\u00a2\n\5\3\5\3\5\3\6\3\6\5\6\u00a8"+
		"\n\6\3\6\3\6\3\6\5\6\u00ad\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b5\n\6\3"+
		"\6\3\6\3\7\5\7\u00ba\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00c4\n\b"+
		"\3\t\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t\3\t\3\t\3\t\3\t\7\t\u00d1\n"+
		"\t\f\t\16\t\u00d4\13\t\3\t\3\t\5\t\u00d8\n\t\3\t\5\t\u00db\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00e1\n\t\3\t\5\t\u00e4\n\t\3\t\5\t\u00e7\n\t\3\t\3\t\3\n"+
		"\5\n\u00ec\n\n\3\n\3\n\3\n\3\n\7\n\u00f2\n\n\f\n\16\n\u00f5\13\n\3\n\3"+
		"\n\5\n\u00f9\n\n\3\n\5\n\u00fc\n\n\3\n\3\n\3\n\3\n\5\n\u0102\n\n\3\n\5"+
		"\n\u0105\n\n\3\n\5\n\u0108\n\n\3\n\3\n\3\13\5\13\u010d\n\13\3\13\3\13"+
		"\5\13\u0111\n\13\3\13\5\13\u0114\n\13\3\13\3\13\5\13\u0118\n\13\3\13\7"+
		"\13\u011b\n\13\f\13\16\13\u011e\13\13\3\13\5\13\u0121\n\13\3\13\3\13\5"+
		"\13\u0125\n\13\3\13\5\13\u0128\n\13\3\13\3\13\7\13\u012c\n\13\f\13\16"+
		"\13\u012f\13\13\3\13\3\13\3\13\7\13\u0134\n\13\f\13\16\13\u0137\13\13"+
		"\3\13\5\13\u013a\n\13\3\13\3\13\3\13\3\13\5\13\u0140\n\13\3\13\5\13\u0143"+
		"\n\13\3\13\5\13\u0146\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u014d\n\f\3\f\3\f"+
		"\5\f\u0151\n\f\3\f\3\f\5\f\u0155\n\f\3\f\5\f\u0158\n\f\3\r\5\r\u015b\n"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0161\n\r\3\r\5\r\u0164\n\r\3\r\3\r\5\r\u0168\n"+
		"\r\3\r\7\r\u016b\n\r\f\r\16\r\u016e\13\r\3\r\5\r\u0171\n\r\3\r\3\r\3\r"+
		"\5\r\u0176\n\r\3\r\3\r\5\r\u017a\n\r\3\r\3\r\5\r\u017e\n\r\3\r\3\r\5\r"+
		"\u0182\n\r\3\r\3\r\3\16\5\16\u0187\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0191\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u0198\n\17\f"+
		"\17\16\17\u019b\13\17\3\20\3\20\7\20\u019f\n\20\f\20\16\20\u01a2\13\20"+
		"\3\20\3\20\5\20\u01a6\n\20\3\21\3\21\5\21\u01aa\n\21\3\21\3\21\5\21\u01ae"+
		"\n\21\3\21\3\21\5\21\u01b2\n\21\3\21\3\21\5\21\u01b6\n\21\3\21\3\21\3"+
		"\21\5\21\u01bb\n\21\3\21\3\21\5\21\u01bf\n\21\3\21\5\21\u01c2\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\6\22\u01c9\n\22\r\22\16\22\u01ca\3\23\5\23\u01ce"+
		"\n\23\3\23\3\23\7\23\u01d2\n\23\f\23\16\23\u01d5\13\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01e4\n\24\3\25"+
		"\5\25\u01e7\n\25\3\25\3\25\3\25\3\25\5\25\u01ed\n\25\3\25\3\25\3\25\4"+
		"\u01a0\u01d3\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\4\2\30"+
		"\30&&\3\2&&\3\2\34\37\4\2\33\33  \3\2\34\35\4\2\20\20\30\31\u0243\2.\3"+
		"\2\2\2\48\3\2\2\2\6Z\3\2\2\2\b\u0086\3\2\2\2\n\u00a5\3\2\2\2\f\u00b9\3"+
		"\2\2\2\16\u00c3\3\2\2\2\20\u00c9\3\2\2\2\22\u00eb\3\2\2\2\24\u010c\3\2"+
		"\2\2\26\u0157\3\2\2\2\30\u015a\3\2\2\2\32\u0186\3\2\2\2\34\u0194\3\2\2"+
		"\2\36\u01a5\3\2\2\2 \u01c1\3\2\2\2\"\u01c8\3\2\2\2$\u01cd\3\2\2\2&\u01e3"+
		"\3\2\2\2(\u01e6\3\2\2\2*-\5\6\4\2+-\5\"\22\2,*\3\2\2\2,+\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61\63\5\4\3\2\62\61"+
		"\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\"\22\2\65\64\3\2\2\2\65\66"+
		"\3\2\2\2\66\3\3\2\2\2\679\7\'\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:;\7"+
		"\25\2\2;<\7\'\2\2<>\7\"\2\2=?\7\'\2\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@D"+
		"\7&\2\2AC\5\"\22\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2F"+
		"D\3\2\2\2GI\7\'\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\23\2\2KL\7\'\2\2"+
		"LN\7\25\2\2MO\7\'\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\7\"\2\2QP\3\2\2"+
		"\2QR\3\2\2\2RT\3\2\2\2SU\7\'\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\7&\2"+
		"\2WV\3\2\2\2WX\3\2\2\2X\5\3\2\2\2Y[\7\'\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\]\7\26\2\2]^\7\'\2\2^`\7\"\2\2_a\7\'\2\2`_\3\2\2\2`a\3\2\2\2ab\3"+
		"\2\2\2bh\7&\2\2cg\5\"\22\2dg\5\32\16\2eg\5\24\13\2fc\3\2\2\2fd\3\2\2\2"+
		"fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\7\'\2\2"+
		"lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\27\2\2oq\7\'\2\2po\3\2\2\2pq\3\2\2"+
		"\2qr\3\2\2\2rt\7&\2\2su\5\"\22\2ts\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\7\'\2"+
		"\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\23\2\2z{\7\'\2\2{}\7\26\2\2|~\7\'"+
		"\2\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\7\"\2\2\u0080\177\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\7&\2\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\7\3\2\2\2\u0085\u0087\7\'\2\2"+
		"\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\7\20\2\2\u0089\u008a\7\'\2\2\u008a\u008c\7\21\2\2\u008b\u008d\7\'\2\2"+
		"\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090"+
		"\7\"\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\7&\2\2\u0092\u0094\5\"\22\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0097\7\'\2\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009a\7"+
		"\'\2\2\u009a\u009b\7\23\2\2\u009b\u009c\7\'\2\2\u009c\u009e\7\21\2\2\u009d"+
		"\u009f\7\'\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2"+
		"\2\2\u00a0\u00a2\7\"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\7&\2\2\u00a4\t\3\2\2\2\u00a5\u00a7\5\f\7\2"+
		"\u00a6\u00a8\7\'\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\7&\2\2\u00aa\u00ac\5\"\22\2\u00ab\u00ad\7\'\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\20"+
		"\2\2\u00af\u00b0\7\'\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\7\'\2\2\u00b2"+
		"\u00b4\7\24\2\2\u00b3\u00b5\7\'\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7&\2\2\u00b7\13\3\2\2\2\u00b8\u00ba"+
		"\7\'\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\7\20\2\2\u00bc\u00bd\7\'\2\2\u00bd\u00be\7\24\2\2\u00be\u00bf\7"+
		"\'\2\2\u00bf\u00c0\5 \21\2\u00c0\r\3\2\2\2\u00c1\u00c4\5\20\t\2\u00c2"+
		"\u00c4\5\22\n\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\17\3\2\2"+
		"\2\u00c5\u00c8\5&\24\2\u00c6\u00c8\n\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\30\2\2\u00cd\u00ce\7"+
		"\'\2\2\u00ce\u00d2\7\"\2\2\u00cf\u00d1\n\3\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7&\2\2\u00d6\u00d8\5\"\22\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\7\'"+
		"\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\7\23\2\2\u00dd\u00de\7\'\2\2\u00de\u00e0\7\30\2\2\u00df\u00e1\7"+
		"\'\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e4\7\"\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e7\7\'\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7&\2\2\u00e9\21\3\2\2\2\u00ea\u00ec\7\'\2\2"+
		"\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee"+
		"\7\31\2\2\u00ee\u00ef\7\'\2\2\u00ef\u00f3\7\"\2\2\u00f0\u00f2\n\3\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7&\2\2\u00f7"+
		"\u00f9\5\"\22\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3"+
		"\2\2\2\u00fa\u00fc\7\'\2\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\7\23\2\2\u00fe\u00ff\7\'\2\2\u00ff\u0101\7"+
		"\31\2\2\u0100\u0102\7\'\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u0105\7\"\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0108\7\'\2\2\u0107\u0106\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7&\2\2\u010a\23\3\2\2\2"+
		"\u010b\u010d\7\'\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\7\32\2\2\u010f\u0111\7\'\2\2\u0110\u010f\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u011c\3\2\2\2\u0112\u0114\7\'\2\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7\4\2\2\u0116"+
		"\u0118\7\'\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\5\26\f\2\u011a\u0113\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0121\7\'\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0123\7\6\2\2\u0123\u0125\7\6\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0128\7\'\2\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\7\""+
		"\2\2\u012a\u012c\n\3\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0135\7&\2\2\u0131\u0134\5\"\22\2\u0132\u0134\5\30\r\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013a\7\'\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\7\23\2\2\u013c\u013d\7\'\2\2\u013d\u013f\7\32\2\2\u013e"+
		"\u0140\7\'\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2"+
		"\2\2\u0141\u0143\7\"\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u0146\7\'\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7&\2\2\u0148\25\3\2\2\2\u0149\u0158"+
		"\t\4\2\2\u014a\u014c\t\5\2\2\u014b\u014d\7\'\2\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7\n\2\2\u014f\u0151\7\'"+
		"\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0154\7\"\2\2\u0153\u0155\7\'\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0158\7\13\2\2\u0157\u0149\3\2\2\2\u0157"+
		"\u014a\3\2\2\2\u0158\27\3\2\2\2\u0159\u015b\7\'\2\2\u015a\u0159\3\2\2"+
		"\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7\20\2\2\u015d"+
		"\u015e\7\'\2\2\u015e\u0160\7!\2\2\u015f\u0161\7\'\2\2\u0160\u015f\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u016c\3\2\2\2\u0162\u0164\7\'\2\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7\4"+
		"\2\2\u0166\u0168\7\'\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\t\6\2\2\u016a\u0163\3\2\2\2\u016b\u016e\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016f\u0171\7\'\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\6\2\2\u0173\u0175\7\6\2\2\u0174"+
		"\u0176\7\'\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0179\7\"\2\2\u0178\u017a\7\'\2\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\7%\2\2\u017c\u017e\7\'"+
		"\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0181\7\"\2\2\u0180\u0182\7\'\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7&\2\2\u0184\31\3\2\2\2\u0185\u0187"+
		"\7\'\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\7\20\2\2\u0189\u018a\7\'\2\2\u018a\u018b\7\22\2\2\u018b\u018c\7"+
		"\'\2\2\u018c\u018d\7\21\2\2\u018d\u018e\7\'\2\2\u018e\u0190\7\"\2\2\u018f"+
		"\u0191\7\'\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0193\7&\2\2\u0193\33\3\2\2\2\u0194\u0199\5\36\20\2\u0195\u0196"+
		"\7\'\2\2\u0196\u0198\5\36\20\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2"+
		"\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\35\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u01a0\7\7\2\2\u019d\u019f\n\3\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\7\b\2\2\u01a4\u01a6\n\3\2\2\u01a5"+
		"\u019c\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\37\3\2\2\2\u01a7\u01a9\7\"\2"+
		"\2\u01a8\u01aa\7\'\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ad\7\3\2\2\u01ac\u01ae\7\'\2\2\u01ad\u01ac\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7#\2\2\u01b0\u01b2\7\'"+
		"\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\7\4\2\2\u01b4\u01b6\7\'\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01c2\7#\2\2\u01b8\u01ba\7\"\2\2\u01b9"+
		"\u01bb\7\'\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01be\7\3\2\2\u01bd\u01bf\7\'\2\2\u01be\u01bd\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\5\34\17\2\u01c1\u01a7\3"+
		"\2\2\2\u01c1\u01b8\3\2\2\2\u01c2!\3\2\2\2\u01c3\u01c9\5\n\6\2\u01c4\u01c9"+
		"\5\b\5\2\u01c5\u01c9\5(\25\2\u01c6\u01c9\5\16\b\2\u01c7\u01c9\5$\23\2"+
		"\u01c8\u01c3\3\2\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6"+
		"\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb#\3\2\2\2\u01cc\u01ce\7\'\2\2\u01cd\u01cc\3\2\2\2"+
		"\u01cd\u01ce\3\2\2\2\u01ce\u01d3\3\2\2\2\u01cf\u01d2\5&\24\2\u01d0\u01d2"+
		"\n\7\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d6\u01d7\7&\2\2\u01d7%\3\2\2\2\u01d8\u01d9\7\t\2\2\u01d9\u01da"+
		"\7\7\2\2\u01da\u01db\7\"\2\2\u01db\u01e4\7\b\2\2\u01dc\u01dd\7\t\2\2\u01dd"+
		"\u01de\7\7\2\2\u01de\u01df\7\"\2\2\u01df\u01e0\7\n\2\2\u01e0\u01e1\7\""+
		"\2\2\u01e1\u01e2\7\13\2\2\u01e2\u01e4\7\b\2\2\u01e3\u01d8\3\2\2\2\u01e3"+
		"\u01dc\3\2\2\2\u01e4\'\3\2\2\2\u01e5\u01e7\7\'\2\2\u01e6\u01e5\3\2\2\2"+
		"\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\20\2\2\u01e9\u01ea"+
		"\7\'\2\2\u01ea\u01ec\5 \21\2\u01eb\u01ed\7\'\2\2\u01ec\u01eb\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7&\2\2\u01ef)\3\2\2\2e"+
		",.\62\658>DHNQTWZ`fhlptw}\u0080\u0083\u0086\u008c\u008f\u0093\u0096\u009e"+
		"\u00a1\u00a7\u00ac\u00b4\u00b9\u00c3\u00c7\u00c9\u00d2\u00d7\u00da\u00e0"+
		"\u00e3\u00e6\u00eb\u00f3\u00f8\u00fb\u0101\u0104\u0107\u010c\u0110\u0113"+
		"\u0117\u011c\u0120\u0124\u0127\u012d\u0133\u0135\u0139\u013f\u0142\u0145"+
		"\u014c\u0150\u0154\u0157\u015a\u0160\u0163\u0167\u016c\u0170\u0175\u0179"+
		"\u017d\u0181\u0186\u0190\u0199\u01a0\u01a5\u01a9\u01ad\u01b1\u01b5\u01ba"+
		"\u01be\u01c1\u01c8\u01ca\u01cd\u01d1\u01d3\u01e3\u01e6\u01ec";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}