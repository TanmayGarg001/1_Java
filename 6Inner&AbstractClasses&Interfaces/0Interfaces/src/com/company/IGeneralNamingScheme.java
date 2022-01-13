package com.company;

//keyword we use here is interface
public interface IGeneralNamingScheme {
    //    void hi(){
//        System.out.println("This won't work!");
//    };
//    This will give you an error!, as methods in interfaces can't have a body till JAVA8.
//    After that they can by using default keyword , and again prone to diamond problem, but can be overridden by using super class.
    default void hi() {
        System.out.println("This works!");//generally try no to make default methods in interfaces. Use them for class outlining.
    }

    //Now let's make  the real interface!. Go to the ITelephone interface to see how we should really use them!

}
