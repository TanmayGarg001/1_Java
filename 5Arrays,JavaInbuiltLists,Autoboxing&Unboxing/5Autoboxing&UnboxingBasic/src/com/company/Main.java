package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 5;//primitive data type
        Integer ii = new Integer(5);//object created, here ii is a reference
        //We have wrapper classes for all the primitive types.
        //Java is purely OOP !!.
        Integer test = new Integer(i);
        //Here we're putting a primitive value inside an object. This is called boxing.
        //And in java its also known as wrapping.
        Integer test2 = new Integer(7);
        //Now lets say I want value store in j value of test,
        int j = test2.intValue(); // here we have to refer to the value of the object in order to get the value.
        //We can do that directly too but that's not how it really works, Java does that fetching automatically for us.
        //This concept when we're getting the value from object is called unboxing or unwrapping in java.

        //Now see this,
        Integer xd = 5;//here java makes new Integer object for us itself so as it does that automatically it is called AutoBoxing.
        //Similarly,
        int y = xd;//here java does the fetching by using intValue() method automatically so its called Auto-Unboxing.

        //But when it comes to speed primitive data types works faster than creating an object (here using Wrapper Class).
        //So why even learn Wrapper classes??Right?
        //Well the reason is there are certain frameworks in java that does not support primitive data types so you have to make objects and classes in them every time
        //and there autoboxing and auto-unboxing becomes quite handy.

        String weight = "80";
        int kgs = Integer.parseInt(weight);//BOOM! use of wrapper classes.

    }
}
