package com.company;

public class Main {

    //Major updates that Java8 got are:-
    //Functional Programming,lambda expressions and Stream API.
    //Now we are able to define methods in interface.

    public static void main(String[] args) {
        //Stream API makes sure to achieve functional programming and concurrency. Here we have to focus what to do instead of how to do it.
        System.out.println("Hey");
        //Now before java8 interfaces were used to declare methods, abstract was used to declare and implement some methods.These declared methods must be overridden by
        //implementing or inheriting class.So all the methods of interface were public abstract.
        //Classes were used to implement methods.
        //We can implement multiple interfaces but a single abstract class or normal class only.
        //Consider List interface before Java 8 it had many methods like get(),set(),remove() etc.But stream API added some new methods to it
        //But let's say you are working on a project that uses version less than JAVA8 and you are making a new type of List by inheriting List interface and providing
        //all functionalities by overriding that method. Something like :- public class Main implements List.
        //As stream API added new methods to List interface it would produce an error and break code everywhere if you shift to Java8.
        //So, in order to overcome this java developers introduced that you can define methods in an interface by using "default" keyword.
        //Now the question arises what's the difference between an interface and abstract class?
        //We can implement multiple interfaces but a single abstract class or normal class only.
        //https://www.youtube.com/watch?v=4e_RsZWdiSc&list=PLsyeobzWxl7otduRddQWYTQezVul0xIX6&index=2
        //maneuver to Main2

        //Now if we can use multiple interfaces to implement, and now we can define methods in them too, then diamond problem will occur.
        //In order to overcome this,we must Override the default method otherwise compiler will give error.

    }

}