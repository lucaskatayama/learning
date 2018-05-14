package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.ufo;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.AbstractShipFactory;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Engine;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Fuel;

public class UFOFactory implements AbstractShipFactory {
    @Override
    public Engine createEngine() {
        return new UFOEngine();
    }

    @Override
    public Fuel createFuel() {
        return new UFOFuel();
    }
}
