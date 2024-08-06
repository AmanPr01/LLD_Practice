package DesignPatterns.StrategyPattern.Operation.Strategy;

public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int x, int y) {
        return x * y;
    }
}
