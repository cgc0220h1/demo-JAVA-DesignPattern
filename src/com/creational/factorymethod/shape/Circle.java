package com.creational.factorymethod.shape;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
