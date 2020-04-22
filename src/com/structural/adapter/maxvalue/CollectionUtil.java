package com.structural.adapter.maxvalue;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.List;
import java.util.Set;

public class CollectionUtil {
    private CollectionOperations collectionOperations;

    public CollectionUtil(CollectionOperations collectionOperations) {
        this.collectionOperations = collectionOperations;
    }

    public void printMaxValue(Set<Integer> numbers){
        int max = collectionOperations.findMax(numbers);
        System.out.println("Max value is: " + max);
    }

    public void printList(Set<Integer> numbers) {
        System.out.println("Print List: ");
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
