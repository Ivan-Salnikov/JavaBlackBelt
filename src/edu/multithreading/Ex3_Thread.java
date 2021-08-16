package edu.multithreading;

public class Ex3_Thread {

    public static void main(String[] args) {

        System.out.println("Второй вариант создания потока" +
                "\n" + "Путем создания нового класса, который реализует интерфейс Runnable" +
                "\n" + "В этом классе создается метод run(), в котором прописывается логика" +
                "\n" + "Внимание! " +
                "\n" + "Запускается поток путем создания объекта класса Thread, передавая ему в качестве параметра объект нашего класса (либо новый)" +
                "\nи запуском метода start объекта типа Thread");

        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();

    }

}

class MyThread3 implements Runnable {

    public void run() {

        for(int i = 1; i<=1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {

    public void run() {

        for(int i = 1000; i>0; i--) {
            System.out.println(i);
        }
    }
}