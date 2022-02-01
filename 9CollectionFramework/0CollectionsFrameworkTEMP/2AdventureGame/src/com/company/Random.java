package com.company;

import java.util.HashMap;
import java.util.Map;

public class Random {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "lemon");
        map1.put(2, "soda");
        map1.put(3, "bread");
        map1.put(4, "coke");
        map1.put(5, "eggs");

        for (Integer integer : map1.keySet()) {
            System.out.println(integer + " : " + map1.get(integer));
        }

        System.out.println("========================================");
        Map<Integer, String> map2 = new HashMap<>(map1);//shallow copy
        //when map2 is made it copy the values from map1 but it is an another map, so editing map2 won't affect in map1. See the last example you will understand better.
        map2.put(6, "cream");
        map2.remove(2);
        for (Integer integer : map2.keySet()) {
            System.out.println(integer + " : " + map2.get(integer));
        }
        System.out.println("========================================");

        for (Integer integer : map1.keySet()) {
            System.out.println(integer + " : " + map1.get(integer));
        }
        System.out.println("========================================");
        //maneuver to Random2
        Random2 object1 = new Random2("Timmy");
        Random2 object2 = object1;//here you see we did made another object but its not instantiated
        //this is duplicate copy
        //deep copy is like when you make a whole new object and then iterate its entries and assign them some values from other object or something.
        System.out.println(object1.getName());
        System.out.println(object2.getName());
        System.out.println("========================================");
        object1.setName("Sam");
        System.out.println(object1.getName());
        System.out.println(object2.getName());
        System.out.println("========================================");

    }
}
