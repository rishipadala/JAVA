package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTimerough {
    public static void main(String[] args) {
//        LocalTime Lt = LocalTime.now();
//        System.out.println(Lt);
//*-->LocalTime plusHours(long hoursToAdd) :returns a copy of the LocalTime but with the specified number of hours added.
//        LocalTime lt2 = LocalTime.of(12,20,5);
//        System.out.println("Time Before : "+ lt2);
//
//        LocalTime lt3 = lt2.plusHours(12);
//        System.out.println("Time after adding 12 hours : "+ lt3);

//*-->LocalTime minusMinutes(long minutesToSubtract):
//        LocalTime lt4 = LocalTime.of(12,30);
//        System.out.println("Time Before : "+lt4);

//        LocalTime lt5 = lt4.minusMinutes(10);
//        System.out.println("Time After 10 Subtracting 10 min: "+ lt5);


//        LocalDate Ld = LocalDate.now();
//        System.out.println(Ld);

//*--> withYear(int Year) : This method returns a copy of the LocaleDate but alters the year with the value of year passed as argument.
//        LocalDate ld2 = LocalDate.parse("2025-01-07");
//        System.out.println(ld2.withYear(2026));

//        LocalDateTime Ldt = LocalDateTime.now();
//        System.out.println(Ldt);


        //Clock cl = Clock.systemDefaultZone();
        //System.out.println(cl.getZone()); // GetZones

        //*--> abstract Instant instant() : This methods returns the current instant of the clocks
        //System.out.println(cl.instant());

        //** Duration Class: This class is used to measure time in seconds and nanoseconds.
        //boolean isNegative() : This method is used to check if the duration is negative.

//        Duration dr = Duration.between(LocalTime.MIN,LocalTime.NOON); //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00'
//        System.out.println(dr.isNegative());
//
//        Duration dr1 = Duration.between(LocalTime.MAX,LocalTime.MIDNIGHT);
//        System.out.println(dr1.isNegative());
//
////        isZero() : This method is used to check if the duration is zero.
//        Duration dr2 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);
//        System.out.println(dr2.isZero()); //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00' aur agar ek bhi zero nahi tho false;
//        System.out.println(LocalTime.MAX);
//        System.out.println(LocalTime.MIN);
//        System.out.println(LocalTime.MIDNIGHT);
//        System.out.println(LocalTime.NOON);



        //****--> DateTimeFormatter -- Same goes oflocalizedTime,oflocalizedDateTime,etc. <---****

        //System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(Ld));
        //System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(Ld));
        //System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(Ld));

        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E D u"); // This is the format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter df3 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter df4 = DateTimeFormatter.ISO_ORDINAL_DATE; //Returns the year and day of the year.
        DateTimeFormatter df5 = DateTimeFormatter.ISO_WEEK_DATE; //Returns the number of weeks and year.

        String myDate = dt.format(df5); // Creating date string using date and format
        System.out.println(myDate);













    }
}
