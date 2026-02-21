// Generated from C:/Users/Equipo/Desktop/PL_2/proyectoPLGrupo29/src/main/java/calculoCientificoToC.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculoCientificoToCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculoCientificoToCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(calculoCientificoToCParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(calculoCientificoToCParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#cabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecera(calculoCientificoToCParser.CabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#cablist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCablist(calculoCientificoToCParser.CablistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#decsubprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecsubprog(calculoCientificoToCParser.DecsubprogContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(calculoCientificoToCParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#sentlist_AUX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist_AUX(calculoCientificoToCParser.Sentlist_AUXContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(calculoCientificoToCParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(calculoCientificoToCParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(calculoCientificoToCParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(calculoCientificoToCParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(calculoCientificoToCParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(calculoCientificoToCParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#charlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharlength(calculoCientificoToCParser.CharlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(calculoCientificoToCParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#varlist_AUX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist_AUX(calculoCientificoToCParser.Varlist_AUXContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(calculoCientificoToCParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#decproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecproc(calculoCientificoToCParser.DecprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(calculoCientificoToCParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#nomparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist(calculoCientificoToCParser.NomparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#nomparamlist_AUX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist_AUX(calculoCientificoToCParser.Nomparamlist_AUXContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_s_paramlist(calculoCientificoToCParser.Dec_s_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#tipoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoparam(calculoCientificoToCParser.TipoparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#decfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfun(calculoCientificoToCParser.DecfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_f_paramlist(calculoCientificoToCParser.Dec_f_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(calculoCientificoToCParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#sent_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent_tail(calculoCientificoToCParser.Sent_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(calculoCientificoToCParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#exp_AUX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_AUX(calculoCientificoToCParser.Exp_AUXContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(calculoCientificoToCParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(calculoCientificoToCParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#factor_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_tail(calculoCientificoToCParser.Factor_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(calculoCientificoToCParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(calculoCientificoToCParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(calculoCientificoToCParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#subproglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproglist(calculoCientificoToCParser.SubproglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#codproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodproc(calculoCientificoToCParser.CodprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculoCientificoToCParser#codfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodfun(calculoCientificoToCParser.CodfunContext ctx);
}