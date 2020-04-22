package com.behavioral.template.algorithm;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Realization extends Specialization {
    //Concrete class bắt buộc khai các phương thức trong các template
    @Override
    protected void step3_2() {
        System.out.println("Realization.Step3_2");
    }

    @Override
    void stepTwo() {
        System.out.println("Realization.StepTwo");
    }

    //Hoặc có thể triển khai tiếp các phương thức không nằm trong template
    @Override
    void stepFour() {
        super.stepFour();
        System.out.println("Realization.step4_1");
    }
}
