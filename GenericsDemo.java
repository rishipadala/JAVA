package com.company;

import java.util.ArrayList;

class MyGeneric<T1, T2>{ //we can make Generics class;
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) { // constructor with generics T1 & T2 -->with the help of these Generics, we can store this with our desired (datatype : String , Integer) variable
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T2 getT2() {
        return t2;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }
    //making getters to get the values in main method;
}
public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
//      ArrayList<int> arrayList = new ArrayList(); -- this will produce an error //bcs generics cannot be primitive data type;
//      arrayList.add("str1"); //we cannot insert string value as we made <Integer> Generics
        arrayList.add(54);
        arrayList.add(643);


        //int a = (int) arrayList.get(0); //Here , we are doing type casting i.e. by Storing value of arraylist in our desired Variable(with our desired datatype) ,for that := (int) arraylist  to get our desired output .get(0);
        //System.out.println(a);         // , By using GENERICS<> , Type Casting not Required;


//By using generics after method name <String,Integer> we can get our desired output or store the val in our desired created variable (String,Int,etc.)
        MyGeneric<String, Integer> g1 = new MyGeneric<>(23, "MyString is my string ", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + int1);
    }
}


