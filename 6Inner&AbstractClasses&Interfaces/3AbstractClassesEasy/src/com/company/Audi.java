package com.company;

public class Audi extends Car {
    @Override
    public void accelerate() {
        System.out.println("Audi is accelerating.");
    }

    @Override
    public void applyBreak() {
        System.out.println("Audi is slowing down.");
    }
}
