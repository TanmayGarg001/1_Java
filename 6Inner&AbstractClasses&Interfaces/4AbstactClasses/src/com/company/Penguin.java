package com.company;

public class Penguin extends Bird {


    public Penguin(String birdName) {
        super(birdName);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
