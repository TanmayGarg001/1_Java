package com.company;

//When multiple threads are working on the same data, and the value of our data is changing, that scenario is not thread-safe and we will get inconsistent results.
//When a thread is already working on an object and preventing another thread on working on the same object, this process is called thread safety.

//Consider an example :-
//You have a task to complete and there are 3 threads working on it, let's say the task takes the value of an integer i and adds 10 to it and then print it.
//If the thread are not in sync and some threads perform the task at the same moment the value of i would be same for them.
//So these threads are not in sync(i.e. they might get the updated or the previous value), and this is not providing us thread safety.
//link:- https://dzone.com/articles/java-collection-performance

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("timmy");
        stringHashSet.add("savage");
        stringHashSet.add("op");
        stringHashSet.add("idk");
        stringHashSet.add("random");
        stringHashSet.add("random");
        System.out.println(stringHashSet);
        stringHashSet.add("random");

        System.out.println("===========");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("timmy");
        treeSet.add("savage");
        treeSet.add("op");
        treeSet.add("idk");
        treeSet.add("random");
        treeSet.add("random");
        System.out.println(treeSet);
        treeSet.add("random");

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1, "sam");
        integerStringHashMap.put(2, "sam");
        System.out.println(integerStringHashMap);
    }
}
