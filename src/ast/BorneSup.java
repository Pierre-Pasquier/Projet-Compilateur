package ast;

import java.util.List;

public class BorneSup implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast fin;
    public int line;
    public BorneSup(Ast fin,int line){
        this.line = line;
        this.fin=fin;
    }
    @Override
    public List<String> ControleSemantique() {
        
        return fin.ControleSemantique();
        
    }

}
