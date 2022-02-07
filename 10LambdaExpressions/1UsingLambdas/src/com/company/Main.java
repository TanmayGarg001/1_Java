package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("TimmySavage!");//Here as we can see a simple instruction like this has to be enclosed in a class as java is a OOP lang.
        //What if I don't want that?See the Greeter class.

        //Lambdas let you do that, they are not a function of any class! So they are functions which exists in isolation.
        //And they can be used as values.How?
        //To understand this, consider In-line values like:-
        String name = "temp";//in line variable which assign the value to the variable name
        double pi = 3.14;//in line variable which assign the value to the variable name
        //So we know that data acts as values in java we can assign it to variables or types.
        //Similar objects can be instantiated and further assigned to a variable.
        //Now this is going to blow your mind:-
        //Can we assign a block of code to a variable as a value.So the value is not the execution of the block of the code,it is the block of code itself!
        //now wherever that variable goes a piece of code goes with it :D
        //In order to achieve something like this wait we can do is we can create a void method and put some instructions in it.
        //Like this:-
        //    public static void printStuff() {
        //        System.out.println("Hello");
        //        System.out.println("Random");
        //        System.out.println(5 + 121);
        //    }
        //Now imagine we could take a method and assign that to a variable...
        //And again we are not saying that execute the method and assign the return to the variable but the whole method itself... Let's say to a variable name aBlockOfCode
        //now for example 'public' in method makes sense in context of a class.But if the function exists in isolation it does not make sense to call it public
        //because function is accessible by whoever has that variable.
        //now if we assign a variable to method, so we don't need the method name too here it is printStuff
        //Now we are left with this:- (static was removed because static also makes sense only in OOP environment).

        //   aBlockOfCode = void() {
        //        System.out.println("Hello");
        //        System.out.println("Random");
        //        System.out.println(5 + 121);
        //    }

        //Now if you look at this code inside method you can figure out its return type, even if I didn't tell you what its return type is.
        //Java developers could have stopped here, but they went further and pushed boundaries, The JVM is smart enough to figure out what a method is returning.
        //So we don't need to include even void! So we are left with literally a bunch of instructions assigned to variable!
        //Now we are left with something like this:-
        //         aBlockOfCode = () {
        //                System.out.println("Hello");
        //                System.out.println("Random");
        //                System.out.println(5 + 121);
        //            }
        //Now the syntax is pretty much this for lambda expression all you have to put is '->' arrow and boom we got a lambda expression!
//{} can be removed if it contains only one instruction!
//        aBlockOfCode = () -> {
//            System.out.println("Hello!");
//        };
        //See the images for how to write lambda expressions and declare their type and how to intake arguments .

    }


}
