package com.behavioral.template.meal;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class HamburgerMeal extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Getting burgers, buns, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates");
    }
}
