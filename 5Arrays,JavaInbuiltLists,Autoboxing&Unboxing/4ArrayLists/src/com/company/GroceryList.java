package com.company;

import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList = new ArrayList<>();
    //When a variable is declared with final keyword, its value can’t be modified,
    // essentially, a constant. This also means that you must initialize a final variable

    public void addGroceryItem(String itemName) {
        groceryList.add(itemName);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list :");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item #" + (i + 1) + " = " + groceryList.get(i));
        }
    }

//    public void removeGroceryItem(String itemName) {
//        groceryList.remove(itemName);
//        System.out.println("Grocery item : " + itemName + " was removed!");
//    }

    public void modifyGroceryItem(int index, String newItemName) {
        groceryList.set(index, newItemName);
        System.out.println("Grocery item " + (index + 1) + " has been modified!");
    }

    public void removeGroceryItem(int index) {
        String itemRemoved = groceryList.get(index - 1);
        groceryList.remove(index - 1);
        System.out.println("Grocery item : " + itemRemoved + " was removed!");
    }

    public void searchForItem(String itemName) {
        boolean checkItem = groceryList.contains(itemName.toLowerCase());
        if (checkItem) {
            int index = groceryList.indexOf(itemName);
            System.out.println(itemName + " was found at : " + (index + 1) + " in the Grocery List.");
        } else {
            System.out.println(itemName + " was not found in the Grocery List.");
        }
    }


}
