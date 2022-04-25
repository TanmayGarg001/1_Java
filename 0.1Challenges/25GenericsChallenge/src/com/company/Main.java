package com.company;

public class Main {

    public static void main(String[] args) {
        Team<CounterStrikeGlobalOffensive> Astralis = new Team<>("Astralis");
        CounterStrikeGlobalOffensive Dupreeh = new CounterStrikeGlobalOffensive("Dupreeh");
        CounterStrikeGlobalOffensive Magisk = new CounterStrikeGlobalOffensive("Magisk");
        CounterStrikeGlobalOffensive Dev1ce = new CounterStrikeGlobalOffensive("Dev1ce");
        CounterStrikeGlobalOffensive g1ave = new CounterStrikeGlobalOffensive("g1ave");
        CounterStrikeGlobalOffensive Xyp9X = new CounterStrikeGlobalOffensive("Xyp9X");
//        Cricket Dhoni = new Cricket("Dhoni");
        Astralis.addPlayer(Dev1ce);
        Astralis.addPlayer(Dupreeh);
        Astralis.addPlayer(Magisk);
        Astralis.addPlayer(g1ave);
        Astralis.addPlayer(Xyp9X);
//        Astralis.addPlayer(Dhoni);
    }
}
