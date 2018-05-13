package com.lucaskatayama.designpatterns.observer.simple;

public class ObserverApplication {

    public static void main(String[] args) throws InterruptedException {
        ConcreteSubject subject = new ConcreteSubject();
        new ConcreteObserver("First", subject);
        new ConcreteObserver("Second", subject);
        subject.setState(1);
        Thread.sleep(1000);
        subject.setState(2);
    }
}
