package com.fpolizzi.exercises.twoDarrays;

/**
 * Created by fpolizzi on 20.01.26
 */
public class SumOfAllElementsInA2DArrayExercise {

    static void main() {
        int[][] twoDArray = {{1, 9, 5}, {4, 7, 3}, {6, 8, 2}};

        System.out.println("Sum of all Array Elements: " + sumAllArrayElements(twoDArray));
    }

    private static int sumAllArrayElements(int[][] twoDArray) {

        int sum = 0;

        for (int[] row : twoDArray) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }
}
