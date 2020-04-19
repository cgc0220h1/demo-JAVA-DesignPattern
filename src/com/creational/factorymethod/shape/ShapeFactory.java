package com.creational.factorymethod.shape;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

import java.util.Scanner;

public class ShapeFactory {
    private Scanner scanner = new Scanner(System.in);

    public Shape getShape(String type) {
        if (type.equals("circle")) {
            System.out.println("Enter radius: ");
            double radius = scanner.nextDouble();
            return new Circle(radius);
        } else {
            if (type.equals("rectangle")) {
                System.out.println("Enter Height: ");
                double height = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Enter width: ");
                double width = scanner.nextDouble();
                return new Rectangle(width,height);
            } else {
                System.out.println("Enter side: ");
                double side = scanner.nextDouble();
                return new Square(side);
            }
        }
    }
}
