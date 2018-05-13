package com.lucaskatayama.designpatterns.factory.simple;

import java.util.Scanner;

public class EnemyShipApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String enemyShipOption = "";
        System.err.println("What type of enemy ship? (U/R)");
        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }


        if (enemyShipOption.isEmpty()) {
            System.err.println("You should choose an enemy ship.");
            return;
        } else {
            EnemyShipFactory factory = new EnemyShipFactory();
            EnemyShip theEnemy = factory.makeEnemyShip(enemyShipOption);
            doStuff(theEnemy);
        }


    }


    private static void doStuff(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
