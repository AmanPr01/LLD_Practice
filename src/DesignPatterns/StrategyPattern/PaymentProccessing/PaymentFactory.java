package DesignPatterns.StrategyPattern.PaymentProccessing;

import DesignPatterns.StrategyPattern.PaymentProccessing.Strategy.CreditCardPayment;
import DesignPatterns.StrategyPattern.PaymentProccessing.Strategy.PayPalPayment;
import DesignPatterns.StrategyPattern.PaymentProccessing.Strategy.PaymentStrategy;

public class PaymentFactory {
    public static PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
        switch (paymentType) {
            case CREDIT_CARD -> {
                return new CreditCardPayment();
            }
            case PAYPAL -> {
                return new PayPalPayment();
            }
        }
        return null;
    }
}
