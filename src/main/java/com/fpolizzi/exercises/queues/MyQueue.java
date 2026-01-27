package com.fpolizzi.exercises.queues;

/**
 * Created by fpolizzi on 27.01.26
 */
public class MyQueue {
    int SIZE = 5;
    int[] items = new int[SIZE];
    int front, rear;

    MyQueue() {
        front = -1;
        rear = -1;
    }

    // insert elements to the queue
    void enqueue(int element) {

        if (front == -1) {
            // mark front denote the first element of the queue
            front = 0;
        }

        rear++;
        // insert element at the rear
        items[rear] = element;
        System.out.println("Insert " + element);
    }

    // delete element from the queue
    void dequeue() {
        int element;

        // if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            // remove element from the front of the queue
            element = items[front];

            // if the queue has only one element
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                // mark the next element as the front
                front++;
            }
            System.out.println(element + " Deleted");
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return items[front];
        }
    }

    // check if the queue is empty
    boolean isEmpty() {
        return front == -1;
    }
}


class Main {

    /**
     * Creates queue; invoke core queue operations
     */
    static void main() {
        MyQueue queue = new MyQueue();

        queue.isEmpty();

        System.out.println("Add elements to the queue:");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Delete element from the queue:");
        queue.dequeue();
        System.out.println("Peek: " + queue.peek());

        System.out.println("Add element to the queue:");
        queue.enqueue(5);

        System.out.println("Is Queue empty: " + queue.isEmpty());
    }
}
