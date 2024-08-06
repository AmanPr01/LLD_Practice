package DesignPatterns.StrategyPattern.Operation;

import DesignPatterns.StrategyPattern.Operation.Strategy.Strategy;

public class Client {
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.doOperation(10, 30, OperationType.MULTIPLICATION);
    }
}
