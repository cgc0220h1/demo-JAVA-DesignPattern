package com.structural.adapter.file;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class FileCalculatorAdapter {
    private FileCalculator calculator;

    public FileCalculatorAdapter(FileCalculator calculator) {
        this.calculator = calculator;
    }

    public void printFileSize(String path) {
        long size = calculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
