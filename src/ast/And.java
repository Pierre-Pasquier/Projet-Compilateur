package ast;

import java.util.ArrayList;
import java.util.List;

public class And implements Ast {

    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public ArrayList<Ast> AndList;

    int line;

    public And(int line, int num_region, int num_imbrication, List<List> tds) {
        this.line = line;
        this.AndList = new ArrayList<>();
    }

    public void addAnd(Ast and) {
        this.AndList.add(and);
    }

    @Override
    public List<String> ControleSemantique() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < AndList.size(); i++) {
            list.addAll(AndList.get(i).ControleSemantique());
        }
        list.add("");
        return list;
    }

}