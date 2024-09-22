package com.company;
//// * Problem 1 (Class)
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfacearea(){
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
// * Problem 4 (Class);
class myRectangle{
    private int length;
    private int breadth;
    //default Constructor
    public myRectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }
    //Overload
    public myRectangle(){
        this.breadth = 4;
        this.length = 5;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
}

// * Problem 5 (Class);
class sphere{
    private int radius;

    public sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfacearea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return (4/3.0f)*Math.PI*radius*radius*radius;
    }
}




public class AccessGettersConstructorsPS9 {
    public static void main(String[] args) {

        // * Problem 1 & 2;

//          cylinder cy = new cylinder(5,10);
//          cy.setRadius(5);
//          cy.setHeight(10);
//          System.out.println(cy.getHeight());
//        System.out.println(cy.getRadius());
//          System.out.println("Surface Area : " + cy.surfacearea());
//          System.out.println("Volume : " + cy.volume());

        //* Problem 4;

//        myRectangle rectangle = new myRectangle(10,20);
//        System.out.println(rectangle.getLength());
//        System.out.println(rectangle.getBreadth());

        //* Problem 5;

        sphere sp = new sphere(10);
        System.out.println(sp.getRadius());
        System.out.println("Surface Area : "+ sp.surfacearea());
        System.out.println("Volume : "+ sp.volume());


    }

}
