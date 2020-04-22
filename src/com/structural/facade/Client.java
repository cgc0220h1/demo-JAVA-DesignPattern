package com.structural.facade;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Client {
    public void share(String message) {
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(
                new Twitter()
                , new Facebook()
                , new LinkedIn()
        );
        socialMediaFacade.share(message);
    }
}
