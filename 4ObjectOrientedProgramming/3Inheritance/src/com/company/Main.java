package com.company;

public class Main {

    public static void main(String[] args) {
        //OOP allows to inherit commonly used states and behaviours from other classes.
        //Inheritance :-Inheritance can be defined as the process where one class acquires the properties
        // (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order.
        //The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose
        // properties are inherited is known as superclass (base class, parent class).

        Animal animal = new Animal("animal", 1, 1, 5, 10);
        Dog dog = new Dog("Rottweiler", 10, 25, 2, 4, 1, 32, "Furry");//here brain and body were initialized to 1 in dog class only :)

        dog.eat();
        dog.run();//Consider this and you will understand why not to use super.function() in general.
    }
}
