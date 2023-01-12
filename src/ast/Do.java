package ast;

import java.util.List;

public class Do implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast faire;
    public int line;
    public Do(Ast faire,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.faire=faire;
    }
    @Override
    public List<String> ControleSemantique() {
        
        return faire.ControleSemantique();
        
    }

}
