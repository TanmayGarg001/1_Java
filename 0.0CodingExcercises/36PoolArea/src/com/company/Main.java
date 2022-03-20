package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println(cuboid.getWidth());
        System.out.println(cuboid.getLength());
        System.out.println(cuboid.getArea());
        System.out.println(cuboid.getHeight());
        System.out.println(cuboid.getVolume());

    }
}
