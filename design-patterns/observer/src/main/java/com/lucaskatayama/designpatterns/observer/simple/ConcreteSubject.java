package com.lucaskatayama.designpatterns.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer> observers;
    int state;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
        state = 0;
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer i : this.observers) {
            i.update();
        }
    }

    public void setState(int value) {
        this.state = value;
        this.notifyObservers();
    }

    public int getState() {
        return this.state;
    }
}
