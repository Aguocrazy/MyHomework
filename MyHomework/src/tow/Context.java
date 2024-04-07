package tow;

interface Strategy {
    int execute(int a, int b);
}
class Add implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
class Subtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
