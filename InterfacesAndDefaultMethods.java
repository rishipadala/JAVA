package com.company;


interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){ // we Cannot call this method as it is Private.
        System.out.println("Good Morning");
    }
    default void record4KVideo(){ //Default Method:- It is Not Necessary to use this (Abstract Default method) In Class with which implementations are DONE!
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{ //Main Parent Class
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
//   public void record4KVideo(){ //--> Here ,if we implement this Default Method then this Method will gonna run instead of given in Interface!
//       System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class InterfacesAndDefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo(); //--> default method we can call it too
        // ms.greet(); --> Throws an error! // as it is private
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
        ms.connectToNetwork("Rishi123");
    }
}

