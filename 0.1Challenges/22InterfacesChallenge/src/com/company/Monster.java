package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {

    private String playerName;
    private int hitPoints;
    private int strength;

    public Monster(String playerName, int hitPoints, int strength) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "playerName='" + playerName + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.playerName = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public List<String> write() {
        List<String> savedValues = new ArrayList<>();
        savedValues.add(0, this.playerName);
        savedValues.add(1, String.valueOf(this.hitPoints));
        savedValues.add(2, "" + this.strength);
        return savedValues;
    }


}
