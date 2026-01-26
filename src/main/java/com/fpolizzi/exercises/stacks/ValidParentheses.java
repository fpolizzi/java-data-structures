package com.fpolizzi.exercises.stacks;

import java.util.Stack;

/**
 * Created by fpolizzi on 25.01.26
 */
public class ValidParentheses {
    static void main() {
        ValidParentheses validParentheses = new ValidParentheses();

        // test some valid and invalid cases
        System.out.println(validParentheses.isValid("()")); // true
        System.out.println(validParentheses.isValid("()[]{}")); // true
        System.out.println(validParentheses.isValid("(]")); // false
        System.out.println(validParentheses.isValid("([)]")); // false
        System.out.println(validParentheses.isValid("{[]}")); // true
    }

    public boolean isValid(String s) {

        // initialize a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // iterate over the characters in the string
        for (char c : s.toCharArray()) {
            // if the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // if the stack is empty or the top of the stack does not match the closing bracket, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // if the stack is not empty, return false
        return stack.isEmpty();
    }

    // helper method to check if the characters are matching pairs
    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}