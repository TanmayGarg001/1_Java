package com.company;

public class Dog extends Animal {

    public Dog(String dogName) {
        super(dogName);//calls to parent constructor
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getAnimalName() + " is breathing.");
    }
}
