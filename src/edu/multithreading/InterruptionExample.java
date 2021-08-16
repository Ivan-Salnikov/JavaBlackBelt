package edu.multithreading;

public class InterruptionExample {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();

        Thread.sleep(2000);
        interruptedThread.interrupt(); // Its means that main thread want to interrupt interruptedThread thread

        interruptedThread.join();

        System.out.println("Main thread ends");

    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 1; i <= 1000000000; i++) {

            if(isInterrupted()) {
                System.out.println("Some wants to interrupt this Thread");
                System.out.println("We checked the state of all objects and decided to stop thread execution");
                return;
            }
            sqrtSum += Math.sqrt(i);
        }

        System.out.println(sqrtSum);

    }
}