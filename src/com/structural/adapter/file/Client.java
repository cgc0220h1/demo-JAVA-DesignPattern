package com.structural.adapter.file;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path) {
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
