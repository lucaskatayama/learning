package com.lucaskatayama.designpatterns.observer.bad;

public class ConcreteObserver {
    protected String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public void update(int state) {
        String message = String.format("%s : %s", this.name, state);
        System.err.println(message);
    }
}
