package edu.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6_chaining {

    public static void main(String[] args) {

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> stream3 = Stream.of(6, 7, 8, 9, 10);

        System.out.println("Метод Concat - складывает потоки");

        Stream<Integer> stream4 = Stream.concat(stream2, stream3);

        stream4.forEach(System.out::println);
        System.out.println("----------");

        System.out.println();
        System.out.println("Метод Distinct - возвращает поток уникальных элементов");
        stream1.distinct().forEach(System.out::println);
        System.out.println("----------");

        System.out.println();
        System.out.println("Метод Count - возвращает количество элементов в потоке");

        //System.out.println(stream1.count()); // вылетает ошибка, так как поток stream1 уже ранее был завершен

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        //System.out.println(stream5.count()); //количество элементов
        System.out.println(stream5.distinct().count()); //количество уникальных элементов
        System.out.println("----------");

        System.out.println();
        System.out.println("Метод peek - интервальный метод (принимает Consumer) возвращает stream" +
                "\n" + "Интервальный метод, используется для того, чтобы посмотреть как проходит цепочка (chaining) методов");

        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream6.distinct().peek(System.out::println).count()); //Здесь peek выдал текущее состояние потока (после distinct)

    }
}
