package com.fpolizzi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fpolizzi on 06.02.26
 */
public class WorkingWithMaps {

    static void main() {

        // define a map of persons
        Map<Integer, Person> personMap = new HashMap<>();

        // add some persons to the map
        personMap.put(1, new Person("John", 30));
        personMap.put(2, new Person("Mary", 25));
        personMap.put(3, new Person("Alex", 21));

        // print the map
        System.out.println(personMap);

        // size of the map
        System.out.println(personMap.size());

        // get a particular person from the map
        System.out.println(personMap.get(2));

        // check if a key exists in the map
        System.out.println(personMap.containsKey(5));

        // get entry set of the map
        System.out.println(personMap.entrySet());

        // get the key set of the map
        System.out.println(personMap.keySet());

        // get the values of the map
        System.out.println(personMap.values());

        // remove key 2 from the map
        personMap.remove(2);

        // use getOrDefault
        System.out.println(personMap.getOrDefault(2, new Person("default", 0)));

        // loop over the map entries
        personMap.entrySet().forEach(System.out::println);
    }

    record Person(String name, int age) {
    }
}
