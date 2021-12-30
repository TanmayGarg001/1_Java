package com.company;

public class Main {

    public static void main(String[] args) {
        char character = 'G';
        switch (character) {
            case 'A':
                System.out.println("Char was A");
                break;
            case 'B':
                System.out.println("Char was B");
                break;
            case 'C':
                System.out.println("Char was C");
                break;
            case 'D':
                System.out.println("Char was D");
                break;
            case 'E':
            case 'F':
            case 'G':
                System.out.println("Char was E/F/G");
                System.out.println(" It was a = " + character);
                break;
            default:
                System.out.println("No A,B,C,D or E was found!");
        }
    }
}
