package com.company;

public class EnhancedPlayer {

    private String name = "Unnamed Player";
    private int hitpoints = 100;//this is if health is out of bounds that are declared in constructor
    private String weapon = "Fists";//Weapon by default

    public EnhancedPlayer(String name, int health, String weapon) {
        if (name != null) {
            this.name = name;
        }
        //adding validations for health and name here!
        if (health >= 0 && health <= 100) {
            this.hitpoints = health;
        }
        if (weapon != null) {
            this.weapon = weapon;
        }
    }

    public void loseHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0) {
            System.out.println("You are DEAD!");
            //Life reduced.
        }
    }

    public int getHealth() {
        return hitpoints;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }
}
