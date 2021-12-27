package com.company;

public class Main {
    /////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was = " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }
        myFirstMethod(true, 80, 10, 500);//the passed or input are here known as arguments
        myFirstMethod(false, 56, 12, 50);//the passed or input are here known as arguments
        // System.out.println(bonusTest);//bonusTest is not resolved by the java coz of the fact it was in a method and after executing the method the parameters are destroyed.
    }
/////////////////////////////////////////////////////////////////////////
    //Code between ////// these is known as method
    //Method are OP and are used to reduce duplication of code and to make it more efficient etc.

    public static void myFirstMethod(boolean gameOver, int score, int levelCompleted, int bonusTest) {//This that are declared or input here are known as parameters
        //void is return type ;)
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonusTest);
            finalScore += 1000;
            System.out.println("Your final score was = " + finalScore);
        } else {
            System.out.println("Game is not over yet!");
        }
    }

}
