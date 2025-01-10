package com.company;

/**
 *
 Anonymous class is nothing but a class without any name.
 They are used to override a class method or interface.
 Anonymous classes in Java help us to write more concise and readable code.

 By using Anonymous class , We can instantiate object in our main method & do the same thing without creating any excessive class
 It is Used if user want to run it once...

 Lambda expressions were introduced in Java 8.
 They are similar to methods, but they don't need a name.

 * Syntax: interface(which is created) obj = (parameter1, parameter2) -> { code to be executed }
 * then we can use that obj
 * Here ,Lambda Expressions are more concise & gives Less code of lines...

 */

//LambdaExp:
@FunctionalInterface
    interface LambdaExp{
    void sum(int a,int b);
}

//By extending class...
abstract class Vehicle{
    abstract void horn();
}

//By implementing interface...
@FunctionalInterface
interface Doggy{
    void bark();
}


public class AnonymousClass_LambdaExp{
    public static void main(String[] args) {
//        Doggy Shiro = new Doggy() { //here We can create anonymous class by implementing interface.
//            @Override
//            public void bark() {
//                System.out.println("buri buri buri!");
//            }
//        };
//        Shiro.bark();

//        Vehicle v = new Vehicle() { // like This we can create anonymous class by extending class;
//            @Override
//            void horn() {
//                System.out.println("pee pee poo poo");
//            }
//        };
//        v.horn();

        //--> Lambda Expression :
        LambdaExp lambdaExp = ((a, b) -> System.out.println("The Sum of a & b = "+ (a+b) )); //
        lambdaExp.sum(90,10);


    }
}
