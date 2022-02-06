package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

//https://dzone.com/articles/java-collection-performance
public class ArrayListVsLinkedListTime {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        //to get append elements :-
        double start1 = System.currentTimeMillis();

        for (int i = 10_000_000; i > 0; i--) {
            linkedList.add(10);
        }

        double end1 = System.currentTimeMillis();
        System.out.println("time to append 10 million elements in linkedlist = " + (end1 - start1));

        double start2 = System.currentTimeMillis();

        for (int i = 10_000_000; i > 0; i--) {
            arrayList.add(10);
        }

        double end2 = System.currentTimeMillis();
        System.out.println("time to append 10 million elements in arraylist = " + (end2 - start2));

        //time taken to get an element at index
        double start3 = System.currentTimeMillis();
        System.out.println(arrayList.get(5_000_000));
        double end3 = System.currentTimeMillis();
        System.out.println("arraylist get nth element = " + (end3 - start3));

        double start4 = System.currentTimeMillis();
        System.out.println(linkedList.get(5_000_000));
        double end4 = System.currentTimeMillis();
        System.out.println("linkedlist get nth element = " + (end4 - start4));

        //time taken to get insert an element at a particular index
        double start5 = System.currentTimeMillis();
        arrayList.add(0, 55);
        double end5 = System.currentTimeMillis();
        System.out.println("arrayList : " + (end5 - start5));

        double start6 = System.currentTimeMillis();
        linkedList.add(0, 55);
        double end6 = System.currentTimeMillis();
        System.out.println("linkedList : " + (end6 - start6));

    }

}
