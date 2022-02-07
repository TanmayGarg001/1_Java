package com.company;

//Lambda calculus (also written as λ-calculus) is a formal system in mathematical logic for expressing computation based on function abstraction
//and application using variable binding and substitution. It is a universal model of computation that can be used to simulate any Turing machine.
//It was introduced by the mathematician Alonzo Church in the 1930s as part of his research into the foundations of mathematics.

//A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods,
//but they do not need a name, and they can be implemented right in the body of a method.
//HIGHLY RECOMMEND READING THIS ARTICLE:-
//https://www.geeksforgeeks.org/functional-programming-paradigm/
//Fact: Whatsapp needs only 50 engineers for its 900M users because Erlang is used to implement its concurrency needs. Facebook uses Haskell in its anti-spam system.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    //Java before JAVA8 Launch was completely OOP language, but with lambda expressions in place it opens the door of functional programming.
    //Some major benefits of lambdas expressions are:-
    //Enables functional programming,readable and concise code,easier to use API's and libraries,Enables support for parallel processing!
    //https://www.youtube.com/watch?v=eis11j_iGMs
    //https://www.youtube.com/watch?v=J5RICKnbuKI&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=4
    //We can pretty much do everything in Object-Oriented programming.So we don't really need functional programming
    //but the advantages of functional programming are very useful, think of it as a golden tool that java provides you.

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arrayListX = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 5));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(0, -55));
        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(17, 100));
        ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(10, 85));
        arrayList.add(arrayList1);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(arrayList4);
        //Now if I want to let's say sort this 2-d array list I will use Collections.sort():-
//        Collections.sort(arrayList);//but this won't work as required type List<T> but we are providing ArrayList<ArrayList<Integer>>
        //Now we can do something like this to overcome that :-
        System.out.println(arrayList);
        Collections.sort(arrayList, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return Integer.compare(o1.get(0), o2.get(0));
            }
        });
        System.out.println(arrayList);
        //Here what I did was override the method compare which is from Comparator Interface and is required to compare the values you are comparing too.
        //But the code is too verbose and hard to read and not concise.
        //I can achieve totally similar thing using lambda expression and see the power!, all of that is done in 1 line, because lambda calculus works that way!
        System.out.println("Lambda:- ");
        arrayListX.add(arrayList1);
        arrayListX.add(arrayList2);
        arrayListX.add(arrayList3);
        arrayListX.add(arrayList4);
        System.out.println(arrayListX);
        Collections.sort(arrayListX, Comparator.comparingInt(o -> o.get(0)));//We can use ListName.sort similar to Collections.sort().Collections one is preferred!
        System.out.println(arrayListX);

    }

}
