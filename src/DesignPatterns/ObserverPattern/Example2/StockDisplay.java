package DesignPatterns.ObserverPattern.Example2;

public class StockDisplay implements StockObserver {

    private Stock stock;

    public StockDisplay(Stock stock) {
        this.stock = stock;
        stock.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Stock price updated to: " + stock.getPrice());
    }
}
