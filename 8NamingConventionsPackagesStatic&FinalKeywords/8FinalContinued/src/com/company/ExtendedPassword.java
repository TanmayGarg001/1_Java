package com.company;

public class ExtendedPassword extends Password {

    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;//here im saving the password not the encrypted one
    }


//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as = " + this.decryptedPassword);
//        super.storePassword();
//    }

    //Making it final now will result in no overriding error
}
