package ast;

public class Parenthesis implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast parenthesis;


    public Parenthesis(Ast parenthesis){
        this.parenthesis = parenthesis;
    }


    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}

