package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = readElements(readInteger());
        System.out.println(findMin(myArray));


    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        return numberOfElements;
    }

    private static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp > array[i]) {
                temp = array[i];
            }
        }
        return temp;
    }
}
