package com.structural.adapter.maxvalue;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        CollectionUtilAdapter util = new CollectionUtilAdapter();
        List<Integer> listNumber = new ArrayList<>();
        while (count < 50) {
            listNumber.add(random.nextInt(10));
            count++;
        }
        util.printList(listNumber);
        util.printMaxValue(listNumber);
    }
}
