package ast;

import java.util.List;


public class Printis implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast printis;
    public int line;


    public Printis(Ast printis,int line){
        this.line = line;
        this.printis = printis;
    }



    @Override
    public List<String> ControleSemantique() {
        
        return printis.ControleSemantique();
        
    }


}

