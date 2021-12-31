package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "125";
        System.out.println(numberAsString);
        numberAsString = numberAsString + 125;
        System.out.println(numberAsString);
        int number = Integer.parseInt(numberAsString);
        number = number + 56;
        System.out.println(number + 25);

        System.out.println("------------------------------");
        //This works fine!!
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your  name : ");
//        String name = scanner.nextLine();
//        System.out.println("Enter you age : ");
//        int age = scanner.nextInt(); //u can do scanner.nextLine() and then parse that into  integer but the nextInt() method does that for us.
//        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
//        scanner.close();

        //This gives us error so we need to handle the next line character (enter key)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you birth year : ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); //u can do scanner.nextLine() and then parse that into  integer but the nextInt() method does that for us.
            scanner.nextLine();//This fixes the enter key or next line character
            System.out.println("Enter your  name : ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
                scanner.close();
            } else {
                System.out.println("Invalid birth-year!");
            }

        } else {
            System.out.println("Unable to parse the year of birth!");
        }


    }
}
