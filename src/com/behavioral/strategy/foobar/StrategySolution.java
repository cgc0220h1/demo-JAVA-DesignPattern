package com.behavioral.strategy.foobar;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public abstract class StrategySolution implements Strategy {
    public void solve() {
        start();
        while (nextTry() && !isSolution()) {}
        stop();
    }

    abstract void start();
    abstract boolean nextTry();
    abstract boolean isSolution();
    abstract void stop();
}
