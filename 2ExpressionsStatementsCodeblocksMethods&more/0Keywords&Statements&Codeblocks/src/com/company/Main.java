package com.company;

public class Main {

    public static void main(String[] args) {
        int score = 5000;
        int levelCompleted = 800;
        int bonus = 200;

        if(score>5000){
            System.out.println("Your score was greater than 5000");
        }else if(score==5000){
            System.out.println("Your score was 5000");
        }else if(score<5000){
            System.out.println("Your score was less than 5000");
        }else{
            System.out.println("Invalid !");
        }
    }
}
