interface Target {
    void request();
}
class Adaptee {
    public void specificRequest() {
        System.out.println("Adaptee");
    }
}
class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
