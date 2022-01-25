package com.company;
//By default variables are declared private

public class ScopeCheck {
    public int publicVar = 10;
    private int privateVar = 5;

    public ScopeCheck() {
        System.out.println("Private variable = " + privateVar + " , Public variable = " + publicVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2;//so privateVar is local to this method only and after it has served its purpose it gets destroyed.
        //and we remove this line then privateVar value would be checked outside this block and we can see that is is equal to 5 on line 6.
        //So the scope is limited to a block {}. Java keeps searching for the variable in backward manner until it finds one, if it doesn't it will give you an error.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " X 2 = " + (i * privateVar));
            //we can still get the access to privateVar = 5, by using this keyword
        }
        System.out.println(this.privateVar);

    }
    //Now the concept of scope doesn't just apply to variables, it applies to methods and classes as well.
    //Let's make an inner class.

    public class InnerClass {
        private int privateVar = 69;

        //now commenting this will lead to again value 5 at line 6
        public void timesTwo() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " X 69 = " + (i * privateVar));
            }
            System.out.println(ScopeCheck.this.privateVar);//boom access to that
        }

        public int getPrivateVar() {
            return privateVar;
        }
    }
}
