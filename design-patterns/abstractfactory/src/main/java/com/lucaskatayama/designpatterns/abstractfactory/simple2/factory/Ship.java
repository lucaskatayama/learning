package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory;

public interface Ship {
    Engine getEngine();
    Fuel getFuel();
    void addEngine(Engine engine);
    void addFuel(Fuel fuel);
}
