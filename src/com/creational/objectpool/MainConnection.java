package com.creational.objectpool;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

import java.sql.Connection;

public class MainConnection {
    public static void main(String[] args) {
        JDBConnectionPool pool = new JDBConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");
        Connection connection = pool.checkOut();
        pool.checkIn(connection);
    }
}
