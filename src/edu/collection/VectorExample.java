package edu.collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Katya");

        System.out.println(vector);
        System.out.println("firstElement = " + vector.firstElement());
        System.out.println("lastElement = " + vector.lastElement());

        System.out.println("Removing index 2...");
        vector.remove(2);
        System.out.println(vector);

        System.out.println("Getting element with index 1...");
        System.out.println(vector.get(1));


    }
}
