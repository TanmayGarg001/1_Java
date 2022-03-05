package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (b == c) || (c == a);
        }
        return false;
    }

}
