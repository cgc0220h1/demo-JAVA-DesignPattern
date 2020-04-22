package com.behavioral.template.meal;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class MealDemo {
    public static void main(String[] args) {
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
