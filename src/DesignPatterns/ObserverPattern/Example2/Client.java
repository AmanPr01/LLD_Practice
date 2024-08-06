package DesignPatterns.ObserverPattern.Example2;

public class Client {
    public static void main(String[] args) {

        Stock stock = new Stock();

        StockObserver display1 = new StockDisplay(stock);
        StockObserver display2 = new StockDisplay(stock);
        StockObserver display3 = new StockDisplay(stock);

        stock.setPrice(100);
        stock.setPrice(200);
        stock.setPrice(300);
    }
}
