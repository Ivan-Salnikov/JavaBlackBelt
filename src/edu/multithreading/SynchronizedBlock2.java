package edu.multithreading;

public class SynchronizedBlock2 {
    static int count = 0;

    public static void increment () {
        synchronized (SynchronizedBlock2.class) { // In the static method we have to use the class monitor.
            count++;
        }

    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("A synchronized block example 2 - block in a static method");


        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);
    }

}

class R2 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<10000; i++) {
            SynchronizedBlock2.increment();
        }
    }
}
