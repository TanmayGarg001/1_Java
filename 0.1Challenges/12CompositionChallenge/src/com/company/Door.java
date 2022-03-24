package com.company;

public class Door {
    private int numberOfDoors;
    private String material;
    private String typeOfDoor;
    private Dimensions dimensions;


    public Door(int numberOfDoors, String material, String typeOfDoor) {
        this.numberOfDoors = numberOfDoors;
        this.material = material;
        this.typeOfDoor = typeOfDoor;
    }

    public void openDoor() {
        System.out.println("Door " + material + " is opening." + "(" + typeOfDoor + " noises" + ")");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getMaterial() {
        return material;
    }

    public String getTypeOfDoor() {
        return typeOfDoor;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
