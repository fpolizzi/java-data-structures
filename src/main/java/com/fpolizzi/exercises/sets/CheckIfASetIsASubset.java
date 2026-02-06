package com.fpolizzi.exercises.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fpolizzi on 05.02.26
 */
public class CheckIfASetIsASubset {

    // helper method to check if a set
    // is a subset of another set
    static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set1.containsAll(set2);
    }

    void main() {

        // define three sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);

        Set<Integer> set3 = new HashSet<>();
        set3.add(5);
        set3.add(6);

        // check if set2 is a subset of set1
        System.out.println(isSubset(set1, set2));

        // check if set3 is a subset of set1
        System.out.println(isSubset(set1, set3));
    }
}
