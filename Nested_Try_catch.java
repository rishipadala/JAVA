package com.company;

import java.util.Scanner;

public class Nested_Try_catch {
    public static void main(String[] args) {
        // Quiz :-
        int [] marks = new int[3]; //Array Declaration + Memory Allocation
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;// boolean set to true
        while (flag){ // WHILE loop set to flag for keeping accessing an array until it gets false;
            System.out.println("Enter the array index:- ");
            int ind = sc.nextInt();


            try {
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("HEY User , Welcome to The Java's World!");
                    System.out.println("Exception Level 2");
                }
            }
            catch (ArithmeticException e){

                System.out.println("ArithmeticException occured!");
                System.out.println("Exception Level 1");
            }

        }
        System.out.println("Thank You For Using this Program. The Program is Successfully Terminated!");
    }
}

