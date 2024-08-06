package DesignPatterns.ObserverPattern.Example1;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
