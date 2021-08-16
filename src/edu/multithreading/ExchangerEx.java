package edu.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICI);

        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);

        new BestFriend("Ivan",exchanger, friend1Action);
        new BestFriend("Petr",exchanger, friend2Action);

    }

}

enum Action {
    KAMEN, NOJNICI, BUMAGA
}

class BestFriend extends Thread {
    private final String name;
    private final Exchanger<Action> exchanger;
    private final List<Action> myActions;


    public BestFriend(String name, Exchanger<Action> exchanger, List<Action> myActions) {
        this.name = name;
        this.exchanger = exchanger;
        this.myActions = myActions;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction) {
        if((myAction == Action.KAMEN && friendAction == Action.NOJNICI)
            || (myAction == Action.NOJNICI && friendAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendAction == Action.KAMEN)
        ) {
            System.out.println(name + " WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply;

        for (Action action: myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action,reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}