package edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9_mapToInt {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 5, 8.1);
        Student st2 = new Student("Zaur", 'm', 19, 3, 9.1);
        Student st3 = new Student("Elena", 'f', 18, 1, 6.66);
        Student st4 = new Student("Petr", 'm', 20, 2, 9.66);
        Student st5 = new Student("Maria", 'm', 25, 5, 5.66);

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);

        System.out.println("Our students: " + studentsList);
        System.out.println("---------");
        System.out.println("");

        System.out.println("Работаем с методом mapToInt (возвращает IntStream)");

        List<Integer> courses = studentsList.stream()
                .mapToInt(e -> e.getCourse()) // Выражение должно возвращать int
                .boxed() // метод оборачивает int в Integer
                .collect(Collectors.toList());
        System.out.println(courses);
        System.out.println("---------");
        System.out.println("");


        System.out.println("Работаем с методами работающими с IntStream");

        int sum =  studentsList.stream()
                .mapToInt(e -> e.getCourse()) // Выражение должно возвращать int
                .sum();
        System.out.println("mapToInt.sum = " + sum);

        double average =  studentsList.stream()
                .mapToInt(e -> e.getCourse()) // Выражение должно возвращать int
                .average() // Возвращает OptionalDouble
                .getAsDouble(); //Поэтому работаем через get
        System.out.println("mapToInt.average = " + average);


        int min =  studentsList.stream()
                .mapToInt(e -> e.getCourse()) // Выражение должно возвращать int
                .min() // Возвращает OptionalInt
                .getAsInt(); //Поэтому работаем через get
        System.out.println("mapToInt.min = " + min);

        int max =  studentsList.stream()
                .mapToInt(e -> e.getCourse()) // Выражение должно возвращать int
                .max() // Возвращает OptionalInt
                .getAsInt(); //Поэтому работаем через get
        System.out.println("mapToInt.max = " + max);
    }
}
