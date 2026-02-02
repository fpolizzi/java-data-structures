package com.fpolizzi.exercises.queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by fpolizzi on 27.01.26
 */
public class ReverseAQueue {

    /**
     * Demonstrates queue reversal via helper function
     */
    static void main() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Original Queue : " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue : " + queue);
    }

    static void reverseQueue(Queue<Integer> queue) {

        if (queue.isEmpty()) {
            return;
        }

        int frontElement = queue.poll();
        reverseQueue(queue);
        queue.offer(frontElement);
    }
}

