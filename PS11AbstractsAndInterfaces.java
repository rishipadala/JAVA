package com.company;

abstract class Pen{
    abstract void write();

    abstract void refill();

}
class LincFlair extends Pen{
    public void write(){
        System.out.println("Writing With LincFlair....");
    }
    public void refill(){
        System.out.println("Refilling the Ink in LincFlair...");
    }
    void changenib(){
        System.out.println("Changing Nib of LincFlair");
    }
}

//Problem 3 :-
class Monkey{
    public void jump(){
        System.out.println("Monkey is Jumping!");
    }
    public void bite(){
        System.out.println("Monkey is gonna Bite the Human's Hand.! Be Careful!");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
        }

class Human extends Monkey implements BasicAnimal{
    public void speak(){
        System.out.println("Human Speaking English");
    }
    public void code(){
        System.out.println("Human Coding in Java..!");
    }
    public void eat(){
        System.out.println("Human or Monkey Eating with their Bare hands ");
    }
    public void sleep(){
        System.out.println("Human Sleeping in Bed & Monkeys Sleeping on tree!");
    }
}

//Problem 4:-
abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

interface Camera{
    void record();
    void takesnap();
}
class SmartTelephone extends TelePhone implements Camera{

    public void ring(){
        System.out.println("Ringing..");
    }
    public void lift(){
        System.out.println("Lifting...");
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }
    public void record(){
        System.out.println("Recording...");
    }
    public void takesnap(){
        System.out.println("Taking a Snap..");
    }
}

//Problem 6 & 7:-

interface TVRemote{
    void poweron();
    void poweroff();
}

interface SmartTvRemote extends TVRemote{
    void volumeUP(int increment);
    void volumeDown(int decrement);
}

class SmartTV implements SmartTvRemote{
    public void poweron(){
        System.out.println("TV on...");
    }
    public void poweroff(){
        System.out.println("TV off..");
    }
    public void volumeUP(int increment){
        System.out.println("Increasing Volume By "+ increment);
    }
    public void volumeDown(int decrement){
        System.out.println("Decreasing Volume By "+ decrement);
    }
    public void ChangingChannel(){
        System.out.println("Channel Changing..");
    }
}






public class PS11AbstractsAndInterfaces {
    public static void main(String[] args) {
        //Problem 1 & 2 :-
//        LincFlair p = new LincFlair();
//        p.write();
//        p.refill();
//        p.changenib();

     //Problem 3 Done:-
//        Monkey m1= new Monkey();
//        m1.jump();
//        m1.bite();
//        Human H1 = new Human();
//        H1.speak();
//        H1.code();
//        H1.eat();
//        H1.sleep();

        //Polymorphism :-

        //Monkey m2 = new Human();
        //m2.code(); //-->error yaha human ko monkey bolke reference diya hai Therefore,It cannot use Human class methods
        //BasicAnimal rishi = new Human();
        //rishi.sleep();
        //rishi.eat();

        //Throws an error --> Basic Animal Interface doesnt have speak & jump methods
        //rishi.speak();
        //rishi.jump();

        //Problem 4 done:-

//        TelePhone tp = new SmartTelephone();
//        tp.ring();
//        tp.lift();
//        tp.disconnect();
//
//        //Polymorphism for problem 4:-
//        Camera stp = new SmartTelephone();
//        stp.record();
//        stp.takesnap();

        //stp.ring(); & stp.lift();// error --> We are calling SmartPhone as a Camera ,so we can only use methods given in camera interface

        //Problem 6 & 7 Done:-

//        SmartTvRemote stv= new SmartTV();
//        stv.poweron();
//        stv.volumeDown(5);
//        stv.volumeUP(3);
//        stv.poweroff();
//        //stv.ChangingChannel();
//
//        System.out.println();
//
//        TVRemote tvr = new SmartTV();
//        tvr.poweron();
//        tvr.poweroff();

    }
}
