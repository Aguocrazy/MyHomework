package three;

interface Visitor {
    void visit(Element element);
}
interface Element {
    void accept(Visitor visitor);
}
class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof ConcreteElementA) {
            System.out.println("Visitor A");
        } else if (element instanceof ConcreteElementB) {
            System.out.println("Visitor B");
        }
    }
}
