package DesignPatterns.ObserverPattern.Example2;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<StockObserver> observers;
    private int price;

    public Stock() {
        this.observers = new ArrayList<>();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update();
        }
    }
}
