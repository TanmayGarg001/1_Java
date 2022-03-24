package com.company;

public class Table {
    private int numberOfTables;
    private String material;
    private String manufacturer;
    private Dimensions dimensions;

    public Table(int numberOfTables, String material, String manufacturer, Dimensions dimensions) {
        this.numberOfTables = numberOfTables;
        this.material = material;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
    }

    public void useTable() {
        System.out.println("Table " + material + " made by " + manufacturer + " is used.");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
