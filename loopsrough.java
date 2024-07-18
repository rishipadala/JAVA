package com.company;

public class loopsrough {
    public static void main(String[] args) {
//        int n = 100;
//        for (int i=n; i!=0;i--){
//            System.out.println(i);


        int n = 5;
        int j, i = n - 1 ;

        while ( i >= 0) {
            j = 0;

            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
//        int n =4;
//        int i =n-1;
//        int j=0;
//        while(i>=0){
//            while(j<=i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i++;


    }
}
