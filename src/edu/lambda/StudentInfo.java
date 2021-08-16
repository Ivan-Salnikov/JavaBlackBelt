package edu.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;


public class StudentInfo {

    void testStudents (ArrayList<Student> al, StudentChecks sc ) {

        for(Student s: al) {

            if (sc.check(s)) {
                System.out.println(s);
            }
        }

    }

    //Используем функциональный интерфейс Predicate
    void testStudentsByPredicate (ArrayList<Student> al, Predicate<Student> ps ) {

        for(Student s: al) {

            if (ps.test(s)) {
                System.out.println(s);
            }
        }

    }



}

class Test {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        System.out.println("Передаем в объект StudentInfo " +
                "\n info.testStudents(students, new CheckOverGrade());" +
                "\n" + "CheckOverGrade реализует интерфейс StudentChecks и оверрайдид метод check" );
        info.testStudents(students, new CheckOverGrade());//
        System.out.println("Так делать можно, но не красиво, т.к. приходится для каждого условия прописывать свой класс");

        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Используем анонимный класс " +
                "\n" + "info.testStudents(students, new StudentChecks() {@override check}" +
                "\n" + "То есть мы передаем в метод сразу интерфейс и тут же оверрайдим метод" +
                "\n" + "При этом создается анонимный класс");
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("Так делать можно, но тоже прописывается много информации...");


        System.out.println("---------------------");
        System.out.println("");
        System.out.println("ЛЯМБДА!ЛЯМБДА!ЛЯМБДА!ЛЯМБДА! " +
                "\n" + "Используем лямбда выражение " +
                "\n" + "info.testStudents(students, (Student s) -> {return s.age > 30;});");
        info.testStudents(students, (Student s) -> {return s.age > 30;});
        System.out.println("Так получится сделать, если интерфейс StudentChecks является функциональным," +
                "\n" + "то есть содержит всего один абстрактный метод");
        System.out.println("---------------------");
        System.out.println("");

        System.out.println("Прописываем через лямбда выражения остальные фильтрации студентов");
        System.out.println("info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});");
        info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});
        System.out.println("");

        System.out.println("Множественные условия");
        System.out.println("info.testStudents(students, (Student s) -> {return s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f';});");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.5 && s.sex == 'f';
        });
        System.out.println("---------------------");

        System.out.println("");
        System.out.println("Делаем самую короткую запись лямбда выражений");
        System.out.println("info.testStudents(students, p -> p.avgGrade > 8);");
        info.testStudents(students, p -> p.avgGrade > 8);
        System.out.println("info.testStudents(students, p -> (p.age > 20 && p.avgGrade < 9.5 && p.sex == 'f'));");
        info.testStudents(students, p -> (p.age > 20 && p.avgGrade < 9.5 && p.sex == 'f'));

        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Вынос лямбда выражения в переменную с типом интерфейса");
        System.out.println("Создаем переменную, в значение которой прописываем лямда выражение: " + "StudentChecks sc = (Student p) -> {return p.sex == 'f';};");
        StudentChecks sc = (Student p) -> {return p.sex == 'f';};
        System.out.println("Запускаем метод, передавая в качестве параметра переменную " + "info.testStudents(students, sc);");
        info.testStudents(students, sc);


        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Используем сортировку объектов. Для этого раньше нам нужно было либо имплементировать интерфейс Comparable");
        System.out.println("Либо передавать в метод Comparator, например так");
        System.out.println("Collections.sort(students, new Comparator<Student>()" +
                "\n" + "И в нем оверрайдидь метод compare ( в данном случае через анонимный класс)");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println("Сортируем по курсу");
        System.out.println(students);
        System.out.println("---------------------");
        System.out.println("");

        System.out.println("Делаем сортировку объектов через лямбда выражение");
        Collections.sort(students, (s1, s2) -> s1.course - s2.course);
        System.out.println(students);
        System.out.println("---------------------");

        System.out.println("");
        System.out.println("Используем интерфейс Predicate для фильтрации");
        System.out.println("info.testStudentsByPredicate(students, p -> p.avgGrade < 7);");
        info.testStudentsByPredicate(students, p -> p.avgGrade < 7);
        System.out.println("---------------------");

        System.out.println("");
        System.out.println("Используем интерфейс Predicate для фильтрации через переменные типа Predicate<Student>");
        System.out.println("Predicate<Student> p1 = student -> student.avgGrade > 7.5;");
        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        System.out.println("info.testStudentsByPredicate(students,p1);");
        info.testStudentsByPredicate(students,p1);
        System.out.println("");
        System.out.println("Predicate<Student> p2 = student -> student.sex == 'm';\n" +
                "        info.testStudentsByPredicate(students,p2);");
        Predicate<Student> p2 = student -> student.sex == 'm';
        info.testStudentsByPredicate(students,p2);

        System.out.println("");
        System.out.println("Объединяем две проверки методом and (выводятся только те, которые удовлетворяют обоим условиям p1 и p2)");
        System.out.println("info.testStudentsByPredicate(students, p1.and(p2));");
        info.testStudentsByPredicate(students, p1.and(p2));

        System.out.println("");
        System.out.println("Объединяем две проверки методом or (выводятся те, которые удовлетворяют условию p1 или условию p2)");
        System.out.println("info.testStudentsByPredicate(students, p1.or(p2));");
        info.testStudentsByPredicate(students, p1.or(p2));

        System.out.println("");
        System.out.println("Используем метод negate для вывода тех, кто не удовлетворяет условию p1");
        System.out.println("info.testStudentsByPredicate(students, p1.negate());//grade > 7.5");
        info.testStudentsByPredicate(students, p1.negate());


    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}