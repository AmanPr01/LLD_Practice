package DesignPatterns.StrategyPattern.PaymentProccessing;

import DesignPatterns.StrategyPattern.PaymentProccessing.Strategy.PaymentStrategy;

public class ShoppingCart {

    public void checkout(int amount, PaymentType paymentType) {
        PaymentStrategy paymentStrategy = PaymentFactory.getPaymentStrategy(paymentType);
        assert paymentStrategy != null;
        paymentStrategy.pay(amount);
    }
}
