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
		Equal=1, NotEqual=2, Assign=3, Comma=4, Semicolon=5, Colon=6, LeftBrace=7, 
		RightBrace=8, Dollar=9, LeftParen=10, RightParen=11, LeftBracket=12, RightBracket=13, 
		Smaller=14, Larger=15, Exclamation=16, Plus=17, Minus=18, Star=19, Slash=20, 
		Prefix=21, Template=22, Interface=23, End=24, Do=25, Program=26, Module=27, 
		Contains=28, Function=29, Subroutine=30, Procedure=31, Recursive=32, Type=33, 
		Extends=34, Private=35, Public=36, Sequence=37, Abstract=38, Bind=39, 
		Generic=40, If=41, Then=42, Else=43, And=44, Not=45, Or=46, Identifier=47, 
		IntegerConstant=48, FloatConstant=49, StringLiteral=50, AssignPointer=51, 
		Newline=52, WS=53, Noise=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'=='", "'/='", "'='", "','", "';'", "':'", "'{'", "'}'", 
		"'$'", "'('", "')'", "'['", "']'", "'<'", "'>'", "'!'", "'+'", "'-'", 
		"'*'", "'/'", "Prefix", "Template", "Interface", "End", "Do", "Program", 
		"Module", "Contains", "Function", "Subroutine", "Procedure", "Recursive", 
		"Type", "Extends", "Private", "Public", "Sequence", "Abstract", "Bind", 
		"Generic", "If", "Then", "Else", "And", "Not", "Or", "Identifier", "IntegerConstant", 
		"FloatConstant", "StringLiteral", "AssignPointer", "Newline", "WS", "Noise"
	};
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_templateBlock = 3, 
		RULE_loopBlock = 4, RULE_loopBegin = 5, RULE_procedureBlock = 6, RULE_functionBlock = 7, 
		RULE_subroutineBlock = 8, RULE_typeDefinitionBlock = 9, RULE_fortranInterfaceBlock = 10, 
		RULE_typeAttributes = 11, RULE_genericTypeBoundLine = 12, RULE_interfaceLine = 13, 
		RULE_list = 14, RULE_listItem = 15, RULE_listAssignment = 16, RULE_ifStatement = 17, 
		RULE_ifSingleLine = 18, RULE_ifBlock = 19, RULE_contentBlock = 20, RULE_contentLine = 21, 
		RULE_placeholder = 22, RULE_variableDefinition = 23, RULE_lineComment = 24, 
		RULE_expr = 25, RULE_logicalExpr = 26;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "templateBlock", "loopBlock", 
		"loopBegin", "procedureBlock", "functionBlock", "subroutineBlock", "typeDefinitionBlock", 
		"fortranInterfaceBlock", "typeAttributes", "genericTypeBoundLine", "interfaceLine", 
		"list", "listItem", "listAssignment", "ifStatement", "ifSingleLine", "ifBlock", 
		"contentBlock", "contentLine", "placeholder", "variableDefinition", "lineComment", 
		"expr", "logicalExpr"
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
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(56);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(54); moduleBlock();
						}
						break;

					case 2:
						{
						setState(55); contentBlock();
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(61); programBlock();
				}
				break;
			}
			setState(65);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << Newline) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(64); contentBlock();
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
			setState(68);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(67); match(WS);
				}
			}

			setState(70); match(Program);
			setState(71); match(WS);
			setState(72); match(Identifier);
			setState(74);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(73); match(WS);
				}
			}

			setState(76); match(Newline);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(77); contentBlock();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(84);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(83); match(WS);
					}
				}

				setState(86); match(Contains);
				setState(88);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(87); match(WS);
					}
				}

				setState(90); match(Newline);
				}
				break;
			}
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(93); contentBlock();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(100);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(99); match(WS);
				}
			}

			setState(102); match(End);
			setState(103); match(WS);
			setState(104); match(Program);
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(105); match(WS);
				}
				break;
			}
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(108); match(Identifier);
				}
				break;
			}
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(111); match(WS);
				}
				break;
			}
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(114); match(Newline);
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
			setState(118);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(117); match(WS);
				}
			}

			setState(120); match(Module);
			setState(121); match(WS);
			setState(122); match(Identifier);
			setState(124);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(123); match(WS);
				}
			}

			setState(126); match(Newline);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(129);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(127); interfaceLine();
						}
						break;

					case 2:
						{
						setState(128); contentBlock();
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(135);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(134); match(WS);
					}
				}

				setState(137); match(Contains);
				setState(139);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(138); match(WS);
					}
				}

				setState(141); match(Newline);
				}
				break;
			}
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
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

			setState(150); match(End);
			setState(151); match(WS);
			setState(152); match(Module);
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(153); match(WS);
				}
				break;
			}
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(156); match(Identifier);
				}
				break;
			}
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(159); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTemplateBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBlockContext templateBlock() throws RecognitionException {
		TemplateBlockContext _localctx = new TemplateBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templateBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(162); match(WS);
				}
			}

			setState(165); match(Prefix);
			setState(166); match(WS);
			setState(167); match(Template);
			setState(169);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(168); match(WS);
				}
			}

			setState(172);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(171); match(Identifier);
				}
			}

			setState(174); match(Newline);
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(175); contentBlock();
				}
				break;
			}
			setState(179);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(178); match(WS);
				}
			}

			setState(181); match(Prefix);
			setState(182); match(WS);
			setState(183); match(End);
			setState(184); match(WS);
			setState(185); match(Template);
			setState(187);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(186); match(WS);
				}
			}

			setState(190);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(189); match(Identifier);
				}
			}

			setState(192); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); loopBegin();
			setState(196);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(195); match(WS);
				}
			}

			setState(198); match(Newline);
			setState(199); contentBlock();
			setState(201);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(200); match(WS);
				}
			}

			setState(203); match(Prefix);
			setState(204); match(WS);
			setState(205); match(End);
			setState(206); match(WS);
			setState(207); match(Do);
			setState(209);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(208); match(WS);
				}
			}

			setState(211); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLoopBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBeginContext loopBegin() throws RecognitionException {
		LoopBeginContext _localctx = new LoopBeginContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loopBegin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(213); match(WS);
				}
			}

			setState(216); match(Prefix);
			setState(217); match(WS);
			setState(218); match(Do);
			setState(219); match(WS);
			setState(220); listAssignment();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitProcedureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureBlockContext procedureBlock() throws RecognitionException {
		ProcedureBlockContext _localctx = new ProcedureBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_procedureBlock);
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); functionBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); subroutineBlock();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(228);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(226); placeholder();
					}
					break;

				case 2:
					{
					setState(227);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Function || _la==Newline) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); match(Function);
			setState(234); match(WS);
			setState(235); match(Identifier);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(236);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242); match(Newline);
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(243); contentBlock();
				}
				break;
			}
			setState(247);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(246); match(WS);
				}
			}

			setState(249); match(End);
			setState(250); match(WS);
			setState(251); match(Function);
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(252); match(WS);
				}
				break;
			}
			setState(256);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(255); match(Identifier);
				}
			}

			setState(259);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(258); match(WS);
				}
			}

			setState(261); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitSubroutineBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineBlockContext subroutineBlock() throws RecognitionException {
		SubroutineBlockContext _localctx = new SubroutineBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subroutineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(263); match(WS);
				}
				break;
			}
			setState(267);
			_la = _input.LA(1);
			if (_la==Recursive) {
				{
				setState(266); match(Recursive);
				}
			}

			setState(270);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(269); match(WS);
				}
			}

			setState(272); match(Subroutine);
			setState(273); match(WS);
			setState(274); match(Identifier);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(275);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281); match(Newline);
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(282); contentBlock();
				}
				break;
			}
			setState(286);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(285); match(WS);
				}
			}

			setState(288); match(End);
			setState(289); match(WS);
			setState(290); match(Subroutine);
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(291); match(WS);
				}
				break;
			}
			setState(295);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(294); match(Identifier);
				}
			}

			setState(298);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(297); match(WS);
				}
			}

			setState(300); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTypeDefinitionBlock(this);
			else return visitor.visitChildren(this);
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
			setState(303);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(302); match(WS);
				}
			}

			setState(305); match(Type);
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(306); match(WS);
				}
				break;
			}
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(309); match(WS);
						}
					}

					setState(312); match(Comma);
					setState(314);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(313); match(WS);
						}
					}

					setState(316); typeAttributes();
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(322); match(WS);
				}
				break;
			}
			setState(327);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(325); match(Colon);
				setState(326); match(Colon);
				}
			}

			setState(330);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(329); match(WS);
				}
			}

			setState(332); match(Identifier);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				{
				setState(333);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newline) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339); match(Newline);
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(340); contentBlock();
				}
				break;
			}
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(344);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(343); match(WS);
					}
				}

				setState(346); match(Contains);
				setState(348);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(347); match(WS);
					}
				}

				setState(350); match(Newline);
				}
				break;
			}
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(355);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(353); contentBlock();
						}
						break;

					case 2:
						{
						setState(354); genericTypeBoundLine();
						}
						break;
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(361);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(360); match(WS);
				}
			}

			setState(363); match(End);
			setState(364); match(WS);
			setState(365); match(Type);
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(366); match(WS);
				}
				break;
			}
			setState(370);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(369); match(Identifier);
				}
			}

			setState(373);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(372); match(WS);
				}
			}

			setState(375); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitFortranInterfaceBlock(this);
			else return visitor.visitChildren(this);
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
			setState(378);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(377); match(WS);
				}
			}

			setState(380); match(Interface);
			setState(382);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(381); match(WS);
				}
				break;
			}
			setState(385);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(384); match(Identifier);
				}
			}

			setState(388);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(387); match(WS);
				}
				break;
			}
			setState(405);
			_la = _input.LA(1);
			if (_la==LeftParen || _la==WS) {
				{
				setState(391);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(390); match(WS);
					}
				}

				setState(393); match(LeftParen);
				setState(395);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(394); match(WS);
					}
				}

				setState(397);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(399);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(398); match(WS);
					}
				}

				setState(401); match(RightParen);
				setState(403);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(402); match(WS);
					}
				}

				}
			}

			setState(407); match(Newline);
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(438);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(409);
						switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
						case 1:
							{
							setState(408); match(WS);
							}
							break;
						}
						setState(412);
						_la = _input.LA(1);
						if (_la==Module) {
							{
							setState(411); match(Module);
							}
						}

						setState(415);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(414); match(WS);
							}
						}

						setState(417); match(Procedure);
						setState(418); match(WS);
						setState(419); match(Identifier);
						setState(430);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(421);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(420); match(WS);
									}
								}

								setState(423); match(Comma);
								setState(425);
								_la = _input.LA(1);
								if (_la==WS) {
									{
									setState(424); match(WS);
									}
								}

								setState(427); match(Identifier);
								}
								} 
							}
							setState(432);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
						}
						setState(434);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(433); match(WS);
							}
						}

						setState(436); match(Newline);
						}
						break;

					case 2:
						{
						setState(437); procedureBlock();
						}
						break;
					}
					} 
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(444);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(443); match(WS);
				}
			}

			setState(446); match(End);
			setState(447); match(WS);
			setState(448); match(Interface);
			setState(450);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(449); match(WS);
				}
				break;
			}
			setState(453);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(452); match(Identifier);
				}
			}

			setState(456);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(455); match(WS);
				}
			}

			setState(458); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitTypeAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAttributesContext typeAttributes() throws RecognitionException {
		TypeAttributesContext _localctx = new TypeAttributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeAttributes);
		int _la;
		try {
			setState(474);
			switch (_input.LA(1)) {
			case Private:
			case Public:
			case Sequence:
			case Abstract:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
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
				setState(461);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Bind) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(463);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(462); match(WS);
					}
				}

				setState(465); match(LeftParen);
				setState(467);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(466); match(WS);
					}
				}

				setState(469); match(Identifier);
				setState(471);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(470); match(WS);
					}
				}

				setState(473); match(RightParen);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitGenericTypeBoundLine(this);
			else return visitor.visitChildren(this);
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
			setState(477);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(476); match(WS);
				}
			}

			setState(479); match(Prefix);
			setState(480); match(WS);
			setState(481); match(Generic);
			setState(483);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(482); match(WS);
				}
				break;
			}
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(486);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(485); match(WS);
						}
					}

					setState(488); match(Comma);
					setState(490);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(489); match(WS);
						}
					}

					setState(492);
					_la = _input.LA(1);
					if ( !(_la==Private || _la==Public) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			setState(499);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(498); match(WS);
				}
			}

			setState(501); match(Colon);
			setState(502); match(Colon);
			setState(504);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(503); match(WS);
				}
			}

			setState(506); match(Identifier);
			setState(508);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(507); match(WS);
				}
			}

			setState(510); match(AssignPointer);
			setState(512);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(511); match(WS);
				}
			}

			setState(514); match(Identifier);
			setState(516);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(515); match(WS);
				}
			}

			setState(518); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitInterfaceLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceLineContext interfaceLine() throws RecognitionException {
		InterfaceLineContext _localctx = new InterfaceLineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(520); match(WS);
				}
			}

			setState(523); match(Prefix);
			setState(524); match(WS);
			setState(525); match(Interface);
			setState(526); match(WS);
			setState(527); match(Template);
			setState(528); match(WS);
			setState(529); match(Identifier);
			setState(531);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(530); match(WS);
				}
			}

			setState(533); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535); listItem();
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(536); match(WS);
					setState(537); listItem();
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		enterRule(_localctx, 30, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543); match(LeftBrace);
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(544);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(549);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(550); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitListAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListAssignmentContext listAssignment() throws RecognitionException {
		ListAssignmentContext _localctx = new ListAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listAssignment);
		int _la;
		try {
			setState(580);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554); match(Identifier);
				setState(556);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(555); match(WS);
					}
				}

				setState(558); match(Assign);
				setState(560);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(559); match(WS);
					}
				}

				setState(562); match(IntegerConstant);
				setState(564);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(563); match(WS);
					}
				}

				setState(566); match(Comma);
				setState(568);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(567); match(WS);
					}
				}

				setState(570); match(IntegerConstant);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(571); match(Identifier);
				setState(573);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(572); match(WS);
					}
				}

				setState(575); match(Assign);
				setState(577);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(576); match(WS);
					}
					break;
				}
				setState(579); list();
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
		public IfSingleLineContext ifSingleLine() {
			return getRuleContext(IfSingleLineContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
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
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(582); ifBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583); ifSingleLine();
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
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode If() { return getToken(fplusParser.If, 0); }
		public TerminalNode Prefix() { return getToken(fplusParser.Prefix, 0); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
		enterRule(_localctx, 36, RULE_ifSingleLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(586); match(WS);
				}
			}

			setState(589); match(Prefix);
			setState(590); match(WS);
			setState(591); match(If);
			setState(593);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(592); match(WS);
				}
			}

			setState(595); match(LeftParen);
			setState(597);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(596); match(WS);
				}
			}

			setState(599); logicalExpr(0);
			setState(601);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(600); match(WS);
				}
			}

			setState(603); match(RightParen);
			setState(605);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(604); match(WS);
				}
				break;
			}
			setState(607); contentLine();
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode If(int i) {
			return getToken(fplusParser.If, i);
		}
		public TerminalNode Else() { return getToken(fplusParser.Else, 0); }
		public List<TerminalNode> If() { return getTokens(fplusParser.If); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public List<ContentBlockContext> contentBlock() {
			return getRuleContexts(ContentBlockContext.class);
		}
		public ContentBlockContext contentBlock(int i) {
			return getRuleContext(ContentBlockContext.class,i);
		}
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public TerminalNode Then() { return getToken(fplusParser.Then, 0); }
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
		enterRule(_localctx, 38, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(609); match(WS);
				}
			}

			setState(612); match(Prefix);
			setState(613); match(WS);
			setState(614); match(If);
			setState(616);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(615); match(WS);
				}
			}

			setState(618); match(LeftParen);
			setState(620);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(619); match(WS);
				}
			}

			setState(622); logicalExpr(0);
			setState(624);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(623); match(WS);
				}
			}

			setState(626); match(RightParen);
			setState(628);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(627); match(WS);
				}
			}

			setState(630); match(Then);
			setState(632);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(631); match(WS);
				}
			}

			setState(634); match(Newline);
			setState(635); contentBlock();
			setState(647);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(637);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(636); match(WS);
					}
				}

				setState(639); match(Prefix);
				setState(640); match(WS);
				setState(641); match(Else);
				setState(643);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(642); match(WS);
					}
				}

				setState(645); match(Newline);
				setState(646); contentBlock();
				}
				break;
			}
			setState(650);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(649); match(WS);
				}
			}

			setState(652); match(Prefix);
			setState(653); match(WS);
			setState(654); match(End);
			setState(655); match(WS);
			setState(656); match(If);
			setState(658);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(657); match(WS);
				}
			}

			setState(660); match(Newline);
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
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
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
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<TypeDefinitionBlockContext> typeDefinitionBlock() {
			return getRuleContexts(TypeDefinitionBlockContext.class);
		}
		public List<LineCommentContext> lineComment() {
			return getRuleContexts(LineCommentContext.class);
		}
		public List<FortranInterfaceBlockContext> fortranInterfaceBlock() {
			return getRuleContexts(FortranInterfaceBlockContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentBlockContext contentBlock() throws RecognitionException {
		ContentBlockContext _localctx = new ContentBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(671);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						setState(662); loopBlock();
						}
						break;

					case 2:
						{
						setState(663); templateBlock();
						}
						break;

					case 3:
						{
						setState(664); variableDefinition();
						}
						break;

					case 4:
						{
						setState(665); ifStatement();
						}
						break;

					case 5:
						{
						setState(666); procedureBlock();
						}
						break;

					case 6:
						{
						setState(667); typeDefinitionBlock();
						}
						break;

					case 7:
						{
						setState(668); fortranInterfaceBlock();
						}
						break;

					case 8:
						{
						setState(669); lineComment();
						}
						break;

					case 9:
						{
						setState(670); contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(673); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitContentLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentLineContext contentLine() throws RecognitionException {
		ContentLineContext _localctx = new ContentLineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_contentLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(675); match(WS);
				}
				break;
			}
			setState(682);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(680);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						setState(678); placeholder();
						}
						break;

					case 2:
						{
						setState(679);
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
				setState(684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			setState(687);
			switch (_input.LA(1)) {
			case Newline:
				{
				setState(685); match(Newline);
				}
				break;
			case Exclamation:
			case WS:
				{
				setState(686); lineComment();
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_placeholder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689); match(Dollar);
			setState(690); match(LeftBrace);
			setState(692);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(691); match(WS);
				}
			}

			setState(694); expr(0);
			setState(696);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(695); match(WS);
				}
			}

			setState(698); match(RightBrace);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(700); match(WS);
				}
			}

			setState(703); match(Prefix);
			setState(704); match(WS);
			setState(705); listAssignment();
			setState(707);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(706); match(WS);
				}
			}

			setState(709); match(Newline);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fplusVisitor ) return ((fplusVisitor<? extends T>)visitor).visitLineComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineCommentContext lineComment() throws RecognitionException {
		LineCommentContext _localctx = new LineCommentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lineComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(711); match(WS);
				}
			}

			setState(714); match(Exclamation);
			setState(715);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==Dollar) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << Colon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Smaller) | (1L << Larger) | (1L << Exclamation) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Slash) | (1L << Prefix) | (1L << Template) | (1L << Interface) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Function) | (1L << Subroutine) | (1L << Procedure) | (1L << Recursive) | (1L << Type) | (1L << Extends) | (1L << Private) | (1L << Public) | (1L << Sequence) | (1L << Abstract) | (1L << Bind) | (1L << Generic) | (1L << If) | (1L << Then) | (1L << Else) | (1L << And) | (1L << Not) | (1L << Or) | (1L << Identifier) | (1L << IntegerConstant) | (1L << FloatConstant) | (1L << StringLiteral) | (1L << AssignPointer) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(718);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(716); placeholder();
					}
					break;

				case 2:
					{
					setState(717);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==Newline) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(723); match(Newline);
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
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
	public static class ExprMulDivContext extends ExprContext {
		public Token op;
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
	public static class ExprArraySubscriptContext extends ExprContext {
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(fplusParser.Identifier, 0); }
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

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(726); match(LeftParen);
				setState(728);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(727); match(WS);
					}
				}

				setState(730); expr(0);
				setState(732);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(731); match(WS);
					}
				}

				setState(734); match(RightParen);
				}
				break;

			case 2:
				{
				_localctx = new ExprConstantsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(736); match(IntegerConstant);
				}
				break;

			case 3:
				{
				_localctx = new ExprArraySubscriptContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(737); match(Identifier);
				setState(739);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(738); match(WS);
					}
				}

				setState(741); match(LeftParen);
				setState(743);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(742); match(WS);
					}
				}

				setState(745); expr(0);
				setState(747);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(746); match(WS);
					}
				}

				setState(749); match(RightParen);
				}
				break;

			case 4:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(751); match(Identifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(772);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(754);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(756);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(755); match(WS);
							}
						}

						setState(758);
						((ExprMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Star || _la==Slash) ) {
							((ExprMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(760);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(759); match(WS);
							}
						}

						setState(762); expr(0);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(763);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(765);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(764); match(WS);
							}
						}

						setState(767);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(769);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(768); match(WS);
							}
						}

						setState(771); expr(0);
						}
						break;
					}
					} 
				}
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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
		public int _p;
		public LogicalExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LogicalExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
	 
		public LogicalExprContext() { }
		public void copyFrom(LogicalExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class LogicalExprNotContext extends LogicalExprContext {
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public TerminalNode WS() { return getToken(fplusParser.WS, 0); }
		public TerminalNode Not() { return getToken(fplusParser.Not, 0); }
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
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public TerminalNode Or() { return getToken(fplusParser.Or, 0); }
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
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
	public static class LogicalExprCompareContext extends LogicalExprContext {
		public Token op;
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
	public static class LogicalExprAndContext extends LogicalExprContext {
		public List<LogicalExprContext> logicalExpr() {
			return getRuleContexts(LogicalExprContext.class);
		}
		public TerminalNode And() { return getToken(fplusParser.And, 0); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
		}
		public LogicalExprContext logicalExpr(int i) {
			return getRuleContext(LogicalExprContext.class,i);
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

	public final LogicalExprContext logicalExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, _parentState, _p);
		LogicalExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, RULE_logicalExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new LogicalExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(778); match(Not);
				setState(780);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(779); match(WS);
					}
				}

				setState(782); logicalExpr(2);
				}
				break;
			case LeftParen:
			case Identifier:
			case IntegerConstant:
				{
				_localctx = new LogicalExprCompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(783); expr(0);
				setState(785);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(784); match(WS);
					}
				}

				setState(787);
				((LogicalExprCompareContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equal) | (1L << NotEqual) | (1L << Smaller) | (1L << Larger))) != 0)) ) {
					((LogicalExprCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(789);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(788); match(WS);
					}
				}

				setState(791); expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(813);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExprAndContext(new LogicalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(795);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(797);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(796); match(WS);
							}
						}

						setState(799); match(And);
						setState(801);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(800); match(WS);
							}
						}

						setState(803); logicalExpr(0);
						}
						break;

					case 2:
						{
						_localctx = new LogicalExprOrContext(new LogicalExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpr);
						setState(804);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(806);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(805); match(WS);
							}
						}

						setState(808); match(Or);
						setState(810);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(809); match(WS);
							}
						}

						setState(812); logicalExpr(0);
						}
						break;
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
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
		case 25: return expr_sempred((ExprContext)_localctx, predIndex);

		case 26: return logicalExpr_sempred((LogicalExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpr_sempred(LogicalExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u0335\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\5\2"+
		"A\n\2\3\2\5\2D\n\2\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\7\3Q"+
		"\n\3\f\3\16\3T\13\3\3\3\5\3W\n\3\3\3\3\3\5\3[\n\3\3\3\5\3^\n\3\3\3\7\3"+
		"a\n\3\f\3\16\3d\13\3\3\3\5\3g\n\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\3\5\3p\n"+
		"\3\3\3\5\3s\n\3\3\3\5\3v\n\3\3\4\5\4y\n\4\3\4\3\4\3\4\3\4\5\4\177\n\4"+
		"\3\4\3\4\3\4\7\4\u0084\n\4\f\4\16\4\u0087\13\4\3\4\5\4\u008a\n\4\3\4\3"+
		"\4\5\4\u008e\n\4\3\4\5\4\u0091\n\4\3\4\5\4\u0094\n\4\3\4\5\4\u0097\n\4"+
		"\3\4\3\4\3\4\3\4\5\4\u009d\n\4\3\4\5\4\u00a0\n\4\3\4\5\4\u00a3\n\4\3\5"+
		"\5\5\u00a6\n\5\3\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\5\5\5\u00af\n\5\3\5\3\5"+
		"\5\5\u00b3\n\5\3\5\5\5\u00b6\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00be\n\5"+
		"\3\5\5\5\u00c1\n\5\3\5\3\5\3\6\3\6\5\6\u00c7\n\6\3\6\3\6\3\6\5\6\u00cc"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d4\n\6\3\6\3\6\3\7\5\7\u00d9\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00e3\n\b\3\t\3\t\7\t\u00e7\n\t\f\t"+
		"\16\t\u00ea\13\t\3\t\3\t\3\t\3\t\7\t\u00f0\n\t\f\t\16\t\u00f3\13\t\3\t"+
		"\3\t\5\t\u00f7\n\t\3\t\5\t\u00fa\n\t\3\t\3\t\3\t\3\t\5\t\u0100\n\t\3\t"+
		"\5\t\u0103\n\t\3\t\5\t\u0106\n\t\3\t\3\t\3\n\5\n\u010b\n\n\3\n\5\n\u010e"+
		"\n\n\3\n\5\n\u0111\n\n\3\n\3\n\3\n\3\n\7\n\u0117\n\n\f\n\16\n\u011a\13"+
		"\n\3\n\3\n\5\n\u011e\n\n\3\n\5\n\u0121\n\n\3\n\3\n\3\n\3\n\5\n\u0127\n"+
		"\n\3\n\5\n\u012a\n\n\3\n\5\n\u012d\n\n\3\n\3\n\3\13\5\13\u0132\n\13\3"+
		"\13\3\13\5\13\u0136\n\13\3\13\5\13\u0139\n\13\3\13\3\13\5\13\u013d\n\13"+
		"\3\13\7\13\u0140\n\13\f\13\16\13\u0143\13\13\3\13\5\13\u0146\n\13\3\13"+
		"\3\13\5\13\u014a\n\13\3\13\5\13\u014d\n\13\3\13\3\13\7\13\u0151\n\13\f"+
		"\13\16\13\u0154\13\13\3\13\3\13\5\13\u0158\n\13\3\13\5\13\u015b\n\13\3"+
		"\13\3\13\5\13\u015f\n\13\3\13\5\13\u0162\n\13\3\13\3\13\7\13\u0166\n\13"+
		"\f\13\16\13\u0169\13\13\3\13\5\13\u016c\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0172\n\13\3\13\5\13\u0175\n\13\3\13\5\13\u0178\n\13\3\13\3\13\3\f\5"+
		"\f\u017d\n\f\3\f\3\f\5\f\u0181\n\f\3\f\5\f\u0184\n\f\3\f\5\f\u0187\n\f"+
		"\3\f\5\f\u018a\n\f\3\f\3\f\5\f\u018e\n\f\3\f\3\f\5\f\u0192\n\f\3\f\3\f"+
		"\5\f\u0196\n\f\5\f\u0198\n\f\3\f\3\f\5\f\u019c\n\f\3\f\5\f\u019f\n\f\3"+
		"\f\5\f\u01a2\n\f\3\f\3\f\3\f\3\f\5\f\u01a8\n\f\3\f\3\f\5\f\u01ac\n\f\3"+
		"\f\7\f\u01af\n\f\f\f\16\f\u01b2\13\f\3\f\5\f\u01b5\n\f\3\f\3\f\7\f\u01b9"+
		"\n\f\f\f\16\f\u01bc\13\f\3\f\5\f\u01bf\n\f\3\f\3\f\3\f\3\f\5\f\u01c5\n"+
		"\f\3\f\5\f\u01c8\n\f\3\f\5\f\u01cb\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u01d2\n"+
		"\r\3\r\3\r\5\r\u01d6\n\r\3\r\3\r\5\r\u01da\n\r\3\r\5\r\u01dd\n\r\3\16"+
		"\5\16\u01e0\n\16\3\16\3\16\3\16\3\16\5\16\u01e6\n\16\3\16\5\16\u01e9\n"+
		"\16\3\16\3\16\5\16\u01ed\n\16\3\16\7\16\u01f0\n\16\f\16\16\16\u01f3\13"+
		"\16\3\16\5\16\u01f6\n\16\3\16\3\16\3\16\5\16\u01fb\n\16\3\16\3\16\5\16"+
		"\u01ff\n\16\3\16\3\16\5\16\u0203\n\16\3\16\3\16\5\16\u0207\n\16\3\16\3"+
		"\16\3\17\5\17\u020c\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0216\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u021d\n\20\f\20\16\20\u0220"+
		"\13\20\3\21\3\21\7\21\u0224\n\21\f\21\16\21\u0227\13\21\3\21\3\21\5\21"+
		"\u022b\n\21\3\22\3\22\5\22\u022f\n\22\3\22\3\22\5\22\u0233\n\22\3\22\3"+
		"\22\5\22\u0237\n\22\3\22\3\22\5\22\u023b\n\22\3\22\3\22\3\22\5\22\u0240"+
		"\n\22\3\22\3\22\5\22\u0244\n\22\3\22\5\22\u0247\n\22\3\23\3\23\5\23\u024b"+
		"\n\23\3\24\5\24\u024e\n\24\3\24\3\24\3\24\3\24\5\24\u0254\n\24\3\24\3"+
		"\24\5\24\u0258\n\24\3\24\3\24\5\24\u025c\n\24\3\24\3\24\5\24\u0260\n\24"+
		"\3\24\3\24\3\25\5\25\u0265\n\25\3\25\3\25\3\25\3\25\5\25\u026b\n\25\3"+
		"\25\3\25\5\25\u026f\n\25\3\25\3\25\5\25\u0273\n\25\3\25\3\25\5\25\u0277"+
		"\n\25\3\25\3\25\5\25\u027b\n\25\3\25\3\25\3\25\5\25\u0280\n\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0286\n\25\3\25\3\25\5\25\u028a\n\25\3\25\5\25\u028d"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0295\n\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u02a2\n\26\r\26\16\26\u02a3\3"+
		"\27\5\27\u02a7\n\27\3\27\3\27\7\27\u02ab\n\27\f\27\16\27\u02ae\13\27\3"+
		"\27\3\27\5\27\u02b2\n\27\3\30\3\30\3\30\5\30\u02b7\n\30\3\30\3\30\5\30"+
		"\u02bb\n\30\3\30\3\30\3\31\5\31\u02c0\n\31\3\31\3\31\3\31\3\31\5\31\u02c6"+
		"\n\31\3\31\3\31\3\32\5\32\u02cb\n\32\3\32\3\32\3\32\3\32\7\32\u02d1\n"+
		"\32\f\32\16\32\u02d4\13\32\3\32\3\32\3\33\3\33\3\33\5\33\u02db\n\33\3"+
		"\33\3\33\5\33\u02df\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u02e6\n\33\3\33"+
		"\3\33\5\33\u02ea\n\33\3\33\3\33\5\33\u02ee\n\33\3\33\3\33\3\33\5\33\u02f3"+
		"\n\33\3\33\3\33\5\33\u02f7\n\33\3\33\3\33\5\33\u02fb\n\33\3\33\3\33\3"+
		"\33\5\33\u0300\n\33\3\33\3\33\5\33\u0304\n\33\3\33\7\33\u0307\n\33\f\33"+
		"\16\33\u030a\13\33\3\34\3\34\3\34\5\34\u030f\n\34\3\34\3\34\3\34\5\34"+
		"\u0314\n\34\3\34\3\34\5\34\u0318\n\34\3\34\3\34\5\34\u031c\n\34\3\34\3"+
		"\34\5\34\u0320\n\34\3\34\3\34\5\34\u0324\n\34\3\34\3\34\3\34\5\34\u0329"+
		"\n\34\3\34\3\34\5\34\u032d\n\34\3\34\7\34\u0330\n\34\f\34\16\34\u0333"+
		"\13\34\3\34\4\u0225\u02ac\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\r\4\2\37\37\66\66\3\2\66\66\4\2\5\5\23\26\3\2%(\4"+
		"\2$$))\3\2%&\4\2\27\27\34 \3\2\13\13\3\2\25\26\3\2\23\24\4\2\3\4\20\21"+
		"\u03d2\2<\3\2\2\2\4F\3\2\2\2\6x\3\2\2\2\b\u00a5\3\2\2\2\n\u00c4\3\2\2"+
		"\2\f\u00d8\3\2\2\2\16\u00e2\3\2\2\2\20\u00e8\3\2\2\2\22\u010a\3\2\2\2"+
		"\24\u0131\3\2\2\2\26\u017c\3\2\2\2\30\u01dc\3\2\2\2\32\u01df\3\2\2\2\34"+
		"\u020b\3\2\2\2\36\u0219\3\2\2\2 \u022a\3\2\2\2\"\u0246\3\2\2\2$\u024a"+
		"\3\2\2\2&\u024d\3\2\2\2(\u0264\3\2\2\2*\u02a1\3\2\2\2,\u02a6\3\2\2\2."+
		"\u02b3\3\2\2\2\60\u02bf\3\2\2\2\62\u02ca\3\2\2\2\64\u02f2\3\2\2\2\66\u031b"+
		"\3\2\2\28;\5\6\4\29;\5*\26\2:8\3\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<"+
		"=\3\2\2\2=@\3\2\2\2><\3\2\2\2?A\5\4\3\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
		"BD\5*\26\2CB\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EG\7\67\2\2FE\3\2\2\2FG\3\2\2"+
		"\2GH\3\2\2\2HI\7\34\2\2IJ\7\67\2\2JL\7\61\2\2KM\7\67\2\2LK\3\2\2\2LM\3"+
		"\2\2\2MN\3\2\2\2NR\7\66\2\2OQ\5*\26\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS"+
		"\3\2\2\2S]\3\2\2\2TR\3\2\2\2UW\7\67\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2"+
		"XZ\7\36\2\2Y[\7\67\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\66\2\2]V\3"+
		"\2\2\2]^\3\2\2\2^b\3\2\2\2_a\5*\26\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2eg\7\67\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi"+
		"\7\32\2\2ij\7\67\2\2jl\7\34\2\2km\7\67\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2"+
		"\2np\7\61\2\2on\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\7\67\2\2rq\3\2\2\2rs\3\2"+
		"\2\2su\3\2\2\2tv\7\66\2\2ut\3\2\2\2uv\3\2\2\2v\5\3\2\2\2wy\7\67\2\2xw"+
		"\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\35\2\2{|\7\67\2\2|~\7\61\2\2}\177\7\67"+
		"\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0085\7\66\2\2\u0081"+
		"\u0084\5\34\17\2\u0082\u0084\5*\26\2\u0083\u0081\3\2\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0090\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\67\2\2\u0089\u0088\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7\36\2\2\u008c"+
		"\u008e\7\67\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u0091\7\66\2\2\u0090\u0089\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0094\5*\26\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0097\7\67\2\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\32\2\2\u0099\u009a\7"+
		"\67\2\2\u009a\u009c\7\35\2\2\u009b\u009d\7\67\2\2\u009c\u009b\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\7\61\2\2\u009f\u009e"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\7\66\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\7\3\2\2\2\u00a4\u00a6\7"+
		"\67\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\7\27\2\2\u00a8\u00a9\7\67\2\2\u00a9\u00ab\7\30\2\2\u00aa\u00ac"+
		"\7\67\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2"+
		"\u00ad\u00af\7\61\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\7\66\2\2\u00b1\u00b3\5*\26\2\u00b2\u00b1\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\7\67\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\27\2\2"+
		"\u00b8\u00b9\7\67\2\2\u00b9\u00ba\7\32\2\2\u00ba\u00bb\7\67\2\2\u00bb"+
		"\u00bd\7\30\2\2\u00bc\u00be\7\67\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\7\61\2\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\66\2\2\u00c3\t\3\2\2"+
		"\2\u00c4\u00c6\5\f\7\2\u00c5\u00c7\7\67\2\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\66\2\2\u00c9\u00cb\5"+
		"*\26\2\u00ca\u00cc\7\67\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\7\67\2\2\u00cf\u00d0\7"+
		"\32\2\2\u00d0\u00d1\7\67\2\2\u00d1\u00d3\7\33\2\2\u00d2\u00d4\7\67\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6"+
		"\7\66\2\2\u00d6\13\3\2\2\2\u00d7\u00d9\7\67\2\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\27\2\2\u00db\u00dc\7"+
		"\67\2\2\u00dc\u00dd\7\33\2\2\u00dd\u00de\7\67\2\2\u00de\u00df\5\"\22\2"+
		"\u00df\r\3\2\2\2\u00e0\u00e3\5\20\t\2\u00e1\u00e3\5\22\n\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\17\3\2\2\2\u00e4\u00e7\5.\30\2\u00e5"+
		"\u00e7\n\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\7\67\2\2\u00ed\u00f1\7"+
		"\61\2\2\u00ee\u00f0\n\3\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f6\7\66\2\2\u00f5\u00f7\5*\26\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\7\67\2\2\u00f9\u00f8\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\32\2\2\u00fc"+
		"\u00fd\7\67\2\2\u00fd\u00ff\7\37\2\2\u00fe\u0100\7\67\2\2\u00ff\u00fe"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u0103\7\61\2\2"+
		"\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0106"+
		"\7\67\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0108\7\66\2\2\u0108\21\3\2\2\2\u0109\u010b\7\67\2\2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\7\"\2\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111\7\67"+
		"\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\7 \2\2\u0113\u0114\7\67\2\2\u0114\u0118\7\61\2\2\u0115\u0117\n"+
		"\3\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\7\66"+
		"\2\2\u011c\u011e\5*\26\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u0121\7\67\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7\32\2\2\u0123\u0124\7\67\2\2\u0124"+
		"\u0126\7 \2\2\u0125\u0127\7\67\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u012a\7\61\2\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\7\67\2\2\u012c\u012b\3"+
		"\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\66\2\2\u012f"+
		"\23\3\2\2\2\u0130\u0132\7\67\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0135\7#\2\2\u0134\u0136\7\67\2\2\u0135\u0134"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0141\3\2\2\2\u0137\u0139\7\67\2\2"+
		"\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c"+
		"\7\6\2\2\u013b\u013d\7\67\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2"+
		"\u013d\u013e\3\2\2\2\u013e\u0140\5\30\r\2\u013f\u0138\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0146\7\67\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3"+
		"\2\2\2\u0146\u0149\3\2\2\2\u0147\u0148\7\b\2\2\u0148\u014a\7\b\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d\7\67"+
		"\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0152\7\61\2\2\u014f\u0151\n\3\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3"+
		"\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0157\7\66\2\2\u0156\u0158\5*\26\2\u0157\u0156\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u0161\3\2\2\2\u0159\u015b\7\67\2\2\u015a"+
		"\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\7\36"+
		"\2\2\u015d\u015f\7\67\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\7\66\2\2\u0161\u015a\3\2\2\2\u0161\u0162\3"+
		"\2\2\2\u0162\u0167\3\2\2\2\u0163\u0166\5*\26\2\u0164\u0166\5\32\16\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016c\7\67\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3"+
		"\2\2\2\u016d\u016e\7\32\2\2\u016e\u016f\7\67\2\2\u016f\u0171\7#\2\2\u0170"+
		"\u0172\7\67\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3"+
		"\2\2\2\u0173\u0175\7\61\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0178\7\67\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7\66\2\2\u017a\25\3\2\2\2\u017b"+
		"\u017d\7\67\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017e\u0180\7\31\2\2\u017f\u0181\7\67\2\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0184\7\61\2\2\u0183\u0182\3"+
		"\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0187\7\67\2\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0197\3\2\2\2\u0188\u018a\7\67"+
		"\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\7\f\2\2\u018c\u018e\7\67\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\t\4\2\2\u0190\u0192\7\67\2\2\u0191"+
		"\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\7\r"+
		"\2\2\u0194\u0196\7\67\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0189\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u01ba\7\66\2\2\u019a\u019c\7\67\2\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019f\7\35\2\2\u019e\u019d\3"+
		"\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\7\67\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7!"+
		"\2\2\u01a4\u01a5\7\67\2\2\u01a5\u01b0\7\61\2\2\u01a6\u01a8\7\67\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\7\6"+
		"\2\2\u01aa\u01ac\7\67\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\7\61\2\2\u01ae\u01a7\3\2\2\2\u01af\u01b2\3"+
		"\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b5\7\67\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\7\66\2\2\u01b7\u01b9\5\16\b\2\u01b8"+
		"\u019b\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd"+
		"\u01bf\7\67\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3"+
		"\2\2\2\u01c0\u01c1\7\32\2\2\u01c1\u01c2\7\67\2\2\u01c2\u01c4\7\31\2\2"+
		"\u01c3\u01c5\7\67\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7"+
		"\3\2\2\2\u01c6\u01c8\7\61\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2"+
		"\u01c8\u01ca\3\2\2\2\u01c9\u01cb\7\67\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\66\2\2\u01cd\27\3\2\2\2\u01ce"+
		"\u01dd\t\5\2\2\u01cf\u01d1\t\6\2\2\u01d0\u01d2\7\67\2\2\u01d1\u01d0\3"+
		"\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\7\f\2\2\u01d4"+
		"\u01d6\7\67\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3"+
		"\2\2\2\u01d7\u01d9\7\61\2\2\u01d8\u01da\7\67\2\2\u01d9\u01d8\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\7\r\2\2\u01dc\u01ce\3\2"+
		"\2\2\u01dc\u01cf\3\2\2\2\u01dd\31\3\2\2\2\u01de\u01e0\7\67\2\2\u01df\u01de"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\7\27\2\2"+
		"\u01e2\u01e3\7\67\2\2\u01e3\u01e5\7*\2\2\u01e4\u01e6\7\67\2\2\u01e5\u01e4"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01f1\3\2\2\2\u01e7\u01e9\7\67\2\2"+
		"\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec"+
		"\7\6\2\2\u01eb\u01ed\7\67\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2"+
		"\u01ed\u01ee\3\2\2\2\u01ee\u01f0\t\7\2\2\u01ef\u01e8\3\2\2\2\u01f0\u01f3"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f6\7\67\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7\b\2\2\u01f8\u01fa\7\b\2\2\u01f9"+
		"\u01fb\7\67\2\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3"+
		"\2\2\2\u01fc\u01fe\7\61\2\2\u01fd\u01ff\7\67\2\2\u01fe\u01fd\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\7\65\2\2\u0201\u0203\7"+
		"\67\2\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0206\7\61\2\2\u0205\u0207\7\67\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3"+
		"\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7\66\2\2\u0209\33\3\2\2\2\u020a"+
		"\u020c\7\67\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3"+
		"\2\2\2\u020d\u020e\7\27\2\2\u020e\u020f\7\67\2\2\u020f\u0210\7\31\2\2"+
		"\u0210\u0211\7\67\2\2\u0211\u0212\7\30\2\2\u0212\u0213\7\67\2\2\u0213"+
		"\u0215\7\61\2\2\u0214\u0216\7\67\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3"+
		"\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\7\66\2\2\u0218\35\3\2\2\2\u0219"+
		"\u021e\5 \21\2\u021a\u021b\7\67\2\2\u021b\u021d\5 \21\2\u021c\u021a\3"+
		"\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\37\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0225\7\t\2\2\u0222\u0224\n\3\2"+
		"\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0226\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u022b\7\n\2\2\u0229"+
		"\u022b\n\3\2\2\u022a\u0221\3\2\2\2\u022a\u0229\3\2\2\2\u022b!\3\2\2\2"+
		"\u022c\u022e\7\61\2\2\u022d\u022f\7\67\2\2\u022e\u022d\3\2\2\2\u022e\u022f"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\7\5\2\2\u0231\u0233\7\67\2\2"+
		"\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236"+
		"\7\62\2\2\u0235\u0237\7\67\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2\2\2"+
		"\u0237\u0238\3\2\2\2\u0238\u023a\7\6\2\2\u0239\u023b\7\67\2\2\u023a\u0239"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0247\7\62\2\2"+
		"\u023d\u023f\7\61\2\2\u023e\u0240\7\67\2\2\u023f\u023e\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\7\5\2\2\u0242\u0244\7\67\2\2"+
		"\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247"+
		"\5\36\20\2\u0246\u022c\3\2\2\2\u0246\u023d\3\2\2\2\u0247#\3\2\2\2\u0248"+
		"\u024b\5(\25\2\u0249\u024b\5&\24\2\u024a\u0248\3\2\2\2\u024a\u0249\3\2"+
		"\2\2\u024b%\3\2\2\2\u024c\u024e\7\67\2\2\u024d\u024c\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7\27\2\2\u0250\u0251\7\67\2\2"+
		"\u0251\u0253\7+\2\2\u0252\u0254\7\67\2\2\u0253\u0252\3\2\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\7\f\2\2\u0256\u0258\7\67\2\2"+
		"\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b"+
		"\5\66\34\2\u025a\u025c\7\67\2\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025f\7\r\2\2\u025e\u0260\7\67\2\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\5,"+
		"\27\2\u0262\'\3\2\2\2\u0263\u0265\7\67\2\2\u0264\u0263\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7\27\2\2\u0267\u0268\7\67\2\2"+
		"\u0268\u026a\7+\2\2\u0269\u026b\7\67\2\2\u026a\u0269\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\7\f\2\2\u026d\u026f\7\67\2\2"+
		"\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272"+
		"\5\66\34\2\u0271\u0273\7\67\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2"+
		"\2\u0273\u0274\3\2\2\2\u0274\u0276\7\r\2\2\u0275\u0277\7\67\2\2\u0276"+
		"\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\7,"+
		"\2\2\u0279\u027b\7\67\2\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\7\66\2\2\u027d\u0289\5*\26\2\u027e\u0280\7"+
		"\67\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\7\27\2\2\u0282\u0283\7\67\2\2\u0283\u0285\7-\2\2\u0284\u0286\7"+
		"\67\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\7\66\2\2\u0288\u028a\5*\26\2\u0289\u027f\3\2\2\2\u0289\u028a\3"+
		"\2\2\2\u028a\u028c\3\2\2\2\u028b\u028d\7\67\2\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\7\27\2\2\u028f\u0290\7"+
		"\67\2\2\u0290\u0291\7\32\2\2\u0291\u0292\7\67\2\2\u0292\u0294\7+\2\2\u0293"+
		"\u0295\7\67\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3"+
		"\2\2\2\u0296\u0297\7\66\2\2\u0297)\3\2\2\2\u0298\u02a2\5\n\6\2\u0299\u02a2"+
		"\5\b\5\2\u029a\u02a2\5\60\31\2\u029b\u02a2\5$\23\2\u029c\u02a2\5\16\b"+
		"\2\u029d\u02a2\5\24\13\2\u029e\u02a2\5\26\f\2\u029f\u02a2\5\62\32\2\u02a0"+
		"\u02a2\5,\27\2\u02a1\u0298\3\2\2\2\u02a1\u0299\3\2\2\2\u02a1\u029a\3\2"+
		"\2\2\u02a1\u029b\3\2\2\2\u02a1\u029c\3\2\2\2\u02a1\u029d\3\2\2\2\u02a1"+
		"\u029e\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4+\3\2\2\2\u02a5\u02a7"+
		"\7\67\2\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02ac\3\2\2\2"+
		"\u02a8\u02ab\5.\30\2\u02a9\u02ab\n\b\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02a9"+
		"\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad"+
		"\u02b1\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b2\7\66\2\2\u02b0\u02b2\5"+
		"\62\32\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2-\3\2\2\2\u02b3"+
		"\u02b4\7\13\2\2\u02b4\u02b6\7\t\2\2\u02b5\u02b7\7\67\2\2\u02b6\u02b5\3"+
		"\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\5\64\33\2\u02b9"+
		"\u02bb\7\67\2\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3"+
		"\2\2\2\u02bc\u02bd\7\n\2\2\u02bd/\3\2\2\2\u02be\u02c0\7\67\2\2\u02bf\u02be"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\7\27\2\2"+
		"\u02c2\u02c3\7\67\2\2\u02c3\u02c5\5\"\22\2\u02c4\u02c6\7\67\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7\66"+
		"\2\2\u02c8\61\3\2\2\2\u02c9\u02cb\7\67\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\7\22\2\2\u02cd\u02d2\n\t\2\2"+
		"\u02ce\u02d1\5.\30\2\u02cf\u02d1\n\3\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf"+
		"\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02d5\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\7\66\2\2\u02d6\63\3\2\2"+
		"\2\u02d7\u02d8\b\33\1\2\u02d8\u02da\7\f\2\2\u02d9\u02db\7\67\2\2\u02da"+
		"\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\5\64"+
		"\33\2\u02dd\u02df\7\67\2\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e1\7\r\2\2\u02e1\u02f3\3\2\2\2\u02e2\u02f3\7\62"+
		"\2\2\u02e3\u02e5\7\61\2\2\u02e4\u02e6\7\67\2\2\u02e5\u02e4\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\7\f\2\2\u02e8\u02ea\7\67"+
		"\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ed\5\64\33\2\u02ec\u02ee\7\67\2\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\7\r\2\2\u02f0\u02f3\3\2\2\2\u02f1"+
		"\u02f3\7\61\2\2\u02f2\u02d7\3\2\2\2\u02f2\u02e2\3\2\2\2\u02f2\u02e3\3"+
		"\2\2\2\u02f2\u02f1\3\2\2\2\u02f3\u0308\3\2\2\2\u02f4\u02f6\6\33\2\3\u02f5"+
		"\u02f7\7\67\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3"+
		"\2\2\2\u02f8\u02fa\t\n\2\2\u02f9\u02fb\7\67\2\2\u02fa\u02f9\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0307\5\64\33\2\u02fd\u02ff\6"+
		"\33\3\3\u02fe\u0300\7\67\2\2\u02ff\u02fe\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0303\t\13\2\2\u0302\u0304\7\67\2\2\u0303\u0302\3"+
		"\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\5\64\33\2\u0306"+
		"\u02f4\3\2\2\2\u0306\u02fd\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2"+
		"\2\2\u0308\u0309\3\2\2\2\u0309\65\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c"+
		"\b\34\1\2\u030c\u030e\7/\2\2\u030d\u030f\7\67\2\2\u030e\u030d\3\2\2\2"+
		"\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u031c\5\66\34\2\u0311\u0313"+
		"\5\64\33\2\u0312\u0314\7\67\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2"+
		"\2\u0314\u0315\3\2\2\2\u0315\u0317\t\f\2\2\u0316\u0318\7\67\2\2\u0317"+
		"\u0316\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\5\64"+
		"\33\2\u031a\u031c\3\2\2\2\u031b\u030b\3\2\2\2\u031b\u0311\3\2\2\2\u031c"+
		"\u0331\3\2\2\2\u031d\u031f\6\34\4\3\u031e\u0320\7\67\2\2\u031f\u031e\3"+
		"\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\7.\2\2\u0322"+
		"\u0324\7\67\2\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3"+
		"\2\2\2\u0325\u0330\5\66\34\2\u0326\u0328\6\34\5\3\u0327\u0329\7\67\2\2"+
		"\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c"+
		"\7\60\2\2\u032b\u032d\7\67\2\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2"+
		"\u032d\u032e\3\2\2\2\u032e\u0330\5\66\34\2\u032f\u031d\3\2\2\2\u032f\u0326"+
		"\3\2\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\67\3\2\2\2\u0333\u0331\3\2\2\2\u00b2:<@CFLRVZ]bflorux~\u0083\u0085\u0089"+
		"\u008d\u0090\u0093\u0096\u009c\u009f\u00a2\u00a5\u00ab\u00ae\u00b2\u00b5"+
		"\u00bd\u00c0\u00c6\u00cb\u00d3\u00d8\u00e2\u00e6\u00e8\u00f1\u00f6\u00f9"+
		"\u00ff\u0102\u0105\u010a\u010d\u0110\u0118\u011d\u0120\u0126\u0129\u012c"+
		"\u0131\u0135\u0138\u013c\u0141\u0145\u0149\u014c\u0152\u0157\u015a\u015e"+
		"\u0161\u0165\u0167\u016b\u0171\u0174\u0177\u017c\u0180\u0183\u0186\u0189"+
		"\u018d\u0191\u0195\u0197\u019b\u019e\u01a1\u01a7\u01ab\u01b0\u01b4\u01b8"+
		"\u01ba\u01be\u01c4\u01c7\u01ca\u01d1\u01d5\u01d9\u01dc\u01df\u01e5\u01e8"+
		"\u01ec\u01f1\u01f5\u01fa\u01fe\u0202\u0206\u020b\u0215\u021e\u0225\u022a"+
		"\u022e\u0232\u0236\u023a\u023f\u0243\u0246\u024a\u024d\u0253\u0257\u025b"+
		"\u025f\u0264\u026a\u026e\u0272\u0276\u027a\u027f\u0285\u0289\u028c\u0294"+
		"\u02a1\u02a3\u02a6\u02aa\u02ac\u02b1\u02b6\u02ba\u02bf\u02c5\u02ca\u02d0"+
		"\u02d2\u02da\u02de\u02e5\u02e9\u02ed\u02f2\u02f6\u02fa\u02ff\u0303\u0306"+
		"\u0308\u030e\u0313\u0317\u031b\u031f\u0323\u0328\u032c\u032f\u0331";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}