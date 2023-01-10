package ast;

import java.util.ArrayList;
import java.util.List;

public class IdfList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfList;
    public int line;

    public IdfList(int line){
        this.line = line;
        this.IdfList = new ArrayList<>();
    }
    
    public void addIdfList(Ast Idf){
        this.IdfList.add(Idf);
    }

    @Override
    public List<String> ControleSemantique() {
        // TODO Auto-generated method stub
        return null;
        
    }

}
// Voir si il ne faut pas faire une liste de String comme dans Idf si ça marche pas