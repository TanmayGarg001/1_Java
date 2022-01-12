package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //arrays
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        //array lists
        ArrayList<Integer> integerArrayList = new ArrayList<>();//We know that array lists can only be made of a class-type.
        //So,
        // ArrayList<int> ints = new ArrayList<>();//This gives us an error that :- type argument cannot be of primitive type.
        //To solve this , What we can do is :-
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(45));
        //This would add an object of type IntClass with the value 45 .
        //Now it would be a pain in the arse to do this everytime whilst we need an array lists of primitive types.
        //So there is a easy way to use primitive data types as an objects.
        //That is done by Wrapper Class.
        //String is a class btw.

        //So the bottom line is, for ArrayLists and lot other of other classes they are required to pass a class in them.
        //As it is very common for us to use these primitive types all the times, we can't make IntClass or somewhat similar each time and add various functionality to it.
        //Wrapper classes are used to overcome this.

        int myInteger = 69;
        Integer integer = new Integer(69);
        //The difference here bw int and Integer is that Integer is a class whereas int is a primitive type.Similarly for other primitive data types.
        ArrayList<Integer> integerArrayList1 = new ArrayList<>();//This works!

        for (int i = 0; i < 10; i++) {
            integerArrayList1.add(Integer.valueOf(i * 10));//Boxing
            //here  valueOf takes the value of i and which is in primitive type and converts in into object of Integer which is added in integerArrayList.
            //Known as Boxing
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --> " + integerArrayList1.get(i).intValue());//Unboxing
            //here intValue gets the integer value stored in the array list of type Integer and converts it back from the Integer class to the int primitive type.
            //This is called auto unboxing.
        }

        Integer myValue = 45; //new Integer(45); we can do this too but java does that automatically for us. OR it box 45 automatically, hence autoboxing.
        int myValue2 = myValue;//myValue.intValue(); we can do this too but java does that automatically for us. OR it unboxes the value of
        // myValue which is 45 here automatically, hence aut-unboxing.

        //So we don't need to every time box or unbox manually as java does that automatically.

    }


    public static class IntClass {
        private int myValue;//Here the integer myValue is wrapped around the IntClass if you see as myValue is private and cannot be accessed directly.

        public IntClass(int integer) {
            this.myValue = integer;
        }

        public int getInteger() {
            return myValue;
        }

        public void setInteger(int integer) {
            this.myValue = integer;
        }
    }
}
