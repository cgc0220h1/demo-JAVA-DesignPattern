package com.structural.facade.randomnum;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Client {
    public static void main(String[] args) {
        RandomListFacade randomListFacade = new RandomListFacade();
        randomListFacade.printList(100);
    }
}
