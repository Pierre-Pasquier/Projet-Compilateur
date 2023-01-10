package ast;

import java.util.List;

public class Exprtiret  implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expr_;


    public Exprtiret(Ast expr){
        this.expr_ = expr;
    }


    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}