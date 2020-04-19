package com.creational.factorymethod;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
