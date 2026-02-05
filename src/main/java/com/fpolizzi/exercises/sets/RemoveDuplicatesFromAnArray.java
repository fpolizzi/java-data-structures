package com.fpolizzi.exercises.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by fpolizzi on 05.02.26
 */
public class RemoveDuplicatesFromAnArray {


    static void main() {

        // define an array of integers
        int[] arr = {1, 2, 3, 3, 3, 4, 4, 5, 6, 3, 4};

        // print the original array
        System.out.println(Arrays.toString(arr));

        Integer[] resultArray = removeDuplicates(arr);

        // print the result array with duplicates removed
        System.out.println(Arrays.toString(resultArray));
    }

    // remove duplicates from an array using a Set
    static Integer[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                continue;
            }
            set.add(num);
        }

        return set.toArray(new Integer[0]);
    }
}
