package edu.multithreading;

public class Ex11 {

    static int count = 0;

    public static synchronized void increment () {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Example of synchronized method");

        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);
    }

}

class R implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<10000; i++) {
            Ex11.increment();
        }
    }
}
