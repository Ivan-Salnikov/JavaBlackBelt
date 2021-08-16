package edu.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Maria");
        arrayList2.add("Igor");

        System.out.println("");
        System.out.println("!!!!! removeAll method");

        arrayList1.removeAll(arrayList2); //RemoveAll - удаляет все совпадающие элементы
        System.out.println(arrayList1);

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Vasya");
        arrayList3.add("Maria");
        arrayList3.add("Kolya");

        System.out.println("");
        System.out.println("!!!!! RetainAll method");

        System.out.println(arrayList2);
        arrayList2.retainAll(arrayList3); //RetainAll - оставляет все совпадающие элементы

        System.out.println(arrayList2);

        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("Vasya");
        arrayList4.add("Maria");
        arrayList4.add("Kolya");
        arrayList4.add("Elena");


        System.out.println("");
        System.out.println("!!!!! containsAll method");

        System.out.println(arrayList3);
        System.out.println(arrayList3.containsAll(arrayList4)); // containsAll - содержит ли все элементы из другой коллекции
        System.out.println("ArrayList = " + arrayList4);

        System.out.println("");
        System.out.println("!!!!! subList method");

        List subList = arrayList4.subList(1,4); //второй индекс не входит. sublist - это не отдельный новый list, а view, то есть представление.

        System.out.println("SubList = " + subList);

        subList.add("Evgeniy");
        System.out.println("ArrayList = " + arrayList4);
        System.out.println("SubList = " + subList);

        arrayList4.add("Sveta");
        System.out.println("ArrayList = " + arrayList4);

        //System.out.println("SubList = " + subList); // Выходит ошибка, так как если вставили элемент через сам лист, то структура view порушилась.
        // И ее нужно создавать заново, либо все операции проводить через view

        System.out.println("");
        System.out.println("!!!!! toArray method");
        ArrayList<String> arrayList5 = new ArrayList<>();
        arrayList5.add("Vasya");
        arrayList5.add("Maria");
        arrayList5.add("Kolya");
        arrayList5.add("Elena");

        Object[] array = arrayList5.toArray(); // создаем массив элементов типа object из коллекции

        String[] arrayString = arrayList5.toArray(new String[0]); // создаем массив элементов типа String из коллекции

        for(String s : arrayString) {
            System.out.println(s);
        }

        System.out.println("");
        System.out.println("!!!!! List.of method");

        List<Integer> list1 = List.of(3, 8, 13); // , быстрое создание List`а из элементов, но потом в этот список ничего добавить не получится
        //List<Integer> list1 = List.of(3, 8, null); // , null содержать не может
        System.out.println(list1);

        //list1.add(100); // вылетает ошибка, так как list1 был создан методом of и поэтому является нередактируемым
        //list1.remove(1);// вылетает ошибка, так как list1 был создан методом of и поэтому является нередактируемым

        System.out.println("");
        System.out.println("!!!!! List.copyOf method");
        List<String> list2 = List.copyOf(arrayList5); // , быстрое создание List`а из другого List'а, но потом в этот список ничего добавить не получится
        System.out.println(list2);
        //list2.add("ffff"); // вылетает ошибка, так как list1 был создан методом of и поэтому является нередактируемым
        //list2.remove("Maria");// вылетает ошибка, так как list1 был создан методом of и поэтому является нередактируемым

    }
}
