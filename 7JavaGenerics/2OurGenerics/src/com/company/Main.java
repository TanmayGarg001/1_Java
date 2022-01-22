package com.company;

//It is good programming practice that earlier the bug is spotted in the code, the easier ,cheaper and less man power is required to fix it.
//So its best to fix the bugs/errors at compile time only.

public class Main {

    public static void main(String[] args) {

        Team<FootballPlayer> astralis = new Team<>("Astralis");
        FootballPlayer g1ave = new FootballPlayer("g1ave");
        FootballPlayer dupreeh = new FootballPlayer("dupreeh");
        FootballPlayer dev1ce = new FootballPlayer("dev1ce");
        BaseballPlayer simple = new BaseballPlayer("simple");
        astralis.addPlayer(g1ave);
        astralis.addPlayer(dupreeh);
        astralis.addPlayer(dev1ce);
//        astralis.addPlayer(simple);//now this will give error
        System.out.println(astralis.numberOfPlayers());

        System.out.println("===============");
        Team<BaseballPlayer> liquid = new Team<>("Liquid");
        BaseballPlayer stewie2k = new BaseballPlayer("stewie2k");
        BaseballPlayer twistzz = new BaseballPlayer("twistzz");
        BaseballPlayer naffly = new BaseballPlayer("naffly");
        BaseballPlayer karrigan = new BaseballPlayer("karrigan");

        liquid.addPlayer(stewie2k);
        liquid.addPlayer(twistzz);
        liquid.addPlayer(naffly);
        liquid.addPlayer(karrigan);
        System.out.println(liquid.numberOfPlayers());

    }
}
