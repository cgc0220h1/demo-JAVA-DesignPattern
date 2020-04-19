package com.creational.objectpool.game;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

public class GameDemo {
    public static void main(String[] args) {
        Gun gun=new Gun();
        System.out.println("Start");
        gun.fire();
        System.out.println("Game over");
        System.out.println("Tocal bullet created: " + Bullet.count);
    }
}
