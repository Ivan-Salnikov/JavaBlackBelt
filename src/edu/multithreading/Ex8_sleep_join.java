package edu.multithreading;



public class Ex8_sleep_join extends Thread{

    public void run() {

        for(int i =1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyRunnable1());

        Ex8_sleep_join thread2 = new Ex8_sleep_join();

        thread1.start();
        thread2.start();

        thread1.join(); // Waiting while thread1 ends
        thread2.join(); //Waiting while thread2 ends

        System.out.println("Konec!");
    }


}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {

        for(int i =1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}
