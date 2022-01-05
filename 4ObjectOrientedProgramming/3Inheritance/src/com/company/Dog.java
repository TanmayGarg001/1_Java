package com.company;
//INHERITANCE IS NOTHING BUT is-a RELATIONSHIP. Example:- Dog is a Animal.
//Now here dog class will inherit from Animal class. Here dog is a sub-class or child class.Which uses Animal class's states and behaviours

public class Dog extends Animal {
    //This will give error as there is no default constructor available for Animal .
// When we are creating a new class that is extending from another class we need to call that other constructor class ti initialize it.(Obviously)
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Now all the fields mentioned above are specific to a Dog Only.
    //But in addition to those we have base fields mentioned below as parameters of constructor.
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // This means to call the constructor from the class that we are extending from which is Animal here.
        //As all dogs have 1 brain and body so we initialized it to 1 so we don't have to define those each time whilst we create dog object.
        //Basically this allows us to initialize the animal class as it is inheriting from that class.
        //But we can add more fields and behaviours that are specific to Dog Class.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //This is over-riding the method that was declared in animal class
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();//Control flows to eat() method of animal class ,as super.eat() indicates that access super class i.e. Animal and use the eat method
    }

    private void walk() {
        System.out.println("Dog.walk() called.");
        move(5);//In general use move instead of super.move() because lets say you want to add something extra to move method in dog class by over-riding it
        //Then you have to change that super.move() to move() and in a big program this would be a pain in the arse.
    }

    public void run() {
        System.out.println("Dog.run() called.");
        move(15);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(speed);
        super.move(speed);
    }
}
