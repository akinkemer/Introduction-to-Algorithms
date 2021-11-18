package com.akinkemer.algorithms.sorting.algorithms;

public class QuickSort implements SortingAlgorithm {

    /**
     * Sorts the array in-place in non-decreasing order.
     *
     * @param array the array to be sorted
     */
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int p, int r) {
        if (p < r) {
            int q = partition(array, p, r);
            quickSort(array, p, q - 1);
            quickSort(array, q + 1, r);
        }
    }

    private int partition(int[] array, int p, int r) {
        int x = array[r];
        int i = p - 1;

        for (int j = p; j < r; j++) {
            if (array[j] <= x) {
                i++;
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
            }
        }

        int swap = array[i + 1];
        array[i + 1] = array[r];
        array[r] = swap;

        return i + 1;
    }
}
