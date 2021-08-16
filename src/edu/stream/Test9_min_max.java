package edu.stream;

import java.util.ArrayList;
import java.util.List;

public class Test9_min_max {
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

        System.out.println("Работаем с методом limit (промежуточный метод, ограничевает количество в потоке)");
        studentsList.stream()
                .sorted((x, y) -> x.getAge() - y.getAge())
                .limit(3)
                .forEach(System.out::println);
        System.out.println("---------");
        System.out.println("");


        System.out.println("Работаем с методом skip (промежуточный метод, пропускает заданное количество элементов в потоке)");
        studentsList.stream()
                .sorted((x, y) -> x.getAge() - y.getAge())
                .skip(4) //пропускаем первые 4 элемента
                .forEach(System.out::println);


        System.out.println("---------");

        System.out.println("");

        System.out.println("Работаем с методами min и max");

        Student minGradeStudent = studentsList.stream().min((x,y)-> (int) (x.getAvgGrade()- y.getAvgGrade())).get();

        System.out.println("minGradeStudent: " + minGradeStudent);

        Student maxGradeStudent = studentsList.stream().max((x,y)-> (int) (x.getAvgGrade()- y.getAvgGrade())).get();

        System.out.println("maxGradeStudent: " + maxGradeStudent);
    }
}
