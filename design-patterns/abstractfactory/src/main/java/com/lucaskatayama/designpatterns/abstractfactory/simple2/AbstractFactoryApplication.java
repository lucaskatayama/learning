package com.lucaskatayama.designpatterns.abstractfactory.simple2;

import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.Ship;
import com.lucaskatayama.designpatterns.abstractfactory.simple2.factory.ShipFactory;

public class AbstractFactoryApplication {

    public static void main(String[] args) {
        ShipFactory shipFactory = new ShipFactory();
        Ship ship = shipFactory.makeShip("UFO");
        System.err.println(ship.toString());

        ship = shipFactory.makeShip("Rocket");
        System.err.println(ship.toString());

        ship = shipFactory.makeShip("Rocket++");
        System.err.println(ship.toString());
    }
}
