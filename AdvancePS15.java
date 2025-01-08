package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class AdvancePS15 {
    public static void main(String[] args) {
        //Problem 1 :- ArrayList
/*
        ArrayList<String> student = new ArrayList<>();
        student.add("Rishi");
        student.add("Mihir");
        student.add("Raj");
        student.add("Sarvesh");
        student.add("Harry");
        student.add("Mike");
        student.add("Sam");
        student.add("Justin");
        student.add("Sadie");
        student.add("Millie");

        for(String s : student){
            System.out.println(s);
        }

 */

        //-->Problem 2 : using Date class:-
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()); // In the date class , This Methods are deprecated now!

        //-->Problem 3 : using Calendar class ,repeat problem 2;
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //-->Problem 4 : using java time API :
        LocalDateTime Lt  = LocalDateTime.now(); // This is time!

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh-mm-ss");
        String mytime = Lt.format(df);
        System.out.println(mytime);

        //Problem 5 : hashset problem to check if duplicate value is stored in set has only one instance;
        HashSet<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(30);
        System.out.println(hs); // So yes it stores only one instance of the object.It does not store duplicate of it!

    }
}
