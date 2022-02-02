package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

//How will you remove duplicate elements from the arrayList ?
//You can use a loop inside a loop.
//Use linked hash set.(because we need to maintain order)
//Use stream API.

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i <= 500000; i++) {
            integerArrayList.add((int) (Math.random() * 10));
        }
//        System.out.println(integerArrayList);
        ArrayList<Integer> integerArrayList2 = new ArrayList<>();
        for (int i = 0; i <= 500000; i++) {
            integerArrayList2.add((int) (Math.random() * 10));
        }
//        System.out.println(integerArrayList2);
        ArrayList<Integer> integerArrayList3 = new ArrayList<>();
        for (int i = 0; i <= 500000; i++) {
            integerArrayList3.add((int) (Math.random() * 10));
        }
//        System.out.println(integerArrayList3);
        //1.took around 5.7secs
        double start1 = System.currentTimeMillis();
        for (int i = 0; i < integerArrayList.size() - 1; i++) {
            for (int j = integerArrayList.size() - 1; j > i; j--) {
                if (integerArrayList.get(i).equals(integerArrayList.get(j))) {
                    integerArrayList.remove(j);
                }
            }
        }
        double end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
//        System.out.println(integerArrayList);

        System.out.println("----------------------------");
        //2. took like 30ms
        double start2 = System.currentTimeMillis();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(integerArrayList2);
//        ArrayList<Integer> integerArrayListRequired = new ArrayList<>(linkedHashSet); //this will give you your required arrayList
        double end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);
//        System.out.println(linkedHashSet);

        //3.Using stream API FASTEST POSSIBLE, HOLY FUCKING SHIT!
        double start3 = System.currentTimeMillis();
        List<Integer> integerArrayListOutput = integerArrayList3.stream().distinct().collect(Collectors.toList());
        double end3 = System.currentTimeMillis();
        System.out.println(end3 - start3);
//        System.out.println(integerArrayListOutput);


    }

}
