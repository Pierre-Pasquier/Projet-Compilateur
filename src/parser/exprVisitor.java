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
	 * Visit a parse tree produced by {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(exprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(exprParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryop(exprParser.BinaryopContext ctx);
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
	 * Visit a parse tree produced by {@link exprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(exprParser.ValueContext ctx);
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