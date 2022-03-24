package com.company;

public class Porsche extends Car {
    private String model;
    private int engineHorsePower;
    private int price;
    private int currentGear;

    public Porsche(String name, int maxSpeed, int mileage, String  color, int engine, int wheels, int numberOfGears, String company,
                   int personCapacity, String model, int engineHorsePower, int price, int currentGear) {
        super("Porsche", maxSpeed, mileage, color, 1, 4, 6, "Porsche", personCapacity);
        this.model = model;
        this.engineHorsePower = engineHorsePower;
        this.price = price;
        this.currentGear = currentGear;
    }

    public String getModel() {
        return model;
    }

    public int getEngineHorsePower() {
        return engineHorsePower;
    }

    public int getPrice() {
        return price;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void changingGears(int currentGear) {
        if (currentGear == 6) {
            System.out.println(getModel() + " is at maxSpeed " + isMoving());
        }
        if (currentGear < 6) {
            System.out.println(getModel() + " gear shifted to " + getCurrentGear());
        }
    }
}
