package com.behavioral.command.lightbulb;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Client {
    public static void main(String[] args) {
        RemoteControlInvoker control = new RemoteControlInvoker();
        LightReceiver light = new LightReceiver();

        Command lightOn = new LightOnConcreteCommand(light);
        Command lightOff = new LightOffConcreteCommand(light);

        //control là thực thể truyền command tới receiver
        control.setCommand(lightOn);
        control.pressButton();

        control.setCommand(lightOff);
        control.pressButton();
    }
}
