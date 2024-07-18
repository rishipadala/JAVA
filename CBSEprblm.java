package com.company;

import java.util.Scanner;

public class CBSEprblm {
 public static void main(String[] args) {
     System.out.println("The CBSE % Of DRAKEN ");
     Scanner sc =new Scanner(System.in);
     System.out.println("Physics : ");
     int a = sc.nextInt();
     System.out.println("Chemistry : ");
     int b = sc.nextInt();
     System.out.println("Maths : ");
     int c = sc.nextInt();
     System.out.println("C++ : ");
     int d = sc.nextInt();
     System.out.println("English : ");
     int e = sc.nextInt();

     float sum = a + b + c + d + e;
     float total = 500;
     float per = (sum/total*100);
     System.out.print("THE CBSE PERCENTAGE OF DRAKEN IS : ");
     System.out.println(per);
 }
}
