package com.akinkemer.algorithms.other;

import java.util.Arrays;

/**
 * Calculates the sum of two integers with binary addition.
 */
public class BinaryAdding {
    public void add() {
        int n = 3;
        int[] a = {1, 1, 1};
        int[] b = {1, 1, 1};
        int[] c = new int[n + 1];

        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + carry;
            c[i + 1] = sum % 2;
            if (sum >= 2) {
                carry = 1;
            } else {
                carry = 0;
            }
        }
        c[0] = carry;

        Arrays.stream(c).forEach(System.out::print);
    }
}
