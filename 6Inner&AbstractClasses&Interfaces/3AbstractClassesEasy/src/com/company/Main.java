package com.company;

public class Main {
    //Abstraction basically means to reduce the complexity
    //Same tv and remote example, Remote has lot of buttons but the user presses volume up button and tv's volume go high.
    //The user doesn't care what is happening and how it is happening.So we abstract that from the user end.
    //So to reduce complexity from the system by using a abstract layer is called abstraction.
    //Abstraction can be achieved by abstract classes or interfaces.
    //Let's understand this by using car examples.
    public static void repairCar(Car car) {
        System.out.println("Car is repaired.");
    }

    public static void main(String[] args) {
        WagonR wagonR = new WagonR();
        Audi audi = new Audi();
        repairCar(wagonR);
        repairCar(audi);
        //Now in Car class (in general) we don't define accelerate or applyBreak because it is a car and each car has different implementation
        //A car object itself has no meaning the model that extends car does have a meaning.
    }
}
//So,now we can't make a car object on here.Complexity reduced :)

//WHAT IS THE DIFFERENCE BETWEEN ABSTRACTION AND ENCAPSULATION ?? THINK ABOUT IT...
//BOTH ARE USED FOR DATA HIDING AT SURFACE LEVEL.

//ENCAPSULATION IS DONE DUE TO SECURITY REASONS,SO THAT NO UN-AUTHORIZED ACCESS IS AVAILABLE TO THE CLASS'S VARIABLE,
//BUT IN ABSTRACTION WE ARE USING TO REDUCE COMPLEXITY,THAT IS A NORMAL USER DOES NOT KNOW HOW THE SYSTEM IS WORKING INSIDE AND DOESN'T CARE.
//ABSTRACTION WORKS AT A DESIGN LEVEL NOT IMPLEMENTING LEVEL.
//SEE THE IMAGE
