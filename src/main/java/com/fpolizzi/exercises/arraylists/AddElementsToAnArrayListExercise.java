package com.fpolizzi.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 21.01.26
 */
public class AddElementsToAnArrayListExercise {

    /**
     * Demonstrates adding elements to an ArrayList instance
     */
    static void main() {

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> integerListToAdd = new ArrayList<>(List.of(6, 7, 8, 9, 10));

        System.out.println(integerList);

        addIntegerListToAnArrayList(integerListToAdd, integerList);

        System.out.println(integerList);
    }

    private static void addIntegerListToAnArrayList(
             List<Integer> integerListToAdd,
             List<Integer> integerList) {
        integerList.addAll(integerListToAdd);
    }
}
