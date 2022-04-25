package com.company;

public class X {
    int x;

    public void X() {

    }

    public void x(int x) {
        this.x = x;
    }

    public void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(x + " X " + this.x + " = " + (x * this.x));
        }
    }
}
