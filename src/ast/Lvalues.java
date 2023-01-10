package ast;

import java.util.List;

public class Lvalues implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast lvalue;
    public Ast listexpression;


    public Lvalues(Ast lvalue,Ast listexpression){
        this.lvalue=lvalue;
        this.listexpression=listexpression;
    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }




}