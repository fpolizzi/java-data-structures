package com.fpolizzi;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by fpolizzi on 03.02.26
 */
public class WorkingWithLinkedLists {

    static void main() {

        // define a linked list of persons
        LinkedList<Person> linkedList = new LinkedList<>();

        // add some persons to the linked list
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Mariam", 18));
        linkedList.add(new Person("Ali", 40));
        // add a person to the front
        linkedList.addFirst(new Person("John", 30));

        // print all persons
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println();

        // print all persons in reverse order
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age) {
    }
}
