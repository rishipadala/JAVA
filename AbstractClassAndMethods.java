package com.company;
//An abstract class cannot be instantiated.(We cannot create object of parent abstract class).
//Abstract class are used when we want to achieve security & abstraction
//(hide certain details & show only necessary details to the user)
//A method that is declared without implementation is known as the abstract method.

/*
abstract class Phone1{
    abstract void on();
}
class SmartPhone1 extends Phone1{
    public void on(){
        System.out.println("Turning on SmartPhone...");//child class inherits by - abstract parent class must! contain abstract_method which is @override by the (parent abstract class).
    } //Or make the class abstract...
}
public class AbstractClassAndMethods {
    public static void main(String[] args) {


        Phone1 obj = new SmartPhone1(); //Dynamic Dispatch Method ;- We can make Reference of Abstract Class(Phone) & Create Object For Subclass(SmartPhone)!
        obj.on();

    }
}
 */


abstract class Parent2{
    public Parent2(){
        System.out.println("Mai Parent2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }//here there is no override abstract method (greet or greet2) from Parent2;Therefore,making this Abstract class
}
public class AbstractClassAndMethods {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error // we cannot create object of Abstract Class!
        Child2 c = new Child2();
        c.greet();
        c.greet2();
        c.sayHello();

        //Child3 c3 = new Child3(); -- error // we cannot create object of Abstract Class!
    }
}


//Abstract vs Interfaces

/*
       Abstract class 	                                                                        Interface
1. It can contain abstract and non-abstract method  	                          1. It can only contain abstract methods. We do not need to use the "abstract" keyword in interface methods because the interface is implicitly abstract.
2. abstract keyword is used to declare an abstract class.                         2. Interface keyword is used to declare an interface.
3. A sub-class extends the abstract class by using the "extends" keyword.         3.The "implements" keyword is used to implement an interface.
4. An abstract class in Java can have class members like private, protected,etc.  4.Members of a Java interface are public by default.
5. Abstract class doesn't support multiple inheritance. 	                      5.Multiple inheritance is achieved in Java by using the interface.

*/

