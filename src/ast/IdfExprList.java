package ast;

import java.util.ArrayList;

public class IdfExprList implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfExprList;

    public IdfExprList(){
        this.IdfExprList = new ArrayList<>();
    }
    
    public void addIdfExprList(Ast expr){
        this.IdfExprList.add(expr);
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
