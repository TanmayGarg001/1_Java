package com.company;

class Car {
    private boolean engine = true;
    private int numberOfCylinders;
    private int numberOfWheels = 4;

    public Car(boolean engine, int numberOfCylinders, int numberOfWheels) {
        this.engine = engine;
        this.numberOfCylinders = numberOfCylinders;
        this.numberOfWheels = numberOfWheels;
    }

    public void startEngine() {
        System.out.println("startEngine() was called!");
    }

    public void accelerate() {
        System.out.println("accelerate() was called!");
    }

    public void brake() {
        System.out.println("brake() was called!");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumberOfCylinders() {
        return 4;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}

class Porsche extends Car {
    public Porsche() {
        super(true, 6, 4);
    }

    @Override
    public int getNumberOfCylinders() {
        return 6;
    }
}

class Honda extends Car {
    public Honda() {
        super(true, 3, 4);
    }

    @Override
    public int getNumberOfCylinders() {
        return 3;
    }
}

class Subaru extends Car {
    public Subaru() {
        super(true, 8, 4);
    }
}

public class Main {

    public static void main(String[] args) {
        Porsche porsche = new Porsche();
        Honda honda = new Honda();
        Subaru subaru = new Subaru();
        System.out.println(porsche.getNumberOfCylinders());
        System.out.println(honda.getNumberOfCylinders());
        System.out.println(subaru.getNumberOfCylinders());
    }
}
