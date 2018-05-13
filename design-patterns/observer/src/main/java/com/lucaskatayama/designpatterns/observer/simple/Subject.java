package com.lucaskatayama.designpatterns.observer.simple;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
