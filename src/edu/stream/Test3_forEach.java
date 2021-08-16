package edu.stream;

import java.util.Arrays;

public class Test3_forEach {

    public static void main(String[] args) {

        int[] array = {5,9,3,8,1};

        System.out.println("Пример метода stream.forEach()");
        System.out.println(Arrays.toString(array));

        Arrays.stream(array).forEach(e ->
        {
            e *= 2;
            System.out.println(e);
        });
        System.out.println("");

        //Еще одна форма записи в методе forEach
        Arrays.stream(array).forEach(System.out::println);

        //Или вообще вот так
        Arrays.stream(array).forEach(Utils::myMethod);
    }

}

class Utils {
    public static void myMethod (int a) {
        a = a + 5;

        System.out.println("Element = " + a);
    }
}
