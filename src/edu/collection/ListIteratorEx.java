package edu.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

    public static void main(String[] args) {

        String s = "madam2"; // проверяем на палиндром
        List<Character> list = new LinkedList<>();

        for(char ch: s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        boolean isPalindorm = true; //

        ListIterator<Character> iteratorBegin = list.listIterator(); //должен идти слева направо
        ListIterator<Character> iteratorEnd = list.listIterator(list.size());

        while (iteratorBegin.hasNext() && iteratorEnd.hasPrevious()) {

            if (iteratorBegin.next() != iteratorEnd.previous()) {
                isPalindorm = false;
                break;
            }
        }

        if(isPalindorm) {
            System.out.println("Palindrom");
        } else {
            System.out.println("NOT palindrom");
        }

    }
}
