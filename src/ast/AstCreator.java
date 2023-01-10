package ast;
import parser.exprBaseVisitor;
import parser.exprParser;
import java.util.List;
import java.io.PrintWriter;
import java.util.ArrayList;
public class AstCreator extends exprBaseVisitor<Ast>{


    public List<List> tds = new ArrayList<>();
	public int num_region = 1;
	public int num_imbrication = 0;
	public String pere = null;
	public String pere2 = null;
	public List<String> pile_region = new ArrayList<>();
	public List<String> args = new ArrayList<>();
	PrintWriter writer = new PrintWriter("out/output.txt", "UTF-8");
	public String fonction_etudiee;
	public boolean controle_semantique = false;


	public AstCreator() throws Exception{
	}


	@Override 
	public Ast visitProgram(exprParser.ProgramContext ctx) { 
		writer.println("Contrôles sémantiques :");
		Ast child = ctx.getChild(0).accept(this);
		writer.close();
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
		pere2 = "Plus";
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		String operator = ctx.getChild(1).toString();	
		if (operator.equals("-") && pere != null && (pere.equals("for"))){
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = list.get(list.size()-1);
			line.add("-");
		} else if(operator.equals("+") && pere != null && (pere.equals("for"))){
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = list.get(list.size()-1);
			line.add("+");
		}

        Ast noeudTemporaire = ctx.getChild(0).accept(this);
        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            String operation = ctx.getChild(2*i+1).toString();
			if (i != 0 && operation.equals("-") && pere != null && (pere.equals("for"))){
				int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
				List<List> list = tds.get(indice);
				List<String> line = list.get(list.size()-1);
				String calcul = line.get(line.size()-1);
				calcul = calcul + "-";
				line.set(line.size()-1,calcul);
			} else if(i != 0 && operation.equals("+") && pere != null && (pere.equals("for"))){
				int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
				List<List> list = tds.get(indice);
				List<String> line = list.get(list.size()-1);
				String calcul = line.get(line.size()-1);
				calcul = calcul + "+";
				line.set(line.size()-1,calcul);
			}
            Ast right = ctx.getChild(2*(i+1)).accept(this);
            switch (operation) {
                case "-":
					noeudTemporaire = new Minus(noeudTemporaire,right);
					break;
				case "+":
                    noeudTemporaire = new Minus(noeudTemporaire,right);
                    break;
                default:
                    break;
            }
        }    
        return noeudTemporaire;
    }




	@Override public Ast visitMult(exprParser.MultContext ctx) {
		pere2 = "Mult";

		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		String operator = ctx.getChild(1).toString();	
		if (operator.equals("*") && pere != null && (pere.equals("for") || pere.equals("typeids"))){
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = list.get(list.size()-1);
			line.add("*");
		} else if(operator.equals("/") && pere != null && (pere.equals("for") || pere.equals("typeids"))){
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = list.get(list.size()-1);
			line.add("/");
		}
        Ast noeudTemporaire = ctx.getChild(0).accept(this);

		if (ctx.getChildCount() == 1){
			return noeudTemporaire;
		}
        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            String operation = ctx.getChild(2*i+1).toString();

			if (i != 0 && operation.equals("*") && pere != null && (pere.equals("for") || pere.equals("typeids") || pere2.equals("Plus"))){
				int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
				List<List> list = tds.get(indice);
				List<String> line = list.get(list.size()-1);
				String calcul = line.get(line.size()-1);
				calcul = calcul + "*";
				line.set(line.size()-1,calcul);
			} else if(i != 0 && operation.equals("/") && pere != null && (pere.equals("for") || pere.equals("typeids") || pere2.equals("Plus"))){
				int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
				List<List> list = tds.get(indice);
				List<String> line = list.get(list.size()-1);
				String calcul = line.get(line.size()-1);
				calcul = calcul + "/";
				line.set(line.size()-1,calcul);
			}
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
		pere2 = "Binaryop";
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitOpbin(exprParser.OpbinContext ctx){
		pere2 = "Opbin";
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitOpbinexpr(exprParser.OpbinexprContext ctx) {
		pere2 = "Opbinexpr";
		Opbinexpr binexprList = new Opbinexpr();
		if (ctx.getChildCount() == 0){
			return binexprList;
		}
		for (int i = 0; i<((ctx.getChildCount()+1)/2);i++){
				binexprList.addOpBin(ctx.getChild(2*i).accept(this));
				binexprList.addOpBin(ctx.getChild(2*i+1).accept(this));
		}
		return binexprList;
	}
	@Override public Ast visitAnd(exprParser.AndContext ctx){
		pere2 = "And";
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
		pere2 = "Or";
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
		pere2 = "Compare";
        Ast noeudTemporaire = ctx.getChild(0).accept(this);
		if (ctx.getChild(0).toString().substring(0,1).equals("\"")){
			return new Stringg(ctx.getChild(0).toString().substring(1,ctx.getChild(0).toString().length()-1));
		}
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
		pere2 = "Eq";
		if (ctx.getChild(0).toString().substring(0,1).equals("\"")){
			return new Stringg(ctx.getChild(0).toString().substring(1,ctx.getChild(0).toString().length()-1));
		}
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
		pere2 = "Exprseq";
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
		pere2 = "Exprlist";
		ExprList exprlist = new ExprList();
		if (TDS.getNbFils(fonction_etudiee,tds) != ctx.getChildCount()){
			if (TDS.getNbFils(fonction_etudiee,tds) == -1){
				writer.println("Erreur ligne " + ctx.getStart().getLine() + " : la fonction " + fonction_etudiee + " n'existe pas");
			}
			writer.println("Erreur ligne " + ctx.getStart().getLine() + " : nombre d'arguments incorrects pour la fonction " + fonction_etudiee);
		}
		fonction_etudiee = null;
		if (ctx.getChildCount() == 1){
			return ctx.getChild(0).accept(this);
		}
		for (int i=0; i<(ctx.getChildCount()+1)/2;i++){
			exprlist.addExprList(ctx.getChild(2*i).accept(this));
		}
		return exprlist ;
	}
	@Override public Ast visitFieldlist(exprParser.FieldlistContext ctx) {
		pere2 = "Fieldlist";
		//System.out.println("Dans Fieldlist");
		FieldList fieldlist = new FieldList();
		for (int i=0; i<ctx.getChildCount()/3;i++){
			String idfString = ctx.getChild(3*i).toString();
			Idf idf = new Idf(idfString);
			fieldlist.addFieldList(ctx.getChild(3*i+2).accept(this),idf);
		}
		return fieldlist ;
	}
	@Override public Ast visitIdflist(exprParser.IdflistContext ctx) {
		pere2 = "Idflist";
		IdfList Idflist = new IdfList();
		if (ctx.getChildCount() == 1){
			String idfString = ctx.getChild(0).toString();
			fonction_etudiee = idfString;
			System.out.println("Fonction étudiée = " + fonction_etudiee);
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
		pere2 = "Idfexprlist";
		System.out.println("Dans Idfexprlist, nombre de fils = " + ctx.getChildCount());
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
		pere2 = "Declarationlist";
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
		pere2 = "Typedecla";
		return ctx.getChild(0).accept(this); 
	}
	
	@Override public Ast visitVardecla(exprParser.VardeclaContext ctx) { 
		pere2 = "Vardecla";
		return ctx.getChild(0).accept(this);
	}
	
	@Override public Ast visitFundecla(exprParser.FundeclaContext ctx) {
		pere2 = "Fundecla";
		return ctx.getChild(0).accept(this);
	}
	@Override public Ast visitTypedeclaration(exprParser.TypedeclarationContext ctx) {
		pere2 = "Typedeclaration";
		pere = "typedeclaration";
		List<String> typedecla = new ArrayList<>();
		tds.get(tds.size()-1).add(typedecla);
		Ast typeid = ctx.getChild(1).accept(this);
		Ast type = ctx.getChild(3).accept(this);
		return new TypeDeclaration(typeid, type);
	}
	@Override public Ast visitType_id(exprParser.Type_idContext ctx) { 
		pere2 = "Type_id";
		List<List> list = tds.get(tds.size()-1);
		list.get(list.size()-1).add("TYPEID");
		return ctx.getChild(0).accept(this);
	}
	
	@Override public Ast visitTypef(exprParser.TypefContext ctx) {
		pere2 = "Typef";
		List<List> list = tds.get(tds.size()-1);
		list.get(list.size()-1).add("TYPEFIELD");
		return ctx.getChild(1).accept(this);
	}
	@Override public Ast visitTypeidarray(exprParser.TypeidarrayContext ctx) { 
		pere2 = "Typeidarray";
		//System.out.println("Taille : " + tds.size());
		List<List> list = tds.get(tds.size()-1);
		list.get(list.size()-1).add("TYPEARRAY");
		return ctx.getChild(2).accept(this);
	}
	@Override public Ast visitTypefields(exprParser.TypefieldsContext ctx) {
		pere2 = "Typefields";
		TypeFieldList typefieldList = new TypeFieldList();
		pere = "typefields";
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
		pere2 = "Typefield";
		List<String> line = new ArrayList<>(); 
		String idfString = ctx.getChild(0).toString();
		line.add(idfString);
		line.add("PARAM");
		Idf idf = new Idf(idfString);
		int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
		tds.get(indice).add(line);
		Ast typeid = ctx.getChild(2).accept(this);
		return new TypeField(idf,typeid);
	 }


	 @Override public Ast visitTypeid(exprParser.TypeidContext ctx) { 
		String idfString = ctx.getChild(0).toString();
		if (pere2.equals("Typefield")){
			args.add(idfString);
		}
		pere2 = "Typeid";
		System.out.println("Dans typeid");
		System.out.println("idf = " + idfString);
		int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
		List<List> list = tds.get(indice);
		List<String> line = list.get(list.size()-1);
		line.add(idfString);
		
		return new Idf(idfString); 
	}
	@Override public Ast visitVariabledeclaration(exprParser.VariabledeclarationContext ctx) { 
		pere2 = "Variabledeclaration";
		List<String> line = new ArrayList<>();
		String idfString = ctx.getChild(1).toString();
		line.add(idfString);
		line.add("VAR");
		int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);		

		Idf idf = new Idf(idfString);
		if (ctx.getChildCount() == 4){
			tds.get(indice).add(line);
			Ast expr = ctx.getChild(3).accept(this);

			System.out.println("---------------idf = " + idfString + "------------------expr = null : "+ (expr == null) + "\n");
			return new VariableDeclaration(idf, expr, null);
		} else {
			String typeidString = ctx.getChild(3).toString();
			line.add(typeidString);
			tds.get(indice).add(line);
			//line.add(tds.) il faut ajouter le déplacement
			Ast typeid = ctx.getChild(3).accept(this);
			Ast expr = ctx.getChild(5).accept(this);
			System.out.println("expr = null : "+ (expr == null) + "\n");
			return new VariableDeclaration(idf, expr, typeid);
		}
	}
	@Override public Ast visitFunctiondeclaration(exprParser.FunctiondeclarationContext ctx) { 
		pere2 = "Functiondeclaration";
		pile_region.add(String.valueOf(num_region));
		String idfString = ctx.getChild(1).toString();
		List<List> list_fun = new ArrayList<>();
		List<String> nom = new ArrayList<>();
		nom.add("TDS_" + idfString + "_" + (num_region++) + "_" + (num_imbrication++));
		list_fun.add(nom);
		tds.add(list_fun);
		
		Idf idf = new Idf(idfString);
		Ast typefields = ctx.getChild(3).accept(this);
		if (ctx.getChildCount() == 7){
			Ast expr = ctx.getChild(6).accept(this);
			num_imbrication--;
			pile_region.remove(pile_region.size()-1);
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = new ArrayList<>();
			line.add(idfString);
			line.add("METHOD");
			line.add("void");
			line.add(Integer.toString(args.size()));
			line.addAll(args);
			list.add(line);
			args.clear();
			//System.out.println(pile_region);
			return new FunctionDeclaration(idf, typefields, expr, null);
		} else {
			String typeidString = ctx.getChild(6).toString();
			Ast typeid = ctx.getChild(6).accept(this);
			Ast expr = ctx.getChild(8).accept(this);
			pile_region.remove(pile_region.size()-1);
			//System.out.println(pile_region);
			num_imbrication--;
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = new ArrayList<>();
			line.add(idfString);
			line.add("METHOD");
			line.add(ctx.getChild(6).accept(this).toString());
			line.add(Integer.toString(args.size()));
			line.addAll(args);
			list.add(line);
			args.clear();
			return new FunctionDeclaration(idf, typefields,expr, typeid);
		} 
	}
	@Override public Ast visitPrinti(exprParser.PrintiContext ctx) { 
		pere2 = "Printi";
		Ast printe = ctx.getChild(1).accept(this);
		return new Printe(printe);
	 }
	@Override public Ast visitPrint(exprParser.PrintContext ctx) { 
		pere2 = "Print";
		Ast printe = ctx.getChild(1).accept(this);
		return new Printe(printe);
	 }
	 
	
	@Override 
	public Ast visitIfthenelse(exprParser.IfthenelseContext ctx){
		pere2 = "Ifthenelse";
		pere = "if";
		pile_region.add(String.valueOf(num_region));
		List<List> list_if = new ArrayList<>();
		List<String> nom = new ArrayList<>();
		nom.add("TDS_if_" + (num_region++) + "_" + (num_imbrication++));
		list_if.add(nom);
		tds.add(list_if);

		Ast condition = ctx.getChild(1).accept(this);
		Ast alors = ctx.getChild(3).accept(this);
		if(ctx.getChildCount()>5)
		{
			Ast ouOccasionnel = ctx.getChild(5).accept(this);
			pile_region.remove(pile_region.size()-1);
			//System.out.println(pile_region);
			num_imbrication--;
			return new Ifthenelse((Ast)new If(condition), (Ast)new Then(alors), (Ast)new Else(ouOccasionnel));
		}
		else
		{
			num_imbrication--;
			pile_region.remove(pile_region.size()-1);
			//System.out.println(pile_region);
			return new Ifthenelse((Ast)new If(condition), (Ast)new Then(alors),null);
		}
	}


	

	@Override 
	public Ast visitDeclarationlists(exprParser.DeclarationlistsContext ctx) { 
		pere2 = "Declarationlists";
		pile_region.add(String.valueOf(num_region));
		List<List> list_let = new ArrayList<>();
		List<String> nom = new ArrayList<>();
		nom.add("TDS_let_" + (num_region++) + "_" + (num_imbrication++));
		list_let.add(nom);
		tds.add(list_let);
		Ast affect = ctx.getChild(1).accept(this);
		num_imbrication--;
		pile_region.remove(pile_region.size()-1);
		//System.out.println(pile_region);
		controle_semantique = true;
		Ast dans = ctx.getChild(3).accept(this);
		return new Declarationlists(dans,affect);
	}
	@Override 
	public Ast visitExprtiret(exprParser.ExprtiretContext ctx) { 
		pere2 = "Exprtiret";
		return ctx.getChild(1).accept(this);
	}


	@Override 
	public Ast visitFor(exprParser.ForContext ctx) { 
		pere2 = "For";
		pere = "for";
		pile_region.add(String.valueOf(num_region));
		List<List> list_for = new ArrayList<>();
		List<String> nom = new ArrayList<>();
		List<String> caractéristiques = new ArrayList<>();
		nom.add("TDS_for_" + (num_region++) + "_" + (num_imbrication++));
		list_for.add(nom);


		String idfString = ctx.getChild(1).toString();
		caractéristiques.add(idfString);
		caractéristiques.add("COMPT");

		list_for.add(caractéristiques);

		tds.add(list_for);
		
		Ast deb= ctx.getChild(3).accept(this);
		Ast fin = ctx.getChild(5).accept(this);
		pere="finFor";
		Ast faire = ctx.getChild(7).accept(this);
		
		
		num_imbrication--;
		pile_region.remove(pile_region.size()-1);
		//System.out.println(pile_region);
		pere = null;
		return new For((Ast)new Idf(idfString), (Ast)new BorneInf(deb), (Ast)new BorneSup(fin),(Ast)new Do(faire));
	}
//on met peut etre idf mais à voir plus tard
	@Override 
	public Ast visitLvalues(exprParser.LvaluesContext ctx) { 
		pere2 = "Lvalues";
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
		pere2 = "Nilop";
		return ctx.getChild(1).accept(this);
	}
	@Override 
	public Ast visitOps(exprParser.OpsContext ctx) { 
		pere2 = "Ops";
		return ctx.getChild(0).accept(this);
	}
	@Override 
	public Ast visitParenthesis(exprParser.ParenthesisContext ctx) { 
		pere2 = "Parenthesis";
		System.out.println("Dans parentheses");
		return ctx.getChild(1).accept(this);
	}
	@Override 
	public Ast visitPrints(exprParser.PrintsContext ctx) { 
		pere2 = "Prints";
		return ctx.getChild(0).accept(this);
	}
	@Override 
	public Ast visitPrintis(exprParser.PrintisContext ctx) { 
		pere2 = "Printis";
		return ctx.getChild(0).accept(this);
	}
	@Override 
	public Ast visitTypeids(exprParser.TypeidsContext ctx) { 
		pere2 = "Typeids";
		pere = "typeids";
		if(ctx.getChildCount()==4){
			Ast typeids1= ctx.getChild(0).accept(this);
			Ast fieldlist1= ctx.getChild(2).accept(this);

			return new Typeids(typeids1,fieldlist1,null);
		} else if (ctx.getChildCount()==6){
			Ast typeids2= ctx.getChild(0).accept(this);
			
			Ast expr1= ctx.getChild(2).accept(this);
			Ast expr2= ctx.getChild(5).accept(this);
			return new Typeids(typeids2, expr1, expr2);
		} else {
			return new Typeids(null, null, null);
		}
	}
	@Override 
	public Ast visitWhile(exprParser.WhileContext ctx) { 
		pere2 = "While";
		pile_region.add(String.valueOf(num_region));
		List<List> list_while = new ArrayList<>();
		List<String> nom = new ArrayList<>();
		nom.add("TDS_while_" + (num_region++) + "_" + (num_imbrication++));
		list_while.add(nom);
		tds.add(list_while);

		Ast condition = ctx.getChild(1).accept(this);
		Ast faire= ctx.getChild(3).accept(this);
		num_imbrication--;
		pile_region.remove(pile_region.size()-1);
		return new While(condition, faire);
	}
	@Override 
	public Ast visitValint(exprParser.ValintContext ctx) {
		int intString = Integer.parseInt(ctx.getChild(ctx.getChildCount()-1).toString());
		if (pere != null && (pere.equals("for") || pere.equals("typeids"))){
			System.out.println("pere = " + pere2);
			System.out.println("Idf : " + intString);
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = list.get(list.size()-1);
			//System.out.println("line = " + line);
			String calcul = line.get(line.size()-1);
			if (calcul.charAt(calcul.length()-1) == '+' || calcul.charAt(calcul.length()-1) == '-' || calcul.charAt(calcul.length()-1) == '*' || calcul.charAt(calcul.length()-1) == '/'){
				if (calcul.length() == 1){
					calcul = intString + calcul;
				} else {
					calcul = calcul + intString;
				}
				line.set(line.size()-1,calcul);
			} else {
				line.add("" + intString);
			}
		}
		return new IntNode(intString);
	}
	@Override 
	public Ast visitValidf(exprParser.ValidfContext ctx) { 
		String idfString = ctx.getChild(ctx.getChildCount()-1).toString();
		//System.out.println("Pere : " + pere + "\n");
		if (pere != null && (pere.equals("for") || pere.equals("typeids"))){
			System.out.println("pere = " + pere2);
			//System.out.println("pile_region : " + pile_region.get(pile_region.size()-1));
			System.out.println("Idf : " + idfString);
			//System.out.println("tds : " + tds);
			int indice = TDS.getTds(Integer.parseInt(pile_region.get(pile_region.size()-1)),tds);
			List<List> list = tds.get(indice);
			List<String> line = list.get(list.size()-1);
			String calcul = line.get(line.size()-1);
			if (calcul.charAt(calcul.length()-1) == '+' || calcul.charAt(calcul.length()-1) == '-' || calcul.charAt(calcul.length()-1) == '*' || calcul.charAt(calcul.length()-1) == '/'){
				if (calcul.length() == 1){
					calcul = idfString + calcul;
				} else {
					calcul = calcul + idfString;
				}
				line.set(line.size()-1,calcul);
			} else {
				line.add("" + idfString);
			}
			
		}
		
		
		return new Idf(idfString);
	}
	@Override 
	public Ast visitValop(exprParser.ValopContext ctx) {
		pere2 = "Valop";
		return ctx.getChild(ctx.getChildCount()-2).accept(this);
	}
	@Override 
	public Ast visitVallvalue(exprParser.VallvalueContext ctx) {
		pere2 = "Vallvalue";
		return ctx.getChild(ctx.getChildCount()-1).accept(this);
	}
}
