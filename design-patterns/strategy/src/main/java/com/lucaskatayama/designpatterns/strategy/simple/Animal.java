package com.lucaskatayama.designpatterns.strategy.simple;


import lombok.Data;

@Data
public class Animal {
    protected String name;
    protected Flies flies;


    String canFly() {
        return this.flies.fly();
    }
}
