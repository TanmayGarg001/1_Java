package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Timmy", calculateHighScorePosition(1500));
        displayHighScorePosition("Sarah", calculateHighScorePosition(900));
        displayHighScorePosition("James", calculateHighScorePosition(400));
        displayHighScorePosition("Katie", calculateHighScorePosition(50));
        displayHighScorePosition("Charles", calculateHighScorePosition(1000));
        displayHighScorePosition("Sam", calculateHighScorePosition(500));
        displayHighScorePosition("Pam", calculateHighScorePosition(100));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }

}
