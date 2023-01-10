package ast;

import java.util.ArrayList;

public class IdfList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfList;

    public IdfList(){
        this.IdfList = new ArrayList<>();
    }
    
    public void addIdfList(Ast Idf){
        this.IdfList.add(Idf);
    }

    @Override
    public void ControleSemantique() {
        // TODO Auto-generated method stub
        
    }
}
// Voir si il ne faut pas faire une liste de String comme dans Idf si ça marche pas