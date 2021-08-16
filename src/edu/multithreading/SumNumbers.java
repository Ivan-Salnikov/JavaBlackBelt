package edu.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumNumbers {

    public static long sumOfNumbers;

    public static void main(String[] args) throws InterruptedException {

        long step = 100000000;

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (long i = 1; i <= 1000000000; i = i + step) {
            executorService.execute(new RunnableImpl1(i, i + step-1));
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Sum of numbers: " + sumOfNumbers);

    }

}

class RunnableImpl1 implements Runnable {
private long minNumber;
private long maxNumber;
private long sumResult;

    public RunnableImpl1(long minNumber, long maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {

        System.out.println( "Run thread " + Thread.currentThread().getName() + ". Sum from " + minNumber  + " to " + maxNumber);

        for (long i = minNumber; i <= maxNumber; i++) {
            sumResult =  sumResult + i;
        }

        System.out.println(Thread.currentThread().getName() + ", sum result: " + sumResult);

        SumNumbers.sumOfNumbers += sumResult;
    }
}