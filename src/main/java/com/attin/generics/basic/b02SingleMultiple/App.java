package com.attin.generics.basic.b02SingleMultiple;

import java.time.Instant;
import java.util.Date;

public class App {


    public static void main(String[] args) {

        /**Single Type */
        SingleType<String> stringSingleType = new SingleType<>("Hello Generics");
        System.out.println(stringSingleType);

        SingleType<Integer> integerSingleType = new SingleType<>(5);
        System.out.println(integerSingleType);

        /**MultipleType */
        MultipleType<String, Integer> hashtable = new MultipleType<>("Course : Generics. lesson: ", 2);
        System.out.println(hashtable);
        MultipleType<String, Date> hashtable2 = new MultipleType<>("Course : Generics. lesson: ", Date.from(Instant.EPOCH));
        System.out.println(hashtable2);

    }

}
