package edu.multithreading;

public class Ex9_sleep_join {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Method main begins");

        Thread thread = new Thread(new Worker());

        System.out.println(thread.getState());

        thread.start();

        System.out.println(thread.getState());

        thread.join(1500); //Wait thread ends OR 1.5 seconds

        System.out.println(thread.getState());

        System.out.println("Method main ends");

        System.out.println(thread.getState());


    }
}

class Worker implements Runnable
{

    @Override
    public void run() {
        System.out.println("Work begins!");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work ends");

    }
}
