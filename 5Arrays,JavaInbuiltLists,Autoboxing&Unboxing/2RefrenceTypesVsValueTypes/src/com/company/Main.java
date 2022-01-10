package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println(myIntValue);
        System.out.println(anotherIntValue);
        anotherIntValue++;
        System.out.println(myIntValue);
        System.out.println(anotherIntValue);
        //This works as expected. No when we created an int variable a single space in memory is allocated to store the value in the memory.
        //And the variable directly holds that value.Now when we assign that to other variable, the value is copied directly and both the
        //variables are independent of each other.

        //BUT REFERENCE TYPES WORKS DIFFERENTLY.(like arrays or classes)
        //When we use a new keyword that means we're creating a new object :-
        int[] myArray = new int[5];
        //Here we have 5 elements and we have a variable in this case a "reference" myArray.So reference holds a reference or the address of the object
        // but not the object itself!
        //So myArray holds a reference or address of myArray in memory
        //Here is an example (It is really important!)
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        //Here we are declaring another reference to the same array in memory!
        //So these both points to same array in memory.
        //New keyword is used to create a new reference in the memory.
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
        //Now here's the stuff or thing that really makes you understand wtf is happening
        anotherArray[2] = 45;
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
        //KABOOM changing index 2 of anotherArray also changed the index of myIntArray coz of the fact they are pointing to the same address in memory.
    }
}
