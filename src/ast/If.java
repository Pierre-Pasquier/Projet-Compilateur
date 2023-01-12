package ast;

import java.util.List;

public class If implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast condition;
    public int line;
    public If(Ast condition,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.condition=condition;
    }
    
    @Override
    public List<String> ControleSemantique() {
        return condition.ControleSemantique();
        
    }


}
