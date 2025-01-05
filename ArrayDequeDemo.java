package com.company;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> Ad1 = new ArrayDeque<>();
        Ad1.add(3); //add() method can add elements in Linkedlist;
        Ad1.add(4);
        Ad1.add(7);
        Ad1.add(5);
        Ad1.add(6);
        Ad1.add(7);

        System.out.println(Ad1);
        Ad1.offer(5);
        System.out.println(Ad1); // Offer in last

        Ad1.pollLast();
        System.out.println(Ad1);

        System.out.println(Ad1.contains(7));

        System.out.println(Ad1.getFirst());

        //Same As Linked List!

    }
}
