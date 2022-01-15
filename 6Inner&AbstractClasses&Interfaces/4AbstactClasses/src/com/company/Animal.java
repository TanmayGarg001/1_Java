package com.company;

public abstract class Animal {

    public String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public abstract void eat();

    public abstract void breathe();


    public String getAnimalName() {
        return animalName;
    }

}
