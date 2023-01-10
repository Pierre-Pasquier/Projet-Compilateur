package ast;

import java.util.List;

public interface Ast {

    public <T> T accept(AstVisitor<T> visitor);

    public List<String> ControleSemantique();
    
}