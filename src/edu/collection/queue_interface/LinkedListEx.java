package edu.collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

    public static void main(String[] args) {

        System.out.println("Queue<String> queue = new LinkedList<>();");

        Queue<String> queue = new LinkedList<>();

        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mariya");
        queue.offer("Alexandr");

        System.out.println("");
        System.out.println("Пример метода offer - добавляет элемент в очередь как и метод add, " +
                        "\nно в отличии от add не выбрасывает исключение при переполнении очереди, " +
                "\nа производит смещение элементов в очереди по методу FIFO (выглядит как смещение вверх)");
        System.out.println(queue);

        System.out.println("");
        System.out.println("Пример метода remove - удаляет первый элемент в очереди (по FIFO)." +
                "\nВыбрасывает исключение NoSuchElementException в случае если очередь пуста" +
                "\nМетод используется без параметров" +
                "\nSystem.out.println(queue.remove());");
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println("");
        System.out.println("Пример метода poll - удаляет первый элемент в очереди (по FIFO)." +
                "\nНЕ выбрасывает исключений в случае если очередь пуста (возвращает null)" +
                "\nМетод используется без параметров" +
                "\nSystem.out.println(queue.poll()); //запускаем 5 раз");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);

        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Mariya");
        queue.offer("Alexandr");

        System.out.println("");
        System.out.println("Пример метода element - возвращает первый элемент в очереди." +
                "\nВыбрасывает исключение NoSuchElementException в случае если очередь пуста" +
                "\nSystem.out.println(queue.element());");
        System.out.println(queue.element());

        System.out.println("");
        System.out.println("Пример метода peek - возвращает первый элемент в очереди." +
                "\nНЕ выбрасывает исключений в случае если очередь пуста (возвращает null)" +
                "\nSystem.out.println(queue.peek());");
        System.out.println(queue.peek());

        System.out.println("");
        System.out.println("Пример метода remove - удаление конкретного элемента в очереди." +
                "\nВ случае частых удалений, лучше использовать другие коллекции, так как queue больше предназначен для реализации очереди");
        System.out.println(queue);
        System.out.println("queue.remove(\"Ivan\");");
        queue.remove("Ivan");
        System.out.println(queue);


    }
}
