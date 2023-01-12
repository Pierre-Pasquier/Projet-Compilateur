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
        TDS.num_imbrication++;
        TDS.num_region++;
        List<String> list = new ArrayList<>();
        //boucle sur les élément de expr et on vérifie si ils sont ous égaux ou non
        for (int i = 0; i < expr.ControleSemantique().size() && i < typefields.ControleSemantique().size() ; i++) {
            if (expr.ControleSemantique().get(i).equals(typefields.ControleSemantique().get(i))){
                list.add(expr.ControleSemantique().get(i));
            } else {
                TDS.write("Erreur ligne " + line + " : type de retour de la fonction " + Idf.ControleSemantique().get(1) + " non conforme");
                list.add("");
            }
        }
        TDS.num_imbrication--;
        return list;
        
    }
}
