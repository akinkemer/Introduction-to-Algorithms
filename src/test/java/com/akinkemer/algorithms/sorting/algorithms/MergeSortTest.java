package com.akinkemer.algorithms.sorting.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    public void mergeSortTest10_000Elements() {
        int[] array = SortTestUtil.generateRandomIntArray(10_000);

        new MergeSort().sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }

    @Test
    public void mergeSortTest100_000Elements() {
        int[] array = SortTestUtil.generateRandomIntArray(100_000);

        new MergeSort().sort(array);

        SortTestUtil.verifyArrayIsInNondecreasingOrder(array);
    }
}