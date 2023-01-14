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
    public List<List> tds;

    public FunctionDeclaration(Ast Idf, Ast typefields, Ast expr, Ast typeid,int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typeid = typeid;
        this.Idf = Idf;
        this.expr = expr;
        this.typefields = typefields;
        this.tds = tds;
    }

    @Override
    public List<String> ControleSemantique() {
        TDS.num_imbrication++;
        TDS.num_region++;
        List<String> list = new ArrayList<>();
        List<String> exp = expr.ControleSemantique();
        String name = Idf.ControleSemantique().get(1);
        List<String> typf = typefields.ControleSemantique();
        String type = TDS.getType(name, tds);
        System.out.println("Classe de expr : " + expr.getClass().getName());
        System.out.println("type de retour de la fonction " + name + " : " + type);
        System.out.println(exp);
        //boucle sur les élément de expr et on vérifie si ils sont tous égaux ou non
        for (int i = 0; i < exp.size(); i++) {
            if (exp.get(i).equals(type) || exp.get(i).equals("")){
                list.add(exp.get(i));
            } else {
                TDS.write("Erreur ligne " + line + " : type de retour de la fonction " + name + " non conforme");
                list.add("");
            }
        }
        TDS.num_imbrication--;
        return list;
        
    }
}
