package com.lucaskatayama.designpatterns.observer.simple;

public class ConcreteObserver implements Observer {
    ConcreteSubject subject;
    String name;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        String message = String.format("%s : %s", this.name, this.subject.getState());
        System.err.println(message);
    }
}
