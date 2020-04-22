package com.behavioral.strategy.storedata;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class XMLStorage implements UserStorage  {
    @Override
    public void store() {
        System.out.println("This File is stored in XML format");
    }
}
