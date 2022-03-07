package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(2));
        System.out.println(sumDigits(25));
        System.out.println(sumDigits(254));
        System.out.println(sumDigits(-254));
        System.out.println(sumDigits(56254));
    }

    public static int sumDigits(int number) {
        if (number <= 9) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number /= 10;
        }
        return sum;
    }
}
