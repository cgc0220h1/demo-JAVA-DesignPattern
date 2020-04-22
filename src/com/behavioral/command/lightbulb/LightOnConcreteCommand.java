package com.behavioral.command.lightbulb;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class LightOnConcreteCommand implements Command {
    LightReceiver light;

    public LightOnConcreteCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
