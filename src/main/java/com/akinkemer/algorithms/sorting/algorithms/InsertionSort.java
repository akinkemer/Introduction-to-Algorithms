package com.akinkemer.algorithms.sorting.algorithms;

public class InsertionSort implements SortingAlgorithm {

    /**
     * Sorts the array in-place in non-decreasing order.
     *
     * @param array the array to be sorted
     */
    @Override
    public void sort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int key = array[j];

            int i = j - 1;

            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }

            array[i + 1] = key;
        }
    }
}
