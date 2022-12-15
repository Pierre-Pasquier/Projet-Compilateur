// Generated from expr.g4 by ANTLR 4.9.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exprParser}.
 */
public interface exprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(exprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(exprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ops}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOps(exprParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ops}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOps(exprParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nil_op}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNil_op(exprParser.Nil_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nil_op}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNil_op(exprParser.Nil_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Typeids}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTypeids(exprParser.TypeidsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Typeids}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTypeids(exprParser.TypeidsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lvalues}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLvalues(exprParser.LvaluesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lvalues}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLvalues(exprParser.LvaluesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exprtiret}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprtiret(exprParser.ExprtiretContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exprtiret}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprtiret(exprParser.ExprtiretContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(exprParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(exprParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ifthenelse}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelse(exprParser.IfthenelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ifthenelse}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelse(exprParser.IfthenelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhile(exprParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhile(exprParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFor(exprParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFor(exprParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Break}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBreak(exprParser.BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBreak(exprParser.BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declarationlists}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationlists(exprParser.DeclarationlistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declarationlists}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationlists(exprParser.DeclarationlistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Printis}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintis(exprParser.PrintisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Printis}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintis(exprParser.PrintisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Prints}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrints(exprParser.PrintsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Prints}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrints(exprParser.PrintsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opbin}
	 * labeled alternative in {@link exprParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOpbin(exprParser.OpbinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opbin}
	 * labeled alternative in {@link exprParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOpbin(exprParser.OpbinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opbinexpr}
	 * labeled alternative in {@link exprParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOpbinexpr(exprParser.OpbinexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opbinexpr}
	 * labeled alternative in {@link exprParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOpbinexpr(exprParser.OpbinexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 */
	void enterBinaryop(exprParser.BinaryopContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#binaryop}.
	 * @param ctx the parse tree
	 */
	void exitBinaryop(exprParser.BinaryopContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(exprParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(exprParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(exprParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(exprParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(exprParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(exprParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(exprParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(exprParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(exprParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(exprParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(exprParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(exprParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valint}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValint(exprParser.ValintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valint}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValint(exprParser.ValintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code validf}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValidf(exprParser.ValidfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code validf}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValidf(exprParser.ValidfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valop}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValop(exprParser.ValopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valop}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValop(exprParser.ValopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vallvalue}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterVallvalue(exprParser.VallvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vallvalue}
	 * labeled alternative in {@link exprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitVallvalue(exprParser.VallvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#exprseq}.
	 * @param ctx the parse tree
	 */
	void enterExprseq(exprParser.ExprseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#exprseq}.
	 * @param ctx the parse tree
	 */
	void exitExprseq(exprParser.ExprseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(exprParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(exprParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void enterFieldlist(exprParser.FieldlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#fieldlist}.
	 * @param ctx the parse tree
	 */
	void exitFieldlist(exprParser.FieldlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Idflist}
	 * labeled alternative in {@link exprParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterIdflist(exprParser.IdflistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Idflist}
	 * labeled alternative in {@link exprParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitIdflist(exprParser.IdflistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Idfexprlist}
	 * labeled alternative in {@link exprParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterIdfexprlist(exprParser.IdfexprlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Idfexprlist}
	 * labeled alternative in {@link exprParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitIdfexprlist(exprParser.IdfexprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationlist(exprParser.DeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationlist(exprParser.DeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedecla(exprParser.TypedeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedecla(exprParser.TypedeclaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVardecla(exprParser.VardeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVardecla(exprParser.VardeclaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fundecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFundecla(exprParser.FundeclaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fundecla}
	 * labeled alternative in {@link exprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFundecla(exprParser.FundeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#typedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedeclaration(exprParser.TypedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#typedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedeclaration(exprParser.TypedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_id}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_id(exprParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_id}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_id(exprParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typef}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypef(exprParser.TypefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typef}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypef(exprParser.TypefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeidarray}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeidarray(exprParser.TypeidarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeidarray}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeidarray(exprParser.TypeidarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#typefields}.
	 * @param ctx the parse tree
	 */
	void enterTypefields(exprParser.TypefieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#typefields}.
	 * @param ctx the parse tree
	 */
	void exitTypefields(exprParser.TypefieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#typefield}.
	 * @param ctx the parse tree
	 */
	void enterTypefield(exprParser.TypefieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#typefield}.
	 * @param ctx the parse tree
	 */
	void exitTypefield(exprParser.TypefieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#typeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(exprParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#typeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(exprParser.TypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaration(exprParser.VariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaration(exprParser.VariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(exprParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(exprParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#printi}.
	 * @param ctx the parse tree
	 */
	void enterPrinti(exprParser.PrintiContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#printi}.
	 * @param ctx the parse tree
	 */
	void exitPrinti(exprParser.PrintiContext ctx);
	/**
	 * Enter a parse tree produced by {@link exprParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(exprParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link exprParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(exprParser.PrintContext ctx);
}