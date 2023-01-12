package ast;

import java.util.List;

public class Nilop implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast nilop;
    public int line;


    public Nilop(Ast nilop,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.nilop = nilop;
    }


    @Override
    public List<String> ControleSemantique() {
        
        return nilop.ControleSemantique();
        
    }

}
