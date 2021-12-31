package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello Tanmay!");

        //in c++ we can't deal with number larger than 64bits so we have to convert them to string and implement the functionality on them.
        //in java we can use bigDecimal types but here we don't have to manually do all this.AND THERE IS NO UPPER LIMIT WOHOOOOOOOOO!!
        //https://www.javatpoint.com/java-biginteger

        //1d 2d 3d arrays prefer using string array even though its a single char coz its easy to perform operation on it.
        //In Competitive programming limit of array declared locally size is around of order 10^5 depends on the machine and in general in CPP too.
        //We can do it globally but its constant as value can't be tempered with.

        //because this stores in a stack and limit of a stack is 8mbs generally depends on hardware and OS
        //on the other hand when we do it globally there is no such limit and it stored in a data segment.

        double d1 = 1e24;
        String str1 = "Xad";
        String str2 = "sa221d";
        String str3 = "test";
        System.out.println(str3.replace('t', 'b'));
        System.out.println(str3.replace(str3.charAt(2), '7'));
        System.out.println(str3.length());
        String c = Character.toString(str1.charAt(1));
        System.out.println(c);
        System.out.println(str1.charAt(1));
        System.out.println(str1 + str2);
        System.out.println(BigDecimal.valueOf(d1).toPlainString());
    }
}
