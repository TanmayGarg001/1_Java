package com.company;

import java.util.ArrayList;

public class GroceryList {
    private final int[] myArray = new int[50];//this is how we made array and we declare how much space we want in memory.
    private final ArrayList<String> groceryList = new ArrayList<>();//Here there are indexes but we don't have to worry about them! as it does all that stuff internally!
    //this is how array list is made.It is of objects unlike array which was of primitive data type although it can store objects.
    //Also array lists is a class so there's a constructor at its end.

    public void addGroceryItem(String itemName) {
        groceryList.add(itemName);//here the functionality of adding the value at what place and allocating it in memory is abstracted from you :)
        //THIS IS THE POWER OF JAVA AS YOU DON'T HAVE TO WORRY ABOUT ALL THAT STUFF ,IT DOES EVERYTHING FOR YOU IN AS EFFICIENT WAY AS POSSIBLE.
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list :");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item #" + (i + 1) + " = " + groceryList.get(i));
        }
    }

    public void removeGroceryItem(String itemName) {
        groceryList.remove(itemName);
        System.out.println("Grocery item : " + itemName + " was removed!");
    }

    public void modifyGroceryItem(int index, String newItemName) {
        groceryList.set(index - 1, newItemName);
        System.out.println("Grocery item " + (index) + " is modified!");
    }

    public void removeGroceryItem(int index) {
        String itemRemoved = groceryList.get(index - 1);
        groceryList.remove(index - 1);
        System.out.println("Grocery item : " + itemRemoved + " was removed!");
    }

    public void searchForItem(String itemName) {
        boolean checkItem = groceryList.contains(itemName);//Literally with one fucking line of code we're able to search the list and it so much optimized too!
        //we can do manually with using linear search i.e. looping and checking each item but time complexity rises to O(n). Hence not optimized!
        if (checkItem) {
            System.out.println(itemName + " was found at : " + groceryList.indexOf(itemName) + " in the Grocery List.");//KABOOM ARRAYLISTS ARE FUCKING GREAT!
        } else {
            System.out.println(itemName + " was not found in the Grocery List.");
        }
    }
}
