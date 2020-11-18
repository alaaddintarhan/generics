package com.attin.generics.basic.b02SingleMultiple;


class MultipleType<T, K> {

    T key;
    K value;

    public MultipleType(T key, K value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public K getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " : " + value;
    }
}



