package ast;

import java.util.ArrayList;

public class IdfExprList implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfExprList;
    public Ast Idf;

    public IdfExprList(Ast Idf){
        this.IdfExprList = new ArrayList<>();
        this.Idf = Idf;
    }
    
    public void addIdfExprList(Ast expr){
        this.IdfExprList.add(expr);
    }
}
