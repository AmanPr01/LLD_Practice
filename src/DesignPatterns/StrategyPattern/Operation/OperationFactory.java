package DesignPatterns.StrategyPattern.Operation;

import DesignPatterns.StrategyPattern.Operation.Strategy.OperationAddition;
import DesignPatterns.StrategyPattern.Operation.Strategy.OperationMultiply;
import DesignPatterns.StrategyPattern.Operation.Strategy.OperationSubtract;
import DesignPatterns.StrategyPattern.Operation.Strategy.Strategy;

public class OperationFactory {
    public static Strategy getOperation(OperationType operationType) {
        switch (operationType) {
            case ADDITION -> {
                return new OperationAddition();
            }
            case SUBTRACTION -> {
                return new OperationSubtract();
            }
            case MULTIPLICATION -> {
                return new OperationMultiply();
            }
        }
        return null;
    }
}
