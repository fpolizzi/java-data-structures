package com.fpolizzi.exercises.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 07.02.26
 */
public class FrequencyOfElements {

    static void main() {

        // define an array
        int[] arr = {1, 2, 1, 3, 2, 3, 4, 2, 4, 4};

        // use a map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = getFrequencyOfElements(arr);

        // print the result-map
        System.out.println(frequencyMap);
    }

    // get frequency of elements in an array
    private static Map<Integer, Integer> getFrequencyOfElements(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : arr) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        return frequencyMap;
    }
}
