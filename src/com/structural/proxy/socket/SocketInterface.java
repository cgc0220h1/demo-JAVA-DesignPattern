package com.structural.proxy.socket;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public interface SocketInterface {
    String readLine();

    void writeLine(String str);

    void dispose();
}
