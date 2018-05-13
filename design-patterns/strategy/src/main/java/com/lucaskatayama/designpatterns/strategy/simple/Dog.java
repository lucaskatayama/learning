package com.lucaskatayama.designpatterns.strategy.simple;

public class Dog extends Animal {
    public Dog() {
        super();
        this.flies = new CantFly();
    }
}
