package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions myDimensions = new Dimensions(300, 175, 100);
        Case myCase = new Case("B450", "GIGABYTE", "800W GOLD RATED PSU", myDimensions);
        Monitor myMonitor = new Monitor("AOC-AGON-5200", "AOC", new Resolution(2560, 1440), 32);
        Motherboard myMotherboard = new Motherboard(4, 2, "NZXT-500", "NZXT", "v3.14");

        PC myPC = new PC(myCase, myMonitor, myMotherboard);
        //This is the benefit of composition
        //So if there is a "has- a" type relation use composition if there's a "is-a" type relation use inheritance
        myPC.powerUp();
        myPC.loadProgram();
        myPC.drawPixel();//Here we are hiding the direct access to the getters by myPc object.
        //in general try to use composition.
    }
}