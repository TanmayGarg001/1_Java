package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main2 {
    //How to compare 2 arrayLists in java ?
    public static void main(String[] args) {
        //1.Using sorting and equals
        ArrayList<Character> characterArrayList1 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'F'));
        ArrayList<Character> characterArrayList2 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<Character> characterArrayList3 = new ArrayList<>(Arrays.asList('C', 'D', 'B', 'A', 'F'));

        System.out.println(characterArrayList1.equals(characterArrayList3));//it is equals but order is not the same so output is false.
        Collections.sort(characterArrayList1);
        Collections.sort(characterArrayList3);
        System.out.println(characterArrayList1.equals(characterArrayList3));//it is equals and now order also the same so output is true.

        System.out.println(characterArrayList1.equals(characterArrayList2));//as element is missing no matter the order the result will be false.
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        //2. to find the element that is non-unique to the lists
        ArrayList<Character> characterArrayList4 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'F'));
        ArrayList<Character> characterArrayList5 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        characterArrayList4.removeAll(characterArrayList5);
        System.out.println(characterArrayList4);

        //3.To find the common elements in the list.
        ArrayList<Character> characterArrayList6 = new ArrayList<>(Arrays.asList('B', 'A', 'F', 'D', 'C'));
        ArrayList<Character> characterArrayList7 = new ArrayList<>(Arrays.asList('D', 'B', 'A', 'C', 'E'));
        characterArrayList6.retainAll(characterArrayList7);
        System.out.println(characterArrayList6);
        Collections.sort(characterArrayList6);
        System.out.println(characterArrayList6);
    }
    //For more practice on List interface check this out :- https://www.w3resource.com/java-exercises/collection/index.php#arraylist
}