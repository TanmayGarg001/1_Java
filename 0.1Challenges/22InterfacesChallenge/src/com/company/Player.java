package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
    private String playerName;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String playerName, int hitPoints, int strength, String weapon) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public String toString() {//To print stuff
        return "Player Status => \n" +
                "playerName='" + playerName + '\'' +
                ", hitPoints=" + hitPoints +
                ", Strength=" + strength +
                ", weapon='" + weapon + '\''
                ;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.playerName = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> savedValues = new ArrayList<>();
        savedValues.add(0, this.playerName);
        savedValues.add(1, String.valueOf(this.hitPoints));
        savedValues.add(2, "" + this.strength);//does the same thing that String.valueOf does
        savedValues.add(3, this.weapon);
        return savedValues;
    }


}
