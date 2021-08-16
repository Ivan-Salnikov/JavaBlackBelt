package edu.collection.map;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        System.out.println("Пример TreeSet на числа");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);

        //treeSet.add(null); // ошибка

        System.out.println(treeSet);

        System.out.println(treeSet.contains(1));

        System.out.println("");
        System.out.println("Пример TreeSet на объекты Student");
        System.out.println("Объекты обязательно должны реализовывать интерфейс Comparable либо при создании TreeSet в конструктор нужно передавать Comparator \n +" +
                "В наших объектах сравнение происходит по имени");

        TreeSet<Student> studentSet = new TreeSet<>();

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Smirnova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 1);
        Student st5 = new Student("Maria", "Dadikoglu", 5);

        studentSet.add(st1);
        studentSet.add(st2);
        studentSet.add(st3);
        studentSet.add(st4);
        studentSet.add(st5);

        System.out.println(studentSet);

        System.out.println("System.out.println(studentSet.first());");
        System.out.println(studentSet.first());

        System.out.println("System.out.println(studentSet.last());");
        System.out.println(studentSet.last());

        System.out.println("");
        System.out.println("Метод headSet выводит список объектом значение которых меньше чем передаваемый в метод объект");
        Student st6 = new Student("Kostya", "Dzhandiery", 2);
        System.out.println("Выводим список объектов, которые меньше Kostya");
        System.out.println(studentSet.headSet(st6));

        System.out.println("");
        System.out.println("Метод tailSet выводит список объектом значение которых больше (ЛИБО РАВНО!) чем передаваемый в метод объект");
        Student st7 = new Student("Igor", "Annich", 1);
        System.out.println("Выводим список объектов, которые больше либо равны Igor");
        System.out.println(studentSet.tailSet(st7));

        System.out.println("");
        System.out.println("Метод subSet выводит список объектом значение которых между показателями передаваемыми в метод объектами");
        System.out.println("Выводим список объектов, которые между Igor и Kostya");
        System.out.println(studentSet.subSet(st7,st6));
    }
}
