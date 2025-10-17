package behavioral.visitor.resolve;

interface Visitor {

    void visit(Circle circle);

    void visit(Rectangle rectangle);
}
