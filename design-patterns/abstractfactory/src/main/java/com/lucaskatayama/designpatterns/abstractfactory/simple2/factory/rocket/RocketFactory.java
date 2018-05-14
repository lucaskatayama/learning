package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.rocket;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.AbstractShipFactory;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Engine;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Fuel;

public class RocketFactory implements AbstractShipFactory {


    @Override
    public Engine createEngine() {
        return new RocketEngine();
    }

    @Override
    public Fuel createFuel() {
        return new RocketFuel();
    }
}
