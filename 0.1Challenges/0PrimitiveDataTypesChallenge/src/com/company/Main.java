package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Challenge: ");
        byte challByte = 127;
        short challShort = 32000;
        int challInt = 564823279;
        long challLong = (50000+(10*(challByte+challInt+challShort)));
        System.out.println(challLong);
    }
}
