package com.lucaskatayama.designpatterns.observer.bad;

import java.util.ArrayList;
import java.util.List;

public class ObserverApplication {

    public static void main(String[] args) throws InterruptedException {
        List<ConcreteObserver> observers = new ArrayList<>();
        observers.add(new ConcreteObserver("First"));
        observers.add(new ConcreteObserver("Second"));

        ConcreteSubject subject = new ConcreteSubject();

        // Need to manually update all observers
        subject.setState(1);

        for (ConcreteObserver o : observers) {
            o.update(subject.getState());
        }

        Thread.sleep(1000);

        // Need to manually update all observers again
        subject.setState(2);

        for (ConcreteObserver o : observers) {
            o.update(subject.getState());
        }

    }
}
