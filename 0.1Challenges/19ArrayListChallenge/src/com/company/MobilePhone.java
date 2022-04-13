package com.company;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> contactArrayList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactArrayList.add(contact);
    }

    public void printContactList() {
        System.out.println("There are " + contactArrayList.size() + " contacts in your mobile phone.");
        for (int i = 0; i < contactArrayList.size(); i++) {
            System.out.println("\nContact #" + (i + 1) + ":");
            System.out.println("Name: " + contactArrayList.get(i).getContactName());
            System.out.println("Phone Number: " + contactArrayList.get(i).getContactNumber());
        }
    }

    public int queryContact(String contactName) {
        for (int i = 0; i < contactArrayList.size(); i++) {
            if (contactArrayList.get(i).getContactName().toLowerCase().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public int removeContact(String contactName) {
        int i = queryContact(contactName);
        if (i >= 0) {
            contactArrayList.remove(i);
            return 1;
        } else {
            return -1;
        }
    }

    public void modifyContact(String oldContact, String newContactName, String phoneNumber) {
        int i = queryContact(oldContact);
        Contact updatedContact = new Contact(newContactName, phoneNumber);
        contactArrayList.set(i, updatedContact);
    }

}