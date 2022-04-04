package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers();
        printArray(myArray);
        sortArray(myArray);
        printArray(myArray);

    }

    public static int[] getIntegers() {
        System.out.print("Enter the number of elements you want in your array : ");
        int elements = scanner.nextInt();
        int[] buildArray = new int[elements];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < elements; i++) {
            buildArray[i] = scanner.nextInt();
        }
        return buildArray;
    }

    public static void printArray(int[] array) {
        System.out.println("------------------------------");
        System.out.println("Elements of the array are :- ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element #" + (i + 1) + " = " + array[i]);
        }
        System.out.println("------------------------------");
    }

    public static void sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

}
