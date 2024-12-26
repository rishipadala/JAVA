package com.company;

// Extending thread Class:-

class Mythread1 extends Thread{
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My Listening songs thread is running!");
            System.out.println("SZA is an Angel! :D");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("My Coding thread is running!");
            System.out.println("JAVA is THE BEST Lang!:D");
            i++;
        }
    }
}

//Runnable Interface!

class ThreadRunnable1 implements Runnable{
    int n = 100;

    public void run(){
        for (int i = 0; i < n ; i++) {
            System.out.println("Here Is the GUN 1 with a Bullet 1");
        }

    }
}

class ThreadRunnable2 implements Runnable{
    int n = 100;
    public void run(){
        for (int i = 0; i < n; i++) {
            System.out.println("Here Is the GUN 2 with a Bullet 2");
        }
    }
}

class MyThd extends Thread{
    public MyThd(String name){
        super(name);
        System.out.println("Hi! I am thread");
    }
}

class Mythd2 implements Runnable{
    public Mythd2(){
        System.out.println("Hi!");
    }
    public void run(){
        System.out.println("Here I am back with Runnable Interface!");
    }
}

// Thread Methods:-

class CWH1 extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
//Interrupted:-
class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<=50){
//            System.out.println("I am a thread");
            System.out.println("Thank you: ");
            i++;
            }

        }
    }


class MyNewThr2 extends Thread{

    public void run(){
        int i = 0;
        while(i <= 50){
//            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
            i++;
        }
    }
}

//sleep method()

class MyNewThr3 extends Thread{
    public void run(){
        int i = 0;
        while(i<=150){
//            System.out.println("I am a thread");
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThr4 extends Thread{

    public void run(){
        int i = 0;
        while(i<=150){
//            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
            i++;
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        //Multithreading done using extending Thread class:-

//        Mythread1 t1 = new Mythread1();
//        Mythread2 t2 = new Mythread2();
//
//        t1.start(); //--> Here, execution is done Concurrently to both the functions Mythread1 & Mythread2;
//        t2.start(); //--> always call the object with start method;

        // Multi Threading done by Runnable Interface!
//        ThreadRunnable1 bullet1 = new ThreadRunnable1();
//        Thread gun1 = new Thread(bullet1);
//
//        ThreadRunnable2 bullet2 = new ThreadRunnable2();
//        Thread gun2 = new Thread(bullet2);
//
//        gun1.start();
//        gun2.start();
//
        //Thread constructors :-
//        MyThd t1 = new MyThd("Rishi");
//        t1.start();
//        System.out.println("Here Is the thread t1's Id:- " + t1.getId());
//        System.out.println("Here Is the thread t1's name:- "+ t1.getName());

//        Mythd2 t2 = new Mythd2();
//        Thread R1 = new Thread(t2,"Heisenberg!");
//
//        R1.start();
//        System.out.println("Here Is the thread R1's Id:- " + R1.getId());
//        System.out.println("Here Is the thread R1's name:- " + R1.getName());

//
//        MyNewThr1 t1 = new MyNewThr1();
//        MyNewThr2 t2 = new MyNewThr2();
//        t1.start();
//        try{
//            t1.join(); // Here t1 will fully run & terminate itself then run t2 using Join() method;
//        }
//        catch(Exception e){
//            System.out.println(e);//If any error throws then it will comes under catch;
//        }
//
//                t2.start();


        //sleep():-

        MyNewThr3 t3 = new MyNewThr3();
        MyNewThr4 t4 = new MyNewThr4();
        t3.start();
        t3.interrupt();
        t4.start();


    }
}






