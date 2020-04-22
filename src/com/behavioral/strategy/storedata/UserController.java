package com.behavioral.strategy.storedata;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class UserController {
    private UserStorage userStorage;

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void store() {
        userStorage.store();
    }
}
