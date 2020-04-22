package com.behavioral.strategy.storedata;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class MySQLStorage implements UserStorage {

    @Override
    public void store() {
        System.out.println("This file is stored in MySQL format");
    }
}
