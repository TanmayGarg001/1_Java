package com.company;

//Tree map is different from HashMap, TreeMap implements from navigableMap which extends sortedMap which further extends Map interface.
//It does not follow hashing concept, as it sorts the element based on the keys.

//HashMap contains an array of the nodes, and the node is represented as a class. It uses an array and LinkedList data structure internally for storing Key and Value,
//and after reaching 8 elements in the same bucket it starts using BinarySearchTree instead of LinkedList.

//In Java 8, HashMap replaces the linked list with a binary tree when the number of elements in a bucket reaches a certain threshold
// i.e. TREEIFY_THRESHOLD . If a bucket contains more than eight items, it should become a tree

//TreeMap does not use hashing for storing key unlike the HashMap and LinkedHashMap use hashing for storing the key. HashMap and LinkedHashMap use array data structure
//to store nodes but the TreeMap uses a data structure called Red-Black tree. Also, all its elements store in the TreeMap are sorted by key.

import java.util.Collections;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();
        integerStringTreeMap.put(1000, "Samsung");
        integerStringTreeMap.put(5000, "Google");
        integerStringTreeMap.put(3500, "Amazon");
        integerStringTreeMap.put(2500, "Apple");
        integerStringTreeMap.put(500, "Facebook");

        //now the output will be in sorted order if you see
        integerStringTreeMap.forEach((key, value) -> System.out.println("key: " + key + ", Value: " + value));

        System.out.println(integerStringTreeMap.lastKey());//highest
        System.out.println(integerStringTreeMap.firstEntry());//lowest
        System.out.println(integerStringTreeMap.headMap(2500)); //Returns a view of the portion of this map whose keys are strictly less than toKey.
        System.out.println(integerStringTreeMap.tailMap(3500));//Returns a view of the portion of this map whose keys are greater than or equal to fromKey.

        //Now this is really cool if you need sorting in form of key-value pair and with minimal time-complexity and stuff using this type of dataStructure is very useful.
        //Internally, TreeMap maintains a redBlackTree which is a balanced binaryTree with some certain rules.

        //See these videos ! :-
        //https://www.youtube.com/watch?v=qvZGUFHWChY
        //https://www.youtube.com/watch?v=95s3ndZRGbk
        //https://www.youtube.com/watch?v=5IBxA-bZZH8
        //https://www.youtube.com/watch?v=A3JZinzkMpk
        //see the pictures too

        System.out.println("----------------------");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("James", 100);
        treeMap.put("Brad", 200);
        treeMap.put("Albert", 400);
        treeMap.put("George", 50);
        treeMap.put("Larry", 900);
        treeMap.put("Ted", 120);
        treeMap.put("Paul", 300);

        treeMap.forEach((key, value) -> System.out.println("key: " + key + ", Value: " + value));
        //here you will see that it sorts according to the keys because names will be printed in alphabetical order.
        //see the image to understand how they would be actually stored internally :D

        //If we want to sort in reverse order :-
        System.out.println("----------------------");
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(Collections.reverseOrder());//or we can use Comparator.reverse()
        treeMap2.put("James", 100);
        treeMap2.put("Brad", 200);
        treeMap2.put("Albert", 400);
        treeMap2.put("George", 50);
        treeMap2.put("Larry", 900);
        treeMap2.put("Ted", 120);
        treeMap2.put("Paul", 300);

        treeMap2.forEach((key, value) -> System.out.println("key: " + key + ", Value: " + value));

    }

}
