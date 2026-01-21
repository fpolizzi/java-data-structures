package com.fpolizzi.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 21.01.26
 */
public class CheckIfAnElementExistsExercise {

    private static List<Integer> integerList =
            new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    static void main() {

        int element = 12;

        System.out.println("Element " + element + " exists: " + existsInList(integerList, element));
    }

    private static boolean existsInList(List<Integer> list, int element) {
        return list.contains(element);
    }
}

