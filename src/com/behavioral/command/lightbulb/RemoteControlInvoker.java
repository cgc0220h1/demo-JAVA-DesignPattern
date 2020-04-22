package com.behavioral.command.lightbulb;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class RemoteControlInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
