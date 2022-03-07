package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int number;
        while (true) {
            System.out.println("Enter number #" + (count + 1) + " : ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                sum = sum + number;
                count++;
                if (count == 10) {
                    break;
                }

            } else {
                System.out.println("Invalid number!");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);

    }

//    int sum = 0;
//        System.out.println("Enter numbers : ");
//    Scanner scanner = new Scanner(System.in);
//        for (int i = 1; i <= 10; i++) {
//        System.out.println("Enter number #" + i + " : ");
//        boolean hasNextInt = scanner.hasNextInt();
//        int number = scanner.nextInt();
//        if (hasNextInt) {
//            sum = sum + number;
//        } else {
//            System.out.println("Invalid number.");
//        }
//    }
//        System.out.println("Total is : " + sum);
//        scanner.close();

}
