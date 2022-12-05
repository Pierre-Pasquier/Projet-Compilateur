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
	@Override public Ast visitExprseq(exprParser.ExprseqContext ctx) {
		ExprSeq exprseq = new ExprSeq();

		for (int i=0; i<ctx.getChildCount()/2;i++){
			exprseq.addExprSeq(ctx.getChild(2*i).accept(this));
		}
		return exprseq;
	 }


	 @Override public Ast visitExprlist(exprParser.ExprlistContext ctx) {
		ExprList exprlist = new ExprList();

		for (int i=0; i<ctx.getChildCount()/2;i++){
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
		for (int i=0; i<ctx.getChildCount()/2;i++){
			String idfString = ctx.getChild(2*i).toString();
			Idf idf = new Idf(idfString);
			Idflist.addIdfList(idf);
		}

		return Idflist;
	}


	@Override public Ast visitIdfexprlist(exprParser.IdfexprlistContext ctx) {
		String idfString = ctx.getChild(0).toString();
		Idf idf = new Idf(idfString);
		IdfExprList Idfexprlist = new IdfExprList(idf);
		for (int i=2; i<ctx.getChildCount();i++){
			Idfexprlist.addIdfExprList(ctx.getChild(2*i).accept(this));
		}
		return Idfexprlist;
	}

	@Override public Ast visitDeclarationlist(exprParser.DeclarationlistContext ctx) {
		DeclarationList declaList = new DeclarationList();

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

		for (int i = 0; i<ctx.getChildCount();i++){
			typefieldList.addTypeField(ctx.getChild(i).accept(this));
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
			return new VariableDeclaration(idf, expr);
		} else {
			Ast typeid = ctx.getChild(3).accept(this);
			Ast expr = ctx.getChild(5).accept(this);
			return new VariableDeclaration(idf, typeid, expr);
		}
	}





	@Override public Ast visitFunctiondeclaration(exprParser.FunctiondeclarationContext ctx) { 
		String idfString = ctx.getChild(1).toString();
		Idf idf = new Idf(idfString);
		Ast typefields = ctx.getChild(3).accept(this);
		if (ctx.getChildCount() == 7){
			Ast expr = ctx.getChild(6).accept(this);
			return new FunctionDeclaration(idf, typefields, expr);
		} else {
			Ast typeid = ctx.getChild(6).accept(this);
			Ast expr = ctx.getChild(8).accept(this);
			return new FunctionDeclaration(idf, typefields, typeid, expr);
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



		if(ctx.getChildCount()>3){
			Ast ouOccasionnel = ctx.getChild(5).accept(this);
			return new Ifthenelse(condition, alors, ouOccasionnel);
		}else{
			return new Ifthenelse(condition, alors);
		}
	}


	@Override 
	public Ast visitDeclarationlists(exprParser.DeclarationlistsContext ctx) { 
		
		Ast affect = ctx.getChild(1).accept(this);
		Ast dans = ctx.getChild(3).accept(this);

		return new Declarationlists(dans,affect);
	}


	@Override 
	public Ast visitExprtiret(exprParser.ExprtiretContext ctx) { 
		
		Ast expr_ = ctx.getChild(1).accept(this);

		return new Exprtiret(expr_);
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
		String s1=":=";
		String s2=ctx.getChild(1).accept(this).toString();

		if(ctx.getChildCount()>1 && s1.equals(s2)){
			Ast Expr=ctx.getChild(2).accept(this);
			return new Lvalues(lvalues,Expr);
		}if(ctx.getChildCount()>1){
			Ast Exprlist=ctx.getChild(2).accept(this);
			return new Lvalues(lvalues,Exprlist);
		}else{
			return new Lvalues(lvalues);
		}
	}


	@Override 
	public Ast visitNil_op(exprParser.Nil_opContext ctx) { 
		
		Ast nilop = ctx.getChild(1).accept(this);

		return new Nilop(nilop);
	}


	@Override 
	public Ast visitOps(exprParser.OpsContext ctx) { 
		
		Ast op = ctx.getChild(0).accept(this);

		return new Ops(op);
	}


	@Override 
	public Ast visitParenthesis(exprParser.ParenthesisContext ctx) { 
		
		Ast parenthesis = ctx.getChild(1).accept(this);

		return new Parenthesis(parenthesis);
	}


	@Override 
	public Ast visitPrints(exprParser.PrintsContext ctx) { 
		
		Ast printe = ctx.getChild(0).accept(this);

		return new Printe(printe);
	
	}


	@Override 
	public Ast visitPrintis(exprParser.PrintisContext ctx) { 
		
		Ast printis = ctx.getChild(0).accept(this);

		return new Printis(printis);
	}


	@Override 
	public Ast visitTypeids(exprParser.TypeidsContext ctx) { 
		if(ctx.getChildCount()==4){

			Ast typeids1= ctx.getChild(0).accept(this);
			Ast fieldlist1= ctx.getChild(2).accept(this);

			return new Typeids(typeids1,fieldlist1);
			
		}
		if(ctx.getChildCount()==6){

			Ast typeids2= ctx.getChild(0).accept(this);
			Ast expr1= ctx.getChild(2).accept(this);
			Ast expr2= ctx.getChild(5).accept(this);

			return new Typeids(typeids2, expr1, expr2);

		}
		return null;
	}


	@Override 
	public Ast visitWhile(exprParser.WhileContext ctx) { 
		
		Ast condition = ctx.getChild(1).accept(this);
		Ast faire= ctx.getChild(3).accept(this);

		return new While(condition, faire);
	}

}
