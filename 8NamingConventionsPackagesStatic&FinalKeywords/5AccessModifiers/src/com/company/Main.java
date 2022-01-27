package com.company;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Tanmay");
        account.depositFunds(500);
        account.withdrawFunds(120);
        account.depositFunds(100);
        System.out.println(account.getNetBalance());
        account.withdrawFunds(1000);
        account.withdrawFunds(200);
        account.withdrawFunds(10);
        account.depositFunds(110);
        account.calculateBalance();
        //Now we have 380 in our account,but we made everything public. So we can change the netBalance very easily.
        //In real world applications we don't wan to do that.
        //account.netBalance=5000;//this won't work now as we made fields private
        //Now by doing this we have 5000 in our account!
        //Now bank will detect this fraud easily!
        //But we can still access the balance without directly using the variable.
        //account.transactions.add(4555);//this won't work now as we made fields private
        //So here we quickly loose control over the classes.
        //to fix this we make fields as private

    }
    //So let's now have a look at the 4 access modifiers.
    //Now at Top level we can make our class as public or packaged private only.
}
