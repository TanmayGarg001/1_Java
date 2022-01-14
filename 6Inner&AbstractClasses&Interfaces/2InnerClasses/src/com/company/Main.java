package com.company;

//It is possible in java to nest a class inside another class
//4 types of nested classes exists in java :- static nested classes, non-static nested classes(we call that inner class), a local class
// (that's a inner class defined inside a scope) or we could use an anonymous class(nested class without class name).

//See the example and use of inner classes in GerBox class.

public class Main {

    public static void main(String[] args) {

        //Now lets make a gearbox(all the gears to control) and then access gears(the gear that we want to use)
        Gearbox mcLaren = new Gearbox(6);
//        Gearbox.Gear first = mcLaren.new Gear(1, 10.34);//here we want new gear for our mcLaren Gearbox so we mcLaren.new to make that.

//        //Also the inner class is going to be private anyway i.e. the instance would only be created by the inner class.
//        //So we don't want to access the inner class directly anyway.
//        //But still though we can't access directly to Gear class we are still making an object of it using innerClass object.
//        //So we don't want that to happen generally as we want to change gears we should not interact with Gear class.
//        //We should interact with Gearbox and that inside should interact with Gear class and make the functionality hidden - adhering to encapsulation.
//        //This is generally good thing to do
//        //So now we will change Gear class's access modifier to private and add functionality in Gearbox class that is required by the end-user.

//        System.out.println(first.driveSpeed(15) + " kmp/h");


        //Now the new and encapsulated way of doing things is :-
        mcLaren.addGear(1, 14.254);
        mcLaren.addGear(2, 15.218);
        mcLaren.addGear(3, 16.125);
        mcLaren.addGear(4, 17.500);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(2);
        mcLaren.changeGear(4);
        mcLaren.wheelSpeed(10);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(10));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(2);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(10));

    }

}
