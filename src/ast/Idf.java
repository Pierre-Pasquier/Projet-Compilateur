package ast;

import java.util.List;

public class Idf implements Ast{
    
    // Utile pour la dernière partie
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public String name;
    public int line;

    public Idf(String name,int line){
        this.line = line;
        this.name = name;
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

   

}
