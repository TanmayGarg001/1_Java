package com.company;

public abstract class Bird extends Animal {

    public Bird(String birdName) {
        super(birdName);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getAnimalName() + " is breathing.");
    }

    public abstract void fly();

}
