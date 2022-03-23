package com.company;

public class HealthyBurger extends Hamburger {
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
    private String healthExtra1Name;
    private double healthExtra1Price;
    private String healthExtra2Name;
    private double healthExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown");
        this.price = price;
        this.meat = meat;
    }

    public void addHealthyAddition1(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price = this.price + price;
    }

    public void addHealthyAddition2(String name, double price) {
        System.out.println("Added " + name + " for an extra " + price);
        this.price = this.price + price;
    }

    @Override
    public double itemizeHamburger() {
        return this.price+5.67;
    }
}
