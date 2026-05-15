// Generated from C:/Users/Equipo/Desktop/PL_2/proyectoPLGrupo29/src/main/java/org/example/calculoCientificoToC.g4 by ANTLR 4.13.2
package org.example;

import org.example.variablesUtils;
import org.example.subprogramasUtils;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculoCientificoToCParser}.
 */
public interface calculoCientificoToCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(calculoCientificoToCParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(calculoCientificoToCParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(calculoCientificoToCParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(calculoCientificoToCParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(calculoCientificoToCParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(calculoCientificoToCParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#dcl_AUX}.
	 * @param ctx the parse tree
	 */
	void enterDcl_AUX(calculoCientificoToCParser.Dcl_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#dcl_AUX}.
	 * @param ctx the parse tree
	 */
	void exitDcl_AUX(calculoCientificoToCParser.Dcl_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(calculoCientificoToCParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(calculoCientificoToCParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(calculoCientificoToCParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(calculoCientificoToCParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(calculoCientificoToCParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(calculoCientificoToCParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(calculoCientificoToCParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(calculoCientificoToCParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#varlist_AUX}.
	 * @param ctx the parse tree
	 */
	void enterVarlist_AUX(calculoCientificoToCParser.Varlist_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#varlist_AUX}.
	 * @param ctx the parse tree
	 */
	void exitVarlist_AUX(calculoCientificoToCParser.Varlist_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(calculoCientificoToCParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(calculoCientificoToCParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(calculoCientificoToCParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(calculoCientificoToCParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#charlength}.
	 * @param ctx the parse tree
	 */
	void enterCharlength(calculoCientificoToCParser.CharlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#charlength}.
	 * @param ctx the parse tree
	 */
	void exitCharlength(calculoCientificoToCParser.CharlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(calculoCientificoToCParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(calculoCientificoToCParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(calculoCientificoToCParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(calculoCientificoToCParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#cablist}.
	 * @param ctx the parse tree
	 */
	void enterCablist(calculoCientificoToCParser.CablistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#cablist}.
	 * @param ctx the parse tree
	 */
	void exitCablist(calculoCientificoToCParser.CablistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void enterDecsubprog(calculoCientificoToCParser.DecsubprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void exitDecsubprog(calculoCientificoToCParser.DecsubprogContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#decproc}.
	 * @param ctx the parse tree
	 */
	void enterDecproc(calculoCientificoToCParser.DecprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#decproc}.
	 * @param ctx the parse tree
	 */
	void exitDecproc(calculoCientificoToCParser.DecprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#decfun}.
	 * @param ctx the parse tree
	 */
	void enterDecfun(calculoCientificoToCParser.DecfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#decfun}.
	 * @param ctx the parse tree
	 */
	void exitDecfun(calculoCientificoToCParser.DecfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(calculoCientificoToCParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(calculoCientificoToCParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist(calculoCientificoToCParser.NomparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist(calculoCientificoToCParser.NomparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#nomparamlist_AUX}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist_AUX(calculoCientificoToCParser.Nomparamlist_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#nomparamlist_AUX}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist_AUX(calculoCientificoToCParser.Nomparamlist_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_s_paramlist(calculoCientificoToCParser.Dec_s_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_s_paramlist(calculoCientificoToCParser.Dec_s_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_f_paramlist(calculoCientificoToCParser.Dec_f_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_f_paramlist(calculoCientificoToCParser.Dec_f_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void enterTipoparam(calculoCientificoToCParser.TipoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void exitTipoparam(calculoCientificoToCParser.TipoparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(calculoCientificoToCParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(calculoCientificoToCParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#sentlist_AUX}.
	 * @param ctx the parse tree
	 */
	void enterSentlist_AUX(calculoCientificoToCParser.Sentlist_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#sentlist_AUX}.
	 * @param ctx the parse tree
	 */
	void exitSentlist_AUX(calculoCientificoToCParser.Sentlist_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(calculoCientificoToCParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(calculoCientificoToCParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#if_tail}.
	 * @param ctx the parse tree
	 */
	void enterIf_tail(calculoCientificoToCParser.If_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#if_tail}.
	 * @param ctx the parse tree
	 */
	void exitIf_tail(calculoCientificoToCParser.If_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#if_else_tail}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_tail(calculoCientificoToCParser.If_else_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#if_else_tail}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_tail(calculoCientificoToCParser.If_else_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#do_tail}.
	 * @param ctx the parse tree
	 */
	void enterDo_tail(calculoCientificoToCParser.Do_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#do_tail}.
	 * @param ctx the parse tree
	 */
	void exitDo_tail(calculoCientificoToCParser.Do_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#doval}.
	 * @param ctx the parse tree
	 */
	void enterDoval(calculoCientificoToCParser.DovalContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#doval}.
	 * @param ctx the parse tree
	 */
	void exitDoval(calculoCientificoToCParser.DovalContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(calculoCientificoToCParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(calculoCientificoToCParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetas(calculoCientificoToCParser.EtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#etiquetas}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetas(calculoCientificoToCParser.EtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#eti_tail}.
	 * @param ctx the parse tree
	 */
	void enterEti_tail(calculoCientificoToCParser.Eti_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#eti_tail}.
	 * @param ctx the parse tree
	 */
	void exitEti_tail(calculoCientificoToCParser.Eti_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#listaetiquetas}.
	 * @param ctx the parse tree
	 */
	void enterListaetiquetas(calculoCientificoToCParser.ListaetiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#listaetiquetas}.
	 * @param ctx the parse tree
	 */
	void exitListaetiquetas(calculoCientificoToCParser.ListaetiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#sent_AUX}.
	 * @param ctx the parse tree
	 */
	void enterSent_AUX(calculoCientificoToCParser.Sent_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#sent_AUX}.
	 * @param ctx the parse tree
	 */
	void exitSent_AUX(calculoCientificoToCParser.Sent_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(calculoCientificoToCParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(calculoCientificoToCParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(calculoCientificoToCParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(calculoCientificoToCParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(calculoCientificoToCParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(calculoCientificoToCParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#exp_AUX}.
	 * @param ctx the parse tree
	 */
	void enterExp_AUX(calculoCientificoToCParser.Exp_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#exp_AUX}.
	 * @param ctx the parse tree
	 */
	void exitExp_AUX(calculoCientificoToCParser.Exp_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#operador_sumas}.
	 * @param ctx the parse tree
	 */
	void enterOperador_sumas(calculoCientificoToCParser.Operador_sumasContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#operador_sumas}.
	 * @param ctx the parse tree
	 */
	void exitOperador_sumas(calculoCientificoToCParser.Operador_sumasContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(calculoCientificoToCParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(calculoCientificoToCParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#termino_AUX}.
	 * @param ctx the parse tree
	 */
	void enterTermino_AUX(calculoCientificoToCParser.Termino_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#termino_AUX}.
	 * @param ctx the parse tree
	 */
	void exitTermino_AUX(calculoCientificoToCParser.Termino_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#operador_multiplicaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperador_multiplicaciones(calculoCientificoToCParser.Operador_multiplicacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#operador_multiplicaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperador_multiplicaciones(calculoCientificoToCParser.Operador_multiplicacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(calculoCientificoToCParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(calculoCientificoToCParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#factor_AUX}.
	 * @param ctx the parse tree
	 */
	void enterFactor_AUX(calculoCientificoToCParser.Factor_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#factor_AUX}.
	 * @param ctx the parse tree
	 */
	void exitFactor_AUX(calculoCientificoToCParser.Factor_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(calculoCientificoToCParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(calculoCientificoToCParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(calculoCientificoToCParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(calculoCientificoToCParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#expcond_AUX}.
	 * @param ctx the parse tree
	 */
	void enterExpcond_AUX(calculoCientificoToCParser.Expcond_AUXContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#expcond_AUX}.
	 * @param ctx the parse tree
	 */
	void exitExpcond_AUX(calculoCientificoToCParser.Expcond_AUXContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(calculoCientificoToCParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(calculoCientificoToCParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(calculoCientificoToCParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(calculoCientificoToCParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(calculoCientificoToCParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(calculoCientificoToCParser.OpcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void enterSubproglist(calculoCientificoToCParser.SubproglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void exitSubproglist(calculoCientificoToCParser.SubproglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#codfun}.
	 * @param ctx the parse tree
	 */
	void enterCodfun(calculoCientificoToCParser.CodfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#codfun}.
	 * @param ctx the parse tree
	 */
	void exitCodfun(calculoCientificoToCParser.CodfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculoCientificoToCParser#codproc}.
	 * @param ctx the parse tree
	 */
	void enterCodproc(calculoCientificoToCParser.CodprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculoCientificoToCParser#codproc}.
	 * @param ctx the parse tree
	 */
	void exitCodproc(calculoCientificoToCParser.CodprocContext ctx);
}