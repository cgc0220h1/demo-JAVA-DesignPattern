package com.behavioral.command.calculator;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class CalculatorDemo {
    public static void main(String[] args) {
        Operator operator = new AddOperator();
        Calculator calculator = new Calculator(operator);
        int result = calculator.execute(1, 2);
        System.out.println("add operator: " + result);
        operator = new SubOperator();
        calculator = new Calculator(operator);
        result = calculator.execute(3, 2);
        System.out.println("sub operator: " + result);
    }
}
