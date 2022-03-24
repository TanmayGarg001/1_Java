package com.company;

public class Vehicle {
    private String name;
    private int maxSpeed;
    private int mileage;
    private String color;
    private int engine;

    public Vehicle(String name, int maxSpeed, int mileage, String color, int engine) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public int getEngine() {
        return engine;
    }
}
