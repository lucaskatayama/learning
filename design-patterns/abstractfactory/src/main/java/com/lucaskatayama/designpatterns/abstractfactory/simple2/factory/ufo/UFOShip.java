package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.ufo;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Engine;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Fuel;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Ship;
import lombok.Data;


@Data
public class UFOShip implements Ship {
    Engine engine;
    Fuel fuel;


    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public Fuel getFuel() {
        return this.fuel;
    }

    public void addEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void addFuel(Fuel fuel) {
        this.fuel = fuel;
    }
}
