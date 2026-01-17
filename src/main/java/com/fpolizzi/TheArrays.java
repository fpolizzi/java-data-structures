package com.fpolizzi;

import java.util.Arrays;

/**
 * Created by fpolizzi on 13.01.26
 */
public class TheArrays {
    /**
     * Demonstrates array initialization, access, and iteration techniques
     */
    static void main() {

        // define a String array with a length of 5
        String[]  colors = new String[5];

        // initialize the first two array elements
        colors[0] = "purple";
        colors[1] = "blue";


        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

        // define and initialize an int array in one step
        int[] numbers = {100, 200};

        // examples of array iteration
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >=0 ; i--) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
