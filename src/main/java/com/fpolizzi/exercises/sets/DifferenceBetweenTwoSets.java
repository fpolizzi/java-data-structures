package com.fpolizzi.exercises.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fpolizzi on 05.02.26
 */
public class DifferenceBetweenTwoSets {

    // Write a function that takes two sets and
    // returns a new set containing elements
    // that are in the first set but not in the second.

    static void main() {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> result = difference(set1, set2);
        System.out.println(result);
    }

    private static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
}
