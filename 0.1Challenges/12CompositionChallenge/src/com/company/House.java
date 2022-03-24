package com.company;

public class House {
    private Dimensions dimensions;
    private String address;
    private String typeOfHouse;
    private Room room;

    public House(Dimensions dimensions, String address, String typeOfHouse, Room room) {
        this.dimensions = dimensions;
        this.address = address;
        this.typeOfHouse = typeOfHouse;
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getAddress() {
        return address;
    }

    public String getTypeOfHouse() {
        return typeOfHouse;
    }
}
