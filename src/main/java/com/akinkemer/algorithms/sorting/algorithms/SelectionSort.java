package com.akinkemer.algorithms.sorting.algorithms;

public class SelectionSort implements SortingAlgorithm {

    /**
     * Sorts the array in-place in non-decreasing order.
     *
     * @param array the array to be sorted
     */
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
