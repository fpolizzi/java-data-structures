package com.fpolizzi.exercises.stacks;

import java.util.Stack;

/**
 * Created by fpolizzi on 25.01.26
 */
public class EvaluatePostfixExpression {

    // define the operator tokens
    private static final char[] OPERATOR_TOKENS = {'+', '-', '*', '/', '%'};

    static void main() {

        EvaluatePostfixExpression evaluatePostfixExpression = new EvaluatePostfixExpression();

        // evaluate the given expression
        int result = evaluatePostfixExpression.evaluatePostfix("2 3 * 5 +");

        System.out.println(result);
    }

    // Write a function to evaluate a postfix expression (Reverse Polish Notation) using a stack
    public int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (String token : expression.split(" ")) {
            if (containsOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(applyOperator(a, b, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    // helper method to check if a token is a valid operator
    private boolean containsOperator(String token) {
        if (token.length() != 1) {
            return false;
        }
        char candidate = token.charAt(0);
        for (char operator : OPERATOR_TOKENS) {
            if (candidate == operator) {
                return true;
            }
        }
        return false;
    }

    // helper method to apply an operator to two operands
    private Integer applyOperator(int a, int b, String token) {
        switch (token) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
            case "%" -> {
                return a % b;
            }
            default -> throw new IllegalArgumentException("Invalid operator: " + token);
        }
    }
}
