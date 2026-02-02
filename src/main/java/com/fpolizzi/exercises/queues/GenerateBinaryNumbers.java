package com.fpolizzi.exercises.queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fpolizzi on 28.01.26
 */
public class GenerateBinaryNumbers {

    /*
     * Generates a list of binary numbers from 1 up to the given number `n`.
     * Each binary number is added in sequential order starting from "1",
     * using a queue-based approach for generating the later binary numbers.
     */
    static ArrayList<String> generateBinary(int n) {

        ArrayList<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        // Enqueue the first binary number
        q.add("1");

        // test if n is greater than 0 then decrement n by 1
        while (n-- > 0) {

            String str = q.poll();
            result.add(str);

            if(q.size() < n){

                // Append "0" to s1 and enqueue it.
                q.add(str + "0");

                // Append "1" to s1 and enqueue it.
                q.add(str + "1");
            }
        }

        return result;
    }

    void main() {

        int n = 5;

        ArrayList<String> res = generateBinary(n);
        for (String i : res) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
