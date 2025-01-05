package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(3); //add() method can add elements in arraylist
        List1.add(4);
        List1.add(7);
        List1.add(5);
        List1.add(6);
        List1.add(7);

        //List1.add(5,8); //--> Adding element in the list by customizing the index of it (like where to place it in the list1);

        //List1.remove(2); //Here remove() method uses for Removing an element as giving the input of its indexno.;

        //System.out.println(List1.contains(4)); //--> Here,The contains() method use for to check whether the given element is there or not in the list1 by displaying True/False(boolean response);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(20);
        List2.add(30);
        List2.add(40);
        List2.add(50);


        List1.addAll(0,List2);//--> This addAll() method can merge two array list as one(by giving index too);

        System.out.println(List1.indexOf(50));//--> indexOf() Method tells the element you are searching, its indexno.;
        System.out.println(List1.lastIndexOf(7));// --> its starts its searching from last index of an arraylist
        List2.toArray(new Object[5]);
        //System.out.println(List2.clone()); // It just makes a Clone of The ArrayList and put in box;

        //List1.removeIf(number->(number % 2==0));//Using removeIf() method to remove
        // after dividing by 2 and remainder gets 0.

        for (int i = 0; i < List1.size(); i++) {
            System.out.print(List1.get(i));
            System.out.print(", ");
        }
    }

}
