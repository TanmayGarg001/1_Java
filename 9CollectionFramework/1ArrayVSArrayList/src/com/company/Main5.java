package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> integerArrayList1 = new ArrayList<>(Arrays.asList("Tim", "Sam", "Tom", "Sam"));
        System.out.println(integerArrayList1);
        System.out.println(integerArrayList1.lastIndexOf("Sam"));//returns the last index of the value
        System.out.println(integerArrayList1.indexOf("Sam"));//returns the first index of the value

        System.out.println("----------------");
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(integerArrayList.removeIf(element -> element % 2 == 0));
        System.out.println(integerArrayList);

        System.out.println("----------------");
        ArrayList<Integer> integerArrayList2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(integerArrayList2.removeIf(element -> element % 2 != 0));
        System.out.println(integerArrayList2);

        System.out.println("----------------");
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Timmy", "Savage", "Tom", "Sam", "Becca", "Timmy"));
        System.out.println(stringArrayList.retainAll(Collections.singleton("Timmy")));//retains all the objects mentioned in the list only.
        System.out.println(stringArrayList);
        System.out.println("----------------");

        //This is how we create a subList:-
        ArrayList<Integer> integerArrayList3 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> integerArrayList4 = new ArrayList<>(integerArrayList3.subList(2, 6));//gives element from specified position to other specified position-1
        System.out.println(integerArrayList3);
        System.out.println(integerArrayList4);

        //something you might need barely
        Object[] array = integerArrayList3.toArray();
        System.out.println(Arrays.toString(array));
    }
}
