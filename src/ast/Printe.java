package ast;

import java.util.List;

public class Printe implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printe;
    public int line;


    public Printe(Ast printe,int line){
        this.line = line;
        this.printe = printe;
    }



    @Override
    public List<String> ControleSemantique() {
        
        return printe.ControleSemantique();
        
    }


}
