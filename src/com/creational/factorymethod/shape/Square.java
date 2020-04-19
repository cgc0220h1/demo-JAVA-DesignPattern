package com.creational.factorymethod.shape;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
