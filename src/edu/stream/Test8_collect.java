package edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8_collect {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 5, 8.1);
        Student st2 = new Student("Zaur", 'm', 19, 3, 9.1);
        Student st3 = new Student("Elena", 'f', 18, 1, 6.66);
        Student st4 = new Student("Petr", 'm', 20, 2, 9.66);
        Student st5 = new Student("Arkasha", 'm', 25, 5, 5.66);

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);

        System.out.println("Метод collect");
        System.out.println("Список студентов: " + studentsList);
        System.out.println("");
        System.out.println("Метод collect(Collectors.groupingBy(...)" +
                "\nПоменяем имена у студентов (все заглавные) и выведем список студентов сгруппированный по курсам");

        Map<Integer, List<Student>> map =  studentsList.stream() // ключ Map - это номер курса, значение - List<Student>
                .map(el -> {
                    el.setName(el.getName() //Поменяем имена у студентов (все заглавные)
                            .toUpperCase());
                    return el;
                })
                .collect(Collectors.groupingBy(el -> el.getCourse())); //метод groupingBy возвращает map

        for(Map.Entry<Integer, List<Student>> entry : map.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

        System.out.println("---");
        System.out.println("");
        System.out.println("Метод collect(Collectors.partitioningBy(...)" +
                "\nМетод позволяет разделить поток на группы по выполнению условия");

        Map<Boolean, List<Student>> map2 =  studentsList.stream() // ключ Map - это true или false (в зависимости от выполнения условия), значение - List<Student>
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 8)); //метод partitioningBy возвращает map

        for(Map.Entry<Boolean, List<Student>> entry : map2.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }
}
