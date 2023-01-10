package ast;

public class Declarationlists implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast affect;
    public Ast dans;


    public Declarationlists(Ast dans,Ast affect){
        this.dans=dans;
        this.affect=affect;
    }


    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
  
}