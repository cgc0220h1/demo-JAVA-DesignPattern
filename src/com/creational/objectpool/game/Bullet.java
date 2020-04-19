package com.creational.objectpool.game;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

public class Bullet {
    public static int count = 0;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Bullet() {
        count++;
    }

    public void move() {
        position++;
    }
}
