package ast;

public class Printe implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printe;


    public Printe(Ast printe){
        this.printe = printe;
    }


    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}