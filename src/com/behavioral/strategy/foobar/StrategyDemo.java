package com.behavioral.strategy.foobar;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class StrategyDemo {
    private static void execute(Strategy strategy) {
        strategy.solve();
    }

    public static void main(String[] args) {
        Strategy[] algorithms = {new Foo(), new Bar()};
        for (Strategy strategy : algorithms) {
            execute(strategy);
        }
    }
}
