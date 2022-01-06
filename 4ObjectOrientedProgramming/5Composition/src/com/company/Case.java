package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;
//So case has a model, it has a manufacturer and so on same for other classes this is known as composition.
    //Basically it is composed of these stuff. Like Timmy has a heart or he is composed of a heart.
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power Button Pressed.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
