package com.company;

public class Main {

    public static void main(String[] args) {
        // 8 primitive types exists in java
        //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects..
        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Maximum integer value is = " + maxIntValue);
        System.out.println("Minimum integer value is = " + minIntValue);
        System.out.println("Busted Maximum value = " + (maxIntValue + 2));//Overflow
        System.out.println("Busted Minimum value = " + (minIntValue - 1));//Underflow
        //int takes 32 bits or 4 bytes of space
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
//--------------------------------------------------------------------------------------------------------//
        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        System.out.println("Maximum short value is = " + maxShortValue);
        System.out.println("Minimum short value is = " + minShortValue);
        System.out.println("Busted Maximum value = " + (maxShortValue + 2));//Overflow
        System.out.println("Busted Minimum value = " + (minShortValue - 2));//Overflow
        //short takes 16 bits or 2 bytes of space
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
//--------------------------------------------------------------------------------------------------------//
        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        System.out.println("Maximum byte value is = " + maxByteValue);
        System.out.println("Minimum byte value is = " + minByteValue);
        System.out.println("Busted Maximum value = " + (maxByteValue + 2));//Overflow
        System.out.println("Busted Minimum value = " + (minByteValue - 2));//Overflow
        //byte takes 8 bits or 1 byte of space
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
        //byte myByte = (byte) (minByteValue / 2); // java by default treats this as an integer so we cast this into byte type.
//--------------------------------------------------------------------------------------------------------//
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        System.out.println("Maximum long value is = " + maxLongValue);
        System.out.println("Minimum long value is = " + minLongValue);
        System.out.println("Busted Maximum value = " + (maxLongValue + 2));//Overflow
        System.out.println("Busted Minimum value = " + (minLongValue - 2));//Overflow
        //long takes 64 bits or 8 bytes of space
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
        //long myLong = 214465456445L; // java treats long as int by default remove L and error pops up!;
//--------------------------------------------------------------------------------------------------------//
        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;
        System.out.println("Maximum float value is = " + maxFloatValue);
        System.out.println("Minimum float value is = " + minFloatValue);
        //float takes 32 bits or 4 bytes of space
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
//--------------------------------------------------------------------------------------------------------//
        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;
        System.out.println("Maximum double value is = " + maxDoubleValue);
        System.out.println("Minimum double value is = " + minDoubleValue);
        //double takes 64 bits or 8 bytes of space
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
//--------------------------------------------------------------------------------------------------------//
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        double myDoubleValue2 = 5.00 / 3.00;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);
        System.out.println(myDoubleValue2);
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
//--------------------------------------------------------------------------------------------------------//
        char myChar = 'D';//literally allows to store one character!
        char myUnicode = '\u0044';//literally allows to store one character!
        System.out.println(myChar + " " + myUnicode);
        //char takes 16bits or 2 bytes of space coz of unicode characters
//        boolean myBool = true;
        //boolean takes 1bit of space in memory
        System.out.println("*********************************************************");
        System.out.println("*********************************************************\n");
//--------------------------------------------------------------------------------------------------------//
        //string has same space as int i.e. 4bytes or 32 bits
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", overwriting that string!";
        System.out.println(myString);

    }
}