package com.fpolizzi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fpolizzi on 21.01.26
 */
public class WorkingWithArrayLists {

    static void main() {

        // define an empty ArrayList
        List<String> colors = new ArrayList<>();

        // define and initialize an unmodifiable list
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "green"
        );
        // colorsUnmodifiable.add("pink"); -->  throws an exception

        // print unmodifiable list
        for (String color : colorsUnmodifiable) {
            System.out.println(color);
        }

        // initialize colors with some values
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors.size());

        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        System.out.println(colors);

        // examples of array iteration and printing
        for (String color : colors) {
            System.out.println(color);
        }

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        colors.forEach(System.out::println);
    }
}
