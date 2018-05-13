package com.lucaskatayama.designpatterns.strategy.simple;

public interface Flies {
    String fly();
}


class CanFly implements Flies {
    public String fly() {
        return "It flies";
    }
}

class CantFly implements Flies {
    public String fly() {
        return "It can't fly";
    }
}
