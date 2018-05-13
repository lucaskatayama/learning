package com.lucaskatayama.designpatterns.factory.bad;

import lombok.Data;

@Data
public class EnemyShip {
    protected String name;
    protected Double damage;

    public void followHeroShip() {
        System.err.println(getName() + " is following the hero");
    }

    public void displayEnemyShip() {
        System.err.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.err.println(getName() + " attacks and does " + getDamage());
    }
}
