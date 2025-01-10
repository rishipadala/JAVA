package com.company;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> A Word <p>This is a new paragraph</p>
 * @author Rishi Padala
 * @version 1.1
 * @since 2005
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

/*
  We can manually generate docs in Windows powershell or cmd by writing the command "javadoc -d docs javadoc.java";
 */

public class javadocAdvProblem1 {
    /**
     *
     * @param a First Parameter - integer to add
     * @param b Second Parameter - integer to add
     */
    public void add(int a, int b){
        System.out.println("The sum is: " + a+b);
    }

    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}


