package ast;

public interface And {

    public <T> T accept(AstVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}