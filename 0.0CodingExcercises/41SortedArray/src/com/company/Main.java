package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        printArray(myArray);
        System.out.println("---------------------------");
        printArray(sortIntegers(myArray));
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        printArray(myArray);
    }

    public static int[] getIntegers(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = unsortedArray[i];
        }
        for (int i = sortedArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    int temp = sortedArray[j + 1];
                    sortedArray[j + 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

}
