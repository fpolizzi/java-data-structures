package com.fpolizzi.exercises.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 08.02.26
 */
public class FirstNonRepeatingCharacter {

    static void main() {

        // test string
        String str = "Test me please";

        // print the result char
        System.out.println("First non repeating char: " +
                findFirstNonRepeatingCharacter(str));

    }

    // find the first non-repeating character
    private static Character findFirstNonRepeatingCharacter(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}
