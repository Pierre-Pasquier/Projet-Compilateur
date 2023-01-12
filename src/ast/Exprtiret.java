package ast;

import java.util.List;

public class Exprtiret  implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expr_;
    public int line;


    public Exprtiret(Ast expr,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.expr_ = expr;
    }


    @Override
    public List<String> ControleSemantique() {
        
        return expr_.ControleSemantique();
        
    }

}