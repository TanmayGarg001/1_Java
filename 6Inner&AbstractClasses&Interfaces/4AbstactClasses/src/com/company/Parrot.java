package com.company;

public class Parrot extends Bird {

    public Parrot(String parrotName) {
        super(parrotName);
    }

    @Override
    public void fly() {
        System.out.println(getAnimalName()+" is flying.");
    }
}
