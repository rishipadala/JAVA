package com.company;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();

        hs1.add("India");
        hs1.add("Japan");
        hs1.add("USA");
        hs1.add("Japan");// Here, Japan will get ignored! --> Unique Values
        hs1.add("Australia");

        System.out.println(hs1.size());
        System.out.println(hs1);




    }
}
