package com.behavioral.command.lightbulb;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class LightOffConcreteCommand implements Command {
    LightReceiver light;

    public LightOffConcreteCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
