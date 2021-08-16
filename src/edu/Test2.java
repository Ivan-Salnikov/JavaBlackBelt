package edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List <Employee> list = new ArrayList<>();

        Employee empl1 = new Employee(100, "Zaur", "Treulov", 12345);
        Employee empl2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee empl3 = new Employee(120, "Ivan", "Sidorov", 8542);

        list.add(empl1);
        list.add(empl2);
        list.add(empl3);

        System.out.println("Before sorting\n " + list);

        Collections.sort(list);

        System.out.println("After sorting\n " + list);
    }
}


class Employee implements Comparable <Employee> {

    int id;
    String name;
    String surname;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {

//        if (this.id > anotherEmp.id) {
//            return 1;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 0;

        return this.id - anotherEmp.id;


        }
    }
