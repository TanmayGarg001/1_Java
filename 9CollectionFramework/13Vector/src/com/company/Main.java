package com.company;

import java.util.Collections;
import java.util.Vector;

public class Main {
    //vector and arrayList are almost same the difference being vector is thread safe,and a legacy class.
    //arrays cn be multidimensional but vector aren't. We can make a vector in vector which is called 2d-vector.

    public static void main(String[] args) {

        Vector<Integer> integers = new Vector<>();
        integers.add(45);
        integers.add(0);
        integers.add(644);
        integers.add(-54);
        integers.add(69);

        System.out.println(integers);

        Vector<Integer> anotherVector = new Vector<>();
        anotherVector.add(420);
        anotherVector.add(-420);
        anotherVector.add(5555);

        integers.addAll(anotherVector);
        System.out.println(integers);

        integers.removeElement(420);//in arrayList remove() method is overloaded unlike here
        System.out.println("==============================");
        integers.forEach(element -> System.out.print(element + " "));
        System.out.println("\n==============================");
        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println("\n-------------------");
        Collections.sort(integers);
        System.out.println(integers);

        //now how to make a 2d-vector i.e. vector inside a vector so each of element is a vector, hence vector of vectors.See Main2 class.
    }

}
