package edu.lambda;

import java.util.ArrayList;
import java.util.List;
import  java.util.function.Function;

public class FunctionIntEx {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        System.out.println("Пример реализации интерфейса Function для вычислений");


        Function<Student, Double> f1 = (st) ->st.avgGrade;
        System.out.println("AvgGrade = " + avgOfSomething(students, f1));

        f1 = (st) ->(double) st.course;
        System.out.println("AvgCourse = " + avgOfSomething(students, f1));

        f1 = (st) ->(double) st.age;
        System.out.println("AvgAge = " + avgOfSomething(students, f1));
    }

    private static double avgOfSomething (List<Student> studentList, Function<Student, Double> function) {

        double result = 0;

        for(Student s: studentList) {

            result += function.apply(s); // суммируем все значения, возвращаемые методом apply интерфейса Function
        }

        result = result / studentList.size(); //Вычисляем среднее значение

        return result;
    }

}
