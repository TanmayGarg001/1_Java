package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(405);//appends the value in the arrayList
        integerArrayList.add(415);
        integerArrayList.add(425);
        integerArrayList.add(435);

        System.out.println(integerArrayList);
        integerArrayList.remove(1);//removes the object at index and reduces the list size by 1
        integerArrayList.set(0, 69);//overwrites the object value at specified index
        integerArrayList.add(1, 555555);//adds/inserts the value at specified index
        System.out.println(integerArrayList);
        int temp = integerArrayList.get(3);//gets the value at specified index
        System.out.println(integerArrayList.contains(69));//returns true if value is found
        System.out.println(integerArrayList.isEmpty());//returns true if array list empty
        integerArrayList.clear();//removes all the elements in the arrayList
        System.out.println(integerArrayList);

        integerArrayList.trimToSize();//trims the size of arrayList to the actual number of elements in the Arraylist.
        integerArrayList.add(44);
        integerArrayList.add(55);
        integerArrayList.add(66);
        System.out.println(integerArrayList);

        integerArrayList.clone();//Returns a shallow copy of this ArrayList instance.
        //https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/#:~:text=In%20shallow%20copy%2C%20only%20fields,as%20well%20as%20objet%20references.
        //https://www.edureka.co/blog/shallow-and-deep-copy-java/
        System.out.println(integerArrayList);
        System.out.println("\n---------------------------------------");
        System.out.println("---------------------------------------");
        //================================================================================================================================================================//

        //To iterate over the ArrayList we have various ways:-

        //1.The good old for loop
        System.out.println("Using for Loop:- ");
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.print(integerArrayList.get(i) + " ");
        }
        System.out.println("\n---------------------------------------");

        //2.Using for each loop
        System.out.println("Using for each loop:- ");
        for (int i : integerArrayList) {//this means in each iteration i which is an int will be equal to the value in integerArrayList until the list exhausts.
            System.out.print(i + " ");//prints the value of i each in each iteration
        }
        //The Java for-each loop or enhanced for loop is introduced since J2SE 5.0. It provides an alternative approach to traverse the array or collection in Java.
        //It is mainly used to traverse the array or collection elements. The advantage of the for-each loop is that it eliminates the possibility of bugs and makes
        //the code more readable. It is known as the for-each loop because it traverses each element one by one.
        //The drawback of the enhanced for loop is that it cannot traverse the elements in reverse order. Here, you do not have the option to skip any element
        //because it does not work on an index basis. Moreover, you cannot traverse the odd or even elements only.
        //But, it is recommended to use the Java for-each loop for traversing the elements of array and collection because it makes the code readable.
        System.out.println("\n---------------------------------------");

        //3.Now see the fucking magic with lambda expressions : (you don't need to use .stream() as it is understood in JDK11)
        System.out.println("Using lambda expression:- ");
        integerArrayList.forEach(element -> System.out.print(element + " "));//In just one line of code OP!
        System.out.println("\n---------------------------------------");

        //4.Using iterator ^ thingy.We can use ListIterator which is more useful here.
        System.out.println("Using iterator:- ");
        Iterator<Integer> iterator = integerArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}