package com.company;

public class FinalTest {
    private static int classCounter = 0;
    public final int instanceNumber;//= 1;//make this equal to 1 and error will pop up :- Cannot assign a value to final variable 'instanceNumber'
    private final String name;

    public FinalTest(String name) {
        //this.instanceNumber = 1;//now this will give error as we have made instanceNumber as final.
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is = " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
