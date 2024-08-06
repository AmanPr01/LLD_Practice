package DesignPatterns.StrategyPattern.SortingAlgorithm.Strategy;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        int N = array.length;

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after Bubble Sort");
    }
}
