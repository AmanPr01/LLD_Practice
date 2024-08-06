package DesignPatterns.StrategyPattern.SortingAlgorithm;

import DesignPatterns.StrategyPattern.SortingAlgorithm.Strategy.SortStrategy;

public class SortingContext {

    public void sort(int[] array, SortType sortType) {

        SortStrategy sortStrategy = SortFactory.getSortingStrategy(sortType);
        sortStrategy.sort(array);
    }

    public void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
