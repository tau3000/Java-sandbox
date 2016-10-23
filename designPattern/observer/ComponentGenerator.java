package observer;

import java.util.ArrayList;

import lombok.Getter;

public abstract class ComponentGenerator {
    private ArrayList<Observer> observers = new ArrayList<>();
    protected int state;
    @Getter private String name;

    public ComponentGenerator() {

    }

    public ComponentGenerator(String name) {
        this.name = name;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.stream().forEachOrdered(o -> o.update(this));
    }

    public abstract int getState();

    public abstract void execute();
}
