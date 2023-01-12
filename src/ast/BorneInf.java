package ast;

import java.util.List;

public class BorneInf implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast deb;
    public int line;
    public BorneInf(Ast deb,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.deb=deb;
    }
    @Override
    public List<String> ControleSemantique() {
        return deb.ControleSemantique();
        
    }
}

