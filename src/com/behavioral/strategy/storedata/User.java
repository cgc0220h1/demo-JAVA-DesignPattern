package com.behavioral.strategy.storedata;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class User {
    public static void main(String[] args) {
        UserController userController = new UserController(new XMLStorage());
        userController.store();
        userController = new UserController(new MySQLStorage());
        userController.store();
    }
}
