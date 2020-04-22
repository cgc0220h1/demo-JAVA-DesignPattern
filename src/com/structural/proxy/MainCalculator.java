package com.structural.proxy;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new MathCalculatorProxy();
        double result = calculator.add(1, 2);
        System.out.println("1 + 2 = " +  result);
        result = calculator.add(2, Double.MAX_VALUE);
        System.out.println("2 + Double.Max_Value = " + result);
    }
}
