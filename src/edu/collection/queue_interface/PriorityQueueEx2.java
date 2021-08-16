package edu.collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {

        Student st1 = new Student("Zaur", "Tregulov", 5);
        Student st2 = new Student("Maria", "Smirnova", 1);
        Student st3 = new Student("Sergey", "Petrov", 2);
        Student st4 = new Student("Igor", "Sidorov", 3);
        Student st5 = new Student("Maria", "Dadikoglu", 4);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);

        System.out.println("PriorityQueue - специальный вид очереди, в которой используется тот элемент, приоритет которого выше" +
                "\n(в соответствии с натуральной сортировкой либо заданной через Comparable Interface или Comparator)." +
                "\n!!!! Наивысший приоритет у НАИМЕНЬШЕГО элемента" +
                "\n");
        System.out.println("Выводим список объектов Student (сравнение по полю course)");
        System.out.println(priorityQueue);

        System.out.println("");
        System.out.println("Удаляем элементы с большим приоритетом методом poll");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());


    }
}

class Student implements Comparable<Student> {
    private String name;

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
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
