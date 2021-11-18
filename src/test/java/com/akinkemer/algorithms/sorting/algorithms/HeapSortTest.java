package com.akinkemer.algorithms.sorting.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {
    @Test
    public void testHeapSort10_000Elements() {
        int[] array = SortTestUtil.generateRandomIntArray(10_000);

        new HeapSort().sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);

    }

    @Test
    public void testHeapSort100_000Elements() {
        int[] array = SortTestUtil.generateRandomIntArray(100_000);

        new HeapSort().sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }

}