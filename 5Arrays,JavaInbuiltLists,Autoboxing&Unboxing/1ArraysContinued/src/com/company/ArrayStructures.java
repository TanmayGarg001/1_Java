package com.company;

public class ArrayStructures {

    private int[] array = new int[100];
    private int arraySize = 10;

    public void generateRandomArray() {
        int[] generatedArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            generatedArray[i] = (int) (Math.random() * 10) + 5;
        }
        array = generatedArray;
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Element #" + i + " = " + array[i]);
            System.out.println("----------");
        }
    }

    public void getValueAtIndex(int index) {
        if (index < arraySize) {
            System.out.println("Value at index-" + index + " is : " + array[index]);
        } else
            System.out.println("-1");

    }

    public boolean doesArrayContainsThisValue(int value) {
        for (int i = 0; i < arraySize; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < arraySize - 1; i++) {
                array[i] = array[i + 1];
            }
            arraySize--;
        } else {
            System.out.println("Index out of bounds");
        }
        System.out.println("********************");
        printArray();
    }

    public void addValue(int value) {
        arraySize++;
        array[arraySize - 1] = value;
        System.out.println("********************");
        printArray();
    }

    public void linearSearch(int value) {
        boolean temp = false;
        for (int i = 0; i < arraySize; i++) {
            if (value == array[i]) {
                System.out.print(i + " ");
                temp = true;
            }
        }
        if (!temp) {
            System.out.println("No index was found with value : " + value);
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void bubbleSort(boolean isDescending) {
        System.out.println();
        if (isDescending) {
            for (int i = arraySize - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        } else {
            for (int i = arraySize - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted Array :- ");
        System.out.println("================");
        printArray();
    }

    //Useful only when each value is unique and in ascending order(generally)

    public void binarySearch(int value) {
        bubbleSort(false);
        int lowerIndex = 0;
        int highIndex = arraySize - 1;
        while (lowerIndex <= highIndex) {
            int middleIndex = (lowerIndex + highIndex) / 2;
            if (array[middleIndex] < value) {
                lowerIndex = middleIndex + 1;
            } else if (array[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else
                System.out.println("Value found :- " + array[middleIndex] + " at " + middleIndex);
            break;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;
            for (int j = i; j < arraySize; j++) {
                if (array[minimum] > array[j]) {
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;

        }

    }

}
