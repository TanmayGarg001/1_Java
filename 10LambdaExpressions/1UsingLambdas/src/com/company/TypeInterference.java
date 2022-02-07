package com.company;
@FunctionalInterface
interface StringLengthLambda {
    int getLength(String s);
    static void ss(Boolean k,boolean ss){
        System.out.println();
    };
}

public class TypeInterference {

    public static void main(String[] args) {
        StringLengthLambda stringLengthLambda = s -> s.length();//we could have done something like:- (String s)->s.length();
        //but compiler knows that we require a string because of interface.
        System.out.println(stringLengthLambda.getLength("HelloThere!"));
        print(s -> s.length());
        //this is type interference as compiler is interfering a lot of code itself
    }

    public static void print(StringLengthLambda l) {
        System.out.println(l.getLength("Hello"));
    }

}
