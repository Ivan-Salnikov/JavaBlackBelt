package edu.multithreading;

public class Ex5_priority {

    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();

        myThread5.setName("moy_potok");
        myThread5.setPriority(9);

        System.out.println("Mythread5 name = " + myThread5.getName() +
                ", Priotity = " + myThread5.getPriority());



    }
}


class MyThread5 extends  Thread {

    public void run () {
        System.out.println("Privet!");
    }
}