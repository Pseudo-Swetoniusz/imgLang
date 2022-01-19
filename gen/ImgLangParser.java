// Generated from C:/Users/jbtok/Desktop/studia_szkola/studia/semestr5/MiAK/imgLang\ImgLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImgLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NUMBER=27, NUMBER_WS=28, DOUBLE=29, WS=30, ID=31, 
		LETTER=32;
	public static final int
		RULE_imgBlock = 0, RULE_block = 1, RULE_back_block = 2, RULE_back_param = 3, 
		RULE_width_sub = 4, RULE_height_sub = 5, RULE_layer_block = 6, RULE_layer_param = 7, 
		RULE_trans_block = 8, RULE_trans_param = 9, RULE_rotate_sub = 10, RULE_scale_sub = 11, 
		RULE_color_sub = 12, RULE_opacity_sub = 13, RULE_rgb_val = 14, RULE_shapes_block = 15, 
		RULE_shape_block = 16, RULE_position_sub = 17, RULE_position_val = 18, 
		RULE_priority_sub = 19, RULE_rect_block = 20, RULE_circ_block = 21, RULE_poly_block = 22, 
		RULE_rect_param = 23, RULE_circ_param = 24, RULE_poly_param = 25, RULE_radius_sub = 26, 
		RULE_vertex_sub = 27, RULE_vertex_list = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"imgBlock", "block", "back_block", "back_param", "width_sub", "height_sub", 
			"layer_block", "layer_param", "trans_block", "trans_param", "rotate_sub", 
			"scale_sub", "color_sub", "opacity_sub", "rgb_val", "shapes_block", "shape_block", 
			"position_sub", "position_val", "priority_sub", "rect_block", "circ_block", 
			"poly_block", "rect_param", "circ_param", "poly_param", "radius_sub", 
			"vertex_sub", "vertex_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'image'", "':'", "'\n'", "'background'", "'width'", "'height'", 
			"'layer'", "'transformations'", "'rotate'", "'scale'", "'color'", "'opacity'", 
			"'rgb'", "'('", "','", "')'", "'shapes'", "'position'", "'priority'", 
			"'rectangle'", "'circle'", "'polygon'", "'radius'", "'vertexes'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUMBER", "NUMBER_WS", "DOUBLE", "WS", "ID", "LETTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ImgLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImgLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ImgBlockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ImgLangParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ImgBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterImgBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitImgBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitImgBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgBlockContext imgBlock() throws RecognitionException {
		ImgBlockContext _localctx = new ImgBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_imgBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			match(ID);
			setState(60);
			match(T__1);
			setState(61);
			match(T__2);
			setState(62);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public Back_blockContext back_block() {
			return getRuleContext(Back_blockContext.class,0);
		}
		public List<Layer_blockContext> layer_block() {
			return getRuleContexts(Layer_blockContext.class);
		}
		public Layer_blockContext layer_block(int i) {
			return getRuleContext(Layer_blockContext.class,i);
		}
		public Trans_blockContext trans_block() {
			return getRuleContext(Trans_blockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			back_block();
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					match(T__2);
					setState(66);
					layer_block();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(72);
				match(T__2);
				setState(73);
				trans_block();
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

	public static class Back_blockContext extends ParserRuleContext {
		public Back_paramContext back_param() {
			return getRuleContext(Back_paramContext.class,0);
		}
		public Back_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterBack_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitBack_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitBack_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Back_blockContext back_block() throws RecognitionException {
		Back_blockContext _localctx = new Back_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_back_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__3);
			setState(77);
			match(T__1);
			setState(78);
			match(T__2);
			setState(79);
			back_param();
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

	public static class Back_paramContext extends ParserRuleContext {
		public Width_subContext width_sub() {
			return getRuleContext(Width_subContext.class,0);
		}
		public Height_subContext height_sub() {
			return getRuleContext(Height_subContext.class,0);
		}
		public Color_subContext color_sub() {
			return getRuleContext(Color_subContext.class,0);
		}
		public Opacity_subContext opacity_sub() {
			return getRuleContext(Opacity_subContext.class,0);
		}
		public Back_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterBack_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitBack_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitBack_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Back_paramContext back_param() throws RecognitionException {
		Back_paramContext _localctx = new Back_paramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_back_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			width_sub();
			setState(82);
			match(T__2);
			setState(83);
			height_sub();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(84);
				match(T__2);
				setState(85);
				color_sub();
				}
				break;
			}
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(88);
				match(T__2);
				setState(89);
				opacity_sub();
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

	public static class Width_subContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ImgLangParser.NUMBER, 0); }
		public Width_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterWidth_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitWidth_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitWidth_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Width_subContext width_sub() throws RecognitionException {
		Width_subContext _localctx = new Width_subContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_width_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__4);
			setState(93);
			match(T__1);
			setState(94);
			match(NUMBER);
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

	public static class Height_subContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ImgLangParser.NUMBER, 0); }
		public Height_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterHeight_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitHeight_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitHeight_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Height_subContext height_sub() throws RecognitionException {
		Height_subContext _localctx = new Height_subContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_height_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__5);
			setState(97);
			match(T__1);
			setState(98);
			match(NUMBER);
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

	public static class Layer_blockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ImgLangParser.ID, 0); }
		public Layer_paramContext layer_param() {
			return getRuleContext(Layer_paramContext.class,0);
		}
		public Shapes_blockContext shapes_block() {
			return getRuleContext(Shapes_blockContext.class,0);
		}
		public Layer_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterLayer_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitLayer_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitLayer_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Layer_blockContext layer_block() throws RecognitionException {
		Layer_blockContext _localctx = new Layer_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_layer_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__6);
			setState(101);
			match(ID);
			setState(102);
			match(T__1);
			setState(103);
			match(T__2);
			setState(104);
			layer_param();
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(105);
				match(T__2);
				setState(106);
				shapes_block();
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

	public static class Layer_paramContext extends ParserRuleContext {
		public Width_subContext width_sub() {
			return getRuleContext(Width_subContext.class,0);
		}
		public Height_subContext height_sub() {
			return getRuleContext(Height_subContext.class,0);
		}
		public Position_subContext position_sub() {
			return getRuleContext(Position_subContext.class,0);
		}
		public Priority_subContext priority_sub() {
			return getRuleContext(Priority_subContext.class,0);
		}
		public Layer_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterLayer_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitLayer_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitLayer_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Layer_paramContext layer_param() throws RecognitionException {
		Layer_paramContext _localctx = new Layer_paramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_layer_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			width_sub();
			setState(110);
			match(T__2);
			setState(111);
			height_sub();
			setState(112);
			match(T__2);
			setState(113);
			position_sub();
			setState(114);
			match(T__2);
			setState(115);
			priority_sub();
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

	public static class Trans_blockContext extends ParserRuleContext {
		public Trans_paramContext trans_param() {
			return getRuleContext(Trans_paramContext.class,0);
		}
		public Trans_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterTrans_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitTrans_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitTrans_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trans_blockContext trans_block() throws RecognitionException {
		Trans_blockContext _localctx = new Trans_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_trans_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__7);
			setState(118);
			match(T__1);
			setState(119);
			trans_param();
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

	public static class Trans_paramContext extends ParserRuleContext {
		public Rotate_subContext rotate_sub() {
			return getRuleContext(Rotate_subContext.class,0);
		}
		public Scale_subContext scale_sub() {
			return getRuleContext(Scale_subContext.class,0);
		}
		public Trans_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterTrans_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitTrans_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitTrans_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trans_paramContext trans_param() throws RecognitionException {
		Trans_paramContext _localctx = new Trans_paramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_trans_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(121);
				match(T__2);
				setState(122);
				rotate_sub();
				}
				break;
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(125);
				match(T__2);
				setState(126);
				scale_sub();
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

	public static class Rotate_subContext extends ParserRuleContext {
		public TerminalNode NUMBER_WS() { return getToken(ImgLangParser.NUMBER_WS, 0); }
		public TerminalNode NUMBER() { return getToken(ImgLangParser.NUMBER, 0); }
		public Rotate_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterRotate_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitRotate_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitRotate_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rotate_subContext rotate_sub() throws RecognitionException {
		Rotate_subContext _localctx = new Rotate_subContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rotate_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__8);
			setState(130);
			match(T__1);
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NUMBER_WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Scale_subContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(ImgLangParser.DOUBLE, 0); }
		public Scale_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterScale_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitScale_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitScale_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scale_subContext scale_sub() throws RecognitionException {
		Scale_subContext _localctx = new Scale_subContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scale_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__9);
			setState(134);
			match(T__1);
			setState(135);
			match(DOUBLE);
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

	public static class Color_subContext extends ParserRuleContext {
		public Rgb_valContext rgb_val() {
			return getRuleContext(Rgb_valContext.class,0);
		}
		public Color_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterColor_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitColor_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitColor_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Color_subContext color_sub() throws RecognitionException {
		Color_subContext _localctx = new Color_subContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_color_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__10);
			setState(138);
			match(T__1);
			setState(139);
			rgb_val();
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

	public static class Opacity_subContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(ImgLangParser.DOUBLE, 0); }
		public Opacity_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opacity_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterOpacity_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitOpacity_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitOpacity_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opacity_subContext opacity_sub() throws RecognitionException {
		Opacity_subContext _localctx = new Opacity_subContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_opacity_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__11);
			setState(142);
			match(T__1);
			setState(143);
			match(DOUBLE);
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

	public static class Rgb_valContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ImgLangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ImgLangParser.NUMBER, i);
		}
		public Rgb_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgb_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterRgb_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitRgb_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitRgb_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rgb_valContext rgb_val() throws RecognitionException {
		Rgb_valContext _localctx = new Rgb_valContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rgb_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__12);
			setState(146);
			match(T__13);
			setState(147);
			match(NUMBER);
			setState(148);
			match(T__14);
			setState(149);
			match(NUMBER);
			setState(150);
			match(T__14);
			setState(151);
			match(NUMBER);
			setState(152);
			match(T__15);
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

	public static class Shapes_blockContext extends ParserRuleContext {
		public List<Shape_blockContext> shape_block() {
			return getRuleContexts(Shape_blockContext.class);
		}
		public Shape_blockContext shape_block(int i) {
			return getRuleContext(Shape_blockContext.class,i);
		}
		public Shapes_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapes_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterShapes_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitShapes_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitShapes_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shapes_blockContext shapes_block() throws RecognitionException {
		Shapes_blockContext _localctx = new Shapes_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shapes_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__16);
			setState(155);
			match(T__1);
			setState(157); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					shape_block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Shape_blockContext extends ParserRuleContext {
		public Rect_blockContext rect_block() {
			return getRuleContext(Rect_blockContext.class,0);
		}
		public Circ_blockContext circ_block() {
			return getRuleContext(Circ_blockContext.class,0);
		}
		public Poly_blockContext poly_block() {
			return getRuleContext(Poly_blockContext.class,0);
		}
		public Shape_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterShape_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitShape_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitShape_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shape_blockContext shape_block() throws RecognitionException {
		Shape_blockContext _localctx = new Shape_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shape_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(161);
				match(T__2);
				setState(162);
				rect_block();
				}
				break;
			case 2:
				{
				setState(163);
				match(T__2);
				setState(164);
				circ_block();
				}
				break;
			case 3:
				{
				setState(165);
				match(T__2);
				setState(166);
				poly_block();
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

	public static class Position_subContext extends ParserRuleContext {
		public Position_valContext position_val() {
			return getRuleContext(Position_valContext.class,0);
		}
		public Position_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterPosition_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitPosition_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitPosition_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Position_subContext position_sub() throws RecognitionException {
		Position_subContext _localctx = new Position_subContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_position_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__17);
			setState(170);
			match(T__1);
			setState(171);
			position_val();
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

	public static class Position_valContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ImgLangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ImgLangParser.NUMBER, i);
		}
		public Position_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterPosition_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitPosition_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitPosition_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Position_valContext position_val() throws RecognitionException {
		Position_valContext _localctx = new Position_valContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_position_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__13);
			setState(174);
			match(NUMBER);
			setState(175);
			match(T__14);
			setState(176);
			match(NUMBER);
			setState(177);
			match(T__15);
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

	public static class Priority_subContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ImgLangParser.NUMBER, 0); }
		public Priority_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterPriority_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitPriority_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitPriority_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Priority_subContext priority_sub() throws RecognitionException {
		Priority_subContext _localctx = new Priority_subContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_priority_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__18);
			setState(180);
			match(T__1);
			setState(181);
			match(NUMBER);
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

	public static class Rect_blockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ImgLangParser.ID, 0); }
		public Rect_paramContext rect_param() {
			return getRuleContext(Rect_paramContext.class,0);
		}
		public Rect_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rect_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterRect_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitRect_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitRect_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rect_blockContext rect_block() throws RecognitionException {
		Rect_blockContext _localctx = new Rect_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rect_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__19);
			setState(184);
			match(ID);
			setState(185);
			match(T__1);
			setState(186);
			match(T__2);
			setState(187);
			rect_param();
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

	public static class Circ_blockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ImgLangParser.ID, 0); }
		public Circ_paramContext circ_param() {
			return getRuleContext(Circ_paramContext.class,0);
		}
		public Circ_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circ_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterCirc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitCirc_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitCirc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Circ_blockContext circ_block() throws RecognitionException {
		Circ_blockContext _localctx = new Circ_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_circ_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__20);
			setState(190);
			match(ID);
			setState(191);
			match(T__1);
			setState(192);
			match(T__2);
			setState(193);
			circ_param();
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

	public static class Poly_blockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ImgLangParser.ID, 0); }
		public Poly_paramContext poly_param() {
			return getRuleContext(Poly_paramContext.class,0);
		}
		public Poly_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poly_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterPoly_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitPoly_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitPoly_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Poly_blockContext poly_block() throws RecognitionException {
		Poly_blockContext _localctx = new Poly_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_poly_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__21);
			setState(196);
			match(ID);
			setState(197);
			match(T__1);
			setState(198);
			match(T__2);
			setState(199);
			poly_param();
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

	public static class Rect_paramContext extends ParserRuleContext {
		public Width_subContext width_sub() {
			return getRuleContext(Width_subContext.class,0);
		}
		public Height_subContext height_sub() {
			return getRuleContext(Height_subContext.class,0);
		}
		public Position_subContext position_sub() {
			return getRuleContext(Position_subContext.class,0);
		}
		public Priority_subContext priority_sub() {
			return getRuleContext(Priority_subContext.class,0);
		}
		public Opacity_subContext opacity_sub() {
			return getRuleContext(Opacity_subContext.class,0);
		}
		public Color_subContext color_sub() {
			return getRuleContext(Color_subContext.class,0);
		}
		public Rect_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rect_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterRect_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitRect_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitRect_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rect_paramContext rect_param() throws RecognitionException {
		Rect_paramContext _localctx = new Rect_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rect_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			width_sub();
			setState(202);
			match(T__2);
			setState(203);
			height_sub();
			setState(204);
			match(T__2);
			setState(205);
			position_sub();
			setState(206);
			match(T__2);
			setState(207);
			priority_sub();
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(208);
				match(T__2);
				setState(209);
				color_sub();
				}
				break;
			}
			{
			setState(212);
			match(T__2);
			setState(213);
			opacity_sub();
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

	public static class Circ_paramContext extends ParserRuleContext {
		public Radius_subContext radius_sub() {
			return getRuleContext(Radius_subContext.class,0);
		}
		public Position_subContext position_sub() {
			return getRuleContext(Position_subContext.class,0);
		}
		public Priority_subContext priority_sub() {
			return getRuleContext(Priority_subContext.class,0);
		}
		public Opacity_subContext opacity_sub() {
			return getRuleContext(Opacity_subContext.class,0);
		}
		public Color_subContext color_sub() {
			return getRuleContext(Color_subContext.class,0);
		}
		public Circ_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circ_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterCirc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitCirc_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitCirc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Circ_paramContext circ_param() throws RecognitionException {
		Circ_paramContext _localctx = new Circ_paramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_circ_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			radius_sub();
			setState(216);
			match(T__2);
			setState(217);
			position_sub();
			setState(218);
			match(T__2);
			setState(219);
			priority_sub();
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(220);
				match(T__2);
				setState(221);
				color_sub();
				}
				break;
			}
			{
			setState(224);
			match(T__2);
			setState(225);
			opacity_sub();
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

	public static class Poly_paramContext extends ParserRuleContext {
		public Vertex_subContext vertex_sub() {
			return getRuleContext(Vertex_subContext.class,0);
		}
		public Position_subContext position_sub() {
			return getRuleContext(Position_subContext.class,0);
		}
		public Priority_subContext priority_sub() {
			return getRuleContext(Priority_subContext.class,0);
		}
		public Opacity_subContext opacity_sub() {
			return getRuleContext(Opacity_subContext.class,0);
		}
		public Color_subContext color_sub() {
			return getRuleContext(Color_subContext.class,0);
		}
		public Poly_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poly_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterPoly_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitPoly_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitPoly_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Poly_paramContext poly_param() throws RecognitionException {
		Poly_paramContext _localctx = new Poly_paramContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_poly_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			vertex_sub();
			setState(228);
			match(T__2);
			setState(229);
			position_sub();
			setState(230);
			match(T__2);
			setState(231);
			priority_sub();
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(232);
				match(T__2);
				setState(233);
				color_sub();
				}
				break;
			}
			{
			setState(236);
			match(T__2);
			setState(237);
			opacity_sub();
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

	public static class Radius_subContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ImgLangParser.NUMBER, 0); }
		public Radius_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radius_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterRadius_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitRadius_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitRadius_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Radius_subContext radius_sub() throws RecognitionException {
		Radius_subContext _localctx = new Radius_subContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_radius_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__22);
			setState(240);
			match(T__1);
			setState(241);
			match(NUMBER);
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

	public static class Vertex_subContext extends ParserRuleContext {
		public Vertex_listContext vertex_list() {
			return getRuleContext(Vertex_listContext.class,0);
		}
		public Vertex_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterVertex_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitVertex_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitVertex_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vertex_subContext vertex_sub() throws RecognitionException {
		Vertex_subContext _localctx = new Vertex_subContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_vertex_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__23);
			setState(244);
			match(T__1);
			setState(245);
			vertex_list();
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

	public static class Vertex_listContext extends ParserRuleContext {
		public List<Position_valContext> position_val() {
			return getRuleContexts(Position_valContext.class);
		}
		public Position_valContext position_val(int i) {
			return getRuleContext(Position_valContext.class,i);
		}
		public Vertex_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).enterVertex_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgLangListener ) ((ImgLangListener)listener).exitVertex_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgLangVisitor ) return ((ImgLangVisitor<? extends T>)visitor).visitVertex_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vertex_listContext vertex_list() throws RecognitionException {
		Vertex_listContext _localctx = new Vertex_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_vertex_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__24);
			setState(248);
			position_val();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(249);
				match(T__14);
				setState(250);
				position_val();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			match(T__25);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13~\n\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\6"+
		"\21\u00a0\n\21\r\21\16\21\u00a1\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00aa"+
		"\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00d5\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00e1\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00ed"+
		"\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\7\36\u00fe\n\36\f\36\16\36\u0101\13\36\3\36\3\36\3\36\2\2\37"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\3\2"+
		"\35\36\2\u00f5\2<\3\2\2\2\4B\3\2\2\2\6N\3\2\2\2\bS\3\2\2\2\n^\3\2\2\2"+
		"\fb\3\2\2\2\16f\3\2\2\2\20o\3\2\2\2\22w\3\2\2\2\24}\3\2\2\2\26\u0083\3"+
		"\2\2\2\30\u0087\3\2\2\2\32\u008b\3\2\2\2\34\u008f\3\2\2\2\36\u0093\3\2"+
		"\2\2 \u009c\3\2\2\2\"\u00a9\3\2\2\2$\u00ab\3\2\2\2&\u00af\3\2\2\2(\u00b5"+
		"\3\2\2\2*\u00b9\3\2\2\2,\u00bf\3\2\2\2.\u00c5\3\2\2\2\60\u00cb\3\2\2\2"+
		"\62\u00d9\3\2\2\2\64\u00e5\3\2\2\2\66\u00f1\3\2\2\28\u00f5\3\2\2\2:\u00f9"+
		"\3\2\2\2<=\7\3\2\2=>\7!\2\2>?\7\4\2\2?@\7\5\2\2@A\5\4\3\2A\3\3\2\2\2B"+
		"G\5\6\4\2CD\7\5\2\2DF\5\16\b\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2"+
		"HL\3\2\2\2IG\3\2\2\2JK\7\5\2\2KM\5\22\n\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2"+
		"\2NO\7\6\2\2OP\7\4\2\2PQ\7\5\2\2QR\5\b\5\2R\7\3\2\2\2ST\5\n\6\2TU\7\5"+
		"\2\2UX\5\f\7\2VW\7\5\2\2WY\5\32\16\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2Z["+
		"\7\5\2\2[]\5\34\17\2\\Z\3\2\2\2\\]\3\2\2\2]\t\3\2\2\2^_\7\7\2\2_`\7\4"+
		"\2\2`a\7\35\2\2a\13\3\2\2\2bc\7\b\2\2cd\7\4\2\2de\7\35\2\2e\r\3\2\2\2"+
		"fg\7\t\2\2gh\7!\2\2hi\7\4\2\2ij\7\5\2\2jm\5\20\t\2kl\7\5\2\2ln\5 \21\2"+
		"mk\3\2\2\2mn\3\2\2\2n\17\3\2\2\2op\5\n\6\2pq\7\5\2\2qr\5\f\7\2rs\7\5\2"+
		"\2st\5$\23\2tu\7\5\2\2uv\5(\25\2v\21\3\2\2\2wx\7\n\2\2xy\7\4\2\2yz\5\24"+
		"\13\2z\23\3\2\2\2{|\7\5\2\2|~\5\26\f\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2"+
		"\2\2\177\u0080\7\5\2\2\u0080\u0082\5\30\r\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\25\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\7\4\2\2\u0085"+
		"\u0086\t\2\2\2\u0086\27\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089\7\4\2"+
		"\2\u0089\u008a\7\37\2\2\u008a\31\3\2\2\2\u008b\u008c\7\r\2\2\u008c\u008d"+
		"\7\4\2\2\u008d\u008e\5\36\20\2\u008e\33\3\2\2\2\u008f\u0090\7\16\2\2\u0090"+
		"\u0091\7\4\2\2\u0091\u0092\7\37\2\2\u0092\35\3\2\2\2\u0093\u0094\7\17"+
		"\2\2\u0094\u0095\7\20\2\2\u0095\u0096\7\35\2\2\u0096\u0097\7\21\2\2\u0097"+
		"\u0098\7\35\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\35\2\2\u009a\u009b"+
		"\7\22\2\2\u009b\37\3\2\2\2\u009c\u009d\7\23\2\2\u009d\u009f\7\4\2\2\u009e"+
		"\u00a0\5\"\22\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2!\3\2\2\2\u00a3\u00a4\7\5\2\2\u00a4\u00aa"+
		"\5*\26\2\u00a5\u00a6\7\5\2\2\u00a6\u00aa\5,\27\2\u00a7\u00a8\7\5\2\2\u00a8"+
		"\u00aa\5.\30\2\u00a9\u00a3\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa#\3\2\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00ae"+
		"\5&\24\2\u00ae%\3\2\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b1\7\35\2\2\u00b1"+
		"\u00b2\7\21\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4\7\22\2\2\u00b4\'\3\2"+
		"\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00b8\7\35\2\2\u00b8"+
		")\3\2\2\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\7!\2\2\u00bb\u00bc\7\4\2\2"+
		"\u00bc\u00bd\7\5\2\2\u00bd\u00be\5\60\31\2\u00be+\3\2\2\2\u00bf\u00c0"+
		"\7\27\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c2\7\4\2\2\u00c2\u00c3\7\5\2\2\u00c3"+
		"\u00c4\5\62\32\2\u00c4-\3\2\2\2\u00c5\u00c6\7\30\2\2\u00c6\u00c7\7!\2"+
		"\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\5\64\33\2\u00ca"+
		"/\3\2\2\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\5\f\7\2"+
		"\u00ce\u00cf\7\5\2\2\u00cf\u00d0\5$\23\2\u00d0\u00d1\7\5\2\2\u00d1\u00d4"+
		"\5(\25\2\u00d2\u00d3\7\5\2\2\u00d3\u00d5\5\32\16\2\u00d4\u00d2\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8"+
		"\5\34\17\2\u00d8\61\3\2\2\2\u00d9\u00da\5\66\34\2\u00da\u00db\7\5\2\2"+
		"\u00db\u00dc\5$\23\2\u00dc\u00dd\7\5\2\2\u00dd\u00e0\5(\25\2\u00de\u00df"+
		"\7\5\2\2\u00df\u00e1\5\32\16\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\5\34\17\2\u00e4\63"+
		"\3\2\2\2\u00e5\u00e6\58\35\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\5$\23\2\u00e8"+
		"\u00e9\7\5\2\2\u00e9\u00ec\5(\25\2\u00ea\u00eb\7\5\2\2\u00eb\u00ed\5\32"+
		"\16\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\7\5\2\2\u00ef\u00f0\5\34\17\2\u00f0\65\3\2\2\2\u00f1\u00f2\7\31"+
		"\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\7\35\2\2\u00f4\67\3\2\2\2\u00f5\u00f6"+
		"\7\32\2\2\u00f6\u00f7\7\4\2\2\u00f7\u00f8\5:\36\2\u00f89\3\2\2\2\u00f9"+
		"\u00fa\7\33\2\2\u00fa\u00ff\5&\24\2\u00fb\u00fc\7\21\2\2\u00fc\u00fe\5"+
		"&\24\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\34"+
		"\2\2\u0103;\3\2\2\2\17GLX\\m}\u0081\u00a1\u00a9\u00d4\u00e0\u00ec\u00ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}