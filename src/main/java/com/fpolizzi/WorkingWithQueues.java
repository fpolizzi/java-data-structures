package com.fpolizzi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fpolizzi on 25.01.26
 */
public class WorkingWithQueues {

    static void main() {

        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 40));

        System.out.println(supermarket.size());

        // peek returns the next element without removing it
        System.out.println(supermarket.peek());

        // poll removes the next element and returns it
        System.out.println(supermarket.poll());

        System.out.println(supermarket.size());

        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age) {
    }
}
