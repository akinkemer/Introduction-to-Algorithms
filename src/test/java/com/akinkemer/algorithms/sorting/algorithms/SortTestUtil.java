package com.akinkemer.algorithms.sorting.algorithms;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.fail;

public class SortTestUtil {
    public static int[] generateRandomIntArray(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("the array size must be greater than zero");
        }

        int[] array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    public static void verifyArrayIsInNondecreasingOrder(int[] array) {
        int lastValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lastValue) {
                fail("Array element " + i + " is not in order. Value: " + array[i] + " last value was: " + lastValue);
            }
            lastValue = array[i];
        }
    }
}
