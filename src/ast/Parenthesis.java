package ast;

import java.util.List;

public class Parenthesis implements Ast {

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast parenthesis;
    public int line;


    public Parenthesis(Ast parenthesis,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.parenthesis = parenthesis;
    }


    @Override
    public List<String> ControleSemantique() {
        return parenthesis.ControleSemantique();
        
    }

}

