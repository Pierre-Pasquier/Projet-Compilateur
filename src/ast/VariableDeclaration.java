package ast;

import java.util.ArrayList;
import java.util.List;


public class VariableDeclaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public Ast expr;
    public int line;

    public VariableDeclaration(Ast Idf, Ast expr, Ast typeid,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
    }

    public VariableDeclaration(Ast Idf, Ast expr){
        this.Idf = Idf;
        this.expr = expr;
    }

  
    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        if (typeid != null){
            list.addAll(typeid.ControleSemantique());
        }
        list.addAll(Idf.ControleSemantique());
        list.addAll(expr.ControleSemantique());
        list.add("");
        return list;
        
    }


}
