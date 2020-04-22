package com.structural.adapter.maxvalue;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.Set;

public class OperatorOne implements CollectionOperations {

    @Override
    public int findMax(Set<Integer> numbers) {
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
