package com.company;


public class Main {

    public static void main(String[] args) {
        //suppose we make an interface and we have a method that return ArrayList<String>
        //Now if we make this as List<String> ,we can use any type of list in the class that will implement this interface.
        //Also we could go even further make this as List instead of List<String>, here we abstracted again.
        //So we added extra functionality/flexibility here.
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        //Let's make a fly class in bird.But not all birds can fly so we'll make bird as an abstract class(so we can't instantiate it now).
        //And we create a new class called parrot which extends the abstract bird class.Now parrots do fly.
//        Bird bird = new Bird("Parrot");
//        bird.eat();
//        bird.breathe();

        Parrot parrot = new Parrot("Green Parrot");
        parrot.eat();
        parrot.fly();
        parrot.breathe();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}

//So an abstract class can have member variables that are inherited, something that we can't do in interface.
//Interfaces can have variables but they all are public static final i.e. constant values that should never change with a static scope.
//They have to be static because non static variables requires an instance and we can't instantiate an interface.
//Interfaces can't have constructors but abstract classes do have them.
//Also all methods in an interface have to be public,whereas abstract classes do have a visibility.
//Also we can implement from multiple interfaces but we can't extend from multiple abstract classes.