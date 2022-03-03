package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(12000));
        System.out.println(getDurationString(120002));
        System.out.println(getDurationString(-440));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(100, 8));
        System.out.println(getDurationString(100, 80));
        System.out.println(getDurationString(120, 850));
        System.out.println(getDurationString(-412, 4));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return ("Invalid Value");
        }
        return (minutes / 60 + "h " + minutes % 60 + "m " + seconds + "s");

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return ("Invalid Value");
        }
        return (getDurationString(seconds / 60, seconds % 60));
    }
}
