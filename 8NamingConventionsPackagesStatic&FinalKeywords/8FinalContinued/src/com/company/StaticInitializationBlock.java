package com.company;

public class StaticInitializationBlock {
    //Static initialization blocks is a very advanced feature and there is rarely a case to use them.
    public static final String owner;

    //declared by using static keyword followed by the actual code block itself.
    //there can be as many as you want, they are called in the same order the way you make them in the class.
    //but here second static block is written after the constructor is called which is not a good practice generally.
    static {
        owner = "Tanmay";
        System.out.println("Static initialization block called.");
    }

    public StaticInitializationBlock() {
        System.out.println("Static initialization constructor called.");
    }

    static {
        System.out.println("Second Static initialization block called.");

    }

    public void someMethod(){
        System.out.println("Some method called.");
    }
}
