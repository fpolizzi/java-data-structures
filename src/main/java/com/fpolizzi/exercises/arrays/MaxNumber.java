package com.fpolizzi.exercises.arrays;

/**
 * Created by fpolizzi on 17.01.26
 */
public class MaxNumber {

    static void main() {
        int[] arr = {2, 33, 8, 14, 52, 35, 17};

        System.out.println(findMaxNumber(arr));
    }

    private static int findMaxNumber(int[] arr) {

        int maxNumber = arr[0];

        for (int number : arr) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }
}
