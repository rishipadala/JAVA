package com.company;

class interpts extends Thread{
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Child Thread");
                Thread.sleep(4000); /* Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. */

            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Thread is running");

    }
}

public class ThreadMInterrupts extends Thread{
    public static void main(String[] args) {
        interpts t= new interpts();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");

    }
}


