//find union & intersection
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList1 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> integerArrayList2 = new ArrayList<>(Arrays.asList(1, 2, 5, 7, 10, 44, -25));

        System.out.println(integerArrayList1);
        System.out.println(integerArrayList2);

        //union
        HashSet<Integer> integerHashSet = new HashSet<>(integerArrayList1);
        integerHashSet.addAll(integerArrayList2);
        ArrayList<Integer> unionArrayList = new ArrayList<>(integerHashSet);

        //intersection
        integerArrayList1.retainAll(integerArrayList2);
        ArrayList<Integer> intersectionArrayList = new ArrayList<>(integerArrayList1);

        //print
        System.out.println("Union = " + unionArrayList);
        System.out.println("Intersection = " + intersectionArrayList);


    }
}
