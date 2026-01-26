package com.fpolizzi.exercises.stacks;

import java.util.Stack;

/**
 * Created by fpolizzi on 25.01.26
 */
public class SortAStack {

    static void main() {
        Stack<Integer> input = new Stack<>();

        // input stack with some integers that
        // will be sorted in ascending order
        input.add(13);
        input.add(3);
        input.add(19);
        input.add(8);
        input.add(22);
        input.add(26);

        // temporary stack
        Stack<Integer> tmpStack = sortstack(input);

        // print sorted stack
        System.out.println(tmpStack);
    }

    // method that returns the sorted stack
    public static Stack<Integer> sortstack(Stack<Integer> input) {

        Stack<Integer> tmpStack = new Stack<>();

        while (!input.isEmpty()) {

            // pop out the first element
            int tmp = input.pop();

            // while the temporary stack is not empty,
            // and the top of the stack is greater than temp
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {

                // pop from the temporary stack
                // and push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in temporary of stack
            tmpStack.push(tmp);
        }

        return tmpStack;
    }
}
