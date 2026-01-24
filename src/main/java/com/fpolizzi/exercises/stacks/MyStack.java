package com.fpolizzi.exercises.stacks;

/**
 * Created by fpolizzi on 24.01.26
 */
public class MyStack {

    private int[] stack;
    private int top;

    public MyStack(int size) {
        stack = new int[size];
        top = 0;
    }

    // add value to top
    public void push(int value) {
        stack[++top] = value;
    }

    // remove value from top
    public int pop() {
        return stack[top--];
    }

    // return value at top
    public int peek() {
        return stack[top];
    }

    // return true if the stack is empty
    public boolean isEmpty() {
        return top == 0;
    }
}

class Main {
    /**
     * Creates stack; pushes elements; tests pop, peek, isEmpty
     */
    static void main(String[] args) {

        // create a stack
        MyStack stack = new MyStack(8);

        // push some elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
