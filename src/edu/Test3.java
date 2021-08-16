package edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List <Employee2> list = new ArrayList<>();

        Employee2 empl1 = new Employee2(100, "Zaur", "Treulov", 12345);
        Employee2 empl2 = new Employee2(15, "Ivan", "Petrov", 6542);
        Employee2 empl3 = new Employee2(120, "Ivan", "Sidorov", 8542);

        list.add(empl1);
        list.add(empl2);
        list.add(empl3);

        System.out.println("Before sorting\n " + list);

        Collections.sort(list);

        System.out.println("After sorting by Id\n " + list);


        Collections.sort(list,new nameComparator());
        System.out.println("After sorting by Name\n " + list);

        Collections.sort(list,new salaryComparator());
        System.out.println("After sorting by salary\n " + list);
    }
}


class Employee2 implements  Comparable<Employee2>{

    int id;
    String name;
    String surname;
    int salary;

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {

//        if (this.id > anotherEmp.id) {
//            return 1;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 0;

        return this.id - anotherEmp.id;


        }
}

    class IdComparator implements Comparator<Employee2> {

        @Override
        public int compare(Employee2 emp1, Employee2 emp2) {
            if (emp1.id > emp2.id) {
                return 1;
            } else if (emp1.id < emp2.id) {
                return -1;
            } else {
                return 0;

            }
        }
    }

class nameComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {

        return emp1.name.compareTo(emp2.name);
    }
}

class salaryComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {

        return emp1.salary - emp2.salary;
    }
}