package com.fpolizzi.exercises.arraylists;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 21.01.26
 */
public class RemoveEvenNumbersExercise {

    private static List<Integer> integerList =
            new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    static void main() {

        System.out.println(integerList);

        removeEvenNumbers(integerList);

        System.out.println(integerList);
    }

    private static void removeEvenNumbers(List<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) integerList.remove(i);
        }
    }
}