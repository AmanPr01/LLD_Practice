package DesignPatterns.StrategyPattern.PaymentProccessing.Strategy;

public class PayPalPayment implements PaymentStrategy {

    private String mail;
    private String name;

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with paypal");
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
