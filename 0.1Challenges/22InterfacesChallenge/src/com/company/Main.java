package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Timmy", 89, 10, "Sword");
        System.out.println(player.toString());
        saveObject(player);

        player.setHitPoints(45);
        System.out.println(player.toString());
        player.setWeapon("Ak-47");
        saveObject(player);
//        loadObject(player);
        System.out.println(player);//.toString() added by default by java

        ISavable werewolf = new Monster("WereWolf", 200, 40);
        System.out.println(werewolf);
        saveObject(werewolf);
        System.out.println(werewolf);
        //generally it depends on what we're going to do with the instance created.If we want to declare a variable that can hold different objects of different types then
        //it would have to be the type of common interface, else if you want to only access to the methods in the class use class-object only unless you want to get around that
        //using type casting.So if there is no string reason using the class type  use interfaces.
    }

    public static ArrayList<String> readValue() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        boolean quit = false;
        int index = 0;
        System.out.println("Enter 1 - To enter a string: ");
        System.out.println("Enter 0 - To exit the application: ");

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exiting Application . . . ");
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String temp = scanner.nextLine();
                    values.add(index, temp);
                    index++;
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to memory.");
        }

    }

    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValue();
        objectToLoad.read(values);
    }

}
