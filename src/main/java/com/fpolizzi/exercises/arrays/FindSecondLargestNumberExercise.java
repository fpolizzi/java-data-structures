package com.fpolizzi.exercises.arrays;

/**
 * Created by fpolizzi on 18.01.26
 */
public class FindSecondLargestNumberExercise {

    static void main() {

        int[] arr = {2, 33, 8, 14, 52, 35, 17};

        System.out.println(findSecondLargestNumber(arr));
    }

    private static int findSecondLargestNumber(int[] arr) {
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = j;
            } else if (j > secondLargestNumber && j < largestNumber) {
                secondLargestNumber = j;
            }
        }

        return secondLargestNumber;
    }
}
