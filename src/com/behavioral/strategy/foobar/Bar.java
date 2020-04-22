package com.behavioral.strategy.foobar;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Bar extends StrategySearch {
    private int state = 1;

    @Override
    void preProcess() {
        System.out.print("PreProcess  ");
    }

    @Override
    boolean search() {
        System.out.print("Search-" + state++ + "  ");
        return state == 3;
    }

    @Override
    void postProcess() {
        System.out.print("PostProcess  ");
    }
}
