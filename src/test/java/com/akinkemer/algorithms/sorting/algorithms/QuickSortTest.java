package com.akinkemer.algorithms.sorting.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    public void testQuickSort10_000Elements() {
        int[] array = SortTestUtil.generateRandomIntArray(10_000);

        new QuickSort().sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }

    @Test
    public void testQuickSort100_000Elements() {
        int[] array = SortTestUtil.generateRandomIntArray(100_000);

        new QuickSort().sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }

}