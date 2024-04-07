package tow;

import java.util.ArrayList;
import java.util.List;
interface Observer {
    void update(String message);
}
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
class ConcreteObserver implements Observer {
    private String name;
    public ConcreteObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
