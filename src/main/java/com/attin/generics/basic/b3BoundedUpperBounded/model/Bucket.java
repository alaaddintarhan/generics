package com.attin.generics.basic.b3BoundedUpperBounded.model;

public class Bucket<T> {
     private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
