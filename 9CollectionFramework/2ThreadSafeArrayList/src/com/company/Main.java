package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    //As we know by default the ArrayList is not synchronized(thread safe), but we can make it like that if we want to.
    //2 ways exists to make our ArrayList synchronized:-
    //1. Use Collections.synchronizedList(), returns the synchronized/thread-safe  list
    //2. Or we can use the CopyOnWriteArrayList class, this is same as arrayList but thread safe version of ArrayList.

    public static void main(String[] args) {
        //1st way
        ArrayList<String> syncArrayList = new ArrayList<>(Collections.synchronizedList(new ArrayList<>()));
        //We can add/remove/modify the the elements without explicit (stated clearly and in detail) synchronization.
        //But in order to fetch/traverse the values from the list we need to use explicit synchronization.

        syncArrayList.add("Tim");
        syncArrayList.add("Tom");
        syncArrayList.add("Sam");
        syncArrayList.add("Dan");

        synchronized (syncArrayList) {
            Iterator<String> iterator = syncArrayList.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }

        System.out.println("\n----------------------");

        //2nd way
        //its available in java.util.concurrent package
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(45);
        copyOnWriteArrayList.add(4522);
        copyOnWriteArrayList.add(-145);
        copyOnWriteArrayList.add(0);
        //the good thing is we don't need any explicit synchronization for any operation.

        Iterator<Integer> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }

}
