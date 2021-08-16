package edu.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Double,Student> lhm =
                new LinkedHashMap<>(16, 0.75f, true);
        //accessOrder = true, вывод map  в порядке использования (последний использованный элемент хранится в конце)
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Smirnova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 1);


        lhm.put(5.8, st1);
        lhm.put(7.5, st4);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);

        System.out.println(lhm);

        System.out.println("accessOrder = true, вывод map  в порядке использования (последний использованный элемент хранится в конце)");

        System.out.println("lhm.get(6.4) = " + lhm.get(6.4));
        System.out.println("lhm.get(7.5) = " + lhm.get(7.5));

        System.out.println(lhm);


    }
}
