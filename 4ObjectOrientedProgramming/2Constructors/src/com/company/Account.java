package com.company;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Here is how we create a constructor :-
    //Constructor does not have any return type coz it is initializing the fields
    //Constructors can be overloaded
    public Account() {
        this("accountNumber", 0, "NameOfTheCustomer", "emailid@gmail.com", "xxxxx-xxxxx");
        //this initializes the values for fields if an empty constructor is used.
        //basically "this" is calling the another constructor within itself.
        //So constructor calling other constructor
        System.out.println("Empty constructor called!");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        //We can call setters here only to check for validations and such but as a general rule it is not recommended to do that
        // (coz in some scenarios setters code won't be executed),
        //So initialize the fields by using this keyword.
        //only call another constructor and initialize fields using this keyword inside the constructors
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addFunds(double amount) {
        balance = balance + amount;
        System.out.println("Net Balance = $" + balance);
    }

    public void withdrawFunds(double amount) {

        if (balance - amount < 0) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - amount;
            System.out.println("Net balance = $" + balance);
        }
    }


}
