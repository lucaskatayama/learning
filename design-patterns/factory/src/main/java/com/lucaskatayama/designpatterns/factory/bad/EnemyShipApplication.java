package com.lucaskatayama.designpatterns.factory.bad;

import java.util.Scanner;

public class EnemyShipApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.err.println("What type of enemy ship? (U/R)");
        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }

        EnemyShip theEnemy = null;
        if (enemyShipOption.isEmpty()) {
            System.err.println("You should choose an enemy ship.");
            return;
        } else if (enemyShipOption.equals("U")) {
            theEnemy = new UFOEnemyShip();
        } else if (enemyShipOption.equals("R")) {
            theEnemy = new RocketEnemyShip();
        }

        doStuff(theEnemy);
    }


    private static void doStuff(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
