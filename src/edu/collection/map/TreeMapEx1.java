package edu.collection.map;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {

        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Smirnova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 1);
        Student st5 = new Student("Maria", "Dadikoglu", 5);
        Student st6 = new Student("Marina", "Salnikova", 3);
        Student st7 = new Student("Varvara", "Umnova", 2);
        Student st8 = new Student("Varvara", "Umnova", 2);
        Student st9 = new Student("Egor", "Salnikov", 6);

        treeMap.put(7.5, st4);
        treeMap.put(6.4, st2);
        treeMap.put(9.1, st7);
        treeMap.put(5.8, st1);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(7.8, st5);

        System.out.println(treeMap);

        System.out.println("treeMap.put(7.2, st8); // вставляется новая запись, то есть значения могут быть не уникальными");
        treeMap.put(7.2, st8); // вставляется новая запись, то есть значения могут быть не уникальными

        System.out.println("treeMap.put(9.1, st9); // перезаписывается запись с ключом = 9.1, (так же как и в hashMap)");
        treeMap.put(9.1, st9); // перезаписывается запись с ключом = 9.1, (так же как и в hashMap)

        System.out.println(treeMap);

        System.out.println("treeMap.get(6.4)");
        System.out.println(treeMap.get(6.4)); // get работает по ключу

        System.out.println("remove(5.8)");
        treeMap.remove(5.8);
        System.out.println(treeMap); // remove работает по ключу

        System.out.println("treeMap.descendingMap()"); //вывод в обратном порядке (по ключу)
        System.out.println(treeMap.descendingMap()); //вывод в обратном порядке (по ключу)

        System.out.println("treeMap.tailMap(7.3)");
        System.out.println(treeMap.tailMap(7.3));

        System.out.println("treeMap.headMap(7.3)");
        System.out.println(treeMap.headMap(7.3));

        System.out.println("treeMap.lastEntry()");
        System.out.println(treeMap.lastEntry());

        System.out.println("treeMap.firstEntry()");
        System.out.println(treeMap.firstEntry());


        System.out.println("TreeMap<Student, Double> treeMap2 -- используем в качестве ключа объекты, переопределив метод compareTo");
        TreeMap<Student, Double> treeMap2 = new TreeMap<>();

        treeMap2.put(st4, 7.5);
        treeMap2.put(st2, 6.4);
        treeMap2.put(st7, 9.1);
        treeMap2.put(st1, 5.8);
        treeMap2.put(st3, 7.2);
        treeMap2.put(st6, 8.2);
        treeMap2.put(st5, 7.8);

        System.out.println(treeMap2);

        System.out.println("!");
        System.out.println("TreeMap<Student, Double> treeMap3 ");
        TreeMap<Double, Student> treeMap3 = new TreeMap<>();

        treeMap3.put(5.8, st1);
        treeMap3.put(6.4, st2);
        treeMap3.put(7.2, st3);
        treeMap3.put(7.5, st4);
        treeMap3.put(7.8, st5);
        treeMap3.put(8.2, st6);
        treeMap3.put(9.1, st7);

        System.out.println(treeMap3);





    }
}
