package com.company;
import java.util.Scanner;
public class ErrorsExceptionTryCatch {
    public static void main(String[] args) {
//                int a = 6000;
//                int b = 0;
//                // Without Try:
////               int c = a / b;
////               System.out.println("The result is " + c);
//
//                // With Try:
//                try {               // ek baar try karenge if agar exception aata hai then usse catch mai daalke exception show karenge without any runtime errors;
//                    int c = a / b;  //Arithmetic Exception We cannot divide by 0;
//                    System.out.println("The result is " + c);
//                }
//                catch(Exception e) {
//                    System.out.println("We failed to divide. Reason: ");
//                    System.out.println(e);
//                }
//                System.out.println("End of the program");


        // Handling Specific Exceptions Like Arithmetic,ArraysOutOfBound,IO,etc Exceptions separately in catch:-

                int [] marks = new int[3]; //Array Declaration + Memory Allocation
                marks[0] = 7;
                marks[1] = 56;
                marks[2] = 6;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array index");
                int ind = sc.nextInt();

                System.out.println("Enter the number you want to divide the value with");
                int number = sc.nextInt();
                try{
                    System.out.println("The value at array index entered is: " + marks[ind]);
                    System.out.println("The value of array-value/number is: " + marks[ind]/number);
                }
                catch (ArithmeticException e){ // Arithmetic Exception :- If user enter number=0 ,then it will throw ArthException(we cannot divide with 0);
                    System.out.println("ArithmeticException occured!");
                    System.out.println(e);
                }
                catch (ArrayIndexOutOfBoundsException e){// here,Array has a index memory 3,therefore if user enters beyond 3 index, then it will throw ArraysOutOfBoundException cuz memory allocated to array is 3;
                    System.out.println("ArrayIndexOutOfBoundsException occured!");
                    System.out.println(e);
                }
                catch (Exception e){ // handles All other Exceptions Occurred;
                    System.out.println("Some other exception occured!");
                    System.out.println(e);
                }
    }
}

