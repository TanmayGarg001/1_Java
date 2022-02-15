package com.company;

public class Main {

    public static void main(String[] args) {
        //non-leap years
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        //leap years
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
        //ques
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));



    }
    public static boolean isLeapYear(int year){
        return (year>=1&&year<=9999)&&((year%4==0&&year%100==0&&year%400==0)||(year%4==0&&year%100!=0&&year%400!=0));
    }

}
