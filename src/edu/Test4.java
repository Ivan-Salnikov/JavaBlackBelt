package edu;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        List<?> list = new ArrayList<Integer>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("no");
        list2.add("yes");
        showListInfo(list2);

        List<? extends Number> list30 = new ArrayList<Integer>();

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(25);
        ali.add(26);
        ali.add(27);
        System.out.println(summ(ali));

    }

    public static double summ (ArrayList<? extends Number> al) {

        double summ = 0;

        for(Number n : al) {

            summ += n.doubleValue();
        }

        return summ;

    }

    static void showListInfo (List<?> list) {

        System.out.println("List contains: " + list);
    }

}

