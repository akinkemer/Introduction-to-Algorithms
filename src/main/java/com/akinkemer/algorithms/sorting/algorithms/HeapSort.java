package com.akinkemer.algorithms.sorting.algorithms;

public class HeapSort implements SortingAlgorithm {

    public void sort(int[] array) {
        heapSort(array);
    }

    private void heapSort(int[] array) {
        buildMaxHeap(array);

        int heapSize = array.length;

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapSize--;

            maxHeapify(array, 0, heapSize);
        }
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void buildMaxHeap(int[] array) {
        int heapSize = array.length;

        for (int i = array.length / 2 - 1; i >= 0; i--) {
            maxHeapify(array, i, heapSize);
        }
    }

    private void maxHeapify(int[] array, int i, int heapSize) {
        int l = left(i);
        int r = right(i);
        int largest;

        if (l < heapSize && array[l] > array[i]) {
            largest = l;
        } else {
            largest = i;
        }

        if (r < heapSize && array[r] > array[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            maxHeapify(array, largest, heapSize);
        }
    }
}
