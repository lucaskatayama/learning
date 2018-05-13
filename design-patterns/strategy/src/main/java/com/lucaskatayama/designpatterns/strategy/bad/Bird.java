package com.lucaskatayama.designpatterns.strategy.bad;

public class Bird extends Animal {
    public Bird() {
        super();
    }

    @Override
    String canFly() {
        return "I'm flying";
    }
}
