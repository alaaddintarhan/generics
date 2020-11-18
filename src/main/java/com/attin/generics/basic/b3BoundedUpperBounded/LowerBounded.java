package com.attin.generics.basic.b3BoundedUpperBounded;

import java.util.Arrays;
import java.util.List;

/**
 * Lower Bounded  <? super T>
 */
public class LowerBounded {

    /**
     * "Producer extends and consumer super" principle

     Producer extends ->  if we want to read from a list we have to declare it with extends
     List<? extends T> we can read T values from this list but can not add T  values to this list !!!

     Consumer super -> if we want to add to a list we should use super
     List<? super T> we can add T values to this list but can not read from
     this list because we do not know the type

     If we want to add AND read at the same time: we have to declare the collection with no wildcards
     For example: List<Double> we can add and read doubles !!!
     *
     */

    public static void main(String[] args) {

        System.out.println("****UpperBounded Method*******");

        List<SuperClass> list = Arrays.asList(new SubClass("first SubClass"), new SubClass("second SubClass"));
        show(list);
    }

    private static void show(List<? super SuperClass> list) {
        String str = "";
        for (Object obj : list) {
            //
        }

        list.stream().forEach(System.out::println);
    }

    public static class SubClass extends SuperClass {
        public SubClass(String par) {
            super();
        }

        String getParName() {
            return "SubPar...";
        }

    }

    public static abstract class SuperClass {
        abstract String getParName();
    }
}

