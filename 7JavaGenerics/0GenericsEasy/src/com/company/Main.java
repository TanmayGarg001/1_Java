package com.company;

// In computing, an application programming interface (API) is an interface that defines interactions between multiple software applications or
// mixed hardware-software intermediaries. It defines the kinds of calls or requests that can be made, how to make them, the data formats that
// should be used, the conventions to follow, etc. It can also provide extension mechanisms so that users can extend existing functionality in
// various ways and to varying degrees.An API can be entirely custom, specific to a component, or designed based on an industry-standard to
// ensure interoperability. Through information hiding, APIs enable modular programming, allowing users to use the interface independently of the implementation.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();//use <> to generalize
        list.add(7);
        list.add("sad");
        list.add(5.258);
        list.add("pop@@");
        System.out.println(list);
        System.out.print(list);
        //now this wil work as you expect,but this is not how we do it.Java is a type-safe lang.
        //That is we should specify the data type / object type we are using .
        //As the type of the value is known at the compile time itself its faster and less ambiguous and less prone to errors.
        //In languages like javaScript and python we wait till the runtime to get the value of the type and then assign the type to it.

        //In a nutshell,
//        The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. It makes the code stable by detecting the bugs at compile time.
//        Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.
//        There are mainly 3 advantages of generics. They are as follows:
//        1) Type-safety: We can hold only a single type of objects in generics. It doesn't allow to store other objects.
//        Without Generics, we can store any type of objects.
//        2) Type casting is not required: There is no need to typecast the object.
//        Before Generics, we need to type cast.
//        3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime.
//        The good programming strategy says it is far better to handle the problem at compile time than runtime.
//          link to an awesome video:- https://www.youtube.com/watch?v=BsBK3UZ0RGM
//        https://www.youtube.com/watch?v=h7piyWnQbZA

        //Mostly we don't make generics by ourself but we rather use the built in generics that java provides us.
    }
}
