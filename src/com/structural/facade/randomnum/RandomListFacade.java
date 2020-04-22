package com.structural.facade.randomnum;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.List;

public class RandomListFacade {
    public void printList(int amount) {
        RandomIntegerList randomIntegerList = new RandomIntegerUseRandomLibs();
        ListFilter listFilter = new ListFilter();
        ListPrinter listPrinter = new ListPrinter();
        List<Integer> randomList = randomIntegerList.generateList(amount);
        List<Integer> listFiltered = listFilter.filterOdd(randomList);
        System.out.println("Random List: ");
        listPrinter.printList(randomList);
        System.out.println("Filter List: ");
        listPrinter.printList(listFiltered);
    }
}
