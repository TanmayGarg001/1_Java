package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main2 {
    //How to convert hashMap to arrayList ?
    public static void main(String[] args) {

        HashMap<String, Integer> compMap = new HashMap<>();
        compMap.put("Google", 10000);
        compMap.put("Infosys", 20000);
        compMap.put("Amazon", 30000);
        compMap.put("Facebook", 5000);
        compMap.put("TCS", 5800);
        compMap.put("Wipro", 9800);
        compMap.put("Cisco", 15000);
        //Just to traverse the map :-

//        Iterator<Map.Entry<String, Integer>> iterator = compMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> integerEntry = iterator.next();
//            System.out.println(integerEntry);
//        }

        compMap.forEach((key, value) -> System.out.println(key + " ===> " + value));

        System.out.println("Map size = " + compMap.size());

        ArrayList<String> companiesName = new ArrayList<>(compMap.keySet());
        System.out.println(companiesName);

        ArrayList<Integer> employees = new ArrayList<>(compMap.values());
        System.out.println(employees);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(15, 86, 7, 8, 9));
        System.out.println(integers);
        System.out.println(integers.add(44));
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);

        //To know you knowledge check this out :-
        //https://www.java67.com/2015/06/20-java-arraylist-interview-questions.html
        //https://www.javatpoint.com/java-collections-interview-questions
    }

}
