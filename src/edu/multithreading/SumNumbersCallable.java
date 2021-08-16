package edu.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbersCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long sumResults = 0;

        long step = 100000000;

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Long>> futureResults = new ArrayList<>();


        for (long i = 1; i <= 1000000000; i = i + step) {
            PartialSum partialSum = new PartialSum(i, i + step - 1);
            Future<Long> futurePartSum  = executorService.submit(partialSum);
            futureResults.add(futurePartSum);
        }

        executorService.shutdown();

        for (Future<Long> result: futureResults) {
            sumResults += result.get();
        }

        System.out.println("Sum of numbers: " + sumResults);

    }
}


class PartialSum implements Callable<Long> {
    private long minNumber;
    private long maxNumber;
    private long sumResult;

    public PartialSum(long minNumber, long maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    @Override
    public Long call() {

        System.out.println( "Run thread " + Thread.currentThread().getName() + ". Sum from " + minNumber  + " to " + maxNumber);

        for (long i = minNumber; i <= maxNumber; i++) {
            sumResult =  sumResult + i;
        }

        System.out.println(Thread.currentThread().getName() + ", sum result: " + sumResult);

        return sumResult;
    }
}