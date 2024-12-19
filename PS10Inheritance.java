package com.company;

//Problem 1:- Circle & Cylinder inheritance.
class circle1{
    public int radius;
    public circle1 (){
        System.out.println("I am non Parameterized Circle's Default constructor");
    }


    public circle1(int a){
        this.radius=a;
        System.out.println("I am Circle's parameterized constructor ");
    }
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

}

class cylinder1 extends circle1{
    public int height;

    public cylinder1(int a,int h){
        super(a);//if i dont use super key,then it will run default constructor of circle;
        this.height=h;
        System.out.println("I am Cylinder's parameterized constructor ");
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

//Problem 2: Rectangle & Cuboid inheritance.

class rectangle2{
    public int length;
    public int breadth;

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public rectangle2(){
        System.out.println("This is a Default Constructor Of Rectangle");
    }
    public rectangle2(int l ,int b){
        this.length=l;
        this.breadth=b;
        System.out.println("I am Rectangle's Parameterized Constructor");
    }
    public double area(){
        return this.length*this.breadth;
    }
}

class cuboid extends rectangle2 {
    int height;

    public cuboid() {
        System.out.println("This Is The Default Constructor of Cuboid");
    }

    public cuboid(int l, int b, int h) {
        super(l, b);
        this.height = h;
        System.out.println("This Is the Cuboid's Parameterized Constructor");
    }

    public double volume() {
        return this.length * this.breadth * this.height;
    }
}

public class PS10Inheritance {
    public static void main(String[] args) {
        //Problem 1 MAIN :-

        //circle1 c1 = new circle1(5);
        //System.out.println(c1.getArea());

        //cylinder1 cy1 = new cylinder1(5,12);
        // System.out.println(cy1.volume());

        //Problem 2 MAIN:-

//        rectangle2 r2 = new rectangle2(5,5);
//        r2.setBreadth(4);
//        r2.setLength(5);
//        System.out.println(r2.area());

//        cuboid cu = new cuboid(3,4,5);
//        System.out.println(cu.volume());

    }
}
