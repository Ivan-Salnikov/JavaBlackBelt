package edu.collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        /*
        HashSet - это коллекция в основе которой лежит HashMap, но без ключей.
        Фактически HashSet - это HashMap, у которого вместо ключа находится одна и та же константа.
        Все элементы данной коллекции должны быть уникальны.
        В HashSet нет метода get, так как этот метод работает по ключу, которого нет в HashSet

         */

        System.out.println("Set<String> set  = new HashSet<>(); // создаем HashSet из String");
        Set<String> set  = new HashSet<>();

        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");

        set.add("Igor"); // повторное значение не добавляется

        //set.add(null); // null добавляется

        for(String s : set) {
            System.out.println(s);
        }

        System.out.println("Removing Zaur");
        set.remove("Zaur");

        System.out.println(set);

        System.out.println("set.size() = " + set.size());
        System.out.println("set.contains(Misha) = " + set.contains("Misha"));

        System.out.println("");
        System.out.println("Set<Integer> set2  = new HashSet<>(); // создаем HashSet из Integer");
        Set<Integer> set2  = new HashSet<>(); // создаем HashSet из Integer

        set2.add(5);
        set2.add(2);
        set2.add(3);
        set2.add(1);
        set2.add(8);

        System.out.println(set2);

        System.out.println("Set<Integer> set3  = new HashSet<>(); // создаем HashSet из Integer");
        Set<Integer> set3  = new HashSet<>(); // создаем HashSet из Integer

        set3.add(7);
        set3.add(4);
        set3.add(3);
        set3.add(5);
        set3.add(8);

        System.out.println(set3);

        System.out.println("");
        System.out.println("Set<Integer> unionSet  = new HashSet<>(set2); // создаем HashSet из Integer, путем передачи в конструктор множества set2");
        Set<Integer> unionSet  = new HashSet<>(set2); // создаем HashSet из Integer, путем передачи в конструктор множества set2

        System.out.println("unionSet = " + unionSet);

        unionSet.addAll(set3); // добавляем в unionSet все данные из set3
        System.out.println("unionSet.addAll(set3); // добавляем в unionSet все данные из set3");
        System.out.println("unionSet = " + unionSet);


        System.out.println("");
        System.out.println("Set<Integer> intersectSet  = new HashSet<>(set2); // создаем HashSet из Integer, путем передачи в конструктор множества set2");
        Set<Integer> intersectSet  = new HashSet<>(set2); // создаем HashSet из Integer, путем передачи в конструктор множества set2

        System.out.println("intersectSet = " + intersectSet);

        intersectSet.retainAll(set3); // вычисляем пересечение множеств intersectSet и set3
        System.out.println("intersectSet.retainAll(set3); // вычисляем пересечение множеств intersectSet и set3");
        System.out.println("intersectSet = " + intersectSet);


        System.out.println("");
        System.out.println("Set<Integer> subtractSet  = new HashSet<>(set2); // создаем HashSet из Integer, путем передачи в конструктор множества set2");
        Set<Integer> subtractSet  = new HashSet<>(set2); // создаем HashSet из Integer, путем передачи в конструктор множества set2
        System.out.println("subtractSet = " + subtractSet);
        subtractSet.removeAll(set3); // вычисляем разность множеств subtractSet и set3 (то есть оставляем в множестве subtractSet только то, чего нет в множестве set3)
        System.out.println("subtractSet.removeAll(set3); // вычисляем разность множеств subtractSet и set3 (то есть оставляем в множестве subtractSet только то, чего нет в множестве set3)");
        System.out.println("subtractSet = " + subtractSet);





    }
}
