package DesignPatterns.StrategyPattern.PaymentProccessing;

import DesignPatterns.StrategyPattern.PaymentProccessing.Strategy.CreditCardPayment;
import DesignPatterns.StrategyPattern.PaymentProccessing.Strategy.PayPalPayment;

public class Client {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.checkout(500, PaymentType.PAYPAL);

        shoppingCart.checkout(500, PaymentType.CREDIT_CARD);
    }
}
