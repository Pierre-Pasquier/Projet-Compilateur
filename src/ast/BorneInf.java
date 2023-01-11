package ast;

import java.util.List;

public class BorneInf implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast deb;
    public int line;
    public BorneInf(Ast deb,int line){
        this.line = line;
        this.deb=deb;
    }
    @Override
    public List<String> ControleSemantique() {
        return deb.ControleSemantique();
        
    }
}

