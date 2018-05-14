package com.lucaskatayama.designpatterns.abstractfactory.simple2.factory;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.rocket.RocketShip;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.rocket.RocketFactory;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.ufo.UFOShip;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.ufo.UFOFactory;

public class ShipFactory {
    public Ship makeShip(String type) {
        Ship ship = null;
        switch (type) {
            case "UFO": {
                AbstractShipFactory ufoShipFactory = new UFOFactory();
                ship = new UFOShip();
                ship.addEngine(ufoShipFactory.createEngine());
                ship.addFuel(ufoShipFactory.createFuel());
                break;
            }
            case "Rocket": {
                AbstractShipFactory rocketShipFactory = new RocketFactory();
                ship = new RocketShip();
                ship.addEngine(rocketShipFactory.createEngine());
                ship.addFuel(rocketShipFactory.createFuel());

                break;
            }
            case "Rocket++": {
                AbstractShipFactory ufoShipFactory = new UFOFactory();
                AbstractShipFactory rocketShipFactory = new RocketFactory();
                ship = new RocketShip();
                ship.addEngine(ufoShipFactory.createEngine());
                ship.addFuel(rocketShipFactory.createFuel());
                break;
            }
        }

        return ship;
    }
}