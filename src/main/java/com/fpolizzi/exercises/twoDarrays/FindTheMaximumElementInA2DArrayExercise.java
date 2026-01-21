package com.fpolizzi.exercises.twoDarrays;

/**
 * Created by fpolizzi on 20.01.26
 */
public class FindTheMaximumElementInA2DArrayExercise {

    static void main() {
        int[][] twoDArray = {{1, 9, 5}, {4, 7, 3}, {6, 8, 2}};

        System.out.println("Find Maximum Element in Array: " + findMaximumElementInArray(twoDArray));
    }

    private static int findMaximumElementInArray(int[][] twoDArray) {

        int maxElement = twoDArray[0][0];

        for (int[] row : twoDArray) {
            for (int element : row) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }

        return maxElement;
    }
}
