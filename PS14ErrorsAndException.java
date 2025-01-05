package com.company;

import java.util.Scanner;

class MaxRetriesExceeds extends Exception{
    public String toString(){
        return "Max Retries Exceeded!";
    }
}
public class PS14ErrorsAndException {
    public static void main(String[] args) throws MaxRetriesExceeds {
        //Problem 1:-

        //SYNTAX ERROR:-
        //int a = 0;
        //double b --> Here semicolon

        //LOGICAL ERROR:-
       // int a = 10;
       // int b = 5;
       // System.out.println("The Addition Of a & b is : "+ (a-b)); // Here, The Logical error is subtraction of a & b instead of doing addition;

        //Runtime errors (EXCEPTIONS):-
        //int a = 2;
        //int b = 0;
        //System.out.println(a/b); // div by 0 is an Arithmetic Exception!

        //Problem 2:-
//        int a,b;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The numbers a & b:- ");
//        a =sc.nextInt();
//        b=sc.nextInt();
//
//        try{
//            if (a<0 && b<0){
//                throw new IllegalArgumentException();
//            }
//            else {
//                System.out.println(a/b);
//            }
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("Hehe");
//        }

        //Problem 3:-

        int [] marks = new int[3]; //Array Declaration + Memory Allocation
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int i = 0;
        while(flag && i<5){

            try {
                System.out.println("Enter the array index: ");
                int ind = sc.nextInt();
                System.out.println("The Value Of Marks[index] is :- "+marks[ind]);
                break;
            }

            catch (Exception e){
                System.out.println("Invalid Index!");
                i++;
            }
            try {
                if (i >= 5){
                    System.out.println("Error!");
                    throw new MaxRetriesExceeds();
                }
            }
            catch (MaxRetriesExceeds e){
                System.out.println(e);
            }

        }


        //Problem 4:-
        // throw custom exception in Problem 3;

        //done check above

        //Problem 5:-
        // wrap the program inside a method which throws* your custom Exception

        //done check above







    }

}
