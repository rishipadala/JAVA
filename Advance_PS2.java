package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(String a){
        System.out.println("This is the method 1\n" + a);
    }
}

interface MyInter{
    void display();
}
public class Advance_PS2 {
    //Problem 3 : Suppress Warning of deprecation in problem 2;
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        //Problem 1 solved -- check class : javadocAdvProblem1;

        //Problem 2 :
        MyDeprecated myD = new MyDeprecated();
        myD.meth1("You goddamn right i am!"); //Here Java is Warning us to Better not use this method cause its Deprecated!;

        //Problem 4: by lambda;
        MyInter Myint = () -> System.out.println("This is the instance of Interface called MyInter!");
        Myint.display();

        //Problem 5 : to store a Multiplication table in a file;
        int n =19;
        String table = "";
        for (int i = 1; i <= 10; i++) {
            table += n + "X" + (i) + "=" + n * (i);
            table += "\n";
        }
        try {
/*
            FileWriter MyMultTable = new FileWriter("12 Table.txt");  //Created..
            MyMultTable.write(table);
            MyMultTable.close();

            //*--> Problem 6: 12 to 19 store in a folder; // 12 created in previous problem

            FileWriter table13 = new FileWriter("13 Table.txt");
            table13.write(table);
            table13.close();

            FileWriter table14 = new FileWriter("14 Table.txt");
            table14.write(table);
            table14.close();

            FileWriter table15 = new FileWriter("15 Table.txt");
            table15.write(table);
            table15.close();

            FileWriter table16 = new FileWriter("16 Table.txt");
            table16.write(table);
            table16.close();

            FileWriter table17 = new FileWriter("17 Table.txt");
            table17.write(table);
            table17.close();

            FileWriter table18 = new FileWriter("18 Table.txt");
            table18.write(table);
            table18.close();

 */

            FileWriter table19 = new FileWriter("19 Table.txt");
            table19.write(table);
            table19.close();


        } catch (IOException e) {
            e.printStackTrace();
        }









    }
}
