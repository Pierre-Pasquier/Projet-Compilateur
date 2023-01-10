package ast;

import java.util.ArrayList;
import java.util.List;

public class IdfExprList implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfExprList;
    public int line;

    public IdfExprList(int line){
        this.line = line;
        this.IdfExprList = new ArrayList<>();
    }
    
    public void addIdfExprList(Ast expr){
        this.IdfExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
