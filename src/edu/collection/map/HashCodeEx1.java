package edu.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Smirnova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);

        map.put(st1,7.5);
        map.put(st2,8.7);
        map.put(st3,9.2);
        System.out.println(map);

        Student st4 = new Student("Zaur", "Tregulov", 3);//создаем объект с таким же набором данных
        boolean result = map.containsKey(st4); //проверяем есть ли такой объект в HashMap
        System.out.println("result (HashCode) = " + result);//результат положительный, так как hashcode переопределен
        // (equals тоже должен быть обязательно переопределен, иначе не сработает)
        System.out.println("result (equals) = " + st1.equals(st4)); // результат положительный, так как метод equals переопределен

        Student st5 = new Student("Igor", "Sidorov", 4);//создаем объект с таким же набором данных
        System.out.println("hashCode st1 = " + st1.hashCode());
        System.out.println("hashCode st5 = " + st4.hashCode());

        System.out.println("!!!!");
        System.out.println("Пример mapEntry");

        for(Map.Entry<Student,Double> entry: map.entrySet()) {

            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);

    }

}

class Student implements Comparable<Student> {
    private String name;

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    private String surname;
    private int course;

    @Override
    public String toString() {
        return "Student{" +
                "\n name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
        //return name.length()*7 + surname.length()*11 + course*53;
    }
}

