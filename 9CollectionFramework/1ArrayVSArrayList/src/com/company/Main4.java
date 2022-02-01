package com.company;

public class Main4 {
    public static void main(String[] args) {

//This is lit! :-
        double start1 = System.currentTimeMillis();
        for (int i = 0; i < 1_0_000_000; i++) {
            System.out.print("");
        }
        double end1 = System.currentTimeMillis();
        System.out.println("Time for 1st for loop :- " + (end1 - start1));
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        double start2 = System.currentTimeMillis();
        for (int i = 1_0_000_000; i > 0; i--) {
            System.out.print("");
        }
        double end2 = System.currentTimeMillis();
        System.out.println("Time for 2nd for loop :- " + (end2 - start2));
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        double start3 = System.currentTimeMillis();
        int[] array = new int[10000000];
        for (int i : array) {
            System.out.print("");
        }
        double end3 = System.currentTimeMillis();
        System.out.println("Time for 3rd for loop :- " + (end3 - start3));
        ///////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
