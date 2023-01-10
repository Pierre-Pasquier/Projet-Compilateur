package ast;

import java.util.List;


public class Printis implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printis;


    public Printis(Ast printis){
        this.printis = printis;
    }


    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}

