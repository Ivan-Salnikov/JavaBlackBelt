package edu.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {


        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Zaur", 4);
        Student2 st3 = new Student2("Elena", 2);
        Student2 st4 = new Student2("Nikolay", 1);
        Student2 st5 = new Student2("Petr", 2);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();

        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println(student2LinkedList);
        System.out.println(student2LinkedList.get(2));

        Student2 st6 = new Student2("Katya", 5);
        Student2 st7 = new Student2("Igor", 3);
        student2LinkedList.add(st6);//добавляем в конец
        System.out.println(student2LinkedList);
        student2LinkedList.add(1,st7); // добавляем в конкретную позицию
        System.out.println(student2LinkedList);

        student2LinkedList.remove(3); // удаляем элемент из списка по индексу
        System.out.println(student2LinkedList);

    }
}

class Student2 {
    private  String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "\n Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
