package DesignPatterns.StrategyPattern.SortingAlgorithm;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = {5, 2, 8, 7, 1, 10, 4, 6, 3, 9};

        String type = scanner.nextLine();

        SortingContext sortingContext = new SortingContext();
//        sortingContext.sort(array, SortType.BUBBLE_SORT);
//        sortingContext.printArray(array);
//
//        sortingContext.sort(array, SortType.QUICK_SORT);
//        sortingContext.printArray(array);

        if (type.equalsIgnoreCase("bubble")) {
            sortingContext.sort(array, SortType.BUBBLE_SORT);
            sortingContext.printArray(array);
        }
        if (type.equalsIgnoreCase("quick")) {
            sortingContext.sort(array, SortType.QUICK_SORT);
            sortingContext.printArray(array);
        }
    }
}
