package com.fpolizzi.exercises.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 08.02.26
 */
public class CountCommonElements {

    static void main() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println(findCommonElementsWithCounts(array1, array2));
    }

    public static Map<Integer, Integer> findCommonElementsWithCounts(int[] arr1, int[] arr2) {

        // Count occurrences in arr1
        Map<Integer, Integer> count1 = new HashMap<>();
        for (int num : arr1) {
            count1.put(num, count1.getOrDefault(num, 0) + 1);
        }

        // Count occurrences in arr2
        Map<Integer, Integer> count2 = new HashMap<>();
        for (int num : arr2) {
            count2.put(num, count2.getOrDefault(num, 0) + 1);
        }

        // For common elements, sum the counts from both arrays
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : count1.entrySet()) {
            int element = entry.getKey();
            if (count2.containsKey(element)) {
                result.put(element, entry.getValue() + count2.get(element));
            }
        }

        return result;
    }
}
