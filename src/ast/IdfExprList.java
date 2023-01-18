package ast;

import java.util.ArrayList;
import java.util.List;

public class IdfExprList implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public ArrayList<Ast> IdfExprList;
    public int line;
    public List<List> tds;

    public IdfExprList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.IdfExprList = new ArrayList<>();
        this.tds = tds;
    }
    
    public void addIdfExprList(Ast expr){
        this.IdfExprList.add(expr);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < IdfExprList.size(); i++) {
            List<String> sem = IdfExprList.get(i).ControleSemantique();
            //System.out.println("Dans sem : " + sem);

            if (sem.size() > 1){
                String name = sem.get(1);
                System.out.println("Dans sem nom: " + name);
                //System.out.println("Dans sem type du nom de base: " + TDS.getType(name,tds));
                //si le type récupéré est une liste 
                //System.out.println(TDS.getAttribut(TDS.getType(name, tds),tds));
                //System.out.println(TDS.getAttribut(TDS.getType(name, tds),tds).compareTo("TYPEARRAY")==0);
                if(TDS.getType(name,tds)!=null && TDS.getAttribut(TDS.getType(name, tds),tds).compareTo("TYPEARRAY")==0){
                    System.out.println("on a un array");
                    //System.out.println("indice dans idfexprList : " + i);
                    //si l'indice passé à cette liste n'est pas un entier
                    //System.out.println(IdfExprList.get(0).ControleSemantique());
                    if(i+1<IdfExprList.size() && IdfExprList.get(i+1).ControleSemantique().get(0).compareTo("int")!=0){
                        //System.out.println("on note");
                        //System.out.println("on chope le n qui suis");
                        TDS.write("Erreur ligne " + line + " : l'indice saisi pour obtenir un élément dans la liste n'est pas un entier");

                    }
                }
                //System.out.println("Dans sem type avec double passage: " + TDS.getType(TDS.getType(name,tds),tds));

                String type = TDS.getType(TDS.getType(name,tds),tds);
                list.add(type);
                list.add(name);
                list.add(line + "");
            }
            
        }
        System.out.println("Dans sem idfexprlist: " + list);
        return list;
    }

}
