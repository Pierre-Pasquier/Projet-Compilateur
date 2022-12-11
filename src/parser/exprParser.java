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
		T__24=25, PRINT=26, PRINTI=27, FLUSH=28, GETCHAR=29, ORD=30, CHR=31, SIZE=32, 
		SUBSTRING=33, CONCAT=34, NOT=35, EXIT=36, ARRAY=37, BREAK=38, DO=39, ELSE=40, 
		END=41, FOR=42, FUNCTION=43, IF=44, IN=45, LET=46, NIL=47, OF=48, THEN=49, 
		TO=50, TYPE=51, VAR=52, WHILE=53, STRING=54, IDF=55, INT=56, COM=57, WS=58;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_op = 2, RULE_binaryop = 3, RULE_or = 4, 
		RULE_and = 5, RULE_eq = 6, RULE_compare = 7, RULE_plus = 8, RULE_mult = 9, 
		RULE_value = 10, RULE_exprseq = 11, RULE_exprlist = 12, RULE_fieldlist = 13, 
		RULE_lvalue = 14, RULE_declarationlist = 15, RULE_declaration = 16, RULE_typedeclaration = 17, 
		RULE_type = 18, RULE_typefields = 19, RULE_typefield = 20, RULE_typeid = 21, 
		RULE_variabledeclaration = 22, RULE_functiondeclaration = 23, RULE_printi = 24, 
		RULE_print = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "op", "binaryop", "or", "and", "eq", "compare", "plus", 
			"mult", "value", "exprseq", "exprlist", "fieldlist", "lvalue", "declarationlist", 
			"declaration", "typedeclaration", "type", "typefields", "typefield", 
			"typeid", "variabledeclaration", "functiondeclaration", "printi", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "':='", "'('", "')'", "'-'", "'|'", 
			"'&'", "'='", "'<>'", "'>'", "'<'", "'>='", "'<='", "'+'", "'*'", "'/'", 
			"';'", "','", "'.'", "':'", "'printi('", "'print('", "'print'", "'printi'", 
			"'flush'", "'getchar'", "'ord'", "'chr'", "'size'", "'substring'", "'concat'", 
			"'not'", "'exit'", "'array'", "'break'", "'do'", "'else'", "'end'", "'for'", 
			"'function'", "'if'", "'in'", "'let'", "'nil'", "'of'", "'then'", "'to'", 
			"'type'", "'var'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PRINT", "PRINTI", "FLUSH", "GETCHAR", "ORD", "CHR", "SIZE", 
			"SUBSTRING", "CONCAT", "NOT", "EXIT", "ARRAY", "BREAK", "DO", "ELSE", 
			"END", "FOR", "FUNCTION", "IF", "IN", "LET", "NIL", "OF", "THEN", "TO", 
			"TYPE", "VAR", "WHILE", "STRING", "IDF", "INT", "COM", "WS"
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(exprParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			expr();
			setState(53);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeidsContext extends ExprContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public FieldlistContext fieldlist() {
			return getRuleContext(FieldlistContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(exprParser.OF, 0); }
		public TypeidsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PrintisContext extends ExprContext {
		public PrintiContext printi() {
			return getRuleContext(PrintiContext.class,0);
		}
		public PrintisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprtiretContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprtiretContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ForContext extends ExprContext {
		public TerminalNode FOR() { return getToken(exprParser.FOR, 0); }
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(exprParser.TO, 0); }
		public TerminalNode DO() { return getToken(exprParser.DO, 0); }
		public ForContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BreakContext extends ExprContext {
		public TerminalNode BREAK() { return getToken(exprParser.BREAK, 0); }
		public BreakContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(exprParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DO() { return getToken(exprParser.DO, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IfthenelseContext extends ExprContext {
		public TerminalNode IF() { return getToken(exprParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(exprParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(exprParser.ELSE, 0); }
		public IfthenelseContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class LvaluesContext extends ExprContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public LvaluesContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprseqContext exprseq() {
			return getRuleContext(ExprseqContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OpsContext extends ExprContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public OpsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Nil_opContext extends ExprContext {
		public TerminalNode NIL() { return getToken(exprParser.NIL, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Nil_opContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarationlistsContext extends ExprContext {
		public TerminalNode LET() { return getToken(exprParser.LET, 0); }
		public DeclarationlistContext declarationlist() {
			return getRuleContext(DeclarationlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(exprParser.IN, 0); }
		public ExprseqContext exprseq() {
			return getRuleContext(ExprseqContext.class,0);
		}
		public TerminalNode END() { return getToken(exprParser.END, 0); }
		public DeclarationlistsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PrintsContext extends ExprContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IfthenContext extends ExprContext {
		public TerminalNode IF() { return getToken(exprParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(exprParser.THEN, 0); }
		public IfthenContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new OpsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				op();
				}
				break;
			case 2:
				_localctx = new Nil_opContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(NIL);
				setState(57);
				op();
				}
				break;
			case 3:
				_localctx = new TypeidsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(58);
					typeid();
					setState(59);
					match(T__0);
					setState(60);
					fieldlist();
					setState(61);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(63);
					typeid();
					setState(64);
					match(T__2);
					setState(65);
					expr();
					setState(66);
					match(T__3);
					setState(67);
					match(OF);
					setState(68);
					expr();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LvaluesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				lvalue();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(73);
					match(T__4);
					setState(74);
					expr();
					}
					break;
				case 2:
					{
					setState(75);
					match(T__5);
					setState(76);
					exprlist();
					setState(77);
					match(T__6);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ExprtiretContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(T__7);
				setState(82);
				expr();
				}
				break;
			case 6:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(T__5);
				setState(84);
				exprseq();
				setState(85);
				match(T__6);
				}
				break;
			case 7:
				_localctx = new IfthenelseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				match(IF);
				setState(88);
				expr();
				setState(89);
				match(THEN);
				setState(90);
				expr();
				setState(91);
				match(ELSE);
				setState(92);
				expr();
				}
				break;
			case 8:
				_localctx = new IfthenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
				match(IF);
				setState(95);
				expr();
				setState(96);
				match(THEN);
				setState(97);
				expr();
				}
				break;
			case 9:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(99);
				match(WHILE);
				setState(100);
				expr();
				setState(101);
				match(DO);
				setState(102);
				expr();
				}
				break;
			case 10:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				match(FOR);
				setState(105);
				match(IDF);
				setState(106);
				match(T__4);
				setState(107);
				expr();
				setState(108);
				match(TO);
				setState(109);
				expr();
				setState(110);
				match(DO);
				setState(111);
				expr();
				}
				break;
			case 11:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(113);
				match(BREAK);
				}
				break;
			case 12:
				_localctx = new DeclarationlistsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(114);
				match(LET);
				setState(115);
				declarationlist();
				setState(116);
				match(IN);
				setState(117);
				exprseq();
				setState(118);
				match(END);
				}
				break;
			case 13:
				_localctx = new PrintisContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(120);
				printi();
				}
				break;
			case 14:
				_localctx = new PrintsContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(121);
				print();
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	 
		public OpContext() { }
		public void copyFrom(OpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpbinContext extends OpContext {
		public BinaryopContext binaryop() {
			return getRuleContext(BinaryopContext.class,0);
		}
		public OpbinContext(OpContext ctx) { copyFrom(ctx); }
	}
	public static class OpbinexprContext extends OpContext {
		public List<BinaryopContext> binaryop() {
			return getRuleContexts(BinaryopContext.class);
		}
		public BinaryopContext binaryop(int i) {
			return getRuleContext(BinaryopContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpbinexprContext(OpContext ctx) { copyFrom(ctx); }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
			int _alt;
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new OpbinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				binaryop();
				}
				break;
			case 2:
				_localctx = new OpbinexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(125);
						binaryop();
						setState(126);
						expr();
						}
						} 
					}
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class BinaryopContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public BinaryopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryop; }
	}

	public final BinaryopContext binaryop() throws RecognitionException {
		BinaryopContext _localctx = new BinaryopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_binaryop);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				plus();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				eq();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				or();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				and();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				compare();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				mult();
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
		enterRule(_localctx, 8, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			and();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(144);
				match(T__8);
				setState(145);
				and();
				}
				}
				setState(150);
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
		public List<EqContext> eq() {
			return getRuleContexts(EqContext.class);
		}
		public EqContext eq(int i) {
			return getRuleContext(EqContext.class,i);
		}
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
		enterRule(_localctx, 10, RULE_and);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				eq();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(152);
					match(T__9);
					setState(153);
					eq();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				compare();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(160);
					match(T__9);
					setState(161);
					compare();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class EqContext extends ParserRuleContext {
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(exprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(exprParser.STRING, i);
		}
		public TerminalNode NIL() { return getToken(exprParser.NIL, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(169);
				lvalue();
				}
				break;
			case 2:
				{
				setState(170);
				plus();
				}
				break;
			case 3:
				{
				setState(171);
				match(STRING);
				}
				break;
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(175);
					lvalue();
					}
					break;
				case 2:
					{
					setState(176);
					plus();
					}
					break;
				case 3:
					{
					setState(177);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(178);
					match(NIL);
					}
					break;
				}
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

	public static class CompareContext extends ParserRuleContext {
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(exprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(exprParser.STRING, i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(183);
				lvalue();
				}
				break;
			case 2:
				{
				setState(184);
				plus();
				}
				break;
			case 3:
				{
				setState(185);
				match(STRING);
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) {
				{
				setState(188);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(189);
					lvalue();
					}
					break;
				case 2:
					{
					setState(190);
					plus();
					}
					break;
				case 3:
					{
					setState(191);
					match(STRING);
					}
					break;
				}
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
		enterRule(_localctx, 16, RULE_plus);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			mult();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__16) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(198);
					mult();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			value();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(205);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(206);
				value();
				}
				}
				}
				setState(211);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VallvalueContext extends ValueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public VallvalueContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class ValintContext extends ValueContext {
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public ValintContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class ValopContext extends ValueContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ValopContext(ValueContext ctx) { copyFrom(ctx); }
	}
	public static class ValidfContext extends ValueContext {
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public ValidfContext(ValueContext ctx) { copyFrom(ctx); }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ValintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(212);
					match(T__7);
					}
				}

				setState(215);
				match(INT);
				}
				break;
			case 2:
				_localctx = new ValidfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(216);
					match(T__7);
					}
				}

				setState(219);
				match(IDF);
				}
				break;
			case 3:
				_localctx = new ValopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(220);
					match(T__7);
					}
				}

				setState(223);
				match(T__5);
				setState(224);
				op();
				setState(225);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new VallvalueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(227);
					match(T__7);
					}
				}

				setState(230);
				lvalue();
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
		enterRule(_localctx, 22, RULE_exprseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			expr();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(234);
				match(T__19);
				setState(235);
				expr();
				}
				}
				setState(240);
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
		enterRule(_localctx, 24, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expr();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(242);
				match(T__20);
				setState(243);
				expr();
				}
				}
				setState(248);
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
		enterRule(_localctx, 26, RULE_fieldlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IDF);
			setState(250);
			match(T__10);
			setState(251);
			expr();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(252);
				match(T__20);
				setState(253);
				match(IDF);
				setState(254);
				match(T__10);
				setState(255);
				expr();
				}
				}
				setState(260);
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
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	 
		public LvalueContext() { }
		public void copyFrom(LvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdflistContext extends LvalueContext {
		public List<TerminalNode> IDF() { return getTokens(exprParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(exprParser.IDF, i);
		}
		public IdflistContext(LvalueContext ctx) { copyFrom(ctx); }
	}
	public static class IdfexprlistContext extends LvalueContext {
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdfexprlistContext(LvalueContext ctx) { copyFrom(ctx); }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lvalue);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new IdflistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(IDF);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(262);
					match(T__21);
					setState(263);
					match(IDF);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new IdfexprlistContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(IDF);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(270);
					match(T__2);
					setState(271);
					expr();
					setState(272);
					match(T__3);
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 30, RULE_declarationlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(281);
				declaration();
				}
				}
				setState(284); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << TYPE) | (1L << VAR))) != 0) );
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VardeclaContext extends DeclarationContext {
		public VariabledeclarationContext variabledeclaration() {
			return getRuleContext(VariabledeclarationContext.class,0);
		}
		public VardeclaContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class TypedeclaContext extends DeclarationContext {
		public TypedeclarationContext typedeclaration() {
			return getRuleContext(TypedeclarationContext.class,0);
		}
		public TypedeclaContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class FundeclaContext extends DeclarationContext {
		public FunctiondeclarationContext functiondeclaration() {
			return getRuleContext(FunctiondeclarationContext.class,0);
		}
		public FundeclaContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new TypedeclaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				typedeclaration();
				}
				break;
			case VAR:
				_localctx = new VardeclaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				variabledeclaration();
				}
				break;
			case FUNCTION:
				_localctx = new FundeclaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
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
		public TerminalNode TYPE() { return getToken(exprParser.TYPE, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedeclaration; }
	}

	public final TypedeclarationContext typedeclaration() throws RecognitionException {
		TypedeclarationContext _localctx = new TypedeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(TYPE);
			setState(292);
			typeid();
			setState(293);
			match(T__10);
			setState(294);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_idContext extends TypeContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public Type_idContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class TypefContext extends TypeContext {
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public TypefContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class TypeidarrayContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(exprParser.ARRAY, 0); }
		public TerminalNode OF() { return getToken(exprParser.OF, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeidarrayContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				_localctx = new Type_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				typeid();
				}
				break;
			case T__0:
				_localctx = new TypefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__0);
				setState(298);
				typefields();
				setState(299);
				match(T__1);
				}
				break;
			case ARRAY:
				_localctx = new TypeidarrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(ARRAY);
				setState(302);
				match(OF);
				setState(303);
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
		enterRule(_localctx, 38, RULE_typefields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDF) {
				{
				setState(306);
				typefield();
				}
			}

			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(309);
				match(T__20);
				setState(310);
				typefield();
				}
				}
				setState(315);
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
		enterRule(_localctx, 40, RULE_typefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(IDF);
			setState(317);
			match(T__22);
			setState(318);
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
		public TerminalNode IDF() { return getToken(exprParser.IDF, 0); }
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IDF);
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
		public TerminalNode VAR() { return getToken(exprParser.VAR, 0); }
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
		enterRule(_localctx, 44, RULE_variabledeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(VAR);
			setState(323);
			match(IDF);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(324);
				match(T__22);
				setState(325);
				typeid();
				}
			}

			setState(328);
			match(T__4);
			setState(329);
			expr();
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
		public TerminalNode FUNCTION() { return getToken(exprParser.FUNCTION, 0); }
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
		enterRule(_localctx, 46, RULE_functiondeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FUNCTION);
			setState(332);
			match(IDF);
			setState(333);
			match(T__5);
			setState(334);
			typefields();
			setState(335);
			match(T__6);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(336);
				match(T__22);
				setState(337);
				typeid();
				}
			}

			setState(340);
			match(T__10);
			setState(341);
			expr();
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

	public static class PrintiContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public PrintiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printi; }
	}

	public final PrintiContext printi() throws RecognitionException {
		PrintiContext _localctx = new PrintiContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_printi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__23);
			setState(344);
			op();
			setState(345);
			match(T__6);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__24);
			setState(348);
			expr();
			setState(349);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0162\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3}\n\3\3\4\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4"+
		"\u0086\13\4\5\4\u0088\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3"+
		"\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098\13\6\3\7\3\7\3\7\7\7\u009d\n\7\f\7"+
		"\16\7\u00a0\13\7\3\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\5\7\u00aa"+
		"\n\7\3\b\3\b\3\b\5\b\u00af\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b6\n\b\5\b\u00b8"+
		"\n\b\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t\5\t\u00c5"+
		"\n\t\3\n\3\n\3\n\7\n\u00ca\n\n\f\n\16\n\u00cd\13\n\3\13\3\13\3\13\7\13"+
		"\u00d2\n\13\f\13\16\13\u00d5\13\13\3\f\5\f\u00d8\n\f\3\f\3\f\5\f\u00dc"+
		"\n\f\3\f\3\f\5\f\u00e0\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e7\n\f\3\f\5\f\u00ea"+
		"\n\f\3\r\3\r\3\r\7\r\u00ef\n\r\f\r\16\r\u00f2\13\r\3\16\3\16\3\16\7\16"+
		"\u00f7\n\16\f\16\16\16\u00fa\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u0103\n\17\f\17\16\17\u0106\13\17\3\20\3\20\3\20\7\20\u010b\n\20"+
		"\f\20\16\20\u010e\13\20\3\20\3\20\3\20\3\20\3\20\7\20\u0115\n\20\f\20"+
		"\16\20\u0118\13\20\5\20\u011a\n\20\3\21\6\21\u011d\n\21\r\21\16\21\u011e"+
		"\3\22\3\22\3\22\5\22\u0124\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0133\n\24\3\25\5\25\u0136\n\25\3\25\3"+
		"\25\7\25\u013a\n\25\f\25\16\25\u013d\13\25\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\5\30\u0149\n\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0155\n\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\6\3\2\r\16\3\2\17\22\4\2\n\n\23\23\3\2\24\25\2\u0186"+
		"\2\66\3\2\2\2\4|\3\2\2\2\6\u0087\3\2\2\2\b\u008f\3\2\2\2\n\u0091\3\2\2"+
		"\2\f\u00a9\3\2\2\2\16\u00ae\3\2\2\2\20\u00bc\3\2\2\2\22\u00c6\3\2\2\2"+
		"\24\u00ce\3\2\2\2\26\u00e9\3\2\2\2\30\u00eb\3\2\2\2\32\u00f3\3\2\2\2\34"+
		"\u00fb\3\2\2\2\36\u0119\3\2\2\2 \u011c\3\2\2\2\"\u0123\3\2\2\2$\u0125"+
		"\3\2\2\2&\u0132\3\2\2\2(\u0135\3\2\2\2*\u013e\3\2\2\2,\u0142\3\2\2\2."+
		"\u0144\3\2\2\2\60\u014d\3\2\2\2\62\u0159\3\2\2\2\64\u015d\3\2\2\2\66\67"+
		"\5\4\3\2\678\7\2\2\38\3\3\2\2\29}\5\6\4\2:;\7\61\2\2;}\5\6\4\2<=\5,\27"+
		"\2=>\7\3\2\2>?\5\34\17\2?@\7\4\2\2@I\3\2\2\2AB\5,\27\2BC\7\5\2\2CD\5\4"+
		"\3\2DE\7\6\2\2EF\7\62\2\2FG\5\4\3\2GI\3\2\2\2H<\3\2\2\2HA\3\2\2\2HI\3"+
		"\2\2\2I}\3\2\2\2JQ\5\36\20\2KL\7\7\2\2LR\5\4\3\2MN\7\b\2\2NO\5\32\16\2"+
		"OP\7\t\2\2PR\3\2\2\2QK\3\2\2\2QM\3\2\2\2QR\3\2\2\2R}\3\2\2\2ST\7\n\2\2"+
		"T}\5\4\3\2UV\7\b\2\2VW\5\30\r\2WX\7\t\2\2X}\3\2\2\2YZ\7.\2\2Z[\5\4\3\2"+
		"[\\\7\63\2\2\\]\5\4\3\2]^\7*\2\2^_\5\4\3\2_}\3\2\2\2`a\7.\2\2ab\5\4\3"+
		"\2bc\7\63\2\2cd\5\4\3\2d}\3\2\2\2ef\7\67\2\2fg\5\4\3\2gh\7)\2\2hi\5\4"+
		"\3\2i}\3\2\2\2jk\7,\2\2kl\79\2\2lm\7\7\2\2mn\5\4\3\2no\7\64\2\2op\5\4"+
		"\3\2pq\7)\2\2qr\5\4\3\2r}\3\2\2\2s}\7(\2\2tu\7\60\2\2uv\5 \21\2vw\7/\2"+
		"\2wx\5\30\r\2xy\7+\2\2y}\3\2\2\2z}\5\62\32\2{}\5\64\33\2|9\3\2\2\2|:\3"+
		"\2\2\2|H\3\2\2\2|J\3\2\2\2|S\3\2\2\2|U\3\2\2\2|Y\3\2\2\2|`\3\2\2\2|e\3"+
		"\2\2\2|j\3\2\2\2|s\3\2\2\2|t\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\5\3\2\2\2~\u0088"+
		"\5\b\5\2\177\u0080\5\b\5\2\u0080\u0081\5\4\3\2\u0081\u0083\3\2\2\2\u0082"+
		"\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087~\3\2\2\2\u0087\u0084"+
		"\3\2\2\2\u0088\7\3\2\2\2\u0089\u0090\5\22\n\2\u008a\u0090\5\16\b\2\u008b"+
		"\u0090\5\n\6\2\u008c\u0090\5\f\7\2\u008d\u0090\5\20\t\2\u008e\u0090\5"+
		"\24\13\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\t\3\2\2\2"+
		"\u0091\u0096\5\f\7\2\u0092\u0093\7\13\2\2\u0093\u0095\5\f\7\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\13\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009e\5\16\b\2\u009a\u009b\7\f\2"+
		"\2\u009b\u009d\5\16\b\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00aa\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a6\5\20\t\2\u00a2\u00a3\7\f\2\2\u00a3\u00a5\5\20\t\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9"+
		"\u00a1\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00af\5\36\20\2\u00ac\u00af\5\22"+
		"\n\2\u00ad\u00af\78\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b7\3\2\2\2\u00b0\u00b5\t\2\2\2\u00b1\u00b6\5\36"+
		"\20\2\u00b2\u00b6\5\22\n\2\u00b3\u00b6\78\2\2\u00b4\u00b6\7\61\2\2\u00b5"+
		"\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\17\3\2\2\2\u00b9\u00bd\5\36\20\2\u00ba\u00bd\5\22\n\2\u00bb\u00bd\78"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00c4\3\2\2\2\u00be\u00c2\t\3\2\2\u00bf\u00c3\5\36\20\2\u00c0\u00c3\5"+
		"\22\n\2\u00c1\u00c3\78\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\21\3\2\2\2\u00c6\u00cb\5\24\13\2\u00c7\u00c8\t\4\2\2\u00c8"+
		"\u00ca\5\24\13\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d3\5\26\f\2\u00cf\u00d0\t\5\2\2\u00d0\u00d2\5\26\f\2\u00d1\u00cf\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\25\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\7\n\2\2\u00d7\u00d6\3\2\2"+
		"\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00ea\7:\2\2\u00da\u00dc"+
		"\7\n\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00ea\79\2\2\u00de\u00e0\7\n\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\b\2\2\u00e2\u00e3\5\6\4\2\u00e3"+
		"\u00e4\7\t\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e7\7\n\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\5\36\20\2\u00e9"+
		"\u00d7\3\2\2\2\u00e9\u00db\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e6\3\2"+
		"\2\2\u00ea\27\3\2\2\2\u00eb\u00f0\5\4\3\2\u00ec\u00ed\7\26\2\2\u00ed\u00ef"+
		"\5\4\3\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\31\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f8\5\4\3"+
		"\2\u00f4\u00f5\7\27\2\2\u00f5\u00f7\5\4\3\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\33\3\2\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\79\2\2\u00fc\u00fd\7\r\2\2\u00fd\u0104"+
		"\5\4\3\2\u00fe\u00ff\7\27\2\2\u00ff\u0100\79\2\2\u0100\u0101\7\r\2\2\u0101"+
		"\u0103\5\4\3\2\u0102\u00fe\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\35\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010c"+
		"\79\2\2\u0108\u0109\7\30\2\2\u0109\u010b\79\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u011a\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010f\u0116\79\2\2\u0110\u0111\7\5\2\2\u0111"+
		"\u0112\5\4\3\2\u0112\u0113\7\6\2\2\u0113\u0115\3\2\2\2\u0114\u0110\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0107\3\2\2\2\u0119\u010f\3\2"+
		"\2\2\u011a\37\3\2\2\2\u011b\u011d\5\"\22\2\u011c\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f!\3\2\2\2\u0120"+
		"\u0124\5$\23\2\u0121\u0124\5.\30\2\u0122\u0124\5\60\31\2\u0123\u0120\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124#\3\2\2\2\u0125\u0126"+
		"\7\65\2\2\u0126\u0127\5,\27\2\u0127\u0128\7\r\2\2\u0128\u0129\5&\24\2"+
		"\u0129%\3\2\2\2\u012a\u0133\5,\27\2\u012b\u012c\7\3\2\2\u012c\u012d\5"+
		"(\25\2\u012d\u012e\7\4\2\2\u012e\u0133\3\2\2\2\u012f\u0130\7\'\2\2\u0130"+
		"\u0131\7\62\2\2\u0131\u0133\5,\27\2\u0132\u012a\3\2\2\2\u0132\u012b\3"+
		"\2\2\2\u0132\u012f\3\2\2\2\u0133\'\3\2\2\2\u0134\u0136\5*\26\2\u0135\u0134"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u013b\3\2\2\2\u0137\u0138\7\27\2\2"+
		"\u0138\u013a\5*\26\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c)\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\79\2\2\u013f\u0140\7\31\2\2\u0140\u0141\5,\27\2\u0141+\3\2\2\2"+
		"\u0142\u0143\79\2\2\u0143-\3\2\2\2\u0144\u0145\7\66\2\2\u0145\u0148\7"+
		"9\2\2\u0146\u0147\7\31\2\2\u0147\u0149\5,\27\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7\7\2\2\u014b\u014c\5\4"+
		"\3\2\u014c/\3\2\2\2\u014d\u014e\7-\2\2\u014e\u014f\79\2\2\u014f\u0150"+
		"\7\b\2\2\u0150\u0151\5(\25\2\u0151\u0154\7\t\2\2\u0152\u0153\7\31\2\2"+
		"\u0153\u0155\5,\27\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\7\r\2\2\u0157\u0158\5\4\3\2\u0158\61\3\2\2\2\u0159"+
		"\u015a\7\32\2\2\u015a\u015b\5\6\4\2\u015b\u015c\7\t\2\2\u015c\63\3\2\2"+
		"\2\u015d\u015e\7\33\2\2\u015e\u015f\5\4\3\2\u015f\u0160\7\t\2\2\u0160"+
		"\65\3\2\2\2&HQ|\u0084\u0087\u008f\u0096\u009e\u00a6\u00a9\u00ae\u00b5"+
		"\u00b7\u00bc\u00c2\u00c4\u00cb\u00d3\u00d7\u00db\u00df\u00e6\u00e9\u00f0"+
		"\u00f8\u0104\u010c\u0116\u0119\u011e\u0123\u0132\u0135\u013b\u0148\u0154";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}