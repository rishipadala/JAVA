package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        System.out.println("LET'S PLAY ROCK PAPER & SCISSORS!");

        System.out.println("Rock : 0 \nPaper : 1\nScissors : 2");
        System.out.println("Choose The Option : ");
        int a = sc.nextInt();


        if (a == 0 ){
            System.out.println("You have selected ROCK!");
        }
        else if (a == 1){
            System.out.println("You have selected PAPER!");
        }
        else if (a == 2){
            System.out.println("You have select SCISSOR!");
        }
        else {
            System.out.println("You Have not Selected any Option!");
        }

        int comp = rm.nextInt(3);

        System.out.println("\nNow Its Computer's Turn!");

        if (comp==0) {
            System.out.println("\nComputer Selected Rock");
        }
        else if (comp==1){
            System.out.println("\nComputer Selected Paper");
        }
        else if (comp == 2){
            System.out.println("\nComputer Selected Scissor");
        }

        //Deciding Who Won Human vs Comp
        if (a == comp){
            System.out.println("\nMatch DRAW!");
        }
        else if (a==0 && comp==2 || a == 1 && comp==0 || a==2 && comp==1) {
            System.out.println("\nCongratulations! You WON!");
        }
        else {
            System.out.println("\nYou Lost! Better Luck Next Time!");
        }
        System.out.println("\nThank You For Playing This Game! ");
    }
}
