package com.fpolizzi.exercises.arrays;

/**
 * Created by fpolizzi on 18.01.26
 */
public class SumOfArrayElementsExercise {

    static void main() {
        int[] arr = {2, 33, 8, 14, 52, 35, 17};

        int sum = 0;

        for (int number : arr) {
            sum += number;
        }

        System.out.println(sum);
    }
}
