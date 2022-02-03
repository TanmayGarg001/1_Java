package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//ways to initialize hash map
public class Main {

    private static HashMap<String, Integer> integerHashMap = new HashMap<>();

    static {
        integerHashMap.put("Tim", 88);
        integerHashMap.put("Ron", 75);
        integerHashMap.put("Sam", 90);
    }


    public static void main(String[] args) {

        //1. Using HashMap class.
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        //then we use get/put etc. methods

        //2. Static way (we don't prefer this in general)
        System.out.println(Main.integerHashMap.get("Ron"));

        //3. Immutable map with only one entry.;
        Map<String, Integer> map1 = Collections.singletonMap("Single", 69);
        System.out.println(map1.get("Single"));
//        map1.put("key2", 77);//this will give error :- Exception in thread "main" java.lang.UnsupportedOperationException

        //4. Using streams (see he image)

        //5. Map.of() method to create an EMPTY map only!
        Map<String, String> emptyMap = Map.of();
//        emptyMap.put("AS", "sa"); //"main" java.lang.UnsupportedOperationException
        System.out.println(emptyMap);

        //6. Map.of() method is overloaded and we can make singleton map and other types (10 is the limit) of map see the drop down list using map.of() method.

    }

}
