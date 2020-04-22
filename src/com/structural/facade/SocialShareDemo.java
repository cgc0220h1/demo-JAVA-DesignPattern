package com.structural.facade;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class SocialShareDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.share("This is a post");
    }
}
