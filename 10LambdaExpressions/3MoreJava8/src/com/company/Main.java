package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 5, 3, 4, 8, 10));
        arrayList.stream().forEach(i -> System.out.println(i));//what's the use of stream then?
        System.out.println();
        //now this will create thread according to your CPU configuration.//other major use of stream APi is lots of methods to use.
        arrayList.parallelStream().forEach(i -> System.out.println(i));
        //If data you are dealing with is huge, then we use Stream API.
        //Let's say if you want to just take odd values from a large list of numbers etc.
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            values.add(i);
        }
        System.out.println();
        System.out.println(values);
        values.stream().filter(i -> i % 2 != 0);
        System.out.println(values);
    }

}
