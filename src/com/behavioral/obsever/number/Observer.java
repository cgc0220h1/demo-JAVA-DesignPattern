package com.behavioral.obsever.number;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */


public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
