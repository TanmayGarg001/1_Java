package com.company;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.isRinging = isRinging;
        this.myNumber = myNumber;
    }


    //also in classes everything is private by default so we need to make these methods public as interfaces methods are public in nature.
    @Override
    public void powerOn() {
        System.out.println("There's no power button on a desk phone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing :" + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the Desk Phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
