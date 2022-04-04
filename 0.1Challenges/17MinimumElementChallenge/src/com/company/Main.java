package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = readIntegers(5);
        System.out.println("-----------------");
        System.out.println(findMin(myArray));

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < temp) {
                temp = array[i];
            }
        }
        return temp;
    }
}
