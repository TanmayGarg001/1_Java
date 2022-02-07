package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main3 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 3, 5, 8, 10));
        System.out.println(arrayList);
        System.out.print("===========\n");
        for (int i : arrayList) {//or we can use simple for loop
            System.out.print(i + " ");
        }
        System.out.println("\n===========");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        //all the above methods to loop are external iterations i.e. a loop outside of the object will fetch the data of the object.
        System.out.println("\n=========");
        arrayList.forEach(i -> System.out.print(i + " "));//internal iteration//consumer interface//we can pass methods here as sot is the same
//        arrayList.forEach(System.out::print);//method reference ,so we are passing method as a parameter
        //Here if we want to do the same with a method build by yourself,then we have to provide a reference to do so:- ClassName::methodName
        System.out.println();
        //See the image for anonymous approach
        //Before java8 we must not modify an interface when a program is published as all the classes implementing that interface will give error iif we added
        //methods in interface. But now in Java8 we can use default or static methods which overcome that.
        //So methods like forEach and others in stream API that were added later, all are default methods.
        //See the image

    }

}
