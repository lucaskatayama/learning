package com.lucaskatayama.designpatterns.strategy.simple;

public class Bird extends Animal {
    public Bird() {
        super();
        this.flies = new CanFly();
    }
}
