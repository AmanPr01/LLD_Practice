package DesignPatterns.StrategyPattern.Operation;

import DesignPatterns.StrategyPattern.Operation.Strategy.Strategy;

public class Operation {
    public void doOperation(int x, int y, OperationType operationType) {
        Strategy strategy = OperationFactory.getOperation(operationType);
        assert strategy != null;
        System.out.println(strategy.doOperation(x, y));
    }
}
