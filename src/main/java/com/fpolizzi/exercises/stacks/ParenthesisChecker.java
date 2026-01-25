package com.fpolizzi.exercises.stacks;

import java.util.Stack;

/**
 * Created by fpolizzi on 26.01.26
 */
public class ParenthesisChecker {

    void main() {

        String brackets1 = "[{{[(){}]}}[]{}{{(())}}]";
        String brackets2 = "[{{}}[]{}{{(())}}]";
        String brackets3 = "[{}{}{{()}}]";
        String brackets4 = "[{}{{}}]";
        String brackets5 = "[{{}}]";
        String brackets6 = "[{}]";
        String brackets7 = "";
        String brackets8 = "({(]}";
        String brackets9 = "{(]}[";

        // test some brackets strings
        System.out.println(isBalanced(brackets1));
        System.out.println(isBalanced(brackets2));
        System.out.println(isBalanced(brackets3));
        System.out.println(isBalanced(brackets4));
        System.out.println(isBalanced(brackets5));
        System.out.println(isBalanced(brackets6));
        System.out.println(isBalanced(brackets7));
        System.out.println(isBalanced(brackets6));
        System.out.println(isBalanced(brackets7));
        System.out.println(isBalanced(brackets8));
        System.out.println(isBalanced(brackets9));
    }

    boolean isBalanced(String input) {

        // store opening brackets
        Stack<Character> stack = new Stack<>();

        // iterate over the input string
        for (char ch : input.toCharArray()) {

            // if the character is an opening bracket,
            // push it onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                // if the character is a closing bracket, check if the stack is empty
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop an element from the stack
                char top = stack.pop();

                // check if the current closing bracket
                // matches the corresponding opening bracket
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // at the end, if the stack is empty, then all brackets are balanced
        return stack.isEmpty();
    }
}
