package ast;

import java.util.List;

public class Printe implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printe;


    public Printe(Ast printe){
        this.printe = printe;
    }



    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }


}
