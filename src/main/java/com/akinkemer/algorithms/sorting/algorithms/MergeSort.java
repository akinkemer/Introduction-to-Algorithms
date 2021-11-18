package com.akinkemer.algorithms.sorting.algorithms;

public class MergeSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    private void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[p + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = array[q + 1 + i];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
        }
    }
}
