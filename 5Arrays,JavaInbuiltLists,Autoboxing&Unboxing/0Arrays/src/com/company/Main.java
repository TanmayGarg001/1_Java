package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        //Array is a data structure that allows you to store sequence of values, that are all of the same types.
//        //We can store primitive types and objects in an array.
//
//        //this how we declare an array
//        int[] myIntArray = new int[10];//10 elements in array
//        double[] myDoubleArray = {5.2, -65.52, 45.496, 4165.5, 6.04};//This can only be done whilst making new array
//        double[] myDoubleArray2 = new double[50];
//        myIntArray[5] = 50;//saved value 50 to element 6 (due to 0 indexing)
//        System.out.println(myIntArray[5]);
//        for (int i = 0; i < 10; i++) {
//            myIntArray[i] = (int) (Math.random() * 10);
//            System.out.println(myIntArray[i]);
//        }
//        //instead of hard coding the loop we should use array.length field provided with arrays in java.s
//        for (int i = 0; i < myDoubleArray2.length; i++) {
//            myDoubleArray2[i] = i * 2;
//            System.out.println(myDoubleArray2[i]);
//        }


        //Let's do some real life use of Array. We are going to take input array from user and take average of it
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");

        int[] array = makeArray();
        printArray(array);
        getAverage(array);

    }

    public static int[] makeArray() {

        System.out.println("Enter the number of elements you want in your array = ");
        int elements = scanner.nextInt();
        int[] returnArray = new int[elements];
        System.out.println("Enter " + elements + " elements of your array :\r");
        for (int i = 0; i < elements; i++) {
            returnArray[i] = scanner.nextInt();
        }
        return returnArray;
    }

    public static void printArray(int[] array) {
        System.out.println("\nElements are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + i + " = " + array[i]);
        }
    }

    public static void getAverage(int[] array) {
        double sum = 0d;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("\nAverage of the array is = " +  (sum / array.length));
    }

}
