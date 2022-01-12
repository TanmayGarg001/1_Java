package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        //Linked List has similar functions to ArrayLists as both inherits from AbstractLists which implements List interface.
        //Also List interface extends the Collection interface.
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Switzerland");
        placesToVisit.add("Mumbai");
        placesToVisit.add("Bangalore");
        placesToVisit.add("New York");
        placesToVisit.add("California");
        placesToVisit.add("Moscow");
        printList(placesToVisit);
        placesToVisit.add(1, "Germany");//here u won't see the difference but make a huge ass list and u will see what im saying
        printList(placesToVisit);
        placesToVisit.remove(3);
        printList(placesToVisit);
//IF YOU WANT TO SEE THE REAL TIME DIFFERENCE THAT IT MAKES :-
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 99_999_999; i++) {
//            arrayList.add(i);
//        }
//        double start = System.currentTimeMillis();
//
//        arrayList.add(3, 1322113213);
//        arrayList.add(3, 1322113213);
//        arrayList.add(3, 1322113213);
//        arrayList.add(3, 1322113213);
//        arrayList.add(3, 1322113213);
//
//        double end = System.currentTimeMillis();
//        System.out.println("Net Time = " + (end - start));
//
//        LinkedList<Integer> integerLinkedList = new LinkedList<>();
//        for (int i = 0; i < 99_999_999; i++) {
//            integerLinkedList.add(i);
//        }
//        double start1 = System.currentTimeMillis();
//
//        integerLinkedList.add(3, 1313213546);
//        integerLinkedList.add(3, 1313213546);
//        integerLinkedList.add(3, 1313213546);
//        integerLinkedList.add(3, 1313213546);
//        integerLinkedList.add(3, 1313213546);
//
//        double end1 = System.currentTimeMillis();
//        System.out.println("Net Time = " + (end1 - start1));//Lightning fast takes 0 time!

    }


    //Iterators can be used with any collections.
    // Iterators are usually used when you need to iterate and modify collection at the same time,
    // if all you need is just iterating then better use for each loop.

    //This is one way of looping :-
//    public static void printList(LinkedList<String> linkedList) {
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }
//    }

    //Another way using iterator to loop :-
    public static void printList(LinkedList<String> linkedList) {
        System.out.println("=========================");
        Iterator<String> iterator = linkedList.iterator();//equivalent of a for loop.
        while (iterator.hasNext()) {//while the element that is in this linkList is pointing to something else then execute the code.
            System.out.println(" Now visiting = " + iterator.next());//this is equivalent to i++ as it increments the iterator's position
        }
        System.out.println("=========================");
    }


}
