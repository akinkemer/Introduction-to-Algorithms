package com.akinkemer.algorithms.sorting;

import com.akinkemer.algorithms.sorting.algorithms.SortingAlgorithm;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class SortingUtil {

    public static void testAndPrintSortingTimeForSize(SortingAlgorithm sortingAlgorithm, int[] array) {

        long elapsedTime =
                calculateElapsedTimeInMillisecond(sortingAlgorithm, array);

        printElapsedTime(elapsedTime, array.length);

    }

    public static long calculateElapsedTimeInMillisecond(
            SortingAlgorithm sortingAlgorithm,
            int[] array) {
        Instant start = Instant.now();
        sortingAlgorithm.sort(array);
        Instant finish = Instant.now();

        return Duration.between(start, finish).toMillis();
    }

    public static void printElapsedTime(long elapsedTime, int arraySize) {
        System.out.printf("Time elapsed(%,d elements): %d ms\n", arraySize, elapsedTime);
    }

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
}
