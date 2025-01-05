package com.company;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> List1 = new LinkedList<>();
        List1.add(3); //add() method can add elements in Linkedlist;
        List1.add(4);
        List1.add(7);
        List1.add(5);
        List1.add(6);
        List1.add(7);

        List1.offer(5);//Adding the Element as the tail(at Last node) of linkedlist

        List1.offerFirst(20);//Adding the Element As the Head (First) of Linked List.

        //System.out.println(List1.peek());//peeking the first element of the linkedlist;
        //System.out.println(List1.peekFirst());
        //System.out.println(List1.peekLast());

        //System.out.println(List1.poll()); // pulling out the head element of the linkedlist from list1;
        //System.out.println(List1.pollLast());// pulling out the last element(tail) of the linkedList from List1;


        //List1.push(50);//pushing the element in the stack of the List1.
        //System.out.println(List1.pop());// pop out the head element from the stack of linkedlist;


        for (int i = 0; i < List1.size(); i++) {
            System.out.print(List1.get(i));
            System.out.print(", ");
        }


    }
}
