package com.fpolizzi.exercises.stacks;

import java.util.Stack;

/**
 * Created by fpolizzi on 24.01.26
 */
public class ReverseAString {

    static void main() {

        // create a stack of characters
        Stack<Character> myCharStack = new Stack<>();

        // create an example String
        String myString = "Hello";

        // original String
        System.out.println(myString);

        // fill the stack with reversed String characters
        for(int i = myString.length(); i > 0; i-- ) {

            myCharStack.push(myString.charAt(i-1));
        }

        // print reversed String from stack
        System.out.println(myCharStack);
    }
}
