package ast;

import java.util.List;


public class Then implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public Ast alors;
    public int line;
    public Then(Ast alors,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.alors=alors;
    }

    @Override
    public List<String> ControleSemantique() {
        
        return alors.ControleSemantique();
        
    }


}
