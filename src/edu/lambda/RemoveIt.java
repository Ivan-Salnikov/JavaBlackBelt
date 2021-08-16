package edu.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIt {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("OK");
        al.add("Uchim Java");
        al.add("A imenno lamdas");

        System.out.println(al);
        System.out.println("");
        System.out.println("Используем интерфейс Predicate для фильтрации ArrayList");
        System.out.println("al.removeIf(element -> element.length() < 5);");
        al.removeIf(element -> element.length() < 5);
        System.out.println(al);
        System.out.println("----------------");
        System.out.println("");

        System.out.println("Используем интерфейс Predicate через лямбда переменную");
        Predicate<String> predicate = element -> element.length() <= 6;
        System.out.println("Predicate<String> predicate = element -> element.length() <= 6;");
        System.out.println("al.removeIf(predicate);");
        al.removeIf(predicate);
        System.out.println(al);


    }

}
