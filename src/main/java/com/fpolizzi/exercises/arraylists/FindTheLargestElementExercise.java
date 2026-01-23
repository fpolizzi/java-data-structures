package com.fpolizzi.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 21.01.26
 */
public class FindTheLargestElementExercise {

    private static List<Integer> integerList =
            new ArrayList<>(List.of(8, 2, 7, 5, 6, 4, 7, 10, 1, 3));

    static void main() {

        System.out.println(findLargestNumber(integerList));
    }

    private static int findLargestNumber(List<Integer> integerList) {

        int largestNumber = integerList.get(0);

        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i) > largestNumber) {
                largestNumber = integerList.get(i);
            }
        }

        return largestNumber;
    }
}
