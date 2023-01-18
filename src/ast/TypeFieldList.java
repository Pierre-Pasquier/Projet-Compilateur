package ast;

import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.ArrayList;

public class TypeFieldList implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> typefieldList;
    public int line;

    public TypeFieldList(int line, int num_region, int num_imbrication, List<List> tds){
        this.line = line;
        this.typefieldList = new ArrayList<>();
    }
    
    public void addTypeField(Ast typefield){
        this.typefieldList.add(typefield);
    }


    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<>();
        for (Ast typefield : typefieldList) {
            list.addAll(typefield.ControleSemantique());
        }
        System.out.println("type field list : " + list);
        for(int i=0;i<list.size()/4;i++){
            List<String> listel = new ArrayList<>();
            if(list.get(i*4)!=null && list.get((i*4)+3)!=null){
                listel.add(list.get(i*4));
                listel.add(list.get((i*4)+3));
                for(int k=i+1;k<list.size()/4;k++){
                    if(listel.get(0)!=null && listel.get(1)!=null && listel.get(0).compareTo(list.get(k*4))==0 && listel.get(1).compareTo(list.get((k*4)+3))==0 ){
                        TDS.write("Erreur ligne " + line + " : plusieurs arguments ont le nom " + listel.get(1)+ " et le même type "+ listel.get(0));
                    }
                }
            }
        }
        list.add("");
        return list;
        
    }

}
