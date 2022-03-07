package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if (5 * i + j == goal) {
                    return true;
                }
            }
        }
        return false;
    }

}
