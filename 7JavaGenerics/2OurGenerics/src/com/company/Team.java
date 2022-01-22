package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {//Now to overcome mixing of the player type in a single team, we use generics
    //extends player means we can only make player type team (validation check!),now by doing that we can remove type casting too!Because we bounded our generic to the Player
    //we can also implement from an interface here too!

    private final String teamName;
    private final ArrayList<T> teamMembers = new ArrayList<>();
    private int played = 0;
    private int win = 0;
    private int loss = 0;
    private int tied = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (teamMembers.contains(player)) {
            System.out.println(player.getPlayerName() + " already exists in team " + teamName);//type cast that to player but its fkn hard to understand
            return false;
        } else {
            teamMembers.add(player);
            System.out.println(player.getPlayerName() + " is added in the team " + teamName);
            return true;
        }
    }

    public int numberOfPlayers() {
        return teamMembers.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            win++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            loss++;
        }
        played++;
        if (opponent != null) {
            matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (win * 2) + tied;
    }

}
