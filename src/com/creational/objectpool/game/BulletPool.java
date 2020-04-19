package com.creational.objectpool.game;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

public class BulletPool extends MemoryPool<Bullet> {
    @Override
    protected Bullet allocated() {
        return new Bullet();
    }
}
