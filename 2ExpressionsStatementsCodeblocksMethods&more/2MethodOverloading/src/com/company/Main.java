package com.company;

public class Main {

    public static void main(String[] args) {
//        Java can distinguish the methods with different method signatures.i.e.the methods can have same name but with
//        different parameters(i.e.number of the parameters, order of the parameters, and data types of the parameters)
//        within the same class.
        System.out.println(calcFeetAndInchesToCentimeters(72));

    }

    //println is an excellent example of method overloading!
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 && inches < 0 && inches > 12) {
            return -1;
        }
        return ((feet * 30.48) + (inches * 2.54));
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            return calcFeetAndInchesToCentimeters((int) (inches / 12), inches % 12);
        }
    }


}
