package edu.multithreading;

public class VolatileEx extends Thread {

    //Volatile means that variable keeping in Main memory and not keeping in the CPU cache.
    // So, we can change those variables by another thread.
    // Using only in case when one thread can change the variable and all another threads can only read the variable.


    volatile boolean b = true;



    public void run ()  {

        long counter = 0;

        while (b) {

            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter);

    }

    public static void main(String[] args) throws InterruptedException {

        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up!");

        thread.b = false;
        thread.join();
        System.out.println("End of program");


    }

}
