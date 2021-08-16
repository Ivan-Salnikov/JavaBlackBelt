package edu.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();

        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream().reduce((accumulator, element) -> accumulator + element).get();

        System.out.println("sumResult (обычный stream) = " + sumResult);

        sumResult = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();

        System.out.println("sumResult (параллельный stream) = " + sumResult);

        System.out.println("-----------");
        System.out.println("");

        double divisionResult = list.stream().reduce((accumulator, element) -> accumulator /  element).get();
        System.out.println("divisionResult (обычный stream) = " + divisionResult);

        divisionResult = list.parallelStream().reduce((accumulator, element) -> accumulator /  element).get();
        System.out.println("divisionResult (параллельный stream) = " + divisionResult);

    }
}
