package com.company;

import java.util.Scanner;
//This was My BEST Exercise Soo Farr...!:D
class InvalidInputException extends Exception{
    public String toString(){
        return "Cannot Add 8 & 9";
    }
    public String getMessage(){
        return "I am getMessage() for InvalidInputException";
    }
}

class CannotDivBy0 extends Exception{
    public String toString(){
        return "Cannot Divide By 0";
    }
    public String getMessage(){
        return "I am getMessage() for CannotDivBy0";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Input Should not be Greater than 100000";
    }
    public String getMessage(){
        return "I am getMessage() for MaxInputException";
    }
}
class MaxMultiInputException extends Exception{
    public String toString(){
        return "Multiplication Input Should not Exceed 7000 while Multiplying";
    }
    public String getMessage(){
        return "I am getMessage() for MaxInputException";
    }
}

public class Ex6_Custom_Calculator {
    public static void main(String[] args) throws MaxInputException,MaxMultiInputException,InvalidInputException,CannotDivBy0 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number a = ");
        double a = sc.nextDouble();
        System.out.println("Enter The Number b = ");
        double b = sc.nextDouble();

        System.out.println("Enter the Operation: \n 1.Addition 2.Subtraction 3.Multiplication 4.Division");
        int op = sc.nextInt();
        try {
            switch (op) {
                case 1:
                    if (a > 100000 && b > 100000) {
                        throw new MaxInputException();
                    }
                    if (a == 8 || b == 9) {
                        throw new InvalidInputException();
                    }
                    System.out.println("Addition = " + (a+b));
                break;

                case 2:
                    if (a > 100000 && b > 100000) {
                        throw new MaxInputException();
                    }
                    System.out.println("Subtraction = " + (a-b));
                break;

                case 3:
                    if (a > 100000 && b > 100000) {
                        throw new MaxInputException();
                    }
                    if (a >= 7000 && b >= 7000) {
                        throw new MaxMultiInputException();
                    }
                    System.out.println("Multiplication = " + (a*b));
                    break;

                case 4:
                    if (a > 100000 && b > 100000) {
                        throw new MaxInputException();
                    }
                    if (b == 0) {
                        throw new CannotDivBy0();
                    }
                    System.out.println("Division = " + (a/b));
                break;

                default:
                    System.out.println("Invalid Input Operation");
                    break;

            }
        }
        catch (MaxInputException e) {
            System.out.println(e.toString());
        } catch (CannotDivBy0 e) {
            System.out.println(e.toString());
        } catch (MaxMultiInputException e) {
            System.out.println(e.toString());
        } catch (InvalidInputException e) {
            System.out.println(e.toString());
        }

    }
}
