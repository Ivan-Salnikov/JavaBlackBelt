package edu.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("privet");
        list.add("kak dela?");
        list.add("ok");
        list.add("poka");

        System.out.println(list);

        System.out.println("Изучаем метод map" +
                "\n" + "который принимает в себя реализацию интерфейса Function" +
                "\n" + "map(element -> element.length())" +
                "\n" + "для каждого элемента начального List мы производим операцию и возвращаем его длину" +
                "\n" + "Метод map возвращает объект типа stream, который мы не можем присвоить напрямую переменной типа List<>" +
                "\n" + "Чтобы это сделать необходимо вызывать метод .collect(Collectors.toList()");
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(list2);

        System.out.println("------");


        System.out.println("");
        System.out.println("Работаем с массивами методом map");
        int[] array = {5,9,3,8,1};

        System.out.println(Arrays.toString(array));

        array = Arrays.stream(array).map(element ->
        {

            if(element %3 ==0) {
                element = element / 3;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));

        System.out.println("------");


        System.out.println("");
        System.out.println("Работаем с Set методом map");
        System.out.println("Создаем TreeSet " +
                "\n" + "Set<String> set = new TreeSet<>();" +
                "\n" + "TreeSet  - это  упорядоченное множество, поэтому объекты сортируются по умолчанию для String");

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");

        System.out.println(set);

        System.out.println("Передаем в новый Set<Integer> обработанный поток из предыдущего сета" +
                "\n" + "Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());");
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set2);

        System.out.println("Передаем в новый List<Integer> обработанный поток из предыдущего сета" +
                "\n" + "List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());");
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
