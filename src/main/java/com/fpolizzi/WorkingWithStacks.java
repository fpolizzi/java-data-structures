package com.fpolizzi;

import java.util.Stack;

/**
 * Created by fpolizzi on 23.01.26
 */
public class WorkingWithStacks {

    static void main() {

        // define a stack of integers
        Stack<Integer> stack = new Stack<>();

        // push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Print the top element without removing it
        System.out.println(stack.peek());

        // Print the size of the stack
        System.out.println(stack.size());

        // Pop the top element off the stack
        System.out.println(stack.pop());

        // Print the size of the stack again
        System.out.println(stack.size());
    }
}
