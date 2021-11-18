package com.akinkemer.algorithms.sorting.algorithms;

public class InsertionSort implements SortingAlgorithm {

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
