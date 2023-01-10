package ast;

import java.util.List;

public class Exprtiret  implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expr_;
    public int line;


    public Exprtiret(Ast expr,int line){
        this.line = line;
        this.expr_ = expr;
    }


    @Override
    public List<String> ControleSemantique() {
        expr_.ControleSemantique();
        return null;
        
    }

}