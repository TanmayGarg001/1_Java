package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        for (int i = number/2; i > 1; i--) {
            if (number % i == 0) {
                number=i;
            }

        }return number;
    }
}
