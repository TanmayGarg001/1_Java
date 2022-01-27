package com.company;

public class ScopeCheck {
    public int publicVar = 10;
    private int varOne = 5;

    public ScopeCheck() {
        System.out.println("Private variable = " + varOne + " , Public variable = " + publicVar);
    }


    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " X 2 = " + (i * varTwo));
        }
        System.out.println(this.varOne);

    }

    public void inner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("Inner class's variable from ScopeCheck class = " + innerClass.varThree);//even works if it is private.
        //now we can't do that in main class.
    }

    public class InnerClass {
        private int varThree = 69;

        public InnerClass() {
            System.out.println("varOne = " + varOne + " varThree = " + varThree);
            //Here we printed varOne variable despite the fact that it was declared as private in the containing class.
            //So the innerClass has the access to all the member variables and fields of the containing class.It is also true the other way around.
            //even if they are marked as private.
        }
        //So, we can access both varOne and varThree in in inner and outer class.
        //What we do in general is, we often actually have a sub-class override a method from the superClass that it was in.
        //So we can override it but its not shadowed if you think about it but we can shadow a static method.

        //now as we renamed the variables the ScopeCheck class's private variable is no longer being shadowed.

        public void timesTwo() {
            System.out.println("varOne = " + varOne + " is still available here");
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " X 10 = " + (i * varThree));
            }
        }

        public int getVarThree() {
            return varThree;
        }
    }
}
//SO THIS CONFIRMS THAT THE OBJECT SCOPE IS THE BLOCK IN WHICH IT'S DECLARED INCLUDING ANY CONTAINED BLOCKS.
