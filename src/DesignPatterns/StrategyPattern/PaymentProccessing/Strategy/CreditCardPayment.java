package DesignPatterns.StrategyPattern.PaymentProccessing.Strategy;

public class CreditCardPayment implements PaymentStrategy {

    private String creditCardNumber;
    private String creditCardHolderName;

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardHolderName() {
        return creditCardHolderName;
    }

    public void setCreditCardHolderName(String creditCardHolderName) {
        this.creditCardHolderName = creditCardHolderName;
    }
}
