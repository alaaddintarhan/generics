package com.attin.generics.basic.exercise;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Algorithm> {

    private List<T> algorithms;

    public Library() {
        algorithms = new ArrayList();
    }

    public void add(T t) {
        algorithms.add(t);
    }

    public T getLast() {
        if (algorithms == null || algorithms.isEmpty())
            return null;

        T last = algorithms.remove(algorithms.size() - 1);
        return last;
    }


}
