package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    int number;
    int NoofGuesses;
    int userInput;


       game(){
        Random rand = new Random();
        this.number = rand.nextInt(0,100);
    }

    void takeUserInput() {
        System.out.println("Guess The number : ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }
    boolean isCorrectNumber(){
           NoofGuesses++;
           if (userInput == number){
               System.out.format("Congratulations ,You Guessed the number %d Right!\n You guessed it in %d no.of attempts",number,NoofGuesses);
               return true;
           }
           else if(userInput<=number){
               System.out.println("Number you guessed is Lesser than the Actual Guessed Number,Try Higher!");
           }
           else if (userInput>=number) {
               System.out.println("Number you guessed is Higher than the Actual Guessed Number,Try Lower!");
           }
           return false;
    }

}

public class GuessTheNumberEx3OOP {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }

}
