package ast;

import java.util.List;

public class Declarationlists implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast affect;
    public Ast dans;


    public Declarationlists(Ast dans,Ast affect){
        this.dans=dans;
        this.affect=affect;
    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }
  
}