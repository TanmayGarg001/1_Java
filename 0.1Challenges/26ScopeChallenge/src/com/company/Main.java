package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Now in this example the names you are required to use are entirely for understanding purposes.In real life this considered a very bad programming practice.
        X x = new X();
        System.out.print("Enter the number = ");
        x.x(scanner.nextInt());
        x.x();
    }

//   In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's see how ambiguity may occur:
//
//    class Adder {
//        static int add(int a, int b) {
//            return a + b;
//        }
//
//        static double add(int a, int b) {
//            return a + b;
//        }
//    }
//
//    class TestOverloading3 {
//        public static void main(String[] args) {
//            System.out.println(Adder.add(11, 11));//ambiguity
//        }
//    }

}
