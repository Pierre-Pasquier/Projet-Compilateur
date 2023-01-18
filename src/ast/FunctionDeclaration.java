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

        for(int i=0;i<typf.size()/4;i++){
            List<String> listel = new ArrayList<>();
            if(typf.get(i*4)!=null && typf.get((i*4)+3)!=null){
                listel.add(typf.get(i*4));
                listel.add(typf.get((i*4)+3));
                for(int k=i+1;k<typf.size()/4;k++){
                    if(listel.get(0)!=null && listel.get(1)!=null && listel.get(0).compareTo(typf.get(k*4))==0 && listel.get(1).compareTo(typf.get((k*4)+3))==0 ){
                        TDS.write("Erreur ligne " + line + " : plusieurs arguments ont le nom " + listel.get(1)+ " et le même type "+ listel.get(0));
                    }
                }
            }
        }
        //System.out.println("Classe de expr : " + expr.getClass().getName());
        //System.out.println("type de retour de la fonction " + name + " : " + type);
        //System.out.println(exp);
        //boucle sur les élément de expr et on vérifie si ils sont tous égaux ou non
        for (int i = 0; i < exp.size()/2; i++) {
            if (exp.get(2*i).equals(type) || exp.get(2*i).equals("")){
                list.add(exp.get(2*i));
            } else {
                TDS.write("Erreur ligne " + exp.get(2*i+1) + " : type de retour de la fonction " + name + " non conforme");
                list.add("");
            }
        }
        TDS.num_imbrication--;
        return list;
        
    }
}
