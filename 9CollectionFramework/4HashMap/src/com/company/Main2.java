package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main2 {

    public static void main(String[] args) {
        //Compare two maps
        HashMap<Integer, String> integerStringHashMap1 = new HashMap<>();
        integerStringHashMap1.put(1, "A");
        integerStringHashMap1.put(2, "B");
        integerStringHashMap1.put(3, "C");

        HashMap<Integer, String> integerStringHashMap2 = new HashMap<>();
        integerStringHashMap2.put(3, "C");
        integerStringHashMap2.put(1, "A");
        integerStringHashMap2.put(2, "B");

        HashMap<Integer, String> integerStringHashMap3 = new HashMap<>();
        integerStringHashMap3.put(3, "C");
        integerStringHashMap3.put(1, "A");
        integerStringHashMap3.put(2, "B");
        integerStringHashMap3.put(4, "D");

        //1.on the basis of key value pair
        System.out.println(integerStringHashMap1.equals(integerStringHashMap2));//returns true if both keys and values are equal order does not matter
        System.out.println(integerStringHashMap1.equals(integerStringHashMap3));

        System.out.println("======");
        //2.Using equals to
        System.out.println(integerStringHashMap1.keySet().equals(integerStringHashMap2.keySet()));//this only compares the keys of the maps duh!
        System.out.println(integerStringHashMap1.keySet());
        System.out.println(integerStringHashMap1.values());

        //find out the extra keys. TIP:- Whenever you wanna find intersection try thinking of hashSet.or LinkedHashSet depends or order.
        HashMap<Integer, String> integerStringHashMap4 = new HashMap<>();
        integerStringHashMap4.put(1, "A");
        integerStringHashMap4.put(2, "B");
        integerStringHashMap4.put(3, "C");
        integerStringHashMap4.put(4, "D");

        HashMap<Integer, String> integerStringHashMap5 = new HashMap<>();
        integerStringHashMap5.put(1, "A");
        integerStringHashMap5.put(2, "B");
        integerStringHashMap5.put(3, "C");
        integerStringHashMap5.put(5, "E");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        HashSet<Integer> integerHashSet = new HashSet<>(integerStringHashMap5.keySet());
        integerHashSet.addAll(integerStringHashMap4.keySet());
        integerHashSet.removeAll(integerStringHashMap5.keySet());
        System.out.println(integerHashSet);

    }

}
