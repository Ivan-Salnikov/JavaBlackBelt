package edu.multithreading;

import java.util.logging.SocketHandler;

public class Ex4_ThreadAnonym {

    public static void main(String[] args) {


        System.out.println("Пример запуска потока, через анонимный класс");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Это поток из анонимного класса");
            }
        }).start();

        System.out.println("Пример запуска потока, через лямбда выражение");
        new Thread( () -> {
            System.out.println("Это поток из лямбда");
        }).start();

    }
}
