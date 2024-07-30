package com.company;

public class PS7Qs {
    //Problem 1 :- Multiplication Table Of Given Number using Methods
//    static int mul(int n){
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }
//        return n;
//    }
//
//    public static void main(String[] args) {
//        mul(5);
//    }

    //Problem 2 :-Print Pattern Using Methods/functions
//    static int patt(int n){
//        for (int i= 0; i<n; i++)
//        {
//            for (int j=0 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        return n;
//    }
//    public static void main(String[] args) {
//        patt(9);
//    }

    //Problem 4 :-Print Star Pattern Using Methods In Reverse Order
//    static int patt2(int n){
//        for (int i=n-1; i>=0; i--)
//        {
//            for (int j=0 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        return n;
//    }
//    public static void main(String[] args) {
//        patt2(8);
//    }

    //Problem 3 :-  Sum of First n Natural Number using Recursion
    /* Formula
    Sum(n) = 1 + 2 + 3 + .... + n-1 + n; -- (1)
    Sum(n) = Sum(n-1) + n --> From (1)  {This IS THe FORMULA}
    For Simple Explanation:-
    IF

    sum(3)= 3 + 2 + sum(1);
    bcoz of BASE CONDITION Sum Of 1 Is "1"
    then , Sum(3) = 3 + 2 + 1 = 6;
     */

//    static int SumRec(int n){
//        // Base Condition :- ye recursion ko loop chalane se Rokta hai!
//        if(n==1){
//            return 1;
//        }
//        return n + SumRec(n-1);
//    }
//
//    public static void main(String[] args) {
//        int c= SumRec(3);
//        System.out.println(c);
//    }

    //Problem 5 :-Print Nth Term of Fibonacci Series using recursion;
//    static int Fib(int n){
//        /*
//        if (n==1){
//            return 0;
//        }
//         else if (n==2) {
//            return 1;
//        }
//        */
//        if (n==1 || n==2){
//            return n-1;
//        }
//
//        return Fib(n-1) + Fib(n-2);
//    }
//
//    public static void main(String[] args) {
//        int c = Fib(10);
//        System.out.println(c);
//    }


    //Problem 6 :- Print Avg Of Set of Numbers Passed as Arguments
//    static float AvgVarargs(float x, float ...arr) {
//        float total=0;
//        for (float a :arr){
//            total += a;
//        }
//        return(float) total/ arr.length;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The Avg Of Given Number is : " + AvgVarargs(6.78f,6.48f,7.21f));
//    }


    //Problem 7 :- Repeat Problem 2 Using Recursion
//    static void patt_rec(int n) {
//        if (n > 0) {
//            patt_rec(n-1);

             /* HERE

            patt_rec(3)
            patt_rec(2) + 3 times star and new line
            patt_rec(1) + 2 times star and new line + 3 times star and new line
            patt_rec(0) + 1 time star and new line + 2 times star and new line + 3 times star and new line
            -----------------------------------------------------------
            JUST DEBUG THE CODE U GET IT!
             */

//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        patt_rec(5);
//    }

    //Problem 8 :- Repeat Problem 4 Using Recursion
//        static void patt_rec(int n) {
//        if (n > 0) {
//            for (int i = n; i > 0 ; i--) {
//                for (int j = 0; j < i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        patt_rec(5);
//    }

    //Problem 9: Function To Convert Celsius To Fahrenheit using Methods/Functions
//    static float ConvertCtoF(float C){
//        return (C * 9/5) + 32;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("The Conversion Of Celsius Into Fahrenheit is: " + ConvertCtoF(34));
//    }

    // PROBLEM 10: Repeat Problem 3 sum of first N natural no.s Using Iterative approach
    static int sum(int n){
        int Sum = 0;
        for (int i = 0; i <= n ; i++) {
            Sum += i;
        }
        return Sum;
    }

    public static void main(String[] args) {
        System.out.print("The Sum Of N natural Number is : "+ sum(10) );
    }


}
