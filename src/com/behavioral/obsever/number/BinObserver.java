package com.behavioral.obsever.number;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toBinaryString(subject.getState()));
    }
}
