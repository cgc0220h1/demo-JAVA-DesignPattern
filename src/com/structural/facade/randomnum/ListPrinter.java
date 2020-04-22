package com.structural.facade.randomnum;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> list) {
        for (int number : list) {
            System.out.printf("%d ", number);
        }
    }
}
