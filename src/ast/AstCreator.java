
package ast;
import parser.exprBaseVisitor;
import parser.exprParser;
public class AstCreator extends exprBaseVisitor<Ast>{
	@Override 
	public Ast visitProgram(exprParser.ProgramContext ctx) { 
		Ast child = ctx.getChild(0).accept(this);
		return new Program(child);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	/*-----------------------------------------------------------------------------------------------------*/
	@Override public Ast visitPlus(exprParser.PlusContext ctx) {
  
        Ast noeudTemporaire = ctx.getChild(0).accept(this);
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);
            switch (operation) {
                case "-":
                    noeudTemporaire = new Minus(noeudTemporaire,right);
                    break;
                case "+":
                    noeudTemporaire = new Plus(noeudTemporaire,right);
                    break;
                default:
                    break;
            }
        }    
        return noeudTemporaire;
    }



	@Override public Ast visitMult(exprParser.MultContext ctx) {
  
        Ast noeudTemporaire = ctx.getChild(0).accept(this);

		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);

            switch (operation) {
                case "*":
                    noeudTemporaire = new Mult(noeudTemporaire,right);
                    break;
                case "/":
                    noeudTemporaire = new Div(noeudTemporaire,right);
                    break;
                default:
                    break;
            }
        }    

        return noeudTemporaire;

    }


	@Override public Ast visitBinaryop(exprParser.BinaryopContext ctx){
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitOpbin(exprParser.OpbinContext ctx){
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitOpbinexpr(exprParser.OpbinexprContext ctx) {
		Opbinexpr binexprList = new Opbinexpr();
		//System.out.println("len = " +  ctx.getChildCount() + "\n");
		if (ctx.getChildCount() == 0){
			return new Opbinexpr(null);
		}
		for (int i = 0; i<((ctx.getChildCount()+1)/2);i++){
			if(ctx.getChild(2*i)!=null && ctx.getChild(2*i)!=null){
				binexprList.addOpBin(ctx.getChild(2*i).accept(this));
				binexprList.addOpBin(ctx.getChild(2*i+1).accept(this));
			}
		}
		return binexprList;
	}
	@Override public Ast visitAnd(exprParser.AndContext ctx)
	{
		And andList = new And();
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		for (int i = 0; i<(ctx.getChildCount()+1)/2;i++){
			andList.addAnd(ctx.getChild(2*i).accept(this));
		}
		return andList;
	}
	@Override public Ast visitOr(exprParser.OrContext ctx)
	{
		Or orList = new Or();
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		for (int i = 0; i<(ctx.getChildCount()+1)/2;i++){
			orList.addOr(ctx.getChild(i).accept(this));
		}
		return orList;
	}
	@Override public Ast visitCompare(exprParser.CompareContext ctx) {
  
        Ast noeudTemporaire = ctx.getChild(0).accept(this);
        if (ctx.getChildCount() == 3){
			String operation = ctx.getChild(1).toString();
			Ast right = ctx.getChild(2).accept(this);
			switch (operation) {
				case ">":
					noeudTemporaire = new Sup(noeudTemporaire,right);
					break;
				case "<":
					noeudTemporaire = new Inf(noeudTemporaire,right);
					break;
				case ">=":
					noeudTemporaire = new SupEq(noeudTemporaire,right);
					break;
				case "<=":
					noeudTemporaire = new InfEq(noeudTemporaire,right);
					break;
				default:
					break;
			} 
		}
		 
        return noeudTemporaire;
    }
	@Override public Ast visitEq(exprParser.EqContext ctx) {
  
        Ast noeudTemporaire = ctx.getChild(0).accept(this);
        if (ctx.getChildCount() == 3){
			String operation = ctx.getChild(1).toString();
			Ast right = ctx.getChild(2).accept(this);
			switch (operation) {
				case "=":
					noeudTemporaire = new Egal(noeudTemporaire,right);
					break;
				case "<>":
					noeudTemporaire = new Diff(noeudTemporaire,right);
					break;
			} 
		}
		 
        return noeudTemporaire;
    }
	
	/*------------------------------------------------------------------------------------------------------*/
	@Override public Ast visitExprseq(exprParser.ExprseqContext ctx) {
		ExprSeq exprseq = new ExprSeq();
		//System.out.println("len = " + ctx.getChildCount() + "\n");
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		for (int i=0; i<(ctx.getChildCount()+1)/2;i++){
			//System.out.println("aaaaaaaaaaaaaa\n");
			exprseq.addExprSeq(ctx.getChild(2*i).accept(this));
		}
		return exprseq;
	 }
	 @Override public Ast visitExprlist(exprParser.ExprlistContext ctx) {
		ExprList exprlist = new ExprList();
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		for (int i=0; i<(ctx.getChildCount()+1)/2;i++){
			exprlist.addExprList(ctx.getChild(2*i).accept(this));
		}
		return exprlist ;
	}
	@Override public Ast visitFieldlist(exprParser.FieldlistContext ctx) {
		FieldList fieldlist = new FieldList();
		for (int i=0; i<ctx.getChildCount()/3;i++){
			String idfString = ctx.getChild(3*i).toString();
			Idf idf = new Idf(idfString);
			fieldlist.addFieldList(ctx.getChild(3*i+2).accept(this),idf);
		}
		return fieldlist ;
	}
	@Override public Ast visitIdflist(exprParser.IdflistContext ctx) {
		IdfList Idflist = new IdfList();
		if (ctx.getChildCount() == 1){
			String idfString = ctx.getChild(0).toString();
			return new Idf(idfString);
		}
		for (int i=0; i<(ctx.getChildCount()+1)/2;i++){
			String idfString = ctx.getChild(2*i).toString();
			Idf idf = new Idf(idfString);
			Idflist.addIdfList(idf);
		}
		return Idflist;
	}
	@Override public Ast visitIdfexprlist(exprParser.IdfexprlistContext ctx) {
		String idfString = ctx.getChild(0).toString();
		Idf idf = new Idf(idfString);
		IdfExprList Idfexprlist = new IdfExprList();
		Idfexprlist.addIdfExprList(idf);
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		for (int i=0; i<ctx.getChildCount()/3;i++){
			Idfexprlist.addIdfExprList(ctx.getChild(3*i+2).accept(this));
		}
		return Idfexprlist;
	}
	@Override public Ast visitDeclarationlist(exprParser.DeclarationlistContext ctx) {
		DeclarationList declaList = new DeclarationList();
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		for (int i = 0; i<ctx.getChildCount();i++){
			declaList.addDeclaration(ctx.getChild(i).accept(this));
		}
		return declaList;
	}
	@Override public Ast visitTypedecla(exprParser.TypedeclaContext ctx) { 
		return ctx.getChild(0).accept(this); 
	}
	
	@Override public Ast visitVardecla(exprParser.VardeclaContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	
	@Override public Ast visitFundecla(exprParser.FundeclaContext ctx) {
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitTypedeclaration(exprParser.TypedeclarationContext ctx) { 
		Ast typeid = ctx.getChild(1).accept(this);
		Ast type = ctx.getChild(3).accept(this);
		return new TypeDeclaration(typeid, type);
	}
	@Override public Ast visitType_id(exprParser.Type_idContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	
	@Override public Ast visitTypef(exprParser.TypefContext ctx) { 
		return ctx.getChild(1).accept(this);
	}
	@Override public Ast visitTypeidarray(exprParser.TypeidarrayContext ctx) { 
		return ctx.getChild(2).accept(this);
	}
	@Override public Ast visitTypefields(exprParser.TypefieldsContext ctx) {
		TypeFieldList typefieldList = new TypeFieldList();
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		if (ctx.getChildCount()%2 == 0){
			for (int i = 0; i<(ctx.getChildCount()+1)/2;i++){
				typefieldList.addTypeField(ctx.getChild(2*i+1).accept(this));
			}
		} else {
			for (int i = 0; i<(ctx.getChildCount()+1)/2;i++){
				typefieldList.addTypeField(ctx.getChild(2*i).accept(this));
			}
		}
		return typefieldList;
	}
	@Override public Ast visitTypefield(exprParser.TypefieldContext ctx) { 
		String idfString = ctx.getChild(0).toString();
		Idf idf = new Idf(idfString);
		Ast typeid = ctx.getChild(2).accept(this);
		return new TypeField(idf,typeid);
	 }
	 @Override public Ast visitTypeid(exprParser.TypeidContext ctx) { 
		String idfString = ctx.getChild(0).toString();
		return new Idf(idfString); 
	}
	@Override public Ast visitVariabledeclaration(exprParser.VariabledeclarationContext ctx) { 
		String idfString = ctx.getChild(1).toString();
		Idf idf = new Idf(idfString);
		if (ctx.getChildCount() == 4){
			Ast expr = ctx.getChild(3).accept(this);
			return new VariableDeclaration(idf, expr, null);
		} else {
			Ast typeid = ctx.getChild(3).accept(this);
			Ast expr = ctx.getChild(5).accept(this);
			//System.out.println("expr = null : "+ (expr == null) + "\n");
			return new VariableDeclaration(idf, expr, typeid);
		}
	}
	@Override public Ast visitFunctiondeclaration(exprParser.FunctiondeclarationContext ctx) { 
		String idfString = ctx.getChild(1).toString();
		Idf idf = new Idf(idfString);
		Ast typefields = ctx.getChild(3).accept(this);
		if (ctx.getChildCount() == 7){
			Ast expr = ctx.getChild(6).accept(this);
			return new FunctionDeclaration(idf, typefields, expr, null);
		} else {
			Ast typeid = ctx.getChild(6).accept(this);
			Ast expr = ctx.getChild(8).accept(this);
			return new FunctionDeclaration(idf, typefields,expr, typeid);
		} 
	}
	@Override public Ast visitPrinti(exprParser.PrintiContext ctx) { 
		return ctx.getChild(1).accept(this);
	 }
	@Override public Ast visitPrint(exprParser.PrintContext ctx) { 
		return ctx.getChild(1).accept(this);
	 }
	@Override 
	public Ast visitIfthenelse(exprParser.IfthenelseContext ctx) { 
		
		Ast condition = ctx.getChild(1).accept(this);
		Ast alors = ctx.getChild(3).accept(this);
		Ast ouOccasionnel = ctx.getChild(5).accept(this);
		return new Ifthenelse(condition, alors, ouOccasionnel);
			
		}
	}

	@Override 
	public Ast visitIfthen(exprParser.IfthenContext ctx) { 
		
		Ast condition = ctx.getChild(1).accept(this);
		Ast alors = ctx.getChild(3).accept(this);
		return new Ifthen(condition, alors);
		
	}

	@Override 
	public Ast visitDeclarationlists(exprParser.DeclarationlistsContext ctx) { 
		
		Ast affect = ctx.getChild(1).accept(this);
		Ast dans = ctx.getChild(3).accept(this);
		return new Declarationlists(dans,affect);
	}
	@Override 
	public Ast visitExprtiret(exprParser.ExprtiretContext ctx) { 
		return ctx.getChild(1).accept(this);
	}
	@Override 
	public Ast visitFor(exprParser.ForContext ctx) { 
		String idfString = ctx.getChild(1).toString();
		Idf idf = new Idf(idfString);
		
		Ast deb= ctx.getChild(3).accept(this);
		Ast fin = ctx.getChild(5).accept(this);
		Ast faire = ctx.getChild(7).accept(this);
		return new For(deb,fin,faire,idf);
	}
//on met peut etre idf mais à voir plus tard
	@Override 
	public Ast visitLvalues(exprParser.LvaluesContext ctx) { 
		Ast lvalues= ctx.getChild(0).accept(this);
		//System.out.println("len = " + ctx.getChildCount() + "\n");
		if(ctx.getChildCount() == 3){
			Ast Expr=ctx.getChild(2).accept(this);
			//System.out.println("null = " + Expr == null + "\n");
			return new Lvalues(lvalues,Expr);
		}if(ctx.getChildCount() == 4){
			Ast Exprlist=ctx.getChild(2).accept(this);
			return new Lvalues(lvalues,Exprlist);
		}else{
			return new Lvalues(lvalues,null);
		}
	}
	@Override 
	public Ast visitNil_op(exprParser.Nil_opContext ctx) { 
		return ctx.getChild(1).accept(this);
	}
	@Override 
	public Ast visitOps(exprParser.OpsContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	@Override 
	public Ast visitParenthesis(exprParser.ParenthesisContext ctx) { 
		return ctx.getChild(1).accept(this);
	}
	@Override 
	public Ast visitPrints(exprParser.PrintsContext ctx) { 

		return ctx.getChild(0).accept(this);
	
	}
	@Override 
	public Ast visitPrintis(exprParser.PrintisContext ctx) { 

		return ctx.getChild(0).accept(this);
	}
	@Override 
	public Ast visitTypeids(exprParser.TypeidsContext ctx) { 
		if(ctx.getChildCount()==4){
			Ast typeids1= ctx.getChild(0).accept(this);
			Ast fieldlist1= ctx.getChild(2).accept(this);

			return new Typeids(typeids1,fieldlist1,null);
		}
		else{
			Ast typeids2= ctx.getChild(0).accept(this);
			Ast expr1= ctx.getChild(2).accept(this);
			Ast expr2= ctx.getChild(5).accept(this);
			return new Typeids(typeids2, expr1, expr2);
		}
	}
	@Override 
	public Ast visitWhile(exprParser.WhileContext ctx) { 
		
		Ast condition = ctx.getChild(1).accept(this);
		Ast faire= ctx.getChild(3).accept(this);
		return new While(condition, faire);
	}
	@Override 
	public Ast visitValint(exprParser.ValintContext ctx) { 
		int intString = Integer.parseInt(ctx.getChild(ctx.getChildCount()-1).toString());
		return new IntNode(intString);
	}
	@Override 
	public Ast visitValidf(exprParser.ValidfContext ctx) { 
		String idfString = ctx.getChild(ctx.getChildCount()-1).toString();
		return new Idf(idfString);
	}
	@Override 
	public Ast visitValop(exprParser.ValopContext ctx) {
		return ctx.getChild(ctx.getChildCount()-2).accept(this);
	}
	@Override 
	public Ast visitVallvalue(exprParser.VallvalueContext ctx) {
		return ctx.getChild(ctx.getChildCount()-1).accept(this);
	}
}