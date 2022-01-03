package com.company;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account();//default constructor is created by java but its empty
        myAccount.setAccountNumber("Tan-6284-2001");
        myAccount.setBalance(45000);
        myAccount.setEmail("timmyboi@gmail.com");
        myAccount.setPhoneNumber("6284886465");
        myAccount.setCustomerName("Tanmay Garg");
        //Now doing this again and again for each and every customer would be a pain in the ass.
        //So we use constructors , these helps us to initialize fields for a object whilst its being created!
        //Maneuver to account class to learn how to create a constructor
        //Like this :-

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
        System.out.println("--------------------------------------------------------");
        Account anotherAccount = new Account("TIM-007-1982", 80000, "Timothy", "timmiboi@gmail.com", "2345678104");
        System.out.println(anotherAccount.getPhoneNumber());
        System.out.println(anotherAccount.getEmail());
        System.out.println(anotherAccount.getCustomerName());
        System.out.println(anotherAccount.getBalance());
        System.out.println(anotherAccount.getAccountNumber());

        VipCustomer vipCustomer1 = new VipCustomer("bob", 45);
        VipCustomer vipCustomer2 = new VipCustomer("tim", 500, "myemail@random.com");
        VipCustomer vipCustomer3 = new VipCustomer();
        System.out.println("*************************************");
        System.out.println(vipCustomer1.getEmail());
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println("*************************************");
        System.out.println(vipCustomer2.getEmail());
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println("*************************************");
        System.out.println(vipCustomer3.getEmail());
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getCreditLimit());


    }
}
