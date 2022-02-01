package com.company;

import java.util.HashMap;
import java.util.Map;

//Immutable classes are nothing but a simple class that we are used to make but we make them more nad more encapsulated.

public class Location {

    private final int locationID;
    private final String description;

    private final Map<String, Integer> exists;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        exists = new HashMap<>();//we can make a parameter in constructor of a map type and just assign exits to that so that we won't need addExists method.
        exists.put("Q", 0);//for quitting
    }

    public void addExists(String direction, int location) {
        exists.putIfAbsent(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    //Till here all the program we wrote was defensive in nature i.e. private and public or scope and visibility were hidden and exposed only when they were required to.
    public Map<String, Integer> getExists() {
        return new HashMap<>(exists);
        //Here instead of returning the exists which is private final we are returning a new instance of it which is exactly the same but a New map with same values.
        //i.e. im not exposing the original exists to the user.
        //to understand further maneuver to Random class.
    }

}
