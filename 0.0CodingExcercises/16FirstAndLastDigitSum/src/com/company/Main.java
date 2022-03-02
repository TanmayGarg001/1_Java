package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(4245));
        System.out.println(sumFirstAndLastDigit(-4245));
        System.out.println(sumFirstAndLastDigit(59052));
    }


    public static int sumFirstAndLastDigit(int number) {
        int originalNumber = number;
        int lastDigit = number % 10;
        int count = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }
        int firstDigit = (int) (originalNumber / (Math.pow(10, count - 1)));
        return lastDigit + firstDigit;
    }
//alternative solution:-
//        public static int sumFirstAndLastDigit(int number) {
//            if (number < 0) {
//                return -1;
//            }
//
//            int lastDigit = number % 10;
//            while (number > 9) {
//                number /= 10;
//            }
//            return lastDigit + number;
//        }
//    }
}
