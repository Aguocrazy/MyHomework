package three;

interface Implementor {
    void operationImpl();
}
class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor A");
    }
}
class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor B");
    }
}
abstract class Abstraction {
    protected Implementor implementor;
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    abstract void operation();
}
class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    @Override
    void operation() {
        implementor.operationImpl();
    }
}
