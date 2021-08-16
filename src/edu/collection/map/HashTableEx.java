package edu.collection.map;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {

        Hashtable <Double, Student> hashtable = new Hashtable<>();

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Smirnova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 1);


        hashtable.put(5.8, st1);
        hashtable.put(6.4, st2);
        hashtable.put(7.2, st3);

        //hashtable.put(7.5, null); // ошибка, не может содержать null
        //hashtable.put(null, st4);// ошибка, не может содержать null

        System.out.println(hashtable);
    }
}
