package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(isOdd(23));
        System.out.println(isOdd(24));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else
            return (number % 2 != 0);

    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;

                }
            }
            return sum;
        }

    }
}

