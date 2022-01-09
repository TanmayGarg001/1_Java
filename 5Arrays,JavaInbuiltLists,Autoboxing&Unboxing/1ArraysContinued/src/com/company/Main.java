package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayStructures arrayStructures = new ArrayStructures();

        arrayStructures.generateRandomArray();
        arrayStructures.printArray();
        arrayStructures.getValueAtIndex(5);
        System.out.println(arrayStructures.doesArrayContainsThisValue(10));
        arrayStructures.deleteIndex(7);
        arrayStructures.addValue(69);
        arrayStructures.linearSearch(10);
        arrayStructures.bubbleSort(true);
        arrayStructures.bubbleSort(false);
        arrayStructures.binarySearch(12);
        arrayStructures.generateRandomArray();
        arrayStructures.printArray();
        arrayStructures.selectionSort();
        arrayStructures.printArray();
    }
}
