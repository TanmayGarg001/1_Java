package com.company;

class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}

class Sparrow extends Bird {
//    public void sing() {
//        System.out.println("chirp chirp chirp");
//    }
}

class Parrot extends Bird {
    public void sing() {
        System.out.println("Copies you...");
    }
}


public class Main {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.sing();

        Parrot parrot = new Parrot();
        parrot.sing();
        //This is polymorphism java decides what method to run here in this case based on the priority in the case of parrot overridden method is run,
        //whereas in sparrow parent class's method is being run as sparrow is extending from it.
        //This is a super useful feature as we don't have to check or create some sort of switch statements or etc.

        //Polymorphism:-Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
        // Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
        // Polymorphism uses those methods to perform different tasks.
    }
}
