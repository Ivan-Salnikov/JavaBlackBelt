package edu.multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {

        Store store = new Store(5);
        Producer producer = new Producer(store, 20);
        Consumer consumer = new Consumer(store, 5);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadProducer.start();
        threadConsumer.start();


    }
}


class Store {
    public Store(int maxBreadOnStore) {
        this.maxBreadOnStore = maxBreadOnStore;
    }

    private int breadOnStore = 0;
    private  int maxBreadOnStore;

    public synchronized void getBread () {
        while (breadOnStore < 1) {
            try {
                System.out.println("Consumer is waiting");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadOnStore--;
        System.out.println("Consumer buy 1 bread");
        System.out.println("Bread on store = " + breadOnStore);
        notify();
    }

    public synchronized void makeBread () {
        while (breadOnStore >= maxBreadOnStore) {
            try {
                System.out.println("Producer is waiting");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadOnStore++;
        System.out.println("Producer make 1 bread");
        System.out.println("Bread on store = " + breadOnStore);
        notify();
    }

}

class Producer implements Runnable {
    public Producer(Store store, int maxProducePerDay) {
        this.store = store;
        this.maxProducePerDay = maxProducePerDay;
    }
    Store store;
    int maxProducePerDay;


    @Override
    public void run() {
        System.out.println("Start making bread");
        for (int i = 0; i < maxProducePerDay; i++) {
            store.makeBread();
        }
    }
}


class Consumer implements Runnable{
    public Consumer(Store store, int maxBuyPerDay) {
        this.store = store;
        this.maxBuyPerDay = maxBuyPerDay;
    }
    Store store;
    int maxBuyPerDay;


    @Override
    public void run() {
        System.out.println("Start getting bread");
        for (int i = 0; i < maxBuyPerDay; i++) {
            store.getBread();
        }
    }

}