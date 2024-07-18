package com.company;
import java.util.Scanner;
public class PS3Q {
    public static void main(String[] args) {
        // Q1

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Physics: ");
//        float Physics = sc.nextFloat();
//        System.out.print("Chemistry: ");
//        float Chemistry = sc.nextFloat();
//        System.out.print("Maths: ");
//        float Maths = sc.nextFloat();
//        float avg =(Physics + Chemistry + Maths)/3.0f;
//
//        if (avg >=40 && Physics>=33 && Chemistry>=33 && Maths>=33) {
//            System.out.println("Congrats! YOU HAVE PASSED!");
//        } else {
//            System.out.println("A SINGLE SHEET OF PAPER CANNOT DECIDE YOUR FUTURE lol");
//        }

        //Q2 Calculate Income Tax Amount
        float tax = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Income as per In Lakhs: ");
        float income = sc.nextFloat();

        if (income <= 2.5f){
            System.out.println("You do not have to pay the Tax");
        } else if (income > 2.5f && income <= 5.0f) {
            tax = tax + 0.05f*(income -2.5f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.2f*(income - 2.5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.2f*(10.0f - 5.0f);
            tax = tax + 0.3f*(income - 10.0f);
        }
        System.out.println("Total Tax Paid by an Employee: " + tax);

        // Q4

//          System.out.println("Enter Your Day Number ");
//          int day = sc.nextInt();
//
//          switch (day){
//              case 1 :
//                  System.out.println("Today is Monday!");
//                  break;
//              case 2:
//                  System.out.println("Today is Tuesday!");
//                  break;
//              case 3 :
//                  System.out.println("Today is Wednesday!");
//                  break;
//              case 4 :
//                  System.out.println("Today is Thursday!");
//                  break;
//              case 5 :
//                  System.out.println("Today is Friday!");
//                  break;
//              case 6 :
//                  System.out.println("Today is Saturday!");
//                  break;
//              case 7 :
//                  System.out.println("Today is Sunday!");
//                  break;
//          }

        //Q5 Leap year

//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter Your Year: ");
//        int yr = sc.nextInt();
//
//        if (yr % 4 ==0 || yr % 400 == 0){
//            System.out.println("It is A Leap Year!");
//        }
//        else {
//            System.out.println("Sorry,It is Not A LEAP YEAR");
//        }

//        //Q5
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Type Your URL: ");
//        String url = sc.nextLine();
//
//        if (url.endsWith(".com")){
//            System.out.println("It is a Commercial Website");
//        } else if (url.endsWith(".org")) {
//            System.out.println("Its a Organisation Website");
//        } else if (url.endsWith(".in")) {
//            System.out.println("It is a Indian Website");
//        }

    }

}