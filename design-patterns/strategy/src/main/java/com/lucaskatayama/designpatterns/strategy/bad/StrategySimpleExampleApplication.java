package com.lucaskatayama.designpatterns.strategy.bad;

public class StrategySimpleExampleApplication {

    public static void main(String[] args) {
        Animal doge = new Dog();
        Animal tweety = new Bird();
        System.err.println("Dog: " + doge.canFly());
        System.err.println("Tweety: " + tweety.canFly());
    }

}
