package com.behavioral.command.lightbulb;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class LightReceiver {
    private boolean on;

    public void switchOn() {
        on = true;
        System.out.println("on");
    }

    public void switchOff() {
        on = false;
        System.out.println("off");
    }
}
