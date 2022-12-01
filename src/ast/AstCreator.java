package ast;


import parser.exprBaseVisitor;
import parser.exprParser;

public class AstCreator extends exprBaseVisitor<Ast>{
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
}
