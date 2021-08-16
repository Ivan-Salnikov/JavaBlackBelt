package edu.stream;

import java.util.ArrayList;
import java.util.List;

public class Test7_flatMap {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 5, 8.1);
        Student st2 = new Student("Zaur", 'm', 19, 3, 9.1);
        Student st3 = new Student("Elena", 'f', 18, 1, 6.66);
        Student st4 = new Student("Petr", 'm', 20, 2, 9.66);
        Student st5 = new Student("Arkasha", 'm', 25, 5, 5.66);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);

        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        System.out.println("Метод flatMap - используется когда нужно работать с объектами, которые находятся в других объектах" +
                "\n" + "В данном случае мы выводим список имен всех студентов на всех факультетах");

        facultyList.stream() //для списка факультетов
                .flatMap(faculty -> faculty.getStudentsOnFaculty() //сначала для первого факультета из List, затем для второго
                        .stream())  //объединили всех студентов из факультета в поток (сначала из первого, затем из второго)
                .forEach(e -> System.out.println(e.getName())); // для каждого из студентов вывели его имя (сначала из первого, затем из второго)

    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}
