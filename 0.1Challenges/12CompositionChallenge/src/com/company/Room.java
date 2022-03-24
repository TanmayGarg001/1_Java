package com.company;

public class Room {
    private Door door;
    private Table table;
    private AC ac;

    public Room(Door door, Table table, AC ac) {
        this.door = door;
        this.table = table;
        this.ac = ac;
    }

    private void openDoor() {
        door.openDoor();
    }

    public Table getTable() {
        return table;
    }

    public AC getAc() {
        return ac;
    }
}
