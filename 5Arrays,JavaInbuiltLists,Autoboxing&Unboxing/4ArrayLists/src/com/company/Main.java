package com.company;

//     THIS IS SIMILAR TO PREVIOUS BUT THIS IS A WHOLE APPLICATION WHICH TAKES DATA FROM USER ITSELF.

import java.util.Scanner;

public class Main {
    //When a variable is declared with final keyword, its value can’t be modified,
    // essentially, a constant. This also means that you must initialize a final variable

    private static final Scanner scanner = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean isLooping = false;
        int choice;
        printInstructions();

        while (!isLooping) {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                default:
                    System.out.println("Quiting Application...");
                    isLooping = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("#0 ==> To print the instructions.");
        System.out.println("#1 ==> Prints the Grocery List.");
        System.out.println("#2 ==> Add an item to the Grocery List.");
        System.out.println("#3 ==> Modifies an item in the Grocery List.");
        System.out.println("#4 ==> Removes an item in the Grocery List.");
        System.out.println("#5 ==> Searches for an item the Grocery List.");
        System.out.println("#6 ==> To quit the application.");
    }

    public static void printList() {
        groceryList.printGroceryList();
    }

    public static void addItem() {
        System.out.print("Enter the item name to add: ");
        scanner.nextLine();
        String itemName = scanner.nextLine();
        groceryList.addGroceryItem(itemName);
        System.out.println(itemName + " was added to the Grocery List.");
    }

    public static void modifyItem() {
        System.out.print("Enter the item number to be modified: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter the item number to be removed: ");
        int itemNumber = scanner.nextInt();
        groceryList.removeGroceryItem(itemNumber);
    }

    public static void searchForItem() {
        System.out.print("Enter the name of the item: ");
        scanner.nextLine();
        groceryList.searchForItem((scanner.nextLine()).toLowerCase());
    }


}
