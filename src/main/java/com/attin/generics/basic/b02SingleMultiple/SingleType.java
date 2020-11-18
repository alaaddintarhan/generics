package com.attin.generics.basic.b02SingleMultiple;

class SingleType<T> {

    T item;

    public SingleType(T item) {
        this.item = item;
    }

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

