package edu.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5_sorted {
    public static void main(String[] args) {

        int[] array = {3,8,1,5,9,12,4,21,81,7,18};

        System.out.println(Arrays.toString(array));

        array = Arrays.stream(array)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(array));

        //Рассматриваем цепочку методов
        int result = Arrays.stream(array) // создаем поток из массива //[1, 3, 4, 5, 7, 8, 9, 12, 18, 21, 81]
                .filter(e -> e % 2 == 1) // фильтруем, оставляя только нечетные элементы //[1, 3, 5, 7, 9, 21, 81]
                .map(e -> { // для каждого элемента проверяем делимость на 3 //
                    if (e % 3 == 0) {
                        e = e / 3; // если делится, то выводим результат деления на 3 //
                    }
                    return e; // возвращаем [1, 1, 5, 7, 3, 7, 27]
                })
                .reduce((a, e) -> a + e) //складываем все элементы между собой // 51
                .getAsInt(); //Приводим поток к int

        System.out.println(result);

        System.out.println("----------");

        System.out.println("");

        Student st1 = new Student("Ivan", 'm', 22, 5, 8.1);
        Student st2 = new Student("Zaur", 'm', 19, 3, 9.1);
        Student st3 = new Student("Elena", 'f', 18, 1, 6.66);
        Student st4 = new Student("Petr", 'm', 20, 2, 9.66);
        Student st5 = new Student("Maria", 'f', 25, 5, 5.66);

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
        studentsList.add(st4);
        studentsList.add(st5);

        System.out.println(studentsList);

        //studentsList = studentsList.stream().sorted().collect(Collectors.toList()); //Выходит ошибка, так как нет Comparator

        studentsList = studentsList.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList()); //Добавили Comparator через лямбда выражение

        System.out.println(studentsList);

        System.out.println("----------");

        System.out.println("");

        System.out.println("Делаем цепочку из методов stream над списком Student" +
                "\n" + "Имена сделать заглавными буквами" +
                "\n" + "Отфильровать по полу `f`" +
                "\n" + "Отсортировать по возрасту");
        System.out.println("");

//        studentsList.stream()
//                .forEach(e -> e.setName(e.getName().toUpperCase())); //Имена сделать заглавными буквами/ можно было и так, но forEach - это финальный метод, может быть только в конце chaining


        studentsList.stream()
                .map(element -> {
                    element.setName(element.getName() //Имена сделать заглавными буквами
                            .toUpperCase());
                    return element;
                })
                .filter(e -> e.getSex() == 'f') //Отфильровать по полу `f`
                .sorted((x, y) -> x.getAge() - y.getAge()) // Отсортировать по возрасту"
                .forEach(el -> System.out.println(el)); // вывести каждый элемент на экран

        System.out.println("--------------");

        System.out.println("");
        System.out.println("Работаем с методом findFirst (выводит первый элемент на экран), метод терминальный");
        System.out.println("Отфильровать по полу `f`" +
                "\n" + "Отсортировать по возрасту" +
                "\n" + "Вывести первого");

        Student firstStudent = studentsList.stream() //Присваиваем результат потока (Optional.get) переменной
                .filter(e -> e.getSex() == 'f') //Отфильровать по полу `f`
                .sorted((x, y) -> x.getAge() - y.getAge()) // Отсортировать по возрасту"
                .findFirst().get(); // Выводим первого студента

        System.out.println(firstStudent);

        //System.out.println(studentsList);
    }
}
