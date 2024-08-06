package DesignPatterns.ObserverPattern.Example1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private final List<Observer> observers;
    private int state;

    public ConcreteSubject() {
        this.observers = new ArrayList<Observer>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        for (Observer observer : observers) {
            System.out.println(observer + " is present");
        }
        observers.remove(o);
        System.out.println(o + " Removed");
        for (Observer observer : observers) {
            System.out.println(observer + " is present");
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
