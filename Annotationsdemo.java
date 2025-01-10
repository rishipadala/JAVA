package com.company;

/**
 * THESE ARE THE COMMON ANNOTATIONS OF JAVA -->@FunctionalInterface,@Override,@Deprecated,@SuppressWarnings();
 */

@FunctionalInterface // This annotation means --> this interface should have only 1 method; that's why it is called Functional Interface;
interface MyfuncInterface {
     void thismeth();
}

class NewPhone extends Phone implements MyfuncInterface{
    @Override //it shows that ive override the method showTime from class Phone;-->It also use if we just made a spelling mistake while writing the methodname;
    public void showTime() {
        System.out.println("Time is not 8 am,Its 8 pm");
    }
    @Override
    public void on() {
        super.on();
    }
    public void thismeth(){
        System.out.println("I am MyfuncInterface Method ");
    }
    @Deprecated
    public int sum(int a ,int b){
        return a+b;
    }

}
public class Annotationsdemo {
    @SuppressWarnings("deprecation") //to Supress Warnings of runtime Errors --> here int this case deprecation issue solved by annotation of @SupressWarnings;
    public static void main(String[] args) {

        NewPhone p1 = new NewPhone();
        //p1.showTime();
       // p1.on();
        p1.thismeth();

        System.out.println(p1.sum(6,7));


    }
}
