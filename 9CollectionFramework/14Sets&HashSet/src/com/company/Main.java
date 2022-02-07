package com.company;

//Unlike lists, sets have unique values and provides all the features of sets i.e. mathematical operations of set such as union,intersection etc.
//HashSet extend the AbstractSet class which further extends the AbstractCollection which implements the Collection Interface.

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Alpha");
        stringHashSet.add("Beta");
        stringHashSet.add("Gamma");
        stringHashSet.add("Delta");
        System.out.println(stringHashSet); //they are random due to hashing

        stringHashSet.add("Delta");//same value added again. It will not reflect in output, as Sets have unique value only.
        System.out.println(stringHashSet);

        System.out.println(stringHashSet.contains("Beta"));
        //union and intersections etc.

    }

}