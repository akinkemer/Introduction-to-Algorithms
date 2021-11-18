package com.akinkemer.algorithms.sorting.algorithms;

public class HeapSort implements SortingAlgorithm {

    public void sort(int[] a) {
        heapSort(a);
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private static int parent(int i) {
        return (i - 1) / 2;
    }

    private void maxHeapify(int[] a, int i, int heapSize) {
        int l = left(i);
        int r = right(i);
        int largest;

        if (l < heapSize && a[l] > a[i]) {
            largest = l;
        } else {
            largest = i;
        }

        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            maxHeapify(a, largest, heapSize);
        }
    }

    private void buildMaxHeap(int[] a) {
        int heapSize = a.length;

        for (int i = a.length / 2 - 1; i >= 0; i--) {
            maxHeapify(a, i, heapSize);
        }
    }

    private void heapSort(int[] a) {
        buildMaxHeap(a);

        int heapSize = a.length;

        for (int i = a.length - 1; i > 0; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapSize--;

            maxHeapify(a, 0, heapSize);
        }

    }

}
