// Generated from ./expr.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(exprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ops}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOps(exprParser.OpsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nil_op}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil_op(exprParser.Nil_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Typeids}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeids(exprParser.TypeidsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lvalues}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalues(exprParser.LvaluesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exprtiret}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprtiret(exprParser.ExprtiretContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(exprParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ifthenelse}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelse(exprParser.IfthenelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(exprParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(exprParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(exprParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declarationlists}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationlists(exprParser.DeclarationlistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Printis}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintis(exprParser.PrintisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Prints}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrints(exprParser.PrintsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opbin}
	 * labeled alternative in {@link exprParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpbin(exprParser.OpbinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opbinexpr}
	 * labeled alternative in {@link exprParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpbinexpr(exprParser.OpbinexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binplus}
	 * labeled alternative in {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinplus(exprParser.BinplusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bineq}
	 * labeled alternative in {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBineq(exprParser.BineqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binor}
	 * labeled alternative in {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinor(exprParser.BinorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binand}
	 * labeled alternative in {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinand(exprParser.BinandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bincomp}
	 * labeled alternative in {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBincomp(exprParser.BincompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binmult}
	 * labeled alternative in {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinmult(exprParser.BinmultContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(exprParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(exprParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(exprParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(exprParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(exprParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(exprParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valint}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValint(exprParser.ValintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code validf}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidf(exprParser.ValidfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valop}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValop(exprParser.ValopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vallvalue}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVallvalue(exprParser.VallvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#exprseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprseq(exprParser.ExprseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(exprParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(exprParser.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Idflist}
	 * labeled alternative in {@link exprParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdflist(exprParser.IdflistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Idfexprlist}
	 * labeled alternative in {@link exprParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdfexprlist(exprParser.IdfexprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#declarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationlist(exprParser.DeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedecla(exprParser.TypedeclaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecla(exprParser.VardeclaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fundecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundecla(exprParser.FundeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#typedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedeclaration(exprParser.TypedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_id}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_id(exprParser.Type_idContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typef}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypef(exprParser.TypefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeidarray}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidarray(exprParser.TypeidarrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#typefields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefields(exprParser.TypefieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#typefield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefield(exprParser.TypefieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#typeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeid(exprParser.TypeidContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#variabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclaration(exprParser.VariabledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(exprParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#printi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinti(exprParser.PrintiContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(exprParser.PrintContext ctx);
}