package com.structural.proxy;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class MathCalculator implements Calculator {

    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double sub(double first, double second) {
        return first - second;
    }

    @Override
    public double mul(double first, double second) {
        return first * second;
    }

    @Override
    public double div(double first, double second) {
        return first / second;
    }
}
