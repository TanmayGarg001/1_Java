package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        int count = 0;
        while (number != 100) {
            if (isEvenNumber(number)) {
                System.out.println("Number is = " + number);
                count++;

            }
            number++;
            if (count == 10) {
                break;
            }

        }
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
