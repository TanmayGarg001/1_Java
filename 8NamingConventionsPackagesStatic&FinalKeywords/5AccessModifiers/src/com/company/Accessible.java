package com.company;
//Challenge:-
//what is the visibility of :-
//1. the Accessible interface.
//2. methodA();
//3. methodB();
//4. methodC();

interface Accessible {//here it is package private
    int SOME_CONSTANT = 100;//all variable in interfaces ar eby default public static final

    //all the methods are public none is package - private.
    public void mathodA();

    void mathodB();

    boolean mathodC();
}
