package com.company;

public class Hamburger {
    //baseHamburger = $5
    private String breadRollType;
    private boolean meat;
    private String name;
    private int lettuce;
    private int onions;
    private int capsicum;
    private int olives;
    private int basePrice;

    public Hamburger(String breadRollType, boolean meat, String name, int basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        if (meat) {
            this.name = "Non-Veg Hamburger";
        } else {
            this.name = "Veggie Hamburger";
        }
        this.lettuce = 0;
        this.onions = 0;
        this.capsicum = 0;
        this.olives = 0;
        this.basePrice = 5;

    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getOnions() {
        return onions;
    }

    public int getCapsicum() {
        return capsicum;
    }

    public int getOlives() {
        return olives;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void addItems(){

    }
}
