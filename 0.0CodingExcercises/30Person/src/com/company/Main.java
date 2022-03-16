package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
        person.setLastName("Smith");
        System.out.println(person.getFullName());

    }
}
