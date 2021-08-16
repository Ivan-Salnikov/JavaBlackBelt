package edu.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        new Employee("Zaur", lock, false);
        new Employee("Oleg", lock, true);
        new Employee("Elena", lock, false);
        new Employee("Viktor", lock, true);
        new Employee("Marina", lock, false);

    }

}

class Employee extends Thread {
    private String name;
    private Lock lock;
    private boolean isHurry;

    public Employee (String name, Lock lock, boolean isHurry) {
        this.name = name;
        this.lock = lock;
        this.isHurry = isHurry;
        this.start();
    }

    @Override
    public void run() {

        if (isHurry) {
            System.out.println(name + " спешит и ждать не может");
            if (lock.tryLock()) {
                try {
                    System.out.println(name + " пользуется банкоматом");
                    Thread.sleep(2000);
                    System.out.println(name + " завершил (а) свои дела");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    lock.unlock();
                }
            } else {
                System.out.println(name + " не стал ждать, так как банкомат был занят");
                }
        } else {
            System.out.println(name + " не торопится");
            try {
                System.out.println(name + " ждет...");
                lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил (а) свои дела");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }
    }
}
