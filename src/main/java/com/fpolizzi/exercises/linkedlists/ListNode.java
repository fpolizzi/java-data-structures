package com.fpolizzi.exercises.linkedlists;

import java.util.LinkedList;

/**
 * Created by fpolizzi on 03.02.26
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    /**
     * Creates a list of integers; converts; reverses; prints the reversed list
     */
    static void main() {

        LinkedList<Integer> integersList = new LinkedList<>();

        integersList.add(1);
        integersList.add(2);
        integersList.add(3);
        integersList.add(4);

        System.out.println(integersList);

        // Convert LinkedList<Integer> to ListNode
        ListNode head = null;
        ListNode tail = null;
        for (Integer val : integersList) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }

            tail = newNode;
        }

        // Reverse and print
        ListNode reversed = reverseList(head);
        printList(reversed);
    }

    public static void printList(ListNode head) {

        ListNode current = head;

        System.out.print("[");

        while (current != null) {
            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(", ");
            }

            current = current.next;
        }

        System.out.println("]");
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}