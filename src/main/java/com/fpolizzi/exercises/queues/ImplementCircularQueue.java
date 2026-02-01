package com.fpolizzi.exercises.queues;

/**
 * Created by fpolizzi on 02.02.26
 */
public class ImplementCircularQueue {

    static void main() {

        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isFull());
    }


}

class CircularQueue {

    private final int[] queue;
    private final int capacity;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {

        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
        this.capacity = capacity;
    }

    public void enqueue(int value) {

        queue[++rear] = value;
        size++;
    }

    public int dequeue() {

        int value = queue[front];
        front++;
        size--;

        return value;
    }

    public int peek() {

        return queue[front];
    }

    public boolean isFull() {

        return size == capacity;
    }
}
