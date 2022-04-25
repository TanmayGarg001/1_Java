package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String teamName;
    private ArrayList<T> membersOfTeam = new ArrayList<>();
    private int playedMatches = 0;
    private int win = 0;
    private int tie = 0;
    private int lost = 0;
    public Team(String teamName) {
        this.teamName = teamName;
    }

    public boolean addPlayer(T player) {
        if (membersOfTeam.contains(player)) {
            System.out.println(player.getPlayerName() + " already exists in " + teamName);
            return false;
        } else {
            membersOfTeam.add(player);
            System.out.println(player.getPlayerName() + " is now a player of " + teamName);
            return true;
        }
    }

    public void resultTracker(Team opponent, double ourScore, double theirScore) {
        if (ourScore > theirScore) {
            win++;
        } else if (ourScore == theirScore) {
            tie++;
        } else {
            lost++;
        }
        playedMatches++;
        if (opponent != null) {
            resultTracker(null, theirScore, ourScore);
        }
    }

    public int totalTeamMembers() {
        return membersOfTeam.size();
    }

    public double netScore() {
        return ((win * 2.5) + (tie * 1.25)) / 1.725;
    }

}
