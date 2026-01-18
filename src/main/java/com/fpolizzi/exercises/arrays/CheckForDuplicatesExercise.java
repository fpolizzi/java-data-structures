package com.fpolizzi.exercises.arrays;

/**
 * Created by fpolizzi on 18.01.26
 */
public class CheckForDuplicatesExercise {

    static int[] arr = {2, 33, 8, 14, 52, 31, 17};
    static int[] arrWithDuplicates = {2, 33, 8, 14, 52, 8, 17};


    static void main() {

        System.out.println(containsDuplicates(arr));
        System.out.println(containsDuplicates(arrWithDuplicates));
    }

    private static boolean containsDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
