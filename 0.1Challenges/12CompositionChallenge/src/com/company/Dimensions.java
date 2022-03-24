package com.company;

public class Dimensions {
    private int x;
    private int y;

    public Dimensions(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getArea() {
        return x*y;
    }
}
