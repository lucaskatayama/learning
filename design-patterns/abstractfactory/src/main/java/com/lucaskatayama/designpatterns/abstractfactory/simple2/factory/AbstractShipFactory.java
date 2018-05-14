package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory;

public interface AbstractShipFactory {
    Engine createEngine();
    Fuel createFuel();
}
