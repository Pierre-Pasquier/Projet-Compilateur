package ast;

import java.util.ArrayList;

public class ExprSeq implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> ExprSeq;

    public ExprSeq(){
        this.ExprSeq = new ArrayList<>();
    }
    
    public void addExprSeq(Ast expr){
        this.ExprSeq.add(expr);
    }
}