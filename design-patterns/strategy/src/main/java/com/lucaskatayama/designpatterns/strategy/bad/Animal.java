package com.lucaskatayama.designpatterns.strategy.bad;


import lombok.Data;

@Data
public class Animal {
    protected String name;


    // Bad code, Dog can't fly
    // Avoid specific behavio on super class
    String canFly() {
        return "I'm flying";
    }
}
