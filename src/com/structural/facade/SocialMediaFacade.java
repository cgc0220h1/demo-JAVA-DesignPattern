package com.structural.facade;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message) {
        twitter.setMessage(message);
        facebook.setMessage(message);
        linkedIn.setMessage(message);
        twitter.share();
        facebook.share();
        linkedIn.share();
    }
}
