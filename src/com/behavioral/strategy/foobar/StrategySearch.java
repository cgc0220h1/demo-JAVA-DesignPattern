package com.behavioral.strategy.foobar;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public abstract class StrategySearch implements Strategy {
    @Override
    public void solve() {
        while (true) {
            preProcess();
            if (search()) {
                break;
            }
            postProcess();
        }
    }

    abstract void preProcess();

    abstract boolean search();

    abstract void postProcess();
}
