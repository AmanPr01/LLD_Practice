package DesignPatterns.StrategyPattern.SortingAlgorithm;

import DesignPatterns.StrategyPattern.SortingAlgorithm.Strategy.BubbleSort;
import DesignPatterns.StrategyPattern.SortingAlgorithm.Strategy.QuickSort;
import DesignPatterns.StrategyPattern.SortingAlgorithm.Strategy.SortStrategy;

public class SortFactory {

    public static SortStrategy getSortingStrategy(SortType type) {
        return switch (type) {
            case BUBBLE_SORT -> new BubbleSort();
            case QUICK_SORT -> new QuickSort();
        };
    }
}
