package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    //As LinkedList implements the dequeue and List interface so we have features of queue and List both.
    //There are 3 types of linked list mainly :-
    //Simple Linked List − Item navigation is forward only.
    //Doubly Linked List − Items can be navigated forward and backward.
    //Circular Linked List − Last item contains link of the first element as next and the first element has a link to the last element as previous.
    //Java's LinkedList is implementation of doubly linked list.

    //The major difference in LinkedList and ArrayList is the internal working of it. ArrayList store data in continuous memory block which is similar to arrays but
    //is dynamic implementation of the array and it increases its size by 50% when it exhausts and copy the previous data to the new memory block.
    //Linked list is not like that as it stores backNode and frontNode reference of the elements and stores data at various locations in the memory as it has
    //the address of the back and front node.

    //see the image for more visual clarification.

    public static void main(String[] args) {

        //Let's make our own link list from ground-up. See the MyLinkedList class.
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Tom");//appends the element in the linkedList
        myLinkedList.add("Naveen");
        myLinkedList.add("Roby");
        myLinkedList.add("Suzy");
        //run in debug mode we will se that java has implemented the linked list in the form of doubly linked list.
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList);

        Iterator<String> iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println("--------------");

        myLinkedList.forEach(element -> System.out.print(element + " "));

        System.out.println("\n---------------");
        myLinkedList.add(2, "Steve");
        for (String s : myLinkedList) {
            System.out.println("==> " + s);
        }

        System.out.println("========");
        System.out.println(myLinkedList);

        myLinkedList.remove();//removes first (head of the list) element
        System.out.println(myLinkedList);

        myLinkedList.remove(2);//removes element at a specific index
        System.out.println(myLinkedList);
        myLinkedList.remove("Suzy");//removes the given object

        System.out.println(myLinkedList);
        //addFirst and addLast are two methods which do what they sound like.
        //removeFirst and removeLast are two methods which do what they sound like.
        System.out.println("=============");
        myLinkedList.add("Savage");
        myLinkedList.add("Rockstar");
        myLinkedList.add("Timmy");
        System.out.println(myLinkedList);
        System.out.println("=============");
        System.out.println(myLinkedList.subList(1, 3));
        myLinkedList.clear();
        System.out.println(myLinkedList);

        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Dart");
        languages.add("Python");
        languages.add("Ruby");
        System.out.println(languages);
        //we can use reverse iterator too!
        Iterator<String> stringIterator = languages.descendingIterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + " ");
        }

        Collections.sort(languages);
        System.out.println(languages);

    }
//all other methods are similar to arrayList :- addAll,removeAll,retainAll etc.
}
