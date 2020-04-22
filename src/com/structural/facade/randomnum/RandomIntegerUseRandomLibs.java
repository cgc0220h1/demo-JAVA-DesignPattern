package com.structural.facade.randomnum;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntegerUseRandomLibs implements RandomIntegerList {
    public List<Integer> generateList(int amount) {
        List<Integer> listNumber = new ArrayList<>();
        int numberGen = 0;
        while (numberGen < amount) {
            Random random = new Random();
            listNumber.add(random.nextInt(10));
            numberGen++;
        }
        return listNumber;
    }
}
