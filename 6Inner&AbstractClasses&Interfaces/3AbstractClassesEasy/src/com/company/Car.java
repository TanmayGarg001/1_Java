package com.company;

//An abstract class can have methods with or without body.Example honking in Car class.
//Normal classes can't have abstract method.

public abstract class Car {
    //So we require these functions but its useless and meaningless to define them here.
    //So we remove the body of the function here and make them abstract.i.e. we remove complexity.
    public abstract void accelerate();

    public abstract void applyBreak();
//Basically if we use abstract that means we don't have to write its implementation there, its implementation would be written in the class that extends from it.
//So, children write the implementation of it.
}
//But if we make any abstract method in a class, then we have to make the class abstract too.
//Now the BENEFIT OF DOING ALL THIS SHIT IS :-
//We can't instantiate or create an object of the  abstract class.(and if you think about it totally makes sense).
//Because car is a concept , there is no use of making it's object.
//It makes sense to make objects of its children.
//Car itself is nothing, you have to be particular about the company,model and type of car etc etc.
//So when you feel that if the parent class is a Concept and the other classes that inherits from it are
//meaningful then we should make parent class abstract to reduce complexity.Also children class would have to override the methods.