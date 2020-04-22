package com.behavioral.command.calculator;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class AddOperator implements Operator {
    @Override
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
