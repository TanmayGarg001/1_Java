package com.company;

public class WagonR extends Car {
    @Override
    public void accelerate() {
        System.out.println("WagonR is accelerating.");
    }

    @Override
    public void applyBreak() {
        System.out.println("WagonR is slowing down.");
    }
}