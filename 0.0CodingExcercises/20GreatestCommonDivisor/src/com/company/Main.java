package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisors(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            int min = Math.min(first, second);
            for (int i = min; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    //Alternative god-like algo!
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            while (first != second) {
                if (first > second) {
                    first -= second;
                } else {
                    second -= first;
                }
            }
        }
        return first;
    }
}