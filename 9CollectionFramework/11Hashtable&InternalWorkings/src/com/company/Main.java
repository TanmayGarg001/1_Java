package com.company;

import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {

        //Hashtable is a very old API as it was introduced in JDK 1.1, legacy.
        //Stores the value in key-value pair format. Similar to HashMap but Hashtable is synchronized and does not allow any null key or null value.
        //Also initial capacity of Hashtable is 11 and loadFactor is 0.75. But in case of hashMap it has 16 segments and 0.75 loadFactor.
        //also data is stores randomly using hashing so ordering is not maintained.

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Naveen", 100);
        hashtable.put("Tom", 200);
        hashtable.put("Lisa", 300);
        hashtable.put("Peter", 400);
        hashtable.put("Robby", 600);

        System.out.println(hashtable.get("Lisa"));
        //let's try to add null key/value
        //   hashtable.put(null,2);//Exception in thread "main" java.lang.NullPointerException
        //  hashtable.put("someRandomValue",null);//Exception in thread "main" java.lang.NullPointerException

        hashtable.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        //in case of collisions linked list is used
        //for indexing hashing is used (hashCode % size) is used
        //see the images
        System.out.println(hashtable.get("random"));

    }

}
