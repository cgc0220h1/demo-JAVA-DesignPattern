package com.behavioral.strategy.foobar;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Foo extends StrategySolution {
    private int state = 1;

    @Override
    void start() {
        System.out.print("Start  ");
    }

    @Override
    boolean nextTry() {
        System.out.print("NextTry-" + state++ + "  ");
        return true;
    }

    @Override
    boolean isSolution() {
        System.out.print("IsSolution-" + (state == 3) + "  ");
        return (state == 3);
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }
}
