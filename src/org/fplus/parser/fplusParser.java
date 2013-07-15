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
		Assign=1, Comma=2, Semicolon=3, LeftBrace=4, RightBrace=5, Dollar=6, LeftParen=7, 
		RightParen=8, LeftBracket=9, RightBracket=10, Prefix=11, Template=12, 
		End=13, Do=14, Program=15, Module=16, Contains=17, Identifier=18, IntegerConstant=19, 
		StringLiteral=20, Newline=21, WS=22, Noise=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "','", "';'", "'{'", "'}'", "'$'", "'('", "')'", "'['", 
		"']'", "Prefix", "Template", "End", "Do", "Program", "Module", "Contains", 
		"Identifier", "IntegerConstant", "StringLiteral", "Newline", "WS", "Noise"
	};
	public static final int
		RULE_fortranFile = 0, RULE_programBlock = 1, RULE_moduleBlock = 2, RULE_templateBlock = 3, 
		RULE_loopBlock = 4, RULE_loopBegin = 5, RULE_list = 6, RULE_listItem = 7, 
		RULE_listAssignment = 8, RULE_contentBlock = 9, RULE_contentLine = 10, 
		RULE_placeholder = 11, RULE_variableDefinition = 12;
	public static final String[] ruleNames = {
		"fortranFile", "programBlock", "moduleBlock", "templateBlock", "loopBlock", 
		"loopBegin", "list", "listItem", "listAssignment", "contentBlock", "contentLine", 
		"placeholder", "variableDefinition"
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
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(26); contentBlock();
				}
				break;
			}
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(29); moduleBlock();
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(36);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35); programBlock();
				}
				break;
			}
			setState(39);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << Comma) | (1L << Semicolon) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Dollar) | (1L << LeftParen) | (1L << RightParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << Prefix) | (1L << Template) | (1L << End) | (1L << Do) | (1L << Program) | (1L << Module) | (1L << Contains) | (1L << Identifier) | (1L << IntegerConstant) | (1L << StringLiteral) | (1L << Newline) | (1L << WS) | (1L << Noise))) != 0)) {
				{
				setState(38); contentBlock();
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
			setState(42);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(41); match(WS);
				}
			}

			setState(44); match(Program);
			setState(45); match(WS);
			setState(46); match(Identifier);
			setState(48);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(47); match(WS);
				}
			}

			setState(50); match(Newline);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(51); contentBlock();
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(58);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(57); match(WS);
				}
			}

			setState(60); match(End);
			setState(61); match(WS);
			setState(62); match(Program);
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(63); match(WS);
				}
				break;
			}
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(66); match(Identifier);
				}
				break;
			}
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(69); match(WS);
				}
				break;
			}
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(72); match(Newline);
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
		public List<TerminalNode> Newline() { return getTokens(fplusParser.Newline); }
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public TerminalNode Module(int i) {
			return getToken(fplusParser.Module, i);
		}
		public TerminalNode Newline(int i) {
			return getToken(fplusParser.Newline, i);
		}
		public TerminalNode End() { return getToken(fplusParser.End, 0); }
		public TerminalNode Contains() { return getToken(fplusParser.Contains, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public List<TerminalNode> Module() { return getTokens(fplusParser.Module); }
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(75); match(WS);
				}
			}

			setState(78); match(Module);
			setState(79); match(WS);
			setState(80); match(Identifier);
			setState(82);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(81); match(WS);
				}
			}

			setState(84); match(Newline);
			setState(86);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(85); match(WS);
				}
			}

			setState(88); match(Contains);
			setState(90);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(89); match(WS);
				}
			}

			setState(92); match(Newline);
			setState(94);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(93); match(WS);
				}
			}

			setState(96); match(End);
			setState(97); match(WS);
			setState(98); match(Module);
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(99); match(WS);
				}
				break;
			}
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(102); match(Identifier);
				}
				break;
			}
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(105); match(Newline);
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
		public TerminalNode Template(int i) {
			return getToken(fplusParser.Template, i);
		}
		public List<TerminalNode> WS() { return getTokens(fplusParser.WS); }
		public List<TerminalNode> Template() { return getTokens(fplusParser.Template); }
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(fplusParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(fplusParser.Identifier, i);
		}
		public TerminalNode WS(int i) {
			return getToken(fplusParser.WS, i);
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
		public List<LoopBlockContext> loopBlock() {
			return getRuleContexts(LoopBlockContext.class);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(108); match(WS);
				}
			}

			setState(111); match(Prefix);
			setState(112); match(WS);
			setState(113); match(Template);
			setState(115);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(114); match(WS);
				}
			}

			setState(118);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(117); match(Identifier);
				}
			}

			setState(120); match(Newline);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(121); loopBlock();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(128);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(127); match(WS);
				}
			}

			setState(130); match(Prefix);
			setState(131); match(WS);
			setState(132); match(End);
			setState(133); match(WS);
			setState(134); match(Template);
			setState(136);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(135); match(WS);
				}
			}

			setState(139);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(138); match(Identifier);
				}
			}

			setState(141); match(Newline);
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
			setState(143); loopBegin();
			setState(145);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(144); match(WS);
				}
			}

			setState(147); match(Newline);
			setState(148); contentBlock();
			setState(150);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(149); match(WS);
				}
			}

			setState(152); match(Prefix);
			setState(153); match(WS);
			setState(154); match(End);
			setState(155); match(WS);
			setState(156); match(Do);
			setState(158);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(157); match(WS);
				}
			}

			setState(160); match(Newline);
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
			setState(163);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(162); match(WS);
				}
			}

			setState(165); match(Prefix);
			setState(166); match(WS);
			setState(167); match(Do);
			setState(168); match(WS);
			setState(169); listAssignment();
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
		enterRule(_localctx, 12, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171); listItem();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(172); match(WS);
					setState(173); listItem();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 14, RULE_listItem);
		int _la;
		try {
			int _alt;
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(LeftBrace);
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(180);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Newline) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(186); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
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
		enterRule(_localctx, 16, RULE_listAssignment);
		int _la;
		try {
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190); match(Identifier);
				setState(192);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(191); match(WS);
					}
				}

				setState(194); match(Assign);
				setState(196);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(195); match(WS);
					}
				}

				setState(198); match(IntegerConstant);
				setState(200);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(199); match(WS);
					}
				}

				setState(202); match(Comma);
				setState(204);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(203); match(WS);
					}
				}

				setState(206); match(IntegerConstant);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); match(Identifier);
				setState(209);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(208); match(WS);
					}
				}

				setState(211); match(Assign);
				setState(213);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(212); match(WS);
					}
					break;
				}
				setState(215); list();
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
		public ContentLineContext contentLine(int i) {
			return getRuleContext(ContentLineContext.class,i);
		}
		public LoopBlockContext loopBlock(int i) {
			return getRuleContext(LoopBlockContext.class,i);
		}
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
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
		enterRule(_localctx, 18, RULE_contentBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(221);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(218); loopBlock();
						}
						break;

					case 2:
						{
						setState(219); variableDefinition();
						}
						break;

					case 3:
						{
						setState(220); contentLine();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public TerminalNode Prefix(int i) {
			return getToken(fplusParser.Prefix, i);
		}
		public List<TerminalNode> Prefix() { return getTokens(fplusParser.Prefix); }
		public PlaceholderContext placeholder(int i) {
			return getRuleContext(PlaceholderContext.class,i);
		}
		public List<PlaceholderContext> placeholder() {
			return getRuleContexts(PlaceholderContext.class);
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
		enterRule(_localctx, 20, RULE_contentLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(227);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(225); placeholder();
						}
						break;

					case 2:
						{
						setState(226);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==Prefix) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(232); match(Newline);
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
		enterRule(_localctx, 22, RULE_placeholder);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234); match(Dollar);
				setState(235); match(LeftBrace);
				setState(236); match(Identifier);
				setState(237); match(RightBrace);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); match(Dollar);
				setState(239); match(LeftBrace);
				setState(240); match(Identifier);
				setState(241); match(LeftParen);
				setState(242); match(Identifier);
				setState(243); match(RightParen);
				setState(244); match(RightBrace);
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
		enterRule(_localctx, 24, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(247); match(WS);
				}
			}

			setState(250); match(Prefix);
			setState(251); match(WS);
			setState(252); listAssignment();
			setState(254);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(253); match(WS);
				}
			}

			setState(256); match(Newline);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\31\u0105\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\7\2!\n\2\f\2\16\2$"+
		"\13\2\3\2\5\2\'\n\2\3\2\5\2*\n\2\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\5\3=\n\3\3\3\3\3\3\3\3\3\5\3"+
		"C\n\3\3\3\5\3F\n\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\4\5\4O\n\4\3\4\3\4\3\4"+
		"\3\4\5\4U\n\4\3\4\3\4\5\4Y\n\4\3\4\3\4\5\4]\n\4\3\4\3\4\5\4a\n\4\3\4\3"+
		"\4\3\4\3\4\5\4g\n\4\3\4\5\4j\n\4\3\4\5\4m\n\4\3\5\5\5p\n\5\3\5\3\5\3\5"+
		"\3\5\5\5v\n\5\3\5\5\5y\n\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\5"+
		"\5\u0083\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008b\n\5\3\5\5\5\u008e\n\5\3"+
		"\5\3\5\3\6\3\6\5\6\u0094\n\6\3\6\3\6\3\6\5\6\u0099\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00a1\n\6\3\6\3\6\3\7\5\7\u00a6\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\7\b\u00b1\n\b\f\b\16\b\u00b4\13\b\3\t\3\t\7\t\u00b8\n\t"+
		"\f\t\16\t\u00bb\13\t\3\t\3\t\5\t\u00bf\n\t\3\n\3\n\5\n\u00c3\n\n\3\n\3"+
		"\n\5\n\u00c7\n\n\3\n\3\n\5\n\u00cb\n\n\3\n\3\n\5\n\u00cf\n\n\3\n\3\n\3"+
		"\n\5\n\u00d4\n\n\3\n\3\n\5\n\u00d8\n\n\3\n\5\n\u00db\n\n\3\13\3\13\3\13"+
		"\6\13\u00e0\n\13\r\13\16\13\u00e1\3\f\3\f\7\f\u00e6\n\f\f\f\16\f\u00e9"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f8\n"+
		"\r\3\16\5\16\u00fb\n\16\3\16\3\16\3\16\3\16\5\16\u0101\n\16\3\16\3\16"+
		"\3\16\4\u00b9\u00e7\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\27\27"+
		"\3\2\r\r\u0128\2\35\3\2\2\2\4,\3\2\2\2\6N\3\2\2\2\bo\3\2\2\2\n\u0091\3"+
		"\2\2\2\f\u00a5\3\2\2\2\16\u00ad\3\2\2\2\20\u00be\3\2\2\2\22\u00da\3\2"+
		"\2\2\24\u00df\3\2\2\2\26\u00e7\3\2\2\2\30\u00f7\3\2\2\2\32\u00fa\3\2\2"+
		"\2\34\36\5\24\13\2\35\34\3\2\2\2\35\36\3\2\2\2\36\"\3\2\2\2\37!\5\6\4"+
		"\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2\2%\'"+
		"\5\4\3\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(*\5\24\13\2)(\3\2\2\2)*\3\2\2"+
		"\2*\3\3\2\2\2+-\7\30\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\7\21\2\2/\60"+
		"\7\30\2\2\60\62\7\24\2\2\61\63\7\30\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63"+
		"\64\3\2\2\2\648\7\27\2\2\65\67\5\24\13\2\66\65\3\2\2\2\67:\3\2\2\28\66"+
		"\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;=\7\30\2\2<;\3\2\2\2<=\3\2\2\2"+
		"=>\3\2\2\2>?\7\17\2\2?@\7\30\2\2@B\7\21\2\2AC\7\30\2\2BA\3\2\2\2BC\3\2"+
		"\2\2CE\3\2\2\2DF\7\24\2\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\7\30\2\2HG\3"+
		"\2\2\2HI\3\2\2\2IK\3\2\2\2JL\7\27\2\2KJ\3\2\2\2KL\3\2\2\2L\5\3\2\2\2M"+
		"O\7\30\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\22\2\2QR\7\30\2\2RT\7\24"+
		"\2\2SU\7\30\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7\27\2\2WY\7\30\2\2XW"+
		"\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\23\2\2[]\7\30\2\2\\[\3\2\2\2\\]\3\2"+
		"\2\2]^\3\2\2\2^`\7\27\2\2_a\7\30\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7"+
		"\17\2\2cd\7\30\2\2df\7\22\2\2eg\7\30\2\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2"+
		"hj\7\24\2\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2km\7\27\2\2lk\3\2\2\2lm\3\2\2"+
		"\2m\7\3\2\2\2np\7\30\2\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\r\2\2rs\7\30"+
		"\2\2su\7\16\2\2tv\7\30\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\7\24\2\2xw"+
		"\3\2\2\2xy\3\2\2\2yz\3\2\2\2z~\7\27\2\2{}\5\n\6\2|{\3\2\2\2}\u0080\3\2"+
		"\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081\u0083"+
		"\7\30\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0085\7\r\2\2\u0085\u0086\7\30\2\2\u0086\u0087\7\17\2\2\u0087\u0088"+
		"\7\30\2\2\u0088\u008a\7\16\2\2\u0089\u008b\7\30\2\2\u008a\u0089\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\7\24\2\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\27"+
		"\2\2\u0090\t\3\2\2\2\u0091\u0093\5\f\7\2\u0092\u0094\7\30\2\2\u0093\u0092"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\27\2\2"+
		"\u0096\u0098\5\24\13\2\u0097\u0099\7\30\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\r\2\2\u009b\u009c\7\30"+
		"\2\2\u009c\u009d\7\17\2\2\u009d\u009e\7\30\2\2\u009e\u00a0\7\20\2\2\u009f"+
		"\u00a1\7\30\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\13\3\2\2\2\u00a4\u00a6\7\30\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\r"+
		"\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\7\30\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\r\3\2\2\2\u00ad\u00b2\5\20\t\2\u00ae\u00af\7\30"+
		"\2\2\u00af\u00b1\5\20\t\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b5\u00b9\7\6\2\2\u00b6\u00b8\n\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bf\7\7\2\2\u00bd\u00bf\n\2\2\2\u00be\u00b5\3\2"+
		"\2\2\u00be\u00bd\3\2\2\2\u00bf\21\3\2\2\2\u00c0\u00c2\7\24\2\2\u00c1\u00c3"+
		"\7\30\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c6\7\3\2\2\u00c5\u00c7\7\30\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\7\25\2\2\u00c9\u00cb\7\30\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce"+
		"\7\4\2\2\u00cd\u00cf\7\30\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00db\7\25\2\2\u00d1\u00d3\7\24\2\2\u00d2\u00d4"+
		"\7\30\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d7\7\3\2\2\u00d6\u00d8\7\30\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\5\16\b\2\u00da\u00c0\3\2\2\2"+
		"\u00da\u00d1\3\2\2\2\u00db\23\3\2\2\2\u00dc\u00e0\5\n\6\2\u00dd\u00e0"+
		"\5\32\16\2\u00de\u00e0\5\26\f\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e6\5\30\r\2\u00e4\u00e6\n\3\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7\27\2\2\u00eb\27\3\2\2\2\u00ec\u00ed\7\b\2\2\u00ed\u00ee\7\6\2"+
		"\2\u00ee\u00ef\7\24\2\2\u00ef\u00f8\7\7\2\2\u00f0\u00f1\7\b\2\2\u00f1"+
		"\u00f2\7\6\2\2\u00f2\u00f3\7\24\2\2\u00f3\u00f4\7\t\2\2\u00f4\u00f5\7"+
		"\24\2\2\u00f5\u00f6\7\n\2\2\u00f6\u00f8\7\7\2\2\u00f7\u00ec\3\2\2\2\u00f7"+
		"\u00f0\3\2\2\2\u00f8\31\3\2\2\2\u00f9\u00fb\7\30\2\2\u00fa\u00f9\3\2\2"+
		"\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\r\2\2\u00fd\u00fe"+
		"\7\30\2\2\u00fe\u0100\5\22\n\2\u00ff\u0101\7\30\2\2\u0100\u00ff\3\2\2"+
		"\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\27\2\2\u0103"+
		"\33\3\2\2\2\62\35\"&),\628<BEHKNTX\\`filoux~\u0082\u008a\u008d\u0093\u0098"+
		"\u00a0\u00a5\u00b2\u00b9\u00be\u00c2\u00c6\u00ca\u00ce\u00d3\u00d7\u00da"+
		"\u00df\u00e1\u00e5\u00e7\u00f7\u00fa\u0100";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}