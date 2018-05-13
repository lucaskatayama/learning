package com.lucaskatayama.designpatterns.factory.simple;


public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String type) {
        EnemyShip theEnemy = null;
        if (type.equals("U")) {
            theEnemy = new UFOEnemyShip();
        } else if (type.equals("R")) {
            theEnemy = new RocketEnemyShip();
        }
        return theEnemy;
    }
}
