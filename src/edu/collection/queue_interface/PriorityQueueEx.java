package edu.collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        System.out.println("PriorityQueue - специальный вид очереди, в которой используется тот элемент, приоритет которого выше" +
                "\n(в соответствии с натуральной сортировкой либо заданной через Comparable Interface или Comparator)." +
                "\n!!!! Наивысший приоритет у НАИМЕНЬШЕГО элемента" +
                "\n");

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(10);
        pq.add(8);

        System.out.println(pq);
        System.out.println("Обращаем внимание, что при выводе на экран очередь не упорядочена");

        System.out.println("Выводим элемент с наивысшим приоритетом pq.peek()");
        System.out.println(pq.peek());

        System.out.println("Удаляем элементы методом remove (без параметров)");
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);

    }
}
