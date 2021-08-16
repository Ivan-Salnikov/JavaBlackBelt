package edu.collection.map;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        System.out.println("LinkedHashSet<Integer> lhs = new LinkedHashSet<>();");
        System.out.println("LinkedHashSet - запоминает порядок добавления элементов");

        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);

        System.out.println(lhs);


    }
}
