package com.company;

public class Motherboard {
    private int ramSlots;
    private int carSlots;
    private String model;
    private String manufacturer;
    private String bios;

    public Motherboard(int ramSlots, int carSlots, String model, String manufacturer, String bios) {
        this.ramSlots = ramSlots;
        this.carSlots = carSlots;
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + ",is now loading...");
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCarSlots() {
        return carSlots;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBios() {
        return bios;
    }

}
