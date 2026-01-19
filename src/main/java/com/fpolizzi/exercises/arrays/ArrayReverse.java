package com.fpolizzi.exercises.arrays;

import java.util.Arrays;

/**
 * Created by fpolizzi on 17.01.26
 */
public class ArrayReverse {

    static void main() {

        int[] arr = {2, 33, 8, 14, 52, 35, 17};
        int[] reversedArray = new int[arr.length];

        // print given array
        System.out.println(Arrays.toString(arr));

        reverseArray(arr, reversedArray);

        // print reversed array
        System.out.println(Arrays.toString(reversedArray));
    }

    private static int[] reverseArray(int[] arr, int[] reversedArray) {
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[(arr.length - 1) - i] = arr[i];
        }

        return reversedArray;
    }
}
