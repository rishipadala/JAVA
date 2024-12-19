package com.company;

// * Problem 1 (class)

class Employee {
    int id;
    String name;
    int Salary;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public int getSalary() {
        return Salary;
    }
}

// * Problem 2 (Class)

class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mihir...");
    }
}

// * Problem 3 (Class)

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// * Problem 4 (Class)

class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}

// * Problem 5 (Class)

class RockstarGames{
    public void hit(){
        System.out.println("Tommy is Hitting the Enemy!");
    }
    public void run(){
        System.out.println("Tommy is Running!");
    }
    public void fire(){
        System.out.println("Tommy is firing on the Enemy!");
    }
    public void GOAT(){
        System.out.println("Tommy Vercetti is Greatest Of All Time!");
    }
}

// * Problem 6 (Class)

class Circle{
    private float r;
    private float area;
    private float perimeter;
    public void setR(int r1){
        this.r=r1;
    }
    public void setArea(float a){
        this.area=a;
        if(area==a){
            area = 3.14159f*r*r;
        }
        else {
            System.out.println("WARNING! You have enter Invalid Input...");
        }
    }
    public void setPerimeter(float p){
        this.perimeter = p;
        if(perimeter==p){
           perimeter = 2*3.14159f*r;
        }
        else {
            System.out.println("WARNING! You have enter Invalid Input...");
        }
    }
    public float getR(){
        return r;
    }
    public float getArea(){
        return area;
    }
    public float getPerimeter(){
        return perimeter ;
    }
}

public class OOPSPracticeSET {
    public static void main(String[] args) {
        // * Problem 1
//        Employee Rishi = new Employee();
//        Rishi.setName("Hey There Fellas! My Name is Rishi Padala.");
//        Rishi.Salary = 250000;
//        System.out.println(Rishi.getName());
//        System.out.println(Rishi.getSalary());

        // * Problem 2

//        CellPhone Nothing = new CellPhone();
//        Nothing.ring();
//        Nothing.vibrate();
//        Nothing.callFriend();

        // * Problem 3

//        Square box = new Square();
//        box.side = 25;
//        System.out.println("Area Of BOX is " + box.area());
//        System.out.println("Perimeter Of BOX is " + box.perimeter());

        // * Problem 4

//        Rectangle rect = new Rectangle();
//        rect.l = 10;
//        rect.b = 20;
//        System.out.println("Area Of Rectangle is " + rect.area());
//        System.out.println("Perimeter Of Rectangle is " + rect.perimeter());

        // * Problem 5

//        RockstarGames Tommy = new RockstarGames();
//        Tommy.run();
//        Tommy.hit();
//        Tommy.fire();
//        System.out.println();
//        Tommy.GOAT();

        // * Problem 6

//        Circle circle = new Circle();
//        circle.r = 9;


        // * Getters & Setters (Private access Modifier)
        Circle circle = new Circle();
        circle.setR(9);
        circle.setArea(254.571428571429f);
        circle.setPerimeter(56.5714285714286f);
        System.out.println("Area "+ circle.getArea());
        System.out.println("Perimeter " +circle.getPerimeter());

    }
}
