package com.company;

public class Main {
    public int multiplier = 7;

    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest("First Instance");
        System.out.println(staticTest1.getName() + " is instance number = " + staticTest1.getNumberOfInstances());
        StaticTest staticTest2 = new StaticTest("Second Instance");
        System.out.println(staticTest2.getName() + " is instance number = " + staticTest2.getNumberOfInstances());
        StaticTest staticTest3 = new StaticTest("Third Instance");
        System.out.println(staticTest3.getName() + " is instance number = " + staticTest2.getNumberOfInstances());
        System.out.println(staticTest1.getName() + " is instance number = " + staticTest1.getNumberOfInstances());

        //Here too it gets updated as all the instance are now sharing same static field.
        //though it is a bad practice use staticTest3 there for troubleshooting and easy to read code.
        //now if we change the numberOfInstances in StaticTest to static , you will see the change
        //also if we make methods static we don't have to make an object of the class that has that method, like this :-
        System.out.println(StaticTest.getNumberOfInstances());//here i got that directly without making a new object
        //Examples are Integer.parseInt();
        //So as a recap, static methods and fields belong to the class, not to the instance of the class and as a result of that, they can be called by referencing the
        //class name rather using a class instance each time.
        //Now if you think about it this explain why the main method that we use has to be static.
        //Because when we run a Java program there has to be an entry point, in other words a method that is executed when the program runs.
        //However, until the program runs there's no class instances to call methods on, so java has to use a static keyword there.

        //Now these 2 lines give error, think why?
        //System.out.println(multiply(6));
        //System.out.println(multiplier);
        //Now if multiplier is public why can't we access it from our main method?
        //As normal class fields requires instance of a class that don't actually exist until an instance has been created.
        //Main method is static as we can see, and it can be called with class instance.
        //So as a result java can't allow a static method to access non static fields/methods because they don't exist when the static method called.

        //Note that the reverse is not true. ofc , i.e. there is no problem at all with a non-static constructor of a StaticTest class, accessing the static numberOfInstances
        //field. And we can also call static methods form non-static ones with no problems .So there is nothing to prevent a static method to access non static fields and
        //methods in another class, because it creates an instance of a class in order to do so.
        //Restriction is on static method accessing the non-static method and fields in its own class.

    }

    public int multiply(int number) {
        return number * multiplier;
    }
}
