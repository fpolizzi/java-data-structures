package com.fpolizzi.exercises.queues;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 01.02.26
 */
public class FirstNonRepeatingCharacterInStream {

    /**
     * Finds first non‑repeating character in input string
     */
    private static Character findFirstNonRepeatingCharacter(String string) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : string.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (char c : string.toCharArray()) {
            if (frequency.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

    void main() {
        System.out.println(findFirstNonRepeatingCharacter("acdaa"));
    }
}