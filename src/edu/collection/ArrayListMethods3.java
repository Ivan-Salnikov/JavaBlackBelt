package edu.collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Ivan");

        System.out.println(arrayList1);


        System.out.println(arrayList1.indexOf("Ivan"));
        System.out.println(arrayList1.lastIndexOf("Ivan"));

        System.out.println(arrayList1.size());

        System.out.println(arrayList1.isEmpty());

        System.out.println(arrayList1.contains("Kolya"));
    }
}
