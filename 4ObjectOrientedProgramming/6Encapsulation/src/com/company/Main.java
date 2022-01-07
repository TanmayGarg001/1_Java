package com.company;

public class Main {

    public static void main(String[] args) {
        //You already know what encapsulation is by this point but still here it goes:-
        //Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together
        // as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed
        // only through the methods of their current class.
        //In simple words we are restricting or hiding or stopping other classes to access the code from the class you are currently working on.

        Player player = new Player();
        player.health = 100;
        player.weapon = "AK-47";
        player.name = "Timmy";

        player.loseHealth(25);
        System.out.println(player.healthRemaining());

        player.loseHealth(78);
        System.out.println(player.healthRemaining());
        //Now here player is dead and life is reduced nut as we made fields public we can change that or we can say like we hacked that
        // (sort of) and increased player's health. Like this :-
        player.health = 200;
        System.out.println(player.healthRemaining());
        //This is where encapsulation comes into the play as making those fields private won't allow to player's health be changed within this class.
        //So we are hiding or we an say restricting the data that we don't want to be manipulated by other classes other than the original class itself ofc.
        //Also if you change lets say weapon field as a armory field so you would be required to change each and everywhere where weapon was accessed.
        //and that's a pain in the ass in a huge application.
        //or we might forget to initialize all the fields for each specific object( if there is no constructor ofc).
        //And we won't be able to add some validations or something as fields are publicly visible.
        //therefore encapsulation is a very important feature/characteristic of OOP.
        //Maneuver to EnhancedPlayer too learn the correct of doing encapsulation.
        //Now EnhancedPlayer is encapsulated and we are forced to define some parameters which are passing through our validations only :)
        System.out.println("*****************************************");
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tanmay", 80, "Ak-47");
        System.out.println(enhancedPlayer.getHealth());
        enhancedPlayer.loseHealth(50);
        System.out.println(enhancedPlayer.getHealth());
        System.out.println(enhancedPlayer.getName());
        System.out.println(enhancedPlayer.getWeapon());
        System.out.println("*****************************************");
        EnhancedPlayer enhancedPlayer2 = new EnhancedPlayer(null, 200, null);
        System.out.println(enhancedPlayer2.getHealth());//See the results 200 health was over written by our validations! :) Benefit of encapsulation
        enhancedPlayer2.loseHealth(50);
        System.out.println(enhancedPlayer2.getHealth());
        System.out.println(enhancedPlayer2.getName());
        System.out.println(enhancedPlayer2.getWeapon());
        //EVEN CHANGING health TO hitpoints DID NOT BREAK THE CODE AND THE NO ONE KNOWS WHAT HEALTH HERE REFERS TO INSIDE THAT CLASS. Example loseHealth() but
        //health is not what we are referring to instead it is hitpoints
        //Also by using constructor initially we are forcing user to fill the fields and making sure that fields are ins9ide our validations .
        //That's the POWER of ENCAPSULATION.

    }
}
