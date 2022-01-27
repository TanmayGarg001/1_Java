package com.company;

public class Main {
    //Scope refers to the visibility of a class, method or variable etc.
    public static void main(String[] args) {
        //Objects also have visibility, so things get little bit complicated.
        int varFour = 50;
        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.inner();

        ScopeCheck.InnerClass innerClass1 = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here! = ");
        //THE REASON WE CAN'T ACCESS THAT BECAUSE varThree's GOT PRIVATE ACCESS AND THEREFORE HAS NO VISIBILITY OUTSIDE ITS CLASS OR THE ONE CONTAINING IT.
        //Make varThree to public and you will see what happens.

        System.out.println("ScopeInstance varOne = " + scopeInstance.getVarOne());

        System.out.println(varFour);
        System.out.println(scopeInstance.publicVar);

        scopeInstance.timesTwo();
        System.out.println(scopeInstance.getVarOne());

        System.out.println("-----------------------------------");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("Inner class's varThree = " + innerClass.getVarThree());
        innerClass.timesTwo();
        //Now the object's visibility is governed by the access modifiers.
    }
}
