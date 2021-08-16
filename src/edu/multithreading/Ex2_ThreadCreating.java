package edu.multithreading;

public class Ex2_ThreadCreating {

    public static void main(String[] args) {

        System.out.println("Первый вариант создания потока" +
                "\n" + "Путем создания нового класса, который extends класс Thread" +
                "\n" + "В этом классе создается метод run(), в котором прописывается логика" +
                "\n" + "Внимание! " +
                "\n" + "Запускается поток путем создания объекта нашего класса и запуском метода start");

        MyThread1 myThread1 = new MyThread1();

        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

    }

}

class MyThread1 extends Thread {

    public void run() {

        for(int i = 1; i<=1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {

    public void run() {

        for(int i = 1000; i>0; i--) {
            System.out.println(i);
        }
    }
}