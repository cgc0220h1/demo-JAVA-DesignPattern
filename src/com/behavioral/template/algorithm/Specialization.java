package com.behavioral.template.algorithm;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public abstract class Specialization extends Generalization {
    //Tiếp tục chia nhỏ stepThree() thành các phương thức nhỏ hơn để
    //concrete class tự triển khai
    //Tạo trước các template (placeholder) để các concrete class biết
    //đường triển khai
    protected void stepThree() {
        step3_1();
        step3_2();
        step3_3();
    }

    //Định nghĩa trước phương thức step3_1 để các concrete class triển khai
    private void step3_1() {
        System.out.println("Specialization.Step3_1");
    }

    //Tiếp tục đặt chỗ (tạo template/placeholder) để các concrete class triển khai
    abstract protected void step3_2();

    private void step3_3() {
        System.out.println("Specialization.Step3_3");
    }
}
