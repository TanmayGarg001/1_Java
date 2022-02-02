package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //does not store the value based on index, stores the value based on key-value pairs
        //key can't be duplicate!
        //can store multiple null values but one null key ofc.
        //Unlike hashTable, hashMap allows null values and is not thread safe/not - sync.

        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("India", "New Delhi");//puts the value in random order in the map
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put("UK", "London11");//now it will override the value (and warning)
        capitalMap.put("Random", "Shit");

        System.out.println(capitalMap);
        capitalMap.remove("Random");
        System.out.println(capitalMap.get("UK"));//gets the value of the provided key
        System.out.println(capitalMap.get("Australia"));//null

        capitalMap.put(null, "123");
        capitalMap.put(null, "12345");
        System.out.println(capitalMap.get(null));

        //Now as we know that maps are not indexed based, so we can't use typical for loop as we can't fetch the value at a particular index.
        //and we can't traverse as it doesn't store the data in ordered form.

        //1.So we can use iterator:-
        Iterator<String> iterator1 = capitalMap.keySet().iterator();
        Iterator<String> iterator2 = capitalMap.values().iterator();

        System.out.println("Key set:-");
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
        }
        System.out.println();
        System.out.println("Value set:-");
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }

        System.out.println("---------------------");

//        while (iterator1.hasNext()) {
//            String key = iterator1.next();
//            String value = capitalMap.get(key);
//            System.out.println("Key: " + key + " Value: " + value);
//        } //won't work as the iterator1 is now at last of the map.

        //2nd way using iterator:-
        Iterator<String> iterator3 = capitalMap.keySet().iterator();
        while (iterator3.hasNext()) {
            String key = iterator3.next();
            String value = capitalMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println("=====================");
        //3rd way of using iterator
        Iterator<Map.Entry<String, String>> iterator = capitalMap.entrySet().iterator();//this iterator iterates over pairs
        while (iterator.hasNext()) {
            Map.Entry<String, String> stringStringEntry = iterator.next();
            System.out.println("KEY = " + stringStringEntry.getKey() + " , VALUE = " + stringStringEntry.getValue());
        }
        System.out.println("===================================================================");
        System.out.println("===================================================================");
        //2.Using Lambda operator OP!
        capitalMap.forEach((key, value) -> System.out.println(key + " " + value));//in just one fucking line!!!
    }
}
