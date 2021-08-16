package edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4_reduce {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        System.out.println("Метод stream.reduce" +
                "\n" + "Рассмотрим два варианта использования метода reduce" +
                "Метод reduce возвращает объект типа Optional" +
                "\n" + "Optional - новый класс в пакете java.util, является контейнером (оберткой) для значений которая также может безопасно содержать null." +
                "\n" +                "Благодаря опциональным типам можно забыть про проверки на null и NullPointerException");
        System.out.println(list);
        System.out.println("");

        System.out.println("Первый вариант" +
                "\n" + "list.stream().reduce((accumulator, element) -> accumulator*element).get();");

        int result = list.stream().reduce((accumulator, element) -> accumulator*element).get();
        System.out.println(result);
        //  5, 8, 2, 4, 3
        //  accumulator =   5   40  80  320 960
        //  element =       8   2   4   3

        System.out.println("");

        System.out.println("Второй вариант. Указываем еще один параметр (указываем первым) метода reduce (identity), " +
                "\n" + "который задает начальное значение accumulator" +
                "\n" + "В этом случае метод get не используется, так как даже метод reduce ничего не вернет, то у нас все равно есть начальное значение identity" +
                "\n" + "list.stream().reduce((accumulator, element) -> accumulator*element);");

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        System.out.println(result);
        //  5, 8, 2, 4, 3
        //  accumulator =   1   5   40  80  320 960
        //  element =       5   8   2   4   3


        System.out.println("");

        System.out.println("Пример использования переменной типа Optional");

        List<Integer> list2 = new ArrayList<>();

        //int result100 = list2.stream().reduce((accumulator, element) -> accumulator*element).get(); // вылетает ошибка, так list2 пустой

        int result100 = list2.stream().reduce(25, (accumulator, element) -> accumulator*element);

        System.out.println(result100);

        //Создаем объект типа Optional
        Optional<Integer> optional = list2.stream().reduce((accumulator, element) -> accumulator*element);

        if(optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("Not present");
        }


        System.out.println("");
        System.out.println("Пример использования c List<String> (находим конактенацию всех элементов)");

        List<String> list3 = new ArrayList<>();

        list3.add("privet");
        list3.add("kak dela?");
        list3.add("ok");
        list3.add("poka");

        System.out.println(list3);

        String resultStr = list3.stream().reduce((accumulator, element) -> accumulator + " " + element).get();

        System.out.println(resultStr);


    }
}
