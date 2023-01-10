package ast;

import java.util.List;


public class Stringg implements Ast{
    
    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public String name;

    public Stringg(String name){
        this.name = name;
    }

    @Override
    public void ControleSemantique() {
        
    }
   

}
