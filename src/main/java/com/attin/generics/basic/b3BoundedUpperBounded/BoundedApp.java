package com.attin.generics.basic.b3BoundedUpperBounded;

import com.attin.generics.basic.b3BoundedUpperBounded.model.Bounded;
import com.attin.generics.basic.b3BoundedUpperBounded.model.Bucket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoundedApp {

    public static <T> void addStore(T t, List<Bucket<T>> list) {
        Bucket bucket = new Bucket();
        bucket.setItem(t);
        list.add(bucket);

        System.out.println();

        list.stream().forEach(System.out::print);
    }

    public static void main(String[] args) {

        System.out.println("***** Bounded *******");

        System.out.println(Bounded.calculateMin(1, 5));
        System.out.println(Bounded.calculateMin(1.5, 5.8));
        System.out.println(Bounded.calculateMin(new Date(), new Date(System.currentTimeMillis() - 5)));
        System.out.println(Bounded.calculateMin("asdfasdfasdadsfasdff", "8,36464String"));


        System.out.println("***** Method with Bounded Parameter *******");
        List<Bucket<String>> list = new ArrayList();
        addStore("Apple", list);
        //type witness
        addStore("Oil", list);

    }
}
