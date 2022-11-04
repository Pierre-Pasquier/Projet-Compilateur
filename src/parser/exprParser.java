// Generated from expr.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, STRING=41, IDF=42, INT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_binaryoperator = 2, RULE_or = 3, 
		RULE_and = 4, RULE_compare = 5, RULE_plus = 6, RULE_mult = 7, RULE_exprseq = 8, 
		RULE_exprlist = 9, RULE_fieldlist = 10, RULE_lvalue = 11, RULE_e = 12, 
		RULE_declarationlist = 13, RULE_declaration = 14, RULE_typedeclaration = 15, 
		RULE_type = 16, RULE_typefields = 17, RULE_typefield = 18, RULE_typeid = 19, 
		RULE_variabledeclaration = 20, RULE_functiondeclaration = 21, RULE_nil = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "binaryoperator", "or", "and", "compare", "plus", 
			"mult", "exprseq", "exprlist", "fieldlist", "lvalue", "e", "declarationlist", 
			"declaration", "typedeclaration", "type", "typefields", "typefield", 
			"typeid", "variabledeclaration", "functiondeclaration", "nil"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "':='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'of'", 
			"'if'", "'then'", "'else'", "'while'", "'do'", "'for'", "'to'", "'break'", 
			"'let'", "'in'", "'end'", "'|'", "'&'", "'='", "'<>'", "'>'", "'<'", 
			"'>='", "'<='", "'+'", "'*'", "'/'", "';'", "','", "'.'", "'array'", 
			"':'", "'int'", "'string'", "'var'", "'function'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "STRING", "IDF", "INT", "WS"
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
	public String getGrammarFileName() { return "expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(exprParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				expr();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__36) | (1L << T__37) | (1L << STRING) | (1L << IDF) | (1L << INT))) != 0) );
			setState(51);
			match(EOF);
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
		public TerminalNode STRING() { return getToken(exprParser.STRING, 0); }
		public List<BinaryoperatorContext> binaryoperator() {
			return getRuleContexts(BinaryoperatorContext.class);
		}
		public BinaryoperatorContext binaryoperator(int i) {
			return getRuleContext(BinaryoperatorContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public ExprseqContext exprseq() {
			return getRuleContext(ExprseqContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			int _alt;
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(STRING);
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(54);
						binaryoperator();
						setState(55);
						expr();
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(INT);
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						binaryoperator();
						setState(64);
						expr();
						}
						} 
					}
					setState(70);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				nil();
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(72);
						binaryoperator();
						setState(73);
						expr();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				lvalue();
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						binaryoperator();
						setState(82);
						expr();
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(T__0);
				setState(90);
				expr();
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						binaryoperator();
						setState(92);
						expr();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				lvalue();
				setState(100);
				match(T__1);
				setState(101);
				expr();
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						binaryoperator();
						setState(103);
						expr();
						}
						} 
					}
					setState(109);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				match(IDF);
				setState(111);
				match(T__2);
				setState(112);
				exprlist();
				setState(113);
				match(T__3);
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						binaryoperator();
						setState(115);
						expr();
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				match(T__2);
				setState(123);
				exprseq();
				setState(124);
				match(T__3);
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(125);
						binaryoperator();
						setState(126);
						expr();
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(133);
				typeid();
				setState(134);
				match(T__4);
				setState(135);
				fieldlist();
				setState(136);
				match(T__5);
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						binaryoperator();
						setState(138);
						expr();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				typeid();
				setState(146);
				match(T__6);
				setState(147);
				expr();
				setState(148);
				match(T__7);
				setState(149);
				match(T__8);
				setState(150);
				expr();
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						binaryoperator();
						setState(152);
						expr();
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(159);
				match(T__9);
				setState(160);
				expr();
				setState(161);
				match(T__10);
				setState(162);
				expr();
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						binaryoperator();
						setState(164);
						expr();
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(171);
				match(T__9);
				setState(172);
				expr();
				setState(173);
				match(T__10);
				setState(174);
				expr();
				setState(175);
				match(T__11);
				setState(176);
				expr();
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						binaryoperator();
						setState(178);
						expr();
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(185);
				match(T__12);
				setState(186);
				expr();
				setState(187);
				match(T__13);
				setState(188);
				expr();
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						binaryoperator();
						setState(190);
						expr();
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(197);
				match(T__14);
				setState(198);
				match(IDF);
				setState(199);
				match(T__1);
				setState(200);
				expr();
				setState(201);
				match(T__15);
				setState(202);
				expr();
				setState(203);
				match(T__13);
				setState(204);
				expr();
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(205);
						binaryoperator();
						setState(206);
						expr();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(213);
				match(T__16);
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						binaryoperator();
						setState(215);
						expr();
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(222);
				match(T__17);
				setState(223);
				declarationlist();
				setState(224);
				match(T__18);
				setState(225);
				exprseq();
				setState(226);
				match(T__19);
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						binaryoperator();
						setState(228);
						expr();
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class BinaryoperatorContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public BinaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoperator; }
	}

	public final BinaryoperatorContext binaryoperator() throws RecognitionException {
		BinaryoperatorContext _localctx = new BinaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binaryoperator);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				plus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				mult();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				compare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				and();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				or();
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

	public static class OrContext extends ParserRuleContext {
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			and();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(245);
				match(T__20);
				setState(246);
				and();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AndContext extends ParserRuleContext {
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			compare();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(253);
				match(T__21);
				setState(254);
				compare();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CompareContext extends ParserRuleContext {
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			plus();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) {
				{
				setState(261);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				plus();
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

	public static class PlusContext extends ParserRuleContext {
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			mult();
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(267);
					mult();
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class MultContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			expr();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				expr();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprseqContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprseq; }
	}

	public final ExprseqContext exprseq() throws RecognitionException {
		ExprseqContext _localctx = new ExprseqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expr();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(282);
				match(T__31);
				setState(283);
				expr();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(290);
				match(T__32);
				setState(291);
				expr();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FieldlistContext extends ParserRuleContext {
		public List<TerminalNode> IDF() { return getTokens(exprParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(exprParser.IDF, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FieldlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldlist; }
	}

	public final FieldlistContext fieldlist() throws RecognitionException {
		FieldlistContext _localctx = new FieldlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(IDF);
			setState(298);
			match(T__22);
			setState(299);
			expr();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(300);
				match(T__32);
				setState(301);
				match(IDF);
				setState(302);
				match(T__22);
				setState(303);
				expr();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDF);
			setState(310);
			e();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_e);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__33);
				setState(313);
				match(IDF);
				setState(314);
				e();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(T__6);
				setState(316);
				expr();
				setState(317);
				match(T__7);
				setState(318);
				e();
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__7:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case STRING:
			case IDF:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class DeclarationlistContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationlist; }
	}

	public final DeclarationlistContext declarationlist() throws RecognitionException {
		DeclarationlistContext _localctx = new DeclarationlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarationlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				declaration();
				}
				}
				setState(326); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) );
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypedeclarationContext typedeclaration() {
			return getRuleContext(TypedeclarationContext.class,0);
		}
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__34:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				typedeclaration();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				variabledeclaration();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				functiondeclaration();
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

	public static class TypedeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedeclaration; }
	}

	public final TypedeclarationContext typedeclaration() throws RecognitionException {
		TypedeclarationContext _localctx = new TypedeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			type();
			setState(334);
			typeid();
			setState(335);
			match(T__22);
			setState(336);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				typeid();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(T__4);
				setState(340);
				typefields();
				setState(341);
				match(T__5);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(T__34);
				setState(344);
				match(T__8);
				setState(345);
				typeid();
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

	public static class TypefieldsContext extends ParserRuleContext {
		public List<TypefieldContext> typefield() {
			return getRuleContexts(TypefieldContext.class);
		}
		public TypefieldContext typefield(int i) {
			return getRuleContext(TypefieldContext.class,i);
		}
		public TypefieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefields; }
	}

	public final TypefieldsContext typefields() throws RecognitionException {
		TypefieldsContext _localctx = new TypefieldsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typefields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			typefield();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(349);
				match(T__32);
				setState(350);
				typefield();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypefieldContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefield; }
	}

	public final TypefieldContext typefield() throws RecognitionException {
		TypefieldContext _localctx = new TypefieldContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(IDF);
			setState(357);
			match(T__35);
			setState(358);
			typeid();
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

	public static class TypeidContext extends ParserRuleContext {
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
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

	public static class VariabledeclarationContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public VariabledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclaration; }
	}

	public final VariabledeclarationContext variabledeclaration() throws RecognitionException {
		VariabledeclarationContext _localctx = new VariabledeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variabledeclaration);
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(T__38);
				setState(363);
				match(IDF);
				setState(364);
				match(T__1);
				setState(365);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__38);
				setState(367);
				match(IDF);
				setState(368);
				match(T__35);
				setState(369);
				typeid();
				setState(370);
				match(T__1);
				setState(371);
				expr();
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

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functiondeclaration);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(T__39);
				setState(376);
				match(IDF);
				setState(377);
				match(T__2);
				setState(378);
				typefields();
				setState(379);
				match(T__3);
				setState(380);
				match(T__22);
				setState(381);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T__39);
				setState(384);
				match(IDF);
				setState(385);
				match(T__2);
				setState(386);
				typefields();
				setState(387);
				match(T__3);
				setState(388);
				match(T__35);
				setState(389);
				typeid();
				setState(390);
				match(T__22);
				setState(391);
				expr();
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

	public static class NilContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(exprParser.STRING, 0); }
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nil);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==INT) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\2\3\2\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3"+
		"\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q"+
		"\13\3\3\3\3\3\3\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"a\n\3\f\3\16\3d\13\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3x\n\3\f\3\16\3{\13\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\u008f\n\3\f\3\16\3\u0092\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\u009d\n\3\f\3\16\3\u00a0\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00a9\n"+
		"\3\f\3\16\3\u00ac\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00b7\n"+
		"\3\f\3\16\3\u00ba\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00c3\n\3\f\3\16"+
		"\3\u00c6\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00d3\n"+
		"\3\f\3\16\3\u00d6\13\3\3\3\3\3\3\3\3\3\7\3\u00dc\n\3\f\3\16\3\u00df\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00e9\n\3\f\3\16\3\u00ec\13\3\5"+
		"\3\u00ee\n\3\3\4\3\4\3\4\3\4\3\4\5\4\u00f5\n\4\3\5\3\5\3\5\7\5\u00fa\n"+
		"\5\f\5\16\5\u00fd\13\5\3\6\3\6\3\6\7\6\u0102\n\6\f\6\16\6\u0105\13\6\3"+
		"\7\3\7\3\7\5\7\u010a\n\7\3\b\3\b\3\b\7\b\u010f\n\b\f\b\16\b\u0112\13\b"+
		"\3\t\3\t\3\t\7\t\u0117\n\t\f\t\16\t\u011a\13\t\3\n\3\n\3\n\7\n\u011f\n"+
		"\n\f\n\16\n\u0122\13\n\3\13\3\13\3\13\7\13\u0127\n\13\f\13\16\13\u012a"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0133\n\f\f\f\16\f\u0136\13\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0144\n\16"+
		"\3\17\6\17\u0147\n\17\r\17\16\17\u0148\3\20\3\20\3\20\5\20\u014e\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u015d\n\22\3\23\3\23\3\23\7\23\u0162\n\23\f\23\16\23\u0165\13\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0178\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u018c\n\27\3\30\3\30"+
		"\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\31"+
		"\36\4\2\3\3\37\37\3\2 !\3\2\'(\4\2++--\2\u01ae\2\61\3\2\2\2\4\u00ed\3"+
		"\2\2\2\6\u00f4\3\2\2\2\b\u00f6\3\2\2\2\n\u00fe\3\2\2\2\f\u0106\3\2\2\2"+
		"\16\u010b\3\2\2\2\20\u0113\3\2\2\2\22\u011b\3\2\2\2\24\u0123\3\2\2\2\26"+
		"\u012b\3\2\2\2\30\u0137\3\2\2\2\32\u0143\3\2\2\2\34\u0146\3\2\2\2\36\u014d"+
		"\3\2\2\2 \u014f\3\2\2\2\"\u015c\3\2\2\2$\u015e\3\2\2\2&\u0166\3\2\2\2"+
		"(\u016a\3\2\2\2*\u0177\3\2\2\2,\u018b\3\2\2\2.\u018d\3\2\2\2\60\62\5\4"+
		"\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2"+
		"\2\2\65\66\7\2\2\3\66\3\3\2\2\2\67=\7+\2\289\5\6\4\29:\5\4\3\2:<\3\2\2"+
		"\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\u00ee\3\2\2\2?=\3\2\2\2@F"+
		"\7-\2\2AB\5\6\4\2BC\5\4\3\2CE\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2G\u00ee\3\2\2\2HF\3\2\2\2IO\5.\30\2JK\5\6\4\2KL\5\4\3\2LN\3\2"+
		"\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\u00ee\3\2\2\2QO\3\2\2\2"+
		"RX\5\30\r\2ST\5\6\4\2TU\5\4\3\2UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y\u00ee\3\2\2\2ZX\3\2\2\2[\\\7\3\2\2\\b\5\4\3\2]^\5\6\4\2"+
		"^_\5\4\3\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\u00ee\3"+
		"\2\2\2db\3\2\2\2ef\5\30\r\2fg\7\4\2\2gm\5\4\3\2hi\5\6\4\2ij\5\4\3\2jl"+
		"\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\u00ee\3\2\2\2om\3\2"+
		"\2\2pq\7,\2\2qr\7\5\2\2rs\5\24\13\2sy\7\6\2\2tu\5\6\4\2uv\5\4\3\2vx\3"+
		"\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\u00ee\3\2\2\2{y\3\2\2"+
		"\2|}\7\5\2\2}~\5\22\n\2~\u0084\7\6\2\2\177\u0080\5\6\4\2\u0080\u0081\5"+
		"\4\3\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u00ee\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\5(\25\2\u0088\u0089\7\7\2\2\u0089\u008a\5\26\f\2\u008a"+
		"\u0090\7\b\2\2\u008b\u008c\5\6\4\2\u008c\u008d\5\4\3\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u00ee\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5("+
		"\25\2\u0094\u0095\7\t\2\2\u0095\u0096\5\4\3\2\u0096\u0097\7\n\2\2\u0097"+
		"\u0098\7\13\2\2\u0098\u009e\5\4\3\2\u0099\u009a\5\6\4\2\u009a\u009b\5"+
		"\4\3\2\u009b\u009d\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00ee\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\7\r\2\2\u00a4"+
		"\u00aa\5\4\3\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7\5\4\3\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ee\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\f"+
		"\2\2\u00ae\u00af\5\4\3\2\u00af\u00b0\7\r\2\2\u00b0\u00b1\5\4\3\2\u00b1"+
		"\u00b2\7\16\2\2\u00b2\u00b8\5\4\3\2\u00b3\u00b4\5\6\4\2\u00b4\u00b5\5"+
		"\4\3\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ee\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7\20\2\2\u00be"+
		"\u00c4\5\4\3\2\u00bf\u00c0\5\6\4\2\u00c0\u00c1\5\4\3\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00ee\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\21"+
		"\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\4\3\2\u00cb"+
		"\u00cc\7\22\2\2\u00cc\u00cd\5\4\3\2\u00cd\u00ce\7\20\2\2\u00ce\u00d4\5"+
		"\4\3\2\u00cf\u00d0\5\6\4\2\u00d0\u00d1\5\4\3\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00ee\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dd\7\23\2\2\u00d8"+
		"\u00d9\5\6\4\2\u00d9\u00da\5\4\3\2\u00da\u00dc\3\2\2\2\u00db\u00d8\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00ee\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\5"+
		"\34\17\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\5\22\n\2\u00e4\u00ea\7\26\2"+
		"\2\u00e5\u00e6\5\6\4\2\u00e6\u00e7\5\4\3\2\u00e7\u00e9\3\2\2\2\u00e8\u00e5"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\67\3\2\2\2\u00ed@\3\2\2\2\u00ed"+
		"I\3\2\2\2\u00edR\3\2\2\2\u00ed[\3\2\2\2\u00ede\3\2\2\2\u00edp\3\2\2\2"+
		"\u00ed|\3\2\2\2\u00ed\u0087\3\2\2\2\u00ed\u0093\3\2\2\2\u00ed\u00a1\3"+
		"\2\2\2\u00ed\u00ad\3\2\2\2\u00ed\u00bb\3\2\2\2\u00ed\u00c7\3\2\2\2\u00ed"+
		"\u00d7\3\2\2\2\u00ed\u00e0\3\2\2\2\u00ee\5\3\2\2\2\u00ef\u00f5\5\16\b"+
		"\2\u00f0\u00f5\5\20\t\2\u00f1\u00f5\5\f\7\2\u00f2\u00f5\5\n\6\2\u00f3"+
		"\u00f5\5\b\5\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\7\3\2\2\2\u00f6\u00fb"+
		"\5\n\6\2\u00f7\u00f8\7\27\2\2\u00f8\u00fa\5\n\6\2\u00f9\u00f7\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\t\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0103\5\f\7\2\u00ff\u0100\7\30\2\2\u0100"+
		"\u0102\5\f\7\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\13\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0109"+
		"\5\16\b\2\u0107\u0108\t\2\2\2\u0108\u010a\5\16\b\2\u0109\u0107\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\r\3\2\2\2\u010b\u0110\5\20\t\2\u010c\u010d"+
		"\t\3\2\2\u010d\u010f\5\20\t\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\17\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0118\5\4\3\2\u0114\u0115\t\4\2\2\u0115\u0117\5\4\3\2\u0116"+
		"\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\21\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0120\5\4\3\2\u011c\u011d"+
		"\7\"\2\2\u011d\u011f\5\4\3\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\23\3\2\2\2\u0122\u0120\3\2\2"+
		"\2\u0123\u0128\5\4\3\2\u0124\u0125\7#\2\2\u0125\u0127\5\4\3\2\u0126\u0124"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\25\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7,\2\2\u012c\u012d\7\31\2"+
		"\2\u012d\u0134\5\4\3\2\u012e\u012f\7#\2\2\u012f\u0130\7,\2\2\u0130\u0131"+
		"\7\31\2\2\u0131\u0133\5\4\3\2\u0132\u012e\3\2\2\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\27\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0137\u0138\7,\2\2\u0138\u0139\5\32\16\2\u0139\31\3\2\2\2\u013a"+
		"\u013b\7$\2\2\u013b\u013c\7,\2\2\u013c\u0144\5\32\16\2\u013d\u013e\7\t"+
		"\2\2\u013e\u013f\5\4\3\2\u013f\u0140\7\n\2\2\u0140\u0141\5\32\16\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u013a\3\2\2\2\u0143\u013d\3\2"+
		"\2\2\u0143\u0142\3\2\2\2\u0144\33\3\2\2\2\u0145\u0147\5\36\20\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\35\3\2\2\2\u014a\u014e\5 \21\2\u014b\u014e\5*\26\2\u014c\u014e"+
		"\5,\27\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\37\3\2\2\2\u014f\u0150\5\"\22\2\u0150\u0151\5(\25\2\u0151\u0152\7\31"+
		"\2\2\u0152\u0153\5\"\22\2\u0153!\3\2\2\2\u0154\u015d\5(\25\2\u0155\u0156"+
		"\7\7\2\2\u0156\u0157\5$\23\2\u0157\u0158\7\b\2\2\u0158\u015d\3\2\2\2\u0159"+
		"\u015a\7%\2\2\u015a\u015b\7\13\2\2\u015b\u015d\5(\25\2\u015c\u0154\3\2"+
		"\2\2\u015c\u0155\3\2\2\2\u015c\u0159\3\2\2\2\u015d#\3\2\2\2\u015e\u0163"+
		"\5&\24\2\u015f\u0160\7#\2\2\u0160\u0162\5&\24\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164%\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0167\7,\2\2\u0167\u0168\7&\2\2\u0168\u0169"+
		"\5(\25\2\u0169\'\3\2\2\2\u016a\u016b\t\5\2\2\u016b)\3\2\2\2\u016c\u016d"+
		"\7)\2\2\u016d\u016e\7,\2\2\u016e\u016f\7\4\2\2\u016f\u0178\5\4\3\2\u0170"+
		"\u0171\7)\2\2\u0171\u0172\7,\2\2\u0172\u0173\7&\2\2\u0173\u0174\5(\25"+
		"\2\u0174\u0175\7\4\2\2\u0175\u0176\5\4\3\2\u0176\u0178\3\2\2\2\u0177\u016c"+
		"\3\2\2\2\u0177\u0170\3\2\2\2\u0178+\3\2\2\2\u0179\u017a\7*\2\2\u017a\u017b"+
		"\7,\2\2\u017b\u017c\7\5\2\2\u017c\u017d\5$\23\2\u017d\u017e\7\6\2\2\u017e"+
		"\u017f\7\31\2\2\u017f\u0180\5\4\3\2\u0180\u018c\3\2\2\2\u0181\u0182\7"+
		"*\2\2\u0182\u0183\7,\2\2\u0183\u0184\7\5\2\2\u0184\u0185\5$\23\2\u0185"+
		"\u0186\7\6\2\2\u0186\u0187\7&\2\2\u0187\u0188\5(\25\2\u0188\u0189\7\31"+
		"\2\2\u0189\u018a\5\4\3\2\u018a\u018c\3\2\2\2\u018b\u0179\3\2\2\2\u018b"+
		"\u0181\3\2\2\2\u018c-\3\2\2\2\u018d\u018e\t\6\2\2\u018e/\3\2\2\2$\63="+
		"FOXbmy\u0084\u0090\u009e\u00aa\u00b8\u00c4\u00d4\u00dd\u00ea\u00ed\u00f4"+
		"\u00fb\u0103\u0109\u0110\u0118\u0120\u0128\u0134\u0143\u0148\u014d\u015c"+
		"\u0163\u0177\u018b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}