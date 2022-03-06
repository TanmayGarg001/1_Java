package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println("*******************************");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("*******************************");
        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12);
        System.out.println();
    }

//    public static int reverse(int number) {
//        int sum = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            sum = digit + (sum * 10);
//            number /= 10;
//        }
//        return sum;
//    }
//
//    public static int getDigitCount(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        if (number == 0) {
//            return 1;
//        }
//        int count = 0;
//        while (number != 0) {
//            number /= 10;
//            count++;
//        }
//
//        return count;
//    }
//
//    public static void numberToWords(int number) {
//        if (number == 0) {
//            System.out.println("Zero");
//        }
//        if (number < 0) {
//            System.out.println("Invalid Value");
//
//        } else {
//            int numberCount = number;
//            int originalNumber = reverse(number);
//            int count = 0;
//            while (number != 0) {
//                number /= 10;
//                count++;
//            }
//            if (numberCount % 10 != 0) {
//                while (originalNumber != 0) {
//                    if (getDigitCount(numberCount) == count) {
//                        int digit = originalNumber % 10;
//                        switch (digit) {
//                            case 0:
//                                System.out.print("Zero ");
//                                break;
//                            case 1:
//                                System.out.print("One ");
//                                break;
//                            case 2:
//                                System.out.print("Two ");
//                                break;
//                            case 3:
//                                System.out.print("Three ");
//                                break;
//                            case 4:
//                                System.out.print("Four ");
//                                break;
//                            case 5:
//                                System.out.print("Five ");
//                                break;
//                            case 6:
//                                System.out.print("Six ");
//                                break;
//                            case 7:
//                                System.out.print("Seven ");
//                                break;
//                            case 8:
//                                System.out.print("Eight ");
//                                break;
//                            case 9:
//                                System.out.print("Nine ");
//                                break;
//
//                        }
//                        originalNumber /= 10;
//                    }
//                }
//            } else {
//                while (originalNumber != 0) {
//                    if (getDigitCount(numberCount) == count) {
//                        int digit = originalNumber % 10;
//                        switch (digit) {
//                            case 0:
//                                System.out.print("Zero ");
//                                break;
//                            case 1:
//                                System.out.print("One ");
//                                break;
//                            case 2:
//                                System.out.print("Two ");
//                                break;
//                            case 3:
//                                System.out.print("Three ");
//                                break;
//                            case 4:
//                                System.out.print("Four ");
//                                break;
//                            case 5:
//                                System.out.print("Five ");
//                                break;
//                            case 6:
//                                System.out.print("Six ");
//                                break;
//                            case 7:
//                                System.out.print("Seven ");
//                                break;
//                            case 8:
//                                System.out.print("Eight ");
//                                break;
//                            case 9:
//                                System.out.print("Nine ");
//                                break;
//
//                        }
//                        originalNumber /= 10;
//                    }
//
//                }
//                for (int i = 0; i < (getDigitCount(numberCount) - getDigitCount(reverse(numberCount))); i++) {
//                    System.out.print("Zero ");
//                }
//            }
//        }
//    }


    public static int reverse(int num) {
        //reverses a number
        int reversed = 0;

        while (num != 0) {

            int lastDigit = num % 10;
            reversed = (reversed * 10) + lastDigit;
            num = num / 10;
        }

        return reversed;


    }

    public static int getDigitCount(int num) {
        //gets the amount of digits in a number
        int count = 0;

        if (num == 0) {
            return 1;
        }

        if (num < 0) {
            return -1;
        }

        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = getDigitCount(number);
        number = reverse(number); //reverse it

        while (count > 0) {
            int lastDigit = number % 10; //extract digit
            //print the digit
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            number = number / 10;
            count = count - 1; // decrement count

        }
    }
}