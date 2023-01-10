package ast;

import java.util.List;

public class BorneSup implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast fin;
    public BorneSup(Ast fin){
        this.fin=fin;
    }
    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
