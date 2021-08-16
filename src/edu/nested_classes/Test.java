package edu.nested_classes;

public class Test {

    static class A {} //обычный статический вложенный класс

    class B {} // внутренний (inner) класс

    void method () {

        class C {} // локальный внутренний класс

    }

}
