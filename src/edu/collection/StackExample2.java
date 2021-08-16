package edu.collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Misha");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println(stack);

        System.out.println("!!!");
        System.out.println("Рассматриваем метод pop");
        System.out.println(stack.pop()); // вытаскиваем "верхний" элемент и удаляем его из стэка
        System.out.println(stack.pop()); // вытаскиваем "верхний" элемент и удаляем его из стэка
        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // вытаскиваем "верхний" элемент и удаляем его из стэка
            System.out.println(stack);
        }

        System.out.println("!!!");
        System.out.println("Рассматриваем метод peek");
        Stack<String> stack2 = new Stack<>();
        stack2.push("Zaur");
        stack2.push("Misha");
        stack2.push("Oleg");
        stack2.push("Katya");
        System.out.println(stack2);

        System.out.println(stack2.peek()); // вытаскиваем "верхний" элемент, но не удаляем его из стэка
        System.out.println(stack2);



    }
}
