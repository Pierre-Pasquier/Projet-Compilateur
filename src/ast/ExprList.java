package ast;

import java.util.ArrayList;
import java.util.List;

public class ExprList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> ExprList;
    public int line;

    public ExprList(int line){
        this.line = line;
        this.ExprList = new ArrayList<>();
    }
    
    public void addExprList(Ast expr){
        this.ExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        String fonction = null;
        for (int i = 0; i < ExprList.size(); i++) {
            if (i == 0){
                fonction = ExprList.get(i).ControleSemantique().get(0);
            }
            else{
                // verif type args
                ExprList.get(i).ControleSemantique();
            }
        }
        int nb_fils = (ExprList.size()-1)/2;
        int bon_nb_fils = TDS.getNbFils(fonction,TDS.tds);
        if (bon_nb_fils != nb_fils){
            if (bon_nb_fils == -1){
                TDS.write("Erreur ligne " + line + " : la fonction " + fonction + " n'est pas définie");
            } else {
                TDS.write("Erreur ligne " + line + " : nombre d'arguments incorrects pour la fonction " + fonction + ", expected " + bon_nb_fils + ", got : " + nb_fils);
            }
            
        }
        return null;
        
    }

}
