package com.company;

//We know tha tby default java hashMap is not synchronized
//So we can use hashTable, Sync. map or concurrentMap.
//ConcurrentHaspMap are sort of same as HashMap, but its way faster as it provides thread safety at segment level unlike HashMap which provides thread safety at object level.

//So ConcurrentHashMap are super powered!
//HashTable is legacy version so we don't generally use that in real time application.

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("===========");

        //how to make HashMap thread safe :-
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("1", "Timmy");
        stringStringHashMap.put("2", "Timmy2");
        stringStringHashMap.put("3", "Timmy3");

        //this is how we made hashmap to syncHashmap
        Map<String, String> syncedMap = Collections.synchronizedMap(stringStringHashMap);
        System.out.println(syncedMap);

        //Concurrent HashMap : it does not throw any ConcurrentModificationException
        ConcurrentHashMap<String, String> stringStringConcurrentHashMap = new ConcurrentHashMap<>();
        stringStringConcurrentHashMap.put("11", "boi1");
        stringStringConcurrentHashMap.put("22", "boi2");
        stringStringConcurrentHashMap.put("33", "boi3");
        stringStringConcurrentHashMap.put("44", "boi4");

        System.out.println(stringStringConcurrentHashMap);//here if create multiple threads we will never get concurrentModificationException.
    }
    //Q:- Can multiple thread write in the same segment ?
    //A:- No, they can write on different segment using concurrentHashMap but not on the same segment at same time.
    //see the images for more.
}
