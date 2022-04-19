package com.company;

import java.util.ArrayList;

public class Branch {
    String branchName;
    ArrayList<Customer> customerArrayList;

    public Branch(String branchName) {
        this.branchName = branchName;
        customerArrayList = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            customerArrayList.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        if (findCustomer(customerName) != null) {
            findCustomer(customerName).addTransaction(amount);
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName) {
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getCustomerName().equals(customerName)) {
                return customerArrayList.get(i);
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }
}
