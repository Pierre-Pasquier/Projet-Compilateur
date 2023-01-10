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
        for (int i = 0; i < ExprList.size(); i++) {
            if (i == 0){
                TDS.setFonctionEtudiee(ExprList.get(i).ControleSemantique().get(0));
                TDS.setFonctionEtudiee(null);
            }
            else{
                ExprList.get(i).ControleSemantique();
            }
        }
        return null;
        
    }

}
