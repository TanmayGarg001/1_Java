package com.company;

//LinkedHashMap vs HashMap
//Its almost same as HashMap the main difference being it stores the order of the elements too.It is doubly linked.
//LinkedHashMap extends the HashMap class. It is also not sync.
//can have one null key and multiple null values.
//default capacity is same as hashMap i.e. 16

import java.util.HashMap;
import java.util.LinkedHashMap;
//The threshold of switching to the balanced tree is defined as TREEIFY_THRESHOLD constant in java. util. HashMap JDK 8 code.
//Currently, its values are 8, which means if there are more than 8 elements in the same bucket than HashMap will use a tree
//instead of a linked list to hold them in the same bucket.
public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Timmy");
        hashMap.put(10, "Testing");
        hashMap.put(98, "IDK");
        hashMap.put(54, "Stuff");
        hashMap.put(87, "Random");
        hashMap.put(2, "Savage");

        System.out.println(hashMap);//order is not maintained in HashMap.
        System.out.println();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Timmy");
        linkedHashMap.put(10, "Testing");
        linkedHashMap.put(98, "IDK");
        linkedHashMap.put(54, "Stuff");
        linkedHashMap.put(87, "Random");
        linkedHashMap.put(2, "Savage");
        System.out.println(linkedHashMap);//order is maintained because of the implementation of LinkedHashMap as it is doubly linked.
        //in case of collision it creates a linked list as mentioned above and if size reaches more than 8 tree is used for that bucket.

    }

}

