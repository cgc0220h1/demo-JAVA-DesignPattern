package com.structural.facade.randomnum;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.ArrayList;
import java.util.List;

public class ListFilter {
    public List<Integer> filterOdd(List<Integer> list) {
        List<Integer> oddNumber = new ArrayList<>();
        for (int number : list) {
            if (number % 2 != 0) {
                oddNumber.add(number);
            }
        }
        return oddNumber;
    }
}
