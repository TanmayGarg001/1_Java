package com.company;

public class Gearbox {
    private boolean isClutchIn;

    public void clutchIsIn(boolean isClutchIn) {
        this.isClutchIn = isClutchIn;
    }
    //Now if we want to change this from boolean to lets say a string which says yes/no or an integer which toggles 0/1.
    //We can do that here. But if this is a large application or a framework, this would be a great problem.
    //So interfaces sort of binds or makes a contract that once a method is declared inside of it ,it will be used in the class
    //implementing it and the way it is going to be used depends on the class but the name and parameters remains the same.
    //So we're not breaking code anywhere.
}
