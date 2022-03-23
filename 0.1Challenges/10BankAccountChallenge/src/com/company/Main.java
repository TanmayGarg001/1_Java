package com.company;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setAccountNumber("Tan-6284-2001");
        myAccount.setBalance(45000);
        myAccount.setEmail("timmyboi@gmail.com");
        myAccount.setPhoneNumber("6284886465");
        myAccount.setCustomerName("Tanmay Garg");

        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getEmail());
        System.out.println(myAccount.getPhoneNumber());
        myAccount.addFunds(5000);
        System.out.println(myAccount.getBalance());
        myAccount.withdrawFunds(15000);
        myAccount.withdrawFunds(15000);
        myAccount.withdrawFunds(20000);
        myAccount.withdrawFunds(1);



    }
}
