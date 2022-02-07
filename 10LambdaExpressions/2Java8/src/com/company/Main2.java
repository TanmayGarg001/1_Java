package com.company;

public class Main2 implements Test2, Test1 {

    public static void main(String[] args) {
        Test1 s = new Test1() {
            @Override
            public void simple() {

            }

            @Override
            public void simple2() {

            }
        };

        Test1.powerfulAsFuck();//This is godlike as we can declare static methods in interface we don't have to create an object to do that now!
    }

    //    public boolean equals(Object o) {
//        return false;
//    }
//this will work because a class can overwrite the method of other class!But an interface can't coz of priority.
    @Override
    public void simple() {

    }

    @Override
    public void simple2() {

    }

    @Override
    public void show() {
        System.out.println("Main2");
    }


    //Now if we have one more class say C which has method show() and Main2 class implements Test1,Test2 interface and extends class C, then if we call show(),
    //Which show will get executed??
    //In this case Class's method will get executed because it's preference/priority  is higher than default method in interface.

}
