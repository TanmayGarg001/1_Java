package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 223));
        System.out.println(hasSharedDigit(9, 2119));
        System.out.println(hasSharedDigit(12, 54));
        System.out.println(hasSharedDigit(12, 13));
    }


    public static boolean hasSharedDigit(int a, int b) {
        if (a > 99 || a < 10 || b > 99 || b < 10) {
            return false;
        }
        return (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10);
    }

//    //FUCK YEAH MY OP SOLUTION
//    public static boolean hasSharedDigit(int a, int b) {
//        while (a != 0) {
//            int digit1 = a % 10;
//            while (b != 0) {
//                int digit2 = b % 10;
//                if (digit1 == digit2) {
//                    return true;
//                }
//                b /= 10;
//            }
//            a /= 10;
//        }
//
//        return false;
//    }
}