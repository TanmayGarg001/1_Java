package com.company;

public class Car extends Vehicle {
    private int wheels;
    private int numberOfGears;
    private String company;
    private int personCapacity;

    public Car(String name, int maxSpeed, int mileage, String color, int engine, int wheels, int numberOfGears, String company, int personCapacity) {
        super("Car", maxSpeed, mileage, color, 1);
        this.wheels = wheels;
        this.numberOfGears = numberOfGears;
        this.company = company;
        this.personCapacity = personCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getCompany() {
        return company;
    }

    public int getPersonCapacity() {
        return personCapacity;
    }

    public String isMoving() {
        return ",and is moving at  = " + getMaxSpeed() + "kmp/h";
    }

}
