package edu.multithreading;

import java.util.concurrent.*;

public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {

        int f = 5;

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Factorial2 factorial2 = new Factorial2(f);

        Future<Integer> future = executorService.submit(factorial2);

        try {

            System.out.println(future.isDone());

            System.out.println("Want to get the result");
            factorialResult = future.get();
            System.out.println("Got the result");

            System.out.println(future.isDone());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executorService.shutdown();
        }

        System.out.println("Factorial " + f + " is " + factorialResult);

    }
}



class Factorial2 implements Callable <Integer> {

    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Incorrect number");
        }
        int result = 1;

        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}