package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================");
        Password timmy = new ExtendedPassword(154223);
        timmy.storePassword();//boom overridden
        //to resolve this matter make storePassword as final
        timmy.letMeIn(154220);
        timmy.letMeIn(154223);
        //this is an example why we would want some of our methods to be overridden.
        //Cryptography is a really complex subject and prefer using pre-existing libraries for that matter.
        //So the problems actually comes if someone overrides the storePassword method in a subClass, so see the next project in which we extend that from class.
        //Now how can we prevent someone that if someone is extending this class and then changing that method itself.
        //Maneuver to ExtendedPassword class to learn more.

        System.out.println("=====================");
        StaticInitializationBlock staticInitializationBlock = new StaticInitializationBlock();
        staticInitializationBlock.someMethod();
        System.out.println("Owner is = " + staticInitializationBlock.owner);
        //here you can see all static bocks are called before the constructor.
        //And they're called before any non-static methods including the constructor.

    }
}
