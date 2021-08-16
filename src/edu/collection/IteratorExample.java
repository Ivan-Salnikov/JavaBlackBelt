package edu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add("Kolya");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator.hasNext()) {//В отличии от обычного for итератор возвращает элемент листа, с которым можно производить операции.
            iterator.next(); //получение элемента
            iterator.remove(); // Например удалить
        }
        System.out.println(arrayList1); // В данном случае ничего не удалилось, так как итератор находился в конце и в цикл не зашел

        while (iterator.hasNext()) {//В отличии от обычного for итератор возвращает элемент листа, с которым можно производить операции.
            iterator.next(); //получение элемента
            iterator.remove(); // Например удалить
        }
        System.out.println(arrayList1); // В данном случае ничего не удалилось, так как итератор находился в конце и в цикл не зашел

        Iterator<String> iterator2 = arrayList1.iterator();

        while (iterator2.hasNext()) {
            iterator2.next(); //получение элемента
            iterator2.remove(); // Например удалить
        }
        System.out.println(arrayList1); // Все удалилось
    }
}
