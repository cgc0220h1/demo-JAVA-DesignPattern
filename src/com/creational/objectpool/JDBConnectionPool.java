package com.creational.objectpool;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLData;
import java.sql.SQLException;

public class JDBConnectionPool extends ObjectPool<Connection> {
    private String dsn, usr, pwd;

    public JDBConnectionPool(String driver, String dsn, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(dsn, usr, pwd));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean validate(Connection o) {
        try {
            return (!((Connection) o).isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
