package com.company;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarRough {
    public static void main(String[] args) {
/*
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getCalendarType()); //Gregory Calendar is nothing but normal Calendar;

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getTimeZone().getID());
        System.out.println(c1.getCalendarType());


        *--> get(int field) method:-returns the value of the specified calendar field.

        Calendar c2 = Calendar.getInstance();
        System.out.println("Current year is :"+ c2.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c2.get(Calendar.MONTH));// 0 is jan & 11 is Dec! //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c2.get(Calendar.DAY_OF_WEEK)); // sunday is 1 ,monday is 2...
        System.out.println("Current hour is :"+ c2.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c2.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c2.get(Calendar.SECOND));

        *-->add(int field, int amount):-useful for calculating the time after or before of a specified calendar field.

        Calendar c3 = Calendar.getInstance();
        System.out.println("Current date is : " + c3.getTime());
        c3.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c3.getTime());
        c3.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c3.getTime());
        c3.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c3.getTime());
        c3.add(Calendar.DAY_OF_MONTH,3);
        System.out.println("After 3 days of the month : "+ c3.getTime());
        c3.add(Calendar.DAY_OF_WEEK,6);
        System.out.println("After 6 days of the week in same month : "+ c3.getTime());

              *-->getWeeksInWeekYear()-->Return the total number of weeks in a year;

        Calendar c4 = Calendar.getInstance();
        System.out.println(c4.getWeeksInWeekYear()); //Tells total number of weeks present in a year!

        //*-->getMaximum(int field)-->Returns the maximum value for the specified calendar field.

        Calendar c5 = Calendar.getInstance();
        System.out.println("The Maximum No. of Days in a Year: "+ c5.getMaximum(Calendar.DAY_OF_YEAR));

        System.out.println(c5.isLenient());

*/

        //-->GregorianCalendar class :
        GregorianCalendar gcal = new GregorianCalendar();

        // Leapyear or not!
//        System.out.println(gcal.isLeapYear(2020));
//        System.out.println(gcal.isLeapYear(2019));


/*        roll(int field, boolean up) :
 *        This method adds/subtracts a single unit of time from the specified time field.
 *        true = rolls up the value by 1.
 *        false = rolls down the value by 1.
 */

//        System.out.println("Date before rolling : " + gcal.getTime());
//
//        gcal.roll(Calendar.MONTH, true);// rolls up by 1  i.e., Jan --> Feb;
//        gcal.roll(Calendar.DATE, false);//rolls down value by 1  i.e., 07--> 06;
//        gcal.roll(Calendar.YEAR, true); // rolls up value by 1  i.e., 2025 --> 2026;
//
//        System.out.println("Date after rolling : " + gcal.getTime());



        //*-->hashcode() :-
//        System.out.println("Calendar : " + gcal.getTime());
//
//        System.out.println("The hashcode for this calendar is : "+ gcal.hashCode());

        //getAvailableIds():-

        //System.out.println(TimeZone.getAvailableIDs()[0]);

        for (int i = 0; i < TimeZone.getAvailableIDs().length; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }












    }
}
