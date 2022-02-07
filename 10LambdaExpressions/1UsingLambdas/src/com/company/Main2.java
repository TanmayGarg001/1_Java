package com.company;

interface MyLambda {
    void damn();
//void dan();//uncomment this and ambiguity arises.
//Multiple non-overriding abstract methods found in interface com.company.MyLambda
//So to overcome that we create a new interface and just make method signature and bam you can use lambda functions now!
}

interface Add {
    int add(int a, int b);//signature matches :D
}

public class Main2 {

    public static void main(String[] args) {
        MyLambda s = () -> System.out.println("HOLY MOLY!");//all we have to do is match signature
        Greeting sg = () -> System.out.println("HOLY MOLY!");//all we have to do is match signature
        Add n = (int a, int b) -> a + b;//all we have to do is match signature
    }

}