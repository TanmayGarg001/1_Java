package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//SEE THE IMAGE THAT WE ARE TRYING TO IMPLEMENT USING MAP.

public class Main {
    private static final Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //making all the locations
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        //adding exists to all the locations
        locations.get(1).addExists("N", 5);
        locations.get(1).addExists("W", 2);
        locations.get(1).addExists("S", 4);
        locations.get(1).addExists("E", 3);

        locations.get(2).addExists("N", 5);
        locations.get(2).addExists("S", 1);

        locations.get(3).addExists("W", 1);

        locations.get(4).addExists("N", 1);
        locations.get(4).addExists("W", 2);

        locations.get(5).addExists("S", 1);
        locations.get(5).addExists("W", 2);

        int loc = 1;
        //now you can hard code the values like NORTH, WEST, EAST, SOUTH etc. but what about the phrases like "i'm gonna go north".
        //So, these are infinite.Hence, we need to make a work around this somehow.

        //Lets make a map which will store the basic commands that we need to search for if the user input is more than one word(like:- n,w,s,e)
        Map<String, String> opExits = new HashMap<>();
        opExits.put("NORTH", "N");
        opExits.put("EAST", "E");
        opExits.put("WEST", "W");
        opExits.put("SOUTH", "S");
        opExits.put("QUIT", "Q");

        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExists();
            System.out.println("Available exits are :- ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            //Split method is fucking overPowered dude!
            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (opExits.containsKey(word)) {
                        direction = opExits.get(word);
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
