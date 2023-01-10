package ast;

import java.util.List;

public class Declarationlists implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast affect;
    public Ast dans;
    public int line;


    public Declarationlists(Ast dans,Ast affect,int line){
        this.line = line;
        this.dans=dans;
        this.affect=affect;
    }


    @Override
    public List<String> ControleSemantique() {
        affect.ControleSemantique();
        dans.ControleSemantique();
        return null;
        
    }
  
}