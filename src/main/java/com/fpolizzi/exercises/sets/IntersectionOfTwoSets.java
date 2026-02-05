package com.fpolizzi.exercises.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fpolizzi on 05.02.26
 */
public class IntersectionOfTwoSets {

    void main() {

        // define two sets
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

        // create an intersection set of set1 and set2
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // output the result-set(union)
        System.out.println(intersection);
    }
}
