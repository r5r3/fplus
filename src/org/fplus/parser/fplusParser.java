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
		Larger=13, Exclamation=14, Prefix=15, Template=16, Interface=17, End=18, 
		Do=19, Program=20, Module=21, Contains=22, Function=23, Subroutine=24, 
		Procedure=25, Recursive=26, Type=27, Extends=28, Private=29, Public=30, 
		Sequence=31, Abstract=32, Bind=33, Generic=34, Identifier=35, IntegerConstant=36, 
		StringLiteral=37, AssignPointer=38, Newline=39, WS=40, Noise=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "','", "';'", "':'", "'{'", "'}'", "'$'", "'('", "')'", 
		"'['", "']'", "'<'", "'>'", "'!'", "Prefix", "Template", "Interface", 
		"End", "Do", "Program", "Module", "Contains", "Function", "Subroutine", 
		"Procedure", "Recursive", "Type", "Extends", "Private", "Public", "Sequence", 
		"Abstract", "Bind", "Generic", "Identifier", "IntegerConstant", "StringLiteral", 
		"AssignPointer", "Newline", "WS", "Noise"
	};
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_templateBlock = 3, 
		RULE_loopBlock = 4, RULE_loopBegin = 5, RULE_procedureBlock = 6, RULE_functionBlock = 7, 
		RULE_subroutineBlock = 8, RULE_typeDefinitionBlock = 9, RULE_fortranInterfaceBlock = 10, 
		RULE_typeAttributes = 11, RULE_genericTypeBoundLine = 12, RULE_interfaceLine = 13, 
		RULE_list = 14, RULE_listItem = 15, RULE_listAssignment = 16, RULE_contentBlock = 17, 
		RULE_contentLine = 18, RULE_placeholder = 19, RULE_variableDefinition = 20, 
		RULE_lineComment = 21;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "templateBlock", "loopBlock", 
		"loopBegin", "procedureBlock", "functionBlock", "subroutineBlock", "typeDefinitionBlock", 
		"fortranInterfaceBlock", "typeAttributes", "genericTypeBoundLine", "interfaceLine", 
		"list", "listItem", "listAssignment", "contentBlock", "contentLine", "placeholder", 
		"variableDefinition", "lineComment"
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
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(46);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(44); moduleBlock();
						}
						break;

					case 2:
						{
						setState(45); contentBlock();
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(51); programBlock();
				}
				break;
			}
			setState(55);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << Newline) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(54); contentBlock();
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
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
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
			setState(58);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(57); match(WS);
				}
			}

			setState(60); match(Program);
			setState(61); match(WS);
			setState(62); match(Identifier);
			setState(64);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(63); match(WS);
				}
			}

			setState(66); match(Newline);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(67); contentBlock();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(74);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(73); match(WS);
					}
				}

				setState(76); match(Contains);
				setState(78);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(77); match(WS);
					}
				}

				setState(80); match(Newline);
				}
				break;
			}
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(83); contentBlock();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(90);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(89); match(WS);
				}
			}

			setState(92); match(End);
			setState(93); match(WS);
			setState(94); match(Program);
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(95); match(WS);
				}
				break;
			}
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(98); match(Identifier);
				}
				break;
			}
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(101); match(WS);
				}
				break;
			}
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(104); match(Newline);
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
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public InterfaceLineContext interfaceLine(int i) {
			return getRuleContext(InterfaceLineContext.class,i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
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
			setState(108);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(107); match(WS);
				}
			}

			setState(110); match(Module);
			setState(111); match(WS);
			setState(112); match(Identifier);
			setState(114);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(113); match(WS);
				}
			}

			setState(116); match(Newline);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(119);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(117); interfaceLine();
						}
						break;

					case 2:
						{
						setState(118); contentBlock();
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(125);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(124); match(WS);
					}
				}

				setState(127); match(Contains);
				setState(129);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(128); match(WS);
					}
				}

				setState(131); match(Newline);
				}
				break;
			}
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(134); contentBlock();
				}
				break;
			}
			setState(138);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(137); match(WS);
				}
			}

			setState(140); match(End);
			setState(141); match(WS);
			setState(142); match(Module);
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(143); match(WS);
				}
				break;
			}
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(146); match(Identifier);
				}
				break;
			}
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(149); match(Newline);
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
			setState(153);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(152); match(WS);
				}
			}

			setState(155); match(Prefix);
			setState(156); match(WS);
			setState(157); match(Template);
			setState(159);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(158); match(WS);
				}
			}

			setState(162);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(161); match(Identifier);
				}
			}

			setState(164); match(Newline);
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(165); contentBlock();
				}
				break;
			}
			setState(169);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168); match(WS);
				}
			}

			setState(171); match(Prefix);
			setState(172); match(WS);
			setState(173); match(End);
			setState(174); match(WS);
			setState(175); match(Template);
			setState(177);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(176); match(WS);
				}
			}

			setState(180);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(179); match(Identifier);
				}
			}

			setState(182); match(Newline);
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
			setState(184); loopBegin();
			setState(186);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(185); match(WS);
				}
			}

			setState(188); match(Newline);
			setState(189); contentBlock();
			setState(191);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(190); match(WS);
				}
			}

			setState(193); match(Prefix);
			setState(194); match(WS);
			setState(195); match(End);
			setState(196); match(WS);
			setState(197); match(Do);
			setState(199);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(198); match(WS);
				}
			}

			setState(201); match(Newline);
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
			setState(204);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(203); match(WS);
				}
			}

			setState(206); match(Prefix);
			setState(207); match(WS);
			setState(208); match(Do);
			setState(209); match(WS);
			setState(210); listAssignment();
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
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); functionBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); subroutineBlock();
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
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(218);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(216); placeholder();
					}
					break;

				case 2:
					{
					setState(217);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Function || _la==Newline) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223); match(Function);
			setState(224); match(WS);
			setState(225); match(Identifier);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(226);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232); match(Newline);
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(233); contentBlock();
				}
				break;
			}
			setState(237);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(236); match(WS);
				}
			}

			setState(239); match(End);
			setState(240); match(WS);
			setState(241); match(Function);
			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(242); match(WS);
				}
				break;
			}
			setState(246);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(245); match(Identifier);
				}
			}

			setState(249);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(248); match(WS);
				}
			}

			setState(251); match(Newline);
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
		public TerminalNode Recursive() { return getToken(fplusParser.Recursive, 0); }
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
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(253); match(WS);
				}
				break;
			}
			setState(257);
			_la = _input.LA(1);
			if (_la==Recursive) {
				{
				setState(256); match(Recursive);
				}
			}

			setState(260);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(259); match(WS);
				}
			}

			setState(262); match(Subroutine);
			setState(263); match(WS);
			setState(264); match(Identifier);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(265);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271); match(Newline);
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(272); contentBlock();
				}
				break;
			}
			setState(276);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(275); match(WS);
				}
			}

			setState(278); match(End);
			setState(279); match(WS);
			setState(280); match(Subroutine);
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(281); match(WS);
				}
				break;
			}
			setState(285);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(284); match(Identifier);
				}
			}

			setState(288);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(287); match(WS);
				}
			}

			setState(290); match(Newline);
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
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
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
			setState(293);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(292); match(WS);
				}
			}

			setState(295); match(Type);
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(296); match(WS);
				}
				break;
			}
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(299); match(WS);
						}
					}

					setState(302); match(Comma);
					setState(304);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(303); match(WS);
						}
					}

					setState(306); typeAttributes();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(312); match(WS);
				}
				break;
			}
			setState(317);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(315); match(Colon);
				setState(316); match(Colon);
				}
			}

			setState(320);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(319); match(WS);
				}
			}

			setState(322); match(Identifier);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(323);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329); match(Newline);
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(330); contentBlock();
				}
				break;
			}
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(334);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(333); match(WS);
					}
				}

				setState(336); match(Contains);
				setState(338);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(337); match(WS);
					}
				}

				setState(340); match(Newline);
				}
				break;
			}
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(345);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(343); contentBlock();
						}
						break;

					case 2:
						{
						setState(344); genericTypeBoundLine();
						}
						break;
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(351);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(350); match(WS);
				}
			}

			setState(353); match(End);
			setState(354); match(WS);
			setState(355); match(Type);
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(356); match(WS);
				}
				break;
			}
			setState(360);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(359); match(Identifier);
				}
			}

			setState(363);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(362); match(WS);
				}
			}

			setState(365); match(Newline);
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public List<TerminalNode> Interface() { return getTokens(fplusParser.Interface); }
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public TerminalNode Procedure(int i) {
			return getToken(fplusParser.Procedure, i);
		}
		public TerminalNode Interface(int i) {
			return getToken(fplusParser.Interface, i);
		}
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public List<TerminalNode> Procedure() { return getTokens(fplusParser.Procedure); }
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
	}

	public final FortranInterfaceBlockContext fortranInterfaceBlock() throws RecognitionException {
		FortranInterfaceBlockContext _localctx = new FortranInterfaceBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fortranInterfaceBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(367); match(WS);
				}
			}

			setState(370); match(Interface);
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(371); match(WS);
				}
				break;
			}
			setState(375);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(374); match(Identifier);
				}
			}

			setState(378);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(377); match(WS);
				}
			}

			setState(380); match(Newline);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(411);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(382);
						switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
						case 1:
							{
							setState(381); match(WS);
							}
							break;
						}
						setState(385);
						_la = _input.LA(1);
						if (_la==Module) {
							{
							setState(384); match(Module);
							}
						}

						setState(388);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(387); match(WS);
							}
						}

						setState(390); match(Procedure);
						setState(391); match(WS);
						setState(392); match(Identifier);
						setState(403);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(394);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(393); match(WS);
									}
								}

								setState(396); match(Comma);
								setState(398);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(397); match(WS);
									}
								}

								setState(400); match(Identifier);
								}
								} 
							}
							setState(405);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
						}
						setState(407);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(406); match(WS);
							}
						}

						setState(409); match(Newline);
						}
						break;

					case 2:
						{
						setState(410); procedureBlock();
						}
						break;
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(417);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(416); match(WS);
				}
			}

			setState(419); match(End);
			setState(420); match(WS);
			setState(421); match(Interface);
			setState(423);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(422); match(WS);
				}
				break;
			}
			setState(426);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(425); match(Identifier);
				}
			}

			setState(429);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(428); match(WS);
				}
			}

			setState(431); match(Newline);
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
		enterRule(_localctx, 22, RULE_typeAttributes);
		int _la;
		try {
			setState(447);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Sequence:
			case Abstract:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
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
				setState(434);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Bind) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(436);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(435); match(WS);
					}
				}

				setState(438); match(LeftParen);
				setState(440);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(439); match(WS);
					}
				}

				setState(442); match(Identifier);
				setState(444);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(443); match(WS);
					}
				}

				setState(446); match(RightParen);
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
		enterRule(_localctx, 24, RULE_genericTypeBoundLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(449); match(WS);
				}
			}

			setState(452); match(Prefix);
			setState(453); match(WS);
			setState(454); match(Generic);
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(455); match(WS);
				}
				break;
			}
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(459);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(458); match(WS);
						}
					}

					setState(461); match(Comma);
					setState(463);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(462); match(WS);
						}
					}

					setState(465);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(472);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(471); match(WS);
				}
			}

			setState(474); match(Colon);
			setState(475); match(Colon);
			setState(477);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(476); match(WS);
				}
			}

			setState(479); match(Identifier);
			setState(481);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(480); match(WS);
				}
			}

			setState(483); match(AssignPointer);
			setState(485);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(484); match(WS);
				}
			}

			setState(487); match(Identifier);
			setState(489);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(488); match(WS);
				}
			}

			setState(491); match(Newline);
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
		enterRule(_localctx, 26, RULE_interfaceLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(493); match(WS);
				}
			}

			setState(496); match(Prefix);
			setState(497); match(WS);
			setState(498); match(Interface);
			setState(499); match(WS);
			setState(500); match(Template);
			setState(501); match(WS);
			setState(502); match(Identifier);
			setState(504);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(503); match(WS);
				}
			}

			setState(506); match(Newline);
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
		enterRule(_localctx, 28, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(508); listItem();
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(509); match(WS);
					setState(510); listItem();
					}
					} 
				}
				setState(515);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
		enterRule(_localctx, 30, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(525);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516); match(LeftBrace);
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(517);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(522);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				setState(523); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
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
		enterRule(_localctx, 32, RULE_listAssignment);
		int _la;
		try {
			setState(553);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527); match(Identifier);
				setState(529);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(528); match(WS);
					}
				}

				setState(531); match(Assign);
				setState(533);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(532); match(WS);
					}
				}

				setState(535); match(IntegerConstant);
				setState(537);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(536); match(WS);
					}
				}

				setState(539); match(Comma);
				setState(541);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(540); match(WS);
					}
				}

				setState(543); match(IntegerConstant);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544); match(Identifier);
				setState(546);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(545); match(WS);
					}
				}

				setState(548); match(Assign);
				setState(550);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(549); match(WS);
					}
					break;
				}
				setState(552); list();
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
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public FortranInterfaceBlockContext fortranInterfaceBlock(int i) {
			return getRuleContext(FortranInterfaceBlockContext.class,i);
		}
		public List<TemplateBlockContext> templateBlock() {
			return getRuleContexts(TemplateBlockContext.class);
		}
		public ProcedureBlockContext procedureBlock(int i) {
			return getRuleContext(ProcedureBlockContext.class,i);
		}
		public TypeDefinitionBlockContext typeDefinitionBlock(int i) {
			return getRuleContext(TypeDefinitionBlockContext.class,i);
		}
		public List<ProcedureBlockContext> procedureBlock() {
			return getRuleContexts(ProcedureBlockContext.class);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public List<TypeDefinitionBlockContext> typeDefinitionBlock() {
			return getRuleContexts(TypeDefinitionBlockContext.class);
		}
		public List<LineCommentContext> lineComment() {
			return getRuleContexts(LineCommentContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<FortranInterfaceBlockContext> fortranInterfaceBlock() {
			return getRuleContexts(FortranInterfaceBlockContext.class);
		}
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
		}
		public List<ContentLineContext> contentLine() {
			return getRuleContexts(ContentLineContext.class);
		}
		public LineCommentContext lineComment(int i) {
			return getRuleContext(LineCommentContext.class,i);
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
		enterRule(_localctx, 34, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(563);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						setState(555); loopBlock();
						}
						break;

					case 2:
						{
						setState(556); templateBlock();
						}
						break;

					case 3:
						{
						setState(557); variableDefinition();
						}
						break;

					case 4:
						{
						setState(558); procedureBlock();
						}
						break;

					case 5:
						{
						setState(559); typeDefinitionBlock();
						}
						break;

					case 6:
						{
						setState(560); fortranInterfaceBlock();
						}
						break;

					case 7:
						{
						setState(561); lineComment();
						}
						break;

					case 8:
						{
						setState(562); contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(565); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		public List<TerminalNode> Subroutine() { return getTokens(fplusParser.Subroutine); }
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public List<TerminalNode> Function() { return getTokens(fplusParser.Function); }
		public List<TerminalNode> Contains() { return getTokens(fplusParser.Contains); }
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode Program(int i) {
			return getToken(fplusParser.Program, i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
		}
		public TerminalNode Newline() { return getToken(fplusParser.Newline, 0); }
		public List<TerminalNode> Program() { return getTokens(fplusParser.Program); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public TerminalNode Contains(int i) {
			return getToken(fplusParser.Contains, i);
		}
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public LineCommentContext lineComment() {
			return getRuleContext(LineCommentContext.class,0);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public TerminalNode Function(int i) {
			return getToken(fplusParser.Function, i);
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
		enterRule(_localctx, 36, RULE_contentLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(567); match(WS);
				}
				break;
			}
			setState(574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(572);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(570); placeholder();
						}
						break;

					case 2:
						{
						setState(571);
						_la = _input.LA(1);
						if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Prefix) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(579);
			switch (_input.LA(1)) {
			case Newline:
				{
				setState(577); match(Newline);
				}
				break;
			case Exclamation:
			case WS:
				{
				setState(578); lineComment();
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
		enterRule(_localctx, 38, RULE_placeholder);
		try {
			setState(592);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581); match(Dollar);
				setState(582); match(LeftBrace);
				setState(583); match(Identifier);
				setState(584); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585); match(Dollar);
				setState(586); match(LeftBrace);
				setState(587); match(Identifier);
				setState(588); match(LeftParen);
				setState(589); match(Identifier);
				setState(590); match(RightParen);
				setState(591); match(RightBrace);
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
		enterRule(_localctx, 40, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(594); match(WS);
				}
			}

			setState(597); match(Prefix);
			setState(598); match(WS);
			setState(599); listAssignment();
			setState(601);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(600); match(WS);
				}
			}

			setState(603); match(Newline);
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
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
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
	}

	public final LineCommentContext lineComment() throws RecognitionException {
		LineCommentContext _localctx = new LineCommentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(605); match(WS);
				}
			}

			setState(608); match(Exclamation);
			setState(609);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==Dollar) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(612);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(610); placeholder();
					}
					break;

				case 2:
					{
					setState(611);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Newline) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617); match(Newline);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3+\u026e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\5\2\67\n\2\3\2\5\2:\n\2\3\3\5\3=\n\3\3\3\3\3\3\3"+
		"\3\3\5\3C\n\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\5\3M\n\3\3\3\3\3\5\3"+
		"Q\n\3\3\3\5\3T\n\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\5\3]\n\3\3\3\3\3\3"+
		"\3\3\3\5\3c\n\3\3\3\5\3f\n\3\3\3\5\3i\n\3\3\3\5\3l\n\3\3\4\5\4o\n\4\3"+
		"\4\3\4\3\4\3\4\5\4u\n\4\3\4\3\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\5\4\u0080"+
		"\n\4\3\4\3\4\5\4\u0084\n\4\3\4\5\4\u0087\n\4\3\4\5\4\u008a\n\4\3\4\5\4"+
		"\u008d\n\4\3\4\3\4\3\4\3\4\5\4\u0093\n\4\3\4\5\4\u0096\n\4\3\4\5\4\u0099"+
		"\n\4\3\5\5\5\u009c\n\5\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\3\5\5\5\u00a5\n\5"+
		"\3\5\3\5\5\5\u00a9\n\5\3\5\5\5\u00ac\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b4"+
		"\n\5\3\5\5\5\u00b7\n\5\3\5\3\5\3\6\3\6\5\6\u00bd\n\6\3\6\3\6\3\6\5\6\u00c2"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6\3\6\3\6\3\7\5\7\u00cf\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00d9\n\b\3\t\3\t\7\t\u00dd\n\t\f\t"+
		"\16\t\u00e0\13\t\3\t\3\t\3\t\3\t\7\t\u00e6\n\t\f\t\16\t\u00e9\13\t\3\t"+
		"\3\t\5\t\u00ed\n\t\3\t\5\t\u00f0\n\t\3\t\3\t\3\t\3\t\5\t\u00f6\n\t\3\t"+
		"\5\t\u00f9\n\t\3\t\5\t\u00fc\n\t\3\t\3\t\3\n\5\n\u0101\n\n\3\n\5\n\u0104"+
		"\n\n\3\n\5\n\u0107\n\n\3\n\3\n\3\n\3\n\7\n\u010d\n\n\f\n\16\n\u0110\13"+
		"\n\3\n\3\n\5\n\u0114\n\n\3\n\5\n\u0117\n\n\3\n\3\n\3\n\3\n\5\n\u011d\n"+
		"\n\3\n\5\n\u0120\n\n\3\n\5\n\u0123\n\n\3\n\3\n\3\13\5\13\u0128\n\13\3"+
		"\13\3\13\5\13\u012c\n\13\3\13\5\13\u012f\n\13\3\13\3\13\5\13\u0133\n\13"+
		"\3\13\7\13\u0136\n\13\f\13\16\13\u0139\13\13\3\13\5\13\u013c\n\13\3\13"+
		"\3\13\5\13\u0140\n\13\3\13\5\13\u0143\n\13\3\13\3\13\7\13\u0147\n\13\f"+
		"\13\16\13\u014a\13\13\3\13\3\13\5\13\u014e\n\13\3\13\5\13\u0151\n\13\3"+
		"\13\3\13\5\13\u0155\n\13\3\13\5\13\u0158\n\13\3\13\3\13\7\13\u015c\n\13"+
		"\f\13\16\13\u015f\13\13\3\13\5\13\u0162\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0168\n\13\3\13\5\13\u016b\n\13\3\13\5\13\u016e\n\13\3\13\3\13\3\f\5"+
		"\f\u0173\n\f\3\f\3\f\5\f\u0177\n\f\3\f\5\f\u017a\n\f\3\f\5\f\u017d\n\f"+
		"\3\f\3\f\5\f\u0181\n\f\3\f\5\f\u0184\n\f\3\f\5\f\u0187\n\f\3\f\3\f\3\f"+
		"\3\f\5\f\u018d\n\f\3\f\3\f\5\f\u0191\n\f\3\f\7\f\u0194\n\f\f\f\16\f\u0197"+
		"\13\f\3\f\5\f\u019a\n\f\3\f\3\f\7\f\u019e\n\f\f\f\16\f\u01a1\13\f\3\f"+
		"\5\f\u01a4\n\f\3\f\3\f\3\f\3\f\5\f\u01aa\n\f\3\f\5\f\u01ad\n\f\3\f\5\f"+
		"\u01b0\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u01b7\n\r\3\r\3\r\5\r\u01bb\n\r\3\r"+
		"\3\r\5\r\u01bf\n\r\3\r\5\r\u01c2\n\r\3\16\5\16\u01c5\n\16\3\16\3\16\3"+
		"\16\3\16\5\16\u01cb\n\16\3\16\5\16\u01ce\n\16\3\16\3\16\5\16\u01d2\n\16"+
		"\3\16\7\16\u01d5\n\16\f\16\16\16\u01d8\13\16\3\16\5\16\u01db\n\16\3\16"+
		"\3\16\3\16\5\16\u01e0\n\16\3\16\3\16\5\16\u01e4\n\16\3\16\3\16\5\16\u01e8"+
		"\n\16\3\16\3\16\5\16\u01ec\n\16\3\16\3\16\3\17\5\17\u01f1\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01fb\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\7\20\u0202\n\20\f\20\16\20\u0205\13\20\3\21\3\21\7\21\u0209\n\21"+
		"\f\21\16\21\u020c\13\21\3\21\3\21\5\21\u0210\n\21\3\22\3\22\5\22\u0214"+
		"\n\22\3\22\3\22\5\22\u0218\n\22\3\22\3\22\5\22\u021c\n\22\3\22\3\22\5"+
		"\22\u0220\n\22\3\22\3\22\3\22\5\22\u0225\n\22\3\22\3\22\5\22\u0229\n\22"+
		"\3\22\5\22\u022c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6\23\u0236"+
		"\n\23\r\23\16\23\u0237\3\24\5\24\u023b\n\24\3\24\3\24\7\24\u023f\n\24"+
		"\f\24\16\24\u0242\13\24\3\24\3\24\5\24\u0246\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0253\n\25\3\26\5\26\u0256\n"+
		"\26\3\26\3\26\3\26\3\26\5\26\u025c\n\26\3\26\3\26\3\27\5\27\u0261\n\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0267\n\27\f\27\16\27\u026a\13\27\3\27\3\27"+
		"\3\27\4\u020a\u0240\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		"\2\t\4\2\31\31))\3\2))\3\2\37\"\4\2\36\36##\3\2\37 \4\2\21\21\26\32\3"+
		"\2\t\t\u02e0\2\62\3\2\2\2\4<\3\2\2\2\6n\3\2\2\2\b\u009b\3\2\2\2\n\u00ba"+
		"\3\2\2\2\f\u00ce\3\2\2\2\16\u00d8\3\2\2\2\20\u00de\3\2\2\2\22\u0100\3"+
		"\2\2\2\24\u0127\3\2\2\2\26\u0172\3\2\2\2\30\u01c1\3\2\2\2\32\u01c4\3\2"+
		"\2\2\34\u01f0\3\2\2\2\36\u01fe\3\2\2\2 \u020f\3\2\2\2\"\u022b\3\2\2\2"+
		"$\u0235\3\2\2\2&\u023a\3\2\2\2(\u0252\3\2\2\2*\u0255\3\2\2\2,\u0260\3"+
		"\2\2\2.\61\5\6\4\2/\61\5$\23\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\65\67\5\4\3\2\66"+
		"\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28:\5$\23\298\3\2\2\29:\3\2\2\2:\3"+
		"\3\2\2\2;=\7*\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\26\2\2?@\7*\2\2@B"+
		"\7%\2\2AC\7*\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DH\7)\2\2EG\5$\23\2FE\3"+
		"\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IS\3\2\2\2JH\3\2\2\2KM\7*\2\2LK\3"+
		"\2\2\2LM\3\2\2\2MN\3\2\2\2NP\7\30\2\2OQ\7*\2\2PO\3\2\2\2PQ\3\2\2\2QR\3"+
		"\2\2\2RT\7)\2\2SL\3\2\2\2ST\3\2\2\2TX\3\2\2\2UW\5$\23\2VU\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[]\7*\2\2\\[\3\2\2\2\\"+
		"]\3\2\2\2]^\3\2\2\2^_\7\24\2\2_`\7*\2\2`b\7\26\2\2ac\7*\2\2ba\3\2\2\2"+
		"bc\3\2\2\2ce\3\2\2\2df\7%\2\2ed\3\2\2\2ef\3\2\2\2fh\3\2\2\2gi\7*\2\2h"+
		"g\3\2\2\2hi\3\2\2\2ik\3\2\2\2jl\7)\2\2kj\3\2\2\2kl\3\2\2\2l\5\3\2\2\2"+
		"mo\7*\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\27\2\2qr\7*\2\2rt\7%\2\2s"+
		"u\7*\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2v{\7)\2\2wz\5\34\17\2xz\5$\23\2"+
		"yw\3\2\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0086\3\2\2\2}{\3"+
		"\2\2\2~\u0080\7*\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0083\7\30\2\2\u0082\u0084\7*\2\2\u0083\u0082\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\7)\2\2\u0086\177\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\5$\23\2\u0089\u0088\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\7*\2\2\u008c"+
		"\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\24"+
		"\2\2\u008f\u0090\7*\2\2\u0090\u0092\7\27\2\2\u0091\u0093\7*\2\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\7%"+
		"\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0099\7)\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\7\3\2\2\2"+
		"\u009a\u009c\7*\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009e\7\21\2\2\u009e\u009f\7*\2\2\u009f\u00a1\7\22\2\2"+
		"\u00a0\u00a2\7*\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u00a5\7%\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a8\7)\2\2\u00a7\u00a9\5$\23\2\u00a8\u00a7\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\7*\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\21"+
		"\2\2\u00ae\u00af\7*\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\7*\2\2\u00b1"+
		"\u00b3\7\22\2\2\u00b2\u00b4\7*\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\7%\2\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7)\2\2\u00b9\t\3\2\2\2"+
		"\u00ba\u00bc\5\f\7\2\u00bb\u00bd\7*\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7)\2\2\u00bf\u00c1\5$\23\2\u00c0"+
		"\u00c2\7*\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\7\21\2\2\u00c4\u00c5\7*\2\2\u00c5\u00c6\7\24\2\2\u00c6"+
		"\u00c7\7*\2\2\u00c7\u00c9\7\25\2\2\u00c8\u00ca\7*\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc"+
		"\13\3\2\2\2\u00cd\u00cf\7*\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\21\2\2\u00d1\u00d2\7*\2\2\u00d2\u00d3"+
		"\7\25\2\2\u00d3\u00d4\7*\2\2\u00d4\u00d5\5\"\22\2\u00d5\r\3\2\2\2\u00d6"+
		"\u00d9\5\20\t\2\u00d7\u00d9\5\22\n\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3"+
		"\2\2\2\u00d9\17\3\2\2\2\u00da\u00dd\5(\25\2\u00db\u00dd\n\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7\31\2\2\u00e2\u00e3\7*\2\2\u00e3\u00e7\7%\2\2\u00e4\u00e6\n\3"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\7)"+
		"\2\2\u00eb\u00ed\5$\23\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00f0\7*\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\24\2\2\u00f2\u00f3\7*\2\2\u00f3"+
		"\u00f5\7\31\2\2\u00f4\u00f6\7*\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\7%\2\2\u00f8\u00f7\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\7*\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7)\2\2\u00fe"+
		"\21\3\2\2\2\u00ff\u0101\7*\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u0104\7\34\2\2\u0103\u0102\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\7*\2\2\u0106\u0105\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\32\2\2\u0109\u010a\7"+
		"*\2\2\u010a\u010e\7%\2\2\u010b\u010d\n\3\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0113\7)\2\2\u0112\u0114\5$\23\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0117\7*"+
		"\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\7\24\2\2\u0119\u011a\7*\2\2\u011a\u011c\7\32\2\2\u011b\u011d\7"+
		"*\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u0120\7%\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u0123\7*\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\7)\2\2\u0125\23\3\2\2\2\u0126\u0128\7*\2\2"+
		"\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b"+
		"\7\35\2\2\u012a\u012c\7*\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u0137\3\2\2\2\u012d\u012f\7*\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\4\2\2\u0131\u0133\7*\2\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\5\30"+
		"\r\2\u0135\u012e\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\7*"+
		"\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013e\7\6\2\2\u013e\u0140\7\6\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u0143\7*\2\2\u0142\u0141\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0148\7%\2\2\u0145\u0147\n\3"+
		"\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\7)"+
		"\2\2\u014c\u014e\5$\23\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0157\3\2\2\2\u014f\u0151\7*\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0152\3\2\2\2\u0152\u0154\7\30\2\2\u0153\u0155\7*\2\2\u0154"+
		"\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\7)"+
		"\2\2\u0157\u0150\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015d\3\2\2\2\u0159"+
		"\u015c\5$\23\2\u015a\u015c\5\32\16\2\u015b\u0159\3\2\2\2\u015b\u015a\3"+
		"\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7*\2\2\u0161\u0160\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\24\2\2\u0164"+
		"\u0165\7*\2\2\u0165\u0167\7\35\2\2\u0166\u0168\7*\2\2\u0167\u0166\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u016b\7%\2\2\u016a"+
		"\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016e\7*"+
		"\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\7)\2\2\u0170\25\3\2\2\2\u0171\u0173\7*\2\2\u0172\u0171\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\7\23\2\2\u0175\u0177"+
		"\7*\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178"+
		"\u017a\7%\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u017d\7*\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u019f\7)\2\2\u017f\u0181\7*\2\2\u0180\u017f\3\2\2"+
		"\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0184\7\27\2\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0187\7*"+
		"\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\7\33\2\2\u0189\u018a\7*\2\2\u018a\u0195\7%\2\2\u018b\u018d\7*\2"+
		"\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190"+
		"\7\4\2\2\u018f\u0191\7*\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0194\7%\2\2\u0193\u018c\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u019a\7*\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019e\7)\2\2\u019c\u019e\5\16\b\2\u019d"+
		"\u0180\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a4\7*\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\7\24\2\2\u01a6\u01a7\7*\2\2\u01a7\u01a9\7\23\2\2\u01a8"+
		"\u01aa\7*\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2"+
		"\2\2\u01ab\u01ad\7%\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01b0\7*\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\7)\2\2\u01b2\27\3\2\2\2\u01b3\u01c2"+
		"\t\4\2\2\u01b4\u01b6\t\5\2\2\u01b5\u01b7\7*\2\2\u01b6\u01b5\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\7\n\2\2\u01b9\u01bb\7*"+
		"\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\7%\2\2\u01bd\u01bf\7*\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2"+
		"\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\7\13\2\2\u01c1\u01b3\3\2\2\2\u01c1"+
		"\u01b4\3\2\2\2\u01c2\31\3\2\2\2\u01c3\u01c5\7*\2\2\u01c4\u01c3\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\21\2\2\u01c7\u01c8"+
		"\7*\2\2\u01c8\u01ca\7$\2\2\u01c9\u01cb\7*\2\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01d6\3\2\2\2\u01cc\u01ce\7*\2\2\u01cd\u01cc\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\7\4\2\2\u01d0"+
		"\u01d2\7*\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d5\t\6\2\2\u01d4\u01cd\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d9\u01db\7*\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01dd\7\6\2\2\u01dd\u01df\7\6\2\2\u01de\u01e0\7*"+
		"\2\2\u01df\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\7%\2\2\u01e2\u01e4\7*\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2"+
		"\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\7(\2\2\u01e6\u01e8\7*\2\2\u01e7\u01e6"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\7%\2\2\u01ea"+
		"\u01ec\7*\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed\u01ee\7)\2\2\u01ee\33\3\2\2\2\u01ef\u01f1\7*\2\2\u01f0\u01ef"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7\21\2\2"+
		"\u01f3\u01f4\7*\2\2\u01f4\u01f5\7\23\2\2\u01f5\u01f6\7*\2\2\u01f6\u01f7"+
		"\7\22\2\2\u01f7\u01f8\7*\2\2\u01f8\u01fa\7%\2\2\u01f9\u01fb\7*\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\7)"+
		"\2\2\u01fd\35\3\2\2\2\u01fe\u0203\5 \21\2\u01ff\u0200\7*\2\2\u0200\u0202"+
		"\5 \21\2\u0201\u01ff\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\37\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u020a\7\7\2"+
		"\2\u0207\u0209\n\3\2\2\u0208\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u020b"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d"+
		"\u0210\7\b\2\2\u020e\u0210\n\3\2\2\u020f\u0206\3\2\2\2\u020f\u020e\3\2"+
		"\2\2\u0210!\3\2\2\2\u0211\u0213\7%\2\2\u0212\u0214\7*\2\2\u0213\u0212"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\7\3\2\2\u0216"+
		"\u0218\7*\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021b\7&\2\2\u021a\u021c\7*\2\2\u021b\u021a\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\7\4\2\2\u021e\u0220\7*\2\2\u021f"+
		"\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022c\7&"+
		"\2\2\u0222\u0224\7%\2\2\u0223\u0225\7*\2\2\u0224\u0223\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7\3\2\2\u0227\u0229\7*\2\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\5\36"+
		"\20\2\u022b\u0211\3\2\2\2\u022b\u0222\3\2\2\2\u022c#\3\2\2\2\u022d\u0236"+
		"\5\n\6\2\u022e\u0236\5\b\5\2\u022f\u0236\5*\26\2\u0230\u0236\5\16\b\2"+
		"\u0231\u0236\5\24\13\2\u0232\u0236\5\26\f\2\u0233\u0236\5,\27\2\u0234"+
		"\u0236\5&\24\2\u0235\u022d\3\2\2\2\u0235\u022e\3\2\2\2\u0235\u022f\3\2"+
		"\2\2\u0235\u0230\3\2\2\2\u0235\u0231\3\2\2\2\u0235\u0232\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238%\3\2\2\2\u0239\u023b\7*\2\2\u023a\u0239"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0240\3\2\2\2\u023c\u023f\5(\25\2\u023d"+
		"\u023f\n\7\2\2\u023e\u023c\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0245\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0246\7)\2\2\u0244\u0246\5,\27\2\u0245\u0243\3\2"+
		"\2\2\u0245\u0244\3\2\2\2\u0246\'\3\2\2\2\u0247\u0248\7\t\2\2\u0248\u0249"+
		"\7\7\2\2\u0249\u024a\7%\2\2\u024a\u0253\7\b\2\2\u024b\u024c\7\t\2\2\u024c"+
		"\u024d\7\7\2\2\u024d\u024e\7%\2\2\u024e\u024f\7\n\2\2\u024f\u0250\7%\2"+
		"\2\u0250\u0251\7\13\2\2\u0251\u0253\7\b\2\2\u0252\u0247\3\2\2\2\u0252"+
		"\u024b\3\2\2\2\u0253)\3\2\2\2\u0254\u0256\7*\2\2\u0255\u0254\3\2\2\2\u0255"+
		"\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\7\21\2\2\u0258\u0259\7"+
		"*\2\2\u0259\u025b\5\"\22\2\u025a\u025c\7*\2\2\u025b\u025a\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7)\2\2\u025e+\3\2\2\2\u025f"+
		"\u0261\7*\2\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0263\7\20\2\2\u0263\u0268\n\b\2\2\u0264\u0267\5(\25\2\u0265"+
		"\u0267\n\3\2\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2"+
		"\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0268\3\2\2\2\u026b\u026c\7)\2\2\u026c-\3\2\2\2\u0085\60\62\669<BHLP"+
		"SX\\behknty{\177\u0083\u0086\u0089\u008c\u0092\u0095\u0098\u009b\u00a1"+
		"\u00a4\u00a8\u00ab\u00b3\u00b6\u00bc\u00c1\u00c9\u00ce\u00d8\u00dc\u00de"+
		"\u00e7\u00ec\u00ef\u00f5\u00f8\u00fb\u0100\u0103\u0106\u010e\u0113\u0116"+
		"\u011c\u011f\u0122\u0127\u012b\u012e\u0132\u0137\u013b\u013f\u0142\u0148"+
		"\u014d\u0150\u0154\u0157\u015b\u015d\u0161\u0167\u016a\u016d\u0172\u0176"+
		"\u0179\u017c\u0180\u0183\u0186\u018c\u0190\u0195\u0199\u019d\u019f\u01a3"+
		"\u01a9\u01ac\u01af\u01b6\u01ba\u01be\u01c1\u01c4\u01ca\u01cd\u01d1\u01d6"+
		"\u01da\u01df\u01e3\u01e7\u01eb\u01f0\u01fa\u0203\u020a\u020f\u0213\u0217"+
		"\u021b\u021f\u0224\u0228\u022b\u0235\u0237\u023a\u023e\u0240\u0245\u0252"+
		"\u0255\u025b\u0260\u0266\u0268";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}