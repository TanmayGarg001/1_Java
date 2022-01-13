package com.company;

// BY DEFAULT ALL THE FUNCTIONS IN AN INTERFACE ARE PUBLIC,STATIC,FINAL AND ABSTRACT.
// Because you have to use them so its useless to write public its by default set as public.
//If u want to make em private you have to define them otherwise you will get an error.

public interface ITelephone {

    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();

    //lets implement this interface is DeskPhone class.

}
