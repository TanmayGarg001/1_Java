package com.company;

public class DeluxeBurger extends Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "Roasted");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price = this.price + price;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price = this.price + price;
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price = this.price + price;
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price = this.price + price;
    }

    public double itemizeHamburger() {
        return price+19.10;
    }
}
