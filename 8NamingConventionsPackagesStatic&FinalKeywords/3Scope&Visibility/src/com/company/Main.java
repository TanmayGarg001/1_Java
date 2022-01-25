package com.company;

public class Main {
    //Scope refers to the visibility of a class, method or variable etc.
    public static void main(String[] args) {
        //Let's say you want to buy a GPU from a local store. Store A is giving you that gpu at 30k and store B is having a discount on the same GPU of 20%
        //i.e. now you get the GPU at 24k. Now the scope of the store in this scenario is local.
        //Now consider the same GPU and flipkart is selling that gpu at 30% off i.e. 21000 on holidays now the scope is on a huge level as it is visible to
        //entire India. Now if its amazon the scope is even bigger as it is Worldwide , so the scope is even bigger.
        //But important thing to keep in mind is that discount will only be available on particular website online or
        //on that particular store, its not for all the stores/websites worldwide.

        //So java object have scope in very similar way. See the example :-
        //maneuver to ScopeCheck class

        int privateVar = 50;//notice that the variable has same name as is ScopeCheck class.
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance private variable = " + scopeInstance.getPrivateVar());//as we can see here we can't access the privateVar directly
        // like we can do with the publicVar
        System.out.println(privateVar);//so here privateVar has only scope in main class.
        //Access modifiers like public,private and protected are used to limit/extend the scope.
        System.out.println(scopeInstance.publicVar);//we can do this with public variables.

        scopeInstance.timesTwo();
        System.out.println(scopeInstance.getPrivateVar());//see the answer is still 5
        // {} this is a scope.
        {
            int x = 12345;
            System.out.println(x);
        }
        // System.out.println(x);//this gives error.

        {
            {
                {
                    int y = 78;
                    System.out.println(y);
                }
                //System.out.println(y);//this also gives error as it is out of scope
            }
        }

        //Now, lets make the object of InnerClass and see the scope visibility.
        System.out.println("-----------------------------------");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("Inner class's privateVar = " + innerClass.getPrivateVar());//now we are accessing the innerClass's privateVar table.
        innerClass.timesTwo();
    }
}
