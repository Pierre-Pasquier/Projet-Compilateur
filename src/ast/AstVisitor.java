package ast;


public interface AstVisitor<T> {

    public T visit(ExprSeq affect);
    public T visit(ExprList affect);
    public T visit(FieldList affect);
    public T visit(Idf affect);
    public T visit(IdfList affect);
    public T visit(IdfExprList affect);
    public T visit(DeclarationList affect);
    public T visit(TypeDeclaration affect);
    public T visit(TypeFieldList affect);
    public T visit(TypeField affect);
    public T visit(VariableDeclaration affect);
    public T visit(FunctionDeclaration affect);
}
