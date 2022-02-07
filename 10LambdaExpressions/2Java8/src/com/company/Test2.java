package com.company;

public interface Test2 {
    void simple();

    void simple2();

    default void show() {
        System.out.println("Tes2!");
    }

//    default boolean equals(Object o) {
//        return false;
//    }
    //this will give error because it is defined in java.lang.Object or Object class.and interface can't override a class's method it coz it has less priority than a class.
}
