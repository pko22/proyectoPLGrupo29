// Generated from C:/Users/Equipo/Desktop/PL_2/proyectoPLGrupo29/src/main/java/org/example/calculoCientificoToC.g4 by ANTLR 4.13.2
package org.example;

import org.example.variablesUtils;
import org.example.subprogramasUtils;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calculoCientificoToCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, IDENT=42, NUM_INT_CONST=43, NUM_INT_CONST_B=44, 
		NUM_INT_CONST_O=45, NUM_INT_CONST_H=46, TRUE_CONST=47, FALSE_CONST=48, 
		OP_OR=49, OP_AND=50, OP_EQV=51, OP_NEQV=52, OP_NOT=53, NUM_REAL_CONST=54, 
		STRING_CONST=55, WS=56, COMMENT=57;
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_dcl = 2, RULE_dcl_AUX = 3, RULE_defcte = 4, 
		RULE_ctelist = 5, RULE_defvar = 6, RULE_varlist = 7, RULE_varlist_AUX = 8, 
		RULE_init = 9, RULE_tipo = 10, RULE_charlength = 11, RULE_simpvalue = 12, 
		RULE_cabecera = 13, RULE_cablist = 14, RULE_decsubprog = 15, RULE_decproc = 16, 
		RULE_decfun = 17, RULE_formal_paramlist = 18, RULE_nomparamlist = 19, 
		RULE_nomparamlist_AUX = 20, RULE_dec_s_paramlist = 21, RULE_dec_f_paramlist = 22, 
		RULE_tipoparam = 23, RULE_sentlist = 24, RULE_sentlist_AUX = 25, RULE_sent = 26, 
		RULE_if_tail = 27, RULE_if_else_tail = 28, RULE_do_tail = 29, RULE_doval = 30, 
		RULE_casos = 31, RULE_etiquetas = 32, RULE_eti_tail = 33, RULE_listaetiquetas = 34, 
		RULE_sent_AUX = 35, RULE_proc_call = 36, RULE_subpparamlist = 37, RULE_exp = 38, 
		RULE_exp_AUX = 39, RULE_operador_sumas = 40, RULE_termino = 41, RULE_termino_AUX = 42, 
		RULE_operador_multiplicaciones = 43, RULE_factor = 44, RULE_factor_AUX = 45, 
		RULE_explist = 46, RULE_expcond = 47, RULE_expcond_AUX = 48, RULE_oplog = 49, 
		RULE_factorcond = 50, RULE_opcomp = 51, RULE_subproglist = 52, RULE_codfun = 53, 
		RULE_codproc = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "dcl", "dcl_AUX", "defcte", "ctelist", "defvar", "varlist", 
			"varlist_AUX", "init", "tipo", "charlength", "simpvalue", "cabecera", 
			"cablist", "decsubprog", "decproc", "decfun", "formal_paramlist", "nomparamlist", 
			"nomparamlist_AUX", "dec_s_paramlist", "dec_f_paramlist", "tipoparam", 
			"sentlist", "sentlist_AUX", "sent", "if_tail", "if_else_tail", "do_tail", 
			"doval", "casos", "etiquetas", "eti_tail", "listaetiquetas", "sent_AUX", 
			"proc_call", "subpparamlist", "exp", "exp_AUX", "operador_sumas", "termino", 
			"termino_AUX", "operador_multiplicaciones", "factor", "factor_AUX", "explist", 
			"expcond", "expcond_AUX", "oplog", "factorcond", "opcomp", "subproglist", 
			"codfun", "codproc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'END'", "','", "'PARAMETER'", "'::'", "'='", 
			"'INTEGER'", "'REAL'", "'CHARACTER'", "'('", "')'", "'INTERFACE'", "'SUBROUTINE'", 
			"'FUNCTION'", "'INTENT'", "'IN'", "'OUT'", "'INOUT'", "'IF'", "'DO'", 
			"'SELECT'", "'CASE'", "'THEN'", "'ENDIF'", "'ELSE'", "'WHILE'", "'ENDDO'", 
			"'DEFAULT'", "':'", "'CALL'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'/='", null, null, null, null, null, "'.TRUE.'", 
			"'.FALSE.'", "'.OR.'", "'.AND.'", "'.EQV.'", "'.NEQV.'", "'.NOT.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENT", "NUM_INT_CONST", "NUM_INT_CONST_B", 
			"NUM_INT_CONST_O", "NUM_INT_CONST_H", "TRUE_CONST", "FALSE_CONST", "OP_OR", 
			"OP_AND", "OP_EQV", "OP_NEQV", "OP_NOT", "NUM_REAL_CONST", "STRING_CONST", 
			"WS", "COMMENT"
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
	public String getGrammarFileName() { return "calculoCientificoToC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    variablesUtils utils = new variablesUtils();
	    subprogramasUtils subprogramasUtils = new subprogramasUtils();
	    public boolean hayErroresSemanticos = false;

	public calculoCientificoToCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public String res;
		public Token id1;
		public DcllistContext dcllist;
		public CabeceraContext cabecera;
		public SentlistContext sentlist;
		public Token id2;
		public SubproglistContext subproglist;
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(calculoCientificoToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(calculoCientificoToCParser.IDENT, i);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__0);
			setState(111);
			((PrgContext)_localctx).id1 = match(IDENT);
			setState(112);
			match(T__1);
			setState(113);
			((PrgContext)_localctx).dcllist = dcllist();
			setState(114);
			((PrgContext)_localctx).cabecera = cabecera();
			setState(115);
			((PrgContext)_localctx).sentlist = sentlist();
			setState(116);
			match(T__2);
			setState(117);
			match(T__0);
			setState(118);
			((PrgContext)_localctx).id2 = match(IDENT);
			setState(119);
			((PrgContext)_localctx).subproglist = subproglist();

			        if(!(((PrgContext)_localctx).id1!=null?((PrgContext)_localctx).id1.getText():null).equals((((PrgContext)_localctx).id2!=null?((PrgContext)_localctx).id2.getText():null))) {
			            System.err.println("Error [Línea " + ((PrgContext)_localctx).id2.getLine() + ", Columna " + ((PrgContext)_localctx).id2.getCharPositionInLine() +
			                               "]: Posible causa: El nombre del programa en el cierre ('" + (((PrgContext)_localctx).id2!=null?((PrgContext)_localctx).id2.getText():null) +
			                               "') no coincide con el de apertura ('" + (((PrgContext)_localctx).id1!=null?((PrgContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        ((PrgContext)_localctx).res =  utils.getDefines() + ((PrgContext)_localctx).cabecera.res + ((PrgContext)_localctx).subproglist.res +
			               "\nvoid main (void) {\n" +
			               ((PrgContext)_localctx).dcllist.res +
			               ((PrgContext)_localctx).sentlist.res +
			               "}\n";
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public String res;
		public DclContext dcl;
		public DcllistContext dcllist;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((DcllistContext)_localctx).dcl = dcl();
				setState(123);
				((DcllistContext)_localctx).dcllist = dcllist();
				 ((DcllistContext)_localctx).res =  ((DcllistContext)_localctx).dcl.res + ((DcllistContext)_localctx).dcllist.res; 
				}
				break;
			case T__2:
			case T__12:
			case T__19:
			case T__20:
			case T__21:
			case T__30:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				 ((DcllistContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public String res;
		public TipoContext tipo;
		public Dcl_AUXContext dcl_AUX;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dcl_AUXContext dcl_AUX() {
			return getRuleContext(Dcl_AUXContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((DclContext)_localctx).tipo = tipo();
			setState(130);
			((DclContext)_localctx).dcl_AUX = dcl_AUX();

			        // Si dcl_AUX no devolvió nada, significa que era una constante (defcte)
			        // En ese caso, dcl no debe devolver el tipo al main.
			        if (((DclContext)_localctx).dcl_AUX.res.equals("")) {
			             ((DclContext)_localctx).res =  "";
			        } else {
			            ((DclContext)_localctx).res =  "\t" + ((DclContext)_localctx).tipo.res + " " + ((DclContext)_localctx).dcl_AUX.res;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dcl_AUXContext extends ParserRuleContext {
		public String res;
		public DefvarContext defvar;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public Dcl_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDcl_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDcl_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDcl_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_AUXContext dcl_AUX() throws RecognitionException {
		Dcl_AUXContext _localctx = new Dcl_AUXContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcl_AUX);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				defcte();
				 ((Dcl_AUXContext)_localctx).res =  ""; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((Dcl_AUXContext)_localctx).defvar = defvar();
				 ((Dcl_AUXContext)_localctx).res =  ((Dcl_AUXContext)_localctx).defvar.res; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefcteContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public CtelistContext ctelist;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__3);
			setState(142);
			match(T__4);
			setState(143);
			match(T__5);
			setState(144);
			((DefcteContext)_localctx).IDENT = match(IDENT);
			setState(145);
			match(T__6);
			setState(146);
			((DefcteContext)_localctx).simpvalue = simpvalue();
			setState(147);
			((DefcteContext)_localctx).ctelist = ctelist();
			setState(148);
			match(T__1);

			        utils.addDefine((((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null), ((DefcteContext)_localctx).simpvalue.res);
			        ((DefcteContext)_localctx).res =  ((DefcteContext)_localctx).ctelist.res;
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public CtelistContext ctelist;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ctelist);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__3);
				setState(152);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(153);
				match(T__6);
				setState(154);
				((CtelistContext)_localctx).simpvalue = simpvalue();
				setState(155);
				((CtelistContext)_localctx).ctelist = ctelist();

				        utils.addDefine((((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null), ((CtelistContext)_localctx).simpvalue.res);
				        ((CtelistContext)_localctx).res =  ((CtelistContext)_localctx).ctelist.res;
				      
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((CtelistContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarContext extends ParserRuleContext {
		public String res;
		public VarlistContext varlist;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__5);
			setState(162);
			((DefvarContext)_localctx).varlist = varlist();
			setState(163);
			match(T__1);
			 ((DefvarContext)_localctx).res =  ((DefvarContext)_localctx).varlist.res + ";\n"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public InitContext init;
		public Varlist_AUXContext varlist_AUX;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist_AUXContext varlist_AUX() {
			return getRuleContext(Varlist_AUXContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(167);
			((VarlistContext)_localctx).init = init();
			setState(168);
			((VarlistContext)_localctx).varlist_AUX = varlist_AUX();

			        ((VarlistContext)_localctx).res =  (((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null) + utils.getDimActual() + ((VarlistContext)_localctx).init.res + ((VarlistContext)_localctx).varlist_AUX.res;
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Varlist_AUXContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public InitContext init;
		public Varlist_AUXContext varlist_AUX;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist_AUXContext varlist_AUX() {
			return getRuleContext(Varlist_AUXContext.class,0);
		}
		public Varlist_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterVarlist_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitVarlist_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitVarlist_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlist_AUXContext varlist_AUX() throws RecognitionException {
		Varlist_AUXContext _localctx = new Varlist_AUXContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varlist_AUX);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__3);
				setState(172);
				((Varlist_AUXContext)_localctx).IDENT = match(IDENT);
				setState(173);
				((Varlist_AUXContext)_localctx).init = init();
				setState(174);
				((Varlist_AUXContext)_localctx).varlist_AUX = varlist_AUX();

				        ((Varlist_AUXContext)_localctx).res =  ", " + (((Varlist_AUXContext)_localctx).IDENT!=null?((Varlist_AUXContext)_localctx).IDENT.getText():null) + utils.getDimActual() + ((Varlist_AUXContext)_localctx).init.res + ((Varlist_AUXContext)_localctx).varlist_AUX.res;
				    
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((Varlist_AUXContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public String res;
		public SimpvalueContext simpvalue;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_init);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__6);
				setState(181);
				((InitContext)_localctx).simpvalue = simpvalue();
				 ((InitContext)_localctx).res =  " = " + ((InitContext)_localctx).simpvalue.res; 
				}
				break;
			case T__1:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				 ((InitContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public String res;
		public CharlengthContext charlength;
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__7);
				 ((TipoContext)_localctx).res =  "int"; utils.setDimActual(""); subprogramasUtils.setTipoActual("int"); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__8);
				 ((TipoContext)_localctx).res =  "float"; utils.setDimActual(""); subprogramasUtils.setTipoActual("float"); 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(T__9);
				setState(192);
				((TipoContext)_localctx).charlength = charlength();
				 ((TipoContext)_localctx).res =  "char"; utils.setDimActual(((TipoContext)_localctx).charlength.res); subprogramasUtils.setTipoActual("char"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CharlengthContext extends ParserRuleContext {
		public String res;
		public Token NUM_INT_CONST;
		public TerminalNode NUM_INT_CONST() { return getToken(calculoCientificoToCParser.NUM_INT_CONST, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitCharlength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitCharlength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_charlength);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__10);
				setState(198);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(199);
				match(T__11);
				 ((CharlengthContext)_localctx).res =  "[" + (((CharlengthContext)_localctx).NUM_INT_CONST!=null?((CharlengthContext)_localctx).NUM_INT_CONST.getText():null) + "]"; 
				}
				break;
			case T__3:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				 ((CharlengthContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public String res;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public TerminalNode NUM_INT_CONST() { return getToken(calculoCientificoToCParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(calculoCientificoToCParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(calculoCientificoToCParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(calculoCientificoToCParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(calculoCientificoToCParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(calculoCientificoToCParser.NUM_INT_CONST_H, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpvalue);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((SimpvalueContext)_localctx).res =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null); 
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				 ((SimpvalueContext)_localctx).res =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null); 
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				 ((SimpvalueContext)_localctx).res =  utils.normalizarString((((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null)); 
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				 ((SimpvalueContext)_localctx).res =  "0b" + (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).substring(2, (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).length()-1); 
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				 ((SimpvalueContext)_localctx).res =  "0o" + (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).substring(2, (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).length()-1); 
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				 ((SimpvalueContext)_localctx).res =  "0x" + (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null).substring(2, (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null).length()-1); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CabeceraContext extends ParserRuleContext {
		public String res;
		public CablistContext cablist;
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitCabecera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitCabecera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cabecera);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__12);
				setState(219);
				((CabeceraContext)_localctx).cablist = cablist();
				setState(220);
				match(T__2);
				setState(221);
				match(T__12);
				 ((CabeceraContext)_localctx).res =  ((CabeceraContext)_localctx).cablist.res; 
				}
				break;
			case T__2:
			case T__19:
			case T__20:
			case T__21:
			case T__30:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				 ((CabeceraContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CablistContext extends ParserRuleContext {
		public String res;
		public DecprocContext decproc;
		public DecsubprogContext decsubprog;
		public DecfunContext decfun;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitCablist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitCablist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cablist);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((CablistContext)_localctx).decproc = decproc();
				setState(228);
				((CablistContext)_localctx).decsubprog = decsubprog();
				 ((CablistContext)_localctx).res =  ((CablistContext)_localctx).decproc.res + ((CablistContext)_localctx).decsubprog.res; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				((CablistContext)_localctx).decfun = decfun();
				setState(232);
				((CablistContext)_localctx).decsubprog = decsubprog();
				 ((CablistContext)_localctx).res =  ((CablistContext)_localctx).decfun.res + ((CablistContext)_localctx).decsubprog.res; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecsubprogContext extends ParserRuleContext {
		public String res;
		public DecprocContext decproc;
		public DecsubprogContext decsubprog;
		public DecfunContext decfun;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDecsubprog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDecsubprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decsubprog);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((DecsubprogContext)_localctx).decproc = decproc();
				setState(238);
				((DecsubprogContext)_localctx).decsubprog = decsubprog();
				 ((DecsubprogContext)_localctx).res =  ((DecsubprogContext)_localctx).decproc.res + ((DecsubprogContext)_localctx).decsubprog.res; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((DecsubprogContext)_localctx).decfun = decfun();
				setState(242);
				((DecsubprogContext)_localctx).decsubprog = decsubprog();
				 ((DecsubprogContext)_localctx).res =  ((DecsubprogContext)_localctx).decfun.res + ((DecsubprogContext)_localctx).decsubprog.res; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				 ((DecsubprogContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecprocContext extends ParserRuleContext {
		public String res;
		public Token id1;
		public Token id2;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(calculoCientificoToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(calculoCientificoToCParser.IDENT, i);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDecproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDecproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__13);
			setState(249);
			((DecprocContext)_localctx).id1 = match(IDENT);
			 subprogramasUtils.iniciar((((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null)); 
			setState(251);
			formal_paramlist();
			setState(252);
			dec_s_paramlist();
			setState(253);
			match(T__2);
			setState(254);
			match(T__13);
			setState(255);
			((DecprocContext)_localctx).id2 = match(IDENT);

			        if(!(((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null).equals((((DecprocContext)_localctx).id2!=null?((DecprocContext)_localctx).id2.getText():null))) {
			            System.err.println("Error [Línea " + ((DecprocContext)_localctx).id2.getLine() + ", Columna " + ((DecprocContext)_localctx).id2.getCharPositionInLine() +
			                               "]: Posible causa: El nombre de la subrutina en el cierre de la cabecera ('" + (((DecprocContext)_localctx).id2!=null?((DecprocContext)_localctx).id2.getText():null) +
			                               "') no coincide con su declaración ('" + (((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        subprogramasUtils.validarParametros();
			        ((DecprocContext)_localctx).res =  "void " + (((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null) + "(" + subprogramasUtils.generarFirmaC() + ");\n";
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecfunContext extends ParserRuleContext {
		public String res;
		public Token id1;
		public TipoContext tipo;
		public Token id2;
		public Token id3;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(calculoCientificoToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(calculoCientificoToCParser.IDENT, i);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDecfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDecfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__14);
			setState(259);
			((DecfunContext)_localctx).id1 = match(IDENT);
			 subprogramasUtils.iniciar((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null)); 
			setState(261);
			match(T__10);
			setState(262);
			nomparamlist();
			setState(263);
			match(T__11);
			setState(264);
			((DecfunContext)_localctx).tipo = tipo();
			setState(265);
			match(T__5);
			setState(266);
			((DecfunContext)_localctx).id2 = match(IDENT);
			setState(267);
			match(T__1);
			setState(268);
			dec_f_paramlist();
			setState(269);
			match(T__2);
			setState(270);
			match(T__14);
			setState(271);
			((DecfunContext)_localctx).id3 = match(IDENT);

			        if(!(((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null).equals((((DecfunContext)_localctx).id3!=null?((DecfunContext)_localctx).id3.getText():null))) {
			            System.err.println("Error [Línea " + ((DecfunContext)_localctx).id3.getLine() + ", Columna " + ((DecfunContext)_localctx).id3.getCharPositionInLine() +
			                               "]: Posible causa: El nombre de la funcion en el cierre de la cabecera ('" + (((DecfunContext)_localctx).id3!=null?((DecfunContext)_localctx).id3.getText():null) +
			                               "') no coincide con su declaración ('" + (((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        if(!(((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null).equals((((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null))) {
			            System.err.println("Error [Línea " + ((DecfunContext)_localctx).id2.getLine() + ", Columna " + ((DecfunContext)_localctx).id2.getCharPositionInLine() +
			                               "]: Posible causa: El identificador de la variable de retorno ('" + (((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null) +
			                               "') no coincide con el nombre de la funcion ('" + (((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        subprogramasUtils.validarParametros();
			        ((DecfunContext)_localctx).res =  ((DecfunContext)_localctx).tipo.res + " " + (((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null) + "(" + subprogramasUtils.generarFirmaC() + ");\n";
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlistContext extends ParserRuleContext {
		public String res;
		public NomparamlistContext nomparamlist;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_paramlist);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__10);
				setState(275);
				((Formal_paramlistContext)_localctx).nomparamlist = nomparamlist();
				setState(276);
				match(T__11);
				 ((Formal_paramlistContext)_localctx).res =  "(" + ((Formal_paramlistContext)_localctx).nomparamlist.res + ")"; 
				}
				break;
			case T__2:
			case T__7:
			case T__8:
			case T__9:
			case T__19:
			case T__20:
			case T__21:
			case T__30:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				 ((Formal_paramlistContext)_localctx).res =  "(void)"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class NomparamlistContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public Nomparamlist_AUXContext nomparamlist_AUX;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public Nomparamlist_AUXContext nomparamlist_AUX() {
			return getRuleContext(Nomparamlist_AUXContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitNomparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitNomparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nomparamlist);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				((NomparamlistContext)_localctx).IDENT = match(IDENT);
				 subprogramasUtils.registrarParametro((((NomparamlistContext)_localctx).IDENT!=null?((NomparamlistContext)_localctx).IDENT.getText():null)); 
				setState(284);
				((NomparamlistContext)_localctx).nomparamlist_AUX = nomparamlist_AUX();
				 ((NomparamlistContext)_localctx).res =  (((NomparamlistContext)_localctx).IDENT!=null?((NomparamlistContext)_localctx).IDENT.getText():null) + ((NomparamlistContext)_localctx).nomparamlist_AUX.res; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				 ((NomparamlistContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nomparamlist_AUXContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public Nomparamlist_AUXContext nomparamlist_AUX;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public Nomparamlist_AUXContext nomparamlist_AUX() {
			return getRuleContext(Nomparamlist_AUXContext.class,0);
		}
		public Nomparamlist_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterNomparamlist_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitNomparamlist_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitNomparamlist_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nomparamlist_AUXContext nomparamlist_AUX() throws RecognitionException {
		Nomparamlist_AUXContext _localctx = new Nomparamlist_AUXContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nomparamlist_AUX);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(T__3);
				setState(291);
				((Nomparamlist_AUXContext)_localctx).IDENT = match(IDENT);
				 subprogramasUtils.registrarParametro((((Nomparamlist_AUXContext)_localctx).IDENT!=null?((Nomparamlist_AUXContext)_localctx).IDENT.getText():null)); 
				setState(293);
				((Nomparamlist_AUXContext)_localctx).nomparamlist_AUX = nomparamlist_AUX();
				 ((Nomparamlist_AUXContext)_localctx).res =  ", " + (((Nomparamlist_AUXContext)_localctx).IDENT!=null?((Nomparamlist_AUXContext)_localctx).IDENT.getText():null) + ((Nomparamlist_AUXContext)_localctx).nomparamlist_AUX.res; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				 ((Nomparamlist_AUXContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public TipoparamContext tipoparam;
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDec_s_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDec_s_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist() throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dec_s_paramlist);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				tipo();
				setState(300);
				match(T__3);
				setState(301);
				match(T__15);
				setState(302);
				match(T__10);
				setState(303);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(304);
				match(T__11);
				setState(305);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(306);
				match(T__1);
				 subprogramasUtils.asignarTipoYModo((((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), ((Dec_s_paramlistContext)_localctx).tipoparam.res); 
				setState(308);
				dec_s_paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public Token IDENT;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDec_f_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDec_f_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dec_f_paramlist);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				tipo();
				setState(314);
				match(T__3);
				setState(315);
				match(T__15);
				setState(316);
				match(T__10);
				setState(317);
				match(T__16);
				setState(318);
				match(T__11);
				setState(319);
				((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(320);
				match(T__1);
				 subprogramasUtils.asignarTipoYModo((((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), "IN"); 
				setState(322);
				dec_f_paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoparamContext extends ParserRuleContext {
		public String res;
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitTipoparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitTipoparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tipoparam);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(T__16);
				 ((TipoparamContext)_localctx).res =  "IN"; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__17);
				 ((TipoparamContext)_localctx).res =  "OUT"; 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(T__18);
				 ((TipoparamContext)_localctx).res =  "INOUT"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public String res;
		public SentContext sent;
		public Sentlist_AUXContext sentlist_AUX;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_AUXContext sentlist_AUX() {
			return getRuleContext(Sentlist_AUXContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sentlist);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((SentlistContext)_localctx).sent = sent();
				setState(336);
				((SentlistContext)_localctx).sentlist_AUX = sentlist_AUX();
				 ((SentlistContext)_localctx).res =  ((SentlistContext)_localctx).sent.res + ((SentlistContext)_localctx).sentlist_AUX.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((SentlistContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentlist_AUXContext extends ParserRuleContext {
		public String res;
		public SentContext sent;
		public Sentlist_AUXContext sentlist_AUX;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_AUXContext sentlist_AUX() {
			return getRuleContext(Sentlist_AUXContext.class,0);
		}
		public Sentlist_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterSentlist_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitSentlist_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitSentlist_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist_AUXContext sentlist_AUX() throws RecognitionException {
		Sentlist_AUXContext _localctx = new Sentlist_AUXContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sentlist_AUX);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				((Sentlist_AUXContext)_localctx).sent = sent();
				setState(343);
				((Sentlist_AUXContext)_localctx).sentlist_AUX = sentlist_AUX();
				 ((Sentlist_AUXContext)_localctx).res =  ((Sentlist_AUXContext)_localctx).sent.res + ((Sentlist_AUXContext)_localctx).sentlist_AUX.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((Sentlist_AUXContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public Sent_AUXContext sent_AUX;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public If_tailContext if_tail;
		public Do_tailContext do_tail;
		public ExpContext exp;
		public CasosContext casos;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public Sent_AUXContext sent_AUX() {
			return getRuleContext(Sent_AUXContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public If_tailContext if_tail() {
			return getRuleContext(If_tailContext.class,0);
		}
		public Do_tailContext do_tail() {
			return getRuleContext(Do_tailContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sent);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(350);
				((SentContext)_localctx).sent_AUX = sent_AUX();

				        if (subprogramasUtils.esReturn((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null))) {
				            // Si es la función actual, armamos el return
				            ((SentContext)_localctx).res =  "\treturn " + ((SentContext)_localctx).sent_AUX.res + ";\n";
				        } else {
				           // Comprobamos si es un parámetro por referencia para inyectar '*'
				           String prefijo = subprogramasUtils.esParametroReferencia((((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null)) ? "*" : "";
				           ((SentContext)_localctx).res =  "\t" + prefijo + (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null) + " = " + ((SentContext)_localctx).sent_AUX.res + ";\n";
				        }
				    
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				((SentContext)_localctx).proc_call = proc_call();
				setState(354);
				match(T__1);
				 ((SentContext)_localctx).res =  "\t" + ((SentContext)_localctx).proc_call.res + ";\n"; 
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(T__19);
				setState(358);
				match(T__10);
				setState(359);
				((SentContext)_localctx).expcond = expcond();
				setState(360);
				match(T__11);
				setState(361);
				((SentContext)_localctx).if_tail = if_tail();

				        ((SentContext)_localctx).res =  "\tif (" + ((SentContext)_localctx).expcond.res + ") " + ((SentContext)_localctx).if_tail.res;
				    
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(T__20);
				setState(365);
				((SentContext)_localctx).do_tail = do_tail();

				        ((SentContext)_localctx).res =  "\t" + ((SentContext)_localctx).do_tail.res;
				    
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				match(T__21);
				setState(369);
				match(T__22);
				setState(370);
				match(T__10);
				setState(371);
				((SentContext)_localctx).exp = exp();
				setState(372);
				match(T__11);
				setState(373);
				((SentContext)_localctx).casos = casos();
				setState(374);
				match(T__2);
				setState(375);
				match(T__21);

				        ((SentContext)_localctx).res =  "\tswitch (" + ((SentContext)_localctx).exp.res + ") {\n" + ((SentContext)_localctx).casos.res + "\t}\n";
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_tailContext extends ParserRuleContext {
		public String res;
		public SentContext sent;
		public SentlistContext sentlist;
		public If_else_tailContext if_else_tail;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public If_else_tailContext if_else_tail() {
			return getRuleContext(If_else_tailContext.class,0);
		}
		public If_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterIf_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitIf_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitIf_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tailContext if_tail() throws RecognitionException {
		If_tailContext _localctx = new If_tailContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_if_tail);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
			case T__30:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((If_tailContext)_localctx).sent = sent();
				 ((If_tailContext)_localctx).res =  "\n\t" + ((If_tailContext)_localctx).sent.res; 
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(T__23);
				setState(384);
				((If_tailContext)_localctx).sentlist = sentlist();
				setState(385);
				((If_tailContext)_localctx).if_else_tail = if_else_tail();

				        ((If_tailContext)_localctx).res =  "{\n" + ((If_tailContext)_localctx).sentlist.res.replace("\t","\t\t") + ((If_tailContext)_localctx).if_else_tail.res;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_else_tailContext extends ParserRuleContext {
		public String res;
		public SentlistContext sentlist;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public If_else_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterIf_else_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitIf_else_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitIf_else_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_tailContext if_else_tail() throws RecognitionException {
		If_else_tailContext _localctx = new If_else_tailContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_if_else_tail);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(T__24);
				 ((If_else_tailContext)_localctx).res =  "\t}\n"; 
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(T__25);
				setState(393);
				((If_else_tailContext)_localctx).sentlist = sentlist();
				setState(394);
				match(T__24);
				 ((If_else_tailContext)_localctx).res =  "\t} else {\n" + ((If_else_tailContext)_localctx).sentlist.res.replace("\t","\t\t") + "\t}\n"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_tailContext extends ParserRuleContext {
		public String res;
		public ExpcondContext expcond;
		public SentlistContext sentlist;
		public Token IDENT;
		public DovalContext ini;
		public DovalContext limite;
		public DovalContext inc;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public Do_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDo_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDo_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDo_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_tailContext do_tail() throws RecognitionException {
		Do_tailContext _localctx = new Do_tailContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_do_tail);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(T__26);
				setState(400);
				match(T__10);
				setState(401);
				((Do_tailContext)_localctx).expcond = expcond();
				setState(402);
				match(T__11);
				setState(403);
				((Do_tailContext)_localctx).sentlist = sentlist();
				setState(404);
				match(T__27);

				        ((Do_tailContext)_localctx).res =  "while (" + ((Do_tailContext)_localctx).expcond.res + ") {\n" + ((Do_tailContext)_localctx).sentlist.res.replace("\t","\t\t") + "\t}\n";
				    
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				((Do_tailContext)_localctx).IDENT = match(IDENT);
				setState(408);
				match(T__6);
				setState(409);
				((Do_tailContext)_localctx).ini = doval();
				setState(410);
				match(T__3);
				setState(411);
				((Do_tailContext)_localctx).limite = doval();
				setState(412);
				match(T__3);
				setState(413);
				((Do_tailContext)_localctx).inc = doval();
				setState(414);
				((Do_tailContext)_localctx).sentlist = sentlist();
				setState(415);
				match(T__27);

				        ((Do_tailContext)_localctx).res =  "for(" + (((Do_tailContext)_localctx).IDENT!=null?((Do_tailContext)_localctx).IDENT.getText():null) + " = " + ((Do_tailContext)_localctx).ini.res + "; " + (((Do_tailContext)_localctx).IDENT!=null?((Do_tailContext)_localctx).IDENT.getText():null) + " != " + ((Do_tailContext)_localctx).limite.res + "; " + (((Do_tailContext)_localctx).IDENT!=null?((Do_tailContext)_localctx).IDENT.getText():null) + " = " + (((Do_tailContext)_localctx).IDENT!=null?((Do_tailContext)_localctx).IDENT.getText():null) + " + " + ((Do_tailContext)_localctx).inc.res + ") {\n" + ((Do_tailContext)_localctx).sentlist.res.replace("\t","\t\t") + "\t}\n";
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DovalContext extends ParserRuleContext {
		public String res;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(calculoCientificoToCParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitDoval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitDoval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_doval);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((DovalContext)_localctx).res =  (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				((DovalContext)_localctx).IDENT = match(IDENT);
				 ((DovalContext)_localctx).res =  (((DovalContext)_localctx).IDENT!=null?((DovalContext)_localctx).IDENT.getText():null); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CasosContext extends ParserRuleContext {
		public String res;
		public EtiquetasContext etiquetas;
		public SentlistContext sentlist;
		public CasosContext casos;
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_casos);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(T__22);
				setState(427);
				match(T__10);
				setState(428);
				((CasosContext)_localctx).etiquetas = etiquetas();
				setState(429);
				match(T__11);
				setState(430);
				((CasosContext)_localctx).sentlist = sentlist();
				setState(431);
				((CasosContext)_localctx).casos = casos();

				        // Añadimos el break; a todos los casos normales
				        ((CasosContext)_localctx).res =  ((CasosContext)_localctx).etiquetas.res + ((CasosContext)_localctx).sentlist.res.replace("\t", "\t\t\t") + "\t\t\tbreak;\n" + ((CasosContext)_localctx).casos.res;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(T__22);
				setState(435);
				match(T__28);
				setState(436);
				((CasosContext)_localctx).sentlist = sentlist();

				        // El caso por defecto no lleva break;
				        ((CasosContext)_localctx).res =  "\t\tdefault:\n" + ((CasosContext)_localctx).sentlist.res.replace("\t", "\t\t\t");
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ((CasosContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetasContext extends ParserRuleContext {
		public String res;
		public SimpvalueContext simpvalue;
		public Eti_tailContext eti_tail;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Eti_tailContext eti_tail() {
			return getRuleContext(Eti_tailContext.class,0);
		}
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitEtiquetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitEtiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_etiquetas);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(T__29);
				setState(443);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();

				        ((EtiquetasContext)_localctx).res =  "\t\tcase < " + ((EtiquetasContext)_localctx).simpvalue.res + ":\n";
				    
				}
				break;
			case NUM_INT_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				setState(447);
				((EtiquetasContext)_localctx).eti_tail = eti_tail(((EtiquetasContext)_localctx).simpvalue.res);

				        ((EtiquetasContext)_localctx).res =  ((EtiquetasContext)_localctx).eti_tail.res;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Eti_tailContext extends ParserRuleContext {
		public String val;
		public String res;
		public ListaetiquetasContext listaetiquetas;
		public SimpvalueContext simpvalue;
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Eti_tailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Eti_tailContext(ParserRuleContext parent, int invokingState, String val) {
			super(parent, invokingState);
			this.val = val;
		}
		@Override public int getRuleIndex() { return RULE_eti_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterEti_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitEti_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitEti_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eti_tailContext eti_tail(String val) throws RecognitionException {
		Eti_tailContext _localctx = new Eti_tailContext(_ctx, getState(), val);
		enterRule(_localctx, 66, RULE_eti_tail);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				((Eti_tailContext)_localctx).listaetiquetas = listaetiquetas();

				        ((Eti_tailContext)_localctx).res =  "\t\tcase " + _localctx.val + ":\n" + ((Eti_tailContext)_localctx).listaetiquetas.res;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(T__29);
				setState(456);
				((Eti_tailContext)_localctx).simpvalue = simpvalue();

				        ((Eti_tailContext)_localctx).res =  "\t\tcase " + _localctx.val + " to " + ((Eti_tailContext)_localctx).simpvalue.res + ":\n";
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(T__29);

				        ((Eti_tailContext)_localctx).res =  "\t\tcase > " + _localctx.val + ":\n";
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaetiquetasContext extends ParserRuleContext {
		public String res;
		public SimpvalueContext simpvalue;
		public ListaetiquetasContext listaetiquetas;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiquetasContext listaetiquetas() {
			return getRuleContext(ListaetiquetasContext.class,0);
		}
		public ListaetiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaetiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterListaetiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitListaetiquetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitListaetiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaetiquetasContext listaetiquetas() throws RecognitionException {
		ListaetiquetasContext _localctx = new ListaetiquetasContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listaetiquetas);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(T__3);
				setState(464);
				((ListaetiquetasContext)_localctx).simpvalue = simpvalue();
				setState(465);
				((ListaetiquetasContext)_localctx).listaetiquetas = listaetiquetas();

				        ((ListaetiquetasContext)_localctx).res =  "\t\tcase " + ((ListaetiquetasContext)_localctx).simpvalue.res + ":\n" + ((ListaetiquetasContext)_localctx).listaetiquetas.res;
				    
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaetiquetasContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sent_AUXContext extends ParserRuleContext {
		public String res;
		public ExpContext exp;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Sent_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterSent_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitSent_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitSent_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_AUXContext sent_AUX() throws RecognitionException {
		Sent_AUXContext _localctx = new Sent_AUXContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sent_AUX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__6);
			setState(472);
			((Sent_AUXContext)_localctx).exp = exp();
			setState(473);
			match(T__1);
			 ((Sent_AUXContext)_localctx).res =  ((Sent_AUXContext)_localctx).exp.res; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_callContext extends ParserRuleContext {
		public String res;
		public Token IDENT;
		public SubpparamlistContext subpparamlist;
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__30);
			setState(477);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			 subprogramasUtils.iniciarLlamada((((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null)); 
			setState(479);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();

			        ((Proc_callContext)_localctx).res =  (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null) + ((Proc_callContext)_localctx).subpparamlist.res;
			        subprogramasUtils.finalizarLlamada();
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubpparamlistContext extends ParserRuleContext {
		public String res;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_subpparamlist);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(T__10);
				 String pref = subprogramasUtils.procesarArgumento(); 
				setState(484);
				((SubpparamlistContext)_localctx).exp = exp();
				setState(485);
				((SubpparamlistContext)_localctx).explist = explist();
				setState(486);
				match(T__11);
				 ((SubpparamlistContext)_localctx).res =  "(" + pref + ((SubpparamlistContext)_localctx).exp.res + ((SubpparamlistContext)_localctx).explist.res + ")"; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((SubpparamlistContext)_localctx).res =  "()"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public String res;
		public TerminoContext termino;
		public Exp_AUXContext exp_AUX;
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp_AUXContext exp_AUX() {
			return getRuleContext(Exp_AUXContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			((ExpContext)_localctx).termino = termino();
			setState(493);
			((ExpContext)_localctx).exp_AUX = exp_AUX();
			 ((ExpContext)_localctx).res =  ((ExpContext)_localctx).termino.res + ((ExpContext)_localctx).exp_AUX.res; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_AUXContext extends ParserRuleContext {
		public String res;
		public Operador_sumasContext operador_sumas;
		public TerminoContext termino;
		public Exp_AUXContext exp_AUX;
		public Operador_sumasContext operador_sumas() {
			return getRuleContext(Operador_sumasContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp_AUXContext exp_AUX() {
			return getRuleContext(Exp_AUXContext.class,0);
		}
		public Exp_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterExp_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitExp_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitExp_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_AUXContext exp_AUX() throws RecognitionException {
		Exp_AUXContext _localctx = new Exp_AUXContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_exp_AUX);
		try {
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				((Exp_AUXContext)_localctx).operador_sumas = operador_sumas();
				setState(497);
				((Exp_AUXContext)_localctx).termino = termino();
				setState(498);
				((Exp_AUXContext)_localctx).exp_AUX = exp_AUX();
				 ((Exp_AUXContext)_localctx).res =  " " + ((Exp_AUXContext)_localctx).operador_sumas.res + " " + ((Exp_AUXContext)_localctx).termino.res + ((Exp_AUXContext)_localctx).exp_AUX.res; 
				}
				break;
			case T__1:
			case T__3:
			case T__11:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case OP_OR:
			case OP_AND:
			case OP_EQV:
			case OP_NEQV:
				enterOuterAlt(_localctx, 2);
				{
				 ((Exp_AUXContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_sumasContext extends ParserRuleContext {
		public String res;
		public Operador_sumasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_sumas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterOperador_sumas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitOperador_sumas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitOperador_sumas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_sumasContext operador_sumas() throws RecognitionException {
		Operador_sumasContext _localctx = new Operador_sumasContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operador_sumas);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(T__31);
				 ((Operador_sumasContext)_localctx).res = "+"; 
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(T__32);
				 ((Operador_sumasContext)_localctx).res = "-"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public String res;
		public FactorContext factor;
		public Termino_AUXContext termino_AUX;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino_AUXContext termino_AUX() {
			return getRuleContext(Termino_AUXContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			((TerminoContext)_localctx).factor = factor();
			setState(511);
			((TerminoContext)_localctx).termino_AUX = termino_AUX();
			 ((TerminoContext)_localctx).res =  ((TerminoContext)_localctx).factor.res + ((TerminoContext)_localctx).termino_AUX.res; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termino_AUXContext extends ParserRuleContext {
		public String res;
		public Operador_multiplicacionesContext operador_multiplicaciones;
		public FactorContext factor;
		public Termino_AUXContext termino_AUX;
		public Operador_multiplicacionesContext operador_multiplicaciones() {
			return getRuleContext(Operador_multiplicacionesContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino_AUXContext termino_AUX() {
			return getRuleContext(Termino_AUXContext.class,0);
		}
		public Termino_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterTermino_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitTermino_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitTermino_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termino_AUXContext termino_AUX() throws RecognitionException {
		Termino_AUXContext _localctx = new Termino_AUXContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_termino_AUX);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				((Termino_AUXContext)_localctx).operador_multiplicaciones = operador_multiplicaciones();
				setState(515);
				((Termino_AUXContext)_localctx).factor = factor();
				setState(516);
				((Termino_AUXContext)_localctx).termino_AUX = termino_AUX();
				 ((Termino_AUXContext)_localctx).res =  " " + ((Termino_AUXContext)_localctx).operador_multiplicaciones.res + " " + ((Termino_AUXContext)_localctx).factor.res + ((Termino_AUXContext)_localctx).termino_AUX.res; 
				}
				break;
			case T__1:
			case T__3:
			case T__11:
			case T__31:
			case T__32:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case OP_OR:
			case OP_AND:
			case OP_EQV:
			case OP_NEQV:
				enterOuterAlt(_localctx, 2);
				{
				 ((Termino_AUXContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operador_multiplicacionesContext extends ParserRuleContext {
		public String res;
		public Operador_multiplicacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_multiplicaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterOperador_multiplicaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitOperador_multiplicaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitOperador_multiplicaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_multiplicacionesContext operador_multiplicaciones() throws RecognitionException {
		Operador_multiplicacionesContext _localctx = new Operador_multiplicacionesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operador_multiplicaciones);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(T__33);
				 ((Operador_multiplicacionesContext)_localctx).res = "*"; 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(T__34);
				 ((Operador_multiplicacionesContext)_localctx).res = "/"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String res;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENT;
		public Factor_AUXContext factor_AUX;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(calculoCientificoToCParser.IDENT, 0); }
		public Factor_AUXContext factor_AUX() {
			return getRuleContext(Factor_AUXContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_factor);
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				((FactorContext)_localctx).simpvalue = simpvalue();
				 ((FactorContext)_localctx).res =  ((FactorContext)_localctx).simpvalue.res; 
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(T__10);
				setState(532);
				((FactorContext)_localctx).exp = exp();
				setState(533);
				match(T__11);
				 ((FactorContext)_localctx).res =  "(" + ((FactorContext)_localctx).exp.res + ")"; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				((FactorContext)_localctx).IDENT = match(IDENT);
				 subprogramasUtils.iniciarLlamada((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null)); 
				setState(538);
				((FactorContext)_localctx).factor_AUX = factor_AUX();

				        subprogramasUtils.finalizarLlamada();
				        if (((FactorContext)_localctx).factor_AUX.res.isEmpty()) {
				            // Es una variable simple, inyectamos '*' si es necesario
				            String prefijo = subprogramasUtils.esParametroReferencia((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null)) ? "*" : "";
				            ((FactorContext)_localctx).res =  prefijo + (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null);
				        } else {
				            // Es una llamada a función
				            ((FactorContext)_localctx).res =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + ((FactorContext)_localctx).factor_AUX.res;
				        }
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_AUXContext extends ParserRuleContext {
		public String res;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Factor_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterFactor_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitFactor_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitFactor_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_AUXContext factor_AUX() throws RecognitionException {
		Factor_AUXContext _localctx = new Factor_AUXContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_factor_AUX);
		try {
			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(T__10);
				 String pref = subprogramasUtils.procesarArgumento(); 
				setState(545);
				((Factor_AUXContext)_localctx).exp = exp();
				setState(546);
				((Factor_AUXContext)_localctx).explist = explist();
				setState(547);
				match(T__11);
				 ((Factor_AUXContext)_localctx).res =  "(" + pref + ((Factor_AUXContext)_localctx).exp.res + ((Factor_AUXContext)_localctx).explist.res + ")"; 
				}
				break;
			case T__1:
			case T__3:
			case T__11:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case OP_OR:
			case OP_AND:
			case OP_EQV:
			case OP_NEQV:
				enterOuterAlt(_localctx, 2);
				{
				 ((Factor_AUXContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public String res;
		public ExpContext exp;
		public ExplistContext explist;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_explist);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(T__3);
				 String pref = subprogramasUtils.procesarArgumento(); 
				setState(555);
				((ExplistContext)_localctx).exp = exp();
				setState(556);
				((ExplistContext)_localctx).explist = explist();
				 ((ExplistContext)_localctx).res =  ", " + pref + ((ExplistContext)_localctx).exp.res + ((ExplistContext)_localctx).explist.res; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExplistContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public String res;
		public FactorcondContext factorcond;
		public Expcond_AUXContext expcond_AUX;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_AUXContext expcond_AUX() {
			return getRuleContext(Expcond_AUXContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			((ExpcondContext)_localctx).factorcond = factorcond();
			setState(563);
			((ExpcondContext)_localctx).expcond_AUX = expcond_AUX();
			 ((ExpcondContext)_localctx).res =  ((ExpcondContext)_localctx).factorcond.res + ((ExpcondContext)_localctx).expcond_AUX.res; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expcond_AUXContext extends ParserRuleContext {
		public String res;
		public OplogContext oplog;
		public FactorcondContext factorcond;
		public Expcond_AUXContext expcond_AUX;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_AUXContext expcond_AUX() {
			return getRuleContext(Expcond_AUXContext.class,0);
		}
		public Expcond_AUXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond_AUX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterExpcond_AUX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitExpcond_AUX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitExpcond_AUX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond_AUXContext expcond_AUX() throws RecognitionException {
		Expcond_AUXContext _localctx = new Expcond_AUXContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expcond_AUX);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_OR:
			case OP_AND:
			case OP_EQV:
			case OP_NEQV:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				((Expcond_AUXContext)_localctx).oplog = oplog();
				setState(567);
				((Expcond_AUXContext)_localctx).factorcond = factorcond();
				setState(568);
				((Expcond_AUXContext)_localctx).expcond_AUX = expcond_AUX();
				 ((Expcond_AUXContext)_localctx).res =  " " + ((Expcond_AUXContext)_localctx).oplog.res + " " + ((Expcond_AUXContext)_localctx).factorcond.res + ((Expcond_AUXContext)_localctx).expcond_AUX.res; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				 ((Expcond_AUXContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class OplogContext extends ParserRuleContext {
		public String res;
		public TerminalNode OP_OR() { return getToken(calculoCientificoToCParser.OP_OR, 0); }
		public TerminalNode OP_AND() { return getToken(calculoCientificoToCParser.OP_AND, 0); }
		public TerminalNode OP_EQV() { return getToken(calculoCientificoToCParser.OP_EQV, 0); }
		public TerminalNode OP_NEQV() { return getToken(calculoCientificoToCParser.OP_NEQV, 0); }
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_oplog);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(OP_OR);
				 ((OplogContext)_localctx).res =  "||"; 
				}
				break;
			case OP_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(OP_AND);
				 ((OplogContext)_localctx).res =  "&&"; 
				}
				break;
			case OP_EQV:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(OP_EQV);
				 ((OplogContext)_localctx).res =  "=="; 
				}
				break;
			case OP_NEQV:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(OP_NEQV);
				 ((OplogContext)_localctx).res =  "!="; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorcondContext extends ParserRuleContext {
		public String res;
		public ExpContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode OP_NOT() { return getToken(calculoCientificoToCParser.OP_NOT, 0); }
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public TerminalNode TRUE_CONST() { return getToken(calculoCientificoToCParser.TRUE_CONST, 0); }
		public TerminalNode FALSE_CONST() { return getToken(calculoCientificoToCParser.FALSE_CONST, 0); }
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_factorcond);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				((FactorcondContext)_localctx).e1 = exp();
				setState(585);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(586);
				((FactorcondContext)_localctx).e2 = exp();
				 ((FactorcondContext)_localctx).res =  ((FactorcondContext)_localctx).e1.res + " " + ((FactorcondContext)_localctx).opcomp.res + " " + ((FactorcondContext)_localctx).e2.res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(T__10);
				setState(590);
				((FactorcondContext)_localctx).expcond = expcond();
				setState(591);
				match(T__11);
				 ((FactorcondContext)_localctx).res =  "(" + ((FactorcondContext)_localctx).expcond.res + ")"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(OP_NOT);
				setState(595);
				((FactorcondContext)_localctx).factorcond = factorcond();
				 ((FactorcondContext)_localctx).res =  "!" + ((FactorcondContext)_localctx).factorcond.res; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(598);
				match(TRUE_CONST);
				 ((FactorcondContext)_localctx).res =  "1"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				match(FALSE_CONST);
				 ((FactorcondContext)_localctx).res =  "0"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompContext extends ParserRuleContext {
		public String res;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_opcomp);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(T__35);
				 ((OpcompContext)_localctx).res =  "<"; 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(T__36);
				 ((OpcompContext)_localctx).res =  ">"; 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				match(T__37);
				 ((OpcompContext)_localctx).res =  "<="; 
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
				match(T__38);
				 ((OpcompContext)_localctx).res =  ">="; 
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				match(T__39);
				 ((OpcompContext)_localctx).res =  "=="; 
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(614);
				match(T__40);
				 ((OpcompContext)_localctx).res =  "!="; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubproglistContext extends ParserRuleContext {
		public String res;
		public CodprocContext codproc;
		public SubproglistContext subproglist;
		public CodfunContext codfun;
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitSubproglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitSubproglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_subproglist);
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				((SubproglistContext)_localctx).codproc = codproc();
				setState(619);
				((SubproglistContext)_localctx).subproglist = subproglist();
				 ((SubproglistContext)_localctx).res =  ((SubproglistContext)_localctx).codproc.res + "\n" + ((SubproglistContext)_localctx).subproglist.res; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				((SubproglistContext)_localctx).codfun = codfun();
				setState(623);
				((SubproglistContext)_localctx).subproglist = subproglist();
				 ((SubproglistContext)_localctx).res =  ((SubproglistContext)_localctx).codfun.res + "\n" + ((SubproglistContext)_localctx).subproglist.res; 
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				 ((SubproglistContext)_localctx).res =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodfunContext extends ParserRuleContext {
		public String res;
		public Token id1;
		public TipoContext tipo;
		public Token id2;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public Token id_ret;
		public ExpContext exp;
		public Token id3;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(calculoCientificoToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(calculoCientificoToCParser.IDENT, i);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitCodfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitCodfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(T__14);
			setState(630);
			((CodfunContext)_localctx).id1 = match(IDENT);
			 subprogramasUtils.iniciar((((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null)); 
			setState(632);
			match(T__10);
			setState(633);
			nomparamlist();
			setState(634);
			match(T__11);
			setState(635);
			((CodfunContext)_localctx).tipo = tipo();
			setState(636);
			match(T__5);
			setState(637);
			((CodfunContext)_localctx).id2 = match(IDENT);
			setState(638);
			match(T__1);
			setState(639);
			dec_f_paramlist();
			setState(640);
			((CodfunContext)_localctx).dcllist = dcllist();
			setState(641);
			((CodfunContext)_localctx).sentlist = sentlist();
			setState(642);
			((CodfunContext)_localctx).id_ret = match(IDENT);
			setState(643);
			match(T__6);
			setState(644);
			((CodfunContext)_localctx).exp = exp();
			setState(645);
			match(T__1);
			setState(646);
			match(T__2);
			setState(647);
			match(T__14);
			setState(648);
			((CodfunContext)_localctx).id3 = match(IDENT);


			        if(!(((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null).equals((((CodfunContext)_localctx).id_ret!=null?((CodfunContext)_localctx).id_ret.getText():null))) {
			            System.err.println("Error [Línea " + ((CodfunContext)_localctx).id_ret.getLine() + ", Columna " + ((CodfunContext)_localctx).id_ret.getCharPositionInLine() +
			                              "]: Posible causa: El nombre de la subrutina en el cierre de la implementacion ('" + (((CodfunContext)_localctx).id_ret!=null?((CodfunContext)_localctx).id_ret.getText():null) +
			                              "') no coincide con su declaración ('" + (((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        if(!(((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null).equals((((CodfunContext)_localctx).id3!=null?((CodfunContext)_localctx).id3.getText():null))) {
			            System.err.println("Error [Línea " + ((CodfunContext)_localctx).id3.getLine() + ", Columna " + ((CodfunContext)_localctx).id3.getCharPositionInLine() +
			                               "]: Posible causa: El nombre de la funcion en el cierre de la implementacion ('" + (((CodfunContext)_localctx).id3!=null?((CodfunContext)_localctx).id3.getText():null) +
			                               "') no coincide con su declaración ('" + (((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        if(!(((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null).equals((((CodfunContext)_localctx).id2!=null?((CodfunContext)_localctx).id2.getText():null))) {
			            System.err.println("Error [Línea " + ((CodfunContext)_localctx).id2.getLine() + ", Columna " + ((CodfunContext)_localctx).id2.getCharPositionInLine() +
			                               "]: Posible causa: El identificador de la variable de retorno en la implementacion ('" + (((CodfunContext)_localctx).id2!=null?((CodfunContext)_localctx).id2.getText():null) +
			                               "') no coincide con el nombre de la funcion ('" + (((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        subprogramasUtils.validarParametros();
			        ((CodfunContext)_localctx).res =  ((CodfunContext)_localctx).tipo.res + " " + (((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null) + "(" + subprogramasUtils.generarFirmaC() + ") {\n" + ((CodfunContext)_localctx).dcllist.res + ((CodfunContext)_localctx).sentlist.res + "\treturn " + ((CodfunContext)_localctx).exp.res + ";\n}\n";    
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

	@SuppressWarnings("CheckReturnValue")
	public static class CodprocContext extends ParserRuleContext {
		public String res;
		public Token id1;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
		public Token id2;
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(calculoCientificoToCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(calculoCientificoToCParser.IDENT, i);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calculoCientificoToCListener ) ((calculoCientificoToCListener)listener).exitCodproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calculoCientificoToCVisitor ) return ((calculoCientificoToCVisitor<? extends T>)visitor).visitCodproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(T__13);
			setState(652);
			((CodprocContext)_localctx).id1 = match(IDENT);
			 subprogramasUtils.iniciar((((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null)); 
			setState(654);
			formal_paramlist();
			setState(655);
			dec_s_paramlist();
			setState(656);
			((CodprocContext)_localctx).dcllist = dcllist();
			setState(657);
			((CodprocContext)_localctx).sentlist = sentlist();
			setState(658);
			match(T__2);
			setState(659);
			match(T__13);
			setState(660);
			((CodprocContext)_localctx).id2 = match(IDENT);

			        if(!(((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null).equals((((CodprocContext)_localctx).id2!=null?((CodprocContext)_localctx).id2.getText():null))){
			            System.err.println("Error [Línea " + ((CodprocContext)_localctx).id2.getLine() + ", Columna " + ((CodprocContext)_localctx).id2.getCharPositionInLine() +
			                               "]: Posible causa: El nombre de la subrutina en el cierre de la implementacion ('" + (((CodprocContext)_localctx).id2!=null?((CodprocContext)_localctx).id2.getText():null) +
			                               "') no coincide con su declaración ('" + (((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null) + "').");
			            hayErroresSemanticos = true;
			        }
			        subprogramasUtils.validarParametros();
			        ((CodprocContext)_localctx).res =  "void " + (((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null) + "(" + subprogramasUtils.generarFirmaC() + ") {\n" + ((CodprocContext)_localctx).dcllist.res + ((CodprocContext)_localctx).sentlist.res + "}\n";    
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
		"\u0004\u00019\u0298\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0080"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008c"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a0\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00b3\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ba\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c4"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00cb\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d9\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e2\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00ec\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00f7\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0119\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0121\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u012a\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0138\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0146\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u014e\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0155\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u015c\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u017b\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0185\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u018e\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a3\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a9\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01b9\b\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01c3\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01ce\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01d6\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01eb\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u01f7\b\'\u0001(\u0001(\u0001(\u0001(\u0003(\u01fd\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0209"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0003+\u020f\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u021e\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0228\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0231"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00030\u023d\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00031\u0247\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u025b\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0269\b3\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00034\u0274\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u0000\u00007\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjl\u0000\u0000\u02a0\u0000n\u0001\u0000\u0000\u0000\u0002"+
		"\u007f\u0001\u0000\u0000\u0000\u0004\u0081\u0001\u0000\u0000\u0000\u0006"+
		"\u008b\u0001\u0000\u0000\u0000\b\u008d\u0001\u0000\u0000\u0000\n\u009f"+
		"\u0001\u0000\u0000\u0000\f\u00a1\u0001\u0000\u0000\u0000\u000e\u00a6\u0001"+
		"\u0000\u0000\u0000\u0010\u00b2\u0001\u0000\u0000\u0000\u0012\u00b9\u0001"+
		"\u0000\u0000\u0000\u0014\u00c3\u0001\u0000\u0000\u0000\u0016\u00ca\u0001"+
		"\u0000\u0000\u0000\u0018\u00d8\u0001\u0000\u0000\u0000\u001a\u00e1\u0001"+
		"\u0000\u0000\u0000\u001c\u00eb\u0001\u0000\u0000\u0000\u001e\u00f6\u0001"+
		"\u0000\u0000\u0000 \u00f8\u0001\u0000\u0000\u0000\"\u0102\u0001\u0000"+
		"\u0000\u0000$\u0118\u0001\u0000\u0000\u0000&\u0120\u0001\u0000\u0000\u0000"+
		"(\u0129\u0001\u0000\u0000\u0000*\u0137\u0001\u0000\u0000\u0000,\u0145"+
		"\u0001\u0000\u0000\u0000.\u014d\u0001\u0000\u0000\u00000\u0154\u0001\u0000"+
		"\u0000\u00002\u015b\u0001\u0000\u0000\u00004\u017a\u0001\u0000\u0000\u0000"+
		"6\u0184\u0001\u0000\u0000\u00008\u018d\u0001\u0000\u0000\u0000:\u01a2"+
		"\u0001\u0000\u0000\u0000<\u01a8\u0001\u0000\u0000\u0000>\u01b8\u0001\u0000"+
		"\u0000\u0000@\u01c2\u0001\u0000\u0000\u0000B\u01cd\u0001\u0000\u0000\u0000"+
		"D\u01d5\u0001\u0000\u0000\u0000F\u01d7\u0001\u0000\u0000\u0000H\u01dc"+
		"\u0001\u0000\u0000\u0000J\u01ea\u0001\u0000\u0000\u0000L\u01ec\u0001\u0000"+
		"\u0000\u0000N\u01f6\u0001\u0000\u0000\u0000P\u01fc\u0001\u0000\u0000\u0000"+
		"R\u01fe\u0001\u0000\u0000\u0000T\u0208\u0001\u0000\u0000\u0000V\u020e"+
		"\u0001\u0000\u0000\u0000X\u021d\u0001\u0000\u0000\u0000Z\u0227\u0001\u0000"+
		"\u0000\u0000\\\u0230\u0001\u0000\u0000\u0000^\u0232\u0001\u0000\u0000"+
		"\u0000`\u023c\u0001\u0000\u0000\u0000b\u0246\u0001\u0000\u0000\u0000d"+
		"\u025a\u0001\u0000\u0000\u0000f\u0268\u0001\u0000\u0000\u0000h\u0273\u0001"+
		"\u0000\u0000\u0000j\u0275\u0001\u0000\u0000\u0000l\u028b\u0001\u0000\u0000"+
		"\u0000no\u0005\u0001\u0000\u0000op\u0005*\u0000\u0000pq\u0005\u0002\u0000"+
		"\u0000qr\u0003\u0002\u0001\u0000rs\u0003\u001a\r\u0000st\u00030\u0018"+
		"\u0000tu\u0005\u0003\u0000\u0000uv\u0005\u0001\u0000\u0000vw\u0005*\u0000"+
		"\u0000wx\u0003h4\u0000xy\u0006\u0000\uffff\uffff\u0000y\u0001\u0001\u0000"+
		"\u0000\u0000z{\u0003\u0004\u0002\u0000{|\u0003\u0002\u0001\u0000|}\u0006"+
		"\u0001\uffff\uffff\u0000}\u0080\u0001\u0000\u0000\u0000~\u0080\u0006\u0001"+
		"\uffff\uffff\u0000\u007fz\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0003\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u0014\n\u0000"+
		"\u0082\u0083\u0003\u0006\u0003\u0000\u0083\u0084\u0006\u0002\uffff\uffff"+
		"\u0000\u0084\u0005\u0001\u0000\u0000\u0000\u0085\u0086\u0003\b\u0004\u0000"+
		"\u0086\u0087\u0006\u0003\uffff\uffff\u0000\u0087\u008c\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0003\f\u0006\u0000\u0089\u008a\u0006\u0003\uffff\uffff"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000"+
		"\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008c\u0007\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\u0004\u0000\u0000\u008e\u008f\u0005\u0005\u0000"+
		"\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090\u0091\u0005*\u0000\u0000"+
		"\u0091\u0092\u0005\u0007\u0000\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093"+
		"\u0094\u0003\n\u0005\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096"+
		"\u0006\u0004\uffff\uffff\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\u0004\u0000\u0000\u0098\u0099\u0005*\u0000\u0000\u0099\u009a\u0005"+
		"\u0007\u0000\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b\u009c\u0003\n"+
		"\u0005\u0000\u009c\u009d\u0006\u0005\uffff\uffff\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0006\u0005\uffff\uffff\u0000\u009f\u0097"+
		"\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u000b"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000\u00a2\u00a3"+
		"\u0003\u000e\u0007\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000\u00a4\u00a5"+
		"\u0006\u0006\uffff\uffff\u0000\u00a5\r\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005*\u0000\u0000\u00a7\u00a8\u0003\u0012\t\u0000\u00a8\u00a9\u0003"+
		"\u0010\b\u0000\u00a9\u00aa\u0006\u0007\uffff\uffff\u0000\u00aa\u000f\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac\u00ad\u0005"+
		"*\u0000\u0000\u00ad\u00ae\u0003\u0012\t\u0000\u00ae\u00af\u0003\u0010"+
		"\b\u0000\u00af\u00b0\u0006\b\uffff\uffff\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0006\b\uffff\uffff\u0000\u00b2\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u0011\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000\u00b5\u00b6\u0003\u0018"+
		"\f\u0000\u00b6\u00b7\u0006\t\uffff\uffff\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0006\t\uffff\uffff\u0000\u00b9\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u0013\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\b\u0000\u0000\u00bc\u00c4\u0006\n\uffff"+
		"\uffff\u0000\u00bd\u00be\u0005\t\u0000\u0000\u00be\u00c4\u0006\n\uffff"+
		"\uffff\u0000\u00bf\u00c0\u0005\n\u0000\u0000\u00c0\u00c1\u0003\u0016\u000b"+
		"\u0000\u00c1\u00c2\u0006\n\uffff\uffff\u0000\u00c2\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c4\u0015\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6\u00c7\u0005+\u0000\u0000"+
		"\u00c7\u00c8\u0005\f\u0000\u0000\u00c8\u00cb\u0006\u000b\uffff\uffff\u0000"+
		"\u00c9\u00cb\u0006\u000b\uffff\uffff\u0000\u00ca\u00c5\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u0017\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0005+\u0000\u0000\u00cd\u00d9\u0006\f\uffff\uffff"+
		"\u0000\u00ce\u00cf\u00056\u0000\u0000\u00cf\u00d9\u0006\f\uffff\uffff"+
		"\u0000\u00d0\u00d1\u00057\u0000\u0000\u00d1\u00d9\u0006\f\uffff\uffff"+
		"\u0000\u00d2\u00d3\u0005,\u0000\u0000\u00d3\u00d9\u0006\f\uffff\uffff"+
		"\u0000\u00d4\u00d5\u0005-\u0000\u0000\u00d5\u00d9\u0006\f\uffff\uffff"+
		"\u0000\u00d6\u00d7\u0005.\u0000\u0000\u00d7\u00d9\u0006\f\uffff\uffff"+
		"\u0000\u00d8\u00cc\u0001\u0000\u0000\u0000\u00d8\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u0019\u0001\u0000\u0000\u0000\u00da\u00db\u0005\r\u0000\u0000"+
		"\u00db\u00dc\u0003\u001c\u000e\u0000\u00dc\u00dd\u0005\u0003\u0000\u0000"+
		"\u00dd\u00de\u0005\r\u0000\u0000\u00de\u00df\u0006\r\uffff\uffff\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00e2\u0006\r\uffff\uffff\u0000"+
		"\u00e1\u00da\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u001b\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003 \u0010\u0000\u00e4"+
		"\u00e5\u0003\u001e\u000f\u0000\u00e5\u00e6\u0006\u000e\uffff\uffff\u0000"+
		"\u00e6\u00ec\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003\"\u0011\u0000\u00e8"+
		"\u00e9\u0003\u001e\u000f\u0000\u00e9\u00ea\u0006\u000e\uffff\uffff\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e7\u0001\u0000\u0000\u0000\u00ec\u001d\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0003 \u0010\u0000\u00ee\u00ef\u0003\u001e\u000f\u0000\u00ef"+
		"\u00f0\u0006\u000f\uffff\uffff\u0000\u00f0\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0003\"\u0011\u0000\u00f2\u00f3\u0003\u001e\u000f\u0000\u00f3"+
		"\u00f4\u0006\u000f\uffff\uffff\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f7\u0006\u000f\uffff\uffff\u0000\u00f6\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f1\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u001f\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u000e\u0000"+
		"\u0000\u00f9\u00fa\u0005*\u0000\u0000\u00fa\u00fb\u0006\u0010\uffff\uffff"+
		"\u0000\u00fb\u00fc\u0003$\u0012\u0000\u00fc\u00fd\u0003*\u0015\u0000\u00fd"+
		"\u00fe\u0005\u0003\u0000\u0000\u00fe\u00ff\u0005\u000e\u0000\u0000\u00ff"+
		"\u0100\u0005*\u0000\u0000\u0100\u0101\u0006\u0010\uffff\uffff\u0000\u0101"+
		"!\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u000f\u0000\u0000\u0103\u0104"+
		"\u0005*\u0000\u0000\u0104\u0105\u0006\u0011\uffff\uffff\u0000\u0105\u0106"+
		"\u0005\u000b\u0000\u0000\u0106\u0107\u0003&\u0013\u0000\u0107\u0108\u0005"+
		"\f\u0000\u0000\u0108\u0109\u0003\u0014\n\u0000\u0109\u010a\u0005\u0006"+
		"\u0000\u0000\u010a\u010b\u0005*\u0000\u0000\u010b\u010c\u0005\u0002\u0000"+
		"\u0000\u010c\u010d\u0003,\u0016\u0000\u010d\u010e\u0005\u0003\u0000\u0000"+
		"\u010e\u010f\u0005\u000f\u0000\u0000\u010f\u0110\u0005*\u0000\u0000\u0110"+
		"\u0111\u0006\u0011\uffff\uffff\u0000\u0111#\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\u000b\u0000\u0000\u0113\u0114\u0003&\u0013\u0000\u0114\u0115"+
		"\u0005\f\u0000\u0000\u0115\u0116\u0006\u0012\uffff\uffff\u0000\u0116\u0119"+
		"\u0001\u0000\u0000\u0000\u0117\u0119\u0006\u0012\uffff\uffff\u0000\u0118"+
		"\u0112\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119"+
		"%\u0001\u0000\u0000\u0000\u011a\u011b\u0005*\u0000\u0000\u011b\u011c\u0006"+
		"\u0013\uffff\uffff\u0000\u011c\u011d\u0003(\u0014\u0000\u011d\u011e\u0006"+
		"\u0013\uffff\uffff\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0006\u0013\uffff\uffff\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120"+
		"\u011f\u0001\u0000\u0000\u0000\u0121\'\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0005\u0004\u0000\u0000\u0123\u0124\u0005*\u0000\u0000\u0124\u0125\u0006"+
		"\u0014\uffff\uffff\u0000\u0125\u0126\u0003(\u0014\u0000\u0126\u0127\u0006"+
		"\u0014\uffff\uffff\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0006\u0014\uffff\uffff\u0000\u0129\u0122\u0001\u0000\u0000\u0000\u0129"+
		"\u0128\u0001\u0000\u0000\u0000\u012a)\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0003\u0014\n\u0000\u012c\u012d\u0005\u0004\u0000\u0000\u012d\u012e\u0005"+
		"\u0010\u0000\u0000\u012e\u012f\u0005\u000b\u0000\u0000\u012f\u0130\u0003"+
		".\u0017\u0000\u0130\u0131\u0005\f\u0000\u0000\u0131\u0132\u0005*\u0000"+
		"\u0000\u0132\u0133\u0005\u0002\u0000\u0000\u0133\u0134\u0006\u0015\uffff"+
		"\uffff\u0000\u0134\u0135\u0003*\u0015\u0000\u0135\u0138\u0001\u0000\u0000"+
		"\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u012b\u0001\u0000\u0000"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138+\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0003\u0014\n\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b"+
		"\u013c\u0005\u0010\u0000\u0000\u013c\u013d\u0005\u000b\u0000\u0000\u013d"+
		"\u013e\u0005\u0011\u0000\u0000\u013e\u013f\u0005\f\u0000\u0000\u013f\u0140"+
		"\u0005*\u0000\u0000\u0140\u0141\u0005\u0002\u0000\u0000\u0141\u0142\u0006"+
		"\u0016\uffff\uffff\u0000\u0142\u0143\u0003,\u0016\u0000\u0143\u0146\u0001"+
		"\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0139\u0001"+
		"\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146-\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005\u0011\u0000\u0000\u0148\u014e\u0006\u0017"+
		"\uffff\uffff\u0000\u0149\u014a\u0005\u0012\u0000\u0000\u014a\u014e\u0006"+
		"\u0017\uffff\uffff\u0000\u014b\u014c\u0005\u0013\u0000\u0000\u014c\u014e"+
		"\u0006\u0017\uffff\uffff\u0000\u014d\u0147\u0001\u0000\u0000\u0000\u014d"+
		"\u0149\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"/\u0001\u0000\u0000\u0000\u014f\u0150\u00034\u001a\u0000\u0150\u0151\u0003"+
		"2\u0019\u0000\u0151\u0152\u0006\u0018\uffff\uffff\u0000\u0152\u0155\u0001"+
		"\u0000\u0000\u0000\u0153\u0155\u0006\u0018\uffff\uffff\u0000\u0154\u014f"+
		"\u0001\u0000\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u01551\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u00034\u001a\u0000\u0157\u0158\u00032\u0019"+
		"\u0000\u0158\u0159\u0006\u0019\uffff\uffff\u0000\u0159\u015c\u0001\u0000"+
		"\u0000\u0000\u015a\u015c\u0006\u0019\uffff\uffff\u0000\u015b\u0156\u0001"+
		"\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c3\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0005*\u0000\u0000\u015e\u015f\u0003F#\u0000"+
		"\u015f\u0160\u0006\u001a\uffff\uffff\u0000\u0160\u017b\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0003H$\u0000\u0162\u0163\u0005\u0002\u0000\u0000\u0163"+
		"\u0164\u0006\u001a\uffff\uffff\u0000\u0164\u017b\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\u0014\u0000\u0000\u0166\u0167\u0005\u000b\u0000\u0000"+
		"\u0167\u0168\u0003^/\u0000\u0168\u0169\u0005\f\u0000\u0000\u0169\u016a"+
		"\u00036\u001b\u0000\u016a\u016b\u0006\u001a\uffff\uffff\u0000\u016b\u017b"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u0015\u0000\u0000\u016d\u016e"+
		"\u0003:\u001d\u0000\u016e\u016f\u0006\u001a\uffff\uffff\u0000\u016f\u017b"+
		"\u0001\u0000\u0000\u0000\u0170\u0171\u0005\u0016\u0000\u0000\u0171\u0172"+
		"\u0005\u0017\u0000\u0000\u0172\u0173\u0005\u000b\u0000\u0000\u0173\u0174"+
		"\u0003L&\u0000\u0174\u0175\u0005\f\u0000\u0000\u0175\u0176\u0003>\u001f"+
		"\u0000\u0176\u0177\u0005\u0003\u0000\u0000\u0177\u0178\u0005\u0016\u0000"+
		"\u0000\u0178\u0179\u0006\u001a\uffff\uffff\u0000\u0179\u017b\u0001\u0000"+
		"\u0000\u0000\u017a\u015d\u0001\u0000\u0000\u0000\u017a\u0161\u0001\u0000"+
		"\u0000\u0000\u017a\u0165\u0001\u0000\u0000\u0000\u017a\u016c\u0001\u0000"+
		"\u0000\u0000\u017a\u0170\u0001\u0000\u0000\u0000\u017b5\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u00034\u001a\u0000\u017d\u017e\u0006\u001b\uffff\uffff"+
		"\u0000\u017e\u0185\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u0018\u0000"+
		"\u0000\u0180\u0181\u00030\u0018\u0000\u0181\u0182\u00038\u001c\u0000\u0182"+
		"\u0183\u0006\u001b\uffff\uffff\u0000\u0183\u0185\u0001\u0000\u0000\u0000"+
		"\u0184\u017c\u0001\u0000\u0000\u0000\u0184\u017f\u0001\u0000\u0000\u0000"+
		"\u01857\u0001\u0000\u0000\u0000\u0186\u0187\u0005\u0019\u0000\u0000\u0187"+
		"\u018e\u0006\u001c\uffff\uffff\u0000\u0188\u0189\u0005\u001a\u0000\u0000"+
		"\u0189\u018a\u00030\u0018\u0000\u018a\u018b\u0005\u0019\u0000\u0000\u018b"+
		"\u018c\u0006\u001c\uffff\uffff\u0000\u018c\u018e\u0001\u0000\u0000\u0000"+
		"\u018d\u0186\u0001\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000"+
		"\u018e9\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u001b\u0000\u0000\u0190"+
		"\u0191\u0005\u000b\u0000\u0000\u0191\u0192\u0003^/\u0000\u0192\u0193\u0005"+
		"\f\u0000\u0000\u0193\u0194\u00030\u0018\u0000\u0194\u0195\u0005\u001c"+
		"\u0000\u0000\u0195\u0196\u0006\u001d\uffff\uffff\u0000\u0196\u01a3\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005*\u0000\u0000\u0198\u0199\u0005\u0007"+
		"\u0000\u0000\u0199\u019a\u0003<\u001e\u0000\u019a\u019b\u0005\u0004\u0000"+
		"\u0000\u019b\u019c\u0003<\u001e\u0000\u019c\u019d\u0005\u0004\u0000\u0000"+
		"\u019d\u019e\u0003<\u001e\u0000\u019e\u019f\u00030\u0018\u0000\u019f\u01a0"+
		"\u0005\u001c\u0000\u0000\u01a0\u01a1\u0006\u001d\uffff\uffff\u0000\u01a1"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a2\u018f\u0001\u0000\u0000\u0000\u01a2"+
		"\u0197\u0001\u0000\u0000\u0000\u01a3;\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0005+\u0000\u0000\u01a5\u01a9\u0006\u001e\uffff\uffff\u0000\u01a6\u01a7"+
		"\u0005*\u0000\u0000\u01a7\u01a9\u0006\u001e\uffff\uffff\u0000\u01a8\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9=\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0005\u0017\u0000\u0000\u01ab\u01ac\u0005"+
		"\u000b\u0000\u0000\u01ac\u01ad\u0003@ \u0000\u01ad\u01ae\u0005\f\u0000"+
		"\u0000\u01ae\u01af\u00030\u0018\u0000\u01af\u01b0\u0003>\u001f\u0000\u01b0"+
		"\u01b1\u0006\u001f\uffff\uffff\u0000\u01b1\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0005\u0017\u0000\u0000\u01b3\u01b4\u0005\u001d\u0000\u0000"+
		"\u01b4\u01b5\u00030\u0018\u0000\u01b5\u01b6\u0006\u001f\uffff\uffff\u0000"+
		"\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b9\u0006\u001f\uffff\uffff"+
		"\u0000\u01b8\u01aa\u0001\u0000\u0000\u0000\u01b8\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9?\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0005\u001e\u0000\u0000\u01bb\u01bc\u0003\u0018\f\u0000\u01bc"+
		"\u01bd\u0006 \uffff\uffff\u0000\u01bd\u01c3\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0003\u0018\f\u0000\u01bf\u01c0\u0003B!\u0000\u01c0\u01c1\u0006"+
		" \uffff\uffff\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01ba\u0001"+
		"\u0000\u0000\u0000\u01c2\u01be\u0001\u0000\u0000\u0000\u01c3A\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0003D\"\u0000\u01c5\u01c6\u0006!\uffff\uffff"+
		"\u0000\u01c6\u01ce\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\u001e\u0000"+
		"\u0000\u01c8\u01c9\u0003\u0018\f\u0000\u01c9\u01ca\u0006!\uffff\uffff"+
		"\u0000\u01ca\u01ce\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\u001e\u0000"+
		"\u0000\u01cc\u01ce\u0006!\uffff\uffff\u0000\u01cd\u01c4\u0001\u0000\u0000"+
		"\u0000\u01cd\u01c7\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ceC\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0004\u0000\u0000"+
		"\u01d0\u01d1\u0003\u0018\f\u0000\u01d1\u01d2\u0003D\"\u0000\u01d2\u01d3"+
		"\u0006\"\uffff\uffff\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d6"+
		"\u0006\"\uffff\uffff\u0000\u01d5\u01cf\u0001\u0000\u0000\u0000\u01d5\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d6E\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005"+
		"\u0007\u0000\u0000\u01d8\u01d9\u0003L&\u0000\u01d9\u01da\u0005\u0002\u0000"+
		"\u0000\u01da\u01db\u0006#\uffff\uffff\u0000\u01dbG\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005\u001f\u0000\u0000\u01dd\u01de\u0005*\u0000\u0000\u01de"+
		"\u01df\u0006$\uffff\uffff\u0000\u01df\u01e0\u0003J%\u0000\u01e0\u01e1"+
		"\u0006$\uffff\uffff\u0000\u01e1I\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005"+
		"\u000b\u0000\u0000\u01e3\u01e4\u0006%\uffff\uffff\u0000\u01e4\u01e5\u0003"+
		"L&\u0000\u01e5\u01e6\u0003\\.\u0000\u01e6\u01e7\u0005\f\u0000\u0000\u01e7"+
		"\u01e8\u0006%\uffff\uffff\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9"+
		"\u01eb\u0006%\uffff\uffff\u0000\u01ea\u01e2\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e9\u0001\u0000\u0000\u0000\u01ebK\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0003R)\u0000\u01ed\u01ee\u0003N\'\u0000\u01ee\u01ef\u0006&\uffff\uffff"+
		"\u0000\u01efM\u0001\u0000\u0000\u0000\u01f0\u01f1\u0003P(\u0000\u01f1"+
		"\u01f2\u0003R)\u0000\u01f2\u01f3\u0003N\'\u0000\u01f3\u01f4\u0006\'\uffff"+
		"\uffff\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f7\u0006\'\uffff"+
		"\uffff\u0000\u01f6\u01f0\u0001\u0000\u0000\u0000\u01f6\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7O\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005 \u0000\u0000"+
		"\u01f9\u01fd\u0006(\uffff\uffff\u0000\u01fa\u01fb\u0005!\u0000\u0000\u01fb"+
		"\u01fd\u0006(\uffff\uffff\u0000\u01fc\u01f8\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fdQ\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0003X,\u0000\u01ff\u0200\u0003T*\u0000\u0200\u0201\u0006)\uffff\uffff"+
		"\u0000\u0201S\u0001\u0000\u0000\u0000\u0202\u0203\u0003V+\u0000\u0203"+
		"\u0204\u0003X,\u0000\u0204\u0205\u0003T*\u0000\u0205\u0206\u0006*\uffff"+
		"\uffff\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0209\u0006*\uffff"+
		"\uffff\u0000\u0208\u0202\u0001\u0000\u0000\u0000\u0208\u0207\u0001\u0000"+
		"\u0000\u0000\u0209U\u0001\u0000\u0000\u0000\u020a\u020b\u0005\"\u0000"+
		"\u0000\u020b\u020f\u0006+\uffff\uffff\u0000\u020c\u020d\u0005#\u0000\u0000"+
		"\u020d\u020f\u0006+\uffff\uffff\u0000\u020e\u020a\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020fW\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0003\u0018\f\u0000\u0211\u0212\u0006,\uffff\uffff\u0000\u0212"+
		"\u021e\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u000b\u0000\u0000\u0214"+
		"\u0215\u0003L&\u0000\u0215\u0216\u0005\f\u0000\u0000\u0216\u0217\u0006"+
		",\uffff\uffff\u0000\u0217\u021e\u0001\u0000\u0000\u0000\u0218\u0219\u0005"+
		"*\u0000\u0000\u0219\u021a\u0006,\uffff\uffff\u0000\u021a\u021b\u0003Z"+
		"-\u0000\u021b\u021c\u0006,\uffff\uffff\u0000\u021c\u021e\u0001\u0000\u0000"+
		"\u0000\u021d\u0210\u0001\u0000\u0000\u0000\u021d\u0213\u0001\u0000\u0000"+
		"\u0000\u021d\u0218\u0001\u0000\u0000\u0000\u021eY\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0005\u000b\u0000\u0000\u0220\u0221\u0006-\uffff\uffff\u0000"+
		"\u0221\u0222\u0003L&\u0000\u0222\u0223\u0003\\.\u0000\u0223\u0224\u0005"+
		"\f\u0000\u0000\u0224\u0225\u0006-\uffff\uffff\u0000\u0225\u0228\u0001"+
		"\u0000\u0000\u0000\u0226\u0228\u0006-\uffff\uffff\u0000\u0227\u021f\u0001"+
		"\u0000\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0228[\u0001\u0000"+
		"\u0000\u0000\u0229\u022a\u0005\u0004\u0000\u0000\u022a\u022b\u0006.\uffff"+
		"\uffff\u0000\u022b\u022c\u0003L&\u0000\u022c\u022d\u0003\\.\u0000\u022d"+
		"\u022e\u0006.\uffff\uffff\u0000\u022e\u0231\u0001\u0000\u0000\u0000\u022f"+
		"\u0231\u0006.\uffff\uffff\u0000\u0230\u0229\u0001\u0000\u0000\u0000\u0230"+
		"\u022f\u0001\u0000\u0000\u0000\u0231]\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0003d2\u0000\u0233\u0234\u0003`0\u0000\u0234\u0235\u0006/\uffff\uffff"+
		"\u0000\u0235_\u0001\u0000\u0000\u0000\u0236\u0237\u0003b1\u0000\u0237"+
		"\u0238\u0003d2\u0000\u0238\u0239\u0003`0\u0000\u0239\u023a\u00060\uffff"+
		"\uffff\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u023d\u00060\uffff"+
		"\uffff\u0000\u023c\u0236\u0001\u0000\u0000\u0000\u023c\u023b\u0001\u0000"+
		"\u0000\u0000\u023da\u0001\u0000\u0000\u0000\u023e\u023f\u00051\u0000\u0000"+
		"\u023f\u0247\u00061\uffff\uffff\u0000\u0240\u0241\u00052\u0000\u0000\u0241"+
		"\u0247\u00061\uffff\uffff\u0000\u0242\u0243\u00053\u0000\u0000\u0243\u0247"+
		"\u00061\uffff\uffff\u0000\u0244\u0245\u00054\u0000\u0000\u0245\u0247\u0006"+
		"1\uffff\uffff\u0000\u0246\u023e\u0001\u0000\u0000\u0000\u0246\u0240\u0001"+
		"\u0000\u0000\u0000\u0246\u0242\u0001\u0000\u0000\u0000\u0246\u0244\u0001"+
		"\u0000\u0000\u0000\u0247c\u0001\u0000\u0000\u0000\u0248\u0249\u0003L&"+
		"\u0000\u0249\u024a\u0003f3\u0000\u024a\u024b\u0003L&\u0000\u024b\u024c"+
		"\u00062\uffff\uffff\u0000\u024c\u025b\u0001\u0000\u0000\u0000\u024d\u024e"+
		"\u0005\u000b\u0000\u0000\u024e\u024f\u0003^/\u0000\u024f\u0250\u0005\f"+
		"\u0000\u0000\u0250\u0251\u00062\uffff\uffff\u0000\u0251\u025b\u0001\u0000"+
		"\u0000\u0000\u0252\u0253\u00055\u0000\u0000\u0253\u0254\u0003d2\u0000"+
		"\u0254\u0255\u00062\uffff\uffff\u0000\u0255\u025b\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u0005/\u0000\u0000\u0257\u025b\u00062\uffff\uffff\u0000\u0258"+
		"\u0259\u00050\u0000\u0000\u0259\u025b\u00062\uffff\uffff\u0000\u025a\u0248"+
		"\u0001\u0000\u0000\u0000\u025a\u024d\u0001\u0000\u0000\u0000\u025a\u0252"+
		"\u0001\u0000\u0000\u0000\u025a\u0256\u0001\u0000\u0000\u0000\u025a\u0258"+
		"\u0001\u0000\u0000\u0000\u025be\u0001\u0000\u0000\u0000\u025c\u025d\u0005"+
		"$\u0000\u0000\u025d\u0269\u00063\uffff\uffff\u0000\u025e\u025f\u0005%"+
		"\u0000\u0000\u025f\u0269\u00063\uffff\uffff\u0000\u0260\u0261\u0005&\u0000"+
		"\u0000\u0261\u0269\u00063\uffff\uffff\u0000\u0262\u0263\u0005\'\u0000"+
		"\u0000\u0263\u0269\u00063\uffff\uffff\u0000\u0264\u0265\u0005(\u0000\u0000"+
		"\u0265\u0269\u00063\uffff\uffff\u0000\u0266\u0267\u0005)\u0000\u0000\u0267"+
		"\u0269\u00063\uffff\uffff\u0000\u0268\u025c\u0001\u0000\u0000\u0000\u0268"+
		"\u025e\u0001\u0000\u0000\u0000\u0268\u0260\u0001\u0000\u0000\u0000\u0268"+
		"\u0262\u0001\u0000\u0000\u0000\u0268\u0264\u0001\u0000\u0000\u0000\u0268"+
		"\u0266\u0001\u0000\u0000\u0000\u0269g\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0003l6\u0000\u026b\u026c\u0003h4\u0000\u026c\u026d\u00064\uffff\uffff"+
		"\u0000\u026d\u0274\u0001\u0000\u0000\u0000\u026e\u026f\u0003j5\u0000\u026f"+
		"\u0270\u0003h4\u0000\u0270\u0271\u00064\uffff\uffff\u0000\u0271\u0274"+
		"\u0001\u0000\u0000\u0000\u0272\u0274\u00064\uffff\uffff\u0000\u0273\u026a"+
		"\u0001\u0000\u0000\u0000\u0273\u026e\u0001\u0000\u0000\u0000\u0273\u0272"+
		"\u0001\u0000\u0000\u0000\u0274i\u0001\u0000\u0000\u0000\u0275\u0276\u0005"+
		"\u000f\u0000\u0000\u0276\u0277\u0005*\u0000\u0000\u0277\u0278\u00065\uffff"+
		"\uffff\u0000\u0278\u0279\u0005\u000b\u0000\u0000\u0279\u027a\u0003&\u0013"+
		"\u0000\u027a\u027b\u0005\f\u0000\u0000\u027b\u027c\u0003\u0014\n\u0000"+
		"\u027c\u027d\u0005\u0006\u0000\u0000\u027d\u027e\u0005*\u0000\u0000\u027e"+
		"\u027f\u0005\u0002\u0000\u0000\u027f\u0280\u0003,\u0016\u0000\u0280\u0281"+
		"\u0003\u0002\u0001\u0000\u0281\u0282\u00030\u0018\u0000\u0282\u0283\u0005"+
		"*\u0000\u0000\u0283\u0284\u0005\u0007\u0000\u0000\u0284\u0285\u0003L&"+
		"\u0000\u0285\u0286\u0005\u0002\u0000\u0000\u0286\u0287\u0005\u0003\u0000"+
		"\u0000\u0287\u0288\u0005\u000f\u0000\u0000\u0288\u0289\u0005*\u0000\u0000"+
		"\u0289\u028a\u00065\uffff\uffff\u0000\u028ak\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0005\u000e\u0000\u0000\u028c\u028d\u0005*\u0000\u0000\u028d\u028e"+
		"\u00066\uffff\uffff\u0000\u028e\u028f\u0003$\u0012\u0000\u028f\u0290\u0003"+
		"*\u0015\u0000\u0290\u0291\u0003\u0002\u0001\u0000\u0291\u0292\u00030\u0018"+
		"\u0000\u0292\u0293\u0005\u0003\u0000\u0000\u0293\u0294\u0005\u000e\u0000"+
		"\u0000\u0294\u0295\u0005*\u0000\u0000\u0295\u0296\u00066\uffff\uffff\u0000"+
		"\u0296m\u0001\u0000\u0000\u0000)\u007f\u008b\u009f\u00b2\u00b9\u00c3\u00ca"+
		"\u00d8\u00e1\u00eb\u00f6\u0118\u0120\u0129\u0137\u0145\u014d\u0154\u015b"+
		"\u017a\u0184\u018d\u01a2\u01a8\u01b8\u01c2\u01cd\u01d5\u01ea\u01f6\u01fc"+
		"\u0208\u020e\u021d\u0227\u0230\u023c\u0246\u025a\u0268\u0273";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}