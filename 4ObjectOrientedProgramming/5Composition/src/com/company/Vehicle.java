package com.company;

//INHERITANCE IS WHEN THERE EXISTS "IS-A" RELATIONSHIP. WHEREAS IN COMPOSITION THERE IS "HAS-A" RELATIONSHIP.
//A Mustang "is a Car". A horse "is a animal".
//An animal "has a tail". A car "has a engine".
//Inheritance involves "is a" characteristics, and Composition involves "has a" members.
//But how this translates to program code depends entirely upon how you write the code. If you make a serial number a field in a class called Vehicle,
//then all cars and trucks which are sub-classed would inherit that field. Thus you would have inheritance. If, however, you decided to make the
// serial number its own class, then serial number would be included as a member variable of the Vehicle class. That is when you would have composition.
//But as a result, when Vehicle is sub-classed, those sub-classes would inherit the serial number from Vehicle.

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

}
