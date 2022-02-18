package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(minutes + " min" + " = " + ((minutes / 60) / 24) / 365 + " y and " + (minutes / 1440) % 365 + " d");
    }
}

