package com.creational.factorymethod.shape;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape;
        ShapeFactory shapeFactory = new ShapeFactory();
        shape = shapeFactory.getShape("circle");
        System.out.println(shape.getArea());
    }
}
