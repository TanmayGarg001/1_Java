package com.company;

//TO ENABLE MULTI-INHERITANCE IN JAVA , INTERFACES ARE USED!
//ABSTRACTION IS ACHIEVED USING ABSTRACT KEYWORD AND INTERFACES IN JAVA.
//Main use of interface is, if we make an interface then we can implement multiple interfaces!So we can't extend multiple classes but we can extend multiple
//interfaces.Also it provides abstraction too as if we don't have to make the methods in the interfaces, we make them in the one which is implementing.
//DEFINITION :- AN INTERFACE DEFINES A SET OF SPECIFICATIONS THAT OTHER CLASSES "MUST" IMPLEMENT.U can get around it if u make class abstract but then you won't be able
//to make an object. And if you extend this class to other then there you have to implement all the methods.... So you can't escape from implementing those!
// BY DEFAULT ALL THE FUNCTIONS IN AN INTERFACE ARE PUBLIC,STATIC,FINAL AND ABSTRACT.
//We can't make objects of an interface as it doesn't have any constructor in it.Interfaces can have a body(after java8 this functionality was added).So after java 8
//interfaces no longer provide true abstraction as we can use default (they can if you program like that tho).
//But this will again give rise to diamond problem! So to overcome that,we have to provide the implementation of the function and use super keyword by specifying class.
//interface can extend other interfaces too but can't extend classes.
//So a interface can extend multiple interfaces,A class can extend only one class but a class can implement multiple interfaces.

public class Main {
    //AN INTERFACE IS AN OUTLINE FOR A CLASS
    //interfaces specify only what the class is doing, not how it is doing it.
    //The problem with multiple inheritance is that two classes may define different
    //ways of doing the same thing, and the subclass can't choose which one to pick

    //    Suppose I have one class, which is a Toaster, and another class, which is NuclearBomb. They both might have a "darkness" setting.
//    They both have an on() method. (One has an off(), the other doesn't.) If I want to create a class that's a subclass of both of
//    these...as you can see, this is a problem that could really blow up in my face here.
//
//    So one of the main issues is that if you have two parent classes, they might have different implementations of the
//    same feature — or possibly two different features with the same name, as in my instructor's example. Then you have to deal
//    with deciding which one your subclass is going to use. There are ways of handling this, certainly — C++ does so — but the designers of Java
//    felt that this would make things too complicated.
//
//    With an interface, though, you're describing something the class is capable of doing, rather than borrowing another class's method of doing something.
//    Multiple interfaces are much less likely to cause tricky conflicts that need to be resolved than are multiple parent classes.
//    TO LEARN MORE :- https://www.geeksforgeeks.org/java-and-multiple-inheritance/
//    https://www.youtube.com/watch?v=xJ2rCeDtyyk
//    https://www.youtube.com/watch?v=zSX7N5MolB8
//    https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/3705710#questions/10862990

    public static  void main(String[] args) {
        //We can do ITelephone instead of DeskPhone but we can't make an object of that ofc.
        //DeskPhone deskPhone = new DeskPhone(154622183, true);

        ITelephone timmyPhone;//Here we did this like this instead of eskPhone deskPhone = new DeskPhone(154622183, true) to differentiate the good old class-objects
        // and the interfaces.More on this later.
        timmyPhone = new DeskPhone(123456, true);
        timmyPhone.answer();

        MobilePhone timmyMobilePhone = new MobilePhone(46541001);
        timmyMobilePhone.powerOn();
        timmyMobilePhone.answer();
        //SEE THE IMAGE TO GET TO KNOW WHY THIS ALL HAPPENS!

        //after this maneuver to the next project to see the power and how useful interfaces actually are!

    }

}
