package DesignPatterns.StrategyPattern.SortingAlgorithm.Strategy;

public class QuickSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length-1);
        System.out.println("Array after quick sort");
    }

    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quickSort(array, left, pivot-1);
            quickSort(array, pivot+1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[right];
        array[right] = temp;
        return i+1;
    }
}
