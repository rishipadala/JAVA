package com.company;

public class recursionrough {
    static int factorial(int n){
        //factorial(n) = n * factorial(n-1)
        // here factorial(n-1)= n-1 *.....1
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            //Recursive Way
            return n * factorial(n-1);
        }
    }

    static int factorialiterative(int n) {
        //factorial(n) = n * factorial(n-1)
        // here factorial(n-1)= n-1 *.....1
        if (n == 0 || n == 1) {
            return 1;
        }

        else {
            //Iterative Way
            int product= 1;
            for (int i = 1; i <= n; i++) { //1 se n tak bhi jaa sakte hai  // 1*2*3*...n-1*n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println("The value of Factorial is : " + factorial(n));
        System.out.println("The value of Factorial is : " + factorialiterative(n));

    }
}

