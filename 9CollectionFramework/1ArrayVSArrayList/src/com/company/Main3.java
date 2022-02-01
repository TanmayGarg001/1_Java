package com.company;
//Most used methods in Collection Interface :-
//add
//addAll
//remove
//removeAll
//size
//clear
//contains
//containsAll
//retain
//retainAll
//isEmpty

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        //The time complexity of ArrayList.clear() is O(n) and of removeAll is O(n^2).

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Java");
        arrayList1.add("JavaScript");
        arrayList1.add("Python");
        arrayList1.add("Ruby");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Timmy");
        arrayList2.add("Savage");
        System.out.println(arrayList2);

        //arrayList2.addAll(arrayList1);//this appends all the elements
        arrayList2.addAll(1, arrayList1);//appends the provided arrayList elements at and after the index mentioned.//overloaded method
        System.out.println(arrayList2);

        System.out.println("-------------------------");
        arrayList2.removeAll(arrayList1);//removes all the elements of provided list in the actual list
        System.out.println(arrayList2);

        arrayList2.addAll(arrayList1);
        arrayList2.add("Java");
        System.out.println(arrayList2.containsAll(arrayList1));//gives true if all the elements of provided list are there in the actual list
        System.out.println(arrayList2);
        System.out.println("---------------------------");

        //SEE THESE VIDEOS BEFORE YOU STUDY ANY FURTHER :-
        //https://www.youtube.com/watch?v=b2uFL4BFDYg&list=RDCMUC59K-uG2A5ogwIrHw4bmlEg&start_radio=1&rv=b2uFL4BFDYg&t=261
        //https://www.youtube.com/watch?v=WIh-TVq4ifI
        //https://www.youtube.com/watch?v=KWbr7B5LDzs
        ArrayList<Object> cloneArrayList = (ArrayList<Object>) arrayList1.clone();
        //.clone() method returns an object (and does shallow copy) so we need to typecast it into desired type.
        System.out.println(cloneArrayList);
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(cloneArrayList);
        System.out.println("-------------");

        System.out.println(arrayList2);
        System.out.println(arrayList2.indexOf("Savage"));


    }
}

