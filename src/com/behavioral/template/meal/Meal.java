package com.behavioral.template.meal;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public abstract class Meal {
    public final void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngredients();

    public abstract void cook();

    public void eat() {
        System.out.println("Hmm. Noice!");
    }

    public abstract void cleanUp();
}
