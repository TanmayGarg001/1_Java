package com.company;

public class Main {

    public static void main(String[] args) {

//Objects are fundamental in OOP and have 2 major characteristics state and behaviour, for example
// :- computer has a Ram,Storage,CPU,OS etc. are state and things like booting up, restarting, beeping etc. are behaviour
//******************************************************************************************************************************************************************************
//Now with same analogy software objects have state know as fields(variables) and behaviour known as method.
//Class is a blueprint or a template for creating a object.
//******************************************************************************************************************************************************************************
//Here is how we create an object or an instance of a class ,one and the same thing.

        Car porsche;//here porsche is the object.
        //But we need to initialize the class and its done like this :-
        Car honda = new Car(); //() will come in next project
        Car audi = new Car();
        //Now this alone does nothing. We have to access methods and fields i.e. object's state and behaviour to do something!
        //Let's do that
        //Car class itself has many other behaviours and states by default that are provided with java just type audi. and you will see a list of those!
        //This is done by inheritance which we'll talk about later but for now just think like Car class has inherited some methods and fields from java.
        audi.model = "Audi-A6";
        System.out.println(audi);//prints the object's address in memory.
        System.out.println(audi.model);
        //Now this way is not a good way to define model coz it violets the rule of encapsulation!
        //Now we should make sure this functionality should be restricted to Car class only!
        //To solve this problem go to next project.
    }

}
