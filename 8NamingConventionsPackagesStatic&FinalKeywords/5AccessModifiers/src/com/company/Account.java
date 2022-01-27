package com.company;

import java.util.ArrayList;

public class Account {
    private String customerName;
    private int netBalance = 0;
    private ArrayList<Integer> transactions;

    public Account(String customerName) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
    }

    public int getNetBalance() {
        return netBalance;
    }

    public void depositFunds(int amount) {
        if (amount > 0) {
            this.transactions.add(amount);
            netBalance = amount + netBalance;
            System.out.println(amount + " was added to the account.\nNet Balance = " + netBalance);
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public void withdrawFunds(int amount) {

        if (amount > 0) {
            int net = netBalance;
            netBalance = netBalance - amount;
            if (netBalance > 0) {
                int temp = -amount;
                this.transactions.add(temp);
                System.out.println(amount + " was withdrawn from the account.\nNet Balance = " + netBalance);
            } else {
                System.out.println("Insufficient funds!");
                netBalance = net;
                System.out.println("Balance = " + netBalance);
            }
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public void calculateBalance() {
        this.netBalance = 0;
        for (int i : transactions) {
            this.netBalance = this.netBalance + i;
        }
        System.out.println("Net Balance in " + this.customerName+"'s account" + " = " + netBalance);
    }

}
