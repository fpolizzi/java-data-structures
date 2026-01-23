package com.fpolizzi.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 22.01.26
 */
public class MergeTwoArrayListsExercise {

    /**
     * Demonstrates merging two lists and prints results
     */
    static void main() {

        List<Integer> integerListOne = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> integerListTwo = new ArrayList<>(List.of(6, 7, 8, 9, 10));

        // merge both lists in a new one
        mergeTwoArrayLists(integerListOne, integerListTwo);

        System.out.println(mergeTwoArrayLists(integerListOne, integerListTwo));
        System.out.println(integerListOne);
        System.out.println(integerListTwo);
    }

    private static List<Integer> mergeTwoArrayLists(
            List<Integer> integerListOne,
            List<Integer> integerListTwo) {

        List<Integer> resultList = new ArrayList<>();

        resultList.addAll(integerListOne);
        resultList.addAll(integerListTwo);

        return resultList;
    }
}
