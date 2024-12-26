package com.company;

//Problem 1 & 2 :-
class thread1 extends Thread{
    int i = 0;
    public void run(){
        int i = 0;
        while(i<10){
            try {
                Thread.sleep(20);
            }
            catch (Exception e){
                System.out.println("Exception here " + e);
            }

            System.out.println("Good Morning!");
            i++;
        }
    }
}

class thread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10) {
            try {
                Thread.sleep(20);
            }
            catch (Exception e){
                System.out.println("Exception here " + e);
            }
            System.out.println("Welcome!");
            i++;
        }
    }
}






public class MultithreadingPS13 {
    public static void main(String[] args) {

        //problem 1  done:-

//        thread1 t1 = new thread1();
//        thread2 t2 = new thread2();
//
//        t1.start();
//        t2.start();

        //Problem 2:-
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();


        t1.setPriority(2);
        t2.setPriority(9);
        //System.out.println(t1.getPriority());
       // System.out.println(t2.getPriority());
        //t1.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
       // t2.start();








    }
}
