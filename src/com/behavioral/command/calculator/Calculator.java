package com.behavioral.command.calculator;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Calculator {
    private Operator operator;

    public Calculator(Operator operator) {
        this.operator = operator;
    }

    public int execute(int firstOperand, int secondOperand) {
        return operator.execute(firstOperand, secondOperand);
    }
}
