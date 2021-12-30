package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0/*initialize condition*/; i < 69/*termination condition*/; i++/*incrementation*/) {
            System.out.println(i);//loops executes 69 times.
        }
        System.out.println("********************************************************");
        for (int i = 2; i <= 8; i++) {
            System.out.printf("%.3f%n", calculateInterest(10000, i));
        }
        System.out.println("********************************************************");
        for (int i = 8; i >= 2; i--) {
            System.out.printf("%.3f%n", calculateInterest(10000, i));
        }
        System.out.println("********************************************************");
        System.out.println(isPrime(1));
        System.out.println(isPrime(15));
        System.out.println(isPrime(5));
        int count = 0;

        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100d));
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(number);
        return true;

    }
}
