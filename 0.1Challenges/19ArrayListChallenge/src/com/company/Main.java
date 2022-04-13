package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean isLooping = false;
        int choice;
        printInstructions();

        while (!isLooping) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    searchContact();
                    break;
                default:
                    isLooping = true;
                    System.out.println("Quiting application...");
                    break;

            }
        }

    }

    public static void addContact() {
        System.out.println("Enter the contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the contact number: ");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        mobilePhone.addContact(contact);
        System.out.println();
    }

    public static void printContactList() {
        mobilePhone.printContactList();
    }

    public static void printInstructions() {
        System.out.println("#0 ==> To print the instructions.");
        System.out.println("#1 ==> Prints the Contact List.");
        System.out.println("#2 ==> Add a contact to the Contact List.");
        System.out.println("#3 ==> Remove a contact in the Contact List.");
        System.out.println("#4 ==> Modify a contact in the Contact List.");
        System.out.println("#5 ==> Searches for an item the Contact List.");
        System.out.println("#6 ==> To quit the application.");
    }

    public static void searchContact() {
        System.out.println("Enter the contact name to find: ");
        String contactName = scanner.nextLine().toLowerCase();
        int i = mobilePhone.queryContact(contactName);
        if (i != -1) {
            System.out.println(contactName + " was found at : " + (i + 1) + " in the Contact List.");
        } else {
            System.out.println(contactName + " was not found in the Contact List.");
        }

    }

    public static void removeContact() {
        System.out.println("Enter the contact name to be removed: ");
        String contactName = scanner.nextLine();
        if (mobilePhone.removeContact(contactName) != -1) {
            System.out.println(contactName + " was removed from the contact list.");
        } else {
            System.out.println(contactName + " was not found in the Contact List.");
        }

    }

    public static void modifyContact() {
        System.out.println("Enter the contact name to be modified: ");
        String contactName = scanner.nextLine().toLowerCase();
        if (mobilePhone.queryContact(contactName) >= 0) {
            System.out.println("Enter updated contact name: ");
            String newContactName = scanner.nextLine();
            System.out.println("Enter updated contact number: ");
            String newContactNumber = scanner.nextLine();
            mobilePhone.modifyContact(contactName, newContactName, newContactNumber);
        } else {
            System.out.println(contactName + " does not exist!");
        }
    }

}