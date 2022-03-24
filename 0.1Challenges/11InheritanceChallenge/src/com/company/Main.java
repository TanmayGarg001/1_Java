package com.company;

public class Main {

    public static void main(String[] args) {
        Porsche myPorsche = new Porsche("Porsche 911 GT2 RS", 330, 15, "Aluminium-red", 1, 4, 6,
                "Porsche", 4, "911 GT2 RS", 515, 350000, 5);

        System.out.println(myPorsche.getEngineHorsePower());
        System.out.println(myPorsche.getPrice());
        System.out.println(myPorsche.getCurrentGear());
        myPorsche.changingGears(5);
        myPorsche.changingGears(6);


    }
}

