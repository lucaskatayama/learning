package com.lucaskatayama.designpatterns.observer.bad;

public class ConcreteSubject {
    protected int state;

    public ConcreteSubject() {
        state = 0;
    }

    public void setState(int value) {
        this.state = value;
    }

    public int getState() {
        return this.state;
    }
}
