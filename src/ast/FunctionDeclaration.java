package ast;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclaration implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast Idf;
    public Ast expr;
    public Ast typefields;
    public int line;

    public FunctionDeclaration(Ast Idf, Ast typefields, Ast expr, Ast typeid,int line){
        this.line = line;
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
        this.typefields = typefields;
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        if (typeid != null){
            list.addAll(typeid.ControleSemantique());
        }
        list.addAll(Idf.ControleSemantique());
        list.addAll(expr.ControleSemantique());
        list.addAll(typefields.ControleSemantique());
        list.add("");
        return list;
        
    }


    


}
