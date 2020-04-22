package com.structural.facade;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Twitter implements SocialShare {
    private String message;


    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Twitter: " + message);
    }
}
