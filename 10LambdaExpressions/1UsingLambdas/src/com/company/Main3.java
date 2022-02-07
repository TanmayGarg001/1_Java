package com.company;

public class Main3 {

    public static void main(String[] args) {

        //The reason why java developers decided to use interfaces to use lambdas instead of making a type like let's say Lambda,
        //was because of backwards compatibility.
        //It is used a lot in multithreading!
        //https://www.tutorialspoint.com/what-is-diamond-problem-in-case-of-multiple-inheritance-in-java
        //https://stackoverflow.com/questions/41257107/java-8-doesnt-provide-the-same-solution-to-allow-multiple-inheritance-which-the
        //Also, a functional interface is one which has only one abstract method in it.Abstract because we can after java8 we can declare method signature
        //in interface only.
        //So, we can have infinite default and static methods but only one abstract method for lambda
        //And we should use annotation @FunctionalInterface.
        
    }

}