package edu.multithreading;

public class DeadlockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10(); // Creating threads
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }

}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: Try to catch lock1 monitor");
        synchronized (DeadlockEx.lock1) {
            System.out.println("Thread10: Lock1 monitor was catch");

            System.out.println("Thread10: Try to catch lock2 monitor");
            synchronized (DeadlockEx.lock2) {
                System.out.println("Thread10: Lock2 monitor and lock1 monitor was catch");
            }

        }

    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: Try to catch lock2 monitor");
        synchronized (DeadlockEx.lock2) {
            System.out.println("Thread20: Lock2 monitor was catch");

            System.out.println("Thread20: Try to catch lock1 monitor");
            synchronized (DeadlockEx.lock1) {
                System.out.println("Thread20: Lock2 monitor and lock1 monitor was catch");
            }

        }

    }
}
