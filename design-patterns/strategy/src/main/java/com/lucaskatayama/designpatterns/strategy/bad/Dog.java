package com.lucaskatayama.designpatterns.strategy.bad;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    @Override
    String canFly() {
        return "I can't fly";
    }
}
