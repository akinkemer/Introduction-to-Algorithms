package com.akinkemer.algorithms.sorting;

import com.akinkemer.algorithms.sorting.algorithms.MergeSort;
import com.akinkemer.algorithms.sorting.algorithms.QuickSort;
import com.akinkemer.algorithms.sorting.algorithms.SortingAlgorithm;

public class Main {

    public static void main(String[] args) {

        int MAX_SIZE = 110_000_000;
        SortingAlgorithm quickSort = new QuickSort();

        for (int size = 100; size < MAX_SIZE; size *= 2) {
            SortingUtil.testAndPrintSortingTimeForSize(
                    quickSort, SortingUtil.generateRandomIntArray(size));
            System.out.println();
        }
    }

    public static int[] generateSortedIntArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

}
