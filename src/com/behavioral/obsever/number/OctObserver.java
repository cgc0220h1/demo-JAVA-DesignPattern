package com.behavioral.obsever.number;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class OctObserver extends Observer {
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
}
