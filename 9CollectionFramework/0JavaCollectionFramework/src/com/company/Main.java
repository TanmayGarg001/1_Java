package com.company;

public class Main {
    //The Java collections framework is a set of classes and interfaces that implement commonly reusable collection data structures. Although referred to as a framework,
    // it works in a manner of a library. The collections framework provides both interfaces that define various collections and classes that implement them.
    //See the images.

    public static void main(String[] args) {
        //Object is the super class of all the classes in java and is in the package java.lang;
        //The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.

        //Collections and Arrays are the classes that are in java.util;
        //Don't confuse Collections with Collection Framework which consists of CollectionInterface and MapInterface.
        //List Interface:-
        //1.An ordered base collection
        //2.index based
        //3.provides dynamic implementation of the arrays

        //Set Interface:-
        //1.Can't have duplicate values

        //Queue Interface:-
        //1.FIFO

        //Map Interface:-
        //1.Stores data in key-pair value format
        //Iterator:-
        //To iterate the elements from the collection, for example:- in sets we don't have indexing coz they work on hashing so we can't use for-loop, so use iterator there.

        //Why we use collection framework?
        //1.To reduce the programming effort
        //2.Provides in-built methods and classes
        //3.Highly optimized performance
        //4.Increase in productivity
        //5.Interoperability
        //6.Reduce operational time

        //Most used methods in Collection Interface :-
        //add
        //addAll
        //remove
        //removeAll
        //size
        //clear
        //contains
        //containsAll
        //retainAll
        //isEmpty

        //common exceptions that one faces whilst using collection framework:-
        //NullPointer exception :- NullPointerException is thrown when a reference variable is accessed and is not pointing to any object.
        //Class cast exception :-  ClassCastException is a runtime exception raised in Java when we try to improperly cast a class from one type to another. It comes mostly
        //whilst making clone (i.e. shallow copy of a data structure).
        //Illegal argument exception :- When a method is passed illegal or unsuitable arguments, an IllegalArgumentException is thrown.
        //Illegal state exception :- This exception is thrown when you call a method at illegal or inappropriate time an IllegalStateException is generated.
        //UnsupportedOperationException :- The UnsupportedOperationException is one of the common exceptions that occur when we are working with some API of list implementation.
        //It is thrown to indicate that the requested operation is not supported. Basically when collection can't be modified. Example whilst making a singleton dataStr. & trying
        //to add more elements to it.

    }
}
