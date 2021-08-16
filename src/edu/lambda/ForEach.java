package edu.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> list = List.of("Privet", "Kak dela?", "normalno", "poka!");

        System.out.println("Для прохода по циклу можно использовать стандартный for...");
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("Либо использовать метод forEach объекта list, который принимает лямбда выражение описывающего интерфейс Consumer");
        list.forEach(lst -> System.out.println(lst));
        System.out.println("--------------");

        System.out.println("");
        System.out.println("Пример использования с другим типом (Integer)");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("Our list2 = " + list2);

        list2.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });




    }
}
