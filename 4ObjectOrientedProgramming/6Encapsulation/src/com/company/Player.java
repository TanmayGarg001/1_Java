package com.company;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("You are DEAD!");
            //Life reduced.
        }
    }

    public int healthRemaining() {
        return health;
    }


}