package ast;

import java.util.ArrayList;

import parser.exprBaseVisitor;
import parser.exprParser;

public class AstCreator extends exprBaseVisitor<Ast>{

    	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExprSeq(exprParser.ProgramContext ctx) {
		Ast instructions = ctx.getChild(0).accept(this);

		return new Program(instructions);
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitInstr(exprParser.InstrContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitPrint_litteral(exprParser.Print_litteralContext ctx) {
		Ast value = ctx.getChild(0).accept(this);
		
		return new Print(value);

	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitIfThenElse(exprParser.IfThenElseContext ctx) {
		Ast condition = ctx.getChild(0).accept(this);
    	Ast thenBlock = ctx.getChild(1).accept(this);
    	Ast elseBlock = ctx.getChild(2).accept(this);
	
	
		return new IfThenElse(condition, thenBlock, elseBlock);
	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitIfThen(exprParser.IfThenContext ctx) { 
		
		Ast condition = ctx.getChild(0).accept(this);
    	Ast thenBlock = ctx.getChild(1).accept(this);
	
	
		return new IfThen(condition, thenBlock); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitInstr_list(exprParser.Instr_listContext ctx) { 
		InstrList instrList = new InstrList();

		for (int i=0; i<ctx.getChildCount();i++){
			instrList.addInstr(ctx.getChild(i).accept(this));
		}

		return instrList;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitAffect(exprParser.AffectContext ctx) { 
		
		Ast expr = ctx.getChild(2).accept(this);
		String idfString = ctx.getChild(0).toString();
	
		//Création des sous AST
		Idf idf = new Idf(idfString);
	
		return new Affect(idf,expr);
	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExpr(exprParser.ExprContext ctx) { 
		return ctx.getChild(0).accept(this); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitPlus(exprParser.PlusContext ctx) { 
		Ast noeudTemporaire = ctx.getChild(0).accept(this);


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
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitMult(exprParser.MultContext ctx) { 
		Ast noeudTemporaire = ctx.getChild(0).accept(this);


        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);

            switch (operation) {
                case "/":
                    noeudTemporaire = new Divide(noeudTemporaire,right);
                    break;
                case "*":
                    noeudTemporaire = new Mult(noeudTemporaire,right);
                    break;
                default:
                    break;
            }


        }    

        return noeudTemporaire;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitInteger(exprParser.IntegerContext ctx) { 
		String integer = ctx.getChild(0).toString();
		
		return new IntNode(Integer.parseInt(integer)) ; 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitIdentifier(exprParser.IdentifierContext ctx) { 
		String idf = ctx.getChild(0).toString();
		
		return new Idf(idf);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitParenthesis(exprParser.ParenthesisContext ctx) { 
		return ctx.getChild(1).accept(this); 
	}
}
