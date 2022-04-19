package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchArrayList;

    public Bank(String bankName) {
        this.bankName = bankName;
        branchArrayList = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branchArrayList.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addNewCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for the Branch " + branchName + " are :- ");
            ArrayList<Customer> customers = branch.getCustomerArrayList();
            for (int i = 0; i < customers.size(); i++) {
                System.out.println("Customer " + branch.getCustomerArrayList().get(i).getCustomerName() + " " + (i + 1));
                if (transactions) {
                    System.out.println("Transactions : ");
                    ArrayList<Double> doubles = branch.getCustomerArrayList().get(i).getTransactions();
                    for (int j = 0; j < doubles.size(); i++) {
                        System.out.println((i + 1) + " Amount => " + doubles.get(i));
                    }
                }
            }
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < branchArrayList.size(); i++) {
            Branch checkedBranch = branchArrayList.get(i);
            if (checkedBranch.getBranchName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }
}
