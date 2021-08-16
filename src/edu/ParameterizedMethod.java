package edu;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(21);
        al1.add(45345);
        al1.add(43444);

        System.out.println(GenMethod.getSecondValue(al1));

        ArrayList<String> al2= new ArrayList<>();
        al2.add("Jphn");
        al2.add("dfgdfg");
        al2.add("44444444");

        System.out.println(GenMethod.getSecondValue(al2));
    }
}

class GenMethod {

    public static <T> T getSecondValue (ArrayList<T> al) {
        return al.get(1);
    }
}