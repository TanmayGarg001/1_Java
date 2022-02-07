package com.company;

public interface Test1 {

    static void powerfulAsFuck() {
        System.out.println("WOHOOO!!");
    }

    void simple();

    void simple2();

    default void show() {
        System.out.println("Test1!");
    }
}
