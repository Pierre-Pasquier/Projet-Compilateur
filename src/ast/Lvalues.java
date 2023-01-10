package ast;

import java.util.List;

public class Lvalues implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast lvalue;
    public Ast listexpression;
    public int line;


    public Lvalues(Ast lvalue,Ast listexpression,int line){
        this.line = line;
        this.lvalue=lvalue;
        this.listexpression=listexpression;
    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }




}