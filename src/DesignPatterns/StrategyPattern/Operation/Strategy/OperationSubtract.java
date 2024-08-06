package DesignPatterns.StrategyPattern.Operation.Strategy;

public class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int x, int y) {
        return Math.abs(x - y);
    }
}
