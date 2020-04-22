package com.behavioral.obsever.number;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctObserver(subject);
        new BinObserver(subject);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            System.out.println("\nEnter a number: ");
            subject.setState(scanner.nextInt());
            count++;
        }
    }
}
