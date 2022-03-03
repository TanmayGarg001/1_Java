package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(-2468525));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        int digit = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0) {
                    sum = sum + digit;
                }
                number /= 10;
            }
        }
        return sum;
    }
}