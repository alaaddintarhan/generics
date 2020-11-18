package com.attin.generics.collection.list;

import java.util.List;

public class ArrayList {
    /**
     O(1) means in constant time - independent of the number of items.
     O(N) means in proportion to the number of items.
     O(log N) means a time proportional to log(N)
     */

    /**
     * This is one of the implementations of the List interface !!!
     * An array stores the values in the background
     * <p>
     * int[] array = new int[10];
     * <p>
     * - random access / very fast o(1)  --> random access: accessing items by the index ~list.get(0)
     * <p>
     * - it is equivalent to Vector BUT arrayList is not synchronized
     * <p>
     * - all operations run in O(N) time approximately
     * <p>
     * - but if we want to remove items, this operation is not so efficient
     * We have to shift each item in our list - O(N)
     * <p>
     * If our application is just about adding elements to a list and
     * getting elements with known indexes -> an arrayList is perfect
     * <p>
     * capacity: it is a parameter we can define when we instantiate an ArrayList
     * It is the initial size of the array
     * ~ if we know that we will store 5 million items in a list we should use it
     * list = new ArrayList(5000000) WHY? This may reduce the amount of incremental reallocation.
     */

    public static void main(String[] args) {

        List<String> list = new java.util.ArrayList<>(10);

        list.add("Adam");
        list.add("Joe");
        list.add("Kevin");
        list.add("Kevin");
        list.add("Kevin");
        list.add("Kevin");
        list.add("Kevin");

        Object[] array = list.toArray();

        list.remove(0);

        for (Object s : array)
            System.out.println(s);

    }
}
