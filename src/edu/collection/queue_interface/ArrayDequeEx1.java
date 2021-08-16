package edu.collection.queue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx1 {
    public static void main(String[] args) {

        System.out.println("Deque - double ended queue, то есть двунаправленная очередь" +
                "\nЭлементы могут добавляться как в начало, так и в конец очереди" +
                "\nЭлементы могут удаляться как из начала, так и из конца очереди" +
                "\nТо есть очередь может реализовывать как FIFO, так и LIFO" +
                "\nИнтерфейс очереди реализовывается классами LinkedList и ArrayDeque" +
                "\n");

        Deque<Integer> deque = new ArrayDeque<>();

        System.out.println("Используем методы addFirst, addLast, offerFirst, offerLast");
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);

        System.out.println("Используем методы removeFirst, removeLast, pollFirst, pollLast");
        System.out.println("Вывод getFirst = " + deque.getFirst());
        System.out.println("Вывод getLast = " + deque.getLast());
        System.out.println("Удаление removeFirst = " + deque.removeFirst());
        System.out.println(deque);
        System.out.println("Вывод peekFirst = " + deque.peekFirst());
        System.out.println("Вывод peekLast = " + deque.peekLast());

        System.out.println("Удаление removeLast = " + deque.removeLast());
        System.out.println(deque);
        System.out.println("Удаление pollFirst = " + deque.pollFirst());
        System.out.println(deque);
        System.out.println("Удаление pollLast = " + deque.pollLast());
        System.out.println(deque);




    }
}
