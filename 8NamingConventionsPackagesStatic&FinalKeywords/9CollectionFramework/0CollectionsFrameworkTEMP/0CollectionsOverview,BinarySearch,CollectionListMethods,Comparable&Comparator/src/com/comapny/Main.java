package com.comapny;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Earlier we studied about ArrayLists,LinkedLists etc. those were part of collection framework and this framework also include things like
        //Maps,trees,queues,sets etc.So at the top level of collection framework is the Collection Class, which exposes static methods that we can
        //operate on collections.The interfaces in collection framework allows it to be extended further.
        //There is good interoperability amongst various collections, so that anything made in future is a reasonable representation of collection.
        //LIST INTERFACE IS IMPLEMENTED BY CLASSES:- "ARRAYLIST", "LINKEDLIST", "STACK", VECTOR
        //SET INTERFACE IS IMPLEMENTED BY CLASSES:- ENUMSET, "HASHSET", "LINKEDHASHSET","TREESET"
        //QUEUE(fifo) INTERFACE IS IMPLEMENTED BY CLASSES:- "ARRAYDEQUEUE","LINKEDLIST","PRIORITYQUEUE"
        //Also list,set,queue interface itself extends from Collections interface.

        //Similar to collection interface we have Map interface which works on the principle of key-value pairs.
        //MAP interface is stand alone interface as it does not extends over other interfaces
        //MAP INTERFACE IS IMPLEMENTED BY THE CLASSES:-HASPMAP, ENUMMAP, LINKEDHASHMAP, WEAKHASHMAP, TREEMAP
        //Now the main  components of the collections framework are interfaces.
        //Also includes aggregate operations like:- iterators,
        //another core element is implementations :- arrayLists and LinkedLists,
        //Also algorithms.
        //The JAVA JDK provides a range of polymorphic algorithms that works on collection objects.
        //link:- https://www.geeksforgeeks.org/collections-in-java-2/
        //https://www.youtube.com/watch?v=sRWn1D4JEDs
        //Maneuver to theatre class
        //There are methods like Collections.reverse or Collections.sort or collections.shuffle, collections.swap , .max and .min etc and lot built in java!
        //Here we are getting time complexity of O(n):- brute force search
        //Now we use binary search to overcome that.The collection class provides the binary search method that performs way better logn (base 2), coz it halves it each time.
        //Now we need to implement comparable interface to do that so that java can compare to things.

        Theatre theatre = new Theatre("PVR", 10, 14);
        System.out.println(theatre.getTheatreName());
        theatre.getSeats();


        if (theatre.reserveSeat("| B07 |")) {
            System.out.println("Please pay, your seat is reserved!");
        }
        System.out.println("==============================");
        if (theatre.reserveSeat("| G11 |")) {
            System.out.println("Please pay, your seat is reserved!");
        }
        System.out.println("==============================");
        if (theatre.reserveSeat("| E01 |")) {
            System.out.println("Please pay, your seat is reserved!");
        }
        System.out.println("==============================");
        if (theatre.reserveSeat("| E01 |")) {
            System.out.println("Please pay, your seat is reserved!");
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        Collections.shuffle(theatre.seats);//shuffled the seats
        theatre.getSeats();

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        Theatre.Seat maxSeat = Collections.max(theatre.seats);
        System.out.println("Max = " + maxSeat.getSeatID());//prints the maximum seat number even if list is not sorted


        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        Theatre.Seat minSeat = Collections.min(theatre.seats);
        System.out.println("Min = " + minSeat.getSeatID());//prints the minimum seat number even if list is not sorted

        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        Collections.sort(theatre.seats);
        theatre.getSeats();

        //Collections also provides us with the functionality to copy the lists, but we as a developer need two types of copies generally.
        //Shallow copy or a deep copy.Deep copy being the one with new objects with same values but different references in the memory.

//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size() - 1);
//        Collections.copy(newList, theatre.seats);// This gives us error :- Source does not fit in destination

        //The reason it gives error is because you might think first that you allotted the space for new objects in you new Array List but,
        //this only sets the capacity of the ArrayList, giving it potential to store that much elements but initially storing none.
        //So to work we actually need to have that many objects in that list initially, before we can attempt to copy.
        //So its not used that much, but it useful if all the objects of new ArrayList (here) are initialized
    }

}
