package com.behavioral.template.algorithm;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public abstract class Generalization {
    //Tạo khung của phương thức findSolution()
    void findSolution() {
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
    }

    //Định nghĩa phương thức stepOne() trong findSolution()
    private void stepOne() {
        System.out.println("Generalization.stepOne");
    }

    //Đặt chỗ (tạo template) trước 2 phương thức dưới đây trong findSolution() để
    //các lớp kế thừa tự triển khai
    abstract void stepTwo();

    abstract void stepThree();

    //Định nghĩa trước phương thức stepFour() trong findSolution()
    void stepFour() {
        System.out.println("Generalization.StepFour");
    }
}
