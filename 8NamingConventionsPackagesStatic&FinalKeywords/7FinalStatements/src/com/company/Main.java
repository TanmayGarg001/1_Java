package com.company;

public class Main {
    public static void main(String[] args) {
        //final fields are sort of constant values,not strictly constant tho.
        //can be changed but only once before the class constructor finishes. i.e. we can assign a final field its value either when we first declare it, or in the constructor.
        //Maneuver to FinalTest class.

        FinalTest one = new FinalTest("one");
        FinalTest two = new FinalTest("two");
        FinalTest three = new FinalTest("three");


        //After running the code you can see that unlike the previous project (6StaticStatements), we had a getter for the static field which resulted in the same value
        //no matter whichever class that was recorded on.
        //But here we are storing the incremented static value in a class field, so each instance of a class will maintain its own unique value for instanceNumber.
        System.out.println(two.getInstanceNumber());
        System.out.println(one.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        //As you can see the input comes 2 and 1 rather than 3 so the value is sort of a ID to that particular object of the class.
        //So by making instance number final, the value can't be changed once class instance has been created.
        //And we attempt to do that code will not compile and throw error:- cannot assign a value to final variable instanceNumber
        //  one.instanceNumber=5;  //this will give that error

        //Now many times we make value static final, that are generally written in UPPER_CASE these types of values are purely constant as once they are assigned the value,
        //they can never ever be changed, we might need these types of values in like let's say planck's constant, earth's radius etc etc.
        //So if the value is constant and won't change, then it doesn't make sense to store that value in each class instance as they all hold the same value.
        //So it makes sense to store that only once at class level.So we declare them as static final.
        //Some of the examples in java that we used are in Math package:-
        System.out.println(Math.PI);//these is constant value i.e. static final

        // Math math = new Math(); //we can't do this!
        //As all Math class methods are static and fields are static final too.So we don't require to instantiate it! That's pretty epic if you think about it :D
        //Also you may think ill just create a sub-class in Math or you might think of extending it and than instantiate it.
        //But Math class itself is also final! :D haha
        //So making class as final it prevents the class to be sub-classed further.
        System.out.println("==========================");
        Password timmy = new Password(154223);
        timmy.storePassword();
        timmy.letMeIn(154220);
        timmy.letMeIn(154223);
        //this is an example why we would want some of our methods to be overridden.
        //Cryptography is a really complex subject and prefer using pre-existing libraries for that matter.
        //So the problems actually comes if someone overrides the storePassword method in a subClass, so see the next project in which we extend that from class.

    }
}
