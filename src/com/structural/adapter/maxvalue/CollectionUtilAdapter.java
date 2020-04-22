package com.structural.adapter.maxvalue;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtilAdapter {
    private CollectionUtil util;

    public CollectionUtilAdapter() {
        CollectionOperations demoOperation = new CollectionOperations() {
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
        };
        util = new CollectionUtil(demoOperation);
    }

    public void printMaxValue(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>(numbers);
        util.printMaxValue(setNumbers);
    }

    public void printList(List<Integer> numbers) {
        Set<Integer> setNumbers = new HashSet<>(numbers);
        util.printList(setNumbers);
    }
}
