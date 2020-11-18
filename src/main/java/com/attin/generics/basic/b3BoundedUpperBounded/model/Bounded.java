package com.attin.generics.basic.b3BoundedUpperBounded.model;

public class Bounded {

    public static <T extends Comparable<T>> T calculateMin(T t1, T t2) {

        if (t1.compareTo(t2) < 0)
            return t1;

        return t2;
    }



}
