package com.creational.objectpool.game;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/19/2020
 */

import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> freeItems = new LinkedList<>();

    public void freeItem(T item) {
        freeItems.add(item);
    }

    protected abstract T allocated();

    public T newItem() {
        T out = null;
        if(freeItems.size() == 0) {
            out = allocated();
        } else {
            out = freeItems.getFirst();
            freeItems.removeFirst();
        }
        return out;
    }
}
