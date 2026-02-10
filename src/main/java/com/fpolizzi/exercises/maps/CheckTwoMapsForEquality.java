package com.fpolizzi.exercises.maps;

import java.util.Map;

/**
 * Created by fpolizzi on 08.02.26
 */
public class CheckTwoMapsForEquality {

    static void main() {

        // define two maps
        Map<String, Integer> map1 =
                Map.of(
                        "Alex", 11,
                        "Bruce", 24,
                        "Chris", 18);

        Map<String, Integer> map2 =
                Map.of(
                        "Alex", 11,
                        "Bruce", 24,
                        "Chris", 18);

        // check if maps are equal
        System.out.println("map1 and map2 are equal: " +
                checkEquality(map1, map2));
    }

    // check if two maps are equal
    private static boolean checkEquality(Map<String, Integer> map1, Map<String, Integer> map2) {

        return map1.equals(map2);
    }
}
