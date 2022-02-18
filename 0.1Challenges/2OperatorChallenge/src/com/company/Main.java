package com.company;

public class Main {

    public static void main(String[] args) {
        double first = 20.00;
        double second = 80.00;
        boolean result = (((first + second) * 100) % 40) == 0 ? true : false;
        System.out.println(result);
        if (!result) {
            System.out.println("got some remainder!");
        }

    }
}
