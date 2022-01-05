package com.company;

public class Main {

    public static void main(String[] args) {
        //Difference between = Reference vs Object vs Instance vs Class
        //Class is a blueprint for a house.
        //Each house you build(instantiate using new keyword) is an object also known as instance.
        //Each house you build has an address, this is known as reference.References are passed as parameters to constructors and methods.
        //An instance is a specific representation of an object. An object is a generic thing while an instance is a single object that has
        // been created in memory. Usually an instance will have values assigned to it's properties that differentiates it from other instances of the type of object.
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        //Difference between this and super keyword.
        //Keyword super is used to call parent class members(variables and methods).
        //This is used to call the current class members (variables and methods) .This is used when we have a parameter with same name as a field, so that java can
        // differentiate between them.
        //We can use this and super anywhere in the class except the static areas as it leads to compile time error(more on that later).
        //Use this() to call a constructor from another overloaded constructor in the same class.
        //this() can only be used inside a constructor, and it must be first statement in the constructor.
        //to call a parent constructor use super().
        //Java compiler by default call super() if we don't add it, and it is always no-args super(constructor without arguments).
        //The call to super must be first statement in constructor.
        //NOTE:- A CONSTRUCTOR CAN NEVER CALL BOTH this() and super() .
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        //Difference between method overloading vs overriding.
        //Method overloading is providing several methods with same names but different parameters.Method return type may or may not be same.
        //This allows us to reuse the same method but with varying number of parameters,or varying data types,or varying order of data types.
        //Overriding on the other hand reduces duplicate code and we don't have to remember multiple method names.
        //Usually overloading happens in the same class but it can be done in other class if that class extends to the other.
        //Overriding is also known as Compile time polymorphism or Dynamic method dispatch although it has nothing to do with polymorphism(more on this later.)
        //Whilst overriding a method you should write @Override immediately above the method definition .This annotation is read by the compiler and it will show us
        //error if we don't follow the overriding rules correctly.
        //Only instance methods can be overridden, whereas static and instance methods can be overloaded.
        //Overridden method can't have a lower access modifier.Only inherited methods can be overridden.
        //Overloaded methods can have different return types/different access modifiers/throw different exceptions.
        //Overriding methods must have same name and same parameters unlike overloaded methods which can have different parameters.
        //NOTE:- CONSIDER PICTURE IN SRC FOLDER OF 4MoreOOPS FOR A TABLE COMPARISON.
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        //Difference between static and instance methods and variables.
        //static methods are declared using keyword static modifier and they can't access instance methods and variables directly.We can't use this keyword inside static methods.
        //Instance methods belong to instance of a class i.e. we need to instantiate the class by using a new keyword.
        //Instance methods can access instance as well as static methods and variables directly.
        //Consider the photos to understand more and when to choose which type of method.
        //Static variables are declared using keyword static, if change is made to a static variable all are instances will see the effect of the change.
        //That's why we don't generally use them. But they can be useful in some situations like whilst using scanner.
        //Instance variable has its own copy of an instance variable and can have a different state(value).

    }
}
