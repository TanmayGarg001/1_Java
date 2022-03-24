package com.company;

public class Main {

    public static void main(String[] args) {
        Table myTable = new Table(3, "Oak", "IKEA", new Dimensions(7, 5));
        Door myDoor = new Door(2, "Pine", "Hinged");
        Room myRoom = new Room(myDoor, myTable, new AC("Samsung", 4, 1000));
        House myHouse = new House(new Dimensions(250, 200), "#42 GT Street", "Concrete", myRoom);

        myHouse.getRoom().getTable().useTable();
        myDoor.openDoor();
        myRoom.getAc().powerUp();
        System.out.println(myHouse.getRoom().getAc().getStarRating());

    }
}
